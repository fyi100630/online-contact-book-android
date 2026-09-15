package com.rhythmbyte.contactbook.data.repository

import com.rhythmbyte.contactbook.data.model.ContactBookEntry
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.query.Order
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.realtime.channel
import io.github.jan.supabase.realtime.postgresChangeFlow
import io.github.jan.supabase.realtime.PostgresAction
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import java.time.Instant

class SupabaseRepository {

    companion object {
        const val SUPABASE_URL = "https://bcddawmffqadxevuwegf.supabase.co"
        const val SUPABASE_ANON_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImJjZGRhd21mZnFhZHhldnV3ZWdmIiwicm9sZSI6ImFub24iLCJpYXQiOjE3ODg5NTIxOTEsImV4cCI6MjEwNDUyODE5MX0.heTNO_inKi9FUWPCQUFZji11MFh_m6dPELYckDW1mwc"
        
        const val DEFAULT_EDITOR_PASSWORD = "6830"
        const val DEFAULT_ADMIN_PASSWORD = "180156"
        const val ROW_ID = "default"

        val appJson = Json {
            encodeDefaults = true
            ignoreUnknownKeys = true
            isLenient = true
            coerceInputValues = true
        }
    }

    val supabase: SupabaseClient = createSupabaseClient(
        supabaseUrl = SUPABASE_URL,
        supabaseKey = SUPABASE_ANON_KEY
    ) {
        install(Postgrest)
        install(Realtime)
    }

    suspend fun fetchContactBook(): Result<ContactBookEntry> {
        return runCatching {
            val result = supabase.from("contact_book").select {
                filter {
                    eq("id", ROW_ID)
                }
            }.decodeSingle<ContactBookEntry>()
            result
        }
    }

    suspend fun updateContactBook(entry: ContactBookEntry): Result<Unit> {
        return runCatching {
            val nowIso = Instant.now().toString()
            val jsonElement = appJson.encodeToJsonElement(entry.records)
            supabase.from("contact_book").update(
                {
                    set("class_title", entry.classTitle)
                    set("announcement", entry.announcement)
                    set("records", jsonElement)
                    set("updated_at", nowIso)
                }
            ) {
                filter {
                    eq("id", ROW_ID)
                }
            }

            try {
                val hwCount = entry.records.count { it.category == "homework" }
                val examCount = entry.records.count { it.category == "exam" }
                val subCount = entry.records.count { it.category == "submission" }
                val remCount = entry.records.count { it.category == "reminder" }
                val autoSummary = "作業 ${hwCount} 筆、考試 ${examCount} 筆、繳交 ${subCount} 筆、提醒 ${remCount} 筆"

                supabase.from("contact_book_logs").insert(
                    buildJsonObject {
                        put("class_title", entry.classTitle)
                        put("announcement", entry.announcement)
                        put("records", jsonElement)
                        put("summary", autoSummary)
                        put("editor_role", "admin")
                        put("created_at", nowIso)
                    }
                )
            } catch (_: Exception) {}
        }
    }

    fun subscribeRealtime(scope: CoroutineScope, onChange: () -> Unit) {
        scope.launch {
            try {
                val channel = supabase.channel("realtime_contact_book")
                val changeFlow = channel.postgresChangeFlow<PostgresAction>(schema = "public") {
                    table = "contact_book"
                }
                changeFlow.onEach {
                    onChange()
                }.launchIn(scope)

                channel.subscribe()
            } catch (e: Exception) {
                // Realtime listener fallback
            }
        }
    }

    suspend fun fetchHistoryLogs(): Result<List<ContactBookLogEntry>> {
        return runCatching {
            supabase.from("contact_book_logs").select {
                order("created_at", Order.DESCENDING)
                limit(50)
            }.decodeList<ContactBookLogEntry>()
        }
    }

    suspend fun restoreFromLog(log: ContactBookLogEntry): Result<Unit> {
        return runCatching {
            val nowIso = Instant.now().toString()
            val jsonElement = appJson.encodeToJsonElement(log.records)
            supabase.from("contact_book").update(
                {
                    set("class_title", log.classTitle)
                    set("announcement", log.announcement)
                    set("records", jsonElement)
                    set("updated_at", nowIso)
                }
            ) {
                filter {
                    eq("id", ROW_ID)
                }
            }
        }
    }
}
