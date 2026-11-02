package com.rhythmbyte.contactbook

import com.rhythmbyte.contactbook.data.Category
import com.rhythmbyte.contactbook.data.Dates
import com.rhythmbyte.contactbook.data.Updater
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

/** 和網頁版 tests/unit/dates.test.ts 一樣的規則，確保 App 和網頁顯示一致 */
class DatesTest {
    @Test fun validDates() {
        assertTrue(Dates.isValid("2026-11-02"))
        assertTrue(Dates.isValid("2028-02-29"))
        for (bad in listOf("2026-02-30", "2027-02-29", "2026-13-01", "2026-1-1", "26-11-02", "", "1999-12-31")) {
            assertFalse(bad, Dates.isValid(bad))
        }
    }

    @Test fun arithmetic() {
        assertEquals("2027-01-01", Dates.addDays("2026-12-31", 1))
        assertEquals("2026-02-28", Dates.addDays("2026-03-01", -1))
        assertEquals(7, Dates.daysBetween("2026-11-02", "2026-11-09"))
        assertEquals(-7, Dates.daysBetween("2026-11-09", "2026-11-02"))
    }

    @Test fun weeksStartOnMonday() {
        assertEquals(1, Dates.weekday("2026-11-02"))
        assertEquals(0, Dates.weekday("2026-11-08"))
        assertEquals("2026-11-02", Dates.startOfWeek("2026-11-02"))
        assertEquals("2026-11-02", Dates.startOfWeek("2026-11-08"))
        assertEquals("2026-11-02", Dates.startOfWeek("2026-11-04"))
    }

    @Test fun activeUntilTheDayBeforeDue() {
        assertFalse(Dates.isActiveOn("2026-11-02", "2026-11-05", "2026-11-01"))
        assertTrue(Dates.isActiveOn("2026-11-02", "2026-11-05", "2026-11-02"))
        assertTrue(Dates.isActiveOn("2026-11-02", "2026-11-05", "2026-11-04"))
        assertFalse(Dates.isActiveOn("2026-11-02", "2026-11-05", "2026-11-05"))
        assertTrue(Dates.isActiveOn("2026-11-02", null, "2026-11-02"))
        assertFalse(Dates.isActiveOn("2026-11-02", null, "2026-11-03"))
    }

    @Test fun deadlineLabels() {
        assertNull(Dates.deadline(null, "2026-11-02", null))
        assertEquals(Dates.Tone.TOMORROW, Dates.deadline("2026-11-03", "2026-11-02", null)?.tone)
        assertEquals(Dates.Tone.SOON, Dates.deadline("2026-11-04", "2026-11-02", null)?.tone)
        assertEquals(Dates.Tone.LATER, Dates.deadline("2026-11-20", "2026-11-02", null)?.tone)
        assertEquals(Dates.Tone.PAST, Dates.deadline("2026-11-01", "2026-11-02", null)?.tone)
        assertEquals("明天交", Dates.deadline("2026-11-03", "2026-11-02", Category.HOMEWORK)?.label)
        assertEquals("今天考", Dates.deadline("2026-11-02", "2026-11-02", Category.EXAM)?.label)
        assertEquals("週三截止", Dates.deadline("2026-11-04", "2026-11-02", Category.REMINDER)?.label)
        assertEquals("11/20 交", Dates.deadline("2026-11-20", "2026-11-02", Category.SUBMISSION)?.label)
        assertEquals("11/1 已過", Dates.deadline("2026-11-01", "2026-11-02", Category.HOMEWORK)?.label)
    }

    @Test fun classesOnWeekdaysOnly() {
        val tt = List(5) { d -> List(10) { p -> "D${d}P$p" } }
        assertEquals("D0P0", Dates.classesOn(tt, "2026-11-02")?.first())
        assertEquals("D4P9", Dates.classesOn(tt, "2026-11-06")?.last())
        assertNull(Dates.classesOn(tt, "2026-11-07"))
        assertNull(Dates.classesOn(null, "2026-11-02"))
    }

    @Test fun versionCompare() {
        assertTrue(Updater.compareVersions("3.0.0", "2.0.0") > 0)
        assertTrue(Updater.compareVersions("3.0.10", "3.0.9") > 0)
        assertEquals(0, Updater.compareVersions("3.0", "3.0.0"))
        assertTrue(Updater.compareVersions("2.9.9", "3.0.0") < 0)
    }
}
