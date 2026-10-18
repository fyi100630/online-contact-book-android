package com.kyant.shapes;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoundedRectangleOutline.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aC\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"roundedRectangleOutline", "Landroidx/compose/ui/graphics/Outline;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "radius", "", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "roundedRectangleOutline-Pq9zytI", "(JFLcom/kyant/shapes/RoundedCornerStyle;)Landroidx/compose/ui/graphics/Outline;", "topLeft", "topRight", "bottomRight", "bottomLeft", "roundedRectangleOutline-LjSzlW0", "(JFFFFLcom/kyant/shapes/RoundedCornerStyle;)Landroidx/compose/ui/graphics/Outline;", "continuousCurvatureRoundedRectanglePath", "Landroidx/compose/ui/graphics/Path;", "path", "continuousCurvatureRoundedRectanglePath-Pq9zytI", "(JFLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "continuousCurvatureRoundedRectanglePath-LjSzlW0", "(JFFFFLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RoundedRectangleOutlineKt {
    /* JADX INFO: renamed from: roundedRectangleOutline-Pq9zytI, reason: not valid java name */
    public static final Outline m6711roundedRectangleOutlinePq9zytI(long j, float f, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        float fM3671getWidthimpl = Size.m3671getWidthimpl(j);
        float fM3668getHeightimpl = Size.m3668getHeightimpl(j);
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(j) * 0.5f;
        if (f == 0.0f) {
            return new Outline.Rectangle(new Rect(0.0f, 0.0f, fM3671getWidthimpl, fM3668getHeightimpl));
        }
        if (style == RoundedCornerStyle.Circular || (fM3671getWidthimpl == fM3668getHeightimpl && f >= fM3670getMinDimensionimpl)) {
            long jCornerRadius$default = CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null);
            return new Outline.Rounded(new RoundRect(0.0f, 0.0f, fM3671getWidthimpl, fM3668getHeightimpl, jCornerRadius$default, jCornerRadius$default, jCornerRadius$default, jCornerRadius$default, null));
        }
        return new Outline.Generic(m6709continuousCurvatureRoundedRectanglePathPq9zytI$default(j, f, null, 4, null));
    }

    /* JADX INFO: renamed from: roundedRectangleOutline-LjSzlW0, reason: not valid java name */
    public static final Outline m6710roundedRectangleOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        float fM3671getWidthimpl = Size.m3671getWidthimpl(j);
        float fM3668getHeightimpl = Size.m3668getHeightimpl(j);
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(j) * 0.5f;
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return new Outline.Rectangle(new Rect(0.0f, 0.0f, fM3671getWidthimpl, fM3668getHeightimpl));
        }
        if (style == RoundedCornerStyle.Circular || (fM3671getWidthimpl == fM3668getHeightimpl && f >= fM3670getMinDimensionimpl && f2 >= fM3670getMinDimensionimpl && f3 >= fM3670getMinDimensionimpl && f4 >= fM3670getMinDimensionimpl)) {
            return new Outline.Rounded(new RoundRect(0.0f, 0.0f, fM3671getWidthimpl, fM3668getHeightimpl, CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f4, 0.0f, 2, null), null));
        }
        return new Outline.Generic(m6707continuousCurvatureRoundedRectanglePathLjSzlW0$default(j, f, f2, f3, f4, null, 32, null));
    }

    /* JADX INFO: renamed from: continuousCurvatureRoundedRectanglePath-Pq9zytI$default, reason: not valid java name */
    static /* synthetic */ Path m6709continuousCurvatureRoundedRectanglePathPq9zytI$default(long j, float f, Path path, int i, Object obj) {
        if ((i & 4) != 0) {
            path = null;
        }
        return m6708continuousCurvatureRoundedRectanglePathPq9zytI(j, f, path);
    }

    /* JADX INFO: renamed from: continuousCurvatureRoundedRectanglePath-Pq9zytI, reason: not valid java name */
    private static final Path m6708continuousCurvatureRoundedRectanglePathPq9zytI(long j, float f, Path path) {
        Path Path;
        float fM3671getWidthimpl = Size.m3671getWidthimpl(j);
        float fM3668getHeightimpl = Size.m3668getHeightimpl(j);
        if (path != null) {
            path.rewind();
            Path = path;
        } else {
            Path = AndroidPath_androidKt.Path();
        }
        ContinuousCurvatureRoundedRectangleCornerBuilder continuousCurvatureRoundedRectangleCornerBuilder = ContinuousCurvatureRoundedRectangleCornerBuilder.INSTANCE.getDefault();
        double d = fM3671getWidthimpl;
        double d2 = fM3668getHeightimpl;
        double d3 = f;
        double d4 = ((d * 0.5d) - d3) / d3;
        if (d4 < 0.0d) {
            d4 = 0.0d;
        }
        if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        double d5 = ((0.5d * d2) - d3) / d3;
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        double[] cornerBezierPoints = continuousCurvatureRoundedRectangleCornerBuilder.getCornerBezierPoints(d4, d5);
        if (cornerBezierPoints.length >= 20) {
            double d6 = d - d3;
            Path.moveTo((float) ((cornerBezierPoints[0] * d3) + d6), (float) ((cornerBezierPoints[1] * d3) + 0.0d));
            Path.cubicTo((float) ((cornerBezierPoints[2] * d3) + d6), (float) ((cornerBezierPoints[3] * d3) + 0.0d), (float) ((cornerBezierPoints[4] * d3) + d6), (float) ((cornerBezierPoints[5] * d3) + 0.0d), (float) ((cornerBezierPoints[6] * d3) + d6), (float) ((cornerBezierPoints[7] * d3) + 0.0d));
            Path.cubicTo((float) ((cornerBezierPoints[8] * d3) + d6), (float) ((cornerBezierPoints[9] * d3) + 0.0d), (float) ((cornerBezierPoints[10] * d3) + d6), (float) ((cornerBezierPoints[11] * d3) + 0.0d), (float) ((cornerBezierPoints[12] * d3) + d6), (float) ((cornerBezierPoints[13] * d3) + 0.0d));
            Path.cubicTo((float) ((cornerBezierPoints[14] * d3) + d6), (float) ((cornerBezierPoints[15] * d3) + 0.0d), (float) ((cornerBezierPoints[16] * d3) + d6), (float) ((cornerBezierPoints[17] * d3) + 0.0d), (float) ((cornerBezierPoints[18] * d3) + d6), (float) ((cornerBezierPoints[19] * d3) + 0.0d));
            Path.lineTo((float) ((cornerBezierPoints[18] * d3) + d6), (float) (d2 - (cornerBezierPoints[19] * d3)));
            Path.cubicTo((float) ((cornerBezierPoints[16] * d3) + d6), (float) (d2 - (cornerBezierPoints[17] * d3)), (float) ((cornerBezierPoints[14] * d3) + d6), (float) (d2 - (cornerBezierPoints[15] * d3)), (float) ((cornerBezierPoints[12] * d3) + d6), (float) (d2 - (cornerBezierPoints[13] * d3)));
            Path.cubicTo((float) ((cornerBezierPoints[10] * d3) + d6), (float) (d2 - (cornerBezierPoints[11] * d3)), (float) ((cornerBezierPoints[8] * d3) + d6), (float) (d2 - (cornerBezierPoints[9] * d3)), (float) ((cornerBezierPoints[6] * d3) + d6), (float) (d2 - (cornerBezierPoints[7] * d3)));
            Path.cubicTo((float) ((cornerBezierPoints[4] * d3) + d6), (float) (d2 - (cornerBezierPoints[5] * d3)), (float) ((cornerBezierPoints[2] * d3) + d6), (float) (d2 - (cornerBezierPoints[3] * d3)), (float) (d6 + (cornerBezierPoints[0] * d3)), (float) (d2 - (cornerBezierPoints[1] * d3)));
            Path.lineTo((float) (d3 - (cornerBezierPoints[0] * d3)), (float) (d2 - (cornerBezierPoints[1] * d3)));
            Path.cubicTo((float) (d3 - (cornerBezierPoints[2] * d3)), (float) (d2 - (cornerBezierPoints[3] * d3)), (float) (d3 - (cornerBezierPoints[4] * d3)), (float) (d2 - (cornerBezierPoints[5] * d3)), (float) (d3 - (cornerBezierPoints[6] * d3)), (float) (d2 - (cornerBezierPoints[7] * d3)));
            Path.cubicTo((float) (d3 - (cornerBezierPoints[8] * d3)), (float) (d2 - (cornerBezierPoints[9] * d3)), (float) (d3 - (cornerBezierPoints[10] * d3)), (float) (d2 - (cornerBezierPoints[11] * d3)), (float) (d3 - (cornerBezierPoints[12] * d3)), (float) (d2 - (cornerBezierPoints[13] * d3)));
            Path.cubicTo((float) (d3 - (cornerBezierPoints[14] * d3)), (float) (d2 - (cornerBezierPoints[15] * d3)), (float) (d3 - (cornerBezierPoints[16] * d3)), (float) (d2 - (cornerBezierPoints[17] * d3)), (float) (d3 - (cornerBezierPoints[18] * d3)), (float) (d2 - (cornerBezierPoints[19] * d3)));
            Path.lineTo((float) (d3 - (cornerBezierPoints[18] * d3)), (float) ((cornerBezierPoints[19] * d3) + 0.0d));
            Path.cubicTo((float) (d3 - (cornerBezierPoints[16] * d3)), (float) ((cornerBezierPoints[17] * d3) + 0.0d), (float) (d3 - (cornerBezierPoints[14] * d3)), (float) ((cornerBezierPoints[15] * d3) + 0.0d), (float) (d3 - (cornerBezierPoints[12] * d3)), (float) ((cornerBezierPoints[13] * d3) + 0.0d));
            Path.cubicTo((float) (d3 - (cornerBezierPoints[10] * d3)), (float) ((cornerBezierPoints[11] * d3) + 0.0d), (float) (d3 - (cornerBezierPoints[8] * d3)), (float) ((cornerBezierPoints[9] * d3) + 0.0d), (float) (d3 - (cornerBezierPoints[6] * d3)), (float) ((cornerBezierPoints[7] * d3) + 0.0d));
            Path.cubicTo((float) (d3 - (cornerBezierPoints[4] * d3)), (float) ((cornerBezierPoints[5] * d3) + 0.0d), (float) (d3 - (cornerBezierPoints[2] * d3)), (float) ((cornerBezierPoints[3] * d3) + 0.0d), (float) (d3 - (cornerBezierPoints[0] * d3)), (float) ((cornerBezierPoints[1] * d3) + 0.0d));
            Path.close();
        }
        return Path;
    }

    /* JADX INFO: renamed from: continuousCurvatureRoundedRectanglePath-LjSzlW0$default, reason: not valid java name */
    static /* synthetic */ Path m6707continuousCurvatureRoundedRectanglePathLjSzlW0$default(long j, float f, float f2, float f3, float f4, Path path, int i, Object obj) {
        if ((i & 32) != 0) {
            path = null;
        }
        return m6706continuousCurvatureRoundedRectanglePathLjSzlW0(j, f, f2, f3, f4, path);
    }

    /* JADX INFO: renamed from: continuousCurvatureRoundedRectanglePath-LjSzlW0, reason: not valid java name */
    private static final Path m6706continuousCurvatureRoundedRectanglePathLjSzlW0(long j, float f, float f2, float f3, float f4, Path path) {
        Path Path;
        float fM3671getWidthimpl = Size.m3671getWidthimpl(j);
        float fM3668getHeightimpl = Size.m3668getHeightimpl(j);
        if (path != null) {
            path.rewind();
            Path = path;
        } else {
            Path = AndroidPath_androidKt.Path();
        }
        ContinuousCurvatureRoundedRectangleCornerBuilder continuousCurvatureRoundedRectangleCornerBuilder = ContinuousCurvatureRoundedRectangleCornerBuilder.INSTANCE.getDefault();
        double d = fM3671getWidthimpl;
        double d2 = fM3668getHeightimpl;
        double d3 = f2;
        double d4 = d * 0.5d;
        double d5 = (d4 - d3) / d3;
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        double d6 = d2 * 0.5d;
        double d7 = (d6 - d3) / d3;
        if (d7 < 0.0d) {
            d7 = 0.0d;
        }
        if (d7 > 1.0d) {
            d7 = 1.0d;
        }
        double[] cornerBezierPoints = continuousCurvatureRoundedRectangleCornerBuilder.getCornerBezierPoints(d5, d7);
        if (cornerBezierPoints.length >= 20) {
            double d8 = d - d3;
            Path.moveTo((float) (d8 + (cornerBezierPoints[0] * d3)), (float) ((cornerBezierPoints[1] * d3) + 0.0d));
            Path.cubicTo((float) (d8 + (cornerBezierPoints[2] * d3)), (float) ((cornerBezierPoints[3] * d3) + 0.0d), (float) (d8 + (cornerBezierPoints[4] * d3)), (float) ((cornerBezierPoints[5] * d3) + 0.0d), (float) (d8 + (cornerBezierPoints[6] * d3)), (float) ((cornerBezierPoints[7] * d3) + 0.0d));
            Path = Path;
            Path.cubicTo((float) (d8 + (cornerBezierPoints[8] * d3)), (float) ((cornerBezierPoints[9] * d3) + 0.0d), (float) (d8 + (cornerBezierPoints[10] * d3)), (float) ((cornerBezierPoints[11] * d3) + 0.0d), (float) (d8 + (cornerBezierPoints[12] * d3)), (float) ((cornerBezierPoints[13] * d3) + 0.0d));
            Path.cubicTo((float) (d8 + (cornerBezierPoints[14] * d3)), (float) ((cornerBezierPoints[15] * d3) + 0.0d), (float) (d8 + (cornerBezierPoints[16] * d3)), (float) ((cornerBezierPoints[17] * d3) + 0.0d), (float) (d8 + (cornerBezierPoints[18] * d3)), (float) ((cornerBezierPoints[19] * d3) + 0.0d));
            double d9 = f3;
            double d10 = (d4 - d9) / d9;
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            if (d10 > 1.0d) {
                d10 = 1.0d;
            }
            double d11 = (d6 - d9) / d9;
            if (d11 < 0.0d) {
                d11 = 0.0d;
            }
            if (d11 > 1.0d) {
                d11 = 1.0d;
            }
            double[] cornerBezierPoints2 = continuousCurvatureRoundedRectangleCornerBuilder.getCornerBezierPoints(d10, d11);
            if (cornerBezierPoints2.length >= 20) {
                double d12 = d - d9;
                Path.lineTo((float) ((cornerBezierPoints2[18] * d9) + d12), (float) (d2 - (cornerBezierPoints2[19] * d9)));
                Path.cubicTo((float) ((cornerBezierPoints2[16] * d9) + d12), (float) (d2 - (cornerBezierPoints2[17] * d9)), (float) ((cornerBezierPoints2[14] * d9) + d12), (float) (d2 - (cornerBezierPoints2[15] * d9)), (float) (d12 + (cornerBezierPoints2[12] * d9)), (float) (d2 - (cornerBezierPoints2[13] * d9)));
                Path.cubicTo((float) ((cornerBezierPoints2[10] * d9) + d12), (float) (d2 - (cornerBezierPoints2[11] * d9)), (float) ((cornerBezierPoints2[8] * d9) + d12), (float) (d2 - (cornerBezierPoints2[9] * d9)), (float) ((cornerBezierPoints2[6] * d9) + d12), (float) (d2 - (cornerBezierPoints2[7] * d9)));
                Path.cubicTo((float) ((cornerBezierPoints2[4] * d9) + d12), (float) (d2 - (cornerBezierPoints2[5] * d9)), (float) ((cornerBezierPoints2[2] * d9) + d12), (float) (d2 - (cornerBezierPoints2[3] * d9)), (float) (d12 + (cornerBezierPoints2[0] * d9)), (float) (d2 - (cornerBezierPoints2[1] * d9)));
                double d13 = f4;
                double d14 = (d4 - d13) / d13;
                if (d14 < 0.0d) {
                    Path = Path;
                    d14 = 0.0d;
                }
                Path = Path;
                if (d14 > 1.0d) {
                    d14 = 1.0d;
                }
                double d15 = (d6 - d13) / d13;
                if (d15 < 0.0d) {
                    d15 = 0.0d;
                }
                if (d15 > 1.0d) {
                    d15 = 1.0d;
                }
                double[] cornerBezierPoints3 = continuousCurvatureRoundedRectangleCornerBuilder.getCornerBezierPoints(d14, d15);
                if (cornerBezierPoints3.length >= 20) {
                    Path.lineTo((float) (d13 - (cornerBezierPoints3[0] * d13)), (float) (d2 - (cornerBezierPoints3[1] * d13)));
                    Path.cubicTo((float) (d13 - (cornerBezierPoints3[2] * d13)), (float) (d2 - (cornerBezierPoints3[3] * d13)), (float) (d13 - (cornerBezierPoints3[4] * d13)), (float) (d2 - (cornerBezierPoints3[5] * d13)), (float) (d13 - (cornerBezierPoints3[6] * d13)), (float) (d2 - (cornerBezierPoints3[7] * d13)));
                    Path.cubicTo((float) (d13 - (cornerBezierPoints3[8] * d13)), (float) (d2 - (cornerBezierPoints3[9] * d13)), (float) (d13 - (cornerBezierPoints3[10] * d13)), (float) (d2 - (cornerBezierPoints3[11] * d13)), (float) (d13 - (cornerBezierPoints3[12] * d13)), (float) (d2 - (cornerBezierPoints3[13] * d13)));
                    Path.cubicTo((float) (d13 - (cornerBezierPoints3[14] * d13)), (float) (d2 - (cornerBezierPoints3[15] * d13)), (float) (d13 - (cornerBezierPoints3[16] * d13)), (float) (d2 - (cornerBezierPoints3[17] * d13)), (float) (d13 - (cornerBezierPoints3[18] * d13)), (float) (d2 - (cornerBezierPoints3[19] * d13)));
                    double d16 = f;
                    double d17 = (d4 - d16) / d16;
                    if (d17 < 0.0d) {
                        d17 = 0.0d;
                    }
                    if (d17 > 1.0d) {
                        d17 = 1.0d;
                    }
                    double d18 = (d6 - d16) / d16;
                    if (d18 < 0.0d) {
                        d18 = 0.0d;
                    }
                    double[] cornerBezierPoints4 = continuousCurvatureRoundedRectangleCornerBuilder.getCornerBezierPoints(d17, d18 > 1.0d ? 1.0d : d18);
                    if (cornerBezierPoints4.length >= 20) {
                        Path.lineTo((float) (d16 - (cornerBezierPoints4[18] * d16)), (float) ((cornerBezierPoints4[19] * d16) + 0.0d));
                        Path.cubicTo((float) (d16 - (cornerBezierPoints4[16] * d16)), (float) ((cornerBezierPoints4[17] * d16) + 0.0d), (float) (d16 - (cornerBezierPoints4[14] * d16)), (float) ((cornerBezierPoints4[15] * d16) + 0.0d), (float) (d16 - (cornerBezierPoints4[12] * d16)), (float) ((cornerBezierPoints4[13] * d16) + 0.0d));
                        Path.cubicTo((float) (d16 - (cornerBezierPoints4[10] * d16)), (float) ((cornerBezierPoints4[11] * d16) + 0.0d), (float) (d16 - (cornerBezierPoints4[8] * d16)), (float) ((cornerBezierPoints4[9] * d16) + 0.0d), (float) (d16 - (cornerBezierPoints4[6] * d16)), (float) ((cornerBezierPoints4[7] * d16) + 0.0d));
                        Path.cubicTo((float) (d16 - (cornerBezierPoints4[4] * d16)), (float) ((cornerBezierPoints4[5] * d16) + 0.0d), (float) (d16 - (cornerBezierPoints4[2] * d16)), (float) ((cornerBezierPoints4[3] * d16) + 0.0d), (float) (d16 - (cornerBezierPoints4[0] * d16)), (float) ((cornerBezierPoints4[1] * d16) + 0.0d));
                        Path.close();
                    }
                }
            }
        }
        return Path;
    }
}
