package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HistoryLogsDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class HistoryLogsDialogKt$HistoryLogsDialog$3$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<ContactBookLogEntry> $selectedLogToRestore$delegate;

    HistoryLogsDialogKt$HistoryLogsDialog$3$3(MutableState<ContactBookLogEntry> mutableState) {
        this.$selectedLogToRestore$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C277@13434L31,276@13388L201:HistoryLogsDialog.kt#yz3s17");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-756467010, i, -1, "com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialog.<anonymous>.<anonymous> (HistoryLogsDialog.kt:276)");
            }
            composer.startReplaceGroup(1169103983);
            ComposerKt.sourceInformation(composer, "CC(remember):HistoryLogsDialog.kt#9igjgp");
            final MutableState<ContactBookLogEntry> mutableState = this.$selectedLogToRestore$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialogKt$HistoryLogsDialog$3$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryLogsDialogKt$HistoryLogsDialog$3$3.invoke$lambda$1$lambda$0(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) objRememberedValue, null, false, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(10)), null, null, null, null, null, ComposableSingletons$HistoryLogsDialogKt.INSTANCE.m6817getLambda4$app_release(), composer, 805306374, 502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
