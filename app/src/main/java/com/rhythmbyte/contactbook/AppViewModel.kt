package com.rhythmbyte.contactbook

import android.app.Application
import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.rhythmbyte.contactbook.data.Api
import com.rhythmbyte.contactbook.data.ApiException
import com.rhythmbyte.contactbook.data.BoardData
import com.rhythmbyte.contactbook.data.EncryptedPrefs
import com.rhythmbyte.contactbook.data.ManagedEntry
import com.rhythmbyte.contactbook.data.PersistentCookieJar
import com.rhythmbyte.contactbook.data.SessionUser
import com.rhythmbyte.contactbook.data.UpdateInfo
import com.rhythmbyte.contactbook.data.Updater
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext
import com.rhythmbyte.contactbook.data.CalendarData
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import java.util.UUID

sealed interface Screen {
    data object Board : Screen
    data object Announcement : Screen
    data object Timetable : Screen
    data object InstallStats : Screen
}

/** 底欄四個分頁：0 聯絡簿、1 課表、2 行事曆、3 我的 */
/** 校曆資料檔（app/src/main/assets）。換學期時換成新的檔案、發新版 App */
const val CALENDAR_ASSET = "calendar-115-1.json"
const val TAB_BOARD = 0
const val TAB_TIMETABLE = 1
const val TAB_CALENDAR = 2
const val TAB_ME = 3

sealed interface CalendarState {
    data object Loading : CalendarState
    data class Ready(val data: com.rhythmbyte.contactbook.data.CalendarData) : CalendarState
    data class Failed(val message: String) : CalendarState
}

data class Toast(val text: String, val error: Boolean = false)

class AppViewModel(app: Application) : AndroidViewModel(app) {
    private val cookies = PersistentCookieJar(EncryptedPrefs(app))
    val api = Api(BuildConfig.BASE_URL, cookies, "ContactBookAndroid/${BuildConfig.VERSION_NAME}")
    private val updater = Updater(BuildConfig.GITHUB_REPO, BuildConfig.VERSION_NAME)
    private val prefs = app.getSharedPreferences("app", Context.MODE_PRIVATE)

    // ---- 畫面堆疊（返回鍵往回一層）----
    var stack by mutableStateOf(listOf<Screen>(Screen.Board))
        private set
    val screen: Screen get() = stack.last()

    fun navigate(s: Screen) {
        stack = stack + s
    }

    fun back(): Boolean {
        if (stack.size <= 1) return false
        stack = stack.dropLast(1)
        return true
    }

    fun home() {
        stack = listOf(Screen.Board)
        loadBoard(board?.date, silent = true)
    }

    // ---- 底欄分頁 ----
    var tab by mutableIntStateOf(TAB_BOARD)

    // ---- 學期行事曆：學校公告的校曆，已經整理成檔案放在 App 裡（assets），不需要網路 ----
    var calendar by mutableStateOf<CalendarState>(CalendarState.Loading)
        private set

    fun loadCalendar(force: Boolean = false) {
        if (calendar is CalendarState.Ready && !force) return
        viewModelScope.launch {
            calendar = try {
                val text = withContext(Dispatchers.IO) {
                    getApplication<Application>().assets.open(CALENDAR_ASSET).use { it.readBytes().decodeToString() }
                }
                CalendarState.Ready(api.json.decodeFromString(CalendarData.serializer(), text))
            } catch (e: Exception) {
                CalendarState.Failed("讀取行事曆失敗：${e.message ?: "請更新 App"}")
            }
        }
    }

    // ---- 訊息 ----
    private val toastChannel = Channel<Toast>(Channel.BUFFERED)
    val toasts = toastChannel.receiveAsFlow()
    fun toast(text: String, error: Boolean = false) {
        toastChannel.trySend(Toast(text, error))
    }

    // ---- 聯絡簿 ----
    var board by mutableStateOf<BoardData?>(null)
        private set
    var boardLoading by mutableStateOf(false)
        private set
    var boardError by mutableStateOf<String?>(null)
        private set
    private var boardJob: Job? = null

    fun loadBoard(date: String?, silent: Boolean = false) {
        boardJob?.cancel()
        if (date != null) board = board?.copy(date = date)
        boardJob = viewModelScope.launch {
            if (!silent) boardLoading = true
            try {
                board = api.board(date)
                boardError = null
            } catch (e: ApiException) {
                if (board == null) boardError = e.message else if (!silent) toast(e.message ?: "", error = true)
            } finally {
                boardLoading = false
            }
        }
    }

    /** 有人更新內容時重新整理（畫面在前景時每 60 秒呼叫一次） */
    fun checkVersion() {
        val current = board ?: return
        viewModelScope.launch {
            runCatching { api.version() }.onSuccess { if (it != current.version) loadBoard(current.date, silent = true) }
        }
    }

    // ---- 登入狀態 ----
    var user by mutableStateOf<SessionUser?>(null)
        private set

    fun refreshUser() {
        viewModelScope.launch { runCatching { api.account() }.onSuccess { user = it } }
    }

    suspend fun login(username: String, password: String) {
        api.login(username.trim(), password)
        val u = api.account() ?: throw ApiException(401, "登入失敗，請再試一次")
        user = u
        // 沒有「管理後台」了：登入後回到聯絡簿，直接在上面編輯
        if (u.mustChangePassword) {
            tab = TAB_ME
        } else {
            tab = TAB_BOARD
            toast("已登入，點事項就能修改，按＋新增")
        }
    }

    fun onPasswordChanged() {
        viewModelScope.launch {
            runCatching { api.account() }.onSuccess { user = it }
            if (user?.mustChangePassword == false) tab = TAB_BOARD
        }
    }

    fun logout() {
        viewModelScope.launch {
            runCatching { api.logout() }
            cookies.clear()
            user = null
            stack = listOf(Screen.Board)
            toast("已登出")
        }
    }

    /** 點聯絡簿上的事項：拿那一天所有事項（含版本號），找出這一筆 */
    suspend fun loadForEdit(e: com.rhythmbyte.contactbook.data.PublicEntry): ManagedEntry? {
        val day = board?.date ?: e.entryDate
        return api.entries(day, day, null, null).firstOrNull { it.id == e.id }
    }

    /** 操作失敗時的共同處理：登入過期就回到「我的」分頁重新登入 */
    fun handle(e: Throwable): String {
        val msg = e.message ?: "發生錯誤，請稍後再試"
        if (e is ApiException) {
            when {
                e.status == 401 -> {
                    cookies.clear()
                    user = null
                    stack = listOf(Screen.Board)
                    tab = TAB_ME
                    toast("登入已過期，請重新登入", error = true)
                }
                e.code == "must_change_password" -> {
                    stack = listOf(Screen.Board)
                    tab = TAB_ME
                    toast(msg, error = true)
                }
                else -> toast(msg, error = true)
            }
        } else {
            toast(msg, error = true)
        }
        return msg
    }

    // ---- 安裝統計：只送隨機 ID＋版本號，一天最多一次 ----
    private fun reportInstallation() {
        if (BuildConfig.BUILD_TYPE != "release") return // 測試版不算進統計
        val now = System.currentTimeMillis()
        val last = prefs.getLong("install_reported_at", 0L)
        val lastVersion = prefs.getString("install_reported_version", null)
        if (now - last < 12 * 3600 * 1000L && lastVersion == BuildConfig.VERSION_NAME) return
        val id = prefs.getString("install_id", null) ?: UUID.randomUUID().toString().also { prefs.edit().putString("install_id", it).apply() }
        viewModelScope.launch {
            runCatching { api.reportInstallation(id, BuildConfig.VERSION_NAME) }.onSuccess {
                prefs.edit().putLong("install_reported_at", now).putString("install_reported_version", BuildConfig.VERSION_NAME).apply()
            }
        }
    }

    // ---- App 內更新 ----
    var update by mutableStateOf<UpdateInfo?>(null)
        private set
    var downloadProgress by mutableStateOf<Float?>(null)
        private set
    var checkingUpdate by mutableStateOf(false)
        private set

    fun checkUpdate(manual: Boolean = false) {
        viewModelScope.launch {
            checkingUpdate = true
            val info = updater.check()
            checkingUpdate = false
            val skipped = prefs.getString("skipped_version", null)
            if (info != null && (manual || info.version != skipped)) update = info
            else if (manual) toast("已經是最新版本（v${BuildConfig.VERSION_NAME}）")
        }
    }

    fun skipUpdate() {
        update?.let { prefs.edit().putString("skipped_version", it.version).apply() }
        update = null
    }

    fun downloadAndInstall(context: Context) {
        val info = update ?: return
        if (!Updater.canInstall(context)) {
            toast("請允許「安裝不明應用程式」後，再按一次更新")
            Updater.openInstallPermissionSettings(context)
            return
        }
        viewModelScope.launch {
            downloadProgress = 0f
            try {
                val file = updater.download(context, info) { downloadProgress = it }
                update = null
                Updater.install(context, file)
            } catch (e: Exception) {
                toast("下載失敗：${e.message ?: "請稍後再試"}", error = true)
            } finally {
                downloadProgress = null
            }
        }
    }

    init {
        loadBoard(null)
        refreshUser()
        reportInstallation()
        checkUpdate()
    }
}
