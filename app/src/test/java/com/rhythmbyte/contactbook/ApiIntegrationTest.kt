package com.rhythmbyte.contactbook

import com.rhythmbyte.contactbook.data.Api
import com.rhythmbyte.contactbook.data.ApiException
import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.EntryInput
import com.rhythmbyte.contactbook.data.Priority
import com.rhythmbyte.contactbook.data.Role
import kotlinx.coroutines.runBlocking
import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Assume.assumeTrue
import org.junit.Test
import java.util.UUID

/**
 * 對真正的網站（本機 next start）跑一遍 App 會用到的 API。
 * 需要：網站已經有管理員 boss / boss-password-123（tests/e2e/ui.mjs 跑完的狀態）。
 * 沒設定 CB_TEST_BASE 時自動略過。
 */
class ApiIntegrationTest {
    private val base: String? = System.getProperty("cbTestBase")

    /** 本機是 http，正式站的 __Host- cookie 是 Secure；測試時忽略 Secure 旗標 */
    private class TestJar : CookieJar {
        val cookies = mutableListOf<Cookie>()
        override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
            for (c in cookies) {
                this.cookies.removeAll { it.name == c.name }
                if (c.expiresAt > System.currentTimeMillis()) this.cookies.add(c)
            }
        }
        override fun loadForRequest(url: HttpUrl) = cookies.toList()
    }

    @Test fun appFlowAgainstRealServer() = runBlocking {
        assumeTrue("CB_TEST_BASE not set", base != null)
        val jar = TestJar()
        val api = Api(base!!, jar, "ContactBookAndroid/test")

        // 公開：聯絡簿、版本號、課表
        val board = api.board("2026-11-02")
        assertEquals("2026-11-02", board.date)
        assertEquals(7, board.week.size)
        assertEquals(5, board.timetable?.size)
        assertTrue(api.version().isNotEmpty())
        assertNull(api.account())

        // 沒登入不能寫
        val denied = runCatching { api.createEntry(input("x")) }.exceptionOrNull() as ApiException
        assertEquals(401, denied.status)

        // 登入錯誤
        val bad = runCatching { api.login("boss", "wrong") }.exceptionOrNull() as ApiException
        assertEquals("invalid_credentials", bad.code)

        api.login("boss", "boss-password-123")
        val me = api.account()
        assertNotNull(me)
        assertEquals(Role.ADMIN, me!!.role)

        // 事項 CRUD＋樂觀鎖
        val created = api.createEntry(input("App 測試"))
        assertEquals(1, created.version)
        val updated = api.updateEntry(created.id, created.version, input("App 測試（改）"))
        assertEquals(2, updated.version)
        val conflict = runCatching { api.updateEntry(created.id, 1, input("舊版本")) }.exceptionOrNull() as ApiException
        assertEquals(409, conflict.status)
        assertEquals("conflict", conflict.code)
        val list = api.entries("2026-10-01", "2026-12-31", "App 測試", Category.EXAM)
        assertTrue(list.any { it.id == created.id })
        api.deleteEntry(created.id)
        assertTrue(api.entries("2026-10-01", "2026-12-31", "App 測試", null).none { it.id == created.id })

        // 公告、課表
        val s = api.settings()
        assertEquals(s.classTitle, api.updateSettings(s.classTitle, s.announcement).classTitle)
        val tt = api.timetable()
        val next = tt.schedule.map { it.toMutableList() }.also { it[4][9] = "App 改" }
        assertEquals("App 改", api.updateTimetable(next).schedule[4][9])
        api.updateTimetable(tt.schedule)

        // 安裝統計
        val before = api.installStats().total
        api.reportInstallation(UUID.randomUUID().toString(), "3.0.0")
        assertEquals(before + 1, api.installStats().total)

        // 登出後 cookie 失效
        api.logout()
        assertNull(api.account())
    }

    private fun input(title: String) = EntryInput("2026-11-02", Category.EXAM, "數學", title, "", "2026-11-05", Priority.NORMAL)
}
