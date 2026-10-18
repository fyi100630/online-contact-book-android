package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
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
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LiquidGliderDateTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1", f = "LiquidGliderDateTabs.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
final class LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animIndex;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<Boolean> $isDragging$delegate;
    final /* synthetic */ Function0<Unit> $onCustomDateClick;
    final /* synthetic */ Function1<String, Unit> $onDateSelected;
    final /* synthetic */ float $tabWidthPx;
    final /* synthetic */ int $targetIndex;
    final /* synthetic */ String $todayDate;
    final /* synthetic */ String $tomorrowDate;
    final /* synthetic */ String $yesterdayDate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1(MutableState<Boolean> mutableState, Animatable<Float, AnimationVector1D> animatable, CoroutineScope coroutineScope, Function1<? super String, Unit> function1, String str, String str2, String str3, Function0<Unit> function0, int i, float f, Continuation<? super LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1> continuation) {
        super(2, continuation);
        this.$isDragging$delegate = mutableState;
        this.$animIndex = animatable;
        this.$coroutineScope = coroutineScope;
        this.$onDateSelected = function1;
        this.$yesterdayDate = str;
        this.$todayDate = str2;
        this.$tomorrowDate = str3;
        this.$onCustomDateClick = function0;
        this.$targetIndex = i;
        this.$tabWidthPx = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1 liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1 = new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1(this.$isDragging$delegate, this.$animIndex, this.$coroutineScope, this.$onDateSelected, this.$yesterdayDate, this.$todayDate, this.$tomorrowDate, this.$onCustomDateClick, this.$targetIndex, this.$tabWidthPx, continuation);
        liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1.L$0 = obj;
        return liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final MutableState<Boolean> mutableState = this.$isDragging$delegate;
            Function1 function1 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1.invokeSuspend$lambda$0(mutableState, (Offset) obj2);
                }
            };
            final Animatable<Float, AnimationVector1D> animatable = this.$animIndex;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final MutableState<Boolean> mutableState2 = this.$isDragging$delegate;
            final Function1<String, Unit> function2 = this.$onDateSelected;
            final String str = this.$yesterdayDate;
            final String str2 = this.$todayDate;
            final String str3 = this.$tomorrowDate;
            final Function0<Unit> function0 = this.$onCustomDateClick;
            Function0 function3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1.invokeSuspend$lambda$1(animatable, coroutineScope, mutableState2, function2, str, str2, str3, function0);
                }
            };
            final CoroutineScope coroutineScope2 = this.$coroutineScope;
            final MutableState<Boolean> mutableState3 = this.$isDragging$delegate;
            final Animatable<Float, AnimationVector1D> animatable2 = this.$animIndex;
            final int i2 = this.$targetIndex;
            Function0 function4 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1.invokeSuspend$lambda$2(coroutineScope2, mutableState3, animatable2, i2);
                }
            };
            final float f = this.$tabWidthPx;
            final Animatable<Float, AnimationVector1D> animatable3 = this.$animIndex;
            final CoroutineScope coroutineScope3 = this.$coroutineScope;
            this.label = 1;
            if (DragGestureDetectorKt.detectHorizontalDragGestures(pointerInputScope, function1, function3, function4, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1.invokeSuspend$lambda$3(f, animatable3, coroutineScope3, (PointerInputChange) obj2, ((Float) obj3).floatValue());
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
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, Offset offset) {
        LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$3(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Animatable animatable, CoroutineScope coroutineScope, MutableState mutableState, Function1 function1, String str, String str2, String str3, Function0 function0) {
        LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$3(mutableState, false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$2$1(animatable, RangesKt.coerceIn(MathKt.roundToInt(((Number) animatable.getValue()).floatValue()), 0, 3), function1, str, str2, str3, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(CoroutineScope coroutineScope, MutableState mutableState, Animatable animatable, int i) {
        LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$3(mutableState, false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$3$1(animatable, i, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(float f, Animatable animatable, CoroutineScope coroutineScope, PointerInputChange pointerInputChange, float f2) {
        pointerInputChange.consume();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1$4$1(animatable, RangesKt.coerceIn(((Number) animatable.getValue()).floatValue() + (f > 0.0f ? f2 / f : 0.0f), 0.0f, 3.0f), null), 3, null);
        return Unit.INSTANCE;
    }
}
