package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookUiState;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$4$2$1$1$4 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ List<ItemCategory> $categories;
    final /* synthetic */ boolean $isAdmin;
    final /* synthetic */ Function1<ItemRecord, Unit> $openEditForExistingItem;
    final /* synthetic */ State<ContactBookUiState> $uiState$delegate;
    final /* synthetic */ ContactBookViewModel $viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$4$2$1$1$4(List<? extends ItemCategory> list, State<ContactBookUiState> state, ContactBookViewModel contactBookViewModel, boolean z, Function1<? super ItemRecord, Unit> function1) {
        this.$categories = list;
        this.$uiState$delegate = state;
        this.$viewModel = contactBookViewModel;
        this.$isAdmin = z;
        this.$openEditForExistingItem = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation(composer, "C731@36029L306,740@36512L21,737@36361L870:HomeScreen.kt#yz3s17");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-939265931, i2, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:730)");
        }
        ItemCategory itemCategory = this.$categories.get(i);
        Object allRecords = HomeScreenKt.HomeScreen$lambda$0(this.$uiState$delegate).getAllRecords();
        Object selectedDate = HomeScreenKt.HomeScreen$lambda$0(this.$uiState$delegate).getSelectedDate();
        composer.startReplaceGroup(-1011634095);
        ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
        boolean zChanged = composer.changed(allRecords) | composer.changed(selectedDate) | composer.changed(itemCategory);
        State<ContactBookUiState> state = this.$uiState$delegate;
        ContactBookViewModel contactBookViewModel = this.$viewModel;
        ArrayList arrayListRememberedValue = composer.rememberedValue();
        if (zChanged || arrayListRememberedValue == Composer.INSTANCE.getEmpty()) {
            List<ItemRecord> allRecords2 = HomeScreenKt.HomeScreen$lambda$0(state).getAllRecords();
            ArrayList arrayList = new ArrayList();
            for (Object obj : allRecords2) {
                ItemRecord itemRecord = (ItemRecord) obj;
                if (Intrinsics.areEqual(itemRecord.getCategory(), itemCategory.getKey()) && contactBookViewModel.isItemActiveOnDate(itemRecord, HomeScreenKt.HomeScreen$lambda$0(state).getSelectedDate())) {
                    arrayList.add(obj);
                }
            }
            arrayListRememberedValue = arrayList;
            composer.updateRememberedValue(arrayListRememberedValue);
        }
        List list = (List) arrayListRememberedValue;
        composer.endReplaceGroup();
        Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), Dp.m6302constructorimpl(16), 0.0f, 2, null);
        boolean z = this.$isAdmin;
        ContactBookViewModel contactBookViewModel2 = this.$viewModel;
        State<ContactBookUiState> state2 = this.$uiState$delegate;
        final Function1<ItemRecord, Unit> function1 = this.$openEditForExistingItem;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM686paddingVpY3zN4$default);
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
        ComposerKt.sourceInformationMarkerStart(composer, 120347196, "C749@37005L99,743@36652L482,754@37164L41:HomeScreen.kt#yz3s17");
        String selectedDate2 = HomeScreenKt.HomeScreen$lambda$0(state2).getSelectedDate();
        composer.startReplaceGroup(-550296319);
        ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HomeScreenKt$HomeScreen$4$2$1$1$4.invoke$lambda$4$lambda$3$lambda$2(function1, (ItemRecord) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HomeScreenKt.CategorySection(itemCategory, list, selectedDate2, z, contactBookViewModel2, (Function1) objRememberedValue, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(96)), composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, ItemRecord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
