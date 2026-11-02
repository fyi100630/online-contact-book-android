package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.data.Dates

/** 底欄 2「課表」：整週課表，今天是星期幾就把那一天反白 */
@Composable
fun TimetableTab(timetable: List<List<String>>?, today: String?, updatedAt: String?, canEdit: Boolean, onEdit: () -> Unit) {
    val c = Cb.c
    val wd = today?.let { Dates.weekday(it) } ?: 0
    val highlight = if (wd in 1..5) wd else 0
    Column(
        Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 130.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(Modifier.weight(1f)) {
                Text("課表", Modifier.semantics { heading() }, fontSize = 26.sp, fontWeight = FontWeight.ExtraBold, color = c.ink)
                Text(
                    when {
                        today == null -> ""
                        highlight != 0 -> "今天是週${Dates.WEEKDAYS[wd]}"
                        else -> "今天是週${Dates.WEEKDAYS[wd]}，沒有課"
                    },
                    fontSize = 14.sp, color = c.ink3,
                )
            }
            if (canEdit) CbButton("編輯", onEdit, kind = BtnKind.Secondary, small = true)
        }
        if (timetable == null) {
            EmptyState("還沒有課表", "請管理員在「我的」→「編輯課表」設定")
        } else {
            Column(Modifier.padding(top = 16.dp)) { WeekTable(timetable, highlight, rowHeight = 52.dp, fontSize = 15.sp) }
            if (updatedAt != null) Text("上次更新：${formatDateTime(updatedAt)}", Modifier.padding(top = 12.dp), fontSize = 12.sp, color = c.ink3)
        }
    }
}
