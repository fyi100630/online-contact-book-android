package com.rhythmbyte.contactbook.data

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.core.content.FileProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

@Serializable
private data class GhAsset(val name: String, @SerialName("browser_download_url") val url: String, val size: Long = 0)

@Serializable
private data class GhRelease(
    @SerialName("tag_name") val tag: String,
    val name: String? = null,
    val body: String? = null,
    val draft: Boolean = false,
    val prerelease: Boolean = false,
    val assets: List<GhAsset> = emptyList(),
)

data class UpdateInfo(val version: String, val notes: String, val apkUrl: String, val size: Long)

/**
 * App 內更新：讀 GitHub Releases 最新版，下載 app-release.apk 交給系統安裝。
 * 系統只接受「同一把金鑰簽章」的 APK 覆蓋安裝，所以就算下載被竄改也裝不上去。
 * 這個 client 和網站 API 分開，不會帶登入 cookie。
 */
class Updater(private val repo: String, private val currentVersion: String) {
    private val client = OkHttpClient.Builder().connectTimeout(15, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).build()
    private val json = Json { ignoreUnknownKeys = true }

    suspend fun check(): UpdateInfo? = withContext(Dispatchers.IO) {
        val req = Request.Builder()
            .url("https://api.github.com/repos/$repo/releases/latest")
            .header("Accept", "application/vnd.github+json")
            .build()
        val release = try {
            client.newCall(req).execute().use { res ->
                if (!res.isSuccessful) return@withContext null
                json.decodeFromString(GhRelease.serializer(), res.body?.string().orEmpty())
            }
        } catch (e: Exception) {
            return@withContext null
        }
        if (release.draft || release.prerelease) return@withContext null
        val latest = release.tag.removePrefix("v")
        if (compareVersions(latest, currentVersion) <= 0) return@withContext null
        val apk = release.assets.firstOrNull { it.name == "app-release.apk" } ?: release.assets.firstOrNull { it.name.endsWith(".apk") }
            ?: return@withContext null
        if (!apk.url.startsWith("https://github.com/")) return@withContext null
        UpdateInfo(latest, release.body?.trim().orEmpty(), apk.url, apk.size)
    }

    /** 下載到 cache/updates/，progress 是 0f..1f（不知道大小時是 -1f） */
    suspend fun download(context: Context, info: UpdateInfo, progress: (Float) -> Unit): File = withContext(Dispatchers.IO) {
        val dir = File(context.cacheDir, "updates").apply { mkdirs() }
        dir.listFiles()?.forEach { it.delete() }
        val file = File(dir, "app-release-${info.version}.apk")
        client.newCall(Request.Builder().url(info.apkUrl).build()).execute().use { res ->
            if (!res.isSuccessful) throw IOException("下載失敗（${res.code}）")
            val body = res.body ?: throw IOException("下載失敗")
            val total = body.contentLength().takeIf { it > 0 } ?: info.size
            body.byteStream().use { input ->
                file.outputStream().use { output ->
                    val buf = ByteArray(64 * 1024)
                    var read = 0L
                    while (true) {
                        val n = input.read(buf)
                        if (n < 0) break
                        output.write(buf, 0, n)
                        read += n
                        progress(if (total > 0) (read.toFloat() / total).coerceIn(0f, 1f) else -1f)
                    }
                }
            }
        }
        file
    }

    companion object {
        fun compareVersions(a: String, b: String): Int {
            val pa = a.split('.').map { it.toIntOrNull() ?: 0 }
            val pb = b.split('.').map { it.toIntOrNull() ?: 0 }
            for (i in 0 until maxOf(pa.size, pb.size, 3)) {
                val d = pa.getOrElse(i) { 0 } - pb.getOrElse(i) { 0 }
                if (d != 0) return d
            }
            return 0
        }

        /** Android 8 以上要先允許「安裝不明應用程式」 */
        fun canInstall(context: Context): Boolean = context.packageManager.canRequestPackageInstalls()

        fun openInstallPermissionSettings(context: Context) {
            context.startActivity(
                Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES, Uri.parse("package:${context.packageName}"))
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK),
            )
        }

        fun install(context: Context, apk: File) {
            val uri = FileProvider.getUriForFile(context, "${context.packageName}.files", apk)
            context.startActivity(
                Intent(Intent.ACTION_VIEW)
                    .setDataAndType(uri, "application/vnd.android.package-archive")
                    .addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_ACTIVITY_NEW_TASK),
            )
        }
    }
}
