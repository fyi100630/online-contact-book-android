# 班級聯絡簿 Android（APK 復原版）

這份資料是從 Android APK 2.0.0 解出的 Java 類別與 Android 資源，供閱讀與整理使用。它不是原始 Kotlin 專案：Compose 編譯後的程式已轉成近似 Java，原始註解、Gradle 設定與完整 Kotlin 結構無法從 APK 還原；本資料夾也不是可直接建置的 Android Studio 專案。

已移除需要外部連線的資料存取、更新下載與安裝統計傳送；對應介面或呼叫可能仍留有反編譯後的佔位程式。`OfflineDataRepository` 目前不保存資料，需另行實作本機儲存，才能讓新增、編輯、歷史與課表資料持續保存。更新流程也已停用。

`app/src/main/java/com/kyant` 內含上游 Liquid Glass／shape 程式碼，授權文字見 `THIRD_PARTY_LICENSES/Apache-2.0.txt`。上傳前請由著作權人為本專案選擇授權，並完成反編譯程式的人工檢查。
