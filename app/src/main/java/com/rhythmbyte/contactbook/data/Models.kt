package com.rhythmbyte.contactbook.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// 和網頁版 src/lib/shared/types.ts 一一對應。日期一律是 "YYYY-MM-DD" 字串。

@Serializable
enum class Category(val label: String, val short: String) {
    @SerialName("homework") HOMEWORK("作業", "作業"),
    @SerialName("exam") EXAM("考試、評量", "考試"),
    @SerialName("submission") SUBMISSION("繳交", "繳交"),
    @SerialName("reminder") REMINDER("提醒", "提醒"),
}

@Serializable
enum class Priority { @SerialName("normal") NORMAL, @SerialName("high") HIGH }

@Serializable
enum class Role(val label: String) {
    @SerialName("admin") ADMIN("管理員"),
    @SerialName("editor") EDITOR("幹部與小老師"),
}

@Serializable
data class PublicEntry(
    val id: String,
    val entryDate: String,
    val category: Category,
    val subject: String = "",
    val title: String,
    val details: String = "",
    val dueDate: String? = null,
    val priority: Priority = Priority.NORMAL,
)

@Serializable
data class ManagedEntry(
    val id: String,
    val entryDate: String,
    val category: Category,
    val subject: String = "",
    val title: String,
    val details: String = "",
    val dueDate: String? = null,
    val priority: Priority = Priority.NORMAL,
    val version: Int,
    val createdAt: String,
    val createdByName: String? = null,
    val updatedAt: String,
    val updatedByName: String? = null,
)

@Serializable
data class EntryInput(
    val entryDate: String,
    val category: Category,
    val subject: String,
    val title: String,
    val details: String,
    val dueDate: String?,
    val priority: Priority,
)

@Serializable
data class WeekDay(val date: String, val count: Int)

@Serializable
data class BoardData(
    val classTitle: String,
    val announcement: String,
    val announcementUpdatedAt: String? = null,
    val today: String,
    val date: String,
    val entries: List<PublicEntry>,
    val week: List<WeekDay>,
    /** schedule[0] = 週一，schedule[0][0] = 週一第 1 節；舊版網站沒有這個欄位 */
    val timetable: List<List<String>>? = null,
    val version: String,
)

@Serializable
data class SessionUser(
    val id: String,
    val username: String,
    val displayName: String,
    val role: Role,
    val mustChangePassword: Boolean,
)

@Serializable
data class Settings(val classTitle: String, val announcement: String, val updatedAt: String? = null)

@Serializable
data class TimetableData(val schedule: List<List<String>>, val updatedAt: String? = null, val updatedByName: String? = null)

@Serializable
data class VersionCount(val version: String, val total: Int, val active30d: Int)

@Serializable
data class InstallStats(val total: Int, val active30d: Int, val versions: List<VersionCount>)

const val TIMETABLE_DAYS = 5
const val TIMETABLE_PERIODS = 10
const val TIMETABLE_CELL_MAX = 10
