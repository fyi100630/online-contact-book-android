package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.kyant.backdrop.Backdrop;
import com.rhythmbyte.contactbook.R;
import com.rhythmbyte.contactbook.data.update.UpdateInfo;
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookUiState;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$4$2$1$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Backdrop $ambientBackdrop;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ boolean $isAdmin;
    final /* synthetic */ MutableState<Boolean> $isCheckingUpdateManually$delegate;
    final /* synthetic */ boolean $isDarkTheme;
    final /* synthetic */ boolean $isSuperAdmin;
    final /* synthetic */ MutableState<Boolean> $showLogsDialog$delegate;
    final /* synthetic */ MutableState<Boolean> $showPasswordDialog$delegate;
    final /* synthetic */ MutableState<Boolean> $showStatsDialog$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ State<ContactBookUiState> $uiState$delegate;
    final /* synthetic */ MutableState<UpdateInfo> $updateInfoToPrompt$delegate;
    final /* synthetic */ ContactBookViewModel $viewModel;

    HomeScreenKt$HomeScreen$4$2$1$1$1$1(boolean z, boolean z2, State<ContactBookUiState> state, CoroutineScope coroutineScope, Backdrop backdrop, boolean z3, ContactBookViewModel contactBookViewModel, MutableState<Boolean> mutableState, SnackbarHostState snackbarHostState, MutableState<UpdateInfo> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5) {
        this.$isAdmin = z;
        this.$isDarkTheme = z2;
        this.$uiState$delegate = state;
        this.$coroutineScope = coroutineScope;
        this.$ambientBackdrop = backdrop;
        this.$isSuperAdmin = z3;
        this.$viewModel = contactBookViewModel;
        this.$isCheckingUpdateManually$delegate = mutableState;
        this.$snackbarHostState = snackbarHostState;
        this.$updateInfoToPrompt$delegate = mutableState2;
        this.$showStatsDialog$delegate = mutableState3;
        this.$showLogsDialog$delegate = mutableState4;
        this.$showPasswordDialog$delegate = mutableState5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        final MutableState<Boolean> mutableState;
        ContactBookViewModel contactBookViewModel;
        ComposerKt.sourceInformation(composer, "C312@12527L10466:HomeScreen.kt#yz3s17");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-562131258, i, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:312)");
            }
            float f = 10;
            Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(Modifier.INSTANCE, Dp.m6302constructorimpl(12), Dp.m6302constructorimpl(f));
            boolean z = this.$isAdmin;
            boolean z2 = this.$isDarkTheme;
            State<ContactBookUiState> state = this.$uiState$delegate;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            Backdrop backdrop = this.$ambientBackdrop;
            boolean z3 = this.$isSuperAdmin;
            final ContactBookViewModel contactBookViewModel2 = this.$viewModel;
            MutableState<Boolean> mutableState2 = this.$isCheckingUpdateManually$delegate;
            final SnackbarHostState snackbarHostState = this.$snackbarHostState;
            final MutableState<UpdateInfo> mutableState3 = this.$updateInfoToPrompt$delegate;
            final MutableState<Boolean> mutableState4 = this.$showStatsDialog$delegate;
            final MutableState<Boolean> mutableState5 = this.$showLogsDialog$delegate;
            final MutableState<Boolean> mutableState6 = this.$showPasswordDialog$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM685paddingVpY3zN4);
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
            ComposerKt.sourceInformationMarkerStart(composer, -2000863778, "C313@12627L9192:HomeScreen.kt#yz3s17");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1236113424, "C319@12906L2962,367@15898L39,369@15967L5826:HomeScreen.kt#yz3s17");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierWeight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight);
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
            ComposerKt.sourceInformationMarkerStart(composer, -652181738, "C323@13132L797,337@13962L39,338@14034L1804:HomeScreen.kt#yz3s17");
            float f2 = 3;
            Modifier modifierM3507shadows4CzXII$default = ShadowKt.m3507shadows4CzXII$default(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(34)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f))), Color.INSTANCE.m3880getWhite0d7_KjU(), null, 2, null), Dp.m6302constructorimpl(f2), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), false, 0L, 0L, 28, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM3507shadows4CzXII$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 443704460, "C332@13667L44,331@13610L285:HomeScreen.kt#yz3s17");
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_app_logo, composer, 0), "App Logo", SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(26)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, MenuKt.InTransitionDuration);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float f3 = 8;
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer, 6);
            Modifier modifierWeight2 = rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierWeight2);
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
            Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 444258554, "C341@14260L10,344@14479L11,339@14125L541,348@14703L1101:HomeScreen.kt#yz3s17");
            TextKt.m2376Text4IGK_g(HomeScreenKt.HomeScreen$lambda$0(state).getClassTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6241getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 199680, 3120, 55250);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl6 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl6, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m3343setimpl(composerM3336constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1842285599, "C349@14797L355,355@15193L39,356@15273L493:HomeScreen.kt#yz3s17");
            float f4 = 5;
            BoxKt.Box(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f4)), RoundedCornerShapeKt.getCircleShape()), HomeScreenKt.HomeScreen$lambda$0(state).isRealtimeConnected() ? ColorKt.getEmerald500() : ColorKt.getRose500(), null, 2, null), composer, 0);
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2)), composer, 6);
            TextKt.m2376Text4IGK_g((HomeScreenKt.HomeScreen$lambda$0(state).isRealtimeConnected() ? "連線中" : "已離線").concat(" · v2.0.0"), (Modifier) null, HomeScreenKt.HomeScreen$lambda$0(state).isRealtimeConnected() ? ColorKt.getEmerald600() : ColorKt.getRose500(), TextUnitKt.getSp(9.5d), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 3072, 122834);
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
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float f5 = 6;
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f5)), composer, 6);
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            float f6 = 4;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f6));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, centerVertically4, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl7 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl7, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composerM3336constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composerM3336constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m3343setimpl(composerM3336constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -649049715, "C375@16260L863,393@17490L928,374@16200L2218:HomeScreen.kt#yz3s17");
            composer.startReplaceGroup(1780175450);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(coroutineScope);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState2;
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt$HomeScreen$4$2$1$1$1$1.invoke$lambda$17$lambda$15$lambda$14$lambda$5$lambda$4(coroutineScope, mutableState, snackbarHostState, mutableState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState = mutableState2;
            }
            composer.endReplaceGroup();
            float f7 = 32;
            LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue, backdrop, null, null, false, ColorKt.getEmerald600(), 0L, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(f5), Dp.m6302constructorimpl(f6)), Dp.m6302constructorimpl(f7), Dp.m6302constructorimpl(f7), null, ComposableLambdaKt.rememberComposableLambda(-112200122, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope LiquidButton, Composer composer2, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
                    ComposerKt.sourceInformation(composer2, "C403@18064L320:HomeScreen.kt#yz3s17");
                    if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-112200122, i2, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:394)");
                        }
                        if (HomeScreenKt.HomeScreen$lambda$25(mutableState)) {
                            composer2.startReplaceGroup(447623045);
                            ComposerKt.sourceInformation(composer2, "395@17600L275");
                            ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), Color.INSTANCE.m3880getWhite0d7_KjU(), Dp.m6302constructorimpl((float) 1.5d), 0L, 0, composer2, 438, 24);
                            composer2.endReplaceGroup();
                            i3 = 10;
                        } else {
                            composer2.startReplaceGroup(447973500);
                            ComposerKt.sourceInformation(composer2, "401@17961L28");
                            i3 = 10;
                            TextKt.m2376Text4IGK_g("🔄", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131062);
                            composer2.endReplaceGroup();
                        }
                        TextKt.m2376Text4IGK_g(HomeScreenKt.HomeScreen$lambda$25(mutableState) ? "檢查中" : "檢查更新", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(i3), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54), composer, 918552576, 48, 1116);
            composer.startReplaceGroup(1780246431);
            ComposerKt.sourceInformation(composer, "413@18572L184,412@18508L863,428@19473L25,427@19409L709");
            if (z3) {
                composer.startReplaceGroup(1780248755);
                ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(contactBookViewModel2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt$HomeScreen$4$2$1$1$1$1.invoke$lambda$17$lambda$15$lambda$14$lambda$7$lambda$6(contactBookViewModel2, mutableState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                contactBookViewModel = contactBookViewModel2;
                LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue2, backdrop, null, null, false, ColorKt.getSky500(), 0L, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(f5), Dp.m6302constructorimpl(f6)), Dp.m6302constructorimpl(f7), Dp.m6302constructorimpl(f7), null, ComposableSingletons$HomeScreenKt.INSTANCE.m6819getLambda1$app_release(), composer, 918552576, 48, 1116);
                composer.startReplaceGroup(1780277428);
                ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt$HomeScreen$4$2$1$1$1$1.invoke$lambda$17$lambda$15$lambda$14$lambda$9$lambda$8(mutableState5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue3, backdrop, null, null, false, ColorKt.getPurple500(), 0L, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(f5), Dp.m6302constructorimpl(f6)), Dp.m6302constructorimpl(f7), Dp.m6302constructorimpl(f7), null, ComposableSingletons$HomeScreenKt.INSTANCE.m6821getLambda2$app_release(), composer, 918552582, 48, 1116);
            } else {
                contactBookViewModel = contactBookViewModel2;
            }
            composer.endReplaceGroup();
            if (z) {
                composer.startReplaceGroup(-645231167);
                ComposerKt.sourceInformation(composer, "442@20301L22,441@20237L702");
                composer.startReplaceGroup(1780303921);
                ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
                final ContactBookViewModel contactBookViewModel3 = contactBookViewModel;
                boolean zChangedInstance3 = composer.changedInstance(contactBookViewModel3);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt$HomeScreen$4$2$1$1$1$1.invoke$lambda$17$lambda$15$lambda$14$lambda$11$lambda$10(contactBookViewModel3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue4, backdrop, null, null, false, ColorKt.getRose500(), 0L, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(7), Dp.m6302constructorimpl(f6)), Dp.m6302constructorimpl(f7), Dp.m6302constructorimpl(f7), null, ComposableSingletons$HomeScreenKt.INSTANCE.m6822getLambda3$app_release(), composer, 918552576, 48, 1116);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-644457097);
                ComposerKt.sourceInformation(composer, "454@21081L29,453@21017L712");
                composer.startReplaceGroup(1780328888);
                ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt$HomeScreen$4$2$1$1$1$1.invoke$lambda$17$lambda$15$lambda$14$lambda$13$lambda$12(mutableState6);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue5, backdrop, null, null, false, ColorKt.getAmber500(), 0L, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(7), Dp.m6302constructorimpl(f6)), Dp.m6302constructorimpl(f7), Dp.m6302constructorimpl(f7), null, ComposableSingletons$HomeScreenKt.INSTANCE.m6823getLambda4$app_release(), composer, 918552582, 48, 1116);
                composer.endReplaceGroup();
            }
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
            composer.startReplaceGroup(2013951747);
            ComposerKt.sourceInformation(composer, "469@21888L40,470@21957L988");
            if (z) {
                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer, 6);
                Modifier modifierM685paddingVpY3zN5 = PaddingKt.m685paddingVpY3zN4(BorderKt.m250borderxT4_qwU(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f))), Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), z2 ? 0.18f : 0.12f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6302constructorimpl(1), Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), z2 ? 0.45f : 0.35f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f))), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(f4));
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierM685paddingVpY3zN5);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor8);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl8 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM3336constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM3336constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m3343setimpl(composerM3336constructorimpl8, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1226815563, "C478@22545L370:HomeScreen.kt#yz3s17");
                TextKt.m2376Text4IGK_g(z3 ? "👑 登入成功，目前處於管理員模式" : "✏️ 登入成功，目前處於編輯者模式", (Modifier) null, androidx.compose.ui.graphics.ColorKt.Color(z2 ? 4294829706L : 4286067983L), TextUnitKt.getSp(10.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            }
            composer.endReplaceGroup();
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
    public static final Unit invoke$lambda$17$lambda$15$lambda$14$lambda$5$lambda$4(CoroutineScope coroutineScope, MutableState mutableState, SnackbarHostState snackbarHostState, MutableState mutableState2) {
        if (HomeScreenKt.HomeScreen$lambda$25(mutableState)) {
            return Unit.INSTANCE;
        }
        HomeScreenKt.HomeScreen$lambda$26(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1(snackbarHostState, mutableState, mutableState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$14$lambda$7$lambda$6(ContactBookViewModel contactBookViewModel, MutableState mutableState) {
        contactBookViewModel.fetchInstallStats();
        HomeScreenKt.HomeScreen$lambda$11(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$14$lambda$9$lambda$8(MutableState mutableState) {
        HomeScreenKt.HomeScreen$lambda$8(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$14$lambda$11$lambda$10(ContactBookViewModel contactBookViewModel) {
        contactBookViewModel.logout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$14$lambda$13$lambda$12(MutableState mutableState) {
        HomeScreenKt.HomeScreen$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }
}
