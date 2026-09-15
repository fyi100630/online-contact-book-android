package com.rhythmbyte.contactbook.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContactBookEntry(
    val id: String = "default",
    @SerialName("class_title")
    val classTitle: String = "411班級聯絡簿",
    val announcement: String = "",
    val records: List<ItemRecord> = emptyList(),
    @SerialName("updated_at")
    val updatedAt: String? = null
)

@Serializable
data class ItemRecord(
    val id: String = "",
    val date: String = "",
    val category: String = "homework",
    val subject: String = "",
    val title: String = "",
    val details: String = "",
    val dueDate: String = "",
    val priority: String = "normal"
)

@Serializable
data class ContactBookLogEntry(
    val id: String = "",
    @SerialName("class_title")
    val classTitle: String = "",
    val announcement: String = "",
    val records: List<ItemRecord> = emptyList(),
    val summary: String? = "",
    @SerialName("editor_role")
    val editorRole: String? = "admin",
    @SerialName("created_at")
    val createdAt: String = ""
)

enum class UserRole {
    VISITOR,
    EDITOR,
    SUPER_ADMIN
}

enum class ItemCategory(val key: String, val title: String, val icon: String) {
    HOMEWORK("homework", "作業", "📝"),
    EXAM("exam", "考試／評量", "📋"),
    SUBMISSION("submission", "繳交項目", "📦"),
    REMINDER("reminder", "重要提醒", "🔔");

    companion object {
        fun fromKey(key: String): ItemCategory {
            return entries.find { it.key == key } ?: HOMEWORK
        }
    }
}
