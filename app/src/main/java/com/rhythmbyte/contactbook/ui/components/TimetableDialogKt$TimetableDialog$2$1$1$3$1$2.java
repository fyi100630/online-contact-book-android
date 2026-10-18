package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimetableDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TimetableDialogKt$TimetableDialog$2$1$1$3$1$2 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ Pair<String, Integer> $active;
    final /* synthetic */ MutableState<String> $customFullName$delegate;
    final /* synthetic */ MutableState<String> $customShortChar$delegate;
    final /* synthetic */ SnapshotStateMap<String, List<String>> $editableSchedule;
    final /* synthetic */ MutableState<Pair<String, Integer>> $selectedCell$delegate;

    TimetableDialogKt$TimetableDialog$2$1$1$3$1$2(SnapshotStateMap<String, List<String>> snapshotStateMap, Pair<String, Integer> pair, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Pair<String, Integer>> mutableState3) {
        this.$editableSchedule = snapshotStateMap;
        this.$active = pair;
        this.$customFullName$delegate = mutableState;
        this.$customShortChar$delegate = mutableState2;
        this.$selectedCell$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        final String str;
        final String str2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        ComposerKt.sourceInformation(composer2, "C580@29259L577,576@28992L1117:TimetableDialog.kt#7ivg5k");
        if ((i & 17) != 16 || !composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(895225376, i, -1, "com.rhythmbyte.contactbook.ui.components.TimetableDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimetableDialog.kt:538)");
            }
            composer2.startReplaceGroup(78722491);
            ComposerKt.sourceInformation(composer2, "*542@26755L11,543@26853L913,539@26544L2380");
            for (Pair pair : TimetableDialogKt.COMMON_SUBJECTS) {
                String str3 = (String) pair.component1();
                String str4 = (String) pair.component2();
                Modifier modifierM239backgroundbw27NRU$default = BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(8))), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer2.startReplaceGroup(78733358);
                ComposerKt.sourceInformation(composer2, "CC(remember):TimetableDialog.kt#9igjgp");
                boolean zChanged = composer2.changed(str3) | composer2.changed(str4) | composer2.changed(this.$editableSchedule) | composer2.changed(this.$active);
                final SnapshotStateMap<String, List<String>> snapshotStateMap = this.$editableSchedule;
                final Pair<String, Integer> pair2 = this.$active;
                final MutableState<String> mutableState = this.$customFullName$delegate;
                final MutableState<String> mutableState2 = this.$customShortChar$delegate;
                final MutableState<Pair<String, Integer>> mutableState3 = this.$selectedCell$delegate;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    str = str4;
                    str2 = str3;
                    objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$3$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TimetableDialogKt$TimetableDialog$2$1$1$3$1$2.invoke$lambda$1$lambda$0(str2, str, snapshotStateMap, pair2, mutableState, mutableState2, mutableState3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    str = str4;
                    str2 = str3;
                }
                composer2.endReplaceGroup();
                Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(ClickableKt.m272clickableXHw0xAI$default(modifierM239backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6302constructorimpl(9), Dp.m6302constructorimpl(5));
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM685paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -879710191, "C558@27936L950:TimetableDialog.kt#7ivg5k");
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -321670466, "C563@28319L11,559@28034L352,565@28431L39,566@28515L329:TimetableDialog.kt#7ivg5k");
                TextKt.m2376Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(3)), composer, 6);
                TextKt.m2376Text4IGK_g("(" + str + ")", (Modifier) null, ColorKt.getSky500(), TextUnitKt.getSp(9.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 0, 131026);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
            composer2.endReplaceGroup();
            Modifier modifierM239backgroundbw27NRU$default2 = BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(8))), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3877getRed0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer2.startReplaceGroup(78810014);
            ComposerKt.sourceInformation(composer2, "CC(remember):TimetableDialog.kt#9igjgp");
            boolean zChanged2 = composer2.changed(this.$editableSchedule) | composer2.changed(this.$active);
            final SnapshotStateMap<String, List<String>> snapshotStateMap2 = this.$editableSchedule;
            final Pair<String, Integer> pair3 = this.$active;
            final MutableState<String> mutableState4 = this.$customFullName$delegate;
            final MutableState<String> mutableState5 = this.$customShortChar$delegate;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$3$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TimetableDialogKt$TimetableDialog$2$1$1$3$1$2.invoke$lambda$5$lambda$4(snapshotStateMap2, pair3, mutableState4, mutableState5);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier modifierM685paddingVpY3zN5 = PaddingKt.m685paddingVpY3zN4(ClickableKt.m272clickableXHw0xAI$default(modifierM239backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m6302constructorimpl(9), Dp.m6302constructorimpl(5));
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM685paddingVpY3zN5);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer2);
            Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -877695594, "C591@29994L81:TimetableDialog.kt#7ivg5k");
            TextKt.m2376Text4IGK_g("✕ 清空", (Modifier) null, Color.INSTANCE.m3877getRed0d7_KjU(), TextUnitKt.getSp(11.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
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
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String str, String str2, SnapshotStateMap snapshotStateMap, Pair pair, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        mutableState.setValue(str);
        mutableState2.setValue(str2);
        String cell = TimetableData.INSTANCE.formatCell(str, str2);
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(SnapshotStateMap snapshotStateMap, Pair pair, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("");
        mutableState2.setValue("");
        ArrayList arrayList = (List) snapshotStateMap.get(pair.getFirst());
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (((Number) pair.getSecond()).intValue() < mutableList.size()) {
            mutableList.set(((Number) pair.getSecond()).intValue(), "");
            snapshotStateMap.put(pair.getFirst(), mutableList);
        }
        return Unit.INSTANCE;
    }
}
