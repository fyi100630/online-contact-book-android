package com.kyant.backdrop.backdrops;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Backdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012=\u0010\u0003\u001a9\u0012\u0004\u0012\u00020\u0005\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"rememberBackdrop", "Lcom/kyant/backdrop/Backdrop;", "backdrop", "onDraw", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "drawBackdrop", "Lkotlin/ExtensionFunctionType;", "(Lcom/kyant/backdrop/Backdrop;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcom/kyant/backdrop/Backdrop;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BackdropKt {
    public static final com.kyant.backdrop.Backdrop rememberBackdrop(com.kyant.backdrop.Backdrop backdrop, Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDraw, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        composer.startReplaceGroup(-1541512788);
        ComposerKt.sourceInformation(composer, "C(rememberBackdrop)16@553L69:Backdrop.kt#3v2h7d");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541512788, i, -1, "com.kyant.backdrop.backdrops.rememberBackdrop (Backdrop.kt:15)");
        }
        composer.startReplaceGroup(-884734321);
        ComposerKt.sourceInformation(composer, "CC(remember):Backdrop.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(backdrop)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(onDraw)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Backdrop(backdrop, onDraw);
            composer.updateRememberedValue(objRememberedValue);
        }
        Backdrop backdrop2 = (Backdrop) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return backdrop2;
    }
}
