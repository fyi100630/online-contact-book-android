package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.data.BoardData
import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.Dates
import com.rhythmbyte.contactbook.data.Priority
import com.rhythmbyte.contactbook.data.PublicEntry
import com.rhythmbyte.contactbook.data.TIMETABLE_PERIODS

/** 底欄 1「聯絡簿」：日期、週曆、公告，下面是這一天所有類別的事項（作業、考試、繳交、提醒） */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoardTab(
    board: BoardData?,
    loading: Boolean,
    error: String?,
    onPick: (String) -> Unit,
    onRefresh: () -> Unit,
    onEntry: ((PublicEntry, Offset) -> Unit)?,
) {
    val c = Cb.c
    var showDate by remember { mutableStateOf(false) }
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
        return
    }
    PullToRefreshBox(isRefreshing = loading, onRefresh = onRefresh, modifier = Modifier.fillMaxSize()) {
        val groups = Category.entries.map { cat -> cat to board.entries.filter { it.category == cat } }.filter { it.second.isNotEmpty() }
        LazyColumn(
            Modifier.fillMaxSize(),
            // 底部留空間給玻璃分頁列
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 130.dp),
        ) {
            item(key = "hero") { Hero(board, onToday = { onPick(board.today) }, onPickDate = { showDate = true }) }
            item(key = "week") { WeekStrip(board, onPick) }
            if (board.announcement.isNotBlank()) {
                item(key = "notice") { Notice(board) }
            }
            if (groups.isEmpty()) {
                item(key = "empty") { EmptyState("這天沒有登記事項", "用上面的週曆看看其他天") }
            }
            groups.forEach { (cat, list) ->
                item(key = "h-$cat") { SheetHead(cat.label, list.size) }
                items(list, key = { it.id }) { e -> EntryRow(e, board.date, onEntry?.let { f -> { center: Offset -> f(e, center) } }) }
            }
        }
    }
    if (showDate) DatePick(board.date, onPick = onPick, onDismiss = { showDate = false })
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

/**
 * 整週課表表格。highlight 是要反白的星期（1=週一…5=週五，0＝都不反白）。
 * 課表分頁用大的列高，後台編輯預覽用小的。
 */
@Composable
fun WeekTable(
    timetable: List<List<String>>,
    highlight: Int,
    rowHeight: androidx.compose.ui.unit.Dp = 36.dp,
    fontSize: androidx.compose.ui.unit.TextUnit = 14.sp,
) {
    val c = Cb.c
    val ink = c.ink
    Column {
        Row(Modifier.fillMaxWidth().drawBehind {
            drawLine(ink, Offset(0f, size.height), Offset(size.width, size.height), 2.dp.toPx())
        }) {
            Box(Modifier.width(32.dp).heightIn(min = 40.dp), contentAlignment = Alignment.Center) {
                Text("節", fontSize = 12.sp, color = c.ink3, fontWeight = FontWeight.SemiBold)
            }
            for (d in 1..5) {
                val on = d == highlight
                Box(
                    Modifier.weight(1f).heightIn(min = 40.dp).background(if (on) c.primarySoft else c.bg),
                    contentAlignment = Alignment.Center,
                ) {
                    Text("週${Dates.WEEKDAYS[d]}", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = if (on) c.primary else c.ink3)
                }
            }
        }
        for (p in 0 until TIMETABLE_PERIODS) {
            Row(Modifier.fillMaxWidth().heightIn(min = rowHeight), verticalAlignment = Alignment.CenterVertically) {
                Text("${p + 1}", Modifier.width(32.dp), fontSize = 12.sp, color = c.ink3, textAlign = TextAlign.Center, fontWeight = FontWeight.SemiBold)
                for (d in 0 until 5) {
                    val on = d + 1 == highlight
                    Box(
                        Modifier.weight(1f).heightIn(min = rowHeight).background(if (on) c.primarySoft else c.bg).padding(horizontal = 2.dp, vertical = 6.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            timetable.getOrNull(d)?.getOrNull(p).orEmpty(),
                            fontSize = fontSize, lineHeight = fontSize * 1.25f, fontWeight = FontWeight.SemiBold,
                            color = if (on) c.primary else c.ink, textAlign = TextAlign.Center,
                        )
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
