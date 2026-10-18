package com.rhythmbyte.contactbook.ui.components.liquid;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.SnapshotStateKt;
import com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation;
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

/* JADX INFO: compiled from: LiquidToggle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$LiquidToggle$1$1", f = "LiquidToggle.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
final class LiquidToggleKt$LiquidToggle$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DampedDragAnimation $dampedDragAnimation;
    final /* synthetic */ MutableFloatState $fraction$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiquidToggleKt$LiquidToggle$1$1(MutableFloatState mutableFloatState, DampedDragAnimation dampedDragAnimation, Continuation<? super LiquidToggleKt$LiquidToggle$1$1> continuation) {
        super(2, continuation);
        this.$fraction$delegate = mutableFloatState;
        this.$dampedDragAnimation = dampedDragAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidToggleKt$LiquidToggle$1$1(this.$fraction$delegate, this.$dampedDragAnimation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidToggleKt$LiquidToggle$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final MutableFloatState mutableFloatState = this.$fraction$delegate;
            this.label = 1;
            if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$LiquidToggle$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(LiquidToggleKt.access$LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState));
                }
            }), new AnonymousClass2(this.$dampedDragAnimation, null), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$LiquidToggle$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: LiquidToggle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "f", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$LiquidToggle$1$1$2", f = "LiquidToggle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ DampedDragAnimation $dampedDragAnimation;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$dampedDragAnimation = dampedDragAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$dampedDragAnimation, continuation);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        public final Object invoke(float f, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$dampedDragAnimation.updateValue(this.F$0);
            return Unit.INSTANCE;
        }
    }
}
