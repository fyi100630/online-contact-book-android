#!/usr/bin/env bash
# 驗證發布用的金鑰：密碼對不對、別名在不在、簽章和舊版 APK 是不是同一把。
# 只印出「公開」的資訊（別名、憑證指紋），不會印出任何密碼。
#
# 用法：scripts/verify-signing.sh <金鑰檔> <舊版 APK> <apksigner 路徑>
# 密碼從環境變數讀：KEYSTORE_PASSWORD、KEY_PASSWORD、KEY_ALIAS
set -u
KS=${1:?金鑰檔}; OLD_APK=${2:?舊版 APK}; APKSIGNER=${3:?apksigner}
: "${KEYSTORE_PASSWORD:?沒有設定 KEYSTORE_PASSWORD}" "${KEY_PASSWORD:?沒有設定 KEY_PASSWORD}" "${KEY_ALIAS:?沒有設定 KEY_ALIAS}"

fail() { echo "❌ $1"; [ -n "${GITHUB_ACTIONS:-}" ] && echo "::error::$1"; exit 1; }

# 1. 金鑰庫密碼
out=$(keytool -list -v -keystore "$KS" -storepass:env KEYSTORE_PASSWORD 2>&1) || {
  echo "$out" | grep -qi 'password was incorrect\|Keystore was tampered' \
    && fail "KEYSTORE_PASSWORD（金鑰庫密碼）不對" \
    || fail "金鑰檔打不開，可能是 KEYSTORE_BASE64 沒貼完整：$(echo "$out" | grep -v 'Picked up' | head -2 | tr '\n' ' ')"
}
echo "✅ KEYSTORE_PASSWORD 正確"

# 2. 別名
echo "$out" | grep -q "^Alias name: $KEY_ALIAS\$" || fail "找不到別名「$KEY_ALIAS」。金鑰檔裡有的別名：$(echo "$out" | grep '^Alias name:' | sed 's/Alias name: //' | tr '\n' ' ')"
echo "✅ KEY_ALIAS 正確（$KEY_ALIAS）"

# 3. 金鑰（私鑰）密碼：實際拿它簽一個空的 jar，簽得出來才算對
tmp=$(mktemp -d); trap 'rm -rf "$tmp"' EXIT
echo test > "$tmp/t.txt"; (cd "$tmp" && jar cf t.jar t.txt)
jarsigner -keystore "$KS" -storepass:env KEYSTORE_PASSWORD -keypass:env KEY_PASSWORD "$tmp/t.jar" "$KEY_ALIAS" >/dev/null 2>&1 \
  || fail "KEY_PASSWORD（金鑰密碼）不對。PKCS12 的金鑰密碼通常和金鑰庫密碼一樣"
echo "✅ KEY_PASSWORD 正確"

# 4. 和舊版 APK 的簽章是不是同一把
new=$(echo "$out" | awk -v a="$KEY_ALIAS" '$0=="Alias name: " a {f=1} f && /SHA256:/ {print $2; exit}' | tr -d ':' | tr 'A-F' 'a-f')
old=$("$APKSIGNER" verify --print-certs "$OLD_APK" 2>/dev/null | grep -m1 'SHA-256 digest' | awk '{print $NF}' | tr 'A-F' 'a-f')
[ -n "$old" ] || fail "讀不到舊版 APK 的簽章"
echo "金鑰檔的指紋（SHA-256）：$new"
echo "舊版 v2.0.0 的指紋     ：$old"
[ "$new" = "$old" ] || fail "簽章和 v2.0.0 不同：用這把金鑰發布的話，舊使用者無法直接更新（要先移除舊 App）"
echo "✅ 和 v2.0.0 是同一把金鑰，舊使用者可以直接更新"
