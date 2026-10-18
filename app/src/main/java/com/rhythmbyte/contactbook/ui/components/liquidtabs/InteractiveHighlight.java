package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import io.ktor.http.ContentDisposition;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InteractiveHighlight.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00128\b\u0002\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010.\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b3\u00101J\u0006\u00104\u001a\u00020/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRA\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+¨\u00065"}, d2 = {"Lcom/rhythmbyte/contactbook/ui/components/liquidtabs/InteractiveHighlight;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "position", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/ParameterName;", "name", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)V", "getAnimationScope", "()Lkotlinx/coroutines/CoroutineScope;", "getPosition", "()Lkotlin/jvm/functions/Function2;", "pressProgressAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "positionAnimationSpec", "pressProgressAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "positionAnimation", "Landroidx/compose/animation/core/AnimationVector2D;", "startPosition", "J", "pressProgress", "getPressProgress", "()F", "getOffset-F1C5BW0", "()J", "shader", "Landroid/graphics/RuntimeShader;", "getShader", "()Landroid/graphics/RuntimeShader;", "shader$delegate", "Lkotlin/Lazy;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "gestureModifier", "getGestureModifier", "press", "", "press-k-4lQ0M", "(J)V", "updatePosition", "updatePosition-k-4lQ0M", "release", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InteractiveHighlight {
    public static final int $stable = 8;
    private final CoroutineScope animationScope;
    private final Modifier gestureModifier;
    private final Modifier modifier;
    private final Function2<Size, Offset, Offset> position;
    private final Animatable<Offset, AnimationVector2D> positionAnimation;
    private final SpringSpec<Offset> positionAnimationSpec;
    private final Animatable<Float, AnimationVector1D> pressProgressAnimation;
    private final SpringSpec<Float> pressProgressAnimationSpec;

    /* JADX INFO: renamed from: shader$delegate, reason: from kotlin metadata */
    private final Lazy shader;
    private long startPosition;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset _init_$lambda$0(Size size, Offset offset) {
        return offset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InteractiveHighlight(CoroutineScope animationScope, Function2<? super Size, ? super Offset, Offset> position) {
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(position, "position");
        this.animationScope = animationScope;
        this.position = position;
        this.pressProgressAnimationSpec = AnimationSpecKt.spring(0.5f, 300.0f, Float.valueOf(0.001f));
        this.positionAnimationSpec = AnimationSpecKt.spring(0.5f, 300.0f, Offset.m3591boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)));
        this.pressProgressAnimation = AnimatableKt.Animatable(0.0f, 0.001f);
        this.positionAnimation = new Animatable<>(Offset.m3591boximpl(Offset.INSTANCE.m3618getZeroF1C5BW0()), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), Offset.m3591boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), null, 8, null);
        this.startPosition = Offset.INSTANCE.m3618getZeroF1C5BW0();
        this.shader = LazyKt.lazy(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InteractiveHighlight.shader_delegate$lambda$1();
            }
        });
        this.modifier = DrawModifierKt.drawWithContent(Modifier.INSTANCE, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InteractiveHighlight.modifier$lambda$2(this.f$0, (ContentDrawScope) obj);
            }
        });
        this.gestureModifier = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, animationScope, new InteractiveHighlight$gestureModifier$1(this, null));
    }

    public final CoroutineScope getAnimationScope() {
        return this.animationScope;
    }

    public /* synthetic */ InteractiveHighlight(CoroutineScope coroutineScope, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i & 2) != 0 ? new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InteractiveHighlight._init_$lambda$0((Size) obj, (Offset) obj2);
            }
        } : function2);
    }

    public final Function2<Size, Offset, Offset> getPosition() {
        return this.position;
    }

    public final float getPressProgress() {
        return this.pressProgressAnimation.getValue().floatValue();
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m6775getOffsetF1C5BW0() {
        return Offset.m3606minusMKHz9U(this.positionAnimation.getValue().getPackedValue(), this.startPosition);
    }

    private final RuntimeShader getShader() {
        return (RuntimeShader) this.shader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RuntimeShader shader_delegate$lambda$1() {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        try {
            return new RuntimeShader("\nuniform float2 size;\nlayout(color) uniform half4 color;\nuniform float radius;\nuniform float2 position;\n\nhalf4 main(float2 coord) {\n    float dist = distance(coord, position);\n    float intensity = smoothstep(radius, radius * 0.5, dist);\n    return color * intensity;\n}");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0116  */
    public static final Unit modifier$lambda$2(InteractiveHighlight interactiveHighlight, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float fFloatValue = interactiveHighlight.pressProgressAnimation.getValue().floatValue();
        float f = 0.0f;
        if (fFloatValue > 0.0f) {
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    RuntimeShader shader = interactiveHighlight.getShader();
                    if (shader != null) {
                        DrawScope.m4393drawRectnJ9OG0$default(drawWithContent, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), fFloatValue * 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m3777getPlus0nO6VwU(), 62, null);
                        long packedValue = interactiveHighlight.position.invoke(Size.m3659boximpl(drawWithContent.mo4399getSizeNHjbRc()), interactiveHighlight.positionAnimation.getValue()).getPackedValue();
                        shader.setFloatUniform(ContentDisposition.Parameters.Size, Size.m3671getWidthimpl(drawWithContent.mo4399getSizeNHjbRc()), Size.m3668getHeightimpl(drawWithContent.mo4399getSizeNHjbRc()));
                        long jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), fFloatValue * 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                        shader.setColorUniform("color", android.graphics.Color.valueOf(Color.m3849getRedimpl(jM3842copywmQWz5c$default), Color.m3848getGreenimpl(jM3842copywmQWz5c$default), Color.m3846getBlueimpl(jM3842copywmQWz5c$default), Color.m3845getAlphaimpl(jM3842copywmQWz5c$default)));
                        shader.setFloatUniform("radius", Size.m3670getMinDimensionimpl(drawWithContent.mo4399getSizeNHjbRc()) * 1.5f);
                        float fM3602getXimpl = Offset.m3602getXimpl(packedValue);
                        float fM3671getWidthimpl = Size.m3671getWidthimpl(drawWithContent.mo4399getSizeNHjbRc());
                        if (fM3602getXimpl < 0.0f) {
                            fM3602getXimpl = 0.0f;
                        }
                        if (fM3602getXimpl <= fM3671getWidthimpl) {
                            fM3671getWidthimpl = fM3602getXimpl;
                        }
                        float fM3603getYimpl = Offset.m3603getYimpl(packedValue);
                        float fM3668getHeightimpl = Size.m3668getHeightimpl(drawWithContent.mo4399getSizeNHjbRc());
                        if (fM3603getYimpl >= 0.0f) {
                            f = fM3603getYimpl;
                        }
                        if (f <= fM3668getHeightimpl) {
                            fM3668getHeightimpl = f;
                        }
                        shader.setFloatUniform("position", fM3671getWidthimpl, fM3668getHeightimpl);
                        DrawScope.m4392drawRectAsUm42w$default(drawWithContent, BrushKt.ShaderBrush(shader), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m3777getPlus0nO6VwU(), 62, null);
                    } else {
                        DrawScope.m4393drawRectnJ9OG0$default(drawWithContent, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), fFloatValue * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m3777getPlus0nO6VwU(), 62, null);
                    }
                } catch (Throwable unused) {
                }
            } else {
                DrawScope.m4393drawRectnJ9OG0$default(drawWithContent, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), fFloatValue * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m3777getPlus0nO6VwU(), 62, null);
            }
        }
        drawWithContent.drawContent();
        return Unit.INSTANCE;
    }

    public final Modifier getGestureModifier() {
        return this.gestureModifier;
    }

    /* JADX INFO: renamed from: press-k-4lQ0M, reason: not valid java name */
    public final void m6776pressk4lQ0M(long position) {
        this.startPosition = position;
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new InteractiveHighlight$press$1(this, position, null), 3, null);
    }

    /* JADX INFO: renamed from: updatePosition-k-4lQ0M, reason: not valid java name */
    public final void m6777updatePositionk4lQ0M(long position) {
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new InteractiveHighlight$updatePosition$1(this, position, null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$release$1, reason: invalid class name */
    /* JADX INFO: compiled from: InteractiveHighlight.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$release$1", f = "InteractiveHighlight.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = InteractiveHighlight.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$release$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: InteractiveHighlight.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$release$1$1", f = "InteractiveHighlight.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        static final class C01331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InteractiveHighlight this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01331(InteractiveHighlight interactiveHighlight, Continuation<? super C01331> continuation) {
                super(2, continuation);
                this.this$0 = interactiveHighlight;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01331(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C01331(InteractiveHighlight.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(InteractiveHighlight.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$release$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: InteractiveHighlight.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquidtabs.InteractiveHighlight$release$1$2", f = "InteractiveHighlight.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InteractiveHighlight this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InteractiveHighlight interactiveHighlight, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = interactiveHighlight;
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
                    if (Animatable.animateTo$default(this.this$0.positionAnimation, Offset.m3591boximpl(this.this$0.startPosition), this.this$0.positionAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
        BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new AnonymousClass1(null), 3, null);
    }
}
