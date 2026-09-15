package com.rhythmbyte.contactbook.data.update

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.core.content.FileProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL

data class UpdateInfo(
    val versionName: String,
    val title: String,
    val changelog: String,
    val apkDownloadUrl: String,
    val apkSize: Long
)

sealed class DownloadState {
    object Idle : DownloadState()
    data class Downloading(
        val progress: Float,
        val downloadedBytes: Long,
        val totalBytes: Long
    ) : DownloadState()
    data class Finished(val apkFile: File) : DownloadState()
    data class Error(val message: String) : DownloadState()
}

object UpdateManager {
    private const val GITHUB_OWNER = "fyi100630"
    private const val GITHUB_REPO = "online-contact-book-android"
    private const val API_URL = "https://api.github.com/repos/$GITHUB_OWNER/$GITHUB_REPO/releases/latest"

    /**
     * 比對兩個版本號是否為更動 (例: 1.7.2 > 1.7.1)
     */
    fun isNewerVersion(current: String, remote: String): Boolean {
        val curParts = current.trimStart('v', 'V').split(".").mapNotNull { it.toIntOrNull() }
        val remParts = remote.trimStart('v', 'V').split(".").mapNotNull { it.toIntOrNull() }
        val maxLen = maxOf(curParts.size, remParts.size)
        for (i in 0 until maxLen) {
            val c = curParts.getOrElse(i) { 0 }
            val r = remParts.getOrElse(i) { 0 }
            if (r > c) return true
            if (r < c) return false
        }
        return false
    }

    /**
     * 檢查 GitHub Releases 是否有新版本
     */
    suspend fun checkForUpdates(currentVersion: String): UpdateInfo? = withContext(Dispatchers.IO) {
        try {
            val url = URL(API_URL)
            val conn = (url.openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                setRequestProperty("Accept", "application/vnd.github.v3+json")
                setRequestProperty("User-Agent", "ContactBook-Android-App")
                connectTimeout = 8000
                readTimeout = 8000
            }

            if (conn.responseCode == 200) {
                val jsonStr = conn.inputStream.bufferedReader().use { it.readText() }
                val json = JSONObject(jsonStr)
                val tagName = json.optString("tag_name", "").trim()
                val title = json.optString("name", tagName).ifBlank { tagName }
                val body = json.optString("body", "無更新說明").ifBlank { "無更新說明" }

                val assets = json.optJSONArray("assets")
                var apkUrl = ""
                var apkSize = 0L

                if (assets != null) {
                    for (i in 0 until assets.length()) {
                        val asset = assets.getJSONObject(i)
                        val name = asset.optString("name", "")
                        if (name.endsWith(".apk", ignoreCase = true)) {
                            apkUrl = asset.optString("browser_download_url", "")
                            apkSize = asset.optLong("size", 0L)
                            break
                        }
                    }
                }

                if (apkUrl.isNotEmpty() && isNewerVersion(currentVersion, tagName)) {
                    return@withContext UpdateInfo(
                        versionName = tagName,
                        title = title,
                        changelog = body,
                        apkDownloadUrl = apkUrl,
                        apkSize = apkSize
                    )
                }
            }
            null
        } catch (e: Throwable) {
            null
        }
    }

    /**
     * 於快取目錄下載 APK 檔案並即時回報進度
     */
    suspend fun downloadApk(
        context: Context,
        urlStr: String,
        onProgress: (DownloadState) -> Unit
    ): File? = withContext(Dispatchers.IO) {
        try {
            val updateDir = File(context.cacheDir, "updates").apply { mkdirs() }
            val targetFile = File(updateDir, "app-update.apk")
            if (targetFile.exists()) targetFile.delete()

            var currentUrl = urlStr
            var currentConn: HttpURLConnection
            var redirects = 0

            // 處理 GitHub Releases 下載重定向 (302 -> AWS S3 / Objects)
            while (true) {
                currentConn = (URL(currentUrl).openConnection() as HttpURLConnection).apply {
                    setRequestProperty("User-Agent", "ContactBook-Android-App")
                    instanceFollowRedirects = false
                    connectTimeout = 15000
                    readTimeout = 15000
                }

                val status = currentConn.responseCode
                if (status in listOf(301, 302, 303, 307, 308) && redirects < 5) {
                    val newLocation = currentConn.getHeaderField("Location")
                    currentConn.disconnect()
                    if (newLocation.isNullOrBlank()) break
                    currentUrl = newLocation
                    redirects++
                } else {
                    break
                }
            }

            val totalBytes = currentConn.contentLengthLong.coerceAtLeast(1L)
            var downloadedBytes = 0L

            currentConn.inputStream.use { input ->
                FileOutputStream(targetFile).use { output ->
                    val buffer = ByteArray(8192)
                    var bytesRead: Int
                    var lastReportTime = 0L

                    while (input.read(buffer).also { bytesRead = it } != -1) {
                        output.write(buffer, 0, bytesRead)
                        downloadedBytes += bytesRead

                        val now = System.currentTimeMillis()
                        if (now - lastReportTime > 80 || downloadedBytes == totalBytes) {
                            lastReportTime = now
                            val progress = (downloadedBytes.toFloat() / totalBytes).coerceIn(0f, 1f)
                            withContext(Dispatchers.Main) {
                                onProgress(DownloadState.Downloading(progress, downloadedBytes, totalBytes))
                            }
                        }
                    }
                    output.flush()
                }
            }

            withContext(Dispatchers.Main) {
                onProgress(DownloadState.Finished(targetFile))
            }
            targetFile
        } catch (e: Throwable) {
            withContext(Dispatchers.Main) {
                onProgress(DownloadState.Error(e.localizedMessage ?: "下載失敗，請稍後重試"))
            }
            null
        }
    }

    /**
     * 呼叫系統 Package Installer 安裝 APK
     */
    fun installApk(context: Context, apkFile: File): Boolean {
        if (!apkFile.exists()) return false

        // Android 8.0+ 未知來源權限檢查
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (!context.packageManager.canRequestPackageInstalls()) {
                val intent = Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                    data = Uri.parse("package:${context.packageName}")
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                }
                context.startActivity(intent)
                return false
            }
        }

        val apkUri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.fileprovider",
            apkFile
        )

        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(apkUri, "application/vnd.android.package-archive")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_GRANT_READ_URI_PERMISSION
        }
        context.startActivity(intent)
        return true
    }
}
