package com.rhythmbyte.contactbook.ui

import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp

/** 和網頁版 src/components/icons.tsx 同一組線條圖示（24×24、線寬 1.8） */
private fun line(name: String, vararg d: String): ImageVector {
    val b = ImageVector.Builder(name, 24.dp, 24.dp, 24f, 24f)
    for (p in d) {
        b.addPath(
            pathData = PathParser().parsePathString(p).toNodes(),
            fill = null,
            stroke = SolidColor(androidx.compose.ui.graphics.Color.Black),
            strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
        )
    }
    return b.build()
}

private fun circle(cx: Float, cy: Float, r: Float) = "M${cx - r},$cy a$r,$r 0 1,0 ${2 * r},0 a$r,$r 0 1,0 ${-2 * r},0"

object CbIcons {
    val Book = line("book", "M4 5.5A2.5 2.5 0 0 1 6.5 3H20v15H6.5A2.5 2.5 0 0 0 4 20.5z", "M4 20.5A2.5 2.5 0 0 0 6.5 23H20v-5", "M9 8h7M9 12h5")
    val ChevronLeft = line("chevron-left", "m15 18-6-6 6-6")
    val ChevronRight = line("chevron-right", "m9 18 6-6-6-6")
    val Calendar = line("calendar", "M4 6.5A1.5 1.5 0 0 1 5.5 5h13A1.5 1.5 0 0 1 20 6.5v12a1.5 1.5 0 0 1-1.5 1.5h-13A1.5 1.5 0 0 1 4 18.5z", "M4 10h16M8 3v4M16 3v4")
    val Plus = line("plus", "M12 5v14M5 12h14")
    val Search = line("search", circle(11f, 11f, 7f), "m20 20-3.5-3.5")
    val Trash = line("trash", "M4 7h16M10 11v6M14 11v6", "M6 7l1 12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2l1-12", "M9 7V4h6v3")
    val X = line("x", "M18 6 6 18M6 6l12 12")
    val Menu = line("menu", "M4 6h16M4 12h16M4 18h16")
    val Back = line("back", "M19 12H5M12 19l-7-7 7-7")
    val Logout = line("logout", "M15 4h3a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2h-3M10 17l5-5-5-5M15 12H3")
    val User = line("user", circle(12f, 8f, 4f), "M4 21a8 8 0 0 1 16 0")
    val List = line("list", "M9 6h11M9 12h11M9 18h11M4.5 6h.01M4.5 12h.01M4.5 18h.01")
    val Megaphone = line("megaphone", "M3 10v4a1 1 0 0 0 1 1h2l5 4V5L6 9H4a1 1 0 0 0-1 1z", "M15.5 8.5a5 5 0 0 1 0 7M18.5 5.5a9 9 0 0 1 0 13")
    val Grid = line("grid", "M5.5 4h13A2 2 0 0 1 20.5 6v12a2 2 0 0 1-2 2h-13a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2z", "M3.5 9.5h17M9 9.5V20M14.5 9.5V20")
    val Phone = line("phone", "M9 2.5h6a2.5 2.5 0 0 1 2.5 2.5v14a2.5 2.5 0 0 1-2.5 2.5H9A2.5 2.5 0 0 1 6.5 19V5A2.5 2.5 0 0 1 9 2.5z", "M11 18.5h2")
    val External = line("external", "M14 4h6v6M20 4l-9 9M18 14v5a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V7a1 1 0 0 1 1-1h5")
    val Shield = line("shield", "M12 3 4.5 6v6c0 4.5 3.2 8 7.5 9 4.3-1 7.5-4.5 7.5-9V6z", "m9 12 2 2 4-4")
    val Download = line("download", "M12 4v11M7 10l5 5 5-5M5 20h14")
}
