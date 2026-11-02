# 線上班級聯絡簿（Android）

[網頁版聯絡簿](https://online-contact-book.vercel.app) 的原生 Android App（Kotlin＋Jetpack Compose）。
學生、家長不用登入就能看每天的作業、考試、繳交、提醒和課表；幹部與小老師登入後可以編輯。

> v3 是重寫的版本。v2 以前的程式（直接連 Supabase）已經停用，原始碼保留在 Git 歷史（commit `40eb479`）。

## 和網頁版的關係

- App **只呼叫網站的 `/api`**，不直接連資料庫，APK 裡**沒有任何金鑰**。
  權限全部由伺服器依登入的帳號判斷，App 只是另一個畫面。
- 帳號就是網頁版的帳號（管理員在網頁版「帳號管理」建立）。第一次登入要先改密碼。
- 日期規則（`data/Dates.kt`）和網頁版 `src/lib/shared/dates.ts` 一樣，有單元測試確保一致。

## 功能

| | 訪客 | 幹部與小老師 | 管理員 |
| --- | :-: | :-: | :-: |
| 看聯絡簿、課表 | ✅ | ✅ | ✅ |
| 新增、修改、刪除事項 | | ✅ | ✅ |
| 改公告、課表，看 App 安裝統計 | | | ✅ |
| 帳號管理、修改紀錄、垃圾桶、備份 | | | 在網頁版（App 會開瀏覽器） |

- 底欄是 LiquidGlass 玻璃分頁，四個，可以點、拖，或左右滑動：
  1. **聯絡簿**：整本聯絡簿（日期、週曆、公告、作業／考試／繳交／提醒）。登入後點事項就能修改，右下角玻璃「＋」新增（和 2.0.0 一樣的圓形展開動畫）。
  2. **課表**：整週課表，今天是星期幾就把那一天反白。
  3. **行事曆**：學校公告的學期校曆，放假、考試、活動一目了然，會自動捲到今天。資料是從學校的校曆 PDF 整理成檔案放在 App 裡（`app/src/main/assets/calendar-115-1.json`），不需要網路。
  4. **我的**：登入、修改密碼；管理員另外有編輯公告、編輯課表、App 安裝統計，以及開網頁版的帳號管理、修改紀錄、垃圾桶、備份。
- 沒有「管理後台」，登入後直接在聯絡簿上編輯。
- 每 60 秒檢查一次有沒有人更新，有就自動重新整理；也可以下拉重新整理
- 登入狀態用伺服器的 session cookie，加密保存在手機（Android Keystore）
- App 內更新：讀這個 repo 的 GitHub Releases，下載 `app-release.apk` 交給系統安裝
- 安裝統計：每天回報一次隨機安裝 ID＋版本號，不含任何個人資料

## 換學期校曆

校曆是學校每學期公告的 PDF（<https://www.fdhs.tyc.edu.tw/schedule.pdf>）。把它整理成和 `calendar-115-1.json` 同樣格式的檔案
（`firstDay` 是第 1 週的星期日；`days` 裡每一天有 `date`、`kind`＝`normal`／`holiday`／`exam`、`label`、`events`），
放進 `app/src/main/assets/`，把 `AppViewModel.kt` 的 `CALENDAR_ASSET` 改成新檔名，發新版 App。

## 發布新版

1. 修改 `app/build.gradle.kts` 的 `versionCode`（+1 以上）和 `versionName`，更新 `RELEASE_NOTES.md`
2. 推一個和 versionName 一樣的 tag，例如 `v3.0.0`
3. GitHub Actions 會用舊 App 的同一把金鑰簽章，並**檢查簽章和 v2.0.0 一樣**（不一樣就失敗，避免大家裝不上去），然後建立**草稿** Release
4. 到 GitHub → Releases 確認後按 **Publish**。舊 App（v2.0.0）打開時就會跳出更新通知

需要先在 repo 的 **Settings → Secrets and variables → Actions** 加這四個 secret：

| Name | 內容 |
| --- | --- |
| `KEYSTORE_BASE64` | keystore 檔轉成 base64：`base64 -w0 你的.jks`（macOS：`base64 -i 你的.jks`） |
| `KEYSTORE_PASSWORD` | keystore 密碼 |
| `KEY_ALIAS` | 金鑰別名 |
| `KEY_PASSWORD` | 金鑰密碼 |

> keystore 檔和密碼**絕對不要** commit 進 Git。`.gitignore` 已經擋掉 `*.jks`、`*.keystore`、`keystore.properties`。

## 開發

需要 JDK 17 以上、Android SDK（compileSdk 36）。

```bash
./gradlew :app:assembleDebug          # 編譯
./gradlew :app:testDebugUnitTest      # 單元測試（日期規則、版本比較）

# 對本機網站跑 API 整合測試（網站要有管理員 boss / boss-password-123）
CB_TEST_BASE=http://localhost:3100 ./gradlew :app:testDebugUnitTest

# 產生畫面截圖到 app/build/screenshots/（Robolectric，不需要模擬器）
CB_SCREENSHOTS=1 ./gradlew :app:testDebugUnitTest
```

本機簽章：在專案根目錄建立 `keystore.properties`（已被 .gitignore 排除）：

```properties
storeFile=/絕對路徑/release.jks
storePassword=...
keyAlias=...
keyPassword=...
```

## 技術

Kotlin 2.3、Jetpack Compose（Material 3）、OkHttp、kotlinx.serialization、
[Kyant0/AndroidLiquidGlass](https://github.com/Kyant0/AndroidLiquidGlass)（backdrop 1.0.6；玻璃元件改寫自它的範例，Apache-2.0，見 `THIRD_PARTY_LICENSES/`）。`minSdk 26`（Android 8.0）、`targetSdk 36`。
套件名稱 `com.rhythmbyte.contactbook`，和舊版相同。
