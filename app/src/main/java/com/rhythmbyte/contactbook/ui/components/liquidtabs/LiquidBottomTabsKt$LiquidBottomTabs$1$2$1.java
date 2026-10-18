package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: LiquidBottomTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$2$1", f = "LiquidBottomTabs.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
final class LiquidBottomTabsKt$LiquidBottomTabs$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $currentIndex$delegate;
    final /* synthetic */ DampedDragAnimation $dampedDragAnimation;
    final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LiquidBottomTabsKt$LiquidBottomTabs$1$2$1(MutableIntState mutableIntState, DampedDragAnimation dampedDragAnimation, Function1<? super Integer, Unit> function1, Continuation<? super LiquidBottomTabsKt$LiquidBottomTabs$1$2$1> continuation) {
        super(2, continuation);
        this.$currentIndex$delegate = mutableIntState;
        this.$dampedDragAnimation = dampedDragAnimation;
        this.$onTabSelected = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidBottomTabsKt$LiquidBottomTabs$1$2$1(this.$currentIndex$delegate, this.$dampedDragAnimation, this.$onTabSelected, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidBottomTabsKt$LiquidBottomTabs$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final MutableIntState mutableIntState = this.$currentIndex$delegate;
            this.label = 1;
            if (FlowKt.collectLatest(FlowKt.drop(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(LiquidBottomTabsKt$LiquidBottomTabs$1.access$invoke$lambda$7(mutableIntState));
                }
            }), 1), new AnonymousClass2(this.$dampedDragAnimation, this.$onTabSelected, null), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$2$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: LiquidBottomTabs.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "index", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$2$1$2", f = "LiquidBottomTabs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ DampedDragAnimation $dampedDragAnimation;
        final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(DampedDragAnimation dampedDragAnimation, Function1<? super Integer, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$dampedDragAnimation = dampedDragAnimation;
            this.$onTabSelected = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$dampedDragAnimation, this.$onTabSelected, continuation);
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
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.I$0;
            this.$dampedDragAnimation.animateToValue(i);
            this.$onTabSelected.invoke(Boxing.boxInt(i));
            return Unit.INSTANCE;
        }
    }
}
