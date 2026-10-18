package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PasswordDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.screens.PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1", f = "PasswordDialog.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
final class PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isError$delegate;
    final /* synthetic */ MutableState<Boolean> $isVerifying$delegate;
    final /* synthetic */ Function2<String, Continuation<? super Boolean>, Object> $onConfirm;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ MutableState<String> $password$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1(Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function2, Function0<Unit> function0, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1> continuation) {
        super(2, continuation);
        this.$onConfirm = function2;
        this.$onDismiss = function0;
        this.$password$delegate = mutableState;
        this.$isVerifying$delegate = mutableState2;
        this.$isError$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1(this.$onConfirm, this.$onDismiss, this.$password$delegate, this.$isVerifying$delegate, this.$isError$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasswordDialogKt$PasswordDialog$2$1$1$4$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<String, Continuation<? super Boolean>, Object> function2 = this.$onConfirm;
            String strPasswordDialog$lambda$1 = PasswordDialogKt.PasswordDialog$lambda$1(this.$password$delegate);
            this.label = 1;
            obj = function2.invoke(strPasswordDialog$lambda$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PasswordDialogKt.PasswordDialog$lambda$8(this.$isVerifying$delegate, false);
        if (zBooleanValue) {
            this.$onDismiss.invoke();
        } else {
            PasswordDialogKt.PasswordDialog$lambda$5(this.$isError$delegate, true);
        }
        return Unit.INSTANCE;
    }
}
