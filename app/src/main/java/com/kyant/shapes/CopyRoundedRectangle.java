package com.kyant.shapes;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Copy.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\t\u0010%\u001a\u00020\u0001HÆ\u0003J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u000fJ\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u000fJ\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u000fJ\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u000fJ\t\u0010.\u001a\u00020\tHÆ\u0003JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00069"}, d2 = {"Lcom/kyant/shapes/CopyRoundedRectangle;", "Lcom/kyant/shapes/RoundedRectangularShape;", "shape", "topStart", "Landroidx/compose/ui/unit/Dp;", "topEnd", "bottomEnd", "bottomStart", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "<init>", "(Lcom/kyant/shapes/RoundedRectangularShape;FFFFLcom/kyant/shapes/RoundedCornerStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getShape", "()Lcom/kyant/shapes/RoundedRectangularShape;", "getTopStart-D9Ej5fM", "()F", "F", "getTopEnd-D9Ej5fM", "getBottomEnd-D9Ej5fM", "getBottomStart-D9Ej5fM", "getStyle", "()Lcom/kyant/shapes/RoundedCornerStyle;", "corners", "Lcom/kyant/shapes/RoundedRectangularShape$Corners;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "corners-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "copy", "component1", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "component5-D9Ej5fM", "component6", "copy-YLPp7PM", "(Lcom/kyant/shapes/RoundedRectangularShape;FFFFLcom/kyant/shapes/RoundedCornerStyle;)Lcom/kyant/shapes/CopyRoundedRectangle;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class CopyRoundedRectangle implements RoundedRectangularShape {
    private final float bottomEnd;
    private final float bottomStart;
    private final RoundedRectangularShape shape;
    private final RoundedCornerStyle style;
    private final float topEnd;
    private final float topStart;

    /* JADX INFO: compiled from: Copy.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CopyRoundedRectangle(RoundedRectangularShape roundedRectangularShape, float f, float f2, float f3, float f4, RoundedCornerStyle roundedCornerStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(roundedRectangularShape, f, f2, f3, f4, roundedCornerStyle);
    }

    /* JADX INFO: renamed from: copy-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ CopyRoundedRectangle m6683copyYLPp7PM$default(CopyRoundedRectangle copyRoundedRectangle, RoundedRectangularShape roundedRectangularShape, float f, float f2, float f3, float f4, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            roundedRectangularShape = copyRoundedRectangle.shape;
        }
        if ((i & 2) != 0) {
            f = copyRoundedRectangle.topStart;
        }
        if ((i & 4) != 0) {
            f2 = copyRoundedRectangle.topEnd;
        }
        if ((i & 8) != 0) {
            f3 = copyRoundedRectangle.bottomEnd;
        }
        if ((i & 16) != 0) {
            f4 = copyRoundedRectangle.bottomStart;
        }
        if ((i & 32) != 0) {
            roundedCornerStyle = copyRoundedRectangle.style;
        }
        float f5 = f4;
        RoundedCornerStyle roundedCornerStyle2 = roundedCornerStyle;
        return copyRoundedRectangle.m6688copyYLPp7PM(roundedRectangularShape, f, f2, f3, f5, roundedCornerStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RoundedRectangularShape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopStart() {
        return this.topStart;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopEnd() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomEnd() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RoundedCornerStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: copy-YLPp7PM, reason: not valid java name */
    public final CopyRoundedRectangle m6688copyYLPp7PM(RoundedRectangularShape shape, float topStart, float topEnd, float bottomEnd, float bottomStart, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(style, "style");
        return new CopyRoundedRectangle(shape, topStart, topEnd, bottomEnd, bottomStart, style, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyRoundedRectangle)) {
            return false;
        }
        CopyRoundedRectangle copyRoundedRectangle = (CopyRoundedRectangle) other;
        return Intrinsics.areEqual(this.shape, copyRoundedRectangle.shape) && Dp.m6307equalsimpl0(this.topStart, copyRoundedRectangle.topStart) && Dp.m6307equalsimpl0(this.topEnd, copyRoundedRectangle.topEnd) && Dp.m6307equalsimpl0(this.bottomEnd, copyRoundedRectangle.bottomEnd) && Dp.m6307equalsimpl0(this.bottomStart, copyRoundedRectangle.bottomStart) && this.style == copyRoundedRectangle.style;
    }

    public int hashCode() {
        return (((((((((this.shape.hashCode() * 31) + Dp.m6308hashCodeimpl(this.topStart)) * 31) + Dp.m6308hashCodeimpl(this.topEnd)) * 31) + Dp.m6308hashCodeimpl(this.bottomEnd)) * 31) + Dp.m6308hashCodeimpl(this.bottomStart)) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "CopyRoundedRectangle(shape=" + this.shape + ", topStart=" + Dp.m6313toStringimpl(this.topStart) + ", topEnd=" + Dp.m6313toStringimpl(this.topEnd) + ", bottomEnd=" + Dp.m6313toStringimpl(this.bottomEnd) + ", bottomStart=" + Dp.m6313toStringimpl(this.bottomStart) + ", style=" + this.style + ")";
    }

    private CopyRoundedRectangle(RoundedRectangularShape shape, float f, float f2, float f3, float f4, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(style, "style");
        this.shape = shape;
        this.topStart = f;
        this.topEnd = f2;
        this.bottomEnd = f3;
        this.bottomStart = f4;
        this.style = style;
    }

    public final RoundedRectangularShape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getTopStart-D9Ej5fM, reason: not valid java name */
    public final float m6692getTopStartD9Ej5fM() {
        return this.topStart;
    }

    /* JADX INFO: renamed from: getTopEnd-D9Ej5fM, reason: not valid java name */
    public final float m6691getTopEndD9Ej5fM() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: getBottomEnd-D9Ej5fM, reason: not valid java name */
    public final float m6689getBottomEndD9Ej5fM() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: getBottomStart-D9Ej5fM, reason: not valid java name */
    public final float m6690getBottomStartD9Ej5fM() {
        return this.bottomStart;
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public RoundedCornerStyle getStyle() {
        return this.style;
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    /* JADX INFO: renamed from: corners-Pq9zytI */
    public RoundedRectangularShape.Corners mo6678cornersPq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        float f;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        RoundedRectangularShape.Corners cornersMo6678cornersPq9zytI = this.shape.mo6678cornersPq9zytI(size, layoutDirection, density);
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(size) * 0.5f;
        float topLeft = cornersMo6678cornersPq9zytI.getTopLeft();
        float topRight = cornersMo6678cornersPq9zytI.getTopRight();
        float bottomRight = cornersMo6678cornersPq9zytI.getBottomRight();
        float bottomLeft = cornersMo6678cornersPq9zytI.getBottomLeft();
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            if (!Float.isNaN(this.topStart)) {
                topLeft = density.mo376toPx0680j_4(this.topStart);
                if (topLeft < 0.0f) {
                    topLeft = 0.0f;
                }
                if (topLeft > fM3670getMinDimensionimpl) {
                    topLeft = fM3670getMinDimensionimpl;
                }
            }
            if (!Float.isNaN(this.topEnd)) {
                float fMo376toPx0680j_4 = density.mo376toPx0680j_4(this.topEnd);
                if (fMo376toPx0680j_4 < 0.0f) {
                    fMo376toPx0680j_4 = 0.0f;
                }
                topRight = fMo376toPx0680j_4 > fM3670getMinDimensionimpl ? fM3670getMinDimensionimpl : fMo376toPx0680j_4;
            }
            if (!Float.isNaN(this.bottomEnd)) {
                float fMo376toPx0680j_5 = density.mo376toPx0680j_4(this.bottomEnd);
                if (fMo376toPx0680j_5 < 0.0f) {
                    fMo376toPx0680j_5 = 0.0f;
                }
                bottomRight = fMo376toPx0680j_5 > fM3670getMinDimensionimpl ? fM3670getMinDimensionimpl : fMo376toPx0680j_5;
            }
            if (!Float.isNaN(this.bottomStart)) {
                float fMo376toPx0680j_6 = density.mo376toPx0680j_4(this.bottomStart);
                f = fMo376toPx0680j_6 >= 0.0f ? fMo376toPx0680j_6 : 0.0f;
                if (f <= fM3670getMinDimensionimpl) {
                    fM3670getMinDimensionimpl = f;
                }
                bottomLeft = fM3670getMinDimensionimpl;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!Float.isNaN(this.topStart)) {
                float fMo376toPx0680j_7 = density.mo376toPx0680j_4(this.topStart);
                if (fMo376toPx0680j_7 < 0.0f) {
                    fMo376toPx0680j_7 = 0.0f;
                }
                topRight = fMo376toPx0680j_7 > fM3670getMinDimensionimpl ? fM3670getMinDimensionimpl : fMo376toPx0680j_7;
            }
            if (!Float.isNaN(this.topEnd)) {
                topLeft = density.mo376toPx0680j_4(this.topEnd);
                if (topLeft < 0.0f) {
                    topLeft = 0.0f;
                }
                if (topLeft > fM3670getMinDimensionimpl) {
                    topLeft = fM3670getMinDimensionimpl;
                }
            }
            if (!Float.isNaN(this.bottomEnd)) {
                float fMo376toPx0680j_8 = density.mo376toPx0680j_4(this.bottomEnd);
                if (fMo376toPx0680j_8 < 0.0f) {
                    fMo376toPx0680j_8 = 0.0f;
                }
                bottomLeft = fMo376toPx0680j_8 > fM3670getMinDimensionimpl ? fM3670getMinDimensionimpl : fMo376toPx0680j_8;
            }
            if (!Float.isNaN(this.bottomStart)) {
                float fMo376toPx0680j_9 = density.mo376toPx0680j_4(this.bottomStart);
                f = fMo376toPx0680j_9 >= 0.0f ? fMo376toPx0680j_9 : 0.0f;
                if (f <= fM3670getMinDimensionimpl) {
                    fM3670getMinDimensionimpl = f;
                }
                bottomRight = fM3670getMinDimensionimpl;
            }
        }
        return new RoundedRectangularShape.Corners(topLeft, topRight, bottomRight, bottomLeft);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo287createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        RoundedRectangularShape.Corners cornersMo6678cornersPq9zytI = mo6678cornersPq9zytI(size, layoutDirection, density);
        return RoundedRectangleOutlineKt.m6710roundedRectangleOutlineLjSzlW0(size, cornersMo6678cornersPq9zytI.getTopLeft(), cornersMo6678cornersPq9zytI.getTopRight(), cornersMo6678cornersPq9zytI.getBottomRight(), cornersMo6678cornersPq9zytI.getBottomLeft(), getStyle());
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public CopyRoundedRectangle copy(RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new CopyRoundedRectangle(this.shape, this.topStart, this.topEnd, this.bottomEnd, this.bottomStart, style, null);
    }
}
