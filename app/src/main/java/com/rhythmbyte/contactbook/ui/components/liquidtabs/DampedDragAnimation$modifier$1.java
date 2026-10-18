package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DampedDragAnimation.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$modifier$1", f = "DampedDragAnimation.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
final class DampedDragAnimation$modifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DampedDragAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DampedDragAnimation$modifier$1(DampedDragAnimation dampedDragAnimation, Continuation<? super DampedDragAnimation$modifier$1> continuation) {
        super(2, continuation);
        this.this$0 = dampedDragAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DampedDragAnimation$modifier$1 dampedDragAnimation$modifier$1 = new DampedDragAnimation$modifier$1(this.this$0, continuation);
        dampedDragAnimation$modifier$1.L$0 = obj;
        return dampedDragAnimation$modifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((DampedDragAnimation$modifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final DampedDragAnimation dampedDragAnimation = this.this$0;
            Function1 function1 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$modifier$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DampedDragAnimation$modifier$1.invokeSuspend$lambda$0(dampedDragAnimation, (PointerInputChange) obj2);
                }
            };
            final DampedDragAnimation dampedDragAnimation2 = this.this$0;
            Function1 function2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$modifier$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DampedDragAnimation$modifier$1.invokeSuspend$lambda$1(dampedDragAnimation2, (PointerInputChange) obj2);
                }
            };
            final DampedDragAnimation dampedDragAnimation3 = this.this$0;
            Function0 function0 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$modifier$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DampedDragAnimation$modifier$1.invokeSuspend$lambda$2(dampedDragAnimation3);
                }
            };
            final DampedDragAnimation dampedDragAnimation4 = this.this$0;
            this.label = 1;
            if (DragGestureInspectorKt.inspectDragGestures(pointerInputScope, function1, function2, function0, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$modifier$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DampedDragAnimation$modifier$1.invokeSuspend$lambda$3(dampedDragAnimation4, pointerInputScope, (PointerInputChange) obj2, (Offset) obj3);
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(DampedDragAnimation dampedDragAnimation, PointerInputChange pointerInputChange) {
        dampedDragAnimation.getOnDragStarted().invoke(dampedDragAnimation, Offset.m3591boximpl(pointerInputChange.getPosition()));
        dampedDragAnimation.press();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(DampedDragAnimation dampedDragAnimation, PointerInputChange pointerInputChange) {
        dampedDragAnimation.getOnDragStopped().invoke(dampedDragAnimation);
        dampedDragAnimation.release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(DampedDragAnimation dampedDragAnimation) {
        dampedDragAnimation.getOnDragStopped().invoke(dampedDragAnimation);
        dampedDragAnimation.release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(DampedDragAnimation dampedDragAnimation, PointerInputScope pointerInputScope, PointerInputChange pointerInputChange, Offset offset) {
        dampedDragAnimation.getOnDrag().invoke(dampedDragAnimation, IntSize.m6464boximpl(pointerInputScope.getBoundsSize()), offset);
        return Unit.INSTANCE;
    }
}
