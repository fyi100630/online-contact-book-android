package com.rhythmbyte.contactbook.data

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.ZoneId
import java.time.temporal.ChronoUnit

/**
 * 日期規則：和網頁版 src/lib/shared/dates.ts 完全一樣。
 * 一律用台北時間，日期用 "YYYY-MM-DD" 字串，不轉成帶時區的時間。
 */
object Dates {
    val ZONE: ZoneId = ZoneId.of("Asia/Taipei")
    val WEEKDAYS = listOf("日", "一", "二", "三", "四", "五", "六")

    fun today(): String = LocalDate.now(ZONE).toString()
    fun parse(s: String): LocalDate = LocalDate.parse(s)
    fun addDays(s: String, n: Long): String = parse(s).plusDays(n).toString()
    fun daysBetween(from: String, to: String): Long = ChronoUnit.DAYS.between(parse(from), parse(to))

    /** 0 = 週日 … 6 = 週六（和 JavaScript 的 getDay() 一樣） */
    fun weekday(s: String): Int = parse(s).dayOfWeek.value % 7

    fun startOfWeek(s: String): String = parse(s).with(DayOfWeek.MONDAY).toString()

    fun formatShort(s: String): String = parse(s).let { "${it.monthValue}/${it.dayOfMonth}" }
    fun formatLong(s: String): String = parse(s).let { "${it.monthValue} 月 ${it.dayOfMonth} 日（${WEEKDAYS[weekday(s)]}）" }

    fun isValid(s: String): Boolean = runCatching { parse(s).year in 2000..2100 }.getOrDefault(false) && Regex("""\d{4}-\d{2}-\d{2}""").matches(s)

    /**
     * 事項在某一天是否顯示：
     *  - 有截止日：從登記日起，一直顯示到截止日「前一天」
     *  - 沒有截止日：只在登記日當天顯示
     */
    fun isActiveOn(entryDate: String, dueDate: String?, day: String): Boolean =
        if (dueDate != null) day >= entryDate && day < dueDate else day == entryDate

    enum class Tone { TODAY, TOMORROW, SOON, LATER, PAST }
    data class Deadline(val tone: Tone, val label: String, val days: Long)

    private fun verb(category: Category?): String = when (category) {
        Category.EXAM -> "考"
        Category.HOMEWORK, Category.SUBMISSION -> "交"
        else -> "截止"
    }

    /** 截止日的口語說法：「明天交」「週三考」「11/20 交」「11/4 已過」 */
    fun deadline(dueDate: String?, day: String, category: Category?): Deadline? {
        if (dueDate == null) return null
        val days = daysBetween(day, dueDate)
        val v = verb(category)
        return when {
            days < 0 -> Deadline(Tone.PAST, "${formatShort(dueDate)} 已${if (v == "截止") "截止" else "過"}", days)
            days == 0L -> Deadline(Tone.TODAY, "今天$v", days)
            days == 1L -> Deadline(Tone.TOMORROW, "明天$v", days)
            days <= 6 -> Deadline(if (days <= 3) Tone.SOON else Tone.LATER, "週${WEEKDAYS[weekday(dueDate)]}$v", days)
            else -> Deadline(Tone.LATER, "${formatShort(dueDate)} $v", days)
        }
    }

    /** 首頁大日期旁邊的小標籤 */
    fun relativeLabel(today: String, date: String): String {
        val off = daysBetween(today, date)
        return when {
            off == 0L -> "今天"
            off == 1L -> "明天"
            off == -1L -> "昨天"
            off > 0 -> "$off 天後"
            else -> "${-off} 天前"
        }
    }

    /** 某天的課；週末回傳 null */
    fun classesOn(timetable: List<List<String>>?, day: String): List<String>? {
        val wd = weekday(day)
        if (timetable == null || wd !in 1..5) return null
        return timetable.getOrNull(wd - 1)
    }
}
