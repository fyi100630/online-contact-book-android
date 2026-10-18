package com.kyant.shapes;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Copy.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\u0000\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001aE\u0010\u0000\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"copy", "Lcom/kyant/shapes/RoundedRectangle;", "Lcom/kyant/shapes/RoundedRectangularShape;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "copy-lG28NQ4", "(Lcom/kyant/shapes/RoundedRectangularShape;FLcom/kyant/shapes/RoundedCornerStyle;)Lcom/kyant/shapes/RoundedRectangle;", "Lcom/kyant/shapes/UnevenRoundedRectangle;", "cornerRadii", "Lcom/kyant/shapes/RectangleCornerRadii;", "topStart", "topEnd", "bottomEnd", "bottomStart", "copy-YLPp7PM", "(Lcom/kyant/shapes/RoundedRectangularShape;FFFFLcom/kyant/shapes/RoundedCornerStyle;)Lcom/kyant/shapes/RoundedRectangularShape;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CopyKt {
    /* JADX INFO: renamed from: copy-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ RoundedRectangle m6682copylG28NQ4$default(RoundedRectangularShape roundedRectangularShape, float f, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 2) != 0 && (roundedCornerStyle = roundedRectangularShape.getStyle()) == null) {
            roundedCornerStyle = RoundedCornerStyle.Continuous;
        }
        return m6681copylG28NQ4(roundedRectangularShape, f, roundedCornerStyle);
    }

    /* JADX INFO: renamed from: copy-lG28NQ4, reason: not valid java name */
    public static final RoundedRectangle m6681copylG28NQ4(RoundedRectangularShape copy, float f, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(copy, "$this$copy");
        Intrinsics.checkNotNullParameter(style, "style");
        return new RoundedRectangle(f, style, null);
    }

    public static /* synthetic */ UnevenRoundedRectangle copy$default(RoundedRectangularShape roundedRectangularShape, RectangleCornerRadii rectangleCornerRadii, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 2) != 0 && (roundedCornerStyle = roundedRectangularShape.getStyle()) == null) {
            roundedCornerStyle = RoundedCornerStyle.Continuous;
        }
        return copy(roundedRectangularShape, rectangleCornerRadii, roundedCornerStyle);
    }

    public static final UnevenRoundedRectangle copy(RoundedRectangularShape roundedRectangularShape, RectangleCornerRadii cornerRadii, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(roundedRectangularShape, "<this>");
        Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
        Intrinsics.checkNotNullParameter(style, "style");
        return new UnevenRoundedRectangle(cornerRadii, style);
    }

    /* JADX INFO: renamed from: copy-YLPp7PM$default, reason: not valid java name */
    public static /* synthetic */ RoundedRectangularShape m6680copyYLPp7PM$default(RoundedRectangularShape roundedRectangularShape, float f, float f2, float f3, float f4, RoundedCornerStyle roundedCornerStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m6322getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m6322getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.INSTANCE.m6322getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.INSTANCE.m6322getUnspecifiedD9Ej5fM();
        }
        if ((i & 16) != 0 && (roundedCornerStyle = roundedRectangularShape.getStyle()) == null) {
            roundedCornerStyle = RoundedCornerStyle.Continuous;
        }
        RoundedCornerStyle roundedCornerStyle2 = roundedCornerStyle;
        return m6679copyYLPp7PM(roundedRectangularShape, f, f2, f3, f4, roundedCornerStyle2);
    }

    /* JADX INFO: renamed from: copy-YLPp7PM, reason: not valid java name */
    public static final RoundedRectangularShape m6679copyYLPp7PM(RoundedRectangularShape copy, float f, float f2, float f3, float f4, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(copy, "$this$copy");
        Intrinsics.checkNotNullParameter(style, "style");
        return new CopyRoundedRectangle(copy, f, f2, f3, f4, style, null);
    }
}
