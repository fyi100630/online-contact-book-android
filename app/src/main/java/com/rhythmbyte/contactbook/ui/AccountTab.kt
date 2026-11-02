package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.data.ApiException
import com.rhythmbyte.contactbook.data.Role
import com.rhythmbyte.contactbook.data.SessionUser
import kotlinx.coroutines.launch

/** 「我的」分頁需要的帳號動作（由 AppViewModel 提供） */
class AccountActions(
    val login: suspend (String, String) -> Unit,
    val changePassword: suspend (String, String) -> Unit,
    val signOutOthers: suspend () -> Unit,
    val logout: () -> Unit,
    val onError: (Throwable) -> Unit,
    val toast: (String) -> Unit,
)

/** 「我的」分頁裡的其他功能（管理員專用的在這裡，不再有「管理後台」） */
class MenuActions(
    val onAnnouncement: () -> Unit = {},
    val onTimetable: () -> Unit = {},
    val onStats: () -> Unit = {},
    val onWeb: (String) -> Unit = {},
    val onCheckUpdate: () -> Unit = {},
)

@Composable
fun Card(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    val c = Cb.c
    Column(
        modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)).border(1.dp, c.line, RoundedCornerShape(10.dp)).background(c.surface).padding(18.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) { content() }
}

/** 底欄 4「我的」：沒登入是登入表單，登入後是帳號、修改密碼、管理員功能、登出 */
@Composable
fun AccountTab(user: SessionUser?, actions: AccountActions, menu: MenuActions, version: String, checkingUpdate: Boolean) {
    val c = Cb.c
    Column(
        Modifier.fillMaxSize().imePadding().verticalScroll(rememberScrollState()).padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 130.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text("我的", Modifier.semantics { heading() }, fontSize = 26.sp, fontWeight = FontWeight.ExtraBold, color = c.ink)
        if (user == null) {
            LoginCard(actions.login)
            Text("不登入也能看聯絡簿、課表和行事曆。幹部與小老師登入後，可以直接在聯絡簿上新增、修改事項。", fontSize = 13.sp, lineHeight = 19.sp, color = c.ink3)
        } else {
            SignedIn(user, actions, menu)
        }
        HorizontalDivider(color = c.line)
        ListRow(if (checkingUpdate) "檢查中…" else "檢查更新（目前 v$version）", CbIcons.Download, onClick = menu.onCheckUpdate)
    }
}

@Composable
private fun SignedIn(user: SessionUser, actions: AccountActions, menu: MenuActions) {
    val c = Cb.c
    val forced = user.mustChangePassword
    var showPassword by remember { mutableStateOf(false) }
    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Text(user.displayName, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = c.ink)
        Text("${user.username}，${user.role.label}", fontSize = 14.sp, color = c.ink3)
    }
    if (forced) Alert("這是管理員給你的臨時密碼，請先設定自己的新密碼，才能編輯。", danger = false)
    else Text("點聯絡簿上的事項就能修改，按右下角「＋」新增。", fontSize = 13.sp, color = c.ink3)

    if (forced || showPassword) PasswordCard(forced, actions) { showPassword = false }
    else ListRow("修改密碼", CbIcons.User) { showPassword = true }

    if (!forced && user.role == Role.ADMIN) {
        HorizontalDivider(color = c.line)
        Column {
            Text("管理員", Modifier.padding(bottom = 4.dp), fontSize = 12.sp, fontWeight = FontWeight.Bold, color = c.ink3)
            ListRow("編輯公告", CbIcons.Megaphone, onClick = menu.onAnnouncement)
            ListRow("編輯課表", CbIcons.Grid, onClick = menu.onTimetable)
            ListRow("App 安裝統計", CbIcons.Phone, onClick = menu.onStats)
            ListRow("帳號管理（網頁版）", CbIcons.External) { menu.onWeb("/manage/users") }
            ListRow("修改紀錄、垃圾桶（網頁版）", CbIcons.External) { menu.onWeb("/manage/activity") }
            ListRow("備份與匯入（網頁版）", CbIcons.External) { menu.onWeb("/manage/data") }
        }
    }
    HorizontalDivider(color = c.line)
    Column {
        if (!forced) {
            val scope = rememberCoroutineScope()
            ListRow("登出其他所有裝置", CbIcons.Shield) {
                scope.launch {
                    try {
                        actions.signOutOthers()
                        actions.toast("其他裝置都已登出")
                    } catch (e: Exception) {
                        actions.onError(e)
                    }
                }
            }
        }
        ListRow("登出", CbIcons.Logout, danger = true, onClick = actions.logout)
    }
}

@Composable
private fun ListRow(text: String, icon: ImageVector, danger: Boolean = false, onClick: () -> Unit) {
    val c = Cb.c
    Row(
        Modifier.fillMaxWidth().heightIn(min = 50.dp).clip(RoundedCornerShape(10.dp)).clickable(onClick = onClick).padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, null, tint = if (danger) c.red else c.ink2, modifier = Modifier.size(20.dp))
        Spacer(Modifier.width(14.dp))
        Text(text, fontSize = 15.sp, fontWeight = FontWeight.SemiBold, color = if (danger) c.red else c.ink)
    }
}

@Composable
private fun LoginCard(onLogin: suspend (String, String) -> Unit) {
    val scope = rememberCoroutineScope()
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    Card {
        Text("登入", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Cb.c.ink)
        error?.let { Alert(it) }
        CbTextField(username, { username = it }, label = "帳號", maxLength = 64)
        CbTextField(password, { password = it }, label = "密碼", password = true, maxLength = 256)
        CbButton(
            if (busy) "登入中…" else "登入",
            modifier = Modifier.fillMaxWidth(),
            enabled = !busy,
            onClick = {
                if (username.isBlank() || password.isEmpty()) {
                    error = "請輸入帳號和密碼"
                    return@CbButton
                }
                busy = true
                error = null
                scope.launch {
                    try {
                        onLogin(username, password)
                        password = ""
                    } catch (e: ApiException) {
                        error = e.message
                    } finally {
                        busy = false
                    }
                }
            },
        )
    }
}

@Composable
private fun PasswordCard(forced: Boolean, actions: AccountActions, onClose: () -> Unit) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    var current by remember { mutableStateOf("") }
    var next by remember { mutableStateOf("") }
    var confirm by remember { mutableStateOf("") }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    Card {
        Text(if (forced) "設定新密碼" else "修改密碼", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = c.ink)
        error?.let { Alert(it) }
        CbTextField(current, { current = it }, label = if (forced) "臨時密碼" else "目前的密碼", password = true, maxLength = 256)
        CbTextField(next, { next = it }, label = "新密碼", password = true, maxLength = 128, hint = "最多 128 個字元，數字或英文都可以")
        CbTextField(confirm, { confirm = it }, label = "再輸入一次新密碼", password = true, maxLength = 128)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            if (!forced) CbButton("取消", onClose, kind = BtnKind.Ghost)
            CbButton(if (busy) "更新中…" else "更新密碼", modifier = Modifier.weight(1f), enabled = !busy, onClick = {
                when {
                    current.isEmpty() -> error = "請輸入${if (forced) "臨時密碼" else "目前的密碼"}"
                    next.isEmpty() -> error = "請輸入新密碼"
                    next != confirm -> error = "兩次輸入的新密碼不一樣"
                    else -> {
                        busy = true
                        error = null
                        scope.launch {
                            try {
                                actions.changePassword(current, next)
                                actions.toast("密碼已更新，其他裝置已登出")
                                onClose()
                            } catch (e: ApiException) {
                                if (e.status == 401 && e.code == "unauthenticated") actions.onError(e) else error = e.message
                            } finally {
                                busy = false
                            }
                        }
                    }
                }
            })
        }
    }
}
