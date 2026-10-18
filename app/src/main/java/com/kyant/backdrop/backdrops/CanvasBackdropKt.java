package com.kyant.backdrop.backdrops;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CanvasBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberCanvasBackdrop", "Lcom/kyant/backdrop/Backdrop;", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/kyant/backdrop/Backdrop;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CanvasBackdropKt {
    public static final com.kyant.backdrop.Backdrop rememberCanvasBackdrop(Function1<? super DrawScope, Unit> onDraw, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        composer.startReplaceGroup(-1415403083);
        ComposerKt.sourceInformation(composer, "C(rememberCanvasBackdrop)15@501L55:CanvasBackdrop.kt#3v2h7d");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1415403083, i, -1, "com.kyant.backdrop.backdrops.rememberCanvasBackdrop (CanvasBackdrop.kt:14)");
        }
        composer.startReplaceGroup(-108891015);
        ComposerKt.sourceInformation(composer, "CC(remember):CanvasBackdrop.kt#9igjgp");
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(onDraw)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CanvasBackdrop(onDraw);
            composer.updateRememberedValue(objRememberedValue);
        }
        CanvasBackdrop canvasBackdrop = (CanvasBackdrop) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return canvasBackdrop;
    }
}
