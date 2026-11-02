package com.rhythmbyte.contactbook.ui

import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.rhythmbyte.contactbook.CalendarState
import com.rhythmbyte.contactbook.TAB_BOARD
import com.rhythmbyte.contactbook.TAB_CALENDAR
import com.rhythmbyte.contactbook.TAB_ME
import com.rhythmbyte.contactbook.TAB_TIMETABLE
import com.rhythmbyte.contactbook.data.BoardData
import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.Dates
import com.rhythmbyte.contactbook.data.EntryInput
import com.rhythmbyte.contactbook.data.ManagedEntry
import com.rhythmbyte.contactbook.data.PublicEntry
import com.rhythmbyte.contactbook.data.Role
import com.rhythmbyte.contactbook.data.SessionUser
import com.rhythmbyte.contactbook.ui.liquid.LiquidBottomTab
import com.rhythmbyte.contactbook.ui.liquid.LiquidBottomTabs
import com.rhythmbyte.contactbook.ui.liquid.LiquidButton
import kotlinx.coroutines.launch

/** 登入後在聯絡簿上直接編輯要用到的動作（由 AppViewModel 提供） */
class EditActions(
    /** 點事項時，向伺服器拿有版本號的完整資料 */
    val load: suspend (PublicEntry) -> ManagedEntry?,
    val save: suspend (ManagedEntry?, EntryInput) -> Unit,
    val delete: suspend (ManagedEntry) -> Unit,
    val toast: (String, Boolean) -> Unit,
    val onError: (Throwable) -> Unit,
    /** 存檔或刪除後重新整理聯絡簿 */
    val onChanged: () -> Unit,
)

private data class EditorState(val entry: ManagedEntry?, val center: Offset, val fromPlus: Boolean, val date: String)

private data class TabSpec(val label: String, val icon: ImageVector)

private val TABS = listOf(
    TabSpec("聯絡簿", CbIcons.Book),
    TabSpec("課表", CbIcons.Grid),
    TabSpec("行事曆", CbIcons.Calendar2),
    TabSpec("我的", CbIcons.User),
)

/**
 * 主畫面：上面一條班級名稱，中間四個分頁（可以左右滑），底下是 LiquidGlass 玻璃底欄。
 *   1 聯絡簿（整本聯絡簿；登入後點事項編輯）
 *   2 課表（今天是星期幾就反白那一天）
 *   3 行事曆（學校的學期校曆）
 *   4 我的（登入、帳號、管理員功能）
 * 右邊的「＋」（新增事項）和之前一樣，有編輯權限時一直都在。
 */
@Composable
fun MainScreen(
    board: BoardData?,
    loading: Boolean,
    error: String?,
    user: SessionUser?,
    calendar: CalendarState,
    tab: Int,
    onTab: (Int) -> Unit,
    onPick: (String) -> Unit,
    onRefresh: () -> Unit,
    onLoadCalendar: () -> Unit,
    account: AccountActions,
    menu: MenuActions,
    version: String,
    checkingUpdate: Boolean,
    edit: EditActions? = null,
) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    val canEdit = user != null && !user.mustChangePassword && edit != null
    val pager = rememberPagerState(initialPage = tab) { TABS.size }
    val backdrop = rememberLayerBackdrop()
    var plusCenter by remember { mutableStateOf(Offset.Zero) }
    var editor by remember { mutableStateOf<EditorState?>(null) }
    val reveal = remember { Animatable(0f) }

    // 「目前要看哪一頁」只有一個來源：tab（外面的狀態）。
    //  - 點底欄、登入過期等改了 tab → pager 用動畫捲過去（程式捲動）。
    //  - 使用者用手指滑動 pager → 滑到新的一頁時回報給 tab。
    // 程式捲動途中 pager.currentPage 會依序經過中間的頁（例如 1 → 2 → 3），這時一定不能回報，
    // 否則會把目標改成中間那一頁（以前就是這樣：按第 4 格只會到第 3 格，快速連按會卡住）。
    val latestTab = rememberUpdatedState(tab)
    val latestOnTab = rememberUpdatedState(onTab)
    val selectedIndex = remember { { latestTab.value } }            // 給玻璃底欄用，要固定同一個函式
    val onSelectIndex = remember { { i: Int -> latestOnTab.value(i) } }
    val programmaticScrolls = remember { intArrayOf(0) }
    LaunchedEffect(tab) {
        if (pager.currentPage != tab) {
            programmaticScrolls[0]++
            try {
                pager.animateScrollToPage(tab)
            } finally {
                programmaticScrolls[0]--
            }
        }
    }
    LaunchedEffect(pager) {
        snapshotFlow { pager.currentPage }.collect { page ->
            if (programmaticScrolls[0] == 0 && page != latestTab.value) latestOnTab.value(page)
        }
    }
    LaunchedEffect(pager.currentPage) { if (pager.currentPage == TAB_CALENDAR) onLoadCalendar() }

    fun openEditor(state: EditorState) {
        editor = state
        scope.launch { reveal.revealOpen() }
    }
    fun closeEditor(changed: Boolean = false) {
        scope.launch {
            reveal.revealClose()
            editor = null
        }
        if (changed) edit?.onChanged?.invoke()
    }
    BackHandler(enabled = editor != null) { closeEditor() }
    BackHandler(enabled = editor == null && tab != TAB_BOARD) { onTab(TAB_BOARD) }

    Box(Modifier.fillMaxSize().background(c.bg)) {
        Column(Modifier.fillMaxSize().layerBackdrop(backdrop).background(c.bg)) {
            BrandBar(board?.classTitle ?: "班級聯絡簿")
            HorizontalPager(pager, Modifier.fillMaxSize(), beyondViewportPageCount = 1) { page ->
                when (page) {
                    TAB_BOARD -> BoardTab(
                        board, loading, error, onPick, onRefresh,
                        onEntry = if (canEdit) { e, center ->
                            scope.launch {
                                try {
                                    val m = edit!!.load(e)
                                    if (m == null) edit.toast("這個事項已經被刪除了", true)
                                    else openEditor(EditorState(m, center, false, m.entryDate))
                                } catch (t: Throwable) {
                                    edit!!.onError(t)
                                }
                            }
                        } else null,
                    )
                    TAB_TIMETABLE -> TimetableTab(
                        timetable = board?.timetable,
                        today = board?.today,
                        updatedAt = null,
                        canEdit = canEdit && user?.role == Role.ADMIN,
                        onEdit = menu.onTimetable,
                    )
                    TAB_CALENDAR -> CalendarTab(calendar, board?.today ?: Dates.today(), onRetry = onLoadCalendar)
                    else -> AccountTab(user, account, menu, version, checkingUpdate)
                }
            }
        }

        Row(
            Modifier.align(Alignment.BottomCenter).fillMaxWidth().navigationBarsPadding().padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            LiquidBottomTabs(
                selectedTabIndex = selectedIndex,
                onTabSelected = onSelectIndex,
                backdrop = backdrop,
                tabsCount = TABS.size,
                modifier = Modifier.weight(1f),
            ) {
                TABS.forEachIndexed { i, t -> BottomTab(t.label, t.icon) { onTab(i) } }
            }
            // 右邊的「＋」：和之前一樣，有編輯權限就一直在（不隨分頁消失）
            if (canEdit) {
                LiquidButton(
                    onClick = { openEditor(EditorState(null, plusCenter, true, board?.date ?: Dates.today())) },
                    backdrop = backdrop,
                    modifier = Modifier
                        .size(64.dp)
                        .onGloballyPositioned { plusCenter = it.boundsInRoot().center }
                        .graphicsLayer { alpha = if (editor?.fromPlus == true) 0f else 1f },
                    surfaceColor = c.surface.copy(alpha = 0.4f),
                ) {
                    Icon(CbIcons.Plus, "新增事項", tint = c.ink, modifier = Modifier.size(26.dp))
                }
            }
        }

        editor?.let { st ->
            RevealOverlay(reveal, st.center, showPlus = st.fromPlus, onScrimClick = {}) {
                EntryEditor(
                    entry = st.entry,
                    today = st.date,
                    defaultCategory = st.entry?.category ?: Category.HOMEWORK,
                    save = { input -> edit!!.save(st.entry, input) },
                    delete = { edit!!.delete(st.entry!!) },
                    toast = edit!!.toast,
                    onError = edit.onError,
                    onBack = { closeEditor() },
                    onDone = { closeEditor(changed = true) },
                )
            }
        }
    }
}

@Composable
private fun BrandBar(title: String) {
    val c = Cb.c
    Column(Modifier.background(c.bg).statusBarsPadding()) {
        Row(Modifier.fillMaxWidth().height(60.dp).padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.size(30.dp).clip(RoundedCornerShape(8.dp)).background(c.ink), contentAlignment = Alignment.Center) {
                Icon(CbIcons.Book, null, tint = c.bg, modifier = Modifier.size(17.dp))
            }
            Spacer(Modifier.width(10.dp))
            Text(title, Modifier.weight(1f), fontWeight = FontWeight.Bold, fontSize = 16.sp, color = c.ink, maxLines = 1)
        }
        HorizontalDivider(color = c.line)
    }
}

@Composable
private fun RowScope.BottomTab(label: String, icon: ImageVector, onClick: () -> Unit) {
    val c = Cb.c
    LiquidBottomTab(onClick, Modifier.testTag("tab-$label")) {
        Icon(icon, null, tint = c.ink, modifier = Modifier.size(22.dp))
        Text(label, fontSize = 11.sp, fontWeight = FontWeight.SemiBold, color = c.ink, maxLines = 1)
    }
}
