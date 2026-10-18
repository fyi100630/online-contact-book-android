package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
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

/* JADX INFO: compiled from: TimetableDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$TimetableDialogKt {
    public static final ComposableSingletons$TimetableDialogKt INSTANCE = new ComposableSingletons$TimetableDialogKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f70lambda1 = ComposableLambdaKt.composableLambdaInstance(1967721158, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C198@7268L11,195@7067L252:TimetableDialog.kt#7ivg5k");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1967721158, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-1.<anonymous> (TimetableDialog.kt:195)");
                }
                IconKt.m1833Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "返回", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1587getOnSurface0d7_KjU(), composer, 48, 4);
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
    private static Function3<RowScope, Composer, Integer, Unit> f71lambda2 = ComposableLambdaKt.composableLambdaInstance(-1456953402, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C238@9396L61:TimetableDialog.kt#7ivg5k");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1456953402, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-2.<anonymous> (TimetableDialog.kt:238)");
            }
            TextKt.m2376Text4IGK_g("💾 發布", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f72lambda3 = ComposableLambdaKt.composableLambdaInstance(335253892, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C527@25889L104:TimetableDialog.kt#7ivg5k");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(335253892, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-3.<anonymous> (TimetableDialog.kt:527)");
            }
            IconKt.m1833Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "關閉面板", SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(16)), ColorKt.getSlate400(), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f73lambda4 = ComposableLambdaKt.composableLambdaInstance(-1813567536, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C610@31079L34:TimetableDialog.kt#7ivg5k");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813567536, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-4.<anonymous> (TimetableDialog.kt:610)");
            }
            TextKt.m2376Text4IGK_g("完整科目名稱", (Modifier) null, 0L, TextUnitKt.getSp(10.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f74lambda5 = ComposableLambdaKt.composableLambdaInstance(954195665, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C611@31169L33:TimetableDialog.kt#7ivg5k");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954195665, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-5.<anonymous> (TimetableDialog.kt:611)");
            }
            TextKt.m2376Text4IGK_g("例：健康與護理", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f75lambda6 = ComposableLambdaKt.composableLambdaInstance(-1984217159, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C625@31967L32:TimetableDialog.kt#7ivg5k");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1984217159, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-6.<anonymous> (TimetableDialog.kt:625)");
            }
            TextKt.m2376Text4IGK_g("主頁單字", (Modifier) null, 0L, TextUnitKt.getSp(10.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-7, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f76lambda7 = ComposableLambdaKt.composableLambdaInstance(-748537222, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C626@32055L29:TimetableDialog.kt#7ivg5k");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-748537222, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-7.<anonymous> (TimetableDialog.kt:626)");
            }
            TextKt.m2376Text4IGK_g("例：護", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-8, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f77lambda8 = ComposableLambdaKt.composableLambdaInstance(1848383802, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C653@33766L58:TimetableDialog.kt#7ivg5k");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1848383802, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$TimetableDialogKt.lambda-8.<anonymous> (TimetableDialog.kt:653)");
            }
            TextKt.m2376Text4IGK_g("填入", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6733getLambda1$app_release() {
        return f70lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6734getLambda2$app_release() {
        return f71lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6735getLambda3$app_release() {
        return f72lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6736getLambda4$app_release() {
        return f73lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6737getLambda5$app_release() {
        return f74lambda5;
    }

    /* JADX INFO: renamed from: getLambda-6$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6738getLambda6$app_release() {
        return f75lambda6;
    }

    /* JADX INFO: renamed from: getLambda-7$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6739getLambda7$app_release() {
        return f76lambda7;
    }

    /* JADX INFO: renamed from: getLambda-8$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6740getLambda8$app_release() {
        return f77lambda8;
    }
}
