package com.rhythmbyte.contactbook.ui

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.hypot
import kotlin.math.roundToInt
import kotlin.math.sin

/*
 * 2.0.0 版按「＋」的展開動畫（原本叫 FlymeAliveRevealOverlay），照舊版的參數重寫：
 *  - 從按鈕中心畫一個圓，半徑從 32dp 長到蓋滿整個畫面（最遠角落 × 1.05）
 *  - 圓的外圈有一點陰影和細光圈，展開到 98% 時消失
 *  - 編輯畫面從 0.88 倍放大、淡入，並被圓形裁切
 *  - 「＋」在前 18% 淡出、縮小，同時轉 45° 變成「×」
 *  - 打開 480ms、關閉 340ms，曲線和舊版一樣
 */
val RevealOpenEasing = CubicBezierEasing(0.18f, 0.15f, 0.1f, 1f)
val RevealCloseEasing = CubicBezierEasing(0.3f, 0f, 0.15f, 1f)

suspend fun Animatable<Float, AnimationVector1D>.revealOpen() {
    snapTo(0f)
    animateTo(1f, tween(480, easing = RevealOpenEasing))
}

suspend fun Animatable<Float, AnimationVector1D>.revealClose() {
    animateTo(0f, tween(340, easing = RevealCloseEasing))
}

@Composable
fun RevealOverlay(
    progress: Animatable<Float, AnimationVector1D>,
    center: Offset,
    showPlus: Boolean,
    onScrimClick: () -> Unit,
    content: @Composable () -> Unit,
) {
    val c = Cb.c
    val density = LocalDensity.current
    val startRadius = with(density) { 32.dp.toPx() }
    BoxWithConstraints(Modifier.fillMaxSize()) {
        val w = constraints.maxWidth.toFloat()
        val h = constraints.maxHeight.toFloat()
        val endRadius = remember(center, w, h) {
            maxOf(hypot(center.x, center.y), hypot(w - center.x, center.y), hypot(center.x, h - center.y), hypot(w - center.x, h - center.y)) * 1.05f
        }
        val origin = remember(center, w, h) { TransformOrigin((center.x / w).coerceIn(0f, 1f), (center.y / h).coerceIn(0f, 1f)) }
        val path = remember { Path() }
        fun p() = progress.value.coerceIn(0f, 1f)
        fun radius() = startRadius + (endRadius - startRadius) * p()

        // 擋住後面的畫面，點空白處關閉（和舊版一樣）
        Box(Modifier.fillMaxSize().clickable(interactionSource = null, indication = null, onClick = onScrimClick))

        Canvas(Modifier.fillMaxSize()) {
            val p = p()
            val r = radius()
            if (p < 0.98f) {
                drawCircle(Color.Black.copy(alpha = ((1f - p) * 0.14f).coerceIn(0f, 0.14f)), 6.dp.toPx() * (1f - 0.4f * p) + r, center)
                val ring = (sin(p * PI).toFloat() * 0.22f).coerceIn(0f, 0.22f)
                val ringColor = if (c.dark) Color.White.copy(alpha = ring * 0.2f) else Color.Black.copy(alpha = ring * 0.08f)
                drawCircle(ringColor, r, center, style = Stroke(1.dp.toPx()))
            }
            drawCircle(lerp(c.surface, c.bg, (p / 0.16f).coerceIn(0f, 1f)), r, center)
        }

        Box(
            Modifier
                .fillMaxSize()
                .graphicsLayer {
                    val p = p()
                    val s = 0.88f + 0.12f * p
                    scaleX = s
                    scaleY = s
                    transformOrigin = origin
                    alpha = ((p - 0.06f) / 0.3f).coerceIn(0f, 1f)
                }
                .drawWithContent {
                    if (p() < 1f) {
                        path.rewind()
                        path.addOval(Rect(center, radius()))
                        clipPath(path) { this@drawWithContent.drawContent() }
                    } else {
                        drawContent()
                    }
                },
        ) { content() }

        if (showPlus) {
            Box(
                Modifier
                    .offset { IntOffset((center.x - startRadius).roundToInt(), (center.y - startRadius).roundToInt()) }
                    .size(64.dp)
                    .graphicsLayer {
                        val p = p()
                        if (p < 0.18f) {
                            val f = p / 0.18f
                            alpha = (1f - f).coerceIn(0f, 1f)
                            scaleX = 1f - f * 0.2f
                            scaleY = 1f - f * 0.2f
                        } else {
                            alpha = 0f
                        }
                    },
                contentAlignment = Alignment.Center,
            ) {
                Icon(CbIcons.Plus, null, tint = c.ink, modifier = Modifier.size(28.dp).graphicsLayer { rotationZ = p() * 45f })
            }
        }
    }
}
