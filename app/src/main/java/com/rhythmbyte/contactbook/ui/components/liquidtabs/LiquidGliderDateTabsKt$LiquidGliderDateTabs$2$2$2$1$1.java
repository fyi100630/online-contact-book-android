package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
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

/* JADX INFO: compiled from: LiquidGliderDateTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1", f = "LiquidGliderDateTabs.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
final class LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animIndex;
    final /* synthetic */ int $index;
    final /* synthetic */ Function0<Unit> $onCustomDateClick;
    final /* synthetic */ Function1<String, Unit> $onDateSelected;
    final /* synthetic */ String $todayDate;
    final /* synthetic */ String $tomorrowDate;
    final /* synthetic */ String $yesterdayDate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1(Animatable<Float, AnimationVector1D> animatable, int i, Function1<? super String, Unit> function1, String str, String str2, String str3, Function0<Unit> function0, Continuation<? super LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1> continuation) {
        super(2, continuation);
        this.$animIndex = animatable;
        this.$index = i;
        this.$onDateSelected = function1;
        this.$yesterdayDate = str;
        this.$todayDate = str2;
        this.$tomorrowDate = str3;
        this.$onCustomDateClick = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1(this.$animIndex, this.$index, this.$onDateSelected, this.$yesterdayDate, this.$todayDate, this.$tomorrowDate, this.$onCustomDateClick, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (Animatable.animateTo$default(this.$animIndex, Boxing.boxFloat(this.$index), AnimationSpecKt.spring$default(0.76f, 450.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        int i2 = this.$index;
        if (i2 == 0) {
            this.$onDateSelected.invoke(this.$yesterdayDate);
        } else if (i2 == 1) {
            this.$onDateSelected.invoke(this.$todayDate);
        } else if (i2 == 2) {
            this.$onDateSelected.invoke(this.$tomorrowDate);
        } else if (i2 == 3) {
            this.$onCustomDateClick.invoke();
        }
        return Unit.INSTANCE;
    }
}
