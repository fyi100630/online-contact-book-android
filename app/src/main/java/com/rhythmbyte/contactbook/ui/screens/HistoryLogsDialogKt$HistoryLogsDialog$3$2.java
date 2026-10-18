package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HistoryLogsDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class HistoryLogsDialogKt$HistoryLogsDialog$3$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ContactBookLogEntry $log;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<ContactBookLogEntry, Unit> $onRestore;
    final /* synthetic */ MutableState<ContactBookLogEntry> $selectedLogToRestore$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    HistoryLogsDialogKt$HistoryLogsDialog$3$2(Function1<? super ContactBookLogEntry, Unit> function1, ContactBookLogEntry contactBookLogEntry, Function0<Unit> function0, MutableState<ContactBookLogEntry> mutableState) {
        this.$onRestore = function1;
        this.$log = contactBookLogEntry;
        this.$onDismiss = function0;
        this.$selectedLogToRestore$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C269@13132L38,264@12936L150,263@12898L428:HistoryLogsDialog.kt#yz3s17");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949662592, i, -1, "com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialog.<anonymous>.<anonymous> (HistoryLogsDialog.kt:263)");
            }
            ButtonColors buttonColorsM1491buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(ColorKt.getRose500(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(10));
            composer.startReplaceGroup(1169088166);
            ComposerKt.sourceInformation(composer, "CC(remember):HistoryLogsDialog.kt#9igjgp");
            boolean zChanged = composer.changed(this.$onRestore) | composer.changedInstance(this.$log) | composer.changed(this.$onDismiss);
            final Function1<ContactBookLogEntry, Unit> function1 = this.$onRestore;
            final ContactBookLogEntry contactBookLogEntry = this.$log;
            final Function0<Unit> function0 = this.$onDismiss;
            final MutableState<ContactBookLogEntry> mutableState = this.$selectedLogToRestore$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialogKt$HistoryLogsDialog$3$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryLogsDialogKt$HistoryLogsDialog$3$2.invoke$lambda$1$lambda$0(function1, contactBookLogEntry, function0, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) objRememberedValue, null, false, roundedCornerShapeM967RoundedCornerShape0680j_4, buttonColorsM1491buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$HistoryLogsDialogKt.INSTANCE.m6816getLambda3$app_release(), composer, 805306368, 486);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ContactBookLogEntry contactBookLogEntry, Function0 function0, MutableState mutableState) {
        function1.invoke(contactBookLogEntry);
        mutableState.setValue(null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
