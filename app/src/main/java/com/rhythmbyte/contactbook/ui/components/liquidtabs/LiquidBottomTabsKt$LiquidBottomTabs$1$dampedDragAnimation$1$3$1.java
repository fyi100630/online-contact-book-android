package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LiquidBottomTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1", f = "LiquidBottomTabs.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
final class LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Offset $dragAmount;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $offsetAnimation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1(Animatable<Float, AnimationVector1D> animatable, Offset offset, Continuation<? super LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1> continuation) {
        super(2, continuation);
        this.$offsetAnimation = animatable;
        this.$dragAmount = offset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1(this.$offsetAnimation, this.$dragAmount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$offsetAnimation;
            this.label = 1;
            if (animatable.snapTo(Boxing.boxFloat(animatable.getValue().floatValue() + Offset.m3602getXimpl(this.$dragAmount.getPackedValue())), this) == coroutine_suspended) {
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
