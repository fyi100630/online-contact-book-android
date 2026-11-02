package com.rhythmbyte.contactbook.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.AppViewModel
import com.rhythmbyte.contactbook.BuildConfig
import com.rhythmbyte.contactbook.Screen
import com.rhythmbyte.contactbook.data.ApiException
import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.Dates
import com.rhythmbyte.contactbook.data.EntryInput
import com.rhythmbyte.contactbook.data.InstallStats
import com.rhythmbyte.contactbook.data.ManagedEntry
import com.rhythmbyte.contactbook.data.Priority
import com.rhythmbyte.contactbook.data.Role
import com.rhythmbyte.contactbook.data.SessionUser
import com.rhythmbyte.contactbook.data.TIMETABLE_CELL_MAX
import com.rhythmbyte.contactbook.data.TimetableData
import kotlinx.coroutines.launch
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberCanvasBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.rhythmbyte.contactbook.ui.liquid.LiquidButton
import com.rhythmbyte.contactbook.ui.liquid.LiquidToggle

// =====================================================================
// 後台外框：左側抽屜選單（和網頁版手機的側邊欄一樣）
// =====================================================================
@Composable
fun ManageShell(vm: AppViewModel, user: SessionUser, title: String, content: @Composable (openMenu: () -> Unit) -> Unit) {
    val c = Cb.c
    val drawer = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val go: (Screen) -> Unit = { s ->
        scope.launch { drawer.close() }
        if (vm.screen != s) vm.replace(s)
    }
    val openWeb: (String) -> Unit = { path ->
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(BuildConfig.BASE_URL + path)))
    }
    ModalNavigationDrawer(
        drawerState = drawer,
        drawerContent = {
            ModalDrawerSheet(drawerContainerColor = c.surface, drawerShape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp)) {
                Column(Modifier.fillMaxHeight().verticalScroll(rememberScrollState()).padding(horizontal = 12.dp, vertical = 16.dp)) {
                    Row(Modifier.padding(horizontal = 8.dp, vertical = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                        Box(Modifier.size(30.dp).clip(RoundedCornerShape(8.dp)).background(c.ink), contentAlignment = Alignment.Center) {
                            Icon(CbIcons.Book, null, tint = c.bg, modifier = Modifier.size(17.dp))
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(vm.board?.classTitle ?: "班級聯絡簿", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = c.ink)
                            Text("管理後台", fontSize = 12.sp, color = c.ink3)
                        }
                    }
                    if (!user.mustChangePassword) {
                        NavLabel("內容")
                        NavItem("事項", CbIcons.List, vm.screen == Screen.Entries) { go(Screen.Entries) }
                        if (user.role == Role.ADMIN) {
                            NavItem("公告", CbIcons.Megaphone, vm.screen == Screen.Announcement) { go(Screen.Announcement) }
                            NavItem("課表", CbIcons.Grid, vm.screen == Screen.Timetable) { go(Screen.Timetable) }
                            NavLabel("管理")
                            NavItem("App 安裝統計", CbIcons.Phone, vm.screen == Screen.InstallStats) { go(Screen.InstallStats) }
                            NavItem("帳號管理（網頁）", CbIcons.External, false) { openWeb("/manage/users") }
                            NavItem("修改紀錄（網頁）", CbIcons.External, false) { openWeb("/manage/activity") }
                            NavItem("垃圾桶（網頁）", CbIcons.External, false) { openWeb("/manage/trash") }
                            NavItem("備份與匯入（網頁）", CbIcons.External, false) { openWeb("/manage/data") }
                        }
                    }
                    NavLabel("個人")
                    NavItem("我的帳號", CbIcons.User, vm.screen == Screen.Account) { go(Screen.Account) }
                    NavItem("查看聯絡簿", CbIcons.Book, false) { scope.launch { drawer.close() }; vm.home() }
                    NavItem(if (vm.checkingUpdate) "檢查中…" else "檢查更新（v${BuildConfig.VERSION_NAME}）", CbIcons.Download, false) { vm.checkUpdate(manual = true) }
                    HorizontalDivider(Modifier.padding(vertical = 12.dp), color = c.line)
                    Column(Modifier.padding(horizontal = 12.dp)) {
                        Text(user.displayName, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = c.ink)
                        Text("${user.username}，${user.role.label}", fontSize = 12.sp, color = c.ink3)
                    }
                    NavItem("登出", CbIcons.Logout, false) { scope.launch { drawer.close() }; vm.logout() }
                }
            }
        },
    ) {
        Column(Modifier.fillMaxSize().background(c.bg)) {
            TopBar(title, onBack = null) {
                IconButton({ scope.launch { drawer.open() } }) { Icon(CbIcons.Menu, "開啟選單", tint = c.ink) }
            }
            Box(Modifier.weight(1f)) { content { scope.launch { drawer.open() } } }
        }
    }
}

@Composable
private fun NavLabel(text: String) {
    Text(text, Modifier.padding(start = 12.dp, top = 18.dp, bottom = 6.dp), fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Cb.c.ink3)
}

@Composable
private fun NavItem(text: String, icon: ImageVector, selected: Boolean, onClick: () -> Unit) {
    val c = Cb.c
    Row(
        Modifier.fillMaxWidth().heightIn(min = 46.dp).clip(RoundedCornerShape(10.dp))
            .background(if (selected) c.primarySoft else c.surface).clickable(onClick = onClick).padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, null, tint = if (selected) c.primary else c.ink2, modifier = Modifier.size(18.dp))
        Spacer(Modifier.width(12.dp))
        Text(text, fontSize = 15.sp, fontWeight = FontWeight.SemiBold, color = if (selected) c.primary else c.ink)
    }
}

// =====================================================================
// 事項列表
// =====================================================================
@Composable
fun EntriesScreen(vm: AppViewModel, refreshKey: Int) {
    val today = vm.board?.today ?: Dates.today()
    var entries by remember { mutableStateOf<List<ManagedEntry>?>(null) }
    var q by rememberSaveable { mutableStateOf("") }
    var category by rememberSaveable { mutableStateOf<Category?>(null) }
    var range by rememberSaveable { mutableStateOf(Range.RECENT) }

    LaunchedEffect(q, category, range, refreshKey) {
        if (q.isNotEmpty()) kotlinx.coroutines.delay(300)
        val (from, to) = when (range) {
            Range.RECENT -> Dates.addDays(today, -30) to Dates.addDays(today, 60)
            Range.PAST -> Dates.addDays(today, -90) to today
            Range.ALL -> "2000-01-01" to "2100-12-31"
        }
        try {
            entries = vm.api.entries(from, to, q, category)
        } catch (e: Exception) {
            vm.handle(e)
            if (entries == null) entries = emptyList()
        }
    }
    EntriesContent(
        entries, today, q, { q = it }, category, { category = it }, range, { range = it },
        onOpen = { vm.navigate(Screen.EditEntry(it)) },
    )
}

enum class Range(val label: String) { RECENT("近期"), PAST("過去三個月"), ALL("全部") }

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun EntriesContent(
    entries: List<ManagedEntry>?,
    today: String,
    q: String,
    onQ: (String) -> Unit,
    category: Category?,
    onCategory: (Category?) -> Unit,
    range: Range,
    onRange: (Range) -> Unit,
    onOpen: (ManagedEntry?) -> Unit,
) {
    val c = Cb.c
    val backdrop = rememberLayerBackdrop()
    Box(Modifier.fillMaxSize()) {
        LazyColumn(Modifier.fillMaxSize().layerBackdrop(backdrop).background(c.bg), contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 100.dp)) {
            item {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    CbTextField(q, onQ, placeholder = "搜尋內容、科目…", leading = CbIcons.Search, maxLength = 50)
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        FilterChip("所有類別", category == null, { onCategory(null) })
                        Category.entries.forEach { cat -> FilterChip(cat.short, category == cat, { onCategory(cat) }) }
                    }
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Range.entries.forEach { r -> FilterChip(r.label, range == r, { onRange(r) }) }
                    }
                    Spacer(Modifier.height(4.dp))
                }
            }
            when {
                entries == null -> item { CenterBox { Spinner() } }
                entries.isEmpty() -> item {
                    EmptyState("沒有符合的事項") { CbButton("新增第一筆", { onOpen(null) }, kind = BtnKind.Secondary, small = true, icon = CbIcons.Plus) }
                }
                else -> items(entries, key = { it.id }) { e -> ManagedRow(e, today) { onOpen(e) } }
            }
        }
        LiquidButton(
            { onOpen(null) }, backdrop,
            Modifier.align(Alignment.BottomEnd).navigationBarsPadding().padding(16.dp),
            tint = c.primary,
        ) {
            Icon(CbIcons.Plus, null, tint = Color.White, modifier = Modifier.size(20.dp))
            Text("新增事項", color = Color.White, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ManagedRow(e: ManagedEntry, today: String, onClick: () -> Unit) {
    val c = Cb.c
    val dl = Dates.deadline(e.dueDate, today, e.category)
    Column(Modifier.fillMaxWidth().clickable(onClick = onClick)) {
        Column(Modifier.padding(vertical = 12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(
                "${Dates.formatShort(e.entryDate)}（${Dates.WEEKDAYS[Dates.weekday(e.entryDate)]}）" + if (e.entryDate == today) "・今天登記" else "",
                fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = c.ink3,
            )
            Text(
                (if (e.subject.isNotBlank()) "［${e.subject}］" else "") + e.title,
                fontSize = 16.sp, fontWeight = FontWeight.SemiBold, color = c.ink, maxLines = 2, overflow = TextOverflow.Ellipsis,
            )
            FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(4.dp), itemVerticalAlignment = Alignment.CenterVertically) {
                Badge(e.category.short)
                if (e.priority == Priority.HIGH) Badge("重要", fg = c.red, bg = c.redSoft)
                if (dl != null) {
                    val red = dl.tone == Dates.Tone.TODAY || dl.tone == Dates.Tone.TOMORROW
                    Badge(dl.label, fg = if (red) c.red else if (dl.tone == Dates.Tone.PAST) c.ink3 else c.ink2, bg = if (red) c.redSoft else c.bg2)
                }
                Text(e.updatedByName ?: "系統", fontSize = 12.sp, color = c.ink3)
            }
        }
        HorizontalDivider(color = c.line)
    }
}

// =====================================================================
// 新增／編輯事項
// =====================================================================
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun EntryEditScreen(vm: AppViewModel, entry: ManagedEntry?, onDone: () -> Unit) {
    EntryEditor(
        entry = entry,
        today = vm.board?.today ?: Dates.today(),
        save = { input -> if (entry == null) vm.api.createEntry(input) else vm.api.updateEntry(entry.id, entry.version, input) },
        delete = { vm.api.deleteEntry(entry!!.id) },
        toast = vm::toast,
        onError = { vm.handle(it) },
        onBack = { vm.back() },
        onDone = onDone,
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun EntryEditor(
    entry: ManagedEntry?,
    today: String,
    save: suspend (EntryInput) -> Unit,
    delete: suspend () -> Unit,
    toast: (String, Boolean) -> Unit,
    onError: (Throwable) -> Unit,
    onBack: () -> Unit,
    onDone: () -> Unit,
) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    var entryDate by rememberSaveable { mutableStateOf(entry?.entryDate ?: today) }
    var category by rememberSaveable { mutableStateOf(entry?.category ?: Category.HOMEWORK) }
    var subject by rememberSaveable { mutableStateOf(entry?.subject ?: "") }
    var title by rememberSaveable { mutableStateOf(entry?.title ?: "") }
    var details by rememberSaveable { mutableStateOf(entry?.details ?: "") }
    var dueDate by rememberSaveable { mutableStateOf(entry?.dueDate ?: (if (entry == null) Dates.addDays(today, 1) else null)) }
    var important by rememberSaveable { mutableStateOf(entry?.priority == Priority.HIGH) }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    var picking by remember { mutableStateOf<String?>(null) }
    var confirmDelete by remember { mutableStateOf(false) }

    fun submit() {
        if (title.isBlank()) { error = "請輸入內容"; return }
        val due = dueDate
        if (due != null && due < entryDate) { error = "截止日不能早於登記日"; return }
        busy = true
        error = null
        val input = EntryInput(entryDate, category, subject.trim(), title.trim(), details.trim(), due, if (important) Priority.HIGH else Priority.NORMAL)
        scope.launch {
            try {
                save(input)
                toast(if (entry == null) "已新增" else "已儲存", false)
                onDone()
            } catch (e: ApiException) {
                if (e.status == 409) { toast(e.message ?: "", true); onDone() }
                else if (e.status == 400) error = e.message
                else onError(e)
            } finally {
                busy = false
            }
        }
    }

    Column(Modifier.fillMaxSize().background(c.bg)) {
        TopBar(if (entry == null) "新增事項" else "編輯事項", onBack = onBack)
        Column(
            Modifier.weight(1f).imePadding().verticalScroll(rememberScrollState()).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            error?.let { Alert(it) }
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                FieldLabel("類別")
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    Category.entries.forEach { cat ->
                        val sel = cat == category
                        Box(
                            Modifier.weight(1f).heightIn(min = 44.dp).clip(RoundedCornerShape(10.dp))
                                .background(if (sel) c.primarySoft else c.surface)
                                .border(1.dp, if (sel) c.primary else c.line2, RoundedCornerShape(10.dp))
                                .clickable { category = cat },
                            contentAlignment = Alignment.Center,
                        ) { Text(cat.short, color = if (sel) c.primary else c.ink, fontWeight = FontWeight.SemiBold, fontSize = 14.sp) }
                    }
                }
            }
            DateField("登記日期", entryDate) { picking = "entry" }
            CbTextField(subject, { subject = it }, label = "科目／單位", placeholder = "例如：數學", maxLength = 30)
            CbTextField(title, { title = it }, label = "內容", placeholder = "例如：習作 p.12～15", maxLength = 200, singleLine = false)
            CbTextField(details, { details = it }, label = "補充說明", hint = "範圍、注意事項等（選填）", maxLength = 2000, singleLine = false, minLines = 3)
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                DateField("截止日", dueDate) { picking = "due" }
                FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    listOf("明天" to Dates.addDays(entryDate, 1), "後天" to Dates.addDays(entryDate, 2), "一週後" to Dates.addDays(entryDate, 7), "不設定" to null)
                        .forEach { (label, v) -> FilterChip(label, dueDate == v, { dueDate = v }) }
                }
                Text("有截止日：每天都會顯示，直到截止日前一天。沒有：只在登記日當天顯示。", fontSize = 12.sp, color = c.ink3)
            }
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Text("標為重要（排在最前面）", Modifier.weight(1f), fontSize = 15.sp, color = c.ink)
                val bg = c.bg
                LiquidToggle({ important }, { important = it }, rememberCanvasBackdrop { drawRect(bg) })
            }
            if (entry != null) {
                Text("由 ${entry.createdByName ?: "—"} 建立；最後由 ${entry.updatedByName ?: "—"} 在 ${timeAgo(entry.updatedAt)}修改", fontSize = 12.sp, color = c.ink3)
            }
        }
        HorizontalDivider(color = c.line)
        Row(Modifier.fillMaxWidth().navigationBarsPadding().padding(horizontal = 16.dp, vertical = 10.dp), verticalAlignment = Alignment.CenterVertically) {
            if (entry != null) CbButton("刪除", { confirmDelete = true }, kind = BtnKind.Danger, enabled = !busy, icon = CbIcons.Trash)
            Spacer(Modifier.weight(1f))
            CbButton(if (busy) "儲存中…" else if (entry == null) "新增" else "儲存", ::submit, enabled = !busy)
        }
    }

    picking?.let { which ->
        DatePick(if (which == "entry") entryDate else dueDate ?: Dates.addDays(entryDate, 1), onPick = {
            if (which == "entry") entryDate = it else dueDate = it
        }, onDismiss = { picking = null })
    }
    if (confirmDelete && entry != null) {
        AlertDialog(
            onDismissRequest = { confirmDelete = false },
            title = { Text("刪除這個事項？") },
            text = { Text("「${entry.title}」會移到垃圾桶，管理員可以還原。") },
            confirmButton = {
                TextButton({
                    confirmDelete = false
                    busy = true
                    scope.launch {
                        try {
                            delete()
                            toast("已移到垃圾桶", false)
                            onDone()
                        } catch (e: Exception) {
                            onError(e)
                        } finally {
                            busy = false
                        }
                    }
                }) { Text("刪除", color = c.red) }
            },
            dismissButton = { TextButton({ confirmDelete = false }) { Text("取消", color = c.ink2) } },
            containerColor = c.surface,
        )
    }
}

@Composable
private fun DateField(label: String, value: String?, onClick: () -> Unit) {
    val c = Cb.c
    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
        FieldLabel(label)
        Row(
            Modifier.fillMaxWidth().heightIn(min = 52.dp).clip(RoundedCornerShape(10.dp)).border(1.dp, c.line2, RoundedCornerShape(10.dp))
                .background(c.surface).clickable(onClick = onClick).padding(horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(value?.let { Dates.formatLong(it) } ?: "不設定", Modifier.weight(1f), fontSize = 16.sp, color = if (value == null) c.ink3 else c.ink)
            Icon(CbIcons.Calendar, null, tint = c.ink3, modifier = Modifier.size(18.dp))
        }
    }
}

// =====================================================================
// 公告（管理員）
// =====================================================================
@Composable
fun AnnouncementScreen(vm: AppViewModel) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    var loaded by remember { mutableStateOf(false) }
    var classTitle by remember { mutableStateOf("") }
    var announcement by remember { mutableStateOf("") }
    var saved by remember { mutableStateOf<Pair<String, String>?>(null) }
    var updatedAt by remember { mutableStateOf<String?>(null) }
    var busy by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        try {
            val s = vm.api.settings()
            classTitle = s.classTitle; announcement = s.announcement; saved = s.classTitle to s.announcement; updatedAt = s.updatedAt
            loaded = true
        } catch (e: Exception) {
            vm.handle(e)
        }
    }
    if (!loaded) { CenterBox { Spinner() }; return }
    val dirty = saved != (classTitle to announcement)
    Column(Modifier.fillMaxSize().imePadding().verticalScroll(rememberScrollState()).padding(16.dp).navigationBarsPadding(), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("顯示在聯絡簿最上方，所有人都看得到", fontSize = 14.sp, color = c.ink3)
        CbTextField(classTitle, { classTitle = it }, label = "班級名稱", maxLength = 40)
        CbTextField(announcement, { announcement = it }, label = "公告內容", maxLength = 2000, singleLine = false, minLines = 6, hint = "${announcement.length} / 2000 字。網址會自動變成連結。留空就不顯示公告。")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(updatedAt?.let { "上次更新：${formatDateTime(it)}" } ?: "", Modifier.weight(1f), fontSize = 12.sp, color = c.ink3)
            CbButton(if (busy) "發布中…" else "發布", enabled = !busy && dirty && classTitle.isNotBlank(), onClick = {
                busy = true
                scope.launch {
                    try {
                        val s = vm.api.updateSettings(classTitle.trim(), announcement)
                        classTitle = s.classTitle; announcement = s.announcement; saved = s.classTitle to s.announcement; updatedAt = s.updatedAt
                        vm.toast("已發布")
                        vm.loadBoard(vm.board?.date, silent = true)
                    } catch (e: Exception) {
                        vm.handle(e)
                    } finally {
                        busy = false
                    }
                }
            })
        }
    }
}

// =====================================================================
// 課表（管理員）
// =====================================================================
@Composable
fun TimetableEditScreen(vm: AppViewModel) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    var saved by remember { mutableStateOf<TimetableData?>(null) }
    var draft by remember { mutableStateOf<List<List<String>>?>(null) }
    var missing by remember { mutableStateOf(false) }
    var day by rememberSaveable { mutableIntStateOf((Dates.weekday(Dates.today()) - 1).coerceIn(0, 4)) }
    var busy by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        try {
            val t = vm.api.timetable()
            saved = t; draft = t.schedule
        } catch (e: ApiException) {
            if (e.status == 404) missing = true else vm.handle(e)
        }
    }
    if (missing) { Box(Modifier.padding(16.dp)) { Alert("網站的資料庫還沒有課表。請管理員到 Supabase 執行 db/migrations/001_timetable_installations.sql。", danger = false) }; return }
    val d = draft ?: run { CenterBox { Spinner() }; return }
    val dirty = d != saved?.schedule
    Column(Modifier.fillMaxSize().imePadding().verticalScroll(rememberScrollState()).padding(16.dp).navigationBarsPadding(), verticalArrangement = Arrangement.spacedBy(14.dp)) {
        Text("聯絡簿首頁會顯示當天的課。空白＝那一節沒有課。", fontSize = 14.sp, color = c.ink3)
        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            for (i in 0 until 5) {
                val sel = i == day
                Box(
                    Modifier.weight(1f).heightIn(min = 44.dp).clip(RoundedCornerShape(10.dp))
                        .background(if (sel) c.primarySoft else c.surface)
                        .border(1.dp, if (sel) c.primary else c.line2, RoundedCornerShape(10.dp)).clickable { day = i },
                    contentAlignment = Alignment.Center,
                ) { Text("週${Dates.WEEKDAYS[i + 1]}", color = if (sel) c.primary else c.ink, fontWeight = FontWeight.SemiBold, fontSize = 14.sp) }
            }
        }
        d[day].forEachIndexed { p, cell ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("第 ${p + 1} 節", Modifier.width(64.dp), fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = c.ink2)
                CbTextField(cell, { v -> draft = d.mapIndexed { i, ps -> if (i == day) ps.mapIndexed { j, x -> if (j == p) v else x } else ps } }, Modifier.weight(1f), maxLength = TIMETABLE_CELL_MAX)
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(saved?.updatedAt?.let { "上次更新：${formatDateTime(it)}" } ?: "", Modifier.weight(1f), fontSize = 12.sp, color = c.ink3)
            if (dirty) CbButton("復原", { draft = saved?.schedule }, kind = BtnKind.Ghost)
            CbButton(if (busy) "儲存中…" else "儲存", enabled = !busy && dirty, onClick = {
                busy = true
                scope.launch {
                    try {
                        val t = vm.api.updateTimetable(d.map { ps -> ps.map { it.trim() } })
                        saved = t; draft = t.schedule
                        vm.toast("課表已更新")
                        vm.loadBoard(vm.board?.date, silent = true)
                    } catch (e: Exception) {
                        vm.handle(e)
                    } finally {
                        busy = false
                    }
                }
            })
        }
        Spacer(Modifier.height(8.dp))
        Text("整週預覽", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = c.ink)
        WeekTable(d, day + 1)
    }
}

// =====================================================================
// App 安裝統計（管理員）
// =====================================================================
@Composable
fun InstallStatsScreen(vm: AppViewModel) {
    var stats by remember { mutableStateOf<InstallStats?>(null) }
    var failed by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        try { stats = vm.api.installStats() } catch (e: Exception) { failed = true; vm.handle(e) }
    }
    InstallStatsContent(stats, failed)
}

@Composable
fun InstallStatsContent(stats: InstallStats?, failed: Boolean) {
    val c = Cb.c
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp).navigationBarsPadding(), verticalArrangement = Arrangement.spacedBy(14.dp)) {
        Text("App 每次開啟會回報一組隨機的安裝 ID 和版本號，不包含任何個人資料。", fontSize = 14.sp, color = c.ink3)
        if (stats == null) {
            if (failed) EmptyState("讀取失敗") else CenterBox { Spinner() }
            return@Column
        }
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Stat("${stats.total}", "安裝過的裝置", Modifier.weight(1f))
            Stat("${stats.active30d}", "30 天內有開過", Modifier.weight(1f))
        }
        Card {
            if (stats.versions.isEmpty()) {
                EmptyState("還沒有任何 App 回報")
            } else {
                Row { listOf("版本", "裝置數", "30 天內").forEach { Text(it, Modifier.weight(1f), fontSize = 12.sp, fontWeight = FontWeight.Bold, color = c.ink3) } }
                stats.versions.forEach { v ->
                    HorizontalDivider(color = c.line)
                    Row { listOf("v${v.version}", "${v.total}", "${v.active30d}").forEach { Text(it, Modifier.weight(1f), fontSize = 15.sp, color = c.ink) } }
                }
            }
        }
    }
}

@Composable
private fun Stat(num: String, label: String, modifier: Modifier) {
    val c = Cb.c
    Column(modifier.clip(RoundedCornerShape(10.dp)).border(1.dp, c.line, RoundedCornerShape(10.dp)).background(c.surface).padding(horizontal = 18.dp, vertical = 16.dp)) {
        Text(num, fontSize = 32.sp, lineHeight = 36.sp, fontWeight = FontWeight.ExtraBold, color = c.ink)
        Spacer(Modifier.height(4.dp))
        Text(label, fontSize = 13.sp, color = c.ink3)
    }
}
