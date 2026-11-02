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
import com.rhythmbyte.contactbook.CalendarState
import com.rhythmbyte.contactbook.data.CalendarData
import com.rhythmbyte.contactbook.ui.AccountActions
import com.rhythmbyte.contactbook.ui.MainScreen
import com.rhythmbyte.contactbook.ui.MenuActions
import kotlinx.serialization.json.Json
import com.rhythmbyte.contactbook.ui.ContactBookTheme
import com.rhythmbyte.contactbook.ui.EditActions
import com.rhythmbyte.contactbook.ui.RevealOverlay
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import com.rhythmbyte.contactbook.ui.EntryEditor
import com.rhythmbyte.contactbook.ui.InstallStatsContent
import com.rhythmbyte.contactbook.ui.TopBar
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
    private val admin = SessionUser("a", "boss", "王班長", Role.ADMIN, false)
    private val noopEdit = EditActions({ null }, { _, _ -> }, {}, { _, _ -> }, {}, {})
    private val noopAccount = AccountActions({ _, _ -> }, { _, _ -> }, {}, {}, {}, {})
    private val calendarData: CalendarData = Json { ignoreUnknownKeys = true }.decodeFromString(
        CalendarData.serializer(),
        javaClass.getResourceAsStream("/calendar-115-1.json")!!.readBytes().decodeToString(),
    )

    private fun main(
        tab: Int,
        user: SessionUser? = null,
        b: BoardData? = board,
        edit: EditActions? = null,
    ): @Composable () -> Unit = {
        MainScreen(
            b, false, null, user, CalendarState.Ready(calendarData), tab, {}, {}, {}, {},
            noopAccount, MenuActions(), "3.0.0", false, edit,
        )
    }

    @Test fun tab1Guest() = shot("01-board", content = main(0))
    @Test fun tab1Editor() = shot("01b-board-editor", content = main(0, editor, edit = noopEdit))
    @Test fun tab1Dark() = shot("02-board-dark", dark = true, content = main(0, editor, edit = noopEdit))
    @Test fun tab1Weekend() = shot("03-board-weekend", content = main(0, b = board.copy(date = "2026-11-07", entries = emptyList(), announcement = "")))
    @Test fun tab2Timetable() = shot("04-timetable", content = main(1))
    @Test fun tab2TimetableAdmin() = shot("04b-timetable-dark-admin", dark = true, content = main(1, admin, edit = noopEdit))
    @Test fun tab2Weekend() = shot("04c-timetable-weekend", content = main(1, b = board.copy(today = "2026-11-07", date = "2026-11-07")))
    @Test fun tab3Calendar() = shot("05-calendar", content = main(2))
    @Test fun tab3CalendarDark() = shot("05b-calendar-dark", dark = true, content = main(2))
    @Test fun tab4Guest() = shot("06-me-guest", content = main(3))
    @Test fun tab4Admin() = shot("07-me-admin", content = main(3, admin, edit = noopEdit))
    @Test fun tab4Forced() = shot("08-me-forced", content = main(3, SessionUser("u", "amy", "學藝", Role.EDITOR, true)))

    @Test fun reveal30() = revealShot("10-reveal-30", 0.3f)
    @Test fun reveal60() = revealShot("11-reveal-60", 0.6f)

    /** 按＋之後展開動畫進行到一半的樣子 */
    private fun revealShot(name: String, p: Float) = shot(name) {
        Box(Modifier.fillMaxSize()) {
            main(0, editor, edit = noopEdit)()
            val anim = remember { Animatable(p) }
            RevealOverlay(anim, Offset(1179f - 48f * 3f - 32f * 3f, 2556f - 60f * 3f - 32f * 3f), showPlus = true, onScrimClick = {}) {
                EntryEditor(null, "2026-11-02", Category.EXAM, {}, {}, { _, _ -> }, {}, {}, {})
            }
        }
    }

    private fun managed(id: String, cat: Category, subject: String, title: String, entry: String, due: String?, high: Boolean = false) =
        ManagedEntry(id, entry, cat, subject, title, "", due, if (high) Priority.HIGH else Priority.NORMAL, 1, "2026-11-02T01:00:00Z", "王班長", "2026-11-02T01:00:00Z", "學藝")

    @Test fun editor() = shot("07-editor") {
        EntryEditor(managed("1", Category.EXAM, "數學", "第一次段考 ch1–3", "2026-11-02", "2026-11-09", true), "2026-11-02", Category.EXAM, {}, {}, { _, _ -> }, {}, {}, {})
    }
    @Test fun stats() = shot("09-install-stats") {
        Column {
            TopBar("App 安裝統計")
            InstallStatsContent(InstallStats(42, 35, listOf(VersionCount("3.0.0", 30, 30), VersionCount("2.0.0", 12, 5))), false)
        }
    }
}
