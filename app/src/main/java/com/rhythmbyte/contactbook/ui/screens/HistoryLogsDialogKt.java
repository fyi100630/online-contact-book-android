package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HistoryLogsDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\u001aS\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, d2 = {"HistoryLogsDialog", "", "logs", "", "Lcom/rhythmbyte/contactbook/data/model/ContactBookLogEntry;", "isLoading", "", "onFetchLogs", "Lkotlin/Function0;", "onDismiss", "onRestore", "Lkotlin/Function1;", "(Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "selectedLogToRestore", "expandedLogId", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HistoryLogsDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryLogsDialog$lambda$10(List list, boolean z, Function0 function0, Function0 function1, Function1 function2, int i, Composer composer, int i2) {
        HistoryLogsDialog(list, z, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HistoryLogsDialog(final List<ContactBookLogEntry> logs, final boolean z, final Function0<Unit> onFetchLogs, final Function0<Unit> onDismiss, final Function1<? super ContactBookLogEntry, Unit> onRestore, Composer composer, final int i) {
        int i2;
        boolean z2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(onFetchLogs, "onFetchLogs");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onRestore, "onRestore");
        Composer composerStartRestartGroup = composer.startRestartGroup(-834427626);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HistoryLogsDialog)P(1!1,3)64@2813L29,64@2792L50,68@2876L55,69@2957L42,74@3128L9332,71@3005L9455,*255@12553L31,262@12880L460,275@13370L233,257@12682L168,254@12509L1104:HistoryLogsDialog.kt#yz3s17");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(logs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFetchLogs) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRestore) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834427626, i3, -1, "com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialog (HistoryLogsDialog.kt:63)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1535081137);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HistoryLogsDialog.kt#9igjgp");
            boolean z3 = (i3 & 896) == 256;
            HistoryLogsDialogKt$HistoryLogsDialog$1$1 historyLogsDialogKt$HistoryLogsDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || historyLogsDialogKt$HistoryLogsDialog$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                historyLogsDialogKt$HistoryLogsDialog$1$1RememberedValue = new HistoryLogsDialogKt$HistoryLogsDialog$1$1(onFetchLogs, null);
                composerStartRestartGroup.updateRememberedValue(historyLogsDialogKt$HistoryLogsDialog$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) historyLogsDialogKt$HistoryLogsDialog$1$1RememberedValue, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1535079095);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HistoryLogsDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1535076516);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HistoryLogsDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final boolean z4 = z2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1068560083, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialogKt.HistoryLogsDialog.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C75@3138L9316:HistoryLogsDialog.kt#yz3s17");
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1068560083, i4, -1, "com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialog.<anonymous> (HistoryLogsDialog.kt:75)");
                        }
                        Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.92f), 0.8f);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        boolean z5 = z4;
                        List<ContactBookLogEntry> list = logs;
                        Function0<Unit> function0 = onDismiss;
                        MutableState<String> mutableState3 = mutableState2;
                        MutableState<ContactBookLogEntry> mutableState4 = mutableState;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxHeight);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1872736786, "C84@3471L11,87@3611L8833,81@3323L9121:HistoryLogsDialog.kt#yz3s17");
                        float f = 26;
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(16), ComposableLambdaKt.rememberComposableLambda(-1390570606, true, new HistoryLogsDialogKt$HistoryLogsDialog$2$1$1(z5, list, function0, mutableState3, mutableState4), composer3, 54), composer3, 1769862, 16);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 9) & 14) | 432, 0);
            final ContactBookLogEntry contactBookLogEntryHistoryLogsDialog$lambda$2 = HistoryLogsDialog$lambda$2(mutableState);
            if (contactBookLogEntryHistoryLogsDialog$lambda$2 != null) {
                composer2.startReplaceGroup(983088592);
                ComposerKt.sourceInformation(composer2, "CC(remember):HistoryLogsDialog.kt#9igjgp");
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HistoryLogsDialogKt.HistoryLogsDialog$lambda$9$lambda$8$lambda$7(mutableState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(949662592, true, new HistoryLogsDialogKt$HistoryLogsDialog$3$2(onRestore, contactBookLogEntryHistoryLogsDialog$lambda$2, onDismiss, mutableState), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-756467010, true, new HistoryLogsDialogKt$HistoryLogsDialog$3$3(mutableState), composer2, 54), null, ComposableSingletons$HistoryLogsDialogKt.INSTANCE.m6818getLambda5$app_release(), ComposableLambdaKt.rememberComposableLambda(-1168177765, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialogKt$HistoryLogsDialog$3$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        ComposerKt.sourceInformation(composer3, "C258@12700L136:HistoryLogsDialog.kt#yz3s17");
                        if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1168177765, i4, -1, "com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialog.<anonymous>.<anonymous> (HistoryLogsDialog.kt:258)");
                            }
                            TextKt.m2376Text4IGK_g("確定要將全班聯絡簿還原至快照時間：" + StringsKt.take(StringsKt.replace$default(contactBookLogEntryHistoryLogsDialog$lambda$2.getCreatedAt(), "T", ServerSentEventKt.SPACE, false, 4, (Object) null), 19) + " 嗎？\n\n還原後將立即推播更新至所有學生、家長與網頁版。", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772598, 0, 16276);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.HistoryLogsDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryLogsDialogKt.HistoryLogsDialog$lambda$10(logs, z, onFetchLogs, onDismiss, onRestore, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ContactBookLogEntry HistoryLogsDialog$lambda$2(MutableState<ContactBookLogEntry> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HistoryLogsDialog$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryLogsDialog$lambda$9$lambda$8$lambda$7(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
