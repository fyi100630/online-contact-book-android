package com.kyant.shapes;

import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RectangleCornerRadii.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"lerp", "Lcom/kyant/shapes/RectangleCornerRadii;", "start", "stop", "fraction", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RectangleCornerRadiiKt {
    public static final RectangleCornerRadii lerp(RectangleCornerRadii start, RectangleCornerRadii stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RectangleCornerRadii(DpKt.m6345lerpMdfbLM(start.m6702getTopStartD9Ej5fM(), stop.m6702getTopStartD9Ej5fM(), f), DpKt.m6345lerpMdfbLM(start.m6701getTopEndD9Ej5fM(), stop.m6701getTopEndD9Ej5fM(), f), DpKt.m6345lerpMdfbLM(start.m6699getBottomEndD9Ej5fM(), stop.m6699getBottomEndD9Ej5fM(), f), DpKt.m6345lerpMdfbLM(start.m6700getBottomStartD9Ej5fM(), stop.m6700getBottomStartD9Ej5fM(), f), null);
    }
}
