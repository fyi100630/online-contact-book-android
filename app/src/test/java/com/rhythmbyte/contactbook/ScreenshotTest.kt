package com.rhythmbyte.contactbook

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.captureRoboImage
import com.rhythmbyte.contactbook.data.BoardData
import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.InstallStats
import com.rhythmbyte.contactbook.data.ManagedEntry
import com.rhythmbyte.contactbook.data.Priority
import com.rhythmbyte.contactbook.data.PublicEntry
import com.rhythmbyte.contactbook.data.Role
import com.rhythmbyte.contactbook.data.SessionUser
import com.rhythmbyte.contactbook.data.VersionCount
import com.rhythmbyte.contactbook.data.WeekDay
import com.rhythmbyte.contactbook.ui.AccountScreen
import com.rhythmbyte.contactbook.ui.BoardScreen
import com.rhythmbyte.contactbook.ui.ContactBookTheme
import com.rhythmbyte.contactbook.ui.EditActions
import com.rhythmbyte.contactbook.ui.RevealOverlay
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import com.rhythmbyte.contactbook.ui.EntryEditor
import com.rhythmbyte.contactbook.ui.InstallStatsContent
import com.rhythmbyte.contactbook.ui.LoginScreen
import com.rhythmbyte.contactbook.ui.TopBar
import com.rhythmbyte.contactbook.ui.WeekTable
import org.junit.Assume.assumeTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.RobolectricTestRunner

/** 用假資料畫出主要畫面，給人看設計用。CB_SCREENSHOTS=1 時才執行。 */
@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w393dp-h852dp-xxhdpi")
class ScreenshotTest {
    @get:Rule val rule = createComposeRule()

    private fun shot(name: String, dark: Boolean = false, content: @Composable () -> Unit) {
        assumeTrue(System.getProperty("cbScreenshots") == "true")
        rule.setContent { ContactBookTheme(dark = dark) { content() } }
        rule.onRoot().captureRoboImage("build/screenshots/$name.png")
    }

    private val tt = listOf(
        listOf("國語文", "英語文", "數學", "物理", "化學", "生物", "歷史", "地理", "公民", "自習"),
        listOf("數學", "國語文", "英語文", "體育", "資訊", "美術", "音樂", "理化", "輔導", "自習"),
        listOf("英語文", "數學", "國語文", "歷史", "地理", "體育", "班會", "團體活動", "自習", "自習"),
        listOf("國語文", "物理", "化學", "英語文", "數學", "公民", "體育", "地科", "輔導", "自習"),
        listOf("數學", "英語文", "國語文", "體育", "生物", "歷史", "社團活動", "彈性課程", "自習", "自習"),
    )

    private val board = BoardData(
        classTitle = "411 班聯絡簿",
        announcement = "段考週請早點休息！\n考試範圍：https://example.com/range",
        announcementUpdatedAt = null,
        today = "2026-11-02",
        date = "2026-11-02",
        entries = listOf(
            PublicEntry("1", "2026-11-02", Category.EXAM, "數學", "第一次段考 ch1–3", "範圍：課本 p.1–60\n帶計算機", "2026-11-09", Priority.HIGH),
            PublicEntry("2", "2026-11-02", Category.HOMEWORK, "國文", "習作 p.12～20", "", "2026-11-03"),
            PublicEntry("3", "2026-10-30", Category.SUBMISSION, "", "家長同意書（簽名）", "", "2026-11-04"),
            PublicEntry("4", "2026-11-02", Category.REMINDER, "", "明天穿運動服"),
        ),
        week = listOf(4, 2, 1, 1, 1, 1, 1).mapIndexed { i, n -> WeekDay("2026-11-0${2 + i}", n) },
        timetable = tt,
        version = "1",
    )

    private val editor = SessionUser("u", "amy", "學藝", Role.EDITOR, false)
    private val noopEdit = EditActions({ null }, { _, _ -> }, {}, { _, _ -> }, {}, {})

    @Test fun board() = shot("01-board") { BoardScreen(board, false, null, null, {}, {}, {}) }
    @Test fun boardEditor() = shot("01b-board-editor") { BoardScreen(board, false, null, editor, {}, {}, {}, edit = noopEdit, initialPage = 1) }
    @Test fun boardDark() = shot("02-board-dark", dark = true) { BoardScreen(board, false, null, editor, {}, {}, {}, edit = noopEdit) }
    @Test fun boardWeekend() = shot("03-board-weekend") {
        BoardScreen(board.copy(date = "2026-11-07", entries = emptyList(), announcement = ""), false, null, null, {}, {}, {})
    }
    @Test fun reveal30() = revealShot("10-reveal-30", 0.3f)
    @Test fun reveal60() = revealShot("11-reveal-60", 0.6f)

    /** 按＋之後展開動畫進行到一半的樣子 */
    private fun revealShot(name: String, p: Float) = shot(name) {
        Box(Modifier.fillMaxSize()) {
            BoardScreen(board, false, null, editor, {}, {}, {}, edit = noopEdit)
            val anim = remember { Animatable(p) }
            RevealOverlay(anim, Offset(1179f - 48f * 3f - 32f * 3f, 2556f - 60f * 3f - 32f * 3f), showPlus = true, onScrimClick = {}) {
                EntryEditor(null, "2026-11-02", Category.EXAM, {}, {}, { _, _ -> }, {}, {}, {})
            }
        }
    }
    @Test fun weekTable() = shot("04-week-timetable") {
        Column(Modifier.fillMaxSize().padding(16.dp)) { WeekTable(tt, 1) }
    }
    @Test fun login() = shot("05-login") { LoginScreen({ _, _ -> }, {}) }

    private fun managed(id: String, cat: Category, subject: String, title: String, entry: String, due: String?, high: Boolean = false) =
        ManagedEntry(id, entry, cat, subject, title, "", due, if (high) Priority.HIGH else Priority.NORMAL, 1, "2026-11-02T01:00:00Z", "王班長", "2026-11-02T01:00:00Z", "學藝")

    @Test fun editor() = shot("07-editor") {
        EntryEditor(managed("1", Category.EXAM, "數學", "第一次段考 ch1–3", "2026-11-02", "2026-11-09", true), "2026-11-02", Category.EXAM, {}, {}, { _, _ -> }, {}, {}, {})
    }
    @Test fun account() = shot("08-account-forced") {
        AccountScreen(SessionUser("u", "amy", "學藝", Role.EDITOR, true), { _, _ -> }, {}, {}, {}, {}, {})
    }
    @Test fun stats() = shot("09-install-stats") {
        Column {
            TopBar("App 安裝統計")
            InstallStatsContent(InstallStats(42, 35, listOf(VersionCount("3.0.0", 30, 30), VersionCount("2.0.0", 12, 5))), false)
        }
    }
}
