package com.kyant.backdrop.shadow;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InnerShadow.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"lerp", "Lcom/kyant/backdrop/shadow/InnerShadow;", "start", "stop", "fraction", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InnerShadowKt {
    public static final InnerShadow lerp(InnerShadow start, InnerShadow stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new InnerShadow(DpKt.m6345lerpMdfbLM(start.m6665getRadiusD9Ej5fM(), stop.m6665getRadiusD9Ej5fM(), f), DpKt.m6346lerpxhh869w(start.m6664getOffsetRKDOV3M(), stop.m6664getOffsetRKDOV3M(), f), ColorKt.m3894lerpjxsXWHM(start.m6663getColor0d7_KjU(), stop.m6663getColor0d7_KjU(), f), MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), f), f < 0.5f ? start.m6662getBlendMode0nO6VwU() : stop.m6662getBlendMode0nO6VwU(), null);
    }
}
