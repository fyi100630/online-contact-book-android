package com.rhythmbyte.contactbook.ui.screens;

import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "pwd", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$6$1", f = "HomeScreen.kt", i = {}, l = {842}, m = "invokeSuspend", n = {}, s = {})
final class HomeScreenKt$HomeScreen$4$6$1 extends SuspendLambda implements Function2<String, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ContactBookViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$4$6$1(ContactBookViewModel contactBookViewModel, Continuation<? super HomeScreenKt$HomeScreen$4$6$1> continuation) {
        super(2, continuation);
        this.$viewModel = contactBookViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeScreenKt$HomeScreen$4$6$1 homeScreenKt$HomeScreen$4$6$1 = new HomeScreenKt$HomeScreen$4$6$1(this.$viewModel, continuation);
        homeScreenKt$HomeScreen$4$6$1.L$0 = obj;
        return homeScreenKt$HomeScreen$4$6$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return ((HomeScreenKt$HomeScreen$4$6$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) this.L$0;
        this.label = 1;
        Object objUnlockWithPassword = this.$viewModel.unlockWithPassword(str, this);
        return objUnlockWithPassword == coroutine_suspended ? coroutine_suspended : objUnlockWithPassword;
    }
}
