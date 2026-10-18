package com.rhythmbyte.contactbook.ui.components.liquid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LiquidButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1", f = "LiquidButton.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
final class LiquidButtonKt$LiquidButton$gestureModifier$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetX;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetY;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animScale;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ ViewConfiguration $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiquidButtonKt$LiquidButton$gestureModifier$1$1(ViewConfiguration viewConfiguration, CoroutineScope coroutineScope, Function0<Unit> function0, Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, Continuation<? super LiquidButtonKt$LiquidButton$gestureModifier$1$1> continuation) {
        super(2, continuation);
        this.$viewConfiguration = viewConfiguration;
        this.$coroutineScope = coroutineScope;
        this.$onClick = function0;
        this.$animScale = animatable;
        this.$animOffsetX = animatable2;
        this.$animOffsetY = animatable3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiquidButtonKt$LiquidButton$gestureModifier$1$1 liquidButtonKt$LiquidButton$gestureModifier$1$1 = new LiquidButtonKt$LiquidButton$gestureModifier$1$1(this.$viewConfiguration, this.$coroutineScope, this.$onClick, this.$animScale, this.$animOffsetX, this.$animOffsetY, continuation);
        liquidButtonKt$LiquidButton$gestureModifier$1$1.L$0 = obj;
        return liquidButtonKt$LiquidButton$gestureModifier$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((LiquidButtonKt$LiquidButton$gestureModifier$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: LiquidButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1", f = "LiquidButton.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {74, 90}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downPos", "maxOffsetPx", "touchSlop", "isDrag", "pointerId"}, s = {"L$0", "L$0", "J$0", "F$0", "F$1", "I$0", "J$1"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetX;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetY;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animScale;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ ViewConfiguration $viewConfiguration;
        float F$0;
        float F$1;
        int I$0;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewConfiguration viewConfiguration, CoroutineScope coroutineScope, Function0<Unit> function0, Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewConfiguration = viewConfiguration;
            this.$coroutineScope = coroutineScope;
            this.$onClick = function0;
            this.$animScale = animatable;
            this.$animOffsetX = animatable2;
            this.$animOffsetY = animatable3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewConfiguration, this.$coroutineScope, this.$onClick, this.$animScale, this.$animOffsetX, this.$animOffsetY, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            if (r13 == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a2 -> B:22:0x00a5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 515
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LiquidButton.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$1", f = "LiquidButton.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        static final class C01271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animScale;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01271(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C01271> continuation) {
                super(2, continuation);
                this.$animScale = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01271(this.$animScale, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$animScale, Boxing.boxFloat(1.08f), AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: LiquidButton.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$2", f = "LiquidButton.kt", i = {}, l = {119, MenuKt.InTransitionDuration}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetX;
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetY;
            final /* synthetic */ float $targetX;
            final /* synthetic */ float $targetY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, float f, Animatable<Float, AnimationVector1D> animatable2, float f2, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$animOffsetX = animatable;
                this.$targetX = f;
                this.$animOffsetY = animatable2;
                this.$targetY = f2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$animOffsetX, this.$targetX, this.$animOffsetY, this.$targetY, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
            
                if (r5.$animOffsetY.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5.$targetY), r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L49
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L35
                L1e:
                    kotlin.ResultKt.throwOnFailure(r6)
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animOffsetX
                    float r1 = r5.$targetX
                    java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
                    r4 = r5
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                    r5.label = r3
                    java.lang.Object r6 = r6.snapTo(r1, r4)
                    if (r6 != r0) goto L35
                    goto L48
                L35:
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r5.$animOffsetY
                    float r1 = r5.$targetY
                    java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
                    r3 = r5
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                    r5.label = r2
                    java.lang.Object r6 = r6.snapTo(r1, r3)
                    if (r6 != r0) goto L49
                L48:
                    return r0
                L49:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: LiquidButton.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$3", f = "LiquidButton.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animScale;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$animScale = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$animScale, continuation);
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
                    if (Animatable.animateTo$default(this.$animScale, Boxing.boxFloat(1.0f), AnimationSpecKt.spring$default(0.38f, 340.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: LiquidButton.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$4", f = "LiquidButton.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetX;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$animOffsetX = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$animOffsetX, continuation);
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
                    if (Animatable.animateTo$default(this.$animOffsetX, Boxing.boxFloat(0.0f), AnimationSpecKt.spring$default(0.45f, 380.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: LiquidButton.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt$LiquidButton$gestureModifier$1$1$1$5", f = "LiquidButton.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animOffsetY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$animOffsetY = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$animOffsetY, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$animOffsetY, Boxing.boxFloat(0.0f), AnimationSpecKt.spring$default(0.45f, 380.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
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
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new AnonymousClass1(this.$viewConfiguration, this.$coroutineScope, this.$onClick, this.$animScale, this.$animOffsetX, this.$animOffsetY, null), this) == coroutine_suspended) {
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
