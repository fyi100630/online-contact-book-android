package com.rhythmbyte.contactbook.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.rhythmbyte.contactbook.data.datastore.AuthPreferences
import com.rhythmbyte.contactbook.data.model.ContactBookEntry
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry
import com.rhythmbyte.contactbook.data.model.ItemCategory
import com.rhythmbyte.contactbook.data.model.ItemRecord
import com.rhythmbyte.contactbook.data.model.UserRole
import com.rhythmbyte.contactbook.BuildConfig
import com.rhythmbyte.contactbook.data.repository.InstallStats
import com.rhythmbyte.contactbook.data.repository.SupabaseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

data class ContactBookUiState(
    val classTitle: String = "411班級聯絡簿",
    val announcement: String = "",
    val allRecords: List<ItemRecord> = emptyList(),
    val selectedDate: String = "",
    val todayDate: String = "",
    val tomorrowDate: String = "",
    val userRole: UserRole = UserRole.VISITOR,
    val isLoading: Boolean = true,
    val isRealtimeConnected: Boolean = false,
    val errorMessage: String? = null,
    val toastMessage: String? = null,
    val logsList: List<ContactBookLogEntry> = emptyList(),
    val isLoadingLogs: Boolean = false,
    val installStats: InstallStats? = null,
    val isLoadingStats: Boolean = false
)

class ContactBookViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = SupabaseRepository()
    private val authPreferences = AuthPreferences(application)

    private val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    private val _uiState = MutableStateFlow(
        ContactBookUiState(
            selectedDate = LocalDate.now().format(dateFormatter),
            todayDate = LocalDate.now().format(dateFormatter),
            tomorrowDate = LocalDate.now().plusDays(1).format(dateFormatter)
        )
    )
    val uiState: StateFlow<ContactBookUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            authPreferences.userRoleFlow.collect { savedRole ->
                _uiState.value = _uiState.value.copy(userRole = savedRole)
            }
        }

        // 啟動匿名安裝統計回報 (極簡簽到)
        viewModelScope.launch {
            try {
                val installId = authPreferences.getOrCreateInstallId()
                repository.reportInstallation(installId, BuildConfig.VERSION_NAME)
            } catch (_: Exception) {}
        }

        loadLatestData()
        setupRealtimeSubscription()
    }

    fun loadLatestData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, errorMessage = null)
            val result = repository.fetchContactBook()
            result.onSuccess { entry ->
                _uiState.value = _uiState.value.copy(
                    classTitle = entry.classTitle,
                    announcement = entry.announcement,
                    allRecords = entry.records,
                    isLoading = false,
                    isRealtimeConnected = true,
                    errorMessage = null
                )
            }.onFailure { error ->
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    isRealtimeConnected = false,
                    errorMessage = "無法連線至雲端資料庫：${error.localizedMessage ?: "網路異常"}"
                )
            }
        }
    }

    private fun setupRealtimeSubscription() {
        try {
            repository.subscribeRealtime(viewModelScope) {
                loadLatestData()
            }
        } catch (e: Exception) {
            // Realtime listener fallback
        }
    }

    fun setSelectedDate(date: String) {
        _uiState.value = _uiState.value.copy(selectedDate = date)
    }

    fun unlockWithPassword(password: String): Boolean {
        val trimmed = password.trim()
        val role = when (trimmed) {
            SupabaseRepository.DEFAULT_ADMIN_PASSWORD -> UserRole.SUPER_ADMIN
            SupabaseRepository.DEFAULT_EDITOR_PASSWORD -> UserRole.EDITOR
            else -> null
        }

        return if (role != null) {
            viewModelScope.launch {
                authPreferences.saveUserRole(role)
                _uiState.value = _uiState.value.copy(
                    userRole = role,
                    toastMessage = if (role == UserRole.SUPER_ADMIN) "👑 已登入管理員模式（身分已記住）" else "✏️ 已登入編輯模式（身分已記住）"
                )
            }
            true
        } else {
            false
        }
    }

    fun logout() {
        viewModelScope.launch {
            authPreferences.clearUserRole()
            _uiState.value = _uiState.value.copy(
                userRole = UserRole.VISITOR,
                toastMessage = "🚪 已登出回到訪客檢視"
            )
        }
    }

    fun saveOrUpdateItem(item: ItemRecord) {
        val currentRecords = _uiState.value.allRecords.toMutableList()
        val index = currentRecords.indexOfFirst { it.id == item.id }
        if (index >= 0) {
            currentRecords[index] = item
        } else {
            currentRecords.add(0, item)
        }

        publishRecords(currentRecords)
    }

    fun deleteItem(itemId: String) {
        val currentRecords = _uiState.value.allRecords.filter { it.id != itemId }
        publishRecords(currentRecords)
    }

    fun updateAnnouncement(newAnnouncement: String) {
        viewModelScope.launch {
            val current = _uiState.value
            val entry = ContactBookEntry(
                id = SupabaseRepository.ROW_ID,
                classTitle = current.classTitle,
                announcement = newAnnouncement,
                records = current.allRecords
            )
            repository.updateContactBook(entry).onSuccess {
                _uiState.value = _uiState.value.copy(announcement = newAnnouncement, toastMessage = "公告已更新並發布！")
            }
        }
    }

    private fun publishRecords(newRecords: List<ItemRecord>) {
        viewModelScope.launch {
            val current = _uiState.value
            val entry = ContactBookEntry(
                id = SupabaseRepository.ROW_ID,
                classTitle = current.classTitle,
                announcement = current.announcement,
                records = newRecords
            )
            val result = repository.updateContactBook(entry)
            result.onSuccess {
                _uiState.value = _uiState.value.copy(
                    allRecords = newRecords,
                    toastMessage = "✅ 變更已成功發布至雲端！"
                )
            }.onFailure { err ->
                _uiState.value = _uiState.value.copy(
                    toastMessage = "❌ 發布失敗：${err.localizedMessage}"
                )
            }
        }
    }

    fun fetchHistoryLogs() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoadingLogs = true)
            val result = repository.fetchHistoryLogs()
            result.onSuccess { list ->
                _uiState.value = _uiState.value.copy(logsList = list, isLoadingLogs = false)
            }.onFailure {
                _uiState.value = _uiState.value.copy(isLoadingLogs = false, toastMessage = "取得歷史紀錄失敗")
            }
        }
    }

    fun restoreFromLog(log: ContactBookLogEntry) {
        viewModelScope.launch {
            val result = repository.restoreFromLog(log)
            result.onSuccess {
                _uiState.value = _uiState.value.copy(
                    classTitle = log.classTitle,
                    announcement = log.announcement,
                    allRecords = log.records,
                    toastMessage = "🔄 已成功還原至指定歷史版本！"
                )
            }.onFailure { err ->
                _uiState.value = _uiState.value.copy(toastMessage = "還原失敗：${err.localizedMessage}")
            }
        }
    }

    fun clearToast() {
        _uiState.value = _uiState.value.copy(toastMessage = null)
    }

    fun isItemActiveOnDate(item: ItemRecord, targetDate: String): Boolean {
        if (item.date.isEmpty() && item.dueDate.isEmpty()) return false

        if (item.dueDate.isNotEmpty()) {
            if (targetDate >= item.dueDate) {
                return false
            }
            val startDate = item.date.ifEmpty { item.dueDate }
            return targetDate >= startDate
        }

        return targetDate == item.date
    }

    fun getCountdownDays(dueDate: String, targetDate: String): Long? {
        if (dueDate.isEmpty()) return null
        return try {
            val d1 = LocalDate.parse(targetDate, dateFormatter)
            val d2 = LocalDate.parse(dueDate, dateFormatter)
            ChronoUnit.DAYS.between(d1, d2)
        } catch (e: Exception) {
            null
        }
    }

    fun fetchInstallStats() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoadingStats = true)
            repository.fetchInstallStats().onSuccess { stats ->
                _uiState.value = _uiState.value.copy(installStats = stats, isLoadingStats = false)
            }.onFailure {
                _uiState.value = _uiState.value.copy(
                    isLoadingStats = false,
                    toastMessage = "取得統計失敗，請先至 Supabase 建立 app_installations 資料表"
                )
            }
        }
    }
}
