package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: TimetableDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TimetableDialogKt$TimetableDialog$2$1$1$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Pair<String, Integer> $active;
    final /* synthetic */ String $activeDayName;
    final /* synthetic */ int $activePeriod;
    final /* synthetic */ Pair<String, String> $currentParsed;
    final /* synthetic */ MutableState<String> $customFullName$delegate;
    final /* synthetic */ MutableState<String> $customShortChar$delegate;
    final /* synthetic */ SnapshotStateMap<String, List<String>> $editableSchedule;
    final /* synthetic */ MutableState<Pair<String, Integer>> $selectedCell$delegate;

    TimetableDialogKt$TimetableDialog$2$1$1$3(Pair<String, String> pair, String str, int i, MutableState<Pair<String, Integer>> mutableState, SnapshotStateMap<String, List<String>> snapshotStateMap, Pair<String, Integer> pair2, MutableState<String> mutableState2, MutableState<String> mutableState3) {
        this.$currentParsed = pair;
        this.$activeDayName = str;
        this.$activePeriod = i;
        this.$selectedCell$delegate = mutableState;
        this.$editableSchedule = snapshotStateMap;
        this.$active = pair2;
        this.$customFullName$delegate = mutableState2;
        this.$customShortChar$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        final MutableState<Pair<String, Integer>> mutableState;
        final MutableState<String> mutableState2;
        final MutableState<String> mutableState3;
        final MutableState<String> mutableState4;
        ComposerKt.sourceInformation(composer, "C485@23467L10447:TimetableDialog.kt#7ivg5k");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1116883163, i, -1, "com.rhythmbyte.contactbook.ui.components.TimetableDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimetableDialog.kt:485)");
            }
            float f = 10;
            Modifier modifierM688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(f)))), 0.0f, 0.0f, 0.0f, Dp.m6302constructorimpl(16), 7, null);
            Pair<String, String> pair = this.$currentParsed;
            String str2 = this.$activeDayName;
            int i2 = this.$activePeriod;
            MutableState<Pair<String, Integer>> mutableState5 = this.$selectedCell$delegate;
            final SnapshotStateMap<String, List<String>> snapshotStateMap = this.$editableSchedule;
            final Pair<String, Integer> pair2 = this.$active;
            MutableState<String> mutableState6 = this.$customFullName$delegate;
            MutableState<String> mutableState7 = this.$customShortChar$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM688paddingqDBjuR0$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -203041056, "C494@23867L2190,531@26087L41,537@26430L3709,533@26158L3981,595@30169L41,597@30240L3648:TimetableDialog.kt#7ivg5k");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1856870272, "C499@24165L1467,524@25724L23,523@25666L361:TimetableDialog.kt#7ivg5k");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -883349560, "C500@24255L746,513@25038L39,519@25539L11,514@25114L484:TimetableDialog.kt#7ivg5k");
            float f2 = 6;
            Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2))), ColorKt.getSky500(), null, 2, null), Dp.m6302constructorimpl(7), Dp.m6302constructorimpl(2));
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM685paddingVpY3zN4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -325062982, "C506@24629L334:TimetableDialog.kt#7ivg5k");
            TextKt.m2376Text4IGK_g(str2 + " 第 " + i2 + " 節", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float f3 = 8;
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer, 6);
            String first = pair.getFirst();
            if (first.length() == 0) {
                first = "（未排課）";
            }
            if (pair.getSecond().length() > 0) {
                str = "【主頁: " + ((Object) pair.getSecond()) + "】";
            } else {
                str = "";
            }
            TextKt.m2376Text4IGK_g("目前：" + ((Object) first) + str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(11.5d), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.startReplaceGroup(78696340);
            ComposerKt.sourceInformation(composer, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState5;
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TimetableDialogKt$TimetableDialog$2$1$1$3.invoke$lambda$13$lambda$5$lambda$4$lambda$3(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState = mutableState5;
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton((Function0) objRememberedValue, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(24)), false, null, null, ComposableSingletons$TimetableDialogKt.INSTANCE.m6735getLambda3$app_release(), composer, 196662, 28);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
            final MutableState<Pair<String, Integer>> mutableState8 = mutableState;
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f2)), Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f2)), 0, 0, null, ComposableLambdaKt.rememberComposableLambda(895225376, true, new TimetableDialogKt$TimetableDialog$2$1$1$3$1$2(snapshotStateMap, pair2, mutableState6, mutableState7, mutableState8), composer, 54), composer, 1573302, 56);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f3));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, centerVertically3, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1850501136, "C615@31473L113,604@30671L360,602@30540L1080,630@32355L113,622@31786L133,620@31654L848,649@33514L37,636@32590L862,635@32536L1322:TimetableDialog.kt#7ivg5k");
            String strTimetableDialog$lambda$8 = TimetableDialogKt.TimetableDialog$lambda$8(mutableState6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.8f, false, 2, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            TextFieldColors textFieldColorsM2026colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getSky500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(78854981);
            ComposerKt.sourceInformation(composer, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState6;
                mutableState3 = mutableState7;
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TimetableDialogKt$TimetableDialog$2$1$1$3.invoke$lambda$13$lambda$12$lambda$7$lambda$6(mutableState2, mutableState3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState2 = mutableState6;
                mutableState3 = mutableState7;
            }
            composer.endReplaceGroup();
            final MutableState<String> mutableState9 = mutableState2;
            MutableState<String> mutableState10 = mutableState3;
            OutlinedTextFieldKt.OutlinedTextField(strTimetableDialog$lambda$8, (Function1<? super String, Unit>) objRememberedValue2, modifierWeight$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$TimetableDialogKt.INSTANCE.m6736getLambda4$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$TimetableDialogKt.INSTANCE.m6737getLambda5$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_4, textFieldColorsM2026colors0hiis_0, composer, 14155824, 12582912, 0, 1965880);
            String strTimetableDialog$lambda$11 = TimetableDialogKt.TimetableDialog$lambda$11(mutableState10);
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.1f, false, 2, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            TextFieldColors textFieldColorsM2026colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getSky500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(78890434);
            ComposerKt.sourceInformation(composer, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableState4 = mutableState10;
                objRememberedValue3 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TimetableDialogKt$TimetableDialog$2$1$1$3.invoke$lambda$13$lambda$12$lambda$9$lambda$8(mutableState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                mutableState4 = mutableState10;
            }
            composer.endReplaceGroup();
            final MutableState<String> mutableState11 = mutableState4;
            OutlinedTextFieldKt.OutlinedTextField(strTimetableDialog$lambda$11, (Function1<? super String, Unit>) objRememberedValue3, modifierWeight$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$TimetableDialogKt.INSTANCE.m6738getLambda6$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$TimetableDialogKt.INSTANCE.m6739getLambda7$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_5, textFieldColorsM2026colors0hiis_1, composer, 14155824, 12582912, 0, 1965880);
            ButtonColors buttonColorsM1491buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(ColorKt.getSky500(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            Modifier modifierM715height3ABfNKs = SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(52));
            composer.startReplaceGroup(78916891);
            ComposerKt.sourceInformation(composer, "CC(remember):TimetableDialog.kt#9igjgp");
            boolean zChanged = composer.changed(snapshotStateMap) | composer.changed(pair2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TimetableDialogKt$TimetableDialog$2$1$1$3.invoke$lambda$13$lambda$12$lambda$11$lambda$10(snapshotStateMap, pair2, mutableState9, mutableState11, mutableState8);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue4 = obj;
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) objRememberedValue4, modifierM715height3ABfNKs, false, roundedCornerShapeM967RoundedCornerShape0680j_6, buttonColorsM1491buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$TimetableDialogKt.INSTANCE.m6740getLambda8$app_release(), composer, 805306416, 484);
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
    public static final Unit invoke$lambda$13$lambda$5$lambda$4$lambda$3(MutableState mutableState) {
        TimetableDialogKt.TimetableDialog$lambda$6(mutableState, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$7$lambda$6(MutableState mutableState, MutableState mutableState2, String newFull) {
        Intrinsics.checkNotNullParameter(newFull, "newFull");
        mutableState.setValue(newFull);
        if (TimetableDialogKt.TimetableDialog$lambda$11(mutableState2).length() == 0 || Intrinsics.areEqual(TimetableDialogKt.TimetableDialog$lambda$11(mutableState2), StringsKt.take(TimetableDialogKt.TimetableDialog$lambda$8(mutableState), 1))) {
            mutableState2.setValue(StringsKt.take(StringsKt.trim((CharSequence) newFull).toString(), 1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$9$lambda$8(MutableState mutableState, String newShort) {
        Intrinsics.checkNotNullParameter(newShort, "newShort");
        mutableState.setValue(StringsKt.take(StringsKt.trim((CharSequence) newShort).toString(), 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(SnapshotStateMap snapshotStateMap, Pair pair, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        if (!StringsKt.isBlank(TimetableDialogKt.TimetableDialog$lambda$8(mutableState))) {
            String cell = TimetableData.INSTANCE.formatCell(TimetableDialogKt.TimetableDialog$lambda$8(mutableState), TimetableDialogKt.TimetableDialog$lambda$11(mutableState2));
            ArrayList arrayList = (List) snapshotStateMap.get(pair.getFirst());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            while (mutableList.size() <= ((Number) pair.getSecond()).intValue()) {
                mutableList.add("");
            }
            mutableList.set(((Number) pair.getSecond()).intValue(), cell);
            snapshotStateMap.put(pair.getFirst(), mutableList);
            if (((Number) pair.getSecond()).intValue() < 9) {
                TimetableDialogKt.TimetableDialog$lambda$6(mutableState3, TuplesKt.to(pair.getFirst(), Integer.valueOf(((Number) pair.getSecond()).intValue() + 1)));
            }
        }
        return Unit.INSTANCE;
    }
}
