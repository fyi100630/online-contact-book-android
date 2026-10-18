package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.rhythmbyte.contactbook.data.repository.InstallStats;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: InstallStatsDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"InstallStatsDialog", "", "stats", "Lcom/rhythmbyte/contactbook/data/repository/InstallStats;", "isLoading", "", "onRefresh", "Lkotlin/Function0;", "onDismiss", "(Lcom/rhythmbyte/contactbook/data/repository/InstallStats;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InstallStatsDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstallStatsDialog$lambda$0(InstallStats installStats, boolean z, Function0 function0, Function0 function1, int i, Composer composer, int i2) {
        InstallStatsDialog(installStats, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstallStatsDialog(final InstallStats installStats, final boolean z, final Function0<Unit> onRefresh, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482833224);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InstallStatsDialog)P(3!1,2)46@1945L8052,46@1908L8089:InstallStatsDialog.kt#7ivg5k");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(installStats) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRefresh) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482833224, i2, -1, "com.rhythmbyte.contactbook.ui.components.InstallStatsDialog (InstallStatsDialog.kt:45)");
            }
            AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-1495971007, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.InstallStatsDialogKt.InstallStatsDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C50@2091L11,53@2220L7771,47@1955L8036:InstallStatsDialog.kt#7ivg5k");
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1495971007, i3, -1, "com.rhythmbyte.contactbook.ui.components.InstallStatsDialog.<anonymous> (InstallStatsDialog.kt:47)");
                        }
                        float f = 24;
                        RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
                        float fM6302constructorimpl = Dp.m6302constructorimpl(f);
                        long jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null);
                        float fM6302constructorimpl2 = Dp.m6302constructorimpl(16);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        RoundedCornerShape roundedCornerShape = roundedCornerShapeM967RoundedCornerShape0680j_4;
                        final InstallStats installStats2 = installStats;
                        final boolean z2 = z;
                        final Function0<Unit> function1 = onRefresh;
                        final Function0<Unit> function2 = onDismiss;
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(modifierFillMaxWidth$default, roundedCornerShape, fM6302constructorimpl, jM3842copywmQWz5c$default, 0L, fM6302constructorimpl2, ComposableLambdaKt.rememberComposableLambda(-1328804542, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.InstallStatsDialogKt.InstallStatsDialog.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                Map<String, Integer> mapEmptyMap;
                                String str;
                                Object obj;
                                int i5;
                                String str2;
                                String str3;
                                String str4;
                                int i6;
                                int i7;
                                float f2;
                                ComposerKt.sourceInformation(composer3, "C57@2350L21,54@2234L7747:InstallStatsDialog.kt#7ivg5k");
                                if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1328804542, i4, -1, "com.rhythmbyte.contactbook.ui.components.InstallStatsDialog.<anonymous>.<anonymous> (InstallStatsDialog.kt:54)");
                                    }
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(22)), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                    InstallStats installStats3 = installStats2;
                                    boolean z3 = z2;
                                    Function0<Unit> function3 = function1;
                                    Function0<Unit> function4 = function2;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierVerticalScroll$default);
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
                                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1156562101, "C60@2406L1047,85@3471L41,90@3653L1804,130@5475L41,134@5622L10,136@5737L11,132@5534L242,138@5793L40,203@9050L41,205@9109L858:InstallStatsDialog.kt#7ivg5k");
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 199198238, "C65@2644L498:InstallStatsDialog.kt#7ivg5k");
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1863657560, "C66@2722L28,67@2775L39,70@2941L10,72@3073L11,68@2839L281:InstallStatsDialog.kt#7ivg5k");
                                    TextKt.m2376Text4IGK_g("📊", (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3078, 0, 131062);
                                    float f3 = 8;
                                    SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                                    TextKt.m2376Text4IGK_g("安裝與版本統計", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, 196614, 0, 65498);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.startReplaceGroup(-547747459);
                                    ComposerKt.sourceInformation(composer3, "77@3205L208");
                                    if (z3) {
                                        ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(18)), ColorKt.getEmerald500(), Dp.m6302constructorimpl(2), 0L, 0, composer3, 438, 24);
                                    }
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    float f4 = 16;
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f4)), composer3, 6);
                                    int totalInstalls = installStats3 != null ? installStats3.getTotalInstalls() : 0;
                                    if (installStats3 == null || (mapEmptyMap = installStats3.getVersionCounts()) == null) {
                                        mapEmptyMap = MapsKt.emptyMap();
                                    }
                                    Map<String, Integer> map = mapEmptyMap;
                                    Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BorderKt.m250borderxT4_qwU(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f4))), Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6302constructorimpl(1), Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f4))), Dp.m6302constructorimpl(f4), Dp.m6302constructorimpl(14));
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 200631709, "C98@4071L1368:InstallStatsDialog.kt#7ivg5k");
                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer3, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default3);
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1862042026, "C103@4329L664,118@5018L399:InstallStatsDialog.kt#7ivg5k");
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, companion2);
                                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor6);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3336constructorimpl6 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(composerM3336constructorimpl6, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        composerM3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1884019742, "C104@4366L247,110@4642L40,111@4711L256:InstallStatsDialog.kt#7ivg5k");
                                    int i8 = totalInstalls;
                                    String str5 = "C100@5047L9:Row.kt#2w3rfo";
                                    String str6 = "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo";
                                    TextKt.m2376Text4IGK_g("總安裝裝置數", (Modifier) null, ColorKt.getSlate500(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200070, 0, 131026);
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(2)), composer3, 6);
                                    TextKt.m2376Text4IGK_g(i8 + " 台裝置", (Modifier) null, ColorKt.getEmerald500(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131026);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Modifier modifierM239backgroundbw27NRU$default = BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierM239backgroundbw27NRU$default);
                                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor7);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3336constructorimpl7 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(composerM3336constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        composerM3336constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        composerM3336constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1884991003, "C125@5363L28:InstallStatsDialog.kt#7ivg5k");
                                    int i9 = i8;
                                    String str7 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                                    TextKt.m2376Text4IGK_g("📱", (Modifier) null, 0L, TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3078, 0, 131062);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f4)), composer3, 6);
                                    TextKt.m2376Text4IGK_g("各版本使用人數分佈", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65498);
                                    Composer composer4 = composer3;
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer4, 6);
                                    if (map.isEmpty()) {
                                        composer4.startReplaceGroup(-1153335963);
                                        ComposerKt.sourceInformation(composer4, "141@5899L518");
                                        Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6302constructorimpl(f4), 1, null);
                                        Alignment center2 = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, str7);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer4, modifierM686paddingVpY3zN4$default);
                                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor8);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM3336constructorimpl8 = Updater.m3336constructorimpl(composer4);
                                        Updater.m3343setimpl(composerM3336constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                            composerM3336constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                            composerM3336constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl8, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 202665030, "C147@6156L239:InstallStatsDialog.kt#7ivg5k");
                                        TextKt.m2376Text4IGK_g(z3 ? "正在獲取統計資料..." : "暫無統計資料", (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
                                        composer4 = composer3;
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endReplaceGroup();
                                        i6 = -1323940314;
                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                        obj = null;
                                        i5 = 1;
                                        str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                        str3 = str5;
                                        str4 = str6;
                                    } else {
                                        String str8 = "C73@3429L9:Box.kt#2w3rfo";
                                        String str9 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                        obj = null;
                                        int i10 = 1;
                                        composer4.startReplaceGroup(-1152713452);
                                        ComposerKt.sourceInformation(composer4, "157@6559L2455");
                                        List<Pair> listSortedWith = CollectionsKt.sortedWith(MapsKt.toList(map), new Comparator() { // from class: com.rhythmbyte.contactbook.ui.components.InstallStatsDialogKt$InstallStatsDialog$1$1$invoke$lambda$13$$inlined$sortedByDescending$1
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.Comparator
                                            public final int compare(T t, T t2) {
                                                return ComparisonsKt.compareValues((Integer) ((Pair) t2).getSecond(), (Integer) ((Pair) t).getSecond());
                                            }
                                        });
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(10));
                                        String str10 = "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo";
                                        int i11 = -483455358;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, str10);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer4, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str);
                                        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer4, companion3);
                                        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str9);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor9);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM3336constructorimpl9 = Updater.m3336constructorimpl(composer4);
                                        Updater.m3343setimpl(composerM3336constructorimpl9, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                            composerM3336constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                            composerM3336constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl9, modifierMaterializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                        String str11 = "C87@4365L9:Column.kt#2w3rfo";
                                        ComposerKt.sourceInformationMarkerStart(composer4, -384862393, str11);
                                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 203213544, "C:InstallStatsDialog.kt#7ivg5k");
                                        composer4.startReplaceGroup(-547634053);
                                        ComposerKt.sourceInformation(composer4, "*162@6895L2071");
                                        for (Pair pair : listSortedWith) {
                                            String str12 = (String) pair.component1();
                                            int iIntValue = ((Number) pair.component2()).intValue();
                                            if (i9 > 0) {
                                                i7 = i9;
                                                f2 = (iIntValue * 100.0f) / i7;
                                            } else {
                                                i7 = i9;
                                                f2 = 0.0f;
                                            }
                                            float f5 = i7 > 0 ? iIntValue / i7 : 0.0f;
                                            String str13 = str8;
                                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i10, obj);
                                            ComposerKt.sourceInformationMarkerStart(composer4, i11, str10);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str);
                                            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap10 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default4);
                                            Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                                            float f6 = f5;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str9);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor10);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM3336constructorimpl10 = Updater.m3336constructorimpl(composer4);
                                            Updater.m3343setimpl(composerM3336constructorimpl10, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3343setimpl(composerM3336constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3336constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                composerM3336constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                                                composerM3336constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                            }
                                            Updater.m3343setimpl(composerM3336constructorimpl10, modifierMaterializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -384862393, str11);
                                            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1859393014, "C163@6972L1015,181@8020L40,188@8403L11,183@8094L842:InstallStatsDialog.kt#7ivg5k");
                                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
                                            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                                            float f7 = f2;
                                            String str14 = str6;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str14);
                                            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically4, composer4, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str);
                                            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap11 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default5);
                                            Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str9);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor11);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM3336constructorimpl11 = Updater.m3336constructorimpl(composer4);
                                            Updater.m3343setimpl(composerM3336constructorimpl11, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3343setimpl(composerM3336constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3336constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                                composerM3336constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                                                composerM3336constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                            }
                                            Updater.m3343setimpl(composerM3336constructorimpl11, modifierMaterializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                                            String str15 = str5;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -407918630, str15);
                                            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 1886922272, "C172@7546L11,168@7290L315,174@7642L311:InstallStatsDialog.kt#7ivg5k");
                                            String str16 = str11;
                                            String str17 = str10;
                                            i9 = i7;
                                            String str18 = str9;
                                            String str19 = str7;
                                            TextKt.m2376Text4IGK_g("v" + str12, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131026);
                                            TextKt.m2376Text4IGK_g(iIntValue + " 人 (" + ((int) f7) + "%)", (Modifier) null, ColorKt.getSky500(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131026);
                                            composer4 = composer3;
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(4)), composer4, 6);
                                            obj = null;
                                            float f8 = 6;
                                            float f9 = 3;
                                            Modifier modifierM239backgroundbw27NRU$default2 = BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6302constructorimpl(f8)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f9))), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurface(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, str19);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            str = str;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str);
                                            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap12 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer4, modifierM239backgroundbw27NRU$default2);
                                            Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str18);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor12);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM3336constructorimpl12 = Updater.m3336constructorimpl(composer4);
                                            Updater.m3343setimpl(composerM3336constructorimpl12, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3343setimpl(composerM3336constructorimpl12, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3336constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                                                composerM3336constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                                                composerM3336constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                                            }
                                            Updater.m3343setimpl(composerM3336constructorimpl12, modifierMaterializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, str13);
                                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 1888130838, "C190@8517L385:InstallStatsDialog.kt#7ivg5k");
                                            BoxKt.Box(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, RangesKt.coerceIn(f6, 0.0f, 1.0f)), Dp.m6302constructorimpl(f8)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f9))), ColorKt.getSky500(), null, 2, null), composer4, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            str7 = str19;
                                            str8 = str13;
                                            str9 = str18;
                                            i10 = 1;
                                            str11 = str16;
                                            str10 = str17;
                                            i11 = -483455358;
                                            str5 = str15;
                                            str6 = str14;
                                        }
                                        i5 = i10;
                                        str2 = str9;
                                        str3 = str5;
                                        str4 = str6;
                                        i6 = -1323940314;
                                        composer4.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endReplaceGroup();
                                    }
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(20)), composer4, 6);
                                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i5, obj);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str4);
                                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer4, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer4, i6, str);
                                    int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap13 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default6);
                                    Function0<ComposeUiNode> constructor13 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str2);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor13);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM3336constructorimpl13 = Updater.m3336constructorimpl(composer4);
                                    Updater.m3343setimpl(composerM3336constructorimpl13, measurePolicyRowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(composerM3336constructorimpl13, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3336constructorimpl13.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                                        composerM3336constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                                        composerM3336constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                                    }
                                    Updater.m3343setimpl(composerM3336constructorimpl13, modifierMaterializeModifier13, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407918630, str3);
                                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 205767758, "C209@9270L268,216@9559L39,219@9720L41,217@9619L330:InstallStatsDialog.kt#7ivg5k");
                                    float f10 = 12;
                                    ButtonKt.OutlinedButton(function3, null, !z3, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f10)), null, null, null, null, null, ComposableSingletons$InstallStatsDialogKt.INSTANCE.m6730getLambda1$app_release(), composer4, 805306368, 498);
                                    SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer4, 6);
                                    ButtonKt.Button(function4, null, false, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f10)), ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(ColorKt.getEmerald500(), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableSingletons$InstallStatsDialogKt.INSTANCE.m6731getLambda2$app_release(), composer3, 805306368, 486);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
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
                        }, composer2, 54), composer2, 1769862, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 384, 2);
            function0 = onDismiss;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onDismiss;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.InstallStatsDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstallStatsDialogKt.InstallStatsDialog$lambda$0(installStats, z, onRefresh, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
