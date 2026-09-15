package com.rhythmbyte.contactbook.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kyant.backdrop.backdrops.rememberCanvasBackdrop
import com.rhythmbyte.contactbook.data.model.ItemCategory
import com.rhythmbyte.contactbook.data.model.ItemRecord
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCard
import com.rhythmbyte.contactbook.ui.components.LiquidGlassPill
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButton
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle
import com.rhythmbyte.contactbook.ui.theme.Emerald500
import com.rhythmbyte.contactbook.ui.theme.Emerald600
import com.rhythmbyte.contactbook.ui.theme.Sky500
import com.rhythmbyte.contactbook.ui.theme.Slate400
import com.rhythmbyte.contactbook.ui.theme.Slate500
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun EditItemScreen(
    initialItem: ItemRecord? = null,
    defaultDate: String,
    defaultCategory: String = "homework",
    onDismiss: () -> Unit,
    onSave: (ItemRecord) -> Unit
) {
    BackHandler {
        onDismiss()
    }

    var selectedCategory by remember { mutableStateOf(initialItem?.category ?: defaultCategory) }
    var subject by remember { mutableStateOf(initialItem?.subject ?: "") }
    var title by remember { mutableStateOf(initialItem?.title ?: "") }
    var details by remember { mutableStateOf(initialItem?.details ?: "") }
    var dueDate by remember { mutableStateOf(initialItem?.dueDate ?: "") }
    var isHighPriority by remember { mutableStateOf(initialItem?.priority == "high") }
    var titleError by remember { mutableStateOf(false) }

    val (tomorrow, nextDay) = remember(defaultDate) {
        runCatching {
            val base = LocalDate.parse(defaultDate)
            val t = base.plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
            val n = base.plusDays(2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
            t to n
        }.getOrDefault("" to "")
    }

    val pageBackdrop = rememberCanvasBackdrop {
        drawRect(
            Brush.radialGradient(
                colors = listOf(
                    Emerald500.copy(alpha = 0.12f),
                    Sky500.copy(alpha = 0.08f),
                    Color.Transparent
                ),
                radius = 1200f
            )
        )
    }

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f))
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = if (initialItem == null) "✨ 新增聯絡簿項目" else "✏️ 編輯聯絡簿項目",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "發布日期：$defaultDate",
                            fontSize = 12.sp,
                            color = Slate400
                        )
                    }
                }
            }
        },
        bottomBar = {
            // 底部懸浮毛玻璃操作欄 (配備 1:1 酷安超調彈簧物理回彈按鈕)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .padding(horizontal = 20.dp, vertical = 14.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LiquidButton(
                        onClick = onDismiss,
                        backdrop = pageBackdrop,
                        surfaceColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.65f),
                        modifier = Modifier
                            .weight(1f)
                            .height(52.dp),
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp)
                    ) {
                        Text(
                            text = "取消",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 15.sp
                        )
                    }

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
                        backdrop = pageBackdrop,
                        tint = Emerald500,
                        modifier = Modifier
                            .weight(1f)
                            .height(52.dp),
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp)
                    ) {
                        Text(
                            text = if (initialItem == null) "儲存並發布" else "更新項目",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // 背景光暈層
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.radialGradient(
                            colors = listOf(
                                Emerald500.copy(alpha = 0.10f),
                                Sky500.copy(alpha = 0.06f),
                                Color.Transparent
                            ),
                            radius = 1400f
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                // 1. 分類選擇卡片
                LiquidGlassCard(
                    shape = RoundedCornerShape(20.dp),
                    cornerRadius = 20.dp,
                    tintColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.85f),
                    elevation = 4.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "選擇項目類別",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
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
                                                dueDate = try {
                                                    LocalDate.parse(defaultDate).plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                                                } catch (_: Throwable) {
                                                    ""
                                                }
                                            }
                                        }
                                        .padding(vertical = 10.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Text(text = cat.icon, fontSize = 18.sp)
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = cat.title,
                                            fontSize = 11.sp,
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // 2. 表單內容卡片
                LiquidGlassCard(
                    shape = RoundedCornerShape(20.dp),
                    cornerRadius = 20.dp,
                    tintColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.85f),
                    elevation = 4.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(18.dp)) {
                        // 科目 / 發布單位
                        OutlinedTextField(
                            value = subject,
                            onValueChange = { subject = it },
                            label = { Text("科目／發布單位（選填）") },
                            placeholder = { Text("例如：國語、數學、訓導處") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(14.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Emerald500
                            )
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        // 項目名稱 / 內容 (必填)
                        OutlinedTextField(
                            value = title,
                            onValueChange = {
                                title = it
                                if (it.isNotBlank()) titleError = false
                            },
                            label = { Text("項目名稱／內容（必填）*") },
                            placeholder = { Text("例如：習作第 24-25 頁、帶戶外教學回條") },
                            isError = titleError,
                            supportingText = {
                                if (titleError) {
                                    Text("請輸入項目名稱", color = MaterialTheme.colorScheme.error)
                                }
                            },
                            minLines = 2,
                            maxLines = 4,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(14.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Emerald500
                            )
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        // 截止日期
                        OutlinedTextField(
                            value = dueDate,
                            onValueChange = { dueDate = it },
                            label = { Text("截止／繳交日期（選填，YYYY-MM-DD）") },
                            placeholder = { Text("例如：2026-09-15") },
                            leadingIcon = {
                                Icon(Icons.Default.DateRange, contentDescription = null, tint = Slate400)
                            },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(14.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Emerald500
                            )
                        )

                        // 快速填入日期膠囊
                        Spacer(modifier = Modifier.height(8.dp))
                        if (tomorrow.isNotEmpty()) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                LiquidGlassPill(
                                    backgroundColor = if (dueDate == tomorrow) Emerald500 else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                                    borderColor = if (dueDate == tomorrow) Emerald500 else Color.White.copy(alpha = 0.3f),
                                    onClick = { dueDate = tomorrow }
                                ) {
                                    Text("明日截止", fontSize = 11.sp, color = if (dueDate == tomorrow) Color.White else MaterialTheme.colorScheme.onSurface)
                                }
                                LiquidGlassPill(
                                    backgroundColor = if (dueDate == nextDay) Emerald500 else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                                    borderColor = if (dueDate == nextDay) Emerald500 else Color.White.copy(alpha = 0.3f),
                                    onClick = { dueDate = nextDay }
                                ) {
                                    Text("後天截止", fontSize = 11.sp, color = if (dueDate == nextDay) Color.White else MaterialTheme.colorScheme.onSurface)
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // 詳細備註說明
                        OutlinedTextField(
                            value = details,
                            onValueChange = { details = it },
                            label = { Text("詳細說明／備註（選填）") },
                            placeholder = { Text("可補充注意事項、攜帶用具或附件網址") },
                            minLines = 3,
                            maxLines = 6,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(14.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Emerald500
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // 3. 置頂與加急提醒卡片 (使用平滑無卡頓的 LiquidToggle)
                LiquidGlassCard(
                    shape = RoundedCornerShape(20.dp),
                    cornerRadius = 20.dp,
                    tintColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.85f),
                    elevation = 4.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "📌 置頂與加急提醒",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "開啟後將在列表最前排標記並重點醒目顯示",
                                fontSize = 11.sp,
                                color = Slate400
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        LiquidToggle(
                            selected = { isHighPriority },
                            onSelect = { isHighPriority = it },
                            backdrop = pageBackdrop
                        )
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}
