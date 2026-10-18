package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.DateRangeKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EditItemScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$EditItemScreenKt {
    public static final ComposableSingletons$EditItemScreenKt INSTANCE = new ComposableSingletons$EditItemScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f95lambda1 = ComposableLambdaKt.composableLambdaInstance(-591485117, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C126@5437L11,123@5248L236:EditItemScreen.kt#yz3s17");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-591485117, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-1.<anonymous> (EditItemScreen.kt:123)");
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
    private static Function3<RowScope, Composer, Integer, Unit> f98lambda2 = ComposableLambdaKt.composableLambdaInstance(1517957954, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope LiquidButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
            ComposerKt.sourceInformation(composer, "C172@7321L11,170@7224L252:EditItemScreen.kt#yz3s17");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1517957954, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-2.<anonymous> (EditItemScreen.kt:170)");
                }
                TextKt.m2376Text4IGK_g("取消", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1587getOnSurface0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131026);
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
    private static Function2<Composer, Integer, Unit> f99lambda3 = ComposableLambdaKt.composableLambdaInstance(763818261, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C316@14153L19:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(763818261, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-3.<anonymous> (EditItemScreen.kt:316)");
            }
            TextKt.m2376Text4IGK_g("科目／發布單位（選填）", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f100lambda4 = ComposableLambdaKt.composableLambdaInstance(1692978356, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C317@14220L20:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1692978356, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-4.<anonymous> (EditItemScreen.kt:317)");
            }
            TextKt.m2376Text4IGK_g("例如：國語、數學、訓導處", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f101lambda5 = ComposableLambdaKt.composableLambdaInstance(-1272492852, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C334@14993L20:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272492852, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-5.<anonymous> (EditItemScreen.kt:334)");
            }
            TextKt.m2376Text4IGK_g("項目名稱／內容（必填）*", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f102lambda6 = ComposableLambdaKt.composableLambdaInstance(-1702839125, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C335@15061L30:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702839125, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-6.<anonymous> (EditItemScreen.kt:335)");
            }
            TextKt.m2376Text4IGK_g("例如：習作第 24-25 頁、帶戶外教學回條", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-7, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f103lambda7 = ComposableLambdaKt.composableLambdaInstance(1785616397, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C356@16058L30:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1785616397, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-7.<anonymous> (EditItemScreen.kt:356)");
            }
            TextKt.m2376Text4IGK_g("截止／繳交日期（選填，YYYY-MM-DD）", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-8, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f104lambda8 = ComposableLambdaKt.composableLambdaInstance(1355270124, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C357@16136L21:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355270124, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-8.<anonymous> (EditItemScreen.kt:357)");
            }
            TextKt.m2376Text4IGK_g("例如：2026-09-15", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-9, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f105lambda9 = ComposableLambdaKt.composableLambdaInstance(924923851, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C359@16237L73:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924923851, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-9.<anonymous> (EditItemScreen.kt:359)");
            }
            IconKt.m1833Iconww6aTOc(DateRangeKt.getDateRange(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, ColorKt.getSlate400(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-10, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f96lambda10 = ComposableLambdaKt.composableLambdaInstance(548758350, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C397@18592L19:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548758350, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-10.<anonymous> (EditItemScreen.kt:397)");
            }
            TextKt.m2376Text4IGK_g("詳細說明／備註（選填）", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-11, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f97lambda11 = ComposableLambdaKt.composableLambdaInstance(118412077, false, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt$lambda-11$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C398@18659L25:EditItemScreen.kt#yz3s17");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118412077, i, -1, "com.rhythmbyte.contactbook.ui.screens.ComposableSingletons$EditItemScreenKt.lambda-11.<anonymous> (EditItemScreen.kt:398)");
            }
            TextKt.m2376Text4IGK_g("可補充注意事項、攜帶用具或附件網址", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6803getLambda1$app_release() {
        return f95lambda1;
    }

    /* JADX INFO: renamed from: getLambda-10$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6804getLambda10$app_release() {
        return f96lambda10;
    }

    /* JADX INFO: renamed from: getLambda-11$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6805getLambda11$app_release() {
        return f97lambda11;
    }

    /* JADX INFO: renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6806getLambda2$app_release() {
        return f98lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6807getLambda3$app_release() {
        return f99lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6808getLambda4$app_release() {
        return f100lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6809getLambda5$app_release() {
        return f101lambda5;
    }

    /* JADX INFO: renamed from: getLambda-6$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6810getLambda6$app_release() {
        return f102lambda6;
    }

    /* JADX INFO: renamed from: getLambda-7$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6811getLambda7$app_release() {
        return f103lambda7;
    }

    /* JADX INFO: renamed from: getLambda-8$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6812getLambda8$app_release() {
        return f104lambda8;
    }

    /* JADX INFO: renamed from: getLambda-9$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6813getLambda9$app_release() {
        return f105lambda9;
    }
}
