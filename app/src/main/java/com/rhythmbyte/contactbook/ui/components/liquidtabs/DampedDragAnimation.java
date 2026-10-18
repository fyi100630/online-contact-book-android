package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: DampedDragAnimation.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012,\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0002\b\u0012\u0012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0012\u0012A\u0010\u0015\u001a=\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010L\u001a\u00020\u0011J\u0006\u0010M\u001a\u00020\u0011J\u000e\u0010N\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010O\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0005J\b\u0010P\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR7\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0002\b\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&RL\u0010\u0015\u001a=\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0002\b\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b;\u0010\u001dR\u0011\u0010<\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b=\u0010\u001dR\u0011\u0010>\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b?\u0010\u001dR\u0011\u0010@\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bA\u0010\u001dR\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010\u001dR\u0011\u0010D\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bE\u0010\u001dR\u0011\u0010F\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bG\u0010\u001dR\u0011\u0010H\u001a\u00020I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006Q"}, d2 = {"Lcom/rhythmbyte/contactbook/ui/components/liquidtabs/DampedDragAnimation;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "initialValue", "", "valueRange", "Lkotlin/ranges/ClosedRange;", "visibilityThreshold", "initialScale", "pressedScale", "onDragStarted", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "position", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Lkotlin/Function1;", "onDrag", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/IntSize;", ContentDisposition.Parameters.Size, "dragAmount", "<init>", "(Lkotlinx/coroutines/CoroutineScope;FLkotlin/ranges/ClosedRange;FFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getInitialValue", "()F", "getValueRange", "()Lkotlin/ranges/ClosedRange;", "getVisibilityThreshold", "getInitialScale", "getPressedScale", "getOnDragStarted", "()Lkotlin/jvm/functions/Function2;", "getOnDragStopped", "()Lkotlin/jvm/functions/Function1;", "getOnDrag", "()Lkotlin/jvm/functions/Function3;", "valueAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "velocityAnimationSpec", "pressProgressAnimationSpec", "scaleXAnimationSpec", "scaleYAnimationSpec", "valueAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "velocityAnimation", "pressProgressAnimation", "scaleXAnimation", "scaleYAnimation", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "value", "getValue", NotificationCompat.CATEGORY_PROGRESS, "getProgress", "targetValue", "getTargetValue", "pressProgress", "getPressProgress", "scaleX", "getScaleX", "scaleY", "getScaleY", "velocity", "getVelocity", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "press", "release", "updateValue", "animateToValue", "updateVelocity", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DampedDragAnimation {
    public static final int $stable = 8;
    private final CoroutineScope animationScope;
    private final float initialScale;
    private final float initialValue;
    private final Modifier modifier;
    private final MutatorMutex mutatorMutex;
    private final Function3<DampedDragAnimation, IntSize, Offset, Unit> onDrag;
    private final Function2<DampedDragAnimation, Offset, Unit> onDragStarted;
    private final Function1<DampedDragAnimation, Unit> onDragStopped;
    private final Animatable<Float, AnimationVector1D> pressProgressAnimation;
    private final SpringSpec<Float> pressProgressAnimationSpec;
    private final float pressedScale;
    private final Animatable<Float, AnimationVector1D> scaleXAnimation;
    private final SpringSpec<Float> scaleXAnimationSpec;
    private final Animatable<Float, AnimationVector1D> scaleYAnimation;
    private final SpringSpec<Float> scaleYAnimationSpec;
    private final Animatable<Float, AnimationVector1D> valueAnimation;
    private final SpringSpec<Float> valueAnimationSpec;
    private final ClosedRange<Float> valueRange;
    private final Animatable<Float, AnimationVector1D> velocityAnimation;
    private final SpringSpec<Float> velocityAnimationSpec;
    private final VelocityTracker velocityTracker;
    private final float visibilityThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public DampedDragAnimation(CoroutineScope animationScope, float f, ClosedRange<Float> valueRange, float f2, float f3, float f4, Function2<? super DampedDragAnimation, ? super Offset, Unit> onDragStarted, Function1<? super DampedDragAnimation, Unit> onDragStopped, Function3<? super DampedDragAnimation, ? super IntSize, ? super Offset, Unit> onDrag) {
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.animationScope = animationScope;
        this.initialValue = f;
        this.valueRange = valueRange;
        this.visibilityThreshold = f2;
        this.initialScale = f3;
        this.pressedScale = f4;
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.onDrag = onDrag;
        this.valueAnimationSpec = AnimationSpecKt.spring(1.0f, 1000.0f, Float.valueOf(f2));
        this.velocityAnimationSpec = AnimationSpecKt.spring(0.5f, 300.0f, Float.valueOf(10.0f * f2));
        Float fValueOf = Float.valueOf(0.001f);
        this.pressProgressAnimationSpec = AnimationSpecKt.spring(1.0f, 1000.0f, fValueOf);
        this.scaleXAnimationSpec = AnimationSpecKt.spring(0.6f, 250.0f, fValueOf);
        this.scaleYAnimationSpec = AnimationSpecKt.spring(0.7f, 250.0f, fValueOf);
        this.valueAnimation = AnimatableKt.Animatable(f, f2);
        this.velocityAnimation = AnimatableKt.Animatable(0.0f, 5.0f);
        this.pressProgressAnimation = AnimatableKt.Animatable(0.0f, 0.001f);
        this.scaleXAnimation = AnimatableKt.Animatable(f3, 0.001f);
        this.scaleYAnimation = AnimatableKt.Animatable(f3, 0.001f);
        this.mutatorMutex = new MutatorMutex();
        this.velocityTracker = new VelocityTracker();
        this.modifier = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, Unit.INSTANCE, new DampedDragAnimation$modifier$1(this, null));
    }

    public final float getInitialValue() {
        return this.initialValue;
    }

    public final ClosedRange<Float> getValueRange() {
        return this.valueRange;
    }

    public final float getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public final float getInitialScale() {
        return this.initialScale;
    }

    public final float getPressedScale() {
        return this.pressedScale;
    }

    public final Function2<DampedDragAnimation, Offset, Unit> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final Function1<DampedDragAnimation, Unit> getOnDragStopped() {
        return this.onDragStopped;
    }

    public final Function3<DampedDragAnimation, IntSize, Offset, Unit> getOnDrag() {
        return this.onDrag;
    }

    public final float getValue() {
        return this.valueAnimation.getValue().floatValue();
    }

    public final float getProgress() {
        return (getValue() - ((Number) this.valueRange.getStart()).floatValue()) / (((Number) this.valueRange.getEndInclusive()).floatValue() - ((Number) this.valueRange.getStart()).floatValue());
    }

    public final float getTargetValue() {
        return this.valueAnimation.getTargetValue().floatValue();
    }

    public final float getPressProgress() {
        return this.pressProgressAnimation.getValue().floatValue();
    }

    public final float getScaleX() {
        return this.scaleXAnimation.getValue().floatValue();
    }

    public final float getScaleY() {
        return this.scaleYAnimation.getValue().floatValue();
    }

    public final float getVelocity() {
        return this.velocityAnimation.getValue().floatValue();
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DampedDragAnimation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1", f = "DampedDragAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C06271(Continuation<? super C06271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06271 c06271 = DampedDragAnimation.this.new C06271(continuation);
            c06271.L$0 = obj;
            return c06271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1$1", f = "DampedDragAnimation.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
        static final class C01301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01301(DampedDragAnimation dampedDragAnimation, Continuation<? super C01301> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01301(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.pressProgressAnimation, Boxing.boxFloat(1.0f), this.this$0.pressProgressAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C01301(DampedDragAnimation.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(DampedDragAnimation.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(DampedDragAnimation.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1$2", f = "DampedDragAnimation.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.scaleXAnimation, Boxing.boxFloat(this.this$0.getPressedScale()), this.this$0.scaleXAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$press$1$3", f = "DampedDragAnimation.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.scaleYAnimation, Boxing.boxFloat(this.this$0.getPressedScale()), this.this$0.scaleYAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
    }

    public final void press() {
        this.velocityTracker.resetTracking();
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new C06271(null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DampedDragAnimation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1", f = "DampedDragAnimation.kt", i = {0, 1}, l = {95, 98}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class C06281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C06281(Continuation<? super C06281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06281 c06281 = DampedDragAnimation.this.new C06281(continuation);
            c06281.L$0 = obj;
            return c06281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope4;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                coroutineScope3 = coroutineScope2;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass2(DampedDragAnimation.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass3(DampedDragAnimation.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass4(DampedDragAnimation.this, null), 3, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (HandlerDispatcherKt.awaitFrame(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            if (DampedDragAnimation.this.getValue() != DampedDragAnimation.this.getTargetValue()) {
                float fFloatValue = (((Number) DampedDragAnimation.this.getValueRange().getEndInclusive()).floatValue() - ((Number) DampedDragAnimation.this.getValueRange().getStart()).floatValue()) * 0.05f;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (TimeoutKt.withTimeoutOrNull(400L, new C01311(DampedDragAnimation.this, fFloatValue, null), this) != coroutine_suspended) {
                    coroutineScope2 = coroutineScope;
                    coroutineScope3 = coroutineScope2;
                }
                return coroutine_suspended;
            }
            coroutineScope3 = coroutineScope;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass2(DampedDragAnimation.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass3(DampedDragAnimation.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass4(DampedDragAnimation.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1", f = "DampedDragAnimation.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        static final class C01311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
            final /* synthetic */ float $threshold;
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01311(DampedDragAnimation dampedDragAnimation, float f, Continuation<? super C01311> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
                this.$threshold = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01311(this.this$0, this.$threshold, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Float> continuation) {
                return ((C01311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                final DampedDragAnimation dampedDragAnimation = this.this$0;
                final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(DampedDragAnimation.C06281.C01311.invokeSuspend$lambda$0(dampedDragAnimation));
                    }
                });
                final DampedDragAnimation dampedDragAnimation2 = this.this$0;
                final float f = this.$threshold;
                this.label = 1;
                Object objFirst = FlowKt.first(new Flow<Float>() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ float $threshold$inlined;
                        final /* synthetic */ DampedDragAnimation this$0;

                        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$1$invokeSuspend$$inlined$filter$1$2", f = "DampedDragAnimation.kt", i = {}, l = {AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, DampedDragAnimation dampedDragAnimation, float f) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = dampedDragAnimation;
                            this.$threshold$inlined = f;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = anonymousClass1.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (Math.abs(((Number) obj).floatValue() - ((Number) this.this$0.valueAnimation.getTargetValue()).floatValue()) < this.$threshold$inlined) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Float> flowCollector, Continuation continuation) {
                        Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector, dampedDragAnimation2, f), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, this);
                return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float invokeSuspend$lambda$0(DampedDragAnimation dampedDragAnimation) {
                return ((Number) dampedDragAnimation.valueAnimation.getValue()).floatValue();
            }
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$2", f = "DampedDragAnimation.kt", i = {}, l = {LocationRequestCompat.QUALITY_LOW_POWER}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.pressProgressAnimation, Boxing.boxFloat(0.0f), this.this$0.pressProgressAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$3", f = "DampedDragAnimation.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.scaleXAnimation, Boxing.boxFloat(this.this$0.getInitialScale()), this.this$0.scaleXAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$release$1$4", f = "DampedDragAnimation.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.scaleYAnimation, Boxing.boxFloat(this.this$0.getInitialScale()), this.this$0.scaleYAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
    }

    public final void release() {
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new C06281(null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateValue$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DampedDragAnimation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateValue$1", f = "DampedDragAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $targetValue;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06291(float f, Continuation<? super C06291> continuation) {
            super(2, continuation);
            this.$targetValue = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06291 c06291 = DampedDragAnimation.this.new C06291(this.$targetValue, continuation);
            c06291.L$0 = obj;
            return c06291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateValue$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateValue$1$1", f = "DampedDragAnimation.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        static final class C01321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ float $targetValue;
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01321(DampedDragAnimation dampedDragAnimation, float f, Continuation<? super C01321> continuation) {
                super(2, continuation);
                this.this$0 = dampedDragAnimation;
                this.$targetValue = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01321(this.this$0, this.$targetValue, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(DampedDragAnimation dampedDragAnimation, Animatable animatable) {
                dampedDragAnimation.updateVelocity();
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.this$0.valueAnimation;
                    Float fBoxFloat = Boxing.boxFloat(this.$targetValue);
                    SpringSpec springSpec = this.this$0.valueAnimationSpec;
                    final DampedDragAnimation dampedDragAnimation = this.this$0;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, springSpec, null, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateValue$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return DampedDragAnimation.C06291.C01321.invokeSuspend$lambda$0(dampedDragAnimation, (Animatable) obj2);
                        }
                    }, this, 4, null) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C01321(DampedDragAnimation.this, this.$targetValue, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateValue(float value) {
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new C06291(((Number) RangesKt.coerceIn(Float.valueOf(value), this.valueRange)).floatValue(), null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1, reason: invalid class name */
    /* JADX INFO: compiled from: DampedDragAnimation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1", f = "DampedDragAnimation.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$value = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DampedDragAnimation.this.new AnonymousClass1(this.$value, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: DampedDragAnimation.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1$1", f = "DampedDragAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01281 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ float $value;
            int label;
            final /* synthetic */ DampedDragAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01281(DampedDragAnimation dampedDragAnimation, float f, CoroutineScope coroutineScope, Continuation<? super C01281> continuation) {
                super(1, continuation);
                this.this$0 = dampedDragAnimation;
                this.$value = f;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C01281(this.this$0, this.$value, this.$$this$launch, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((C01281) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.press();
                BuildersKt__Builders_commonKt.launch$default(this.$$this$launch, null, null, new C01291(this.this$0, ((Number) RangesKt.coerceIn(Boxing.boxFloat(this.$value), this.this$0.getValueRange())).floatValue(), null), 3, null);
                if (this.this$0.getVelocity() != 0.0f) {
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$launch, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                }
                this.this$0.release();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: DampedDragAnimation.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1$1$1", f = "DampedDragAnimation.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
            static final class C01291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ float $targetValue;
                int label;
                final /* synthetic */ DampedDragAnimation this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01291(DampedDragAnimation dampedDragAnimation, float f, Continuation<? super C01291> continuation) {
                    super(2, continuation);
                    this.this$0 = dampedDragAnimation;
                    this.$targetValue = f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01291(this.this$0, this.$targetValue, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.this$0.valueAnimation, Boxing.boxFloat(this.$targetValue), this.this$0.valueAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: DampedDragAnimation.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$animateToValue$1$1$2", f = "DampedDragAnimation.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ DampedDragAnimation this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(DampedDragAnimation dampedDragAnimation, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = dampedDragAnimation;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.this$0.velocityAnimation, Boxing.boxFloat(0.0f), this.this$0.velocityAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (MutatorMutex.mutate$default(DampedDragAnimation.this.mutatorMutex, null, new C01281(DampedDragAnimation.this, this.$value, coroutineScope, null), this, 1, null) == coroutine_suspended) {
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

    public final void animateToValue(float value) {
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new AnonymousClass1(value, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVelocity() {
        this.velocityTracker.m5147addPositionUv8p0NA(System.currentTimeMillis(), OffsetKt.Offset(getValue(), 0.0f));
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new C06301(Velocity.m6539getXimpl(this.velocityTracker.m5148calculateVelocity9UxMQ8M()) / (((Number) this.valueRange.getEndInclusive()).floatValue() - ((Number) this.valueRange.getStart()).floatValue()), null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateVelocity$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DampedDragAnimation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation$updateVelocity$1", f = "DampedDragAnimation.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    static final class C06301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $targetVelocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06301(float f, Continuation<? super C06301> continuation) {
            super(2, continuation);
            this.$targetVelocity = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DampedDragAnimation.this.new C06301(this.$targetVelocity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Animatable.animateTo$default(DampedDragAnimation.this.velocityAnimation, Boxing.boxFloat(this.$targetVelocity), DampedDragAnimation.this.velocityAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
}
