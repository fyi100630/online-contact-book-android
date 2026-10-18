package com.kyant.shapes;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;

/* JADX INFO: compiled from: RoundedRectangularShape.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0011J'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/kyant/shapes/RoundedRectangularShape;", "Landroidx/compose/ui/graphics/Shape;", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "getStyle", "()Lcom/kyant/shapes/RoundedCornerStyle;", "corners", "Lcom/kyant/shapes/RoundedRectangularShape$Corners;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "corners-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "copy", "Corners", "Lcom/kyant/shapes/Capsule;", "Lcom/kyant/shapes/CopyRoundedRectangle;", "Lcom/kyant/shapes/LerpRoundedRectangle;", "Lcom/kyant/shapes/Rectangle;", "Lcom/kyant/shapes/RoundedRectangle;", "Lcom/kyant/shapes/UnevenRoundedRectangle;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RoundedRectangularShape extends Shape {

    /* JADX INFO: compiled from: RoundedRectangularShape.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static RoundedCornerStyle getStyle(RoundedRectangularShape roundedRectangularShape) {
            return null;
        }
    }

    RoundedRectangularShape copy(RoundedCornerStyle style);

    /* JADX INFO: renamed from: corners-Pq9zytI */
    Corners mo6678cornersPq9zytI(long size, LayoutDirection layoutDirection, Density density);

    RoundedCornerStyle getStyle();

    /* JADX INFO: compiled from: RoundedRectangularShape.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/kyant/shapes/RoundedRectangularShape$Corners;", "", "topLeft", "", "topRight", "bottomRight", "bottomLeft", "<init>", "(FFFF)V", "getTopLeft", "()F", "getTopRight", "getBottomRight", "getBottomLeft", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Corners {
        public static final int $stable = 0;
        private final float bottomLeft;
        private final float bottomRight;
        private final float topLeft;
        private final float topRight;

        public static /* synthetic */ Corners copy$default(Corners corners, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = corners.topLeft;
            }
            if ((i & 2) != 0) {
                f2 = corners.topRight;
            }
            if ((i & 4) != 0) {
                f3 = corners.bottomRight;
            }
            if ((i & 8) != 0) {
                f4 = corners.bottomLeft;
            }
            return corners.copy(f, f2, f3, f4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getTopLeft() {
            return this.topLeft;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getTopRight() {
            return this.topRight;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getBottomRight() {
            return this.bottomRight;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBottomLeft() {
            return this.bottomLeft;
        }

        public final Corners copy(float topLeft, float topRight, float bottomRight, float bottomLeft) {
            return new Corners(topLeft, topRight, bottomRight, bottomLeft);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Corners)) {
                return false;
            }
            Corners corners = (Corners) other;
            return Float.compare(this.topLeft, corners.topLeft) == 0 && Float.compare(this.topRight, corners.topRight) == 0 && Float.compare(this.bottomRight, corners.bottomRight) == 0 && Float.compare(this.bottomLeft, corners.bottomLeft) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.topLeft) * 31) + Float.hashCode(this.topRight)) * 31) + Float.hashCode(this.bottomRight)) * 31) + Float.hashCode(this.bottomLeft);
        }

        public String toString() {
            return "Corners(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomRight=" + this.bottomRight + ", bottomLeft=" + this.bottomLeft + ")";
        }

        public Corners(float f, float f2, float f3, float f4) {
            this.topLeft = f;
            this.topRight = f2;
            this.bottomRight = f3;
            this.bottomLeft = f4;
        }

        public final float getTopLeft() {
            return this.topLeft;
        }

        public final float getTopRight() {
            return this.topRight;
        }

        public final float getBottomRight() {
            return this.bottomRight;
        }

        public final float getBottomLeft() {
            return this.bottomLeft;
        }
    }
}
