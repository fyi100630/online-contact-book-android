/*
 * 改寫自 Kyant0/AndroidLiquidGlass 的 catalog 範例（commit 67a6771，backdrop 1.0.5）
 * https://github.com/Kyant0/AndroidLiquidGlass
 * Copyright Kyant0. Licensed under the Apache License, Version 2.0
 * （見 THIRD_PARTY_LICENSES/Apache-2.0.txt）。修改：套件名稱、配色改成聯絡簿的藍色。
 */
package com.rhythmbyte.contactbook.ui.liquid

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
import androidx.compose.ui.unit.dp
import com.kyant.shapes.Capsule
import com.kyant.shapes.RoundedCornerStyle

internal val LocalLiquidBottomTabScale =
    staticCompositionLocalOf { { 1f } }

@Composable
fun RowScope.LiquidBottomTab(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    val scale = LocalLiquidBottomTabScale.current
    Column(
        modifier
            .clip(CapsuleShape)
            .clickable(
                interactionSource = null,
                indication = null,
                role = Role.Tab,
                onClick = onClick
            )
            .fillMaxHeight()
            .weight(1f)
            .graphicsLayer {
                val scale = scale()
                scaleX = scale
                scaleY = scale
            },
        verticalArrangement = Arrangement.spacedBy(2f.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        content = content
    )
}

/**
 * 共用的膠囊形狀（shapes 1.2 的 Capsule 是類別，避免每次重畫都建立新物件）。
 * 一定要用標準圓弧（Circular）：預設的 Continuous 會依長寬比改變圓頭的曲率，
 * 長長的外框和短短的選取框的圓頭看起來就不一樣；標準圓弧是真正的半圓，兩層才會同心。
 */
internal val CapsuleShape = Capsule(RoundedCornerStyle.Circular)
