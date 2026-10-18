package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotStateKt;
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
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: LiquidBottomTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$1$1", f = "LiquidBottomTabs.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
final class LiquidBottomTabsKt$LiquidBottomTabs$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $currentIndex$delegate;
    final /* synthetic */ Function0<Integer> $selectedTabIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiquidBottomTabsKt$LiquidBottomTabs$1$1$1(Function0<Integer> function0, MutableIntState mutableIntState, Continuation<? super LiquidBottomTabsKt$LiquidBottomTabs$1$1$1> continuation) {
        super(2, continuation);
        this.$selectedTabIndex = function0;
        this.$currentIndex$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidBottomTabsKt$LiquidBottomTabs$1$1$1(this.$selectedTabIndex, this.$currentIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidBottomTabsKt$LiquidBottomTabs$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Function0<Integer> function0 = this.$selectedTabIndex;
            this.label = 1;
            if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(LiquidBottomTabsKt$LiquidBottomTabs$1$1$1.invokeSuspend$lambda$0(function0));
                }
            }), new AnonymousClass2(this.$currentIndex$delegate, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: LiquidBottomTabs.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "index", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$1$1$2", f = "LiquidBottomTabs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableIntState $currentIndex$delegate;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MutableIntState mutableIntState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentIndex$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentIndex$delegate, continuation);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                int i = this.I$0;
                if (LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$7(this.$currentIndex$delegate) != i) {
                    this.$currentIndex$delegate.setIntValue(i);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(Function0 function0) {
        return ((Number) function0.invoke()).intValue();
    }
}
