package com.rhythmbyte.contactbook.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LiquidGlassCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    cornerRadius: Dp = 24.dp,
    tintColor: Color = MaterialTheme.colorScheme.surface.copy(alpha = 0.75f),
    borderColor: Color = Color.White.copy(alpha = 0.55f),
    elevation: Dp = 6.dp,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .shadow(
                elevation = elevation,
                shape = shape,
                ambientColor = Color.Black.copy(alpha = 0.05f),
                spotColor = Color.Black.copy(alpha = 0.08f)
            )
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        tintColor.copy(alpha = 0.88f),
                        tintColor.copy(alpha = 0.70f)
                    )
                ),
                shape = shape
            )
            .clip(shape)
            .border(
                BorderStroke(
                    1.2.dp,
                    Brush.verticalGradient(
                        colors = listOf(
                            borderColor.copy(alpha = 0.85f),
                            borderColor.copy(alpha = 0.35f),
                            borderColor.copy(alpha = 0.10f)
                        )
                    )
                ),
                shape = shape
            )
    ) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.18f),
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.02f)
                        ),
                        startY = 0f,
                        endY = 140f
                    ),
                    shape = shape
                )
        )
        content()
    }
}
