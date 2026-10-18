package com.rhythmbyte.contactbook.ui.screens;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PasswordDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"PasswordDialog", "", "onDismiss", "Lkotlin/Function0;", "onConfirm", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release", HintConstants.AUTOFILL_HINT_PASSWORD, "isError", "isVerifying"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PasswordDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordDialog$lambda$11(Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        PasswordDialog(function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PasswordDialog(final Function0<Unit> onDismiss, final Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> onConfirm, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-800690360);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PasswordDialog)P(1)47@2024L31,48@2075L34,49@2133L34,50@2184L24,52@2240L33,52@2275L4688,52@2214L4749:PasswordDialog.kt#yz3s17");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConfirm) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-800690360, i2, -1, "com.rhythmbyte.contactbook.ui.screens.PasswordDialog (PasswordDialog.kt:46)");
            }
            composerStartRestartGroup.startReplaceGroup(1294619835);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PasswordDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1294621470);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PasswordDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1294623326);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PasswordDialog.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue4 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(1294626749);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):PasswordDialog.kt#9igjgp");
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PasswordDialogKt.PasswordDialog$lambda$10$lambda$9(onDismiss, mutableState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue5, null, ComposableLambdaKt.rememberComposableLambda(-1269692769, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt.PasswordDialog.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    ComposerKt.sourceInformation(composer3, "C56@2421L11,59@2550L4407,53@2285L4672:PasswordDialog.kt#yz3s17");
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1269692769, i3, -1, "com.rhythmbyte.contactbook.ui.screens.PasswordDialog.<anonymous> (PasswordDialog.kt:53)");
                        }
                        float f = 24;
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(16), ComposableLambdaKt.rememberComposableLambda(1034513790, true, new AnonymousClass1(coroutineScope, onConfirm, onDismiss, mutableState, mutableState3, mutableState2), composer3, 54), composer3, 1769862, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: PasswordDialog.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ MutableState<Boolean> $isError$delegate;
                    final /* synthetic */ MutableState<Boolean> $isVerifying$delegate;
                    final /* synthetic */ Function2<String, Continuation<? super Boolean>, Object> $onConfirm;
                    final /* synthetic */ Function0<Unit> $onDismiss;
                    final /* synthetic */ MutableState<String> $password$delegate;
                    final /* synthetic */ CoroutineScope $scope;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(CoroutineScope coroutineScope, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function2, Function0<Unit> function0, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
                        this.$scope = coroutineScope;
                        this.$onConfirm = function2;
                        this.$onDismiss = function0;
                        this.$password$delegate = mutableState;
                        this.$isVerifying$delegate = mutableState2;
                        this.$isError$delegate = mutableState3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        MutableState<Boolean> mutableState;
                        final MutableState<String> mutableState2;
                        final MutableState<Boolean> mutableState3;
                        Object obj;
                        final MutableState<Boolean> mutableState4;
                        ComposerKt.sourceInformation(composer, "C60@2564L4383:PasswordDialog.kt#yz3s17");
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1034513790, i, -1, "com.rhythmbyte.contactbook.ui.screens.PasswordDialog.<anonymous>.<anonymous> (PasswordDialog.kt:60)");
                            }
                            Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(24));
                            final CoroutineScope coroutineScope = this.$scope;
                            final Function2<String, Continuation<? super Boolean>, Object> function2 = this.$onConfirm;
                            final Function0<Unit> function0 = this.$onDismiss;
                            final MutableState<String> mutableState5 = this.$password$delegate;
                            final MutableState<Boolean> mutableState6 = this.$isVerifying$delegate;
                            final MutableState<Boolean> mutableState7 = this.$isError$delegate;
                            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM684padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer);
                            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, 303140148, "C65@2747L10,67@2863L11,63@2655L247,70@2920L40,74@3093L10,72@2978L230,79@3226L41,97@4033L445,116@4923L85,83@3378L114,109@4578L177,81@3285L1741,121@5044L41,123@5103L1830:PasswordDialog.kt#yz3s17");
                            TextKt.m2376Text4IGK_g("🔑 解鎖編輯／管理員權限", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65498);
                            float f = 8;
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                            TextKt.m2376Text4IGK_g("輸入通行碼後將為您在此裝置長期記住身分，下次開啟 App 無須重複輸入！", (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 3462, 0, 65522);
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(16)), composer, 6);
                            String strPasswordDialog$lambda$1 = PasswordDialogKt.PasswordDialog$lambda$1(mutableState5);
                            boolean z = !PasswordDialogKt.PasswordDialog$lambda$7(mutableState6);
                            PasswordVisualTransformation passwordVisualTransformation = new PasswordVisualTransformation((char) 0, 1, null);
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6024getPasswordPjHm6EE(), ImeAction.INSTANCE.m5966getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                            composer.startReplaceGroup(702555638);
                            ComposerKt.sourceInformation(composer, "CC(remember):PasswordDialog.kt#9igjgp");
                            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(function2) | composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return PasswordDialogKt.AnonymousClass2.AnonymousClass1.invoke$lambda$7$lambda$1$lambda$0(coroutineScope, mutableState6, function2, function0, mutableState5, mutableState7, (KeyboardActionScope) obj3);
                                    }
                                };
                                mutableState = mutableState6;
                                composer.updateRememberedValue(obj2);
                                objRememberedValue = obj2;
                            } else {
                                mutableState = mutableState6;
                            }
                            composer.endReplaceGroup();
                            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
                            boolean zPasswordDialog$lambda$4 = PasswordDialogKt.PasswordDialog$lambda$4(mutableState7);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(14));
                            TextFieldColors textFieldColorsM2026colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
                            composer.startReplaceGroup(702534347);
                            ComposerKt.sourceInformation(composer, "CC(remember):PasswordDialog.kt#9igjgp");
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                mutableState2 = mutableState5;
                                mutableState3 = mutableState7;
                                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return PasswordDialogKt.AnonymousClass2.AnonymousClass1.invoke$lambda$7$lambda$3$lambda$2(mutableState2, mutableState3, (String) obj3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            } else {
                                mutableState2 = mutableState5;
                                mutableState3 = mutableState7;
                            }
                            composer.endReplaceGroup();
                            final MutableState<String> mutableState8 = mutableState2;
                            final MutableState<Boolean> mutableState9 = mutableState3;
                            OutlinedTextFieldKt.OutlinedTextField(strPasswordDialog$lambda$1, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$PasswordDialogKt.INSTANCE.m6829getLambda1$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$PasswordDialogKt.INSTANCE.passwordDialogSecondaryLambda(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(597119041, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1$1$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i2) {
                                    ComposerKt.sourceInformation(composer2, "C111@4689L11,111@4647L60:PasswordDialog.kt#yz3s17");
                                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(597119041, i2, -1, "com.rhythmbyte.contactbook.ui.screens.PasswordDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PasswordDialog.kt:110)");
                                        }
                                        if (PasswordDialogKt.PasswordDialog$lambda$4(mutableState3)) {
                                            TextKt.m2376Text4IGK_g("密碼錯誤，請重新輸入！", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131066);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, composer, 54), zPasswordDialog$lambda$4, (VisualTransformation) passwordVisualTransformation, keyboardOptions, keyboardActions, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_4, textFieldColorsM2026colors0hiis_0, composer, 14156208, 12779904, 0, 1838896);
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(20)), composer, 6);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer);
                            Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -742295464, "C127@5264L247,134@5532L39,147@6177L41,136@5634L445,149@6300L615,135@5592L1323:PasswordDialog.kt#yz3s17");
                            float f2 = 12;
                            ButtonKt.OutlinedButton(function0, null, !PasswordDialogKt.PasswordDialog$lambda$7(mutableState), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2)), null, null, null, null, null, ComposableSingletons$PasswordDialogKt.INSTANCE.m6831getLambda3$app_release(), composer, 805306368, 498);
                            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                            boolean z2 = !PasswordDialogKt.PasswordDialog$lambda$7(mutableState);
                            ButtonColors buttonColorsM1491buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(ColorKt.getEmerald500(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2));
                            composer.startReplaceGroup(-2102144363);
                            ComposerKt.sourceInformation(composer, "CC(remember):PasswordDialog.kt#9igjgp");
                            boolean zChangedInstance2 = composer.changedInstance(coroutineScope) | composer.changedInstance(function2) | composer.changed(function0);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                mutableState4 = mutableState;
                                obj = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PasswordDialogKt.AnonymousClass2.AnonymousClass1.invoke$lambda$7$lambda$6$lambda$5$lambda$4(coroutineScope, mutableState4, function2, function0, mutableState8, mutableState9);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                            } else {
                                obj = objRememberedValue3;
                                mutableState4 = mutableState;
                            }
                            composer.endReplaceGroup();
                            ButtonKt.Button((Function0) obj, null, z2, roundedCornerShapeM967RoundedCornerShape0680j_5, buttonColorsM1491buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1873168012, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1$1$4$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer2, int i2) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    ComposerKt.sourceInformation(composer2, "C:PasswordDialog.kt#yz3s17");
                                    if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1873168012, i2, -1, "com.rhythmbyte.contactbook.ui.screens.PasswordDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PasswordDialog.kt:150)");
                                        }
                                        if (PasswordDialogKt.PasswordDialog$lambda$7(mutableState4)) {
                                            composer2.startReplaceGroup(1960303981);
                                            ComposerKt.sourceInformation(composer2, "153@6519L11,151@6373L249,156@6651L39,157@6719L44");
                                            ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimary(), Dp.m6302constructorimpl(2), 0L, 0, composer2, 390, 24);
                                            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(6)), composer2, 6);
                                            TextKt.m2376Text4IGK_g("驗證中...", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 0, 131038);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(1960741577);
                                            ComposerKt.sourceInformation(composer2, "159@6825L42");
                                            TextKt.m2376Text4IGK_g("確認解鎖", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 0, 131038);
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, composer, 54), composer, 805306368, 482);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$3$lambda$2(MutableState mutableState, MutableState mutableState2, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        PasswordDialogKt.PasswordDialog$lambda$2(mutableState, it);
                        if (PasswordDialogKt.PasswordDialog$lambda$4(mutableState2)) {
                            PasswordDialogKt.PasswordDialog$lambda$5(mutableState2, false);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$1$lambda$0(CoroutineScope coroutineScope, MutableState mutableState, Function2 function2, Function0 function0, MutableState mutableState2, MutableState mutableState3, KeyboardActionScope KeyboardActions) {
                        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
                        if (!PasswordDialogKt.PasswordDialog$lambda$7(mutableState)) {
                            PasswordDialogKt.PasswordDialog$lambda$8(mutableState, true);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PasswordDialogKt$PasswordDialog$2$1$1$1$1$1(function2, function0, mutableState2, mutableState, mutableState3, null), 3, null);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(CoroutineScope coroutineScope, MutableState mutableState, Function2 function2, Function0 function0, MutableState mutableState2, MutableState mutableState3) {
                        if (!PasswordDialogKt.PasswordDialog$lambda$7(mutableState)) {
                            PasswordDialogKt.PasswordDialog$lambda$8(mutableState, true);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1(function2, function0, mutableState2, mutableState, mutableState3, null), 3, null);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PasswordDialogKt.PasswordDialog$lambda$11(onDismiss, onConfirm, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PasswordDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PasswordDialog$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PasswordDialog$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PasswordDialog$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PasswordDialog$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordDialog$lambda$10$lambda$9(Function0 function0, MutableState mutableState) {
        if (!PasswordDialog$lambda$7(mutableState)) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PasswordDialog$lambda$2(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}
