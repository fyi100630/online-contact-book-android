package com.rhythmbyte.contactbook.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.rhythmbyte.contactbook.data.model.ItemCategory
import com.rhythmbyte.contactbook.data.model.ItemRecord
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCard
import com.rhythmbyte.contactbook.ui.theme.Emerald500
import com.rhythmbyte.contactbook.ui.theme.Slate400
import com.rhythmbyte.contactbook.ui.theme.Slate700
import com.rhythmbyte.contactbook.ui.theme.Slate800
import java.time.LocalDate
import java.time.format.DateTimeFormatter

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Brush
import com.kyant.backdrop.backdrops.rememberCanvasBackdrop
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButton
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle

@Composable
fun EditItemDialog(
    initialItem: ItemRecord? = null,
    defaultDate: String,
    defaultCategory: String = "homework",
    onDismiss: () -> Unit,
    onSave: (ItemRecord) -> Unit
) {
    var selectedCategory by remember { mutableStateOf(initialItem?.category ?: defaultCategory) }
    var subject by remember { mutableStateOf(initialItem?.subject ?: "") }
    var title by remember { mutableStateOf(initialItem?.title ?: "") }
    var details by remember { mutableStateOf(initialItem?.details ?: "") }
    var dueDate by remember { mutableStateOf(initialItem?.dueDate ?: "") }
    var isHighPriority by remember { mutableStateOf(initialItem?.priority == "high") }
    var titleError by remember { mutableStateOf(false) }

    Dialog(onDismissRequest = onDismiss) {
        val dialogBackdrop = rememberCanvasBackdrop {
            drawRect(
                Brush.radialGradient(
                    colors = listOf(
                        Emerald500.copy(alpha = 0.15f),
                        Color.Transparent
                    )
                )
            )
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            // 裝飾背板供 Liquid Glass 元件取樣
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(
                        Brush.radialGradient(
                            colors = listOf(
                                Emerald500.copy(alpha = 0.15f),
                                Color.Transparent
                            )
                        )
                    )
            )

            LiquidGlassCard(
                shape = RoundedCornerShape(28.dp),
                cornerRadius = 28.dp,
                tintColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.95f),
                elevation = 16.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(24.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                Text(
                    text = if (initialItem == null) "✨ 新增項目" else "✏️ 編輯項目",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(16.dp))

                // 分類選擇膠囊群
                Text("選擇分類", style = MaterialTheme.typography.labelSmall, color = Slate400)
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    ItemCategory.entries.forEach { cat ->
                        val isSelected = selectedCategory == cat.key
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(
                                    if (isSelected) Emerald500 else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                                )
                                .clickable {
                                    selectedCategory = cat.key
                                    if (cat.key == "homework" && dueDate.isEmpty()) {
                                        dueDate = LocalDate.parse(defaultDate).plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                                    }
                                }
                                .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${cat.icon} ${cat.title}",
                                fontSize = 11.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // 科目 / 單位
                OutlinedTextField(
                    value = subject,
                    onValueChange = { subject = it },
                    label = { Text("科目／發布單位（選填）") },
                    placeholder = { Text("請輸入科目或單位") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Emerald500
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))

                // 標題 (必填)
                OutlinedTextField(
                    value = title,
                    onValueChange = {
                        title = it
                        if (it.isNotBlank()) titleError = false
                    },
                    label = { Text("項目名稱／內容（必填）*") },
                    placeholder = { Text("請輸入項目名稱或內容") },
                    isError = titleError,
                    supportingText = {
                        if (titleError) Text("請輸入項目名稱", color = MaterialTheme.colorScheme.error)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Emerald500
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))

                // 截止日期
                OutlinedTextField(
                    value = dueDate,
                    onValueChange = { dueDate = it },
                    label = { Text("截止／繳交日期（選填，YYYY-MM-DD）") },
                    placeholder = { Text("例如：2026-09-15") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Emerald500
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))

                // 詳細備註
                OutlinedTextField(
                    value = details,
                    onValueChange = { details = it },
                    label = { Text("詳細說明／備註（選填）") },
                    placeholder = { Text("請輸入詳細說明或備註") },
                    minLines = 2,
                    maxLines = 4,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Emerald500
                    )
                )

                Spacer(modifier = Modifier.height(12.dp))

                // 置頂與加急提醒 LiquidToggle
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "📌 置頂與加急提醒",
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "開啟後在列表最前排標記並重點顯示",
                            fontSize = 11.sp,
                            color = Slate400
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    LiquidToggle(
                        selected = { isHighPriority },
                        onSelect = { isHighPriority = it },
                        backdrop = dialogBackdrop
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                // 按鈕列 (LiquidButton with Backdrop Physics)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LiquidButton(
                        onClick = onDismiss,
                        backdrop = dialogBackdrop,
                        surfaceColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        Text("取消", color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.Medium)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    LiquidButton(
                        onClick = {
                            if (title.isBlank()) {
                                titleError = true
                                return@LiquidButton
                            }
                            val id = initialItem?.id?.ifEmpty { null } ?: "rec-${System.currentTimeMillis()}"
                            val date = initialItem?.date?.ifEmpty { null } ?: defaultDate
                            onSave(
                                ItemRecord(
                                    id = id,
                                    date = date,
                                    category = selectedCategory,
                                    subject = subject.trim(),
                                    title = title.trim(),
                                    details = details.trim(),
                                    dueDate = dueDate.trim(),
                                    priority = if (isHighPriority) "high" else "normal"
                                )
                            )
                        },
                        backdrop = dialogBackdrop,
                        tint = Emerald500,
                        contentPadding = PaddingValues(horizontal = 18.dp, vertical = 8.dp)
                    ) {
                        Text("儲存並發布", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
}
