package com.rhythmbyte.contactbook

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeLeft
import androidx.compose.ui.test.swipeRight
import com.rhythmbyte.contactbook.data.BoardData
import com.rhythmbyte.contactbook.data.CalendarData
import com.rhythmbyte.contactbook.data.WeekDay
import com.rhythmbyte.contactbook.ui.AccountActions
import com.rhythmbyte.contactbook.ui.ContactBookTheme
import com.rhythmbyte.contactbook.ui.MainScreen
import com.rhythmbyte.contactbook.ui.MenuActions
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

/**
 * 底欄切換分頁：按哪一格就要「一次」到那一格（不能停在中途，也不能要按兩次）。
 * 這個測試不需要網路，平常的 testDebugUnitTest 就會跑。
 */
@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w393dp-h852dp-xxhdpi")
class TabNavigationTest {
    @get:Rule val rule = createComposeRule()

    private val calendar: CalendarData = Json { ignoreUnknownKeys = true }.decodeFromString(
        CalendarData.serializer(),
        javaClass.getResourceAsStream("/calendar-115-1.json")!!.readBytes().decodeToString(),
    )
    private val tt = List(5) { d -> List(10) { p -> "D${d}P$p" } }
    private val board = BoardData(
        classTitle = "411 班聯絡簿", announcement = "", today = "2026-11-02", date = "2026-11-02",
        entries = emptyList(), week = List(7) { WeekDay("2026-11-0${2 + it}", 0) }, timetable = tt, version = "1",
    )

    /** 每一個分頁畫面上獨有的文字，用來確認真的「顯示」在那一頁 */
    private val pageMarker = listOf("選日期", "今天是週一", "第 10 週", "帳號")

    private fun start(initial: Int = 0): () -> Int {
        var tab by mutableIntStateOf(initial)
        rule.setContent {
            ContactBookTheme(dark = false) {
                MainScreen(
                    board, false, null, null, CalendarState.Ready(calendar), tab, { tab = it }, {}, {}, {},
                    AccountActions({ _, _ -> }, { _, _ -> }, {}, {}, {}, {}), MenuActions(), "3.0.0", false, null,
                )
            }
        }
        return { tab }
    }

    private fun assertOnPage(tab: () -> Int, expected: Int, why: String) {
        rule.waitForIdle()
        assertEquals("$why：分頁狀態", expected, tab())
        rule.onNodeWithText(pageMarker[expected]).assertIsDisplayed()
    }

    @Test fun pressingAnyTabGoesStraightThere() {
        val tab = start()
        // 從 1 直接按 4（以前只能跳到 3）、再回來、跳著按
        for (target in listOf(3, 0, 2, 1, 3, 1, 0, 3, 2, 0)) {
            rule.onNodeWithTag(tabTag(target)).performClick()
            assertOnPage(tab, target, "按第 ${target + 1} 格")
        }
    }

    @Test fun pressingTabsQuicklyOneAfterAnotherEndsOnTheLastOne() {
        val tab = start()
        // 動畫還沒跑完就按下一格（以前會卡住要重按）
        for (target in listOf(3, 1, 2, 0, 3)) rule.onNodeWithTag(tabTag(target)).performClick()
        assertOnPage(tab, 3, "連續快速按，最後按第 4 格")
        rule.onNodeWithTag(tabTag(0)).performClick()
        rule.onNodeWithTag(tabTag(2)).performClick()
        assertOnPage(tab, 2, "連續快速按，最後按第 3 格")
    }

    @Test fun swipingStillChangesTheTab() {
        val tab = start()
        rule.onRoot().performTouchInput { swipeLeft() }
        assertOnPage(tab, 1, "往左滑一頁")
        rule.onRoot().performTouchInput { swipeRight() }
        assertOnPage(tab, 0, "往右滑回來")
        rule.onRoot().performTouchInput { swipeLeft() }
        rule.onRoot().performTouchInput { swipeLeft() }
        assertOnPage(tab, 2, "連滑兩頁")
        rule.onNodeWithTag(tabTag(3)).performClick()
        assertOnPage(tab, 3, "滑動之後再按第 4 格")
    }

    private fun tabTag(i: Int) = "tab-" + listOf("聯絡簿", "課表", "行事曆", "我的")[i]
}
