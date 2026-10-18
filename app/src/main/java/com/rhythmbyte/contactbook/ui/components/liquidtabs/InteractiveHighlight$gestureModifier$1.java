package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: InteractiveHighlight.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$gestureModifier$1", f = "InteractiveHighlight.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
final class InteractiveHighlight$gestureModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InteractiveHighlight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InteractiveHighlight$gestureModifier$1(InteractiveHighlight interactiveHighlight, Continuation<? super InteractiveHighlight$gestureModifier$1> continuation) {
        super(2, continuation);
        this.this$0 = interactiveHighlight;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InteractiveHighlight$gestureModifier$1 interactiveHighlight$gestureModifier$1 = new InteractiveHighlight$gestureModifier$1(this.this$0, continuation);
        interactiveHighlight$gestureModifier$1.L$0 = obj;
        return interactiveHighlight$gestureModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((InteractiveHighlight$gestureModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final InteractiveHighlight interactiveHighlight = this.this$0;
            Function1 function1 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$gestureModifier$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InteractiveHighlight$gestureModifier$1.invokeSuspend$lambda$0(interactiveHighlight, (PointerInputChange) obj2);
                }
            };
            final InteractiveHighlight interactiveHighlight2 = this.this$0;
            Function1 function2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$gestureModifier$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InteractiveHighlight$gestureModifier$1.invokeSuspend$lambda$1(interactiveHighlight2, (PointerInputChange) obj2);
                }
            };
            final InteractiveHighlight interactiveHighlight3 = this.this$0;
            Function0 function0 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$gestureModifier$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InteractiveHighlight$gestureModifier$1.invokeSuspend$lambda$2(interactiveHighlight3);
                }
            };
            final InteractiveHighlight interactiveHighlight4 = this.this$0;
            this.label = 1;
            if (DragGestureInspectorKt.inspectDragGestures(pointerInputScope, function1, function2, function0, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$gestureModifier$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return InteractiveHighlight$gestureModifier$1.invokeSuspend$lambda$3(interactiveHighlight4, (PointerInputChange) obj2, (Offset) obj3);
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
    public static final Unit invokeSuspend$lambda$0(InteractiveHighlight interactiveHighlight, PointerInputChange pointerInputChange) {
        interactiveHighlight.startPosition = pointerInputChange.getPosition();
        BuildersKt__Builders_commonKt.launch$default(interactiveHighlight.getAnimationScope(), null, null, new InteractiveHighlight$gestureModifier$1$1$1(interactiveHighlight, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(InteractiveHighlight interactiveHighlight, PointerInputChange pointerInputChange) {
        BuildersKt__Builders_commonKt.launch$default(interactiveHighlight.getAnimationScope(), null, null, new InteractiveHighlight$gestureModifier$1$2$1(interactiveHighlight, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(InteractiveHighlight interactiveHighlight) {
        BuildersKt__Builders_commonKt.launch$default(interactiveHighlight.getAnimationScope(), null, null, new InteractiveHighlight$gestureModifier$1$3$1(interactiveHighlight, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(InteractiveHighlight interactiveHighlight, PointerInputChange pointerInputChange, Offset offset) {
        BuildersKt__Builders_commonKt.launch$default(interactiveHighlight.getAnimationScope(), null, null, new InteractiveHighlight$gestureModifier$1$4$1(interactiveHighlight, pointerInputChange, null), 3, null);
        return Unit.INSTANCE;
    }
}
