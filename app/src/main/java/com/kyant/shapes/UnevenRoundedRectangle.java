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

/* JADX INFO: compiled from: UnevenRoundedRectangle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005J?\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006+"}, d2 = {"Lcom/kyant/shapes/UnevenRoundedRectangle;", "Lcom/kyant/shapes/RoundedRectangularShape;", "cornerRadii", "Lcom/kyant/shapes/RectangleCornerRadii;", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "<init>", "(Lcom/kyant/shapes/RectangleCornerRadii;Lcom/kyant/shapes/RoundedCornerStyle;)V", "topStart", "Landroidx/compose/ui/unit/Dp;", "topEnd", "bottomEnd", "bottomStart", "(FFFFLcom/kyant/shapes/RoundedCornerStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerRadii", "()Lcom/kyant/shapes/RectangleCornerRadii;", "getStyle", "()Lcom/kyant/shapes/RoundedCornerStyle;", "corners", "Lcom/kyant/shapes/RoundedRectangularShape$Corners;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "corners-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "copy", "copy-lDy3nrA", "(FFFFLcom/kyant/shapes/RoundedCornerStyle;)Lcom/kyant/shapes/UnevenRoundedRectangle;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnevenRoundedRectangle implements RoundedRectangularShape {
    public static final int $stable = 0;
    private final RectangleCornerRadii cornerRadii;
    private final RoundedCornerStyle style;

    /* JADX INFO: compiled from: UnevenRoundedRectangle.kt */
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

    public /* synthetic */ UnevenRoundedRectangle(float f, float f2, float f3, float f4, RoundedCornerStyle roundedCornerStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, roundedCornerStyle);
    }

    public UnevenRoundedRectangle(RectangleCornerRadii cornerRadii, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
        Intrinsics.checkNotNullParameter(style, "style");
        this.cornerRadii = cornerRadii;
        this.style = style;
    }

    public final RectangleCornerRadii getCornerRadii() {
        return this.cornerRadii;
    }

    public /* synthetic */ UnevenRoundedRectangle(RectangleCornerRadii rectangleCornerRadii, RoundedCornerStyle roundedCornerStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectangleCornerRadii, (i & 2) != 0 ? RoundedCornerStyle.Continuous : roundedCornerStyle);
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    public RoundedCornerStyle getStyle() {
        return this.style;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private UnevenRoundedRectangle(float f, float f2, float f3, float f4, RoundedCornerStyle style) {
        this(new RectangleCornerRadii(f, f2, f3, f4, null), style);
        Intrinsics.checkNotNullParameter(style, "style");
    }

    @Override // com.kyant.shapes.RoundedRectangularShape
    /* JADX INFO: renamed from: corners-Pq9zytI */
    public RoundedRectangularShape.Corners mo6678cornersPq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(size) * 0.5f;
        float fMo376toPx0680j_4 = density.mo376toPx0680j_4(this.cornerRadii.m6702getTopStartD9Ej5fM());
        if (fMo376toPx0680j_4 < 0.0f) {
            fMo376toPx0680j_4 = 0.0f;
        }
        if (fMo376toPx0680j_4 > fM3670getMinDimensionimpl) {
            fMo376toPx0680j_4 = fM3670getMinDimensionimpl;
        }
        float fMo376toPx0680j_5 = density.mo376toPx0680j_4(this.cornerRadii.m6701getTopEndD9Ej5fM());
        if (fMo376toPx0680j_5 < 0.0f) {
            fMo376toPx0680j_5 = 0.0f;
        }
        if (fMo376toPx0680j_5 > fM3670getMinDimensionimpl) {
            fMo376toPx0680j_5 = fM3670getMinDimensionimpl;
        }
        float fMo376toPx0680j_6 = density.mo376toPx0680j_4(this.cornerRadii.m6699getBottomEndD9Ej5fM());
        if (fMo376toPx0680j_6 < 0.0f) {
            fMo376toPx0680j_6 = 0.0f;
        }
        if (fMo376toPx0680j_6 > fM3670getMinDimensionimpl) {
            fMo376toPx0680j_6 = fM3670getMinDimensionimpl;
        }
        float fMo376toPx0680j_7 = density.mo376toPx0680j_4(this.cornerRadii.m6700getBottomStartD9Ej5fM());
        float f = fMo376toPx0680j_7 >= 0.0f ? fMo376toPx0680j_7 : 0.0f;
        if (f <= fM3670getMinDimensionimpl) {
            fM3670getMinDimensionimpl = f;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float f2 = fMo376toPx0680j_6;
            fMo376toPx0680j_6 = fM3670getMinDimensionimpl;
            fM3670getMinDimensionimpl = f2;
            float f3 = fMo376toPx0680j_5;
            fMo376toPx0680j_5 = fMo376toPx0680j_4;
            fMo376toPx0680j_4 = f3;
        }
        return new RoundedRectangularShape.Corners(fMo376toPx0680j_4, fMo376toPx0680j_5, fMo376toPx0680j_6, fM3670getMinDimensionimpl);
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
    public UnevenRoundedRectangle copy(RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new UnevenRoundedRectangle(this.cornerRadii, style);
    }

    public static /* synthetic */ UnevenRoundedRectangle copy$default(UnevenRoundedRectangle unevenRoundedRectangle, RectangleCornerRadii rectangleCornerRadii, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            rectangleCornerRadii = unevenRoundedRectangle.cornerRadii;
        }
        if ((i & 2) != 0) {
            roundedCornerStyle = unevenRoundedRectangle.getStyle();
        }
        return unevenRoundedRectangle.copy(rectangleCornerRadii, roundedCornerStyle);
    }

    public final UnevenRoundedRectangle copy(RectangleCornerRadii cornerRadii, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
        Intrinsics.checkNotNullParameter(style, "style");
        return new UnevenRoundedRectangle(cornerRadii, style);
    }

    /* JADX INFO: renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ UnevenRoundedRectangle m6712copylDy3nrA$default(UnevenRoundedRectangle unevenRoundedRectangle, float f, float f2, float f3, float f4, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            f = unevenRoundedRectangle.cornerRadii.m6702getTopStartD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = unevenRoundedRectangle.cornerRadii.m6701getTopEndD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = unevenRoundedRectangle.cornerRadii.m6699getBottomEndD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = unevenRoundedRectangle.cornerRadii.m6700getBottomStartD9Ej5fM();
        }
        if ((i & 16) != 0) {
            roundedCornerStyle = unevenRoundedRectangle.getStyle();
        }
        RoundedCornerStyle roundedCornerStyle2 = roundedCornerStyle;
        float f5 = f3;
        return unevenRoundedRectangle.m6713copylDy3nrA(f, f2, f5, f4, roundedCornerStyle2);
    }

    /* JADX INFO: renamed from: copy-lDy3nrA, reason: not valid java name */
    public final UnevenRoundedRectangle m6713copylDy3nrA(float topStart, float topEnd, float bottomEnd, float bottomStart, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new UnevenRoundedRectangle(topStart, topEnd, bottomEnd, bottomStart, style, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnevenRoundedRectangle)) {
            return false;
        }
        UnevenRoundedRectangle unevenRoundedRectangle = (UnevenRoundedRectangle) other;
        return Intrinsics.areEqual(this.cornerRadii, unevenRoundedRectangle.cornerRadii) && getStyle() == unevenRoundedRectangle.getStyle();
    }

    public int hashCode() {
        return (this.cornerRadii.hashCode() * 31) + getStyle().hashCode();
    }

    public String toString() {
        return "RoundedRectangle(cornerRadii=" + this.cornerRadii + ", style=" + getStyle() + ")";
    }

    public /* synthetic */ UnevenRoundedRectangle(float f, float f2, float f3, float f4, RoundedCornerStyle roundedCornerStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m6302constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m6302constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m6302constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m6302constructorimpl(0.0f) : f4, (i & 16) != 0 ? RoundedCornerStyle.Continuous : roundedCornerStyle, null);
    }
}
