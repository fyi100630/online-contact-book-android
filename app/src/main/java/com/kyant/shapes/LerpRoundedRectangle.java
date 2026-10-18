package com.kyant.shapes;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Lerp.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010 \u001a\u00020\u0001HÆ\u0003J\t\u0010!\u001a\u00020\u0001HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006,"}, d2 = {"Lcom/kyant/shapes/LerpRoundedRectangle;", "Lcom/kyant/shapes/RoundedRectangularShape;", "start", "stop", "fraction", "", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "<init>", "(Lcom/kyant/shapes/RoundedRectangularShape;Lcom/kyant/shapes/RoundedRectangularShape;FLcom/kyant/shapes/RoundedCornerStyle;)V", "getStart", "()Lcom/kyant/shapes/RoundedRectangularShape;", "getStop", "getFraction", "()F", "getStyle", "()Lcom/kyant/shapes/RoundedCornerStyle;", "corners", "Lcom/kyant/shapes/RoundedRectangularShape$Corners;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "corners-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "copy", "component1", "component2", "component3", "component4", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class LerpRoundedRectangle implements RoundedRectangularShape {
    private final float fraction;
    private final RoundedRectangularShape start;
    private final RoundedRectangularShape stop;
    private final RoundedCornerStyle style;

    public static /* synthetic */ LerpRoundedRectangle copy$default(LerpRoundedRectangle lerpRoundedRectangle, RoundedRectangularShape roundedRectangularShape, RoundedRectangularShape roundedRectangularShape2, float f, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            roundedRectangularShape = lerpRoundedRectangle.start;
        }
        if ((i & 2) != 0) {
            roundedRectangularShape2 = lerpRoundedRectangle.stop;
        }
        if ((i & 4) != 0) {
            f = lerpRoundedRectangle.fraction;
        }
        if ((i & 8) != 0) {
            roundedCornerStyle = lerpRoundedRectangle.style;
        }
        return lerpRoundedRectangle.copy(roundedRectangularShape, roundedRectangularShape2, f, roundedCornerStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RoundedRectangularShape getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RoundedRectangularShape getStop() {
        return this.stop;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RoundedCornerStyle getStyle() {
        return this.style;
    }

    public final LerpRoundedRectangle copy(RoundedRectangularShape start, RoundedRectangularShape stop, float fraction, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new LerpRoundedRectangle(start, stop, fraction, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LerpRoundedRectangle)) {
            return false;
        }
        LerpRoundedRectangle lerpRoundedRectangle = (LerpRoundedRectangle) other;
        return Intrinsics.areEqual(this.start, lerpRoundedRectangle.start) && Intrinsics.areEqual(this.stop, lerpRoundedRectangle.stop) && Float.compare(this.fraction, lerpRoundedRectangle.fraction) == 0 && this.style == lerpRoundedRectangle.style;
    }

    public int hashCode() {
        int iHashCode = ((((this.start.hashCode() * 31) + this.stop.hashCode()) * 31) + Float.hashCode(this.fraction)) * 31;
        RoundedCornerStyle roundedCornerStyle = this.style;
        return iHashCode + (roundedCornerStyle == null ? 0 : roundedCornerStyle.hashCode());
    }

    public String toString() {
        return "LerpRoundedRectangle(start=" + this.start + ", stop=" + this.stop + ", fraction=" + this.fraction + ", style=" + this.style + ")";
    }

    public LerpRoundedRectangle(RoundedRectangularShape start, RoundedRectangularShape stop, float f, RoundedCornerStyle roundedCornerStyle) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        this.start = start;
        this.stop = stop;
        this.fraction = f;
        this.style = roundedCornerStyle;
    }

    public final RoundedRectangularShape getStart() {
        return this.start;
    }

    public final RoundedRectangularShape getStop() {
        return this.stop;
    }

    public final float getFraction() {
        return this.fraction;
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
        RoundedRectangularShape.Corners cornersMo6678cornersPq9zytI = this.start.mo6678cornersPq9zytI(size, layoutDirection, density);
        RoundedRectangularShape.Corners cornersMo6678cornersPq9zytI2 = this.stop.mo6678cornersPq9zytI(size, layoutDirection, density);
        if (Intrinsics.areEqual(cornersMo6678cornersPq9zytI, cornersMo6678cornersPq9zytI2)) {
            return cornersMo6678cornersPq9zytI;
        }
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(size) * 0.5f;
        float fLerp = MathHelpersKt.lerp(cornersMo6678cornersPq9zytI.getTopLeft(), cornersMo6678cornersPq9zytI2.getTopLeft(), this.fraction);
        if (fLerp < 0.0f) {
            fLerp = 0.0f;
        }
        if (fLerp > fM3670getMinDimensionimpl) {
            fLerp = fM3670getMinDimensionimpl;
        }
        float fLerp2 = MathHelpersKt.lerp(cornersMo6678cornersPq9zytI.getTopRight(), cornersMo6678cornersPq9zytI2.getTopRight(), this.fraction);
        if (fLerp2 < 0.0f) {
            fLerp2 = 0.0f;
        }
        if (fLerp2 > fM3670getMinDimensionimpl) {
            fLerp2 = fM3670getMinDimensionimpl;
        }
        float fLerp3 = MathHelpersKt.lerp(cornersMo6678cornersPq9zytI.getBottomRight(), cornersMo6678cornersPq9zytI2.getBottomRight(), this.fraction);
        if (fLerp3 < 0.0f) {
            fLerp3 = 0.0f;
        }
        if (fLerp3 > fM3670getMinDimensionimpl) {
            fLerp3 = fM3670getMinDimensionimpl;
        }
        float fLerp4 = MathHelpersKt.lerp(cornersMo6678cornersPq9zytI.getBottomLeft(), cornersMo6678cornersPq9zytI2.getBottomLeft(), this.fraction);
        float f = fLerp4 >= 0.0f ? fLerp4 : 0.0f;
        if (f <= fM3670getMinDimensionimpl) {
            fM3670getMinDimensionimpl = f;
        }
        return new RoundedRectangularShape.Corners(fLerp, fLerp2, fLerp3, fM3670getMinDimensionimpl);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo287createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        RoundedRectangularShape.Corners cornersMo6678cornersPq9zytI = mo6678cornersPq9zytI(size, layoutDirection, density);
        if (getStyle() == null) {
            return new Outline.Rectangle(new Rect(0.0f, 0.0f, Size.m3671getWidthimpl(size), Size.m3668getHeightimpl(size)));
        }
        if (cornersMo6678cornersPq9zytI.getTopLeft() == cornersMo6678cornersPq9zytI.getTopRight() && cornersMo6678cornersPq9zytI.getTopRight() == cornersMo6678cornersPq9zytI.getBottomRight() && cornersMo6678cornersPq9zytI.getBottomRight() == cornersMo6678cornersPq9zytI.getBottomLeft()) {
            return RoundedRectangleOutlineKt.m6711roundedRectangleOutlinePq9zytI(size, cornersMo6678cornersPq9zytI.getTopLeft(), getStyle());
        }
        return RoundedRectangleOutlineKt.m6710roundedRectangleOutlineLjSzlW0(size, cornersMo6678cornersPq9zytI.getTopLeft(), cornersMo6678cornersPq9zytI.getTopRight(), cornersMo6678cornersPq9zytI.getBottomRight(), cornersMo6678cornersPq9zytI.getBottomLeft(), getStyle());
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public LerpRoundedRectangle copy(RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new LerpRoundedRectangle(this.start, this.stop, this.fraction, style);
    }
}
