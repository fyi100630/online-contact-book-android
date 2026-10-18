package com.kyant.shapes;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContinuousCurvatureRoundedRectangleCornerBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\u0010\u0013\n\u0002\b\n\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003J\u001c\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0002J\u0012\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0002J\u001c\u0010 \u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019¨\u0006\""}, d2 = {"Lcom/kyant/shapes/ContinuousCurvatureRoundedRectangleCornerBuilder;", "", "extendedFraction", "", "arcFraction", "<init>", "(DD)V", "getExtendedFraction", "()D", "getArcFraction", "theta", "cos", "sin", "cot", "cos2", "sin2", "cos3", "sin3", "k0", "k1", "k2", "k3", "cache", "", "", "[[[D", "getCornerBezierPoints", "tH", "tV", "buildCornerBezierPoints", "buildEvenCornerBezierPoints", "t", "buildUnevenCornerBezierPoints", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContinuousCurvatureRoundedRectangleCornerBuilder {
    private final double arcFraction;
    private final double[][][] cache;
    private final double cos;
    private final double cos2;
    private final double cos3;
    private final double cot;
    private final double extendedFraction;
    private final double k0;
    private final double k1;
    private final double k2;
    private final double k3;
    private final double sin;
    private final double sin2;
    private final double sin3;
    private final double theta;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ContinuousCurvatureRoundedRectangleCornerBuilder Default = new ContinuousCurvatureRoundedRectangleCornerBuilder(0.0d, 0.0d, 3, null);

    public ContinuousCurvatureRoundedRectangleCornerBuilder() {
        this(0.0d, 0.0d, 3, null);
    }

    public ContinuousCurvatureRoundedRectangleCornerBuilder(double d, double d2) {
        this.extendedFraction = d;
        this.arcFraction = d2;
        double d3 = (1.0d - d2) * 0.7853981633974483d;
        this.theta = d3;
        double dCos = Math.cos(d3);
        this.cos = dCos;
        double dSin = Math.sin(d3);
        this.sin = dSin;
        double dTan = 1.0d / Math.tan(d3);
        this.cot = dTan;
        double d4 = dCos * dCos;
        this.cos2 = d4;
        double d5 = dSin * dSin;
        this.sin2 = d5;
        double d6 = d4 * dCos;
        this.cos3 = d6;
        double d7 = d5 * dSin;
        this.sin3 = d7;
        this.k0 = ((((1.4142135623730951d - (6.0d * dCos)) + (8.485281374238571d * d4)) - (d6 * 4.0d)) * 27.0d * dTan) + (dSin * 2.0d * ((((((1.4142135623730951d - (dSin * 2.0d)) * 2.0d) * d7) - 9.0d) + ((2.8284271247461903d * dCos) * (d5 + 9.0d))) - ((d4 * 2.0d) * ((2.0d * d5) + 9.0d))));
        this.k1 = (((((1.6568542494923806d * dCos) - 0.5857864376269049d) + (d4 * (-1.1715728752538097d))) * (-81.0d)) * dTan) - ((4.0d * dSin) * (((d7 * 1.4142135623730951d) + 3.727922061357857d) + (((-0.5857864376269049d) * dCos) * (d5 + 9.0d))));
        this.k2 = ((((dCos * (-0.3431457505076194d)) + 0.24264068711928566d) * 9.0d * dTan) + (dSin * (-0.3431457505076194d))) * 9.0d;
        this.k3 = dTan * 2.7136367114850355d;
        this.cache = new double[][][]{new double[][]{buildEvenCornerBezierPoints(0.0d), buildUnevenCornerBezierPoints(0.0d, 1.0d)}, new double[][]{buildUnevenCornerBezierPoints(1.0d, 0.0d), buildEvenCornerBezierPoints(1.0d)}};
    }

    public /* synthetic */ ContinuousCurvatureRoundedRectangleCornerBuilder(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.6666666666666666d : d, (i & 2) != 0 ? 0.5d : d2);
    }

    public final double getExtendedFraction() {
        return this.extendedFraction;
    }

    public final double getArcFraction() {
        return this.arcFraction;
    }

    public static /* synthetic */ double[] getCornerBezierPoints$default(ContinuousCurvatureRoundedRectangleCornerBuilder continuousCurvatureRoundedRectangleCornerBuilder, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 1.0d;
        }
        if ((i & 2) != 0) {
            d2 = 1.0d;
        }
        return continuousCurvatureRoundedRectangleCornerBuilder.getCornerBezierPoints(d, d2);
    }

    public final double[] getCornerBezierPoints(double tH, double tV) {
        char c;
        char c2 = 1;
        if (tH == 0.0d) {
            c = 0;
        } else {
            if (tH != 1.0d) {
                return buildCornerBezierPoints(tH, tV);
            }
            c = 1;
        }
        if (tV == 0.0d) {
            c2 = 0;
        } else if (tV != 1.0d) {
            return buildCornerBezierPoints(tH, tV);
        }
        return this.cache[c][c2];
    }

    static /* synthetic */ double[] buildCornerBezierPoints$default(ContinuousCurvatureRoundedRectangleCornerBuilder continuousCurvatureRoundedRectangleCornerBuilder, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 1.0d;
        }
        if ((i & 2) != 0) {
            d2 = 1.0d;
        }
        return continuousCurvatureRoundedRectangleCornerBuilder.buildCornerBezierPoints(d, d2);
    }

    private final double[] buildCornerBezierPoints(double tH, double tV) {
        if (tH == tV) {
            return buildEvenCornerBezierPoints(tH);
        }
        return buildUnevenCornerBezierPoints(tH, tV);
    }

    static /* synthetic */ double[] buildEvenCornerBezierPoints$default(ContinuousCurvatureRoundedRectangleCornerBuilder continuousCurvatureRoundedRectangleCornerBuilder, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 1.0d;
        }
        return continuousCurvatureRoundedRectangleCornerBuilder.buildEvenCornerBezierPoints(d);
    }

    private final double[] buildEvenCornerBezierPoints(double t) {
        double d = -(this.extendedFraction * t);
        double dSolveCubicSingle = ContinuousCurvatureRoundedRectangleCornerBuilderKt.solveCubicSingle(this.k3, this.k2, this.k1 + (8.0d * d * this.sin3 * this.sin), this.k0);
        double d2 = this.sin;
        double d3 = (((-0.7071067811865476d) + d2) / dSolveCubicSingle) + 0.7071067811865476d;
        double d4 = this.cos;
        double d5 = ((0.7071067811865476d - d4) / dSolveCubicSingle) + 0.2928932188134524d;
        double d6 = d3 - (this.cot * d5);
        double d7 = dSolveCubicSingle * 1.5d;
        double d8 = d6 - (((d7 * d5) * d5) / this.sin3);
        double d9 = 1.0d - d5;
        double d10 = 1.0d - d3;
        double d11 = 1.0d - d8;
        double d12 = 1.0d - d;
        double d13 = this.cos2 - this.sin2;
        double dSqrt = ((-d13) + Math.sqrt((d13 * d13) - ((4.0d * d7) * (-((d4 * (d10 - d5)) - (d2 * (d9 - d3))))))) / (d7 * 2.0d);
        double d14 = this.cos;
        double d15 = this.sin;
        return new double[]{d, 0.0d, d8, 0.0d, d6, 0.0d, d3, d5, (dSqrt * d14) + d3, d5 + (dSqrt * d15), d9 - (d15 * dSqrt), d10 - (dSqrt * d14), d9, d10, 1.0d, 1.0d - d6, 1.0d, d11, 1.0d, d12};
    }

    static /* synthetic */ double[] buildUnevenCornerBezierPoints$default(ContinuousCurvatureRoundedRectangleCornerBuilder continuousCurvatureRoundedRectangleCornerBuilder, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 1.0d;
        }
        if ((i & 2) != 0) {
            d2 = 1.0d;
        }
        return continuousCurvatureRoundedRectangleCornerBuilder.buildUnevenCornerBezierPoints(d, d2);
    }

    private final double[] buildUnevenCornerBezierPoints(double tH, double tV) {
        double d = this.extendedFraction;
        double d2 = -(d * tH);
        double dSolveCubicSingle = ContinuousCurvatureRoundedRectangleCornerBuilderKt.solveCubicSingle(this.k3, this.k2, this.k1 + (d2 * 8.0d * this.sin3 * this.sin), this.k0);
        double d3 = -(d * tV);
        double dSolveCubicSingle2 = ContinuousCurvatureRoundedRectangleCornerBuilderKt.solveCubicSingle(this.k3, this.k2, this.k1 + (d3 * 8.0d * this.sin3 * this.sin), this.k0);
        double d4 = this.sin;
        double d5 = ((d4 - 0.7071067811865476d) / dSolveCubicSingle) + 0.7071067811865476d;
        double d6 = this.cos;
        double d7 = ((0.7071067811865476d - d6) / dSolveCubicSingle) + 0.2928932188134524d;
        double d8 = this.cot;
        double d9 = d5 - (d7 * d8);
        double d10 = dSolveCubicSingle * 1.5d;
        double d11 = this.sin3;
        double d12 = d9 - (((d10 * d7) * d7) / d11);
        double d13 = ((d4 - 0.7071067811865476d) / dSolveCubicSingle2) + 0.7071067811865476d;
        double d14 = ((0.7071067811865476d - d6) / dSolveCubicSingle2) + 0.2928932188134524d;
        double d15 = d13 - (d8 * d14);
        double d16 = dSolveCubicSingle2 * 1.5d;
        double d17 = d15 - (((d16 * d14) * d14) / d11);
        double d18 = 1.0d - d14;
        double d19 = 1.0d - d13;
        double d20 = 1.0d - d17;
        double d21 = 1.0d - d3;
        double d22 = this.cos2 - this.sin2;
        double d23 = d18 - d5;
        double d24 = d19 - d7;
        double d25 = -((d6 * d24) - (d4 * d23));
        double d26 = (d4 * d24) - (d6 * d23);
        double d27 = d10 * d16 * d16;
        double dSolveDepressedQuarticSingle = ContinuousCurvatureRoundedRectangleCornerBuilderKt.solveDepressedQuarticSingle((d26 / d16) * 2.0d, ((d22 * d22) * d22) / d27, (((d10 * d26) * d26) + ((d25 * d22) * d22)) / d27);
        double d28 = ((-d26) - ((d16 * dSolveDepressedQuarticSingle) * dSolveDepressedQuarticSingle)) / d22;
        double d29 = this.cos;
        double d30 = this.sin;
        return new double[]{d2, 0.0d, d12, 0.0d, d9, 0.0d, d5, d7, (d28 * d29) + d5, (d28 * d30) + d7, d18 - (d30 * dSolveDepressedQuarticSingle), d19 - (d29 * dSolveDepressedQuarticSingle), d18, d19, 1.0d, 1.0d - d15, 1.0d, d20, 1.0d, d21};
    }

    /* JADX INFO: compiled from: ContinuousCurvatureRoundedRectangleCornerBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kyant/shapes/ContinuousCurvatureRoundedRectangleCornerBuilder$Companion;", "", "<init>", "()V", "Default", "Lcom/kyant/shapes/ContinuousCurvatureRoundedRectangleCornerBuilder;", "getDefault", "()Lcom/kyant/shapes/ContinuousCurvatureRoundedRectangleCornerBuilder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContinuousCurvatureRoundedRectangleCornerBuilder getDefault() {
            return ContinuousCurvatureRoundedRectangleCornerBuilder.Default;
        }
    }
}
