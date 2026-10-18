package com.rhythmbyte.contactbook.ui.screens;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.kyant.backdrop.Backdrop;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.data.update.UpdateInfo;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt;
import com.rhythmbyte.contactbook.ui.components.TimetableBarKt;
import com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookUiState;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$4$2 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ Backdrop $ambientBackdrop;
    final /* synthetic */ List<ItemCategory> $categories;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<String> $editingAnnouncementText$delegate;
    final /* synthetic */ boolean $isAdmin;
    final /* synthetic */ MutableState<Boolean> $isCheckingUpdateManually$delegate;
    final /* synthetic */ boolean $isDarkTheme;
    final /* synthetic */ MutableState<Boolean> $isEditScreenVisible$delegate;
    final /* synthetic */ MutableState<Boolean> $isMorphingFromBottom$delegate;
    final /* synthetic */ boolean $isSuperAdmin;
    final /* synthetic */ Function0<Unit> $openCreateFromBottom;
    final /* synthetic */ Function1<ItemRecord, Unit> $openEditForExistingItem;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Rect> $plusButtonBounds$delegate;
    final /* synthetic */ MutableState<Boolean> $showEditAnnouncementDialog$delegate;
    final /* synthetic */ MutableState<Boolean> $showLogsDialog$delegate;
    final /* synthetic */ MutableState<Boolean> $showPasswordDialog$delegate;
    final /* synthetic */ MutableState<Boolean> $showStatsDialog$delegate;
    final /* synthetic */ MutableState<Boolean> $showTimetableDialog$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ State<ContactBookUiState> $uiState$delegate;
    final /* synthetic */ MutableState<UpdateInfo> $updateInfoToPrompt$delegate;
    final /* synthetic */ ContactBookViewModel $viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$4$2(PagerState pagerState, List<? extends ItemCategory> list, Backdrop backdrop, boolean z, Function0<Unit> function0, boolean z2, boolean z3, ContactBookViewModel contactBookViewModel, State<ContactBookUiState> state, Context context, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, SnackbarHostState snackbarHostState, MutableState<UpdateInfo> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, MutableState<Boolean> mutableState7, MutableState<Boolean> mutableState8, Function1<? super ItemRecord, Unit> function1, MutableState<Rect> mutableState9, MutableState<Boolean> mutableState10, MutableState<Boolean> mutableState11) {
        this.$pagerState = pagerState;
        this.$categories = list;
        this.$ambientBackdrop = backdrop;
        this.$isAdmin = z;
        this.$openCreateFromBottom = function0;
        this.$isDarkTheme = z2;
        this.$isSuperAdmin = z3;
        this.$viewModel = contactBookViewModel;
        this.$uiState$delegate = state;
        this.$context = context;
        this.$coroutineScope = coroutineScope;
        this.$isCheckingUpdateManually$delegate = mutableState;
        this.$snackbarHostState = snackbarHostState;
        this.$updateInfoToPrompt$delegate = mutableState2;
        this.$showStatsDialog$delegate = mutableState3;
        this.$showLogsDialog$delegate = mutableState4;
        this.$showPasswordDialog$delegate = mutableState5;
        this.$editingAnnouncementText$delegate = mutableState6;
        this.$showEditAnnouncementDialog$delegate = mutableState7;
        this.$showTimetableDialog$delegate = mutableState8;
        this.$openEditForExistingItem = function1;
        this.$plusButtonBounds$delegate = mutableState9;
        this.$isMorphingFromBottom$delegate = mutableState10;
        this.$isEditScreenVisible$delegate = mutableState11;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues innerPadding, Composer composer, int i) {
        int i2;
        final State<ContactBookUiState> state;
        float f;
        List<ItemCategory> list;
        boolean z;
        boolean z2;
        String str;
        PagerState pagerState;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation(composer, "C272@11169L26933:HomeScreen.kt#yz3s17");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(innerPadding) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1172175881, i2, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous> (HomeScreen.kt:272)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
            PagerState pagerState2 = this.$pagerState;
            List<ItemCategory> list2 = this.$categories;
            Backdrop backdrop = this.$ambientBackdrop;
            boolean z3 = this.$isAdmin;
            final Function0<Unit> function0 = this.$openCreateFromBottom;
            boolean z4 = this.$isDarkTheme;
            boolean z5 = this.$isSuperAdmin;
            final ContactBookViewModel contactBookViewModel = this.$viewModel;
            State<ContactBookUiState> state2 = this.$uiState$delegate;
            final Context context = this.$context;
            CoroutineScope coroutineScope = this.$coroutineScope;
            MutableState<Boolean> mutableState = this.$isCheckingUpdateManually$delegate;
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            MutableState<UpdateInfo> mutableState2 = this.$updateInfoToPrompt$delegate;
            MutableState<Boolean> mutableState3 = this.$showStatsDialog$delegate;
            MutableState<Boolean> mutableState4 = this.$showLogsDialog$delegate;
            final MutableState<Boolean> mutableState5 = this.$showPasswordDialog$delegate;
            MutableState<String> mutableState6 = this.$editingAnnouncementText$delegate;
            MutableState<Boolean> mutableState7 = this.$showEditAnnouncementDialog$delegate;
            final MutableState<Boolean> mutableState8 = this.$showTimetableDialog$delegate;
            Function1<ItemRecord, Unit> function1 = this.$openEditForExistingItem;
            final MutableState<Rect> mutableState9 = this.$plusButtonBounds$delegate;
            MutableState<Boolean> mutableState10 = this.$isMorphingFromBottom$delegate;
            MutableState<Boolean> mutableState11 = this.$isEditScreenVisible$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1299517115, "C278@11301L571,294@11886L25399,764@37476L202,771@37721L75,760@37299L793:HomeScreen.kt#yz3s17");
            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getSky500(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1200.0f, 0, 10, (Object) null), null, 0.0f, 6, null), composer, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -835245270, "C299@11998L21376:HomeScreen.kt#yz3s17");
            float f2 = 8;
            Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6302constructorimpl(12), Dp.m6302constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM685paddingVpY3zN4);
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
            Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1318884491, "C308@12353L11,311@12505L10506,305@12193L10818,489@23029L41,638@31637L93,641@31772L1262,633@31354L1746,668@33118L40,672@33312L30,670@33176L184:HomeScreen.kt#yz3s17");
            float f3 = 22;
            boolean z6 = z3;
            LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f3)), Dp.m6302constructorimpl(f3), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(6), ComposableLambdaKt.rememberComposableLambda(-562131258, true, new HomeScreenKt$HomeScreen$4$2$1$1$1$1(z3, z4, state2, coroutineScope, backdrop, z5, contactBookViewModel, mutableState, snackbarHostState, mutableState2, mutableState3, mutableState4, mutableState5), composer, 54), composer, 1769862, 16);
            float f4 = 10;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f4)), composer, 6);
            if (HomeScreenKt.HomeScreen$lambda$0(state2).getAnnouncement().length() > 0) {
                composer.startReplaceGroup(-1308506095);
                ComposerKt.sourceInformation(composer, "502@23976L11,506@24208L4905,499@23804L5309,590@29134L41");
                float f5 = 18;
                state = state2;
                f = f4;
                LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f5)), Dp.m6302constructorimpl(f5), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6302constructorimpl(4), ComposableLambdaKt.rememberComposableLambda(357203531, true, new HomeScreenKt$HomeScreen$4$2$1$1$1$2(z4 ? androidx.compose.ui.graphics.ColorKt.Color(4294898631L) : Color.m3842copywmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4286067983L), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.ColorKt.Color(z4 ? 4294759245L : 4287774734L), z5, state2, androidx.compose.ui.graphics.ColorKt.Color(z4 ? 4294829706L : 4282718723L), Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), z4 ? 0.25f : 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), z4 ? 0.4f : 0.3f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.ColorKt.Color(z4 ? 4294829706L : 4286067983L), mutableState6, mutableState7), composer, 54), composer, 1769862, 0);
                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                composer.endReplaceGroup();
            } else {
                state = state2;
                f = f4;
                if (z5) {
                    composer.startReplaceGroup(-1302587172);
                    ComposerKt.sourceInformation(composer, "595@29411L11,599@29643L1613,592@29239L2017,630@31277L41");
                    float f6 = 16;
                    LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f6)), Dp.m6302constructorimpl(f6), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorKt.getAmber500(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6302constructorimpl(3), ComposableLambdaKt.rememberComposableLambda(-419040958, true, new HomeScreenKt$HomeScreen$4$2$1$1$1$3(z4, mutableState6, mutableState7), composer, 54), composer, 1769862, 0);
                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1300550813);
                    composer.endReplaceGroup();
                }
            }
            String selectedDate = HomeScreenKt.HomeScreen$lambda$0(state).getSelectedDate();
            String yesterdayDate = HomeScreenKt.HomeScreen$lambda$0(state).getYesterdayDate();
            String todayDate = HomeScreenKt.HomeScreen$lambda$0(state).getTodayDate();
            String tomorrowDate = HomeScreenKt.HomeScreen$lambda$0(state).getTomorrowDate();
            composer.startReplaceGroup(-1011774852);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(contactBookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt$HomeScreen$4$2.invoke$lambda$15$lambda$10$lambda$7$lambda$1$lambda$0(contactBookViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function2 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1011769363);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChanged = composer.changed(state) | composer.changedInstance(context) | composer.changedInstance(contactBookViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt$HomeScreen$4$2.invoke$lambda$15$lambda$10$lambda$7$lambda$4$lambda$3(context, state, contactBookViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            LiquidGliderDateTabsKt.LiquidGliderDateTabs(selectedDate, yesterdayDate, todayDate, tomorrowDate, function2, (Function0) objRememberedValue2, backdrop, null, composer, 0, 128);
            Composer composer2 = composer;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2)), composer2, 6);
            String shortTimetablePreview = contactBookViewModel.getShortTimetablePreview(HomeScreenKt.HomeScreen$lambda$0(state).getSelectedDate());
            composer2.startReplaceGroup(-1011721315);
            ComposerKt.sourceInformation(composer2, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt$HomeScreen$4$2.invoke$lambda$15$lambda$10$lambda$7$lambda$6$lambda$5(mutableState8);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            TimetableBarKt.TimetableBar(shortTimetablePreview, (Function0) objRememberedValue3, null, composer2, 48, 4);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (!HomeScreenKt.HomeScreen$lambda$0(state).isLoading()) {
                if (HomeScreenKt.HomeScreen$lambda$0(state).getErrorMessage() != null) {
                    composer2.startReplaceGroup(-814339367);
                    ComposerKt.sourceInformation(composer2, "686@33826L1825");
                    float f7 = 16;
                    Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), Dp.m6302constructorimpl(f7));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM684padding3ABfNKs);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1297749993, "C698@34420L1209,693@34112L1517:HomeScreen.kt#yz3s17");
                    LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f7)), 0.0f, Color.m3842copywmQWz5c$default(ColorKt.getRose500(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorKt.getRose500(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, ComposableLambdaKt.rememberComposableLambda(932611954, true, new HomeScreenKt$HomeScreen$4$2$1$1$3$1(contactBookViewModel), composer2, 54), composer2, 1572870, 36);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                    str = "CC(remember):HomeScreen.kt#9igjgp";
                    z2 = false;
                    pagerState = pagerState2;
                    list = list2;
                    z = true;
                } else {
                    composer2.startReplaceGroup(-812491674);
                    ComposerKt.sourceInformation(composer2, "729@35909L1344,724@35698L1555");
                    Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    list = list2;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-939265931, true, new HomeScreenKt$HomeScreen$4$2$1$1$4(list2, state, contactBookViewModel, z6, function1), composer2, 54);
                    z6 = z6;
                    z = true;
                    z2 = false;
                    str = "CC(remember):HomeScreen.kt#9igjgp";
                    pagerState = pagerState2;
                    PagerKt.m921HorizontalPageroI3XNZo(pagerState, modifierWeight$default, null, null, 0, 0.0f, null, null, false, false, null, null, null, composableLambdaRememberComposableLambda, composer, 0, 3072, 8188);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                }
            } else {
                composer2.startReplaceGroup(-814772251);
                ComposerKt.sourceInformation(composer2, "677@33437L309");
                Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1298225161, "C683@33679L45:HomeScreen.kt#yz3s17");
                ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(null, ColorKt.getEmerald500(), 0.0f, 0L, 0, composer, 0, 29);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
                str = "CC(remember):HomeScreen.kt#9igjgp";
                pagerState = pagerState2;
                list = list2;
                z = true;
                z2 = false;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.startReplaceGroup(1289656907);
            ComposerKt.sourceInformation(composer2, str);
            final boolean z7 = z6;
            boolean zChanged2 = composer2.changed(z7) | composer2.changed(function0);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt$HomeScreen$4$2.invoke$lambda$15$lambda$12$lambda$11(z7, function0, mutableState5);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            Function0 function3 = (Function0) objRememberedValue4;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1289664620);
            ComposerKt.sourceInformation(composer2, str);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt$HomeScreen$4$2.invoke$lambda$15$lambda$14$lambda$13(mutableState9, (Rect) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue5);
            }
            Function1 function4 = (Function1) objRememberedValue5;
            composer2.endReplaceGroup();
            LiquidGlassBottomBarKt.LiquidGlassBottomBar(pagerState, list, backdrop, function3, function4, (HomeScreenKt.HomeScreen$lambda$31(mutableState10) && HomeScreenKt.HomeScreen$lambda$28(mutableState11)) ? z : z2, PaddingKt.m685paddingVpY3zN4(WindowInsetsPadding_androidKt.navigationBarsPadding(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter())), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(f)), composer, 24576, 0);
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
    public static final Unit invoke$lambda$15$lambda$10$lambda$7$lambda$1$lambda$0(ContactBookViewModel contactBookViewModel, String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        contactBookViewModel.setSelectedDate(newDate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$10$lambda$7$lambda$4$lambda$3(Context context, State state, final ContactBookViewModel contactBookViewModel) {
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        List listSplit$default = StringsKt.split$default((CharSequence) HomeScreenKt.HomeScreen$lambda$0(state).getSelectedDate(), new String[]{"-"}, false, 0, 6, (Object) null);
        Calendar calendar = Calendar.getInstance();
        String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
        int iIntValue = (str == null || (intOrNull3 = StringsKt.toIntOrNull(str)) == null) ? calendar.get(1) : intOrNull3.intValue();
        String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
        int iIntValue2 = ((str2 == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) ? calendar.get(2) + 1 : intOrNull2.intValue()) - 1;
        String str3 = (String) CollectionsKt.getOrNull(listSplit$default, 2);
        new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$$ExternalSyntheticLambda5
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HomeScreenKt$HomeScreen$4$2.invoke$lambda$15$lambda$10$lambda$7$lambda$4$lambda$3$lambda$2(contactBookViewModel, datePicker, i, i2, i3);
            }
        }, iIntValue, iIntValue2, (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? calendar.get(5) : intOrNull.intValue()).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$15$lambda$10$lambda$7$lambda$4$lambda$3$lambda$2(ContactBookViewModel contactBookViewModel, DatePicker datePicker, int i, int i2, int i3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2 + 1), Integer.valueOf(i3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        contactBookViewModel.setSelectedDate(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$10$lambda$7$lambda$6$lambda$5(MutableState mutableState) {
        HomeScreenKt.HomeScreen$lambda$14(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$12$lambda$11(boolean z, Function0 function0, MutableState mutableState) {
        if (!z) {
            HomeScreenKt.HomeScreen$lambda$5(mutableState, true);
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14$lambda$13(MutableState mutableState, Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        mutableState.setValue(bounds);
        return Unit.INSTANCE;
    }
}
