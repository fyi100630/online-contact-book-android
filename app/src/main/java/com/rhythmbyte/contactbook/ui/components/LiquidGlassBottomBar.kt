package com.rhythmbyte.contactbook.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.EditNote
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.School
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kyant.backdrop.Backdrop
import com.rhythmbyte.contactbook.data.model.ItemCategory
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButton
import com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab
import com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs
import kotlinx.coroutines.launch

fun ItemCategory.iconVector(): ImageVector = when (this) {
    ItemCategory.HOMEWORK -> Icons.Outlined.EditNote
    ItemCategory.EXAM -> Icons.Outlined.School
    ItemCategory.SUBMISSION -> Icons.Outlined.Inbox
    ItemCategory.REMINDER -> Icons.Outlined.Notifications
}

fun ItemCategory.tabTitle(): String = when (this) {
    ItemCategory.HOMEWORK -> "作業"
    ItemCategory.EXAM -> "考試"
    ItemCategory.SUBMISSION -> "繳交"
    ItemCategory.REMINDER -> "提醒"
}

@Composable
fun LiquidGlassBottomBar(
    pagerState: PagerState,
    categories: List<ItemCategory>,
    backdrop: Backdrop,
    onAddClick: () -> Unit,
    onPlusButtonPositioned: (Rect) -> Unit = {},
    isPlusButtonHidden: Boolean = false,
    modifier: Modifier = Modifier
) {
    val coroutineScope = rememberCoroutineScope()
    val isLightTheme = !isSystemInDarkTheme()

    // 優雅中性配色（完全去除綠色，符合現代高端設計）
    val activeColor = if (isLightTheme) Color(0xFF0F172A) else Color.White
    val inactiveColor = if (isLightTheme) Color(0xFF64748B) else Color(0xFF94A3B8)
    val addButtonTint = if (isLightTheme) Color(0xFF0F172A) else Color(0xFF1E293B)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        var currentTab by remember { mutableIntStateOf(pagerState.currentPage) }
        LaunchedEffect(pagerState.targetPage) {
            currentTab = pagerState.targetPage
        }

        // 1. 官方原裝 100% 深度還原的 LiquidBottomTabs (4 Tabs)
        LiquidBottomTabs(
            selectedTabIndex = { currentTab },
            onTabSelected = { index ->
                currentTab = index
                coroutineScope.launch {
                    pagerState.animateScrollToPage(index)
                }
            },
            backdrop = backdrop,
            tabsCount = categories.size,
            accentColor = activeColor,
            containerColor = if (isLightTheme) Color.White.copy(0.72f) else Color(0xFF1E293B).copy(0.75f),
            modifier = Modifier.weight(1f)
        ) {
            categories.forEachIndexed { index, category ->
                val isSelected = currentTab == index

                LiquidBottomTab(
                    selected = isSelected,
                    onClick = {
                        currentTab = index
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    }
                ) {
                    Icon(
                        imageVector = category.iconVector(),
                        contentDescription = category.tabTitle(),
                        tint = inactiveColor,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = category.tabTitle(),
                        fontSize = 11.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        color = inactiveColor,
                        maxLines = 1
                    )
                }
            }
        }

        Spacer(modifier = Modifier.width(10.dp))

        // 2. 獨立高質感黑曜/深灰毛玻璃 LiquidButton (新增項目按鈕，完全無綠色)
        LiquidButton(
            onClick = onAddClick,
            backdrop = backdrop,
            tint = addButtonTint,
            shape = { CircleShape },
            modifier = Modifier
                .size(64.dp)
                .graphicsLayer {
                    alpha = if (isPlusButtonHidden) 0f else 1f
                }
                .onGloballyPositioned { coordinates ->
                    onPlusButtonPositioned(coordinates.boundsInRoot())
                },
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "新增項目",
                tint = Color.White,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}
