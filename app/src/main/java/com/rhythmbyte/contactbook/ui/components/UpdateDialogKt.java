package com.rhythmbyte.contactbook.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.rhythmbyte.contactbook.data.update.DownloadState;
import com.rhythmbyte.contactbook.data.update.UpdateInfo;
import com.rhythmbyte.contactbook.data.update.UpdateManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: UpdateDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"UpdateDialog", "", "updateInfo", "Lcom/rhythmbyte/contactbook/data/update/UpdateInfo;", "onDismiss", "Lkotlin/Function0;", "(Lcom/rhythmbyte/contactbook/data/update/UpdateInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "downloadState", "Lcom/rhythmbyte/contactbook/data/update/DownloadState;", "downloadedFile", "Ljava/io/File;", "animatedProgress", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UpdateDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateDialog$lambda$10(UpdateInfo updateInfo, Function0 function0, int i, Composer composer, int i2) {
        UpdateDialog(updateInfo, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ DownloadState access$UpdateDialog$lambda$1(MutableState mutableState) {
        return UpdateDialog$lambda$1(mutableState);
    }

    public static final void UpdateDialog(final UpdateInfo updateInfo, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        final Context context;
        final MutableState mutableState;
        final MutableState mutableState2;
        final UpdateInfo updateInfo2;
        final Function0<Unit> function0;
        Composer composer2;
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850500787);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(UpdateDialog)P(1)58@2544L7,59@2577L24,60@2627L62,61@2716L40,63@2794L544,81@3379L116,86@3502L10492,80@3344L10650:UpdateDialog.kt#7ivg5k");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(updateInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850500787, i3, -1, "com.rhythmbyte.contactbook.ui.components.UpdateDialog (UpdateDialog.kt:57)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(1438271765);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):UpdateDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DownloadState.Idle.INSTANCE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1438274591);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):UpdateDialog.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1438277591);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):UpdateDialog.kt#9igjgp");
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                mutableState = mutableState4;
                Function0 function1 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateDialogKt.UpdateDialog$lambda$7$lambda$6(coroutineScope, updateInfo, context, mutableState3, mutableState);
                    }
                };
                mutableState2 = mutableState3;
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue4 = function1;
            } else {
                context = context2;
                mutableState2 = mutableState3;
                mutableState = mutableState4;
            }
            final Function0 function2 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1438295883);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):UpdateDialog.kt#9igjgp");
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateDialogKt.UpdateDialog$lambda$9$lambda$8(onDismiss, mutableState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function3 = (Function0) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            final Context context3 = context;
            final MutableState mutableState5 = mutableState;
            updateInfo2 = updateInfo;
            function0 = onDismiss;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-483949098, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt.UpdateDialog.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C90@3648L11,93@3777L10211,87@3512L10476:UpdateDialog.kt#7ivg5k");
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-483949098, i4, -1, "com.rhythmbyte.contactbook.ui.components.UpdateDialog.<anonymous> (UpdateDialog.kt:87)");
                        }
                        float f = 26;
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(16), ComposableLambdaKt.rememberComposableLambda(-52524073, true, new AnonymousClass1(updateInfo, mutableState2, onDismiss, context3, function2, mutableState5), composer3, 54), composer3, 1769862, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt$UpdateDialog$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: UpdateDialog.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ MutableState<DownloadState> $downloadState$delegate;
                    final /* synthetic */ MutableState<File> $downloadedFile$delegate;
                    final /* synthetic */ Function0<Unit> $onDismiss;
                    final /* synthetic */ Function0<Unit> $startDownload;
                    final /* synthetic */ UpdateInfo $updateInfo;

                    AnonymousClass1(UpdateInfo updateInfo, MutableState<DownloadState> mutableState, Function0<Unit> function0, Context context, Function0<Unit> function1, MutableState<File> mutableState2) {
                        this.$updateInfo = updateInfo;
                        this.$downloadState$delegate = mutableState;
                        this.$onDismiss = function0;
                        this.$context = context;
                        this.$startDownload = function1;
                        this.$downloadedFile$delegate = mutableState2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41381. Try increasing type updates limit count.
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                        */
                    public final void invoke(androidx.compose.runtime.Composer r75, int r76) {
                        /*
                            Method dump skipped, instruction units count: 4138
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt.AnonymousClass2.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$20$lambda$19$lambda$14$lambda$13(MutableState mutableState, Context context) {
                        File fileUpdateDialog$lambda$4 = UpdateDialogKt.UpdateDialog$lambda$4(mutableState);
                        if (fileUpdateDialog$lambda$4 != null) {
                            UpdateManager.INSTANCE.installApk(context, fileUpdateDialog$lambda$4);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$20$lambda$19$lambda$16$lambda$15(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$20$lambda$19$lambda$18$lambda$17(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final float invoke$lambda$20$lambda$4(State<Float> state) {
                        return state.getValue().floatValue();
                    }
                }
            }, composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function3, null, composableLambdaRememberComposableLambda, composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            updateInfo2 = updateInfo;
            function0 = onDismiss;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateDialogKt.UpdateDialog$lambda$10(updateInfo2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadState UpdateDialog$lambda$1(MutableState<DownloadState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File UpdateDialog$lambda$4(MutableState<File> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateDialog$lambda$7$lambda$6(CoroutineScope coroutineScope, UpdateInfo updateInfo, Context context, MutableState mutableState, MutableState mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UpdateDialogKt$UpdateDialog$startDownload$1$1$1(updateInfo, context, mutableState, mutableState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateDialog$lambda$9$lambda$8(Function0 function0, MutableState mutableState) {
        if (!(UpdateDialog$lambda$1(mutableState) instanceof DownloadState.Downloading)) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
