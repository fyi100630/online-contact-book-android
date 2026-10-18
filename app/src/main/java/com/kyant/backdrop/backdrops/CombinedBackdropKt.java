package com.kyant.backdrop.backdrops;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CombinedBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberCombinedBackdrop", "Lcom/kyant/backdrop/Backdrop;", "backdrop1", "backdrop2", "(Lcom/kyant/backdrop/Backdrop;Lcom/kyant/backdrop/Backdrop;Landroidx/compose/runtime/Composer;I)Lcom/kyant/backdrop/Backdrop;", "backdrop3", "(Lcom/kyant/backdrop/Backdrop;Lcom/kyant/backdrop/Backdrop;Lcom/kyant/backdrop/Backdrop;Landroidx/compose/runtime/Composer;I)Lcom/kyant/backdrop/Backdrop;", "backdrops", "", "([Lcom/kyant/backdrop/Backdrop;Landroidx/compose/runtime/Composer;I)Lcom/kyant/backdrop/Backdrop;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CombinedBackdropKt {
    public static final com.kyant.backdrop.Backdrop rememberCombinedBackdrop(com.kyant.backdrop.Backdrop backdrop1, com.kyant.backdrop.Backdrop backdrop2, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(backdrop1, "backdrop1");
        Intrinsics.checkNotNullParameter(backdrop2, "backdrop2");
        composer.startReplaceGroup(1779906952);
        ComposerKt.sourceInformation(composer, "C(rememberCombinedBackdrop)16@519L87:CombinedBackdrop.kt#3v2h7d");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1779906952, i, -1, "com.kyant.backdrop.backdrops.rememberCombinedBackdrop (CombinedBackdrop.kt:15)");
        }
        composer.startReplaceGroup(569422662);
        ComposerKt.sourceInformation(composer, "CC(remember):CombinedBackdrop.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(backdrop1)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(backdrop2)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Combined2Backdrops(backdrop1, backdrop2);
            composer.updateRememberedValue(objRememberedValue);
        }
        Combined2Backdrops combined2Backdrops = (Combined2Backdrops) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return combined2Backdrops;
    }

    public static final com.kyant.backdrop.Backdrop rememberCombinedBackdrop(com.kyant.backdrop.Backdrop backdrop1, com.kyant.backdrop.Backdrop backdrop2, com.kyant.backdrop.Backdrop backdrop3, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(backdrop1, "backdrop1");
        Intrinsics.checkNotNullParameter(backdrop2, "backdrop2");
        Intrinsics.checkNotNullParameter(backdrop3, "backdrop3");
        composer.startReplaceGroup(2026926298);
        ComposerKt.sourceInformation(composer, "C(rememberCombinedBackdrop)27@751L109:CombinedBackdrop.kt#3v2h7d");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2026926298, i, -1, "com.kyant.backdrop.backdrops.rememberCombinedBackdrop (CombinedBackdrop.kt:26)");
        }
        composer.startReplaceGroup(569430108);
        ComposerKt.sourceInformation(composer, "CC(remember):CombinedBackdrop.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(backdrop1)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(backdrop2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(backdrop3)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Combined3Backdrops(backdrop1, backdrop2, backdrop3);
            composer.updateRememberedValue(objRememberedValue);
        }
        Combined3Backdrops combined3Backdrops = (Combined3Backdrops) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return combined3Backdrops;
    }

    public static final com.kyant.backdrop.Backdrop rememberCombinedBackdrop(com.kyant.backdrop.Backdrop[] backdrops, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(backdrops, "backdrops");
        composer.startReplaceGroup(1059779611);
        ComposerKt.sourceInformation(composer, "C(rememberCombinedBackdrop)34@956L66:CombinedBackdrop.kt#3v2h7d");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1059779611, i, -1, "com.kyant.backdrop.backdrops.rememberCombinedBackdrop (CombinedBackdrop.kt:33)");
        }
        Object[] objArrCopyOf = Arrays.copyOf(backdrops, backdrops.length);
        ComposerKt.sourceInformationMarkerStart(composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CombinedBackdrops((com.kyant.backdrop.Backdrop[]) Arrays.copyOf(backdrops, backdrops.length));
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CombinedBackdrops combinedBackdrops = (CombinedBackdrops) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return combinedBackdrops;
    }
}
