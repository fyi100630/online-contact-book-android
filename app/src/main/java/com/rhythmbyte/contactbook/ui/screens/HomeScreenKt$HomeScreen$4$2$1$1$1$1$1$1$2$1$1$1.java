package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import com.rhythmbyte.contactbook.data.update.UpdateInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1", f = "HomeScreen.kt", i = {}, l = {380, 385}, m = "invokeSuspend", n = {}, s = {})
final class HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isCheckingUpdateManually$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ MutableState<UpdateInfo> $updateInfoToPrompt$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1(SnackbarHostState snackbarHostState, MutableState<Boolean> mutableState, MutableState<UpdateInfo> mutableState2, Continuation<? super HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$isCheckingUpdateManually$delegate = mutableState;
        this.$updateInfoToPrompt$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1(this.$snackbarHostState, this.$isCheckingUpdateManually$delegate, this.$updateInfoToPrompt$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r9.$snackbarHostState, "🎉 目前已是最新版本 (v2.0.0)", null, false, null, r9, 14, null) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r10)
            goto L59
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L31
        L1e:
            kotlin.ResultKt.throwOnFailure(r10)
            com.rhythmbyte.contactbook.data.update.UpdateManager r10 = com.rhythmbyte.contactbook.data.update.UpdateManager.INSTANCE
            r1 = r9
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r9.label = r3
            java.lang.String r3 = "2.0.0"
            java.lang.Object r10 = r10.checkForUpdates(r3, r1)
            if (r10 != r0) goto L31
            goto L58
        L31:
            com.rhythmbyte.contactbook.data.update.UpdateInfo r10 = (com.rhythmbyte.contactbook.data.update.UpdateInfo) r10
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r9.$isCheckingUpdateManually$delegate
            r3 = 0
            com.rhythmbyte.contactbook.ui.screens.HomeScreenKt.access$HomeScreen$lambda$26(r1, r3)
            if (r10 == 0) goto L43
            androidx.compose.runtime.MutableState<com.rhythmbyte.contactbook.data.update.UpdateInfo> r0 = r9.$updateInfoToPrompt$delegate
            com.rhythmbyte.contactbook.ui.screens.HomeScreenKt.access$HomeScreen$lambda$23(r0, r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            goto L59
        L43:
            androidx.compose.material3.SnackbarHostState r1 = r9.$snackbarHostState
            r6 = r9
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r9.label = r2
            java.lang.String r2 = "🎉 目前已是最新版本 (v2.0.0)"
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r8 = 0
            java.lang.Object r10 = androidx.compose.material3.SnackbarHostState.showSnackbar$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$2$1$1$1$1$1$1$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
