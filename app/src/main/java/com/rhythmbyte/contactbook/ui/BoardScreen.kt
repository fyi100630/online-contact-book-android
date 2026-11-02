package com.rhythmbyte.contactbook.ui

import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.rhythmbyte.contactbook.data.BoardData
import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.Dates
import com.rhythmbyte.contactbook.data.EntryInput
import com.rhythmbyte.contactbook.data.ManagedEntry
import com.rhythmbyte.contactbook.data.Priority
import com.rhythmbyte.contactbook.data.PublicEntry
import com.rhythmbyte.contactbook.data.Role
import com.rhythmbyte.contactbook.data.SessionUser
import com.rhythmbyte.contactbook.data.TIMETABLE_PERIODS
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

/** 右上角帳號選單的項目 */
class MenuActions(
    val onAccount: () -> Unit = {},
    val onAnnouncement: () -> Unit = {},
    val onTimetable: () -> Unit = {},
    val onStats: () -> Unit = {},
    val onWeb: (String) -> Unit = {},
    val onCheckUpdate: () -> Unit = {},
    val onLogout: () -> Unit = {},
)

private data class EditorState(val entry: ManagedEntry?, val center: Offset, val fromPlus: Boolean, val date: String, val category: Category)

private val CATEGORY_ICONS = mapOf(
    Category.HOMEWORK to CbIcons.Pencil,
    Category.EXAM to CbIcons.Exam,
    Category.SUBMISSION to CbIcons.Inbox,
    Category.REMINDER to CbIcons.Bell,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoardScreen(
    board: BoardData?,
    loading: Boolean,
    error: String?,
    user: SessionUser?,
    onPick: (String) -> Unit,
    onRefresh: () -> Unit,
    onLogin: () -> Unit,
    menu: MenuActions = MenuActions(),
    edit: EditActions? = null,
    initialPage: Int = 0,
) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    val canEdit = user != null && !user.mustChangePassword && edit != null
    // 底部玻璃分頁：作業、考試、繳交、提醒（左右滑動也可以切換，和舊版一樣）
    val pager = rememberPagerState(initialPage) { Category.entries.size }
    val backdrop = rememberLayerBackdrop()
    var showDate by remember { mutableStateOf(false) }
    var showWeek by remember { mutableStateOf(false) }
    var showMenu by remember { mutableStateOf(false) }
    var plusCenter by remember { mutableStateOf(Offset.Zero) }
    var editor by remember { mutableStateOf<EditorState?>(null) }
    val reveal = remember { Animatable(0f) }

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

    Box(Modifier.fillMaxSize().background(c.bg)) {
        Column(Modifier.fillMaxSize().layerBackdrop(backdrop).background(c.bg)) {
            BrandBar(board?.classTitle ?: "班級聯絡簿", user, onLogin, onMenu = { showMenu = true })
            if (board == null) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    if (error != null) {
                        Column(Modifier.padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("聯絡簿暫時無法載入", fontWeight = FontWeight.Bold, fontSize = 17.sp, color = c.ink)
                            Text(error, color = c.ink3, fontSize = 14.sp, textAlign = TextAlign.Center)
                            Spacer(Modifier.height(4.dp))
                            CbButton("重新載入", onRefresh, kind = BtnKind.Secondary)
                        }
                    } else {
                        Spinner()
                    }
                }
                return@Column
            }
            PullToRefreshBox(isRefreshing = loading, onRefresh = onRefresh, modifier = Modifier.fillMaxSize()) {
                HorizontalPager(pager, Modifier.fillMaxSize(), beyondViewportPageCount = 1) { page ->
                    val cat = Category.entries[page]
                    BoardPage(
                        board, cat, onPick,
                        onPickDate = { showDate = true },
                        onWeek = { showWeek = true },
                        onEntry = if (canEdit) { e, center ->
                            scope.launch {
                                try {
                                    val m = edit!!.load(e)
                                    if (m == null) edit.toast("這個事項已經被刪除了", true)
                                    else openEditor(EditorState(m, center, false, m.entryDate, m.category))
                                } catch (t: Throwable) {
                                    edit!!.onError(t)
                                }
                            }
                        } else null,
                    )
                }
            }
        }

        if (board != null) {
            Row(
                Modifier.align(Alignment.BottomCenter).fillMaxWidth().navigationBarsPadding().padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                LiquidBottomTabs(
                    selectedTabIndex = { pager.currentPage },
                    onTabSelected = { scope.launch { pager.animateScrollToPage(it) } },
                    backdrop = backdrop,
                    tabsCount = Category.entries.size,
                    modifier = Modifier.weight(1f),
                ) {
                    Category.entries.forEachIndexed { i, cat ->
                        BottomTab(cat.short, CATEGORY_ICONS.getValue(cat)) { scope.launch { pager.animateScrollToPage(i) } }
                    }
                }
                if (canEdit) {
                    LiquidButton(
                        onClick = {
                            openEditor(EditorState(null, plusCenter, true, board.date, Category.entries[pager.currentPage]))
                        },
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
        }

        editor?.let { st ->
            RevealOverlay(reveal, st.center, showPlus = st.fromPlus, onScrimClick = {}) {
                EntryEditor(
                    entry = st.entry,
                    today = st.date,
                    defaultCategory = st.category,
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

    if (board != null) {
        if (showDate) DatePick(board.date, onPick = onPick, onDismiss = { showDate = false })
        if (showWeek && board.timetable != null) WeekSheet(board.timetable, Dates.weekday(board.date), canEditTimetable = user?.role == Role.ADMIN && canEdit, onEdit = { showWeek = false; menu.onTimetable() }) { showWeek = false }
    }
    if (showMenu && user != null) AccountMenu(user, menu) { showMenu = false }
}

@Composable
private fun BrandBar(title: String, user: SessionUser?, onLogin: () -> Unit, onMenu: () -> Unit) {
    val c = Cb.c
    Column(Modifier.background(c.bg).statusBarsPadding()) {
        Row(Modifier.fillMaxWidth().height(60.dp).padding(start = 16.dp, end = 8.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.size(30.dp).clip(RoundedCornerShape(8.dp)).background(c.ink), contentAlignment = Alignment.Center) {
                Icon(CbIcons.Book, null, tint = c.bg, modifier = Modifier.size(17.dp))
            }
            Spacer(Modifier.width(10.dp))
            Text(title, Modifier.weight(1f), fontWeight = FontWeight.Bold, fontSize = 16.sp, color = c.ink, maxLines = 1)
            if (user == null) {
                CbButton("登入", onLogin, kind = BtnKind.Secondary, small = true)
                Spacer(Modifier.width(8.dp))
            } else {
                Row(
                    Modifier.clip(CircleShape).clickable(onClick = onMenu).padding(horizontal = 10.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(user.displayName, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = c.ink2, maxLines = 1)
                    Spacer(Modifier.width(6.dp))
                    Icon(CbIcons.Menu, "帳號選單", tint = c.ink, modifier = Modifier.size(20.dp))
                }
            }
        }
        HorizontalDivider(color = c.line)
    }
}

/** 右上角帳號選單：取代原本的「管理後台」 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AccountMenu(user: SessionUser, menu: MenuActions, onDismiss: () -> Unit) {
    val c = Cb.c
    val go: (() -> Unit) -> () -> Unit = { f -> { onDismiss(); f() } }
    ModalBottomSheet(onDismissRequest = onDismiss, containerColor = c.surface) {
        Column(Modifier.padding(horizontal = 12.dp).navigationBarsPadding().padding(bottom = 12.dp)) {
            Column(Modifier.padding(horizontal = 12.dp, vertical = 4.dp)) {
                Text(user.displayName, fontSize = 17.sp, fontWeight = FontWeight.Bold, color = c.ink)
                Text("${user.username}，${user.role.label}", fontSize = 13.sp, color = c.ink3)
            }
            if (!user.mustChangePassword) {
                Text("點聯絡簿上的事項就能修改，按右下角＋新增。", Modifier.padding(horizontal = 12.dp, vertical = 8.dp), fontSize = 13.sp, color = c.ink3)
            }
            HorizontalDivider(Modifier.padding(vertical = 6.dp), color = c.line)
            if (user.role == Role.ADMIN && !user.mustChangePassword) {
                MenuItem("編輯公告", CbIcons.Megaphone, go(menu.onAnnouncement))
                MenuItem("編輯課表", CbIcons.Grid, go(menu.onTimetable))
                MenuItem("App 安裝統計", CbIcons.Phone, go(menu.onStats))
                MenuItem("帳號管理（網頁）", CbIcons.External, go { menu.onWeb("/manage/users") })
                MenuItem("修改紀錄、垃圾桶（網頁）", CbIcons.External, go { menu.onWeb("/manage/activity") })
                HorizontalDivider(Modifier.padding(vertical = 6.dp), color = c.line)
            }
            MenuItem("我的帳號（修改密碼）", CbIcons.User, go(menu.onAccount))
            MenuItem("檢查更新", CbIcons.Download, go(menu.onCheckUpdate))
            MenuItem("登出", CbIcons.Logout, go(menu.onLogout), danger = true)
        }
    }
}

@Composable
private fun MenuItem(text: String, icon: ImageVector, onClick: () -> Unit, danger: Boolean = false) {
    val c = Cb.c
    Row(
        Modifier.fillMaxWidth().heightIn(min = 50.dp).clip(RoundedCornerShape(10.dp)).clickable(onClick = onClick).padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, null, tint = if (danger) c.red else c.ink2, modifier = Modifier.size(20.dp))
        Spacer(Modifier.width(14.dp))
        Text(text, fontSize = 15.sp, fontWeight = FontWeight.SemiBold, color = if (danger) c.red else c.ink)
    }
}

@Composable
private fun RowScope.BottomTab(label: String, icon: ImageVector, onClick: () -> Unit) {
    val c = Cb.c
    LiquidBottomTab(onClick) {
        Icon(icon, null, tint = c.ink, modifier = Modifier.size(22.dp))
        Text(label, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = c.ink, maxLines = 1)
    }
}

/** 一個分類一頁；日期、週曆、公告、課表在每頁最上面 */
@Composable
fun BoardPage(
    board: BoardData,
    category: Category,
    onPick: (String) -> Unit,
    onPickDate: () -> Unit,
    onWeek: () -> Unit,
    onEntry: ((PublicEntry, Offset) -> Unit)?,
) {
    val list = board.entries.filter { it.category == category }
    LazyColumn(
        Modifier.fillMaxSize(),
        // 底部留空間給玻璃分頁列
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 120.dp),
    ) {
        item(key = "hero") { Hero(board, onToday = { onPick(board.today) }, onPickDate = onPickDate) }
        item(key = "week") { WeekStrip(board, onPick) }
        if (board.announcement.isNotBlank()) {
            item(key = "notice") { Notice(board) }
        }
        board.timetable?.let { tt ->
            item(key = "classes") { DayClasses(tt, board.date, onWeek = onWeek) }
        }
        item(key = "head") { SheetHead(category.label, list.size) }
        if (list.isEmpty()) {
            item(key = "empty") { EmptyState("這天沒有${category.short}", "用上面的週曆看看其他天") }
        } else {
            items(list, key = { it.id }) { e -> EntryRow(e, board.date, onEntry?.let { f -> { center: Offset -> f(e, center) } }) }
        }
    }
}

@Composable
private fun Hero(board: BoardData, onToday: () -> Unit, onPickDate: () -> Unit) {
    val c = Cb.c
    val d = Dates.parse(board.date)
    val isToday = board.date == board.today
    val otherYear = d.year.toString() != board.today.take(4)
    Column(Modifier.padding(bottom = 16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.semantics(mergeDescendants = true) { heading() }) {
            Text("${d.dayOfMonth}", fontSize = 76.sp, lineHeight = 70.sp, fontWeight = FontWeight.ExtraBold, color = c.ink, letterSpacing = (-2).sp)
            Spacer(Modifier.width(14.dp))
            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                Text((if (otherYear) "${d.year} 年 " else "") + "${d.monthValue} 月", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = c.ink)
                Text("週${Dates.WEEKDAYS[Dates.weekday(board.date)]}", fontSize = 18.sp, color = c.ink3)
            }
            Spacer(Modifier.width(16.dp))
            Text(
                Dates.relativeLabel(board.today, board.date),
                Modifier.clip(CircleShape).background(c.bg2).padding(horizontal = 10.dp, vertical = 3.dp),
                fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = c.ink2,
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            if (!isToday) CbButton("回到今天", onToday, kind = BtnKind.Secondary, small = true)
            CbButton("選日期", onPickDate, kind = BtnKind.Secondary, small = true, icon = CbIcons.Calendar)
        }
    }
}

@Composable
private fun WeekStrip(board: BoardData, onPick: (String) -> Unit) {
    val c = Cb.c
    val first = board.week.firstOrNull()?.date ?: board.date
    Column {
        HorizontalDivider(color = c.line)
        Row(Modifier.fillMaxWidth().padding(vertical = 6.dp), verticalAlignment = Alignment.CenterVertically) {
            IconButton({ onPick(Dates.addDays(first, -7)) }, Modifier.size(40.dp)) { Icon(CbIcons.ChevronLeft, "上一週", tint = c.ink3) }
            board.week.forEach { (date, count) ->
                val wd = Dates.weekday(date)
                val selected = date == board.date
                val today = date == board.today
                Column(
                    Modifier.weight(1f).clip(RoundedCornerShape(10.dp)).clickable { onPick(date) }.padding(vertical = 6.dp)
                        .semantics(mergeDescendants = true) { contentDescription = "${Dates.formatLong(date)}，$count 項" },
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text("週${Dates.WEEKDAYS[wd]}", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = if (selected) c.primary else c.ink3)
                    Box(
                        Modifier.padding(vertical = 2.dp).size(36.dp).clip(CircleShape)
                            .background(if (selected) c.primary else c.bg)
                            .then(if (today && !selected) Modifier.border(1.5.dp, c.ink3, CircleShape) else Modifier),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            "${Dates.parse(date).dayOfMonth}", fontSize = 18.sp, fontWeight = FontWeight.Bold,
                            color = when { selected -> c.onPrimary; wd == 0 || wd == 6 -> c.ink3; else -> c.ink },
                        )
                    }
                    Text(if (count > 0) "$count" else "", fontSize = 11.sp, fontWeight = FontWeight.SemiBold, color = c.ink3, modifier = Modifier.heightIn(min = 15.dp))
                }
            }
            IconButton({ onPick(Dates.addDays(first, 7)) }, Modifier.size(40.dp)) { Icon(CbIcons.ChevronRight, "下一週", tint = c.ink3) }
        }
        HorizontalDivider(color = c.line)
    }
}

@Composable
private fun Notice(board: BoardData) {
    val c = Cb.c
    Column(Modifier.padding(top = 20.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp)).background(c.bg2).padding(horizontal = 18.dp, vertical = 16.dp)) {
        Text("公告", fontWeight = FontWeight.Bold, fontSize = 15.sp, color = c.ink, modifier = Modifier.semantics { heading() })
        Spacer(Modifier.height(4.dp))
        Text(linkify(board.announcement), fontSize = 15.sp, lineHeight = 24.sp, color = c.ink)
        board.announcementUpdatedAt?.let {
            Spacer(Modifier.height(8.dp))
            Text("${timeAgo(it)}更新", fontSize = 12.sp, color = c.ink3)
        }
    }
}

@Composable
private fun DayClasses(timetable: List<List<String>>, date: String, onWeek: () -> Unit) {
    val c = Cb.c
    val classes = Dates.classesOn(timetable, date)
    val last = classes?.indexOfLast { it.isNotBlank() }?.plus(1) ?: 0
    Column(Modifier.padding(top = 20.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("課表", Modifier.weight(1f).semantics { heading() }, fontWeight = FontWeight.Bold, fontSize = 15.sp, color = c.ink)
            CbButton("整週", onWeek, kind = BtnKind.Ghost, small = true)
        }
        if (classes == null || last == 0) {
            Text(if (classes == null) "週末沒有課" else "這天沒有排課", fontSize = 14.sp, color = c.ink3)
        } else {
            HorizontalDivider(color = c.line)
            classes.take(last).chunked(5).forEachIndexed { row, chunk ->
                Row(Modifier.fillMaxWidth()) {
                    for (i in 0 until 5) {
                        val name = chunk.getOrNull(i)
                        Column(Modifier.weight(1f).padding(top = 7.dp, bottom = 7.dp, end = 4.dp)) {
                            if (name != null) {
                                Text("${row * 5 + i + 1}", fontSize = 11.sp, fontWeight = FontWeight.SemiBold, color = c.ink3)
                                Text(
                                    name.ifBlank { "—" }, fontSize = 14.sp, lineHeight = 19.sp,
                                    fontWeight = if (name.isBlank()) FontWeight.Normal else FontWeight.SemiBold,
                                    color = if (name.isBlank()) c.ink3 else c.ink,
                                )
                            }
                        }
                    }
                }
                HorizontalDivider(color = c.line)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun WeekSheet(timetable: List<List<String>>, highlight: Int, canEditTimetable: Boolean, onEdit: () -> Unit, onDismiss: () -> Unit) {
    val c = Cb.c
    ModalBottomSheet(onDismissRequest = onDismiss, containerColor = c.surface) {
        Column(Modifier.padding(horizontal = 16.dp).navigationBarsPadding().padding(bottom = 16.dp)) {
            Row(Modifier.padding(bottom = 12.dp), verticalAlignment = Alignment.CenterVertically) {
                Text("整週課表", Modifier.weight(1f), fontSize = 18.sp, fontWeight = FontWeight.Bold, color = c.ink)
                if (canEditTimetable) CbButton("編輯", onEdit, kind = BtnKind.Secondary, small = true)
            }
            WeekTable(timetable, highlight)
        }
    }
}

/** 整週課表表格（首頁的「整週」和後台的預覽共用） */
@Composable
fun WeekTable(timetable: List<List<String>>, highlight: Int) {
    val c = Cb.c
    val ink = c.ink
    Column {
        Row(Modifier.fillMaxWidth().drawBehind {
            drawLine(ink, Offset(0f, size.height), Offset(size.width, size.height), 2.dp.toPx())
        }.padding(vertical = 8.dp)) {
            Text("節", Modifier.width(32.dp), fontSize = 12.sp, color = c.ink3, textAlign = TextAlign.Center, fontWeight = FontWeight.SemiBold)
            for (d in 1..5) {
                Text("週${Dates.WEEKDAYS[d]}", Modifier.weight(1f), fontSize = 13.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = if (d == highlight) c.primary else c.ink3)
            }
        }
        for (p in 0 until TIMETABLE_PERIODS) {
            Row(Modifier.fillMaxWidth().heightIn(min = 36.dp), verticalAlignment = Alignment.CenterVertically) {
                Text("${p + 1}", Modifier.width(32.dp), fontSize = 12.sp, color = c.ink3, textAlign = TextAlign.Center, fontWeight = FontWeight.SemiBold)
                for (d in 0 until 5) {
                    Box(
                        Modifier.weight(1f).heightIn(min = 36.dp).background(if (d + 1 == highlight) c.primarySoft else c.surface).padding(horizontal = 2.dp, vertical = 6.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(timetable.getOrNull(d)?.getOrNull(p).orEmpty(), fontSize = 14.sp, lineHeight = 18.sp, fontWeight = FontWeight.SemiBold, color = c.ink, textAlign = TextAlign.Center)
                    }
                }
            }
            HorizontalDivider(color = c.line)
        }
    }
}

@Composable
private fun SheetHead(title: String, count: Int) {
    val c = Cb.c
    val ink = c.ink
    Row(
        Modifier.fillMaxWidth().padding(top = 24.dp).drawBehind {
            drawLine(ink, Offset(0f, size.height), Offset(size.width, size.height), 2.dp.toPx())
        }.padding(bottom = 8.dp).semantics(mergeDescendants = true) { heading() },
        verticalAlignment = Alignment.Bottom,
    ) {
        Text(title, fontSize = 17.sp, fontWeight = FontWeight.ExtraBold, color = c.ink)
        Spacer(Modifier.width(8.dp))
        Text("$count", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = c.ink3, modifier = Modifier.padding(bottom = 2.dp))
    }
}

@Composable
private fun EntryRow(e: PublicEntry, day: String, onClick: ((Offset) -> Unit)?) {
    val c = Cb.c
    val dl = Dates.deadline(e.dueDate, day, e.category)
    var center by remember { mutableStateOf(Offset.Zero) }
    Column(
        Modifier
            .onGloballyPositioned { center = it.boundsInRoot().center }
            .then(if (onClick != null) Modifier.clickable { onClick(center) } else Modifier),
    ) {
        Row(Modifier.fillMaxWidth().padding(vertical = 14.dp), horizontalArrangement = Arrangement.spacedBy(14.dp)) {
            Text(e.subject, Modifier.widthIn(min = 56.dp, max = 72.dp).width(64.dp), fontSize = 14.sp, fontWeight = FontWeight.Bold, color = c.ink2)
            Column(Modifier.weight(1f)) {
                Row {
                    Text(
                        androidx.compose.ui.text.buildAnnotatedString {
                            if (e.priority == Priority.HIGH) {
                                pushStyle(androidx.compose.ui.text.SpanStyle(color = c.red, fontWeight = FontWeight.ExtraBold))
                                append("重要  ")
                                pop()
                            }
                            append(e.title)
                        },
                        fontSize = 16.sp, lineHeight = 23.sp, fontWeight = FontWeight.SemiBold, color = c.ink,
                    )
                }
                if (e.details.isNotBlank()) {
                    Spacer(Modifier.height(4.dp))
                    Text(linkify(e.details), fontSize = 14.sp, lineHeight = 21.sp, color = c.ink2)
                }
                if (e.entryDate != day) {
                    Spacer(Modifier.height(4.dp))
                    Text("${Dates.formatShort(e.entryDate)} 登記", fontSize = 12.sp, color = c.ink3)
                }
            }
            if (dl != null) {
                val red = dl.tone == Dates.Tone.TODAY || dl.tone == Dates.Tone.TOMORROW
                Text(
                    dl.label, fontSize = 14.sp,
                    fontWeight = if (dl.tone == Dates.Tone.PAST) FontWeight.Medium else FontWeight.Bold,
                    color = when { red -> c.red; dl.tone == Dates.Tone.PAST -> c.ink3; else -> c.ink2 },
                    maxLines = 1,
                )
            }
        }
        HorizontalDivider(color = c.line)
    }
}

fun timeAgo(iso: String): String {
    val t = runCatching { java.time.Instant.parse(iso) }.getOrNull() ?: return ""
    val mins = java.time.Duration.between(t, java.time.Instant.now()).toMinutes()
    return when {
        mins < 1 -> "剛剛"
        mins < 60 -> "$mins 分鐘前"
        mins < 60 * 24 -> "${mins / 60} 小時前"
        mins < 60 * 24 * 30 -> "${mins / 60 / 24} 天前"
        else -> t.atZone(Dates.ZONE).toLocalDate().toString().replace('-', '/')
    }
}

fun formatDateTime(iso: String?): String {
    val t = iso?.let { runCatching { java.time.Instant.parse(it) }.getOrNull() } ?: return ""
    val z = t.atZone(Dates.ZONE)
    return "%d/%02d/%02d %02d:%02d".format(z.year, z.monthValue, z.dayOfMonth, z.hour, z.minute)
}
