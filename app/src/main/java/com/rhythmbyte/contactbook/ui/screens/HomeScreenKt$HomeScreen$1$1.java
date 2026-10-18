package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.State;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookUiState;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$1$1", f = "HomeScreen.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
final class HomeScreenKt$HomeScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ State<ContactBookUiState> $uiState$delegate;
    final /* synthetic */ ContactBookViewModel $viewModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$1$1(State<ContactBookUiState> state, SnackbarHostState snackbarHostState, ContactBookViewModel contactBookViewModel, Continuation<? super HomeScreenKt$HomeScreen$1$1> continuation) {
        super(2, continuation);
        this.$uiState$delegate = state;
        this.$snackbarHostState = snackbarHostState;
        this.$viewModel = contactBookViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$1$1(this.$uiState$delegate, this.$snackbarHostState, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContactBookViewModel contactBookViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String toastMessage = HomeScreenKt.HomeScreen$lambda$0(this.$uiState$delegate).getToastMessage();
            if (toastMessage != null) {
                SnackbarHostState snackbarHostState = this.$snackbarHostState;
                ContactBookViewModel contactBookViewModel2 = this.$viewModel;
                this.L$0 = contactBookViewModel2;
                this.label = 1;
                if (SnackbarHostState.showSnackbar$default(snackbarHostState, toastMessage, null, false, null, this, 14, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                contactBookViewModel = contactBookViewModel2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        contactBookViewModel = (ContactBookViewModel) this.L$0;
        ResultKt.throwOnFailure(obj);
        contactBookViewModel.clearToast();
        return Unit.INSTANCE;
    }
}
