package com.rhythmbyte.contactbook.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCard
import com.rhythmbyte.contactbook.ui.theme.Emerald500
import com.rhythmbyte.contactbook.ui.theme.Emerald600
import com.rhythmbyte.contactbook.ui.theme.Rose500
import com.rhythmbyte.contactbook.ui.theme.Slate400
import com.rhythmbyte.contactbook.ui.theme.Slate700

@Composable
fun HistoryLogsDialog(
    logs: List<ContactBookLogEntry>,
    isLoading: Boolean,
    onFetchLogs: () -> Unit,
    onDismiss: () -> Unit,
    onRestore: (ContactBookLogEntry) -> Unit
) {
    LaunchedEffect(Unit) {
        onFetchLogs()
    }

    var selectedLogToRestore by remember { mutableStateOf<ContactBookLogEntry?>(null) }
    var expandedLogId by remember { mutableStateOf<String?>(null) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .fillMaxHeight(0.80f),
            contentAlignment = Alignment.Center
        ) {
            LiquidGlassCard(
                shape = RoundedCornerShape(26.dp),
                cornerRadius = 26.dp,
                tintColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.95f),
                elevation = 16.dp,
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    // 頂部標題與關閉按鈕
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "🕒 72 小時歷史紀錄與還原",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        IconButton(
                            onClick = onDismiss,
                            modifier = Modifier
                                .size(34.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                        ) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "關閉",
                                tint = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "雲端資料庫將自動保留過去 72 小時內所有變更快照，逾期自動清理。最高管理員可隨時選擇版本進行一鍵還原。",
                        style = MaterialTheme.typography.bodySmall,
                        color = Slate400,
                        fontSize = 11.sp
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    if (isLoading) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(color = Emerald500)
                        }
                    } else if (logs.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "目前暫無 72 小時內的歷史存檔版本",
                                color = Slate400,
                                fontSize = 14.sp
                            )
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            items(logs, key = { it.id }) { log ->
                                val isExpanded = expandedLogId == log.id
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f))
                                        .clickable {
                                            expandedLogId = if (isExpanded) null else log.id
                                        }
                                        .padding(12.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(modifier = Modifier.weight(1f)) {
                                            Row(verticalAlignment = Alignment.CenterVertically) {
                                                Box(
                                                    modifier = Modifier
                                                        .clip(RoundedCornerShape(4.dp))
                                                        .background(Emerald500.copy(alpha = 0.15f))
                                                        .padding(horizontal = 5.dp, vertical = 1.dp)
                                                ) {
                                                    Text("快照", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Emerald600)
                                                }
                                                Spacer(modifier = Modifier.width(6.dp))
                                                Text(
                                                    text = log.createdAt.replace("T", " ").take(19),
                                                    fontWeight = FontWeight.SemiBold,
                                                    fontSize = 13.sp,
                                                    color = MaterialTheme.colorScheme.onSurface
                                                )
                                            }
                                            Spacer(modifier = Modifier.height(3.dp))
                                            Text(
                                                text = "共 ${log.records.size} 筆項目紀錄",
                                                color = Slate400,
                                                fontSize = 11.sp
                                            )
                                        }

                                        Spacer(modifier = Modifier.width(10.dp))

                                        Button(
                                            onClick = { selectedLogToRestore = log },
                                            colors = ButtonDefaults.buttonColors(containerColor = Rose500),
                                            shape = RoundedCornerShape(10.dp),
                                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp)
                                        ) {
                                            Text("還原此版", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                        }
                                    }

                                    if (isExpanded) {
                                        Spacer(modifier = Modifier.height(10.dp))
                                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))
                                        Spacer(modifier = Modifier.height(8.dp))

                                        Text(
                                            text = "【班級公告】${log.announcement.ifEmpty { "無" }}",
                                            fontSize = 12.sp,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        log.records.take(5).forEach { item ->
                                            Text(
                                                text = "• [${item.category}] ${item.subject.ifEmpty { "" }} ${item.title}",
                                                fontSize = 11.sp,
                                                color = Slate400
                                            )
                                        }
                                        if (log.records.size > 5) {
                                            Text(
                                                text = "... 還有其餘 ${log.records.size - 5} 筆項目",
                                                fontSize = 11.sp,
                                                color = Slate400
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // 二次防呆還原確認彈窗
    selectedLogToRestore?.let { log ->
        AlertDialog(
            onDismissRequest = { selectedLogToRestore = null },
            title = { Text("⚠️ 確認還原此歷史版本？", fontWeight = FontWeight.Bold) },
            text = {
                Text(
                    "確定要將全班聯絡簿還原至快照時間：${log.createdAt.replace("T", " ").take(19)} 嗎？\n\n還原後將立即推播更新至所有學生、家長與網頁版。"
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        onRestore(log)
                        selectedLogToRestore = null
                        onDismiss()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Rose500),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("確認還原", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(
                    onClick = { selectedLogToRestore = null },
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("取消")
                }
            }
        )
    }
}
