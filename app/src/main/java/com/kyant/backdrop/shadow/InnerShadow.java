package com.kyant.backdrop.shadow;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: InnerShadow.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\u0017JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/kyant/backdrop/shadow/InnerShadow;", "", "radius", "Landroidx/compose/ui/unit/Dp;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "color", "Landroidx/compose/ui/graphics/Color;", "alpha", "", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "<init>", "(FJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRadius-D9Ej5fM", "()F", "F", "getOffset-RKDOV3M", "()J", "J", "getColor-0d7_KjU", "getAlpha", "getBlendMode-0nO6VwU", "()I", "I", "component1", "component1-D9Ej5fM", "component2", "component2-RKDOV3M", "component3", "component3-0d7_KjU", "component4", "component5", "component5-0nO6VwU", "copy", "copy-Qp58iTY", "(FJJFI)Lcom/kyant/backdrop/shadow/InnerShadow;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InnerShadow {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InnerShadow Default = new InnerShadow(0.0f, 0, 0, 0.0f, 0, 31, null);
    private final float alpha;
    private final int blendMode;
    private final long color;
    private final long offset;
    private final float radius;

    public /* synthetic */ InnerShadow(float f, long j, long j2, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, j2, f2, i);
    }

    /* JADX INFO: renamed from: copy-Qp58iTY$default, reason: not valid java name */
    public static /* synthetic */ InnerShadow m6656copyQp58iTY$default(InnerShadow innerShadow, float f, long j, long j2, float f2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = innerShadow.radius;
        }
        if ((i2 & 2) != 0) {
            j = innerShadow.offset;
        }
        if ((i2 & 4) != 0) {
            j2 = innerShadow.color;
        }
        if ((i2 & 8) != 0) {
            f2 = innerShadow.alpha;
        }
        if ((i2 & 16) != 0) {
            i = innerShadow.blendMode;
        }
        long j3 = j2;
        return innerShadow.m6661copyQp58iTY(f, j, j3, f2, i);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component2-RKDOV3M, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component5-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: copy-Qp58iTY, reason: not valid java name */
    public final InnerShadow m6661copyQp58iTY(float radius, long offset, long color, float alpha, int blendMode) {
        return new InnerShadow(radius, offset, color, alpha, blendMode, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InnerShadow)) {
            return false;
        }
        InnerShadow innerShadow = (InnerShadow) other;
        return Dp.m6307equalsimpl0(this.radius, innerShadow.radius) && DpOffset.m6362equalsimpl0(this.offset, innerShadow.offset) && Color.m3844equalsimpl0(this.color, innerShadow.color) && Float.compare(this.alpha, innerShadow.alpha) == 0 && BlendMode.m3754equalsimpl0(this.blendMode, innerShadow.blendMode);
    }

    public int hashCode() {
        return (((((((Dp.m6308hashCodeimpl(this.radius) * 31) + DpOffset.m6367hashCodeimpl(this.offset)) * 31) + Color.m3850hashCodeimpl(this.color)) * 31) + Float.hashCode(this.alpha)) * 31) + BlendMode.m3755hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "InnerShadow(radius=" + Dp.m6313toStringimpl(this.radius) + ", offset=" + DpOffset.m6370toStringimpl(this.offset) + ", color=" + Color.m3851toStringimpl(this.color) + ", alpha=" + this.alpha + ", blendMode=" + BlendMode.m3756toStringimpl(this.blendMode) + ")";
    }

    private InnerShadow(float f, long j, long j2, float f2, int i) {
        this.radius = f;
        this.offset = j;
        this.color = j2;
        this.alpha = f2;
        this.blendMode = i;
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final float m6665getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getOffset-RKDOV3M, reason: not valid java name */
    public final long m6664getOffsetRKDOV3M() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6663getColor0d7_KjU() {
        return this.color;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6662getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* JADX INFO: compiled from: InnerShadow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kyant/backdrop/shadow/InnerShadow$Companion;", "", "<init>", "()V", "Default", "Lcom/kyant/backdrop/shadow/InnerShadow;", "getDefault$annotations", "getDefault", "()Lcom/kyant/backdrop/shadow/InnerShadow;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        private Companion() {
        }

        public final InnerShadow getDefault() {
            return InnerShadow.Default;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InnerShadow(float f, long j, long j2, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        float fM6302constructorimpl = (i2 & 1) != 0 ? Dp.m6302constructorimpl(24.0f) : f;
        this(fM6302constructorimpl, (i2 & 2) != 0 ? DpKt.m6323DpOffsetYgX7TsA(Dp.m6302constructorimpl(0.0f), fM6302constructorimpl) : j, (i2 & 4) != 0 ? Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null) : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? DrawScope.INSTANCE.m4401getDefaultBlendMode0nO6VwU() : i, null);
    }
}
