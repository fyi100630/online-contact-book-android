package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiquidGlassBottomBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ComposableSingletons$LiquidGlassBottomBarKt {
    public static final ComposableSingletons$LiquidGlassBottomBarKt INSTANCE = new ComposableSingletons$LiquidGlassBottomBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f69lambda1 = ComposableLambdaKt.composableLambdaInstance(-1729467909, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.ComposableSingletons$LiquidGlassBottomBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope LiquidButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
            ComposerKt.sourceInformation(composer, "C148@5815L197:LiquidGlassBottomBar.kt#7ivg5k");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1729467909, i, -1, "com.rhythmbyte.contactbook.ui.components.ComposableSingletons$LiquidGlassBottomBarKt.lambda-1.<anonymous> (LiquidGlassBottomBar.kt:148)");
                }
                IconKt.m1833Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "新增項目", SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(28)), Color.INSTANCE.m3880getWhite0d7_KjU(), composer, 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* JADX INFO: renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6732getLambda1$app_release() {
        return f69lambda1;
    }
}
