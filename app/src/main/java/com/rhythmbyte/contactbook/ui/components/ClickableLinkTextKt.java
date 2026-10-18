package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: ClickableLinkText.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u0014"}, d2 = {"URL_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "ClickableLinkText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "linkColor", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "ClickableLinkText-oLH_Kog", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJJJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ClickableLinkTextKt {
    private static final Pattern URL_PATTERN = Pattern.compile("(https?://[^\\s<>，。！？（）「」『』]+)");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableLinkText_oLH_Kog$lambda$3(String str, Modifier modifier, long j, long j2, long j3, long j4, FontWeight fontWeight, int i, int i2, Composer composer, int i3) {
        m6729ClickableLinkTextoLH_Kog(str, modifier, j, j2, j3, j4, fontWeight, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:107:0x0160  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0185  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:117:0x0190  */
    /* JADX WARN: Code duplicated, block: B:119:0x0196  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d5 A[LOOP:0: B:134:0x01cf->B:136:0x01d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x020b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0220  */
    /* JADX WARN: Code duplicated, block: B:144:0x0233  */
    /* JADX WARN: Code duplicated, block: B:146:0x024d  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:155:0x035f  */
    /* JADX WARN: Code duplicated, block: B:159:0x036f  */
    /* JADX WARN: Code duplicated, block: B:164:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    /* JADX INFO: renamed from: ClickableLinkText-oLH_Kog, reason: not valid java name */
    public static final void m6729ClickableLinkTextoLH_Kog(final String text, Modifier modifier, long j, long j2, long j3, long j4, FontWeight fontWeight, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long jColor;
        int i5;
        int i6;
        long j5;
        int i7;
        int i8;
        long j6;
        int i9;
        int i10;
        int i11;
        long onSurface;
        final long sp;
        long sp2;
        FontWeight medium;
        long j7;
        boolean z;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        Matcher matcher;
        ArrayList<Pair> arrayList;
        FontWeight fontWeight2;
        int last;
        AnnotatedString.Builder builder;
        int i12;
        AnnotatedString annotatedString;
        IntRange intRange;
        Composer composer2;
        final FontWeight fontWeight3;
        final long j8;
        final Modifier modifier3;
        final long j9;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1676027483);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ClickableLinkText)P(6,5,0:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.unit.TextUnit,3:c#ui.unit.TextUnit)31@1145L1594,73@2745L242:ClickableLinkText.kt#7ivg5k");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0 || !composerStartRestartGroup.changed(j)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i3 |= i13;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    jColor = j2;
                    if (composerStartRestartGroup.changed(jColor)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                    j5 = j3;
                } else {
                    j5 = j3;
                    if ((i & 24576) == 0) {
                        if (composerStartRestartGroup.changed(j5)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(j6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(fontWeight)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                            i3 &= -897;
                        } else {
                            onSurface = j;
                        }
                        if (i4 != 0) {
                            jColor = ColorKt.Color(4287774734L);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j5;
                        }
                        if (i8 != 0) {
                            sp2 = TextUnitKt.getSp(18);
                        } else {
                            sp2 = j6;
                        }
                        if (i10 != 0) {
                            medium = FontWeight.INSTANCE.getMedium();
                        } else {
                            medium = fontWeight;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        onSurface = j;
                        medium = fontWeight;
                        sp = j5;
                        sp2 = j6;
                    }
                    j7 = jColor;
                    Modifier modifier4 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
                    }
                    composerStartRestartGroup.startReplaceGroup(582510301);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
                    if ((i3 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z4 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z4 | z2;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        matcher = URL_PATTERN.matcher(text);
                        arrayList = new ArrayList();
                        while (matcher.find()) {
                            String strGroup = matcher.group();
                            Intrinsics.checkNotNull(strGroup);
                            String strTrimEnd = StringsKt.trimEnd(strGroup, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                            int iStart = matcher.start();
                            arrayList.add(TuplesKt.to(new IntRange(iStart, iStart + strTrimEnd.length()), strTrimEnd));
                            medium = medium;
                        }
                        fontWeight2 = medium;
                        if (arrayList.isEmpty()) {
                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                            builder2.append(text);
                            annotatedString = builder2.toAnnotatedString();
                            i12 = i3;
                        } else {
                            last = 0;
                            builder = new AnnotatedString.Builder(0, 1, null);
                            for (Pair pair : arrayList) {
                                intRange = (IntRange) pair.component1();
                                String str = (String) pair.component2();
                                int i15 = i3;
                                if (intRange.getFirst() > last) {
                                    String strSubstring = text.substring(last, intRange.getFirst());
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                    builder.append(strSubstring);
                                }
                                builder.pushLink(new LinkAnnotation.Url(str, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                                builder.append(str);
                                builder.pop();
                                last = intRange.getLast();
                                i3 = i15;
                            }
                            i12 = i3;
                            if (last < text.length()) {
                                String strSubstring2 = text.substring(last);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                builder.append(strSubstring2);
                            }
                            annotatedString = builder.toAnnotatedString();
                        }
                        objRememberedValue = annotatedString;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        fontWeight2 = medium;
                        i12 = i3;
                        j7 = j7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    FontWeight fontWeight4 = fontWeight2;
                    long j11 = sp2;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight4, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j11, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontWeight3 = fontWeight4;
                    j8 = onSurface;
                    modifier3 = modifier4;
                    j9 = j11;
                    j10 = j7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j8 = j;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    sp = j5;
                    j9 = j6;
                    j10 = jColor;
                    fontWeight3 = fontWeight;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.ClickableLinkTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ClickableLinkTextKt.ClickableLinkText_oLH_Kog$lambda$3(text, modifier3, j8, j10, sp, j9, fontWeight3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            jColor = j2;
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= 24576;
                j5 = j3;
            } else {
                j5 = j3;
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(j5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(j6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(fontWeight)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i3 & 599187) == 599186) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                }
                j7 = jColor;
                Modifier modifier5 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
                }
                composerStartRestartGroup.startReplaceGroup(582510301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
                if ((i3 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z5 | z2;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup2 = matcher.group();
                        Intrinsics.checkNotNull(strGroup2);
                        String strTrimEnd2 = StringsKt.trimEnd(strGroup2, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart2 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart2, iStart2 + strTrimEnd2.length()), strTrimEnd2));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder3 = new AnnotatedString.Builder(0, 1, null);
                        builder3.append(text);
                        annotatedString = builder3.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str2 = (String) pair.component2();
                            int i16 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring3 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                builder.append(strSubstring3);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str2, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str2);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i16;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring4 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                            builder.append(strSubstring4);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup3 = matcher.group();
                        Intrinsics.checkNotNull(strGroup3);
                        String strTrimEnd3 = StringsKt.trimEnd(strGroup3, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart3 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart3, iStart3 + strTrimEnd3.length()), strTrimEnd3));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder4 = new AnnotatedString.Builder(0, 1, null);
                        builder4.append(text);
                        annotatedString = builder4.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str3 = (String) pair.component2();
                            int i17 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring5 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                                builder.append(strSubstring5);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str3, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str3);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i17;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring6 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                            builder.append(strSubstring6);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                FontWeight fontWeight5 = fontWeight2;
                long j12 = sp2;
                composer2 = composerStartRestartGroup;
                TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight5, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j12, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontWeight3 = fontWeight5;
                j8 = onSurface;
                modifier3 = modifier5;
                j9 = j12;
                j10 = j7;
            } else {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                }
                j7 = jColor;
                Modifier modifier6 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
                }
                composerStartRestartGroup.startReplaceGroup(582510301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
                if ((i3 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z6 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z6 | z2;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup4 = matcher.group();
                        Intrinsics.checkNotNull(strGroup4);
                        String strTrimEnd4 = StringsKt.trimEnd(strGroup4, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart4 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart4, iStart4 + strTrimEnd4.length()), strTrimEnd4));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder5 = new AnnotatedString.Builder(0, 1, null);
                        builder5.append(text);
                        annotatedString = builder5.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str4 = (String) pair.component2();
                            int i18 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring7 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                                builder.append(strSubstring7);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str4, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str4);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i18;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring8 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring8, "substring(...)");
                            builder.append(strSubstring8);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup5 = matcher.group();
                        Intrinsics.checkNotNull(strGroup5);
                        String strTrimEnd5 = StringsKt.trimEnd(strGroup5, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart5 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart5, iStart5 + strTrimEnd5.length()), strTrimEnd5));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder6 = new AnnotatedString.Builder(0, 1, null);
                        builder6.append(text);
                        annotatedString = builder6.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str5 = (String) pair.component2();
                            int i19 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring9 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring9, "substring(...)");
                                builder.append(strSubstring9);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str5, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str5);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i19;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring10 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring10, "substring(...)");
                            builder.append(strSubstring10);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                FontWeight fontWeight6 = fontWeight2;
                long j13 = sp2;
                composer2 = composerStartRestartGroup;
                TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight6, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j13, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontWeight3 = fontWeight6;
                j8 = onSurface;
                modifier3 = modifier6;
                j9 = j13;
                j10 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.ClickableLinkTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ClickableLinkTextKt.ClickableLinkText_oLH_Kog$lambda$3(text, modifier3, j8, j10, sp, j9, fontWeight3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
            if ((i2 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i3 |= i13;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                jColor = j2;
                if (composerStartRestartGroup.changed(jColor)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= 24576;
                j5 = j3;
            } else {
                j5 = j3;
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(j5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(j6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(fontWeight)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i3 & 599187) == 599186) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                }
                j7 = jColor;
                Modifier modifier7 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
                }
                composerStartRestartGroup.startReplaceGroup(582510301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
                if ((i3 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z7 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z7 | z2;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup6 = matcher.group();
                        Intrinsics.checkNotNull(strGroup6);
                        String strTrimEnd6 = StringsKt.trimEnd(strGroup6, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart6 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart6, iStart6 + strTrimEnd6.length()), strTrimEnd6));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder7 = new AnnotatedString.Builder(0, 1, null);
                        builder7.append(text);
                        annotatedString = builder7.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str6 = (String) pair.component2();
                            int i110 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring11 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring11, "substring(...)");
                                builder.append(strSubstring11);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str6, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str6);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i110;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring12 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring12, "substring(...)");
                            builder.append(strSubstring12);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup7 = matcher.group();
                        Intrinsics.checkNotNull(strGroup7);
                        String strTrimEnd7 = StringsKt.trimEnd(strGroup7, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart7 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart7, iStart7 + strTrimEnd7.length()), strTrimEnd7));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder8 = new AnnotatedString.Builder(0, 1, null);
                        builder8.append(text);
                        annotatedString = builder8.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str7 = (String) pair.component2();
                            int i111 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring13 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring13, "substring(...)");
                                builder.append(strSubstring13);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str7, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str7);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i111;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring14 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring14, "substring(...)");
                            builder.append(strSubstring14);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                FontWeight fontWeight7 = fontWeight2;
                long j14 = sp2;
                composer2 = composerStartRestartGroup;
                TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier7, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight7, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j14, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontWeight3 = fontWeight7;
                j8 = onSurface;
                modifier3 = modifier7;
                j9 = j14;
                j10 = j7;
            } else {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                        i3 &= -897;
                    } else {
                        onSurface = j;
                    }
                    if (i4 != 0) {
                        jColor = ColorKt.Color(4287774734L);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j5;
                    }
                    if (i8 != 0) {
                        sp2 = TextUnitKt.getSp(18);
                    } else {
                        sp2 = j6;
                    }
                    if (i10 != 0) {
                        medium = FontWeight.INSTANCE.getMedium();
                    } else {
                        medium = fontWeight;
                    }
                }
                j7 = jColor;
                Modifier modifier8 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
                }
                composerStartRestartGroup.startReplaceGroup(582510301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
                if ((i3 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z8 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z8 | z2;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup8 = matcher.group();
                        Intrinsics.checkNotNull(strGroup8);
                        String strTrimEnd8 = StringsKt.trimEnd(strGroup8, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart8 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart8, iStart8 + strTrimEnd8.length()), strTrimEnd8));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder9 = new AnnotatedString.Builder(0, 1, null);
                        builder9.append(text);
                        annotatedString = builder9.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str8 = (String) pair.component2();
                            int i112 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring15 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring15, "substring(...)");
                                builder.append(strSubstring15);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str8, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str8);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i112;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring16 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring16, "substring(...)");
                            builder.append(strSubstring16);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    matcher = URL_PATTERN.matcher(text);
                    arrayList = new ArrayList();
                    while (matcher.find()) {
                        String strGroup9 = matcher.group();
                        Intrinsics.checkNotNull(strGroup9);
                        String strTrimEnd9 = StringsKt.trimEnd(strGroup9, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                        int iStart9 = matcher.start();
                        arrayList.add(TuplesKt.to(new IntRange(iStart9, iStart9 + strTrimEnd9.length()), strTrimEnd9));
                        medium = medium;
                    }
                    fontWeight2 = medium;
                    if (arrayList.isEmpty()) {
                        AnnotatedString.Builder builder10 = new AnnotatedString.Builder(0, 1, null);
                        builder10.append(text);
                        annotatedString = builder10.toAnnotatedString();
                        i12 = i3;
                    } else {
                        last = 0;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        while (r6.hasNext()) {
                            intRange = (IntRange) pair.component1();
                            String str9 = (String) pair.component2();
                            int i113 = i3;
                            if (intRange.getFirst() > last) {
                                String strSubstring17 = text.substring(last, intRange.getFirst());
                                Intrinsics.checkNotNullExpressionValue(strSubstring17, "substring(...)");
                                builder.append(strSubstring17);
                            }
                            builder.pushLink(new LinkAnnotation.Url(str9, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                            builder.append(str9);
                            builder.pop();
                            last = intRange.getLast();
                            i3 = i113;
                        }
                        i12 = i3;
                        if (last < text.length()) {
                            String strSubstring18 = text.substring(last);
                            Intrinsics.checkNotNullExpressionValue(strSubstring18, "substring(...)");
                            builder.append(strSubstring18);
                        }
                        annotatedString = builder.toAnnotatedString();
                    }
                    objRememberedValue = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                FontWeight fontWeight8 = fontWeight2;
                long j15 = sp2;
                composer2 = composerStartRestartGroup;
                TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier8, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight8, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j15, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontWeight3 = fontWeight8;
                j8 = onSurface;
                modifier3 = modifier8;
                j9 = j15;
                j10 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.ClickableLinkTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ClickableLinkTextKt.ClickableLinkText_oLH_Kog$lambda$3(text, modifier3, j8, j10, sp, j9, fontWeight3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        jColor = j2;
        i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
            j5 = j3;
        } else {
            j5 = j3;
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(j5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            j6 = j4;
        } else {
            j6 = j4;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(j6)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(fontWeight)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i3 & 599187) == 599186) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                    i3 &= -897;
                } else {
                    onSurface = j;
                }
                if (i4 != 0) {
                    jColor = ColorKt.Color(4287774734L);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j5;
                }
                if (i8 != 0) {
                    sp2 = TextUnitKt.getSp(18);
                } else {
                    sp2 = j6;
                }
                if (i10 != 0) {
                    medium = FontWeight.INSTANCE.getMedium();
                } else {
                    medium = fontWeight;
                }
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                    i3 &= -897;
                } else {
                    onSurface = j;
                }
                if (i4 != 0) {
                    jColor = ColorKt.Color(4287774734L);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j5;
                }
                if (i8 != 0) {
                    sp2 = TextUnitKt.getSp(18);
                } else {
                    sp2 = j6;
                }
                if (i10 != 0) {
                    medium = FontWeight.INSTANCE.getMedium();
                } else {
                    medium = fontWeight;
                }
            }
            j7 = jColor;
            Modifier modifier9 = modifier2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
            }
            composerStartRestartGroup.startReplaceGroup(582510301);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean z9 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z9 | z2;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3) {
                matcher = URL_PATTERN.matcher(text);
                arrayList = new ArrayList();
                while (matcher.find()) {
                    String strGroup10 = matcher.group();
                    Intrinsics.checkNotNull(strGroup10);
                    String strTrimEnd10 = StringsKt.trimEnd(strGroup10, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                    int iStart10 = matcher.start();
                    arrayList.add(TuplesKt.to(new IntRange(iStart10, iStart10 + strTrimEnd10.length()), strTrimEnd10));
                    medium = medium;
                }
                fontWeight2 = medium;
                if (arrayList.isEmpty()) {
                    AnnotatedString.Builder builder11 = new AnnotatedString.Builder(0, 1, null);
                    builder11.append(text);
                    annotatedString = builder11.toAnnotatedString();
                    i12 = i3;
                } else {
                    last = 0;
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r6.hasNext()) {
                        intRange = (IntRange) pair.component1();
                        String str10 = (String) pair.component2();
                        int i114 = i3;
                        if (intRange.getFirst() > last) {
                            String strSubstring19 = text.substring(last, intRange.getFirst());
                            Intrinsics.checkNotNullExpressionValue(strSubstring19, "substring(...)");
                            builder.append(strSubstring19);
                        }
                        builder.pushLink(new LinkAnnotation.Url(str10, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                        builder.append(str10);
                        builder.pop();
                        last = intRange.getLast();
                        i3 = i114;
                    }
                    i12 = i3;
                    if (last < text.length()) {
                        String strSubstring110 = text.substring(last);
                        Intrinsics.checkNotNullExpressionValue(strSubstring110, "substring(...)");
                        builder.append(strSubstring110);
                    }
                    annotatedString = builder.toAnnotatedString();
                }
                objRememberedValue = annotatedString;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                matcher = URL_PATTERN.matcher(text);
                arrayList = new ArrayList();
                while (matcher.find()) {
                    String strGroup11 = matcher.group();
                    Intrinsics.checkNotNull(strGroup11);
                    String strTrimEnd11 = StringsKt.trimEnd(strGroup11, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                    int iStart11 = matcher.start();
                    arrayList.add(TuplesKt.to(new IntRange(iStart11, iStart11 + strTrimEnd11.length()), strTrimEnd11));
                    medium = medium;
                }
                fontWeight2 = medium;
                if (arrayList.isEmpty()) {
                    AnnotatedString.Builder builder12 = new AnnotatedString.Builder(0, 1, null);
                    builder12.append(text);
                    annotatedString = builder12.toAnnotatedString();
                    i12 = i3;
                } else {
                    last = 0;
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r6.hasNext()) {
                        intRange = (IntRange) pair.component1();
                        String str11 = (String) pair.component2();
                        int i115 = i3;
                        if (intRange.getFirst() > last) {
                            String strSubstring111 = text.substring(last, intRange.getFirst());
                            Intrinsics.checkNotNullExpressionValue(strSubstring111, "substring(...)");
                            builder.append(strSubstring111);
                        }
                        builder.pushLink(new LinkAnnotation.Url(str11, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                        builder.append(str11);
                        builder.pop();
                        last = intRange.getLast();
                        i3 = i115;
                    }
                    i12 = i3;
                    if (last < text.length()) {
                        String strSubstring112 = text.substring(last);
                        Intrinsics.checkNotNullExpressionValue(strSubstring112, "substring(...)");
                        builder.append(strSubstring112);
                    }
                    annotatedString = builder.toAnnotatedString();
                }
                objRememberedValue = annotatedString;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FontWeight fontWeight9 = fontWeight2;
            long j16 = sp2;
            composer2 = composerStartRestartGroup;
            TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier9, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight9, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j16, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontWeight3 = fontWeight9;
            j8 = onSurface;
            modifier3 = modifier9;
            j9 = j16;
            j10 = j7;
        } else {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "25@937L11");
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                    i3 &= -897;
                } else {
                    onSurface = j;
                }
                if (i4 != 0) {
                    jColor = ColorKt.Color(4287774734L);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j5;
                }
                if (i8 != 0) {
                    sp2 = TextUnitKt.getSp(18);
                } else {
                    sp2 = j6;
                }
                if (i10 != 0) {
                    medium = FontWeight.INSTANCE.getMedium();
                } else {
                    medium = fontWeight;
                }
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                    i3 &= -897;
                } else {
                    onSurface = j;
                }
                if (i4 != 0) {
                    jColor = ColorKt.Color(4287774734L);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j5;
                }
                if (i8 != 0) {
                    sp2 = TextUnitKt.getSp(18);
                } else {
                    sp2 = j6;
                }
                if (i10 != 0) {
                    medium = FontWeight.INSTANCE.getMedium();
                } else {
                    medium = fontWeight;
                }
            }
            j7 = jColor;
            Modifier modifier10 = modifier2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676027483, i3, -1, "com.rhythmbyte.contactbook.ui.components.ClickableLinkText (ClickableLinkText.kt:30)");
            }
            composerStartRestartGroup.startReplaceGroup(582510301);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ClickableLinkText.kt#9igjgp");
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean z10 = z | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(onSurface)) || (i3 & 384) == 256);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z10 | z2;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3) {
                matcher = URL_PATTERN.matcher(text);
                arrayList = new ArrayList();
                while (matcher.find()) {
                    String strGroup12 = matcher.group();
                    Intrinsics.checkNotNull(strGroup12);
                    String strTrimEnd12 = StringsKt.trimEnd(strGroup12, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                    int iStart12 = matcher.start();
                    arrayList.add(TuplesKt.to(new IntRange(iStart12, iStart12 + strTrimEnd12.length()), strTrimEnd12));
                    medium = medium;
                }
                fontWeight2 = medium;
                if (arrayList.isEmpty()) {
                    AnnotatedString.Builder builder13 = new AnnotatedString.Builder(0, 1, null);
                    builder13.append(text);
                    annotatedString = builder13.toAnnotatedString();
                    i12 = i3;
                } else {
                    last = 0;
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r6.hasNext()) {
                        intRange = (IntRange) pair.component1();
                        String str12 = (String) pair.component2();
                        int i116 = i3;
                        if (intRange.getFirst() > last) {
                            String strSubstring113 = text.substring(last, intRange.getFirst());
                            Intrinsics.checkNotNullExpressionValue(strSubstring113, "substring(...)");
                            builder.append(strSubstring113);
                        }
                        builder.pushLink(new LinkAnnotation.Url(str12, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                        builder.append(str12);
                        builder.pop();
                        last = intRange.getLast();
                        i3 = i116;
                    }
                    i12 = i3;
                    if (last < text.length()) {
                        String strSubstring114 = text.substring(last);
                        Intrinsics.checkNotNullExpressionValue(strSubstring114, "substring(...)");
                        builder.append(strSubstring114);
                    }
                    annotatedString = builder.toAnnotatedString();
                }
                objRememberedValue = annotatedString;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                matcher = URL_PATTERN.matcher(text);
                arrayList = new ArrayList();
                while (matcher.find()) {
                    String strGroup13 = matcher.group();
                    Intrinsics.checkNotNull(strGroup13);
                    String strTrimEnd13 = StringsKt.trimEnd(strGroup13, '.', AbstractJsonLexerKt.COMMA, ';', AbstractJsonLexerKt.COLON, '!', '?', 12290, 65292);
                    int iStart13 = matcher.start();
                    arrayList.add(TuplesKt.to(new IntRange(iStart13, iStart13 + strTrimEnd13.length()), strTrimEnd13));
                    medium = medium;
                }
                fontWeight2 = medium;
                if (arrayList.isEmpty()) {
                    AnnotatedString.Builder builder14 = new AnnotatedString.Builder(0, 1, null);
                    builder14.append(text);
                    annotatedString = builder14.toAnnotatedString();
                    i12 = i3;
                } else {
                    last = 0;
                    builder = new AnnotatedString.Builder(0, 1, null);
                    while (r6.hasNext()) {
                        intRange = (IntRange) pair.component1();
                        String str13 = (String) pair.component2();
                        int i117 = i3;
                        if (intRange.getFirst() > last) {
                            String strSubstring115 = text.substring(last, intRange.getFirst());
                            Intrinsics.checkNotNullExpressionValue(strSubstring115, "substring(...)");
                            builder.append(strSubstring115);
                        }
                        builder.pushLink(new LinkAnnotation.Url(str13, new TextLinkStyles(new SpanStyle(j7, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), null, 4, null));
                        builder.append(str13);
                        builder.pop();
                        last = intRange.getLast();
                        i3 = i117;
                    }
                    i12 = i3;
                    if (last < text.length()) {
                        String strSubstring116 = text.substring(last);
                        Intrinsics.checkNotNullExpressionValue(strSubstring116, "substring(...)");
                        builder.append(strSubstring116);
                    }
                    annotatedString = builder.toAnnotatedString();
                }
                objRememberedValue = annotatedString;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FontWeight fontWeight10 = fontWeight2;
            long j17 = sp2;
            composer2 = composerStartRestartGroup;
            TextKt.m2377TextIbK3jfQ((AnnotatedString) objRememberedValue, modifier10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(onSurface, sp, fontWeight10, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j17, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (DefaultConstructorMarker) null), composer2, i12 & 112, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontWeight3 = fontWeight10;
            j8 = onSurface;
            modifier3 = modifier10;
            j9 = j17;
            j10 = j7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.ClickableLinkTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClickableLinkTextKt.ClickableLinkText_oLH_Kog$lambda$3(text, modifier3, j8, j10, sp, j9, fontWeight3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
