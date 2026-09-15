package com.rhythmbyte.contactbook

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rhythmbyte.contactbook.ui.screens.HomeScreen
import com.rhythmbyte.contactbook.ui.theme.OnlineContactBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val defaultHandler = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            android.util.Log.e("ContactBookCrash", "Crash in thread ${thread.name}", throwable)
            try {
                runOnUiThread {
                    setContent {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color(0xFF18181B))
                                .padding(24.dp)
                                .verticalScroll(rememberScrollState()),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "⚠️ 應用程式畫面載入異常",
                                    color = Color(0xFFF87171),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "錯誤原因：${throwable.localizedMessage ?: "未知錯誤"}",
                                    color = Color.White,
                                    fontSize = 13.sp
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Button(
                                    onClick = {
                                        val intent = intent
                                        finish()
                                        startActivity(intent)
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF10B981)),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Text("重新載入首頁", color = Color.White)
                                }
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = throwable.stackTraceToString(),
                                    color = Color(0xFF94A3B8),
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }
                }
            } catch (e: Throwable) {
                defaultHandler?.uncaughtException(thread, throwable)
            }
        }
        enableEdgeToEdge()

        // 120Hz/144Hz 極致高刷新率硬體鎖定 (適配 LTPO 與高刷螢幕，強制系統 SurfaceFlinger 跑滿 120Hz)
        try {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                val display = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                    display
                } else {
                    @Suppress("DEPRECATION")
                    windowManager.defaultDisplay
                }
                val modes = display?.supportedModes
                val maxMode = modes?.maxByOrNull { it.refreshRate }
                val targetFps = maxMode?.refreshRate?.coerceAtLeast(120f) ?: 120f

                val lp = window.attributes
                if (maxMode != null) {
                    lp.preferredDisplayModeId = maxMode.modeId
                }
                lp.preferredRefreshRate = targetFps

                // Android 11+ / 12+ LTPO 動態高刷反射鎖定 (preferredMinDisplayRefreshRate & preferredMaxDisplayRefreshRate)
                try {
                    val minField = lp.javaClass.getField("preferredMinDisplayRefreshRate")
                    val maxField = lp.javaClass.getField("preferredMaxDisplayRefreshRate")
                    minField.setFloat(lp, targetFps)
                    maxField.setFloat(lp, targetFps)
                } catch (_: Throwable) {}

                window.attributes = lp
            }

            // Android 11+ View.setFrameRate 反射調用 (若系統支援)
            window.decorView.post {
                try {
                    val method = window.decorView.javaClass.getMethod(
                        "setFrameRate",
                        Float::class.javaPrimitiveType,
                        Int::class.javaPrimitiveType
                    )
                    method.invoke(window.decorView, 120f, 0)
                } catch (_: Throwable) {}
            }
        } catch (_: Throwable) {
        }

        setContent {
            OnlineContactBookTheme {
                HomeScreen()
            }
        }
    }
}

