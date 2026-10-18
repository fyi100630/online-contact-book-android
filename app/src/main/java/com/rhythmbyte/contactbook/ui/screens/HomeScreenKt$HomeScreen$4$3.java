package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookUiState;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$4$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<ItemCategory> $categories;
    final /* synthetic */ Function0<Unit> $closeEditScreen;
    final /* synthetic */ MutableState<ItemRecord> $editingItem$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ State<ContactBookUiState> $uiState$delegate;
    final /* synthetic */ ContactBookViewModel $viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$4$3(List<? extends ItemCategory> list, PagerState pagerState, Function0<Unit> function0, ContactBookViewModel contactBookViewModel, MutableState<ItemRecord> mutableState, State<ContactBookUiState> state) {
        this.$categories = list;
        this.$pagerState = pagerState;
        this.$closeEditScreen = function0;
        this.$viewModel = contactBookViewModel;
        this.$editingItem$delegate = mutableState;
        this.$uiState$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C813@39559L21,814@39615L142,809@39314L465:HomeScreen.kt#yz3s17");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1344463151, i, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous> (HomeScreen.kt:809)");
            }
            ItemRecord itemRecordHomeScreen$lambda$34 = HomeScreenKt.HomeScreen$lambda$34(this.$editingItem$delegate);
            String selectedDate = HomeScreenKt.HomeScreen$lambda$0(this.$uiState$delegate).getSelectedDate();
            String key = this.$categories.get(this.$pagerState.getCurrentPage()).getKey();
            composer.startReplaceGroup(519917303);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChanged = composer.changed(this.$closeEditScreen);
            final Function0<Unit> function0 = this.$closeEditScreen;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt$HomeScreen$4$3.invoke$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function1 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(519919216);
            ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(this.$viewModel) | composer.changed(this.$closeEditScreen);
            final ContactBookViewModel contactBookViewModel = this.$viewModel;
            final Function0<Unit> function2 = this.$closeEditScreen;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt$HomeScreen$4$3.invoke$lambda$3$lambda$2(contactBookViewModel, function2, (ItemRecord) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EditItemScreenKt.EditItemScreen(itemRecordHomeScreen$lambda$34, selectedDate, key, function1, (Function1) objRememberedValue2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ContactBookViewModel contactBookViewModel, Function0 function0, ItemRecord item) {
        Intrinsics.checkNotNullParameter(item, "item");
        contactBookViewModel.saveOrUpdateItem(item);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
