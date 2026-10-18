package com.kyant.shapes;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoundedRectangle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J!\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006&"}, d2 = {"Lcom/kyant/shapes/RoundedRectangle;", "Lcom/kyant/shapes/RoundedRectangularShape;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "<init>", "(FLcom/kyant/shapes/RoundedCornerStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerRadius-D9Ej5fM", "()F", "F", "getStyle", "()Lcom/kyant/shapes/RoundedCornerStyle;", "corners", "Lcom/kyant/shapes/RoundedRectangularShape$Corners;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "corners-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "copy", "copy-D5KLDUw", "(FLcom/kyant/shapes/RoundedCornerStyle;)Lcom/kyant/shapes/RoundedRectangle;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoundedRectangle implements RoundedRectangularShape {
    public static final int $stable = 0;
    private final float cornerRadius;
    private final RoundedCornerStyle style;

    public /* synthetic */ RoundedRectangle(float f, RoundedCornerStyle roundedCornerStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, roundedCornerStyle);
    }

    private RoundedRectangle(float f, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.cornerRadius = f;
        this.style = style;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public /* synthetic */ RoundedRectangle(float f, RoundedCornerStyle roundedCornerStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? RoundedCornerStyle.Continuous : roundedCornerStyle, null);
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public RoundedCornerStyle getStyle() {
        return this.style;
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    /* JADX INFO: renamed from: corners-Pq9zytI */
    public RoundedRectangularShape.Corners mo6678cornersPq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fMo376toPx0680j_4 = density.mo376toPx0680j_4(this.cornerRadius);
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(size) * 0.5f;
        if (fMo376toPx0680j_4 < 0.0f) {
            fMo376toPx0680j_4 = 0.0f;
        }
        if (fMo376toPx0680j_4 <= fM3670getMinDimensionimpl) {
            fM3670getMinDimensionimpl = fMo376toPx0680j_4;
        }
        return new RoundedRectangularShape.Corners(fM3670getMinDimensionimpl, fM3670getMinDimensionimpl, fM3670getMinDimensionimpl, fM3670getMinDimensionimpl);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo287createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fMo376toPx0680j_4 = density.mo376toPx0680j_4(this.cornerRadius);
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(size) * 0.5f;
        if (fMo376toPx0680j_4 < 0.0f) {
            fMo376toPx0680j_4 = 0.0f;
        }
        if (fMo376toPx0680j_4 <= fM3670getMinDimensionimpl) {
            fM3670getMinDimensionimpl = fMo376toPx0680j_4;
        }
        return RoundedRectangleOutlineKt.m6711roundedRectangleOutlinePq9zytI(size, fM3670getMinDimensionimpl, getStyle());
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public RoundedRectangle copy(RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new RoundedRectangle(this.cornerRadius, style, null);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ RoundedRectangle m6703copyD5KLDUw$default(RoundedRectangle roundedRectangle, float f, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            f = roundedRectangle.cornerRadius;
        }
        if ((i & 2) != 0) {
            roundedCornerStyle = roundedRectangle.getStyle();
        }
        return roundedRectangle.m6704copyD5KLDUw(f, roundedCornerStyle);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final RoundedRectangle m6704copyD5KLDUw(float cornerRadius, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new RoundedRectangle(cornerRadius, style, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedRectangle)) {
            return false;
        }
        RoundedRectangle roundedRectangle = (RoundedRectangle) other;
        return Dp.m6307equalsimpl0(this.cornerRadius, roundedRectangle.cornerRadius) && getStyle() == roundedRectangle.getStyle();
    }

    public int hashCode() {
        return (Dp.m6308hashCodeimpl(this.cornerRadius) * 31) + getStyle().hashCode();
    }

    public String toString() {
        return "RoundedRectangle(cornerRadius=" + Dp.m6313toStringimpl(this.cornerRadius) + ", style=" + getStyle() + ")";
    }
}
