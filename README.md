# 📖 班級聯絡簿（唯讀模式）

這是專為班級同學與家長設計的**唯讀模式（View-Only）**線上班級聯絡簿。

---

## ✨ 版本特點
- 🔒 **純檢視無編輯權限**：介面徹底拔除所有「新增」、「編輯」、「刪除」等操作按鈕與表單，杜絕誤觸或同學惡作劇竄改。
- 🔄 **毫秒級即時同步**：與管理版（管理者編輯）共用同一個 Firebase Realtime Database，管理者一修改，同學端 0.1 秒內畫面自動無痛更新，無需重新整理。
- ⚡ **0 毫秒秒開**：本機快取優先載入，打開網頁瞬間呈現最新聯絡簿內容。
- 📱 **手機響應式液態玻璃**：精美 Liquid Glass 質感設計，適應所有手機與平板螢幕。

---

## 🚀 部署至 GitHub Pages 步驟

1. 在 GitHub 上建立一個新的公開倉庫（Repository），例如命名為：  
   `online-contact-book-view` 或 `online-contact-book-lys-view`
2. 在此資料夾 (`C:\Users\fyi10\Desktop\47v`) 開啟終端機並執行：
   ```bash
   git remote add origin https://github.com/你的帳號/倉庫名稱.git
   git branch -M main
   git push -u origin main
   ```
3. 前往 GitHub 倉庫的 **Settings ➔ Pages**：
   - **Branch** 選擇 `main`，目錄選擇 `/ (root)`。
   - 點擊 **Save**。
4. 約 1 分鐘後即可取得同學專屬的檢視連結（例如：`https://你的帳號.github.io/倉庫名稱/`）！
