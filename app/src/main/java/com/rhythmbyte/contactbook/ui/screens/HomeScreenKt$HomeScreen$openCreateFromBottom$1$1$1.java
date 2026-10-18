package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1", f = "HomeScreen.kt", i = {}, l = {ComposerKt.providerValuesKey, ComposerKt.referenceKey}, m = "invokeSuspend", n = {}, s = {})
final class HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isEditScreenVisible$delegate;
    final /* synthetic */ MutableState<Boolean> $isMorphingFromBottom$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $revealAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1> continuation) {
        super(2, continuation);
        this.$revealAnim = animatable;
        this.$isMorphingFromBottom$delegate = mutableState;
        this.$isEditScreenVisible$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1(this.$revealAnim, this.$isMorphingFromBottom$delegate, this.$isEditScreenVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12.$revealAnim, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(480, 0, com.rhythmbyte.contactbook.ui.screens.HomeScreenKt.FlymeAliveEasing, 2, null), null, null, r12, 12, null) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L68
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L34
        L1e:
            kotlin.ResultKt.throwOnFailure(r13)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$revealAnim
            r1 = 0
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r4 = r12
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r12.label = r3
            java.lang.Object r13 = r13.snapTo(r1, r4)
            if (r13 != r0) goto L34
            goto L67
        L34:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r13 = r12.$isMorphingFromBottom$delegate
            com.rhythmbyte.contactbook.ui.screens.HomeScreenKt.access$HomeScreen$lambda$32(r13, r3)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r13 = r12.$isEditScreenVisible$delegate
            com.rhythmbyte.contactbook.ui.screens.HomeScreenKt.access$HomeScreen$lambda$29(r13, r3)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$revealAnim
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r13)
            androidx.compose.animation.core.CubicBezierEasing r13 = com.rhythmbyte.contactbook.ui.screens.HomeScreenKt.access$getFlymeAliveEasing$p()
            androidx.compose.animation.core.Easing r13 = (androidx.compose.animation.core.Easing) r13
            r1 = 0
            r3 = 480(0x1e0, float:6.73E-43)
            r6 = 0
            androidx.compose.animation.core.TweenSpec r13 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r6, r13, r2, r1)
            r6 = r13
            androidx.compose.animation.core.AnimationSpec r6 = (androidx.compose.animation.core.AnimationSpec) r6
            r9 = r12
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r12.label = r2
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L68
        L67:
            return r0
        L68:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
