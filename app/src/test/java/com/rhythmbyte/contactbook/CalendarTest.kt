package com.rhythmbyte.contactbook

import com.rhythmbyte.contactbook.data.CalendarData
import com.rhythmbyte.contactbook.data.Dates
import com.rhythmbyte.contactbook.ui.CalItem
import com.rhythmbyte.contactbook.ui.buildCalendarItems
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class CalendarTest {
    private val data: CalendarData = Json { ignoreUnknownKeys = true }.decodeFromString(
        CalendarData.serializer(),
        javaClass.getResourceAsStream("/calendar-115-1.json")!!.readBytes().decodeToString(),
    )

    @Test fun realCalendarIsConsistent() {
        assertEquals("2026-08-30", data.firstDay)
        assertEquals(0, Dates.weekday(data.firstDay)) // 第 1 週從星期日開始
        assertEquals(21, data.weeks)
        val end = Dates.addDays(data.firstDay, data.weeks * 7L - 1)
        for (d in data.days) {
            assertTrue(d.date, d.date >= data.firstDay && d.date <= end)
            assertTrue(d.kind, d.kind in setOf("normal", "holiday", "exam"))
        }
        assertEquals(data.days.size, data.days.map { it.date }.toSet().size)
        // 幾個一定要有的日子
        val by = data.days.associateBy { it.date }
        assertEquals("中秋節", by["2026-09-25"]?.label)
        assertEquals("光復節", by["2026-10-25"]?.label)
        assertEquals("exam", by["2026-10-20"]?.kind)
        assertTrue(by["2026-08-31"]!!.events.first().contains("開學"))
    }

    @Test fun listIsGroupedByMonthAndWeek() {
        val items = buildCalendarItems(data, "2026-11-02")
        // 今天（第 10 週）有事，被標成本週
        val week = items.filterIsInstance<CalItem.Week>().single { it.isCurrent }
        assertEquals(10, week.n)
        val today = items.filterIsInstance<CalItem.Day>().single { it.isToday }
        assertEquals("2026-11-02", today.day.date)
        // 每一天前面都有它的月份和週次標題；日期遞增
        val days = items.filterIsInstance<CalItem.Day>().map { it.day.date }
        assertEquals(days.sorted(), days)
        assertEquals(CalItem.Month::class, items.first()::class)
        // 沒有名稱、也沒有事情的放假日（連假的週末）不列出
        assertFalse(days.contains("2026-09-26"))
        // 過去的日子標成過去
        assertTrue(items.filterIsInstance<CalItem.Day>().first { it.day.date == "2026-10-20" }.isPast)
    }

    @Test fun todayIsShownEvenWithoutEvents() {
        val items = buildCalendarItems(data, "2026-11-05")
        val today = items.filterIsInstance<CalItem.Day>().single { it.isToday }
        assertTrue(today.day.events.isEmpty())
        assertNotNull(items.filterIsInstance<CalItem.Week>().singleOrNull { it.isCurrent })
    }

    @Test fun outsideTheSemesterNothingIsCurrent() {
        val items = buildCalendarItems(data, "2027-03-01")
        assertTrue(items.filterIsInstance<CalItem.Week>().none { it.isCurrent })
        assertTrue(items.filterIsInstance<CalItem.Day>().none { it.isToday })
    }
}
