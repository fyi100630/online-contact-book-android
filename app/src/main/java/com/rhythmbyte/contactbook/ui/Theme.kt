package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * 和網頁版同一套顏色（src/app/globals.css）：
 * 白底黑字；原子筆藍＝可以按、選取；朱紅只用在「明天交」和「重要」。類別不用顏色區分。
 * 深色模式是深灰（#1f1f1f），不是純黑。
 */
@Immutable
data class CbColors(
    val bg: Color,
    val bg2: Color,
    val surface: Color,
    val surface2: Color,
    val ink: Color,
    val ink2: Color,
    val ink3: Color,
    val line: Color,
    val line2: Color,
    val primary: Color,
    val onPrimary: Color,
    val primarySoft: Color,
    val red: Color,
    val redSoft: Color,
    val warn: Color,
    val warnSoft: Color,
    val dark: Boolean,
)

val LightCb = CbColors(
    bg = Color(0xFFFFFFFF), bg2 = Color(0xFFF3F4F6), surface = Color(0xFFFFFFFF), surface2 = Color(0xFFF8F9FA),
    ink = Color(0xFF18181B), ink2 = Color(0xFF3F444B), ink3 = Color(0xFF5C6168),
    line = Color(0xFFE4E6EA), line2 = Color(0xFFCFD3D9),
    primary = Color(0xFF1F4FBF), onPrimary = Color.White, primarySoft = Color(0xFFE9EFFB),
    red = Color(0xFFC8322C), redSoft = Color(0xFFFBECEA),
    warn = Color(0xFF8A5A00), warnSoft = Color(0xFFFBF3E2),
    dark = false,
)

val DarkCb = CbColors(
    bg = Color(0xFF1F1F1F), bg2 = Color(0xFF323232), surface = Color(0xFF2A2A2A), surface2 = Color(0xFF2F2F2F),
    ink = Color(0xFFE3E3E3), ink2 = Color(0xFFC4C7C5), ink3 = Color(0xFFA3A7AB),
    line = Color(0xFF3A3A3A), line2 = Color(0xFF4A4A4A),
    primary = Color(0xFF9FBCFF), onPrimary = Color(0xFF0B1530), primarySoft = Color(0xFF26324F),
    red = Color(0xFFFF8A80), redSoft = Color(0xFF46211E),
    warn = Color(0xFFF2B65A), warnSoft = Color(0xFF3A2F1A),
    dark = true,
)

val LocalCb = staticCompositionLocalOf { LightCb }

object Cb {
    val c: CbColors @Composable get() = LocalCb.current
}

@Composable
fun ContactBookTheme(dark: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val c = if (dark) DarkCb else LightCb
    val scheme = if (dark) {
        darkColorScheme(
            primary = c.primary, onPrimary = c.onPrimary, primaryContainer = c.primarySoft, onPrimaryContainer = c.primary,
            secondary = c.ink2, onSecondary = c.bg, secondaryContainer = c.bg2, onSecondaryContainer = c.ink,
            background = c.bg, onBackground = c.ink, surface = c.surface, onSurface = c.ink,
            surfaceVariant = c.bg2, onSurfaceVariant = c.ink2, surfaceTint = Color.Transparent,
            surfaceContainerLowest = c.bg, surfaceContainerLow = c.surface, surfaceContainer = c.surface,
            surfaceContainerHigh = c.surface2, surfaceContainerHighest = c.bg2,
            outline = c.line2, outlineVariant = c.line, error = c.red, onError = c.bg, errorContainer = c.redSoft, onErrorContainer = c.red,
        )
    } else {
        lightColorScheme(
            primary = c.primary, onPrimary = c.onPrimary, primaryContainer = c.primarySoft, onPrimaryContainer = c.primary,
            secondary = c.ink2, onSecondary = c.bg, secondaryContainer = c.bg2, onSecondaryContainer = c.ink,
            background = c.bg, onBackground = c.ink, surface = c.surface, onSurface = c.ink,
            surfaceVariant = c.bg2, onSurfaceVariant = c.ink2, surfaceTint = Color.Transparent,
            surfaceContainerLowest = c.bg, surfaceContainerLow = c.surface, surfaceContainer = c.surface,
            surfaceContainerHigh = c.surface2, surfaceContainerHighest = c.bg2,
            outline = c.line2, outlineVariant = c.line, error = c.red, onError = Color.White, errorContainer = c.redSoft, onErrorContainer = c.red,
        )
    }
    // 字型用系統預設：Android 的中文字型就是思源黑體（Noto Sans CJK），不用另外打包
    val base = Typography()
    val type = base.copy(
        bodyLarge = base.bodyLarge.copy(fontSize = 16.sp, lineHeight = 24.sp),
        bodyMedium = base.bodyMedium.copy(fontSize = 15.sp, lineHeight = 22.sp),
        titleLarge = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.ExtraBold, lineHeight = 28.sp),
    )
    CompositionLocalProvider(LocalCb provides c) {
        MaterialTheme(colorScheme = scheme, typography = type, content = content)
    }
}
