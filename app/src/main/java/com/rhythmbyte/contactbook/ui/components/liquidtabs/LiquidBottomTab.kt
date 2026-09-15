package com.rhythmbyte.contactbook.ui.components.liquidtabs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.kyant.shapes.Capsule

val LocalLiquidBottomTabScale =
    staticCompositionLocalOf { { 1f } }

val LocalLiquidBottomTabInteractive =
    staticCompositionLocalOf { true }

@Composable
fun RowScope.LiquidBottomTab(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    enabled: Boolean = true,
    content: @Composable ColumnScope.() -> Unit
) {
    val scale = LocalLiquidBottomTabScale.current
    val isInteractive = LocalLiquidBottomTabInteractive.current && enabled

    Column(
        modifier
            .clip(Capsule())
            .then(
                if (isInteractive) {
                    Modifier.clickable(
                        interactionSource = null,
                        indication = null,
                        role = Role.Tab,
                        onClick = onClick
                    )
                } else {
                    Modifier
                }
            )
            .semantics {
                this.selected = selected
            }
            .fillMaxHeight()
            .weight(1f)
            .graphicsLayer {
                val s = scale()
                scaleX = s
                scaleY = s
            },
        verticalArrangement = Arrangement.spacedBy(2f.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        content = content
    )
}