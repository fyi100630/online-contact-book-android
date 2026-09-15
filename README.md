# 📱 線上班級聯絡簿 (Online Contact Book for Android)

一個現代、輕量、具備前衛 **Liquid Glass（液態玻璃透鏡折射）** 主視覺的 Android 原生班級聯絡簿 App。
與現有 **Vercel 網頁版** 及 **Supabase 雲端資料庫** 保持 100% 毫秒級雙向即時同步。

---

## ✨ 核心特色

1. **GitHub 最高星 Liquid Glass 主視覺**：
   - 採用 GitHub 上人氣第一名（3,700+ Stars）的 **[Kyant0 / AndroidLiquidGlass](https://github.com/Kyant0/AndroidLiquidGlass)** (`io.github.kyant0:backdrop`) 渲染技術。
   - 具備真實物理光學**透鏡折射（Lens Refraction）**、**色彩活力（Vibrancy）**、**邊緣色散（Dispersion）** 與晶瑩通透的高光導角。
2. **永遠最新（Live-Only Architecture，無過期快取）**：
   - 捨棄離線舊資料快取，保證每次點開看到的都是最新一期的作業與通知，杜絕「家長在離線狀態下看到過期資訊」的疑慮。
   - 常駐 **Supabase Realtime WebSocket 推播**，網頁端一發布，手機端在 1 秒內自動平滑刷新。
3. **一次登入，永久免重複輸入密碼**：
   - 使用 Android 官方推薦的 **Jetpack DataStore** 本機持久化。
   - 輸入一次管理員密碼（`180156`）或編輯者密碼（`6830`）後，App 即永久記住身分，下次開啟直接進入編輯／管理員狀態。
   - 提供「🚪 登出」按鈕，方便一鍵退回訪客檢視模式。
4. **四大板塊清楚陳列**：
   - 📝 **作業**（支援截止倒數提醒）
   - 📋 **考試／評量**
   - 📦 **繳交項目**
   - 🔔 **重要提醒**
5. **最高管理員專屬功能**：
   - 班級公告即時修改。
   - 🕒 **72 小時歷史快照版本瀏覽與一鍵防呆還原**。

---

## 🛠️ 開發技術棧 (Tech Stack)

| 層級 | 技術選型 |
| :--- | :--- |
| **程式語言** | Kotlin 2.0.20 |
| **UI 框架** | Jetpack Compose (Material 3) |
| **視覺特效庫** | `io.github.kyant0:backdrop:0.2.2` (Liquid Glass / AGSL) |
| **雲端資料庫** | Supabase Kotlin SDK (`postgrest-kt`, `realtime-kt`) |
| **HTTP 引擎** | Ktor Client (OkHttp) |
| **持久化設定** | AndroidX Jetpack DataStore Preferences |
| **最低版本支援**| Android 8.0 (API 26)+，最佳體驗 Android 12+ (API 31+) |

---

## 🚀 如何在 Android Studio 中開啟與編譯？

1. 下載並安裝最新版 [Android Studio](https://developer.android.com/studio)（推薦 Hedgehog 或更高版本，內建 JDK 17）。
2. 在 Android Studio 首頁點擊 **Open**，選取本專案目錄：
   ```
   C:\Users\cljll\Desktop\online-contact-book-android
   ```
3. 等待 Gradle 依賴自動同步完成（第一次開啟會自動自 Maven Central 與 Google 倉庫下載相關依賴）。
4. 連接真實 Android 手機（開啟 USB 調試）或啟動內建模擬器。
5. 點擊頂部綠色 **Run ▶ (Shift + F10)**，即可直接安裝並體驗流暢的液態玻璃即時聯絡簿！

---

## 📦 如何打包成 APK 安裝檔？

在 Android Studio 頂部選單點擊：
> **Build** ➜ **Build Bundle(s) / APK(s)** ➜ **Build APK(s)**

編譯完成後點擊通知中的 **locate**，即可取得 `app-debug.apk`，傳送至手機即可直接點擊安裝使用！
