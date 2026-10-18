package com.kyant.shapes;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RectangleCornerRadii.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/kyant/shapes/RectangleCornerRadii;", "", "topStart", "Landroidx/compose/ui/unit/Dp;", "topEnd", "bottomEnd", "bottomStart", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTopStart-D9Ej5fM", "()F", "F", "getTopEnd-D9Ej5fM", "getBottomEnd-D9Ej5fM", "getBottomStart-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "copy", "copy-a9UjIt4", "(FFFF)Lcom/kyant/shapes/RectangleCornerRadii;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RectangleCornerRadii {
    public static final int $stable = 0;
    private final float bottomEnd;
    private final float bottomStart;
    private final float topEnd;
    private final float topStart;

    public /* synthetic */ RectangleCornerRadii(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RectangleCornerRadii m6693copya9UjIt4$default(RectangleCornerRadii rectangleCornerRadii, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rectangleCornerRadii.topStart;
        }
        if ((i & 2) != 0) {
            f2 = rectangleCornerRadii.topEnd;
        }
        if ((i & 4) != 0) {
            f3 = rectangleCornerRadii.bottomEnd;
        }
        if ((i & 8) != 0) {
            f4 = rectangleCornerRadii.bottomStart;
        }
        return rectangleCornerRadii.m6698copya9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopStart() {
        return this.topStart;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopEnd() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomEnd() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: copy-a9UjIt4, reason: not valid java name */
    public final RectangleCornerRadii m6698copya9UjIt4(float topStart, float topEnd, float bottomEnd, float bottomStart) {
        return new RectangleCornerRadii(topStart, topEnd, bottomEnd, bottomStart, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RectangleCornerRadii)) {
            return false;
        }
        RectangleCornerRadii rectangleCornerRadii = (RectangleCornerRadii) other;
        return Dp.m6307equalsimpl0(this.topStart, rectangleCornerRadii.topStart) && Dp.m6307equalsimpl0(this.topEnd, rectangleCornerRadii.topEnd) && Dp.m6307equalsimpl0(this.bottomEnd, rectangleCornerRadii.bottomEnd) && Dp.m6307equalsimpl0(this.bottomStart, rectangleCornerRadii.bottomStart);
    }

    public int hashCode() {
        return (((((Dp.m6308hashCodeimpl(this.topStart) * 31) + Dp.m6308hashCodeimpl(this.topEnd)) * 31) + Dp.m6308hashCodeimpl(this.bottomEnd)) * 31) + Dp.m6308hashCodeimpl(this.bottomStart);
    }

    public String toString() {
        return "RectangleCornerRadii(topStart=" + Dp.m6313toStringimpl(this.topStart) + ", topEnd=" + Dp.m6313toStringimpl(this.topEnd) + ", bottomEnd=" + Dp.m6313toStringimpl(this.bottomEnd) + ", bottomStart=" + Dp.m6313toStringimpl(this.bottomStart) + ")";
    }

    private RectangleCornerRadii(float f, float f2, float f3, float f4) {
        this.topStart = f;
        this.topEnd = f2;
        this.bottomEnd = f3;
        this.bottomStart = f4;
    }

    /* JADX INFO: renamed from: getTopStart-D9Ej5fM, reason: not valid java name */
    public final float m6702getTopStartD9Ej5fM() {
        return this.topStart;
    }

    /* JADX INFO: renamed from: getTopEnd-D9Ej5fM, reason: not valid java name */
    public final float m6701getTopEndD9Ej5fM() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: getBottomEnd-D9Ej5fM, reason: not valid java name */
    public final float m6699getBottomEndD9Ej5fM() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: getBottomStart-D9Ej5fM, reason: not valid java name */
    public final float m6700getBottomStartD9Ej5fM() {
        return this.bottomStart;
    }
}
