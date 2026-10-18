package com.kyant.shapes;

import kotlin.Metadata;

/* JADX INFO: compiled from: ContinuousCurvatureRoundedRectangleCornerBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"solveCubicSingle", "", "a", "b", "c", "d", "solveDepressedQuarticSingle", "p", "q", "r", "SQRT_2", "FRAC_PI_4", "FRAC_1_SQRT_2", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContinuousCurvatureRoundedRectangleCornerBuilderKt {
    private static final double FRAC_1_SQRT_2 = 0.7071067811865476d;
    private static final double FRAC_PI_4 = 0.7853981633974483d;
    private static final double SQRT_2 = 1.4142135623730951d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final double solveCubicSingle(double d, double d2, double d3, double d4) {
        double d5 = d * d;
        double d6 = (((d3 * 3.0d) / d) - ((d2 * d2) / d5)) / 3.0d;
        double d7 = ((((((d2 * 2.0d) * d2) * d2) / (d5 * d)) - (((9.0d * d2) * d3) / d5)) + ((d4 * 27.0d) / d)) / 27.0d;
        double dSqrt = Math.sqrt(((d7 * d7) / 4.0d) + (((d6 * d6) * d6) / 27.0d));
        double d8 = (-d7) / 2.0d;
        return (Math.cbrt(d8 + dSqrt) + Math.cbrt(d8 - dSqrt)) - (d2 / (d * 3.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double solveDepressedQuarticSingle(double d, double d2, double d3) {
        double d4 = (-d) / 2.0d;
        double d5 = -d3;
        double d6 = ((d5 * 3.0d) - (d4 * d4)) / 3.0d;
        double d7 = -d6;
        double dSqrt = ((Math.sqrt(d7 / 3.0d) * 2.0d) * Math.cos(Math.acos((-((((((d4 * 2.0d) * d4) * d4) - ((9.0d * d4) * d5)) + ((((d3 * d) / 2.0d) - ((d2 * d2) / 8.0d)) * 27.0d)) / 27.0d)) / (Math.sqrt(((d7 * d6) * d6) / 27.0d) * 2.0d)) / 3.0d)) - (d4 / 3.0d);
        double dSqrt2 = Math.sqrt((dSqrt * 2.0d) - d);
        return (dSqrt2 - Math.sqrt((dSqrt2 * dSqrt2) - ((dSqrt + (d2 / (dSqrt2 * 2.0d))) * 4.0d))) / 2.0d;
    }
}
