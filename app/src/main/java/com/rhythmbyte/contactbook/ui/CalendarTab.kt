package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.CalendarState
import com.rhythmbyte.contactbook.data.CalendarData
import com.rhythmbyte.contactbook.data.CalendarDay
import com.rhythmbyte.contactbook.data.Dates
import kotlinx.coroutines.launch

/** 列表裡的一列：月份標題、週次標題、或有事情的一天 */
sealed interface CalItem {
    val key: String

    data class Month(val year: Int, val month: Int) : CalItem { override val key get() = "m-$year-$month" }
    data class Week(val n: Int, val range: String, val isCurrent: Boolean) : CalItem { override val key get() = "w-$n" }
    data class Day(val day: CalendarDay, val isToday: Boolean, val isPast: Boolean) : CalItem { override val key get() = "d-${day.date}" }
}

/**
 * 把校曆整理成列表：只列出有事情的日子（放假、考試、活動），再加上今天（就算今天沒事也會列出來，方便對照）。
 * 放假但沒有名稱的日子（連假的週末）不列出。
 */
fun buildCalendarItems(data: CalendarData, today: String): List<CalItem> {
    val byDate = data.days.associateBy { it.date }.toMutableMap()
    val last = Dates.addDays(data.firstDay, data.weeks * 7L - 1)
    if (today >= data.firstDay && today <= last && today !in byDate) byDate[today] = CalendarDay(today)
    val out = mutableListOf<CalItem>()
    var lastMonth = -1
    var lastWeek = -1
    val currentWeek = if (today >= data.firstDay && today <= last) (Dates.daysBetween(data.firstDay, today) / 7).toInt() + 1 else -1
    for (d in byDate.values.sortedBy { it.date }) {
        val shown = d.date == today || d.label.isNotBlank() || d.events.isNotEmpty()
        if (!shown) continue
        val date = Dates.parse(d.date)
        val week = (Dates.daysBetween(data.firstDay, d.date) / 7).toInt() + 1
        if (date.monthValue != lastMonth) {
            out += CalItem.Month(date.year, date.monthValue)
            lastMonth = date.monthValue
        }
        if (week != lastWeek) {
            val start = Dates.addDays(data.firstDay, (week - 1) * 7L)
            out += CalItem.Week(week, "${Dates.formatShort(start)}～${Dates.formatShort(Dates.addDays(start, 6))}", week == currentWeek)
            lastWeek = week
        }
        out += CalItem.Day(d, isToday = d.date == today, isPast = d.date < today)
    }
    return out
}

/** 底欄 3「行事曆」：學校公告的學期校曆 */
@Composable
fun CalendarTab(state: CalendarState, today: String, onRetry: () -> Unit) {
    val c = Cb.c
    when (state) {
        CalendarState.Loading -> CenterBox(Modifier.fillMaxSize()) { Spinner() }
        is CalendarState.Failed -> Column(
            Modifier.fillMaxSize().padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text("行事曆暫時無法載入", fontWeight = FontWeight.Bold, fontSize = 17.sp, color = c.ink)
            Text(state.message, Modifier.padding(vertical = 8.dp), color = c.ink3, fontSize = 14.sp, textAlign = TextAlign.Center)
            CbButton("再試一次", onRetry, kind = BtnKind.Secondary)
        }
        is CalendarState.Ready -> CalendarList(state.data, today)
    }
}

@Composable
private fun CalendarList(data: CalendarData, today: String) {
    val c = Cb.c
    val items = remember(data, today) { buildCalendarItems(data, today) }
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    // 目標：今天所在那一週的標題（沒有就找下一個有事的日子）。
    // 如果那一週剛好是月份的開頭，連月份標題一起顯示。LazyColumn 最前面還有一個標題項目，所以要 +1。
    val target = remember(items) {
        val todayIdx = items.indexOfFirst { it is CalItem.Day && it.isToday }
        val weekIdx = items.indexOfFirst { it is CalItem.Week && it.isCurrent }
        val idx = when {
            weekIdx >= 0 -> weekIdx
            todayIdx >= 0 -> todayIdx
            else -> items.indexOfFirst { it is CalItem.Day && !it.isPast }.let { i -> if (i >= 0) i else 0 }
        }
        val withMonth = if (idx > 0 && items[idx - 1] is CalItem.Month) idx - 1 else idx
        withMonth + 1
    }
    LaunchedEffect(items) { listState.scrollToItem(target) }

    LazyColumn(
        Modifier.fillMaxSize(),
        state = listState,
        // 上方的空白放在第一個項目裡，捲到今天時才不會露出上一列的一小截
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 130.dp),
    ) {
        item(key = "head") {
            Row(Modifier.padding(top = 20.dp), verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1f)) {
                    Text("行事曆", Modifier.semantics { heading() }, fontSize = 26.sp, fontWeight = FontWeight.ExtraBold, color = c.ink)
                    Text(data.title, fontSize = 14.sp, color = c.ink3)
                }
                CbButton("今天", { scope.launch { listState.animateScrollToItem(target) } }, kind = BtnKind.Secondary, small = true)
            }
            Spacer(Modifier.height(8.dp))
        }
        items(items, key = { it.key }) { item ->
            when (item) {
                is CalItem.Month -> MonthHead(item)
                is CalItem.Week -> WeekHead(item)
                is CalItem.Day -> DayRow(item)
            }
        }
        item(key = "foot") {
            Column(Modifier.padding(top = 24.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text("資料來自學校公告的校曆（${data.published.replace('-', '/')} 版），活動可能臨時調整，以學校公告為準。新學期要更新 App 才會換成新的校曆。", fontSize = 12.sp, color = c.ink3, lineHeight = 18.sp)
                if (data.source.isNotBlank()) Text(linkify(data.source), fontSize = 12.sp)
            }
        }
    }
}

@Composable
private fun MonthHead(m: CalItem.Month) {
    val c = Cb.c
    Text(
        "${m.year} 年 ${m.month} 月",
        Modifier.padding(top = 22.dp, bottom = 4.dp).semantics { heading() },
        fontSize = 17.sp, fontWeight = FontWeight.ExtraBold, color = c.ink,
    )
}

@Composable
private fun WeekHead(w: CalItem.Week) {
    val c = Cb.c
    Row(Modifier.fillMaxWidth().padding(top = 10.dp, bottom = 2.dp), verticalAlignment = Alignment.CenterVertically) {
        Text("第 ${w.n} 週", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = if (w.isCurrent) c.primary else c.ink3)
        Text("  ${w.range}", fontSize = 12.sp, color = c.ink3)
        if (w.isCurrent) {
            Spacer(Modifier.width(8.dp))
            Badge("本週", fg = c.primary, bg = c.primarySoft)
        }
    }
    HorizontalDivider(color = c.line)
}

@Composable
private fun DayRow(item: CalItem.Day) {
    val c = Cb.c
    val d = item.day
    val date = Dates.parse(d.date)
    val textColor = if (item.isPast) c.ink3 else c.ink
    val none = d.label.isBlank() && d.events.isEmpty()
    Column {
        Row(
            Modifier
                .fillMaxWidth()
                .then(if (item.isToday) Modifier.clip(RoundedCornerShape(10.dp)).background(c.primarySoft) else Modifier)
                .padding(vertical = 10.dp, horizontal = if (item.isToday) 8.dp else 0.dp)
                .semantics(mergeDescendants = true) { contentDescription = "${Dates.formatLong(d.date)}${if (item.isToday) "，今天" else ""}" },
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Column(Modifier.width(44.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "${date.dayOfMonth}", fontSize = 22.sp, lineHeight = 26.sp, fontWeight = FontWeight.ExtraBold,
                    color = if (item.isToday) c.primary else textColor,
                )
                val wd = Dates.weekday(d.date)
                Text("週${Dates.WEEKDAYS[wd]}", fontSize = 12.sp, color = if (item.isToday) c.primary else c.ink3, fontWeight = FontWeight.SemiBold)
            }
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(5.dp)) {
                if (item.isToday || d.kind != "normal" || d.label.isNotBlank()) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        if (item.isToday) Badge("今天", fg = c.onPrimary, bg = c.primary)
                        when (d.kind) {
                            "holiday" -> Badge("放假")
                            "exam" -> Badge("考試", fg = c.primary, bg = c.primarySoft)
                        }
                        if (d.label.isNotBlank()) Text(d.label, fontSize = 16.sp, fontWeight = FontWeight.ExtraBold, color = textColor)
                    }
                }
                if (none) Text("沒有登記行事", fontSize = 14.sp, color = c.ink3)
                d.events.forEach { e ->
                    Text(e, fontSize = 15.sp, lineHeight = 21.sp, fontWeight = FontWeight.Medium, color = if (item.isPast) c.ink3 else c.ink2)
                }
            }
        }
        if (!item.isToday) HorizontalDivider(color = c.line)
    }
}
