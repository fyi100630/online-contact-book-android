# 線上班級聯絡簿（Android）

以 Kotlin 與 Jetpack Compose 開發的 Android 班級聯絡簿，透過 Supabase 讀取班級公告與各類事項。

> **倉庫狀態：**目前 `main` 分支只剩 README，無法直接編譯。Android 程式碼和 Gradle 專案仍保存在 Git 歷史中；最後一個含完整 app 原始碼的提交是 [`49b30f2`](https://github.com/fyi100630/online-contact-book-android/tree/49b30f2)。本文件的功能與技術說明依該歷史版本整理。

## 功能

- 檢視班級公告與事項：作業、考試／評量、繳交項目、重要提醒。
- 編輯聯絡簿內容；管理者介面另有公告管理與歷史紀錄還原功能。
- 透過 Supabase Realtime 接收資料變更，更新畫面。
- 檢查 GitHub Releases 並提供 App 內更新流程。
- 回報隨機安裝 ID、App 版本與最後連線時間，用於安裝版本統計。

## 技術與需求

- Kotlin 2.1、Jetpack Compose、Material 3
- Android Gradle Plugin 8.13、JDK 17
- `minSdk 26`（Android 8.0）；歷史版本使用 `compileSdk 35`
- Supabase Kotlin SDK（PostgREST、Realtime）、Ktor、Android DataStore

## 復原原始碼

可在目前分支建立復原分支，將刪除前的 app 與 Gradle 檔案取回：

```bash
git switch -c restore-source
git restore --source=49b30f2 --staged --worktree -- app gradle .gitignore build.gradle.kts gradle.properties settings.gradle.kts gradlew.bat
```

復原後，以 Android Studio 開啟專案，使用 JDK 17。歷史版本沒有附上 Supabase 資料表建立腳本；執行前需自行準備並設定後端資料表及存取政策。此版本的 Gradle 專案只有 Windows 的 `gradlew.bat`，在 macOS／Linux 建置前需補回 Gradle Wrapper 啟動腳本。

## 後端資料

歷史程式會使用以下 Supabase 資料表：

- `contact_book`：班級標題、公告與聯絡簿事項
- `contact_book_logs`：內容變更歷史
- `app_installations`：安裝 ID、App 版本與最後回報時間

資料表 schema 與 Row Level Security（RLS）政策未包含在目前倉庫中。部署前請自行建立 schema，並確認訪客、編輯者與管理者各自能讀寫的資料範圍。

## 開源前請先處理

- 歷史程式將編輯／管理密碼放在 Android 客戶端，登入角色也儲存在裝置上。這只能當介面鎖定，不能當後端授權；請移除或更換這套機制，改由後端驗證並以 RLS 限制資料存取。若舊密碼仍在使用，請先更換。
- App 會回報隨機安裝 ID、版本與時間。公開前請確認這項統計是否仍需要，並在隱私說明中揭露。
- 目前倉庫沒有本專案的 `LICENSE`。請由著作權人決定授權並加入授權檔；公開可見不等於取得任意使用、修改或散布的授權。
- 歷史原始碼包含 `com.kyant` 與 `com.kyant.shapes` 套件的上游程式碼。復原或重新發布時，請保留並檢查上游 [Apache-2.0 授權](https://github.com/Kyant0/AndroidLiquidGlass/blob/master/LICENSE)及必要的第三方聲明。
- 確認 Supabase 金鑰只使用適合放在客戶端的公開金鑰，絕不可把 `service_role` 金鑰、簽署金鑰或其他伺服器密鑰提交到 Git。

## 授權

尚未指定。請在著作權人確認並加入 `LICENSE` 後更新本節。
