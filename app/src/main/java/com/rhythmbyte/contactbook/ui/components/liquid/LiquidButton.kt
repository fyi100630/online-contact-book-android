package com.rhythmbyte.contactbook.ui.components.liquid

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.drawBackdrop
import com.kyant.backdrop.effects.blur
import com.kyant.backdrop.effects.lens
import com.kyant.backdrop.effects.vibrancy
import com.kyant.shapes.Capsule
import kotlinx.coroutines.launch
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tanh

@Composable
fun LiquidButton(
    onClick: () -> Unit,
    backdrop: Backdrop,
    modifier: Modifier = Modifier,
    shape: () -> Shape = { Capsule() },
    isInteractive: Boolean = true,
    tint: Color = Color.Unspecified,
    surfaceColor: Color = Color.Unspecified,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    content: @Composable RowScope.() -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    val resolvedShape = remember(shape) { shape() }

    // 1:1 酷安真實物理量：Scale 與 2D 阻尼位移（獨立 Animatable，不受全局 Highlight 影響）
    val animScale = remember { Animatable(1f) }
    val animOffsetX = remember { Animatable(0f) }
    val animOffsetY = remember { Animatable(0f) }

    val viewConfiguration = LocalViewConfiguration.current

    val gestureModifier = if (isInteractive) {
        Modifier.pointerInput(onClick) {
            awaitEachGesture {
                val down = awaitFirstDown(requireUnconsumed = false, pass = PointerEventPass.Main)
                val downPos = down.position
                val maxOffsetPx = 12f.dp.toPx()
                val touchSlop = viewConfiguration.touchSlop

                // 按下：向外等比放大至 1.08f（酷安標準按住放大效果）
                coroutineScope.launch {
                    animScale.animateTo(
                        targetValue = 1.08f,
                        animationSpec = spring(dampingRatio = 1f, stiffness = 700f)
                    )
                }

                var isDrag = false
                val pointerId = down.id

                while (true) {
                    val event = awaitPointerEvent(PointerEventPass.Main)
                    val change = event.changes.firstOrNull { it.id == pointerId } ?: break

                    if (change.changedToUpIgnoreConsumed()) {
                        // 手指抬起 (ACTION_UP)
                        val isInside = change.position.x in 0f..size.width.toFloat() &&
                                change.position.y in 0f..size.height.toFloat()
                        if (isInside && !isDrag) {
                            onClick()
                        }
                        break
                    }

                    if (!change.pressed) {
                        break
                    }

                    val diff = change.position - downPos
                    val dist = diff.getDistance()
                    if (dist > touchSlop * 1.5f) {
                        isDrag = true
                    }

                    // 剛體 2D 橡皮筋滑動位移（tanh 平滑阻尼）
                    if (dist > 0.5f) {
                        val dampedDist = maxOffsetPx * tanh(dist / (maxOffsetPx * 2.2f))
                        val angle = atan2(diff.y, diff.x)
                        val targetX = dampedDist * cos(angle)
                        val targetY = dampedDist * sin(angle)
                        coroutineScope.launch {
                            animOffsetX.snapTo(targetX)
                            animOffsetY.snapTo(targetY)
                        }
                    }
                }

                // 釋放：酷安超調彈簧 Q 彈回彈！
                // dampingRatio = 0.38f, stiffness = 340f -> 從 1.08f 縮回 1.0f 時自然微幅下凹超調 (~0.96f) 後回正
                coroutineScope.launch {
                    animScale.animateTo(
                        targetValue = 1f,
                        animationSpec = spring(dampingRatio = 0.38f, stiffness = 340f)
                    )
                }
                coroutineScope.launch {
                    animOffsetX.animateTo(
                        targetValue = 0f,
                        animationSpec = spring(dampingRatio = 0.45f, stiffness = 380f)
                    )
                }
                coroutineScope.launch {
                    animOffsetY.animateTo(
                        targetValue = 0f,
                        animationSpec = spring(dampingRatio = 0.45f, stiffness = 380f)
                    )
                }
            }
        }
    } else {
        Modifier.clickable(
            interactionSource = null,
            indication = LocalIndication.current,
            role = Role.Button,
            onClick = onClick
        )
    }

    Box(
        modifier = modifier
            .graphicsLayer {
                if (isInteractive) {
                    scaleX = animScale.value
                    scaleY = animScale.value
                    translationX = animOffsetX.value
                    translationY = animOffsetY.value
                }
            }
            .then(gestureModifier),
        contentAlignment = Alignment.Center,
        propagateMinConstraints = true
    ) {
        Row(
            Modifier
                .drawBackdrop(
                    backdrop = backdrop,
                    shape = { resolvedShape },
                    effects = {
                        vibrancy()
                        blur(2f.dp.toPx())
                        lens(12f.dp.toPx(), 24f.dp.toPx())
                    },
                    onDrawSurface = {
                        if (tint.isSpecified) {
                            drawRect(tint.copy(alpha = 0.88f))
                        }
                        if (surfaceColor.isSpecified) {
                            drawRect(surfaceColor)
                        }
                    }
                )
                .border(
                    border = BorderStroke(
                        width = 1.dp,
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.65f),
                                Color.White.copy(alpha = 0.15f)
                            )
                        )
                    ),
                    shape = resolvedShape
                )
                .defaultMinSize(minWidth = 40.dp, minHeight = 40.dp)
                .padding(contentPadding),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}
