package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.data.ApiException
import com.rhythmbyte.contactbook.data.SessionUser
import kotlinx.coroutines.launch

/** 登入頁：正中間一個框，寫「管理後台」，不介紹功能（和網頁一樣） */
@Composable
fun LoginScreen(onLogin: suspend (String, String) -> Unit, onBack: () -> Unit) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }

    Column(Modifier.fillMaxSize().background(c.bg)) {
        TopBar("", onBack = onBack)
        Box(Modifier.fillMaxSize().imePadding().verticalScroll(rememberScrollState()).padding(16.dp), contentAlignment = Alignment.TopCenter) {
            Column(
                Modifier.padding(top = 32.dp).widthIn(max = 400.dp).fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp)).border(1.dp, c.line, RoundedCornerShape(16.dp)).background(c.surface)
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
            ) {
                Text("管理後台", fontSize = 22.sp, fontWeight = FontWeight.ExtraBold, color = c.ink)
                error?.let { Alert(it) }
                CbTextField(username, { username = it }, label = "帳號", maxLength = 64)
                CbTextField(password, { password = it }, label = "密碼", password = true, maxLength = 256)
                CbButton(
                    if (busy) "登入中…" else "登入",
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
                            } catch (e: ApiException) {
                                error = e.message
                            } finally {
                                busy = false
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = !busy,
                )
            }
        }
    }
}

/** 我的帳號：修改密碼（第一次登入一定要改）、登出其他裝置 */
@Composable
fun AccountScreen(
    user: SessionUser,
    onChangePassword: suspend (String, String) -> Unit,
    onSignOutOthers: suspend () -> Unit,
    onLogout: () -> Unit,
    onBack: () -> Unit,
    onError: (Throwable) -> Unit,
    onToast: (String) -> Unit,
) {
    val c = Cb.c
    val scope = rememberCoroutineScope()
    val forced = user.mustChangePassword
    var current by remember { mutableStateOf("") }
    var next by remember { mutableStateOf("") }
    var confirm by remember { mutableStateOf("") }
    var busy by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }

    Column(Modifier.fillMaxSize().background(c.bg)) {
        TopBar("我的帳號", onBack = onBack)
        Column(
            Modifier.fillMaxSize().imePadding().verticalScroll(rememberScrollState()).padding(16.dp).navigationBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                Text(user.displayName, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = c.ink)
                Text("${user.username}，${user.role.label}", fontSize = 14.sp, color = c.ink3)
            }
            if (forced) Alert("這是管理員給你的臨時密碼，請先設定自己的新密碼。", danger = false)
            Card {
                Text(if (forced) "設定新密碼" else "修改密碼", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = c.ink)
                error?.let { Alert(it) }
                CbTextField(current, { current = it }, label = if (forced) "臨時密碼" else "目前的密碼", password = true, maxLength = 256)
                CbTextField(next, { next = it }, label = "新密碼", password = true, maxLength = 128, hint = "最多 128 個字元，數字或英文都可以")
                CbTextField(confirm, { confirm = it }, label = "再輸入一次新密碼", password = true, maxLength = 128)
                CbButton(if (busy) "更新中…" else "更新密碼", enabled = !busy, modifier = Modifier.fillMaxWidth(), onClick = {
                    when {
                        current.isEmpty() -> error = "請輸入${if (forced) "臨時密碼" else "目前的密碼"}"
                        next.isEmpty() -> error = "請輸入新密碼"
                        next != confirm -> error = "兩次輸入的新密碼不一樣"
                        else -> {
                            busy = true
                            error = null
                            scope.launch {
                                try {
                                    onChangePassword(current, next)
                                    current = ""; next = ""; confirm = ""
                                    onToast("密碼已更新，其他裝置已登出")
                                } catch (e: ApiException) {
                                    if (e.status == 401 && e.code == "unauthenticated") onError(e) else error = e.message
                                } finally {
                                    busy = false
                                }
                            }
                        }
                    }
                })
            }
            if (!forced) {
                Card {
                    Text("登入中的裝置", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = c.ink)
                    Text("如果曾經在別人的手機或公用電腦登入，可以把其他裝置全部登出。", fontSize = 14.sp, color = c.ink3)
                    CbButton("登出其他所有裝置", kind = BtnKind.Secondary, icon = CbIcons.Shield, onClick = {
                        scope.launch {
                            try {
                                onSignOutOthers()
                                onToast("其他裝置都已登出")
                            } catch (e: Exception) {
                                onError(e)
                            }
                        }
                    })
                }
            }
            CbButton("登出", onLogout, kind = BtnKind.Danger, icon = CbIcons.Logout)
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    val c = Cb.c
    Column(
        modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)).border(1.dp, c.line, RoundedCornerShape(10.dp)).background(c.surface).padding(18.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) { content() }
}
