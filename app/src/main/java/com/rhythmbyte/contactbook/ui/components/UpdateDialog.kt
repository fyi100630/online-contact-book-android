package com.rhythmbyte.contactbook.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.rhythmbyte.contactbook.data.update.DownloadState
import com.rhythmbyte.contactbook.data.update.UpdateInfo
import com.rhythmbyte.contactbook.data.update.UpdateManager
import com.rhythmbyte.contactbook.ui.theme.Emerald500
import com.rhythmbyte.contactbook.ui.theme.Emerald600
import com.rhythmbyte.contactbook.ui.theme.Rose500
import com.rhythmbyte.contactbook.ui.theme.Slate400
import com.rhythmbyte.contactbook.ui.theme.Slate500
import kotlinx.coroutines.launch
import java.io.File

@Composable
fun UpdateDialog(
    updateInfo: UpdateInfo,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    var downloadState by remember { mutableStateOf<DownloadState>(DownloadState.Idle) }
    var downloadedFile by remember { mutableStateOf<File?>(null) }

    val startDownload: () -> Unit = {
        coroutineScope.launch {
            downloadState = DownloadState.Downloading(0f, 0L, updateInfo.apkSize)
            val file = UpdateManager.downloadApk(context, updateInfo.apkDownloadUrl) { state ->
                downloadState = state
                if (state is DownloadState.Finished) {
                    downloadedFile = state.apkFile
                }
            }
            if (file != null) {
                downloadedFile = file
                // 自動喚起安裝介面
                UpdateManager.installApk(context, file)
            }
        }
    }

    Dialog(
        onDismissRequest = {
            if (downloadState !is DownloadState.Downloading) {
                onDismiss()
            }
        }
    ) {
        LiquidGlassCard(
            shape = RoundedCornerShape(26.dp),
            cornerRadius = 26.dp,
            tintColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.95f),
            elevation = 16.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                // 頂部標題與版本標籤
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "🎉 發現新版本",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(Emerald500.copy(alpha = 0.15f))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = updateInfo.versionName,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Emerald600
                        )
                    }
                }

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = updateInfo.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Slate400
                )

                if (updateInfo.apkSize > 0) {
                    val mbSize = String.format(java.util.Locale.US, "%.1f", updateInfo.apkSize / (1024f * 1024f))
                    Text(
                        text = "安裝套件大小：約 $mbSize MB",
                        fontSize = 11.sp,
                        color = Slate500
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                // 更新內容說明框
                Text(
                    text = "更新內容：",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(6.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 160.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.04f))
                        .border(
                            1.dp,
                            MaterialTheme.colorScheme.onSurface.copy(alpha = 0.08f),
                            RoundedCornerShape(14.dp)
                        )
                        .padding(12.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = updateInfo.changelog,
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.85f)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // 下載進度條與狀態呈現
                when (val state = downloadState) {
                    is DownloadState.Downloading -> {
                        val animatedProgress by animateFloatAsState(
                            targetValue = state.progress,
                            label = "DownloadProgress"
                        )
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "下載進度",
                                    fontSize = 11.sp,
                                    color = Slate400
                                )
                                val currentMB = String.format(java.util.Locale.US, "%.1f", state.downloadedBytes / (1024f * 1024f))
                                val totalMB = String.format(java.util.Locale.US, "%.1f", state.totalBytes / (1024f * 1024f))
                                val percent = (state.progress * 100).toInt()
                                Text(
                                    text = "$currentMB MB / $totalMB MB ($percent%)",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Emerald600
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            LinearProgressIndicator(
                                progress = { animatedProgress },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp)),
                                color = Emerald500,
                                trackColor = Emerald500.copy(alpha = 0.2f)
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    is DownloadState.Finished -> {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(bottom = 12.dp)
                        ) {
                            Text(
                                text = "✅ 下載完成！點擊下方按鈕即可安裝更新",
                                fontSize = 12.sp,
                                color = Emerald600,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    is DownloadState.Error -> {
                        Text(
                            text = "❌ ${state.message}",
                            fontSize = 12.sp,
                            color = Rose500,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )
                    }
                    DownloadState.Idle -> {}
                }

                // 底部按鈕操作列
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    when (downloadState) {
                        is DownloadState.Downloading -> {
                            Button(
                                onClick = {},
                                enabled = false,
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(16.dp),
                                    strokeWidth = 2.dp,
                                    color = Color.White
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("下載中...")
                            }
                        }
                        is DownloadState.Finished -> {
                            OutlinedButton(
                                onClick = onDismiss,
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("關閉")
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = {
                                    downloadedFile?.let { UpdateManager.installApk(context, it) }
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = Emerald500),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("立即安裝", fontWeight = FontWeight.Bold, color = Color.White)
                            }
                        }
                        is DownloadState.Error -> {
                            OutlinedButton(
                                onClick = onDismiss,
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("取消")
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { startDownload() },
                                colors = ButtonDefaults.buttonColors(containerColor = Emerald500),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("重試下載", fontWeight = FontWeight.Bold, color = Color.White)
                            }
                        }
                        DownloadState.Idle -> {
                            OutlinedButton(
                                onClick = onDismiss,
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("稍後再說")
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { startDownload() },
                                colors = ButtonDefaults.buttonColors(containerColor = Emerald500),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("立即更新", fontWeight = FontWeight.Bold, color = Color.White)
                            }
                        }
                    }
                }
            }
        }
    }
}
