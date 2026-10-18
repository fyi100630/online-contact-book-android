package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$HomeScreenKt {
    public static final ComposableSingletons$HomeScreenKt INSTANCE = new ComposableSingletons$HomeScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f111lambda1 = ComposableLambdaKt.composableLambdaInstance(-1192673887, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope LiquidButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
            ComposerKt.sourceInformation(composer, "C423@19185L28,424@19254L79:HomeScreen.kt#yz3s17");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1192673887, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-1.<anonymous> (HomeScreen.kt:423)");
                }
                TextKt.m2376Text4IGK_g("📊", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
                TextKt.m2376Text4IGK_g("統計", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f113lambda2 = ComposableLambdaKt.composableLambdaInstance(623578648, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope LiquidButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
            ComposerKt.sourceInformation(composer, "C435@19930L28,436@19999L81:HomeScreen.kt#yz3s17");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(623578648, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-2.<anonymous> (HomeScreen.kt:435)");
                }
                TextKt.m2376Text4IGK_g("🕒", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
                TextKt.m2376Text4IGK_g("歷史紀錄", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f114lambda3 = ComposableLambdaKt.composableLambdaInstance(-632062952, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope LiquidButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
            ComposerKt.sourceInformation(composer, "C449@20753L28,450@20822L79:HomeScreen.kt#yz3s17");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632062952, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-3.<anonymous> (HomeScreen.kt:449)");
                }
                TextKt.m2376Text4IGK_g("🚪", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
                TextKt.m2376Text4IGK_g("登出", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f115lambda4 = ComposableLambdaKt.composableLambdaInstance(1783415073, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope LiquidButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
            ComposerKt.sourceInformation(composer, "C461@21541L28,462@21610L81:HomeScreen.kt#yz3s17");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1783415073, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-4.<anonymous> (HomeScreen.kt:461)");
                }
                TextKt.m2376Text4IGK_g("🔑", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
                TextKt.m2376Text4IGK_g("編輯登入", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f116lambda5 = ComposableLambdaKt.composableLambdaInstance(-841689467, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C717@35469L70:HomeScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841689467, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-5.<anonymous> (HomeScreen.kt:717)");
            }
            IconKt.m1833Iconww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "重試", (Modifier) null, ColorKt.getRose500(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f117lambda6 = ComposableLambdaKt.composableLambdaInstance(-1206069468, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C900@42881L22:HomeScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1206069468, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-6.<anonymous> (HomeScreen.kt:900)");
            }
            TextKt.m2376Text4IGK_g("置頂公告內容 (若無可留空)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-7, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f118lambda7 = ComposableLambdaKt.composableLambdaInstance(2117715816, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            ComposerKt.sourceInformation(composer, "C915@43654L10:HomeScreen.kt#yz3s17");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2117715816, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-7.<anonymous> (HomeScreen.kt:915)");
            }
            TextKt.m2376Text4IGK_g("取消", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-8, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f119lambda8 = ComposableLambdaKt.composableLambdaInstance(1036428970, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C926@44275L42:HomeScreen.kt#yz3s17");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1036428970, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-8.<anonymous> (HomeScreen.kt:926)");
            }
            TextKt.m2376Text4IGK_g("發布公告", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-9, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f120lambda9 = ComposableLambdaKt.composableLambdaInstance(-860344399, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C1098@50395L101:HomeScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860344399, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-9.<anonymous> (HomeScreen.kt:1098)");
            }
            IconKt.m1833Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), "編輯", SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(16)), ColorKt.getSlate400(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-10, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f112lambda10 = ComposableLambdaKt.composableLambdaInstance(1020778906, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C1101@50617L102:HomeScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020778906, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$HomeScreenKt.lambda-10.<anonymous> (HomeScreen.kt:1101)");
            }
            IconKt.m1833Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "刪除", SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(16)), ColorKt.getRose500(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6819getLambda1$app_release() {
        return f111lambda1;
    }

    /* JADX INFO: renamed from: getLambda-10$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6820getLambda10$app_release() {
        return f112lambda10;
    }

    /* JADX INFO: renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6821getLambda2$app_release() {
        return f113lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6822getLambda3$app_release() {
        return f114lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6823getLambda4$app_release() {
        return f115lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6824getLambda5$app_release() {
        return f116lambda5;
    }

    /* JADX INFO: renamed from: getLambda-6$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6825getLambda6$app_release() {
        return f117lambda6;
    }

    /* JADX INFO: renamed from: getLambda-7$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6826getLambda7$app_release() {
        return f118lambda7;
    }

    /* JADX INFO: renamed from: getLambda-8$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6827getLambda8$app_release() {
        return f119lambda8;
    }

    /* JADX INFO: renamed from: getLambda-9$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6828getLambda9$app_release() {
        return f120lambda9;
    }
}
