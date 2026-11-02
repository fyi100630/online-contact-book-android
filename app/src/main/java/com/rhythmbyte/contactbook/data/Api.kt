package com.rhythmbyte.contactbook.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import okhttp3.CookieJar
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException
import java.util.concurrent.TimeUnit

/** 伺服器回的錯誤：{ "error": "中文訊息", "code": "代碼" } */
class ApiException(val status: Int, message: String, val code: String? = null) : Exception(message)

@Serializable
private data class ErrorBody(val error: String? = null, val code: String? = null)

@Serializable
private data class EntriesResponse(val entries: List<ManagedEntry>)

@Serializable
private data class EntryResponse(val entry: ManagedEntry)

@Serializable
private data class AccountResponse(val user: SessionUser)

@Serializable
private data class VersionResponse(val version: String)

/**
 * 和網站 /api 溝通的唯一管道。App 裡沒有資料庫網址、也沒有任何金鑰：
 * 權限全部由伺服器依登入的帳號判斷。
 */
class Api(
    private val baseUrl: String,
    cookieJar: CookieJar,
    userAgent: String,
) {
    val json = Json { ignoreUnknownKeys = true }

    private val client = OkHttpClient.Builder()
        .cookieJar(cookieJar)
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor { chain ->
            chain.proceed(chain.request().newBuilder().header("User-Agent", userAgent).build())
        }
        .build()

    private val jsonType = "application/json".toMediaType()

    private suspend fun <T> call(method: String, path: String, body: JsonElement?, out: KSerializer<T>): T =
        withContext(Dispatchers.IO) {
            val builder = Request.Builder().url(baseUrl + path).header("Accept", "application/json")
            if (method != "GET") {
                // 網站的 CSRF 檢查：寫入一定要帶同網域的 Origin
                builder.header("Origin", baseUrl)
                val rb = body?.toString()?.toRequestBody(jsonType) ?: ByteArray(0).toRequestBody(null)
                builder.method(method, rb)
            }
            val res = try {
                client.newCall(builder.build()).execute()
            } catch (e: IOException) {
                throw ApiException(0, "網路連線失敗，請檢查網路後再試", "network")
            }
            res.use {
                val text = it.body?.string().orEmpty()
                if (!it.isSuccessful) {
                    val err = runCatching { json.decodeFromString(ErrorBody.serializer(), text) }.getOrNull()
                    throw ApiException(it.code, err?.error ?: "發生錯誤，請稍後再試（${it.code}）", err?.code)
                }
                try {
                    json.decodeFromString(out, text)
                } catch (e: Exception) {
                    throw ApiException(it.code, "伺服器回應格式不正確，請更新 App", "format")
                }
            }
        }

    private fun q(path: String, vararg params: Pair<String, String?>): String {
        val url = (baseUrl + path).toHttpUrl().newBuilder()
        params.forEach { (k, v) -> if (!v.isNullOrBlank()) url.addQueryParameter(k, v) }
        return url.build().toString().removePrefix(baseUrl)
    }

    private val ignore = JsonObject.serializer()

    // ---- 公開 ----
    suspend fun board(date: String?): BoardData = call("GET", q("/api/board", "date" to date), null, BoardData.serializer())
    suspend fun version(): String = call("GET", "/api/version", null, VersionResponse.serializer()).version

    // ---- 登入 ----
    suspend fun login(username: String, password: String) {
        call("POST", "/api/auth/login", buildJsonObject { put("username", username); put("password", password) }, ignore)
    }

    suspend fun logout() {
        call("POST", "/api/auth/logout", null, ignore)
    }

    /** 目前登入的帳號；沒登入或過期回傳 null */
    suspend fun account(): SessionUser? = try {
        call("GET", "/api/account", null, AccountResponse.serializer()).user
    } catch (e: ApiException) {
        if (e.status == 401) null else throw e
    }

    suspend fun changePassword(current: String, next: String) {
        call("POST", "/api/account/password", buildJsonObject { put("currentPassword", current); put("newPassword", next) }, ignore)
    }

    suspend fun signOutOthers() {
        call("POST", "/api/account/sign-out-others", null, ignore)
    }

    // ---- 事項（幹部以上）----
    suspend fun entries(from: String, to: String, query: String?, category: Category?): List<ManagedEntry> =
        call(
            "GET",
            q("/api/entries", "from" to from, "to" to to, "q" to query?.trim(), "category" to category?.let { json.encodeToJsonElement(it).toString().trim('"') }),
            null,
            EntriesResponse.serializer(),
        ).entries

    suspend fun createEntry(input: EntryInput): ManagedEntry =
        call("POST", "/api/entries", json.encodeToJsonElement(input), EntryResponse.serializer()).entry

    suspend fun updateEntry(id: String, version: Int, input: EntryInput): ManagedEntry =
        call(
            "PATCH",
            "/api/entries/$id",
            buildJsonObject { put("version", version); put("entry", json.encodeToJsonElement(input)) },
            EntryResponse.serializer(),
        ).entry

    suspend fun deleteEntry(id: String) {
        call("DELETE", "/api/entries/$id", null, ignore)
    }

    // ---- 管理員 ----
    suspend fun settings(): Settings = call("GET", "/api/settings", null, Settings.serializer())
    suspend fun updateSettings(classTitle: String, announcement: String): Settings =
        call("PUT", "/api/settings", buildJsonObject { put("classTitle", classTitle); put("announcement", announcement) }, Settings.serializer())

    suspend fun timetable(): TimetableData = call("GET", "/api/timetable", null, TimetableData.serializer())
    suspend fun updateTimetable(schedule: List<List<String>>): TimetableData =
        call("PUT", "/api/timetable", buildJsonObject { put("schedule", json.encodeToJsonElement(schedule)) }, TimetableData.serializer())

    suspend fun calendar(): CalendarData = call("GET", "/api/calendar", null, CalendarData.serializer())

    suspend fun installStats(): InstallStats = call("GET", "/api/installations", null, InstallStats.serializer())

    /** 安裝統計：只送隨機安裝 ID 和版本號 */
    suspend fun reportInstallation(installId: String, appVersion: String) {
        call("POST", "/api/installations", buildJsonObject { put("installId", installId); put("appVersion", appVersion) }, ignore)
    }
}
