package com.kyant.shapes;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Capsule.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/kyant/shapes/Capsule;", "Lcom/kyant/shapes/RoundedRectangularShape;", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "<init>", "(Lcom/kyant/shapes/RoundedCornerStyle;)V", "getStyle", "()Lcom/kyant/shapes/RoundedCornerStyle;", "corners", "Lcom/kyant/shapes/RoundedRectangularShape$Corners;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "corners-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Capsule implements RoundedRectangularShape {
    public static final int $stable = 0;
    private final RoundedCornerStyle style;

    /* JADX WARN: Multi-variable type inference failed */
    public Capsule() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Capsule(RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
    }

    public /* synthetic */ Capsule(RoundedCornerStyle roundedCornerStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RoundedCornerStyle.Continuous : roundedCornerStyle);
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public RoundedCornerStyle getStyle() {
        return this.style;
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    /* JADX INFO: renamed from: corners-Pq9zytI, reason: not valid java name */
    public RoundedRectangularShape.Corners mo6678cornersPq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(size) * 0.5f;
        return new RoundedRectangularShape.Corners(fM3670getMinDimensionimpl, fM3670getMinDimensionimpl, fM3670getMinDimensionimpl, fM3670getMinDimensionimpl);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo287createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        return RoundedRectangleOutlineKt.m6711roundedRectangleOutlinePq9zytI(size, Size.m3670getMinDimensionimpl(size) * 0.5f, getStyle());
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public Capsule copy(RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new Capsule(style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Capsule) && getStyle() == ((Capsule) other).getStyle();
    }

    public int hashCode() {
        return getStyle().hashCode();
    }

    public String toString() {
        return "Capsule(style=" + getStyle() + ")";
    }
}
