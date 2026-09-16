package com.rhythmbyte.contactbook.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import java.util.regex.Pattern

private val URL_PATTERN = Pattern.compile("(https?://[^\\s<>，。！？（）「」『』]+)")

@Composable
fun ClickableLinkText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onSurface,
    linkColor: Color = Color(0xFF92400E),
    fontSize: TextUnit = 13.sp,
    lineHeight: TextUnit = 18.sp,
    fontWeight: FontWeight = FontWeight.Medium
) {
    val annotatedString = remember(text, color, linkColor) {
        val matcher = URL_PATTERN.matcher(text)
        val matches = mutableListOf<Pair<IntRange, String>>()
        while (matcher.find()) {
            val rawUrl = matcher.group()
            val cleanUrl = rawUrl.trimEnd('.', ',', ';', ':', '!', '?', '。', '，')
            val start = matcher.start()
            val end = start + cleanUrl.length
            matches.add(start..end to cleanUrl)
        }

        if (matches.isEmpty()) {
            buildAnnotatedString { append(text) }
        } else {
            buildAnnotatedString {
                var currentIndex = 0
                for ((range, url) in matches) {
                    if (range.first > currentIndex) {
                        append(text.substring(currentIndex, range.first))
                    }
                    val linkAnnotation = LinkAnnotation.Url(
                        url = url,
                        styles = TextLinkStyles(
                            style = SpanStyle(
                                color = linkColor,
                                fontWeight = FontWeight.Bold,
                                textDecoration = TextDecoration.Underline
                            )
                        )
                    )
                    pushLink(linkAnnotation)
                    append(url)
                    pop()
                    currentIndex = range.last
                }
                if (currentIndex < text.length) {
                    append(text.substring(currentIndex))
                }
            }
        }
    }

    Text(
        text = annotatedString,
        modifier = modifier,
        style = TextStyle(
            color = color,
            fontSize = fontSize,
            lineHeight = lineHeight,
            fontWeight = fontWeight
        )
    )
}
