package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InteractiveHighlight.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$gestureModifier$1$4$1", f = "InteractiveHighlight.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
final class InteractiveHighlight$gestureModifier$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PointerInputChange $change;
    int label;
    final /* synthetic */ InteractiveHighlight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InteractiveHighlight$gestureModifier$1$4$1(InteractiveHighlight interactiveHighlight, PointerInputChange pointerInputChange, Continuation<? super InteractiveHighlight$gestureModifier$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = interactiveHighlight;
        this.$change = pointerInputChange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InteractiveHighlight$gestureModifier$1$4$1(this.this$0, this.$change, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InteractiveHighlight$gestureModifier$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.positionAnimation.snapTo(Offset.m3591boximpl(this.$change.getPosition()), this) == coroutine_suspended) {
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
}
