package com.rhythmbyte.contactbook.data

import android.content.Context
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec

/**
 * 把登入用的 session cookie 加密後存在手機裡。
 * 加密金鑰放在 Android Keystore（硬體保護、無法匯出），App 被反編譯也拿不到。
 * 金鑰不見（例如重設手機的螢幕鎖）時就當作沒登入。
 */
class EncryptedPrefs(context: Context, private val alias: String = "contactbook_session_key") {
    private val prefs = context.getSharedPreferences("secure_store", Context.MODE_PRIVATE)

    private fun key(): SecretKey {
        val ks = KeyStore.getInstance("AndroidKeyStore").apply { load(null) }
        (ks.getKey(alias, null) as? SecretKey)?.let { return it }
        val gen = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, "AndroidKeyStore")
        gen.init(
            KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .setKeySize(256)
                .build(),
        )
        return gen.generateKey()
    }

    fun put(name: String, value: String?) {
        if (value == null) {
            prefs.edit().remove(name).apply()
            return
        }
        val cipher = Cipher.getInstance("AES/GCM/NoPadding").apply { init(Cipher.ENCRYPT_MODE, key()) }
        val sealed = cipher.iv + cipher.doFinal(value.toByteArray(Charsets.UTF_8))
        prefs.edit().putString(name, Base64.encodeToString(sealed, Base64.NO_WRAP)).apply()
    }

    fun get(name: String): String? {
        val raw = prefs.getString(name, null) ?: return null
        return try {
            val bytes = Base64.decode(raw, Base64.NO_WRAP)
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            cipher.init(Cipher.DECRYPT_MODE, key(), GCMParameterSpec(128, bytes, 0, 12))
            String(cipher.doFinal(bytes, 12, bytes.size - 12), Charsets.UTF_8)
        } catch (e: Exception) {
            prefs.edit().remove(name).apply()
            null
        }
    }
}

@Serializable
private data class StoredCookie(
    val name: String,
    val value: String,
    val expiresAt: Long,
    val domain: String,
    val path: String,
    val secure: Boolean,
    val httpOnly: Boolean,
    val hostOnly: Boolean,
)

/** OkHttp 的 cookie jar，內容加密保存，App 重開後仍維持登入（伺服器端最長 30 天）。 */
class PersistentCookieJar(private val store: EncryptedPrefs) : CookieJar {
    private val serializer = ListSerializer(StoredCookie.serializer())
    private var cookies: MutableList<Cookie>? = null

    @Synchronized
    private fun all(): MutableList<Cookie> {
        cookies?.let { return it }
        val loaded = runCatching {
            Json.decodeFromString(serializer, store.get(KEY) ?: "[]").map {
                Cookie.Builder().name(it.name).value(it.value).expiresAt(it.expiresAt).path(it.path).apply {
                    if (it.hostOnly) hostOnlyDomain(it.domain) else domain(it.domain)
                    if (it.secure) secure()
                    if (it.httpOnly) httpOnly()
                }.build()
            }
        }.getOrDefault(emptyList())
        return loaded.toMutableList().also { cookies = it }
    }

    @Synchronized
    private fun persist() {
        val now = System.currentTimeMillis()
        val list = all().filter { it.persistent && it.expiresAt > now }.map {
            StoredCookie(it.name, it.value, it.expiresAt, it.domain, it.path, it.secure, it.httpOnly, it.hostOnly)
        }
        store.put(KEY, if (list.isEmpty()) null else Json.encodeToString(serializer, list))
    }

    @Synchronized
    override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
        val list = all()
        for (c in cookies) {
            list.removeAll { it.name == c.name && it.domain == c.domain && it.path == c.path }
            if (c.expiresAt > System.currentTimeMillis()) list.add(c)
        }
        persist()
    }

    @Synchronized
    override fun loadForRequest(url: HttpUrl): List<Cookie> {
        val now = System.currentTimeMillis()
        return all().filter { it.expiresAt > now && it.matches(url) }
    }

    @Synchronized
    fun clear() {
        cookies = mutableListOf()
        store.put(KEY, null)
    }

    private companion object {
        const val KEY = "cookies"
    }
}
