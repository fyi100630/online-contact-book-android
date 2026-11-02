package com.rhythmbyte.contactbook.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.text.KeyboardOptions
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

enum class BtnKind { Primary, Secondary, Ghost, Danger }

@Composable
fun CbButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    kind: BtnKind = BtnKind.Primary,
    small: Boolean = false,
    enabled: Boolean = true,
    icon: ImageVector? = null,
) {
    val c = Cb.c
    val shape = RoundedCornerShape(if (small) 8.dp else 10.dp)
    val pad = if (small) PaddingValues(horizontal = 12.dp) else PaddingValues(horizontal = 16.dp)
    val h = if (small) 40.dp else 46.dp
    val content: @Composable RowScope.() -> Unit = {
        if (icon != null) {
            Icon(icon, null, Modifier.size(if (small) 16.dp else 18.dp))
            Spacer(Modifier.width(6.dp))
        }
        Text(text, fontSize = if (small) 14.sp else 15.sp, fontWeight = FontWeight.SemiBold, maxLines = 1)
    }
    when (kind) {
        BtnKind.Primary -> Button(
            onClick, modifier.heightIn(min = h), enabled = enabled, shape = shape, contentPadding = pad,
            colors = ButtonDefaults.buttonColors(containerColor = c.primary, contentColor = c.onPrimary),
            content = content,
        )
        BtnKind.Danger -> TextButton(
            onClick, modifier.heightIn(min = h), enabled = enabled, shape = shape, contentPadding = pad,
            colors = ButtonDefaults.textButtonColors(contentColor = c.red), content = content,
        )
        BtnKind.Secondary -> OutlinedButton(
            onClick, modifier.heightIn(min = h), enabled = enabled, shape = shape, contentPadding = pad,
            border = BorderStroke(1.dp, c.line2),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = c.ink), content = content,
        )
        BtnKind.Ghost -> TextButton(
            onClick, modifier.heightIn(min = h), enabled = enabled, shape = shape, contentPadding = pad,
            colors = ButtonDefaults.textButtonColors(contentColor = c.ink2), content = content,
        )
    }
}

/** 篩選標籤：選取時黑底白字（和網頁一樣） */
@Composable
fun FilterChip(text: String, selected: Boolean, onClick: () -> Unit, count: Int? = null) {
    val c = Cb.c
    Row(
        Modifier
            .heightIn(min = 40.dp)
            .clip(CircleShape)
            .background(if (selected) c.ink else c.bg)
            .border(1.dp, if (selected) c.ink else c.line2, CircleShape)
            .clickable(role = Role.Tab) { onClick() }
            .semantics { this.selected = selected }
            .padding(horizontal = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text, color = if (selected) c.bg else c.ink, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        if (count != null) {
            Spacer(Modifier.width(5.dp))
            Text("$count", color = (if (selected) c.bg else c.ink).copy(alpha = 0.7f), fontSize = 12.sp)
        }
    }
}

@Composable
fun Badge(text: String, fg: androidx.compose.ui.graphics.Color = Cb.c.ink2, bg: androidx.compose.ui.graphics.Color = Cb.c.bg2) {
    Text(
        text,
        Modifier.clip(CircleShape).background(bg).padding(horizontal = 8.dp, vertical = 2.dp),
        color = fg, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, maxLines = 1,
    )
}

@Composable
fun TopBar(title: String, onBack: (() -> Unit)? = null, actions: @Composable RowScope.() -> Unit = {}) {
    val c = Cb.c
    Column(Modifier.background(c.bg).statusBarsPadding()) {
        Row(Modifier.fillMaxWidth().height(60.dp).padding(horizontal = 4.dp), verticalAlignment = Alignment.CenterVertically) {
            if (onBack != null) {
                IconButton(onBack) { Icon(CbIcons.Back, "返回", tint = c.ink) }
            } else {
                Spacer(Modifier.width(12.dp))
            }
            Text(title, Modifier.weight(1f).padding(start = 4.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold, color = c.ink, maxLines = 1, overflow = TextOverflow.Ellipsis)
            actions()
        }
        HorizontalDivider(color = c.line)
    }
}

@Composable
fun Spinner(size: Int = 22) {
    CircularProgressIndicator(Modifier.size(size.dp), color = Cb.c.primary, trackColor = Cb.c.line2, strokeWidth = 2.5.dp)
}

@Composable
fun CenterBox(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(modifier.fillMaxWidth().padding(vertical = 40.dp, horizontal = 16.dp), contentAlignment = Alignment.Center) { content() }
}

@Composable
fun EmptyState(title: String, sub: String? = null, action: (@Composable () -> Unit)? = null) {
    val c = Cb.c
    Column(Modifier.fillMaxWidth().padding(vertical = 40.dp, horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(6.dp)) {
        Text(title, color = c.ink2, fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
        if (sub != null) Text(sub, color = c.ink3, fontSize = 14.sp)
        action?.invoke()
    }
}

@Composable
fun Alert(text: String, danger: Boolean = true) {
    val c = Cb.c
    Text(
        text,
        Modifier.fillMaxWidth().clip(RoundedCornerShape(12.dp)).background(if (danger) c.redSoft else c.warnSoft).padding(horizontal = 14.dp, vertical = 12.dp),
        color = if (danger) c.red else c.warn, fontSize = 14.sp,
    )
}

@Composable
fun FieldLabel(text: String) {
    Text(text, color = Cb.c.ink2, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
}

@Composable
fun CbTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    placeholder: String? = null,
    hint: String? = null,
    maxLength: Int = Int.MAX_VALUE,
    singleLine: Boolean = true,
    minLines: Int = 1,
    password: Boolean = false,
    keyboardType: KeyboardType = KeyboardType.Text,
    leading: ImageVector? = null,
) {
    val c = Cb.c
    Column(modifier, verticalArrangement = Arrangement.spacedBy(6.dp)) {
        if (label != null) FieldLabel(label)
        OutlinedTextField(
            value = value,
            onValueChange = { onValueChange(it.take(maxLength)) },
            modifier = Modifier.fillMaxWidth(),
            singleLine = singleLine,
            minLines = minLines,
            placeholder = placeholder?.let { { Text(it, color = c.ink3) } },
            leadingIcon = leading?.let { { Icon(it, null, tint = c.ink3, modifier = Modifier.size(18.dp)) } },
            visualTransformation = if (password) PasswordVisualTransformation() else androidx.compose.ui.text.input.VisualTransformation.None,
            keyboardOptions = KeyboardOptions(keyboardType = if (password) KeyboardType.Password else keyboardType),
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = c.primary, unfocusedBorderColor = c.line2,
                focusedContainerColor = c.surface, unfocusedContainerColor = c.surface,
                cursorColor = c.primary, focusedTextColor = c.ink, unfocusedTextColor = c.ink,
            ),
            textStyle = TextStyle(fontSize = 16.sp),
        )
        if (hint != null) Text(hint, color = c.ink3, fontSize = 12.sp)
    }
}

/** 網址自動變成可以點的連結（公告、事項說明） */
@Composable
fun linkify(text: String): AnnotatedString {
    val c = Cb.c
    return remember(text, c) {
        val re = Regex("""https?://[^\s<>"'，。、）)】]+""")
        buildAnnotatedString {
            var last = 0
            for (m in re.findAll(text)) {
                append(text.substring(last, m.range.first))
                withLink(LinkAnnotation.Url(m.value, TextLinkStyles(SpanStyle(color = c.primary, fontWeight = FontWeight.SemiBold, textDecoration = TextDecoration.Underline)))) {
                    append(m.value)
                }
                last = m.range.last + 1
            }
            append(text.substring(last))
        }
    }
}

/** Material 日期選擇器；日期一律用 "YYYY-MM-DD" 字串進出 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePick(initial: String?, onPick: (String) -> Unit, onDismiss: () -> Unit) {
    val c = Cb.c
    val millis = initial?.let { LocalDate.parse(it).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli() }
    val state = rememberDatePickerState(initialSelectedDateMillis = millis)
    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton({
                state.selectedDateMillis?.let { onPick(Instant.ofEpochMilli(it).atZone(ZoneOffset.UTC).toLocalDate().toString()) }
                onDismiss()
            }) { Text("確定", color = c.primary) }
        },
        dismissButton = { TextButton(onDismiss) { Text("取消", color = c.ink2) } },
        colors = DatePickerDefaults.colors(containerColor = c.surface),
    ) {
        DatePicker(state, showModeToggle = false, colors = DatePickerDefaults.colors(containerColor = c.surface, selectedDayContainerColor = c.primary, todayDateBorderColor = c.ink3, todayContentColor = c.ink))
    }
}
