package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.backdrops.LayerBackdrop;
import com.kyant.backdrop.backdrops.LayerBackdropKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiquidBottomTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a\u009a\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0004X\u008a\u008e\u0002"}, d2 = {"LiquidBottomTabs", "", "selectedTabIndex", "Lkotlin/Function0;", "", "onTabSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "tabsCount", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "accentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "content", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "LiquidBottomTabs--42sRYA", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/kyant/backdrop/Backdrop;ILandroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "app_release", "panelOffset", "", "currentIndex"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidBottomTabsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidBottomTabs__42sRYA$lambda$0(Function0 function0, Function1 function1, Backdrop backdrop, int i, Modifier modifier, boolean z, Color color, Color color2, Function3 function3, int i2, int i3, Composer composer, int i4) {
        m6781LiquidBottomTabs42sRYA(function0, function1, backdrop, i, modifier, z, color, color2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x0168  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x0208  */
    /* JADX WARN: Code duplicated, block: B:144:0x0216  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX INFO: renamed from: LiquidBottomTabs--42sRYA, reason: not valid java name */
    public static final void m6781LiquidBottomTabs42sRYA(final Function0<Integer> selectedTabIndex, final Function1<? super Integer, Unit> onTabSelected, final Backdrop backdrop, final int i, Modifier modifier, boolean z, Color color, Color color2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        Color color3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier3;
        boolean z3;
        Color color4;
        Color color5;
        boolean zIsSystemInDarkTheme;
        long jM3880getWhite0d7_KjU;
        long jColor;
        long jM3842copywmQWz5c$default;
        final Color color6;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selectedTabIndex, "selectedTabIndex");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1445884491);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidBottomTabs)P(7,6,1,8,5,4,0:c#ui.graphics.Color,2:c#ui.graphics.Color)70@2900L21,74@3172L43,79@3314L9391,76@3221L9484:LiquidBottomTabs.kt#9hgvmo");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(selectedTabIndex) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTabSelected) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(backdrop) : composerStartRestartGroup.changedInstance(backdrop) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
        }
        int i14 = i3 & 16;
        if (i14 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    if ((1572864 & i2) == 0) {
                        color3 = color;
                        if (composerStartRestartGroup.changed(color3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                        if ((i2 & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(color2)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i4 |= i11;
                        }
                        if ((i3 & 256) != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i12 = 33554432;
                            }
                            i4 |= i12;
                        }
                        i13 = i4;
                        if ((38347923 & i13) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i14 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                color4 = null;
                            } else {
                                color4 = color3;
                            }
                            if (i10 != 0) {
                                color5 = null;
                            } else {
                                color5 = color2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                            }
                            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                            boolean z5 = !zIsSystemInDarkTheme;
                            if (color4 != null) {
                                jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                            } else if (zIsSystemInDarkTheme) {
                                jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                            }
                            long j = jM3880getWhite0d7_KjU;
                            if (color5 != null) {
                                jM3842copywmQWz5c$default = color5.m3853unboximpl();
                            } else {
                                if (zIsSystemInDarkTheme) {
                                    jColor = ColorKt.Color(4280166715L);
                                } else {
                                    jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                                }
                                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            long j2 = jM3842copywmQWz5c$default;
                            LayerBackdrop layerBackdropRememberLayerBackdrop = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                            boolean z6 = z3;
                            z2 = z6;
                            composerStartRestartGroup = composerStartRestartGroup;
                            Modifier modifier4 = modifier3;
                            BoxWithConstraintsKt.BoxWithConstraints(modifier4, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j2, content, z6, layerBackdropRememberLayerBackdrop, z5, i5, j), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            color6 = color4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            color5 = color2;
                            color6 = color3;
                        }
                        z4 = z2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            final Color color7 = color5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier5, z4, color6, color7, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 12582912;
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((38347923 & i13) == 38347922) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z7 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j3 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j4 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop2 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z8 = z3;
                        z2 = z8;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier6 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier6, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j4, content, z8, layerBackdropRememberLayerBackdrop2, z7, i5, j3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier6;
                        color6 = color4;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z9 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j5 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j6 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop3 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z10 = z3;
                        z2 = z10;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier7 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier7, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j6, content, z10, layerBackdropRememberLayerBackdrop3, z9, i5, j5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier7;
                        color6 = color4;
                    }
                    z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier8 = modifier2;
                        final Color color8 = color5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier8, z4, color6, color8, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                color3 = color;
                i10 = i3 & 128;
                if (i10 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(color2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((38347923 & i13) == 38347922) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z11 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j7 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j8 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop4 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z12 = z3;
                        z2 = z12;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier9 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier9, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j8, content, z12, layerBackdropRememberLayerBackdrop4, z11, i5, j7), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier9;
                        color6 = color4;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z13 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j9 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j10 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop5 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z14 = z3;
                        z2 = z14;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier10 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier10, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j10, content, z14, layerBackdropRememberLayerBackdrop5, z13, i5, j9), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier10;
                        color6 = color4;
                    }
                    z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier11 = modifier2;
                        final Color color9 = color5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier11, z4, color6, color9, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((38347923 & i13) == 38347922) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z15 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j11 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j12 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop6 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z16 = z3;
                    z2 = z16;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier12 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier12, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j12, content, z16, layerBackdropRememberLayerBackdrop6, z15, i5, j11), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier12;
                    color6 = color4;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z17 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j13 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j14 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop7 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z18 = z3;
                    z2 = z18;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier13 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier13, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j14, content, z18, layerBackdropRememberLayerBackdrop7, z17, i5, j13), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier13;
                    color6 = color4;
                }
                z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier14 = modifier2;
                    final Color color10 = color5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier14, z4, color6, color10, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            i8 = i3 & 64;
            if (i8 != 0) {
                if ((1572864 & i2) == 0) {
                    color3 = color;
                    if (composerStartRestartGroup.changed(color3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(color2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((38347923 & i13) == 38347922) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z19 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j15 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j16 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop8 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z110 = z3;
                        z2 = z110;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier15 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier15, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j16, content, z110, layerBackdropRememberLayerBackdrop8, z19, i5, j15), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier15;
                        color6 = color4;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z111 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j17 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j18 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop9 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z112 = z3;
                        z2 = z112;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier16 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier16, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j18, content, z112, layerBackdropRememberLayerBackdrop9, z111, i5, j17), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier16;
                        color6 = color4;
                    }
                    z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier17 = modifier2;
                        final Color color11 = color5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier17, z4, color6, color11, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((38347923 & i13) == 38347922) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z113 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j19 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j110 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop10 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z114 = z3;
                    z2 = z114;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier18 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier18, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j110, content, z114, layerBackdropRememberLayerBackdrop10, z113, i5, j19), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier18;
                    color6 = color4;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z115 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j111 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j112 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop11 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z116 = z3;
                    z2 = z116;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier19 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier19, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j112, content, z116, layerBackdropRememberLayerBackdrop11, z115, i5, j111), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier19;
                    color6 = color4;
                }
                z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier110 = modifier2;
                    final Color color12 = color5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier110, z4, color6, color12, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            color3 = color;
            i10 = i3 & 128;
            if (i10 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(color2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((38347923 & i13) == 38347922) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z117 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j113 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j114 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop12 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z118 = z3;
                    z2 = z118;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier111 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier111, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j114, content, z118, layerBackdropRememberLayerBackdrop12, z117, i5, j113), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier111;
                    color6 = color4;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z119 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j115 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j116 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop13 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z1110 = z3;
                    z2 = z1110;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier112 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier112, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j116, content, z1110, layerBackdropRememberLayerBackdrop13, z119, i5, j115), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier112;
                    color6 = color4;
                }
                z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier113 = modifier2;
                    final Color color13 = color5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier113, z4, color6, color13, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i4;
            if ((38347923 & i13) == 38347922) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z1111 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j117 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j118 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop14 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z1112 = z3;
                z2 = z1112;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier114 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier114, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j118, content, z1112, layerBackdropRememberLayerBackdrop14, z1111, i5, j117), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier114;
                color6 = color4;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z1113 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j119 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j1110 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop15 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z1114 = z3;
                z2 = z1114;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier115 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier115, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1110, content, z1114, layerBackdropRememberLayerBackdrop15, z1113, i5, j119), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier115;
                color6 = color4;
            }
            z4 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier116 = modifier2;
                final Color color14 = color5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier116, z4, color6, color14, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        modifier2 = modifier;
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i2) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                if ((1572864 & i2) == 0) {
                    color3 = color;
                    if (composerStartRestartGroup.changed(color3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(color2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((38347923 & i13) == 38347922) {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z1115 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j1111 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j1112 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop16 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z1116 = z3;
                        z2 = z1116;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier117 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier117, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1112, content, z1116, layerBackdropRememberLayerBackdrop16, z1115, i5, j1111), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier117;
                        color6 = color4;
                    } else {
                        if (i14 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            color4 = null;
                        } else {
                            color4 = color3;
                        }
                        if (i10 != 0) {
                            color5 = null;
                        } else {
                            color5 = color2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                        }
                        zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                        boolean z1117 = !zIsSystemInDarkTheme;
                        if (color4 != null) {
                            jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                        } else if (zIsSystemInDarkTheme) {
                            jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                        } else {
                            jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                        }
                        long j1113 = jM3880getWhite0d7_KjU;
                        if (color5 != null) {
                            jM3842copywmQWz5c$default = color5.m3853unboximpl();
                        } else {
                            if (zIsSystemInDarkTheme) {
                                jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                            } else {
                                jColor = ColorKt.Color(4280166715L);
                            }
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        long j1114 = jM3842copywmQWz5c$default;
                        LayerBackdrop layerBackdropRememberLayerBackdrop17 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                        boolean z1118 = z3;
                        z2 = z1118;
                        composerStartRestartGroup = composerStartRestartGroup;
                        Modifier modifier118 = modifier3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier118, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1114, content, z1118, layerBackdropRememberLayerBackdrop17, z1117, i5, j1113), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier118;
                        color6 = color4;
                    }
                    z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier119 = modifier2;
                        final Color color15 = color5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier119, z4, color6, color15, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((38347923 & i13) == 38347922) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z1119 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j1115 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j1116 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop18 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z11110 = z3;
                    z2 = z11110;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier1110 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier1110, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1116, content, z11110, layerBackdropRememberLayerBackdrop18, z1119, i5, j1115), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier1110;
                    color6 = color4;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z11111 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j1117 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j1118 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop19 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z11112 = z3;
                    z2 = z11112;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier1111 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier1111, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1118, content, z11112, layerBackdropRememberLayerBackdrop19, z11111, i5, j1117), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier1111;
                    color6 = color4;
                }
                z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier1112 = modifier2;
                    final Color color16 = color5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier1112, z4, color6, color16, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            color3 = color;
            i10 = i3 & 128;
            if (i10 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(color2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((38347923 & i13) == 38347922) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z11113 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j1119 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j11110 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop110 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z11114 = z3;
                    z2 = z11114;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier1113 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier1113, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j11110, content, z11114, layerBackdropRememberLayerBackdrop110, z11113, i5, j1119), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier1113;
                    color6 = color4;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z11115 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j11111 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j11112 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop111 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z11116 = z3;
                    z2 = z11116;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier1114 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier1114, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j11112, content, z11116, layerBackdropRememberLayerBackdrop111, z11115, i5, j11111), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier1114;
                    color6 = color4;
                }
                z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier1115 = modifier2;
                    final Color color17 = color5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier1115, z4, color6, color17, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i4;
            if ((38347923 & i13) == 38347922) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z11117 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j11113 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j11114 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop112 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z11118 = z3;
                z2 = z11118;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier1116 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier1116, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j11114, content, z11118, layerBackdropRememberLayerBackdrop112, z11117, i5, j11113), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier1116;
                color6 = color4;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z11119 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j11115 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j11116 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop113 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z111110 = z3;
                z2 = z111110;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier1117 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier1117, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j11116, content, z111110, layerBackdropRememberLayerBackdrop113, z11119, i5, j11115), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier1117;
                color6 = color4;
            }
            z4 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier1118 = modifier2;
                final Color color18 = color5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier1118, z4, color6, color18, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        i8 = i3 & 64;
        if (i8 != 0) {
            if ((1572864 & i2) == 0) {
                color3 = color;
                if (composerStartRestartGroup.changed(color3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            i10 = i3 & 128;
            if (i10 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(color2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((38347923 & i13) == 38347922) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z111111 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j11117 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j11118 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop114 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z111112 = z3;
                    z2 = z111112;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier1119 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier1119, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j11118, content, z111112, layerBackdropRememberLayerBackdrop114, z111111, i5, j11117), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier1119;
                    color6 = color4;
                } else {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        color4 = null;
                    } else {
                        color4 = color3;
                    }
                    if (i10 != 0) {
                        color5 = null;
                    } else {
                        color5 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    boolean z111113 = !zIsSystemInDarkTheme;
                    if (color4 != null) {
                        jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                    } else if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    } else {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    }
                    long j11119 = jM3880getWhite0d7_KjU;
                    if (color5 != null) {
                        jM3842copywmQWz5c$default = color5.m3853unboximpl();
                    } else {
                        if (zIsSystemInDarkTheme) {
                            jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                        } else {
                            jColor = ColorKt.Color(4280166715L);
                        }
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    long j111110 = jM3842copywmQWz5c$default;
                    LayerBackdrop layerBackdropRememberLayerBackdrop115 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                    boolean z111114 = z3;
                    z2 = z111114;
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier11110 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier11110, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j111110, content, z111114, layerBackdropRememberLayerBackdrop115, z111113, i5, j11119), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier11110;
                    color6 = color4;
                }
                z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier11111 = modifier2;
                    final Color color19 = color5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier11111, z4, color6, color19, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i4;
            if ((38347923 & i13) == 38347922) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z111115 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j111111 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j111112 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop116 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z111116 = z3;
                z2 = z111116;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier11112 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier11112, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j111112, content, z111116, layerBackdropRememberLayerBackdrop116, z111115, i5, j111111), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier11112;
                color6 = color4;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z111117 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j111113 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j111114 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop117 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z111118 = z3;
                z2 = z111118;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier11113 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier11113, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j111114, content, z111118, layerBackdropRememberLayerBackdrop117, z111117, i5, j111113), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier11113;
                color6 = color4;
            }
            z4 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier11114 = modifier2;
                final Color color110 = color5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier11114, z4, color6, color110, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 1572864;
        color3 = color;
        i10 = i3 & 128;
        if (i10 != 0) {
            if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(color2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i4;
            if ((38347923 & i13) == 38347922) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z111119 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j111115 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j111116 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop118 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z1111110 = z3;
                z2 = z1111110;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier11115 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier11115, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j111116, content, z1111110, layerBackdropRememberLayerBackdrop118, z111119, i5, j111115), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier11115;
                color6 = color4;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    color4 = null;
                } else {
                    color4 = color3;
                }
                if (i10 != 0) {
                    color5 = null;
                } else {
                    color5 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                boolean z1111111 = !zIsSystemInDarkTheme;
                if (color4 != null) {
                    jM3880getWhite0d7_KjU = color4.m3853unboximpl();
                } else if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                long j111117 = jM3880getWhite0d7_KjU;
                if (color5 != null) {
                    jM3842copywmQWz5c$default = color5.m3853unboximpl();
                } else {
                    if (zIsSystemInDarkTheme) {
                        jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jColor = ColorKt.Color(4280166715L);
                    }
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j111118 = jM3842copywmQWz5c$default;
                LayerBackdrop layerBackdropRememberLayerBackdrop119 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
                boolean z1111112 = z3;
                z2 = z1111112;
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier11116 = modifier3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier11116, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j111118, content, z1111112, layerBackdropRememberLayerBackdrop119, z1111111, i5, j111117), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier11116;
                color6 = color4;
            }
            z4 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier11117 = modifier2;
                final Color color111 = color5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier11117, z4, color6, color111, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 12582912;
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        i13 = i4;
        if ((38347923 & i13) == 38347922) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i8 != 0) {
                color4 = null;
            } else {
                color4 = color3;
            }
            if (i10 != 0) {
                color5 = null;
            } else {
                color5 = color2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
            }
            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            boolean z1111113 = !zIsSystemInDarkTheme;
            if (color4 != null) {
                jM3880getWhite0d7_KjU = color4.m3853unboximpl();
            } else if (zIsSystemInDarkTheme) {
                jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
            } else {
                jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
            }
            long j111119 = jM3880getWhite0d7_KjU;
            if (color5 != null) {
                jM3842copywmQWz5c$default = color5.m3853unboximpl();
            } else {
                if (zIsSystemInDarkTheme) {
                    jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                } else {
                    jColor = ColorKt.Color(4280166715L);
                }
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j1111110 = jM3842copywmQWz5c$default;
            LayerBackdrop layerBackdropRememberLayerBackdrop1110 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
            boolean z1111114 = z3;
            z2 = z1111114;
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifier11118 = modifier3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier11118, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1111110, content, z1111114, layerBackdropRememberLayerBackdrop1110, z1111113, i5, j111119), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier11118;
            color6 = color4;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i8 != 0) {
                color4 = null;
            } else {
                color4 = color3;
            }
            if (i10 != 0) {
                color5 = null;
            } else {
                color5 = color2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445884491, i13, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs (LiquidBottomTabs.kt:69)");
            }
            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            boolean z1111115 = !zIsSystemInDarkTheme;
            if (color4 != null) {
                jM3880getWhite0d7_KjU = color4.m3853unboximpl();
            } else if (zIsSystemInDarkTheme) {
                jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
            } else {
                jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
            }
            long j1111111 = jM3880getWhite0d7_KjU;
            if (color5 != null) {
                jM3842copywmQWz5c$default = color5.m3853unboximpl();
            } else {
                if (zIsSystemInDarkTheme) {
                    jColor = Color.INSTANCE.m3880getWhite0d7_KjU();
                } else {
                    jColor = ColorKt.Color(4280166715L);
                }
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor, 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j1111112 = jM3842copywmQWz5c$default;
            LayerBackdrop layerBackdropRememberLayerBackdrop1111 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 48, 5);
            boolean z1111116 = z3;
            z2 = z1111116;
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifier11119 = modifier3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier11119, Alignment.INSTANCE.getCenterStart(), false, ComposableLambdaKt.rememberComposableLambda(-650484939, true, new LiquidBottomTabsKt$LiquidBottomTabs$1(selectedTabIndex, onTabSelected, backdrop, j1111112, content, z1111116, layerBackdropRememberLayerBackdrop1111, z1111115, i5, j1111111), composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 12) & 14) | 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier11119;
            color6 = color4;
        }
        z4 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier111110 = modifier2;
            final Color color112 = color5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiquidBottomTabsKt.LiquidBottomTabs__42sRYA$lambda$0(selectedTabIndex, onTabSelected, backdrop, i, modifier111110, z4, color6, color112, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
