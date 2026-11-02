package com.rhythmbyte.contactbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import com.rhythmbyte.contactbook.ui.AnnouncementScreen
import com.rhythmbyte.contactbook.ui.Cb
import com.rhythmbyte.contactbook.ui.ContactBookTheme
import com.rhythmbyte.contactbook.ui.AccountActions
import com.rhythmbyte.contactbook.ui.EditActions
import com.rhythmbyte.contactbook.ui.MainScreen
import com.rhythmbyte.contactbook.ui.MenuActions
import com.rhythmbyte.contactbook.ui.TopBar
import android.content.Intent
import android.net.Uri
import com.rhythmbyte.contactbook.ui.DarkCb
import com.rhythmbyte.contactbook.ui.InstallStatsScreen
import com.rhythmbyte.contactbook.ui.LightCb
import com.rhythmbyte.contactbook.ui.TimetableEditScreen
import com.rhythmbyte.contactbook.ui.linkify
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    private val vm: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(LightCb.bg.toArgb(), DarkCb.bg.toArgb()),
            navigationBarStyle = SystemBarStyle.auto(LightCb.bg.toArgb(), DarkCb.bg.toArgb()),
        )
        super.onCreate(savedInstanceState)
        setContent {
            ContactBookTheme(dark = isSystemInDarkTheme()) { App(vm) }
        }
    }
}

@Composable
fun App(vm: AppViewModel) {
    val c = Cb.c
    val snackbar = remember { SnackbarHostState() }
    var toastIsError by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val lifecycle = LocalLifecycleOwner.current.lifecycle

    LaunchedEffect(Unit) {
        vm.toasts.collect {
            toastIsError = it.error
            snackbar.currentSnackbarData?.dismiss()
            snackbar.showSnackbar(it.text)
        }
    }
    // 畫面在前景時，每 60 秒檢查一次有沒有人更新內容
    LaunchedEffect(lifecycle) {
        lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
            vm.checkVersion()
            while (true) {
                delay(60_000)
                vm.checkVersion()
            }
        }
    }
    BackHandler(enabled = vm.stack.size > 1) { vm.back() }

    Box(Modifier.fillMaxSize().background(c.bg)) {
        val user = vm.user
        when (vm.screen) {
            Screen.Board -> MainScreen(
                board = vm.board, loading = vm.boardLoading, error = vm.boardError, user = user,
                calendar = vm.calendar,
                tab = vm.tab, onTab = { vm.tab = it },
                onPick = { vm.loadBoard(it) },
                onRefresh = { vm.loadBoard(vm.board?.date) },
                onLoadCalendar = { vm.loadCalendar() },
                account = AccountActions(
                    login = { u, p -> vm.login(u, p) },
                    changePassword = { cur, next -> vm.api.changePassword(cur, next); vm.onPasswordChanged() },
                    signOutOthers = { vm.api.signOutOthers() },
                    logout = { vm.logout() },
                    onError = { vm.handle(it) },
                    toast = { vm.toast(it) },
                ),
                menu = MenuActions(
                    onAnnouncement = { vm.navigate(Screen.Announcement) },
                    onTimetable = { vm.navigate(Screen.Timetable) },
                    onStats = { vm.navigate(Screen.InstallStats) },
                    onWeb = { path -> context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(BuildConfig.BASE_URL + path))) },
                    onCheckUpdate = { vm.checkUpdate(manual = true) },
                ),
                version = BuildConfig.VERSION_NAME,
                checkingUpdate = vm.checkingUpdate,
                edit = EditActions(
                    load = { vm.loadForEdit(it) },
                    save = { entry, input -> if (entry == null) vm.api.createEntry(input) else vm.api.updateEntry(entry.id, entry.version, input) },
                    delete = { vm.api.deleteEntry(it.id) },
                    toast = { text, err -> vm.toast(text, err) },
                    onError = { vm.handle(it) },
                    onChanged = { vm.loadBoard(vm.board?.date, silent = true) },
                ),
            )
            else -> {
                if (user == null) {
                    // 登入過期或已登出
                    LaunchedEffect(Unit) { vm.home() }
                } else when (vm.screen) {
                    Screen.Announcement -> SubScreen("編輯公告", vm) { AnnouncementScreen(vm) }
                    Screen.Timetable -> SubScreen("編輯課表", vm) { TimetableEditScreen(vm) }
                    Screen.InstallStats -> SubScreen("App 安裝統計", vm) { InstallStatsScreen(vm) }
                    else -> Unit
                }
            }
        }

        SnackbarHost(snackbar, Modifier.align(Alignment.BottomCenter).navigationBarsPadding().padding(bottom = 72.dp)) {
            Snackbar(it, containerColor = if (toastIsError) c.red else c.ink, contentColor = if (toastIsError) c.bg else c.bg)
        }
        UpdateDialog(vm)
    }
}

@Composable
private fun SubScreen(title: String, vm: AppViewModel, content: @Composable () -> Unit) {
    Column(Modifier.fillMaxSize().background(Cb.c.bg)) {
        TopBar(title, onBack = { vm.back() })
        Box(Modifier.weight(1f)) { content() }
    }
}

@Composable
private fun UpdateDialog(vm: AppViewModel) {
    val c = Cb.c
    val info = vm.update ?: return
    val progress = vm.downloadProgress
    val context = LocalContext.current
    AlertDialog(
        onDismissRequest = { if (progress == null) vm.skipUpdate() },
        containerColor = c.surface,
        title = { Text("有新版本 v${info.version}", fontWeight = FontWeight.Bold, color = c.ink) },
        text = {
            Column(Modifier.heightIn(max = 320.dp).verticalScroll(rememberScrollState())) {
                Text("目前是 v${BuildConfig.VERSION_NAME}", fontSize = 13.sp, color = c.ink3)
                if (info.notes.isNotBlank()) Text(linkify(info.notes), Modifier.padding(top = 8.dp), fontSize = 14.sp, color = c.ink2)
                if (progress != null) {
                    if (progress >= 0f) {
                        LinearProgressIndicator({ progress }, Modifier.fillMaxWidth().padding(top = 16.dp), color = c.primary, trackColor = c.line)
                    } else {
                        LinearProgressIndicator(Modifier.fillMaxWidth().padding(top = 16.dp), color = c.primary, trackColor = c.line)
                    }
                }
            }
        },
        confirmButton = {
            TextButton({ vm.downloadAndInstall(context) }, enabled = progress == null) {
                Text(if (progress == null) "下載並安裝" else "下載中…", color = c.primary, fontWeight = FontWeight.SemiBold)
            }
        },
        dismissButton = {
            if (progress == null) TextButton({ vm.skipUpdate() }) { Text("稍後再說", color = c.ink2) }
        },
    )
}
