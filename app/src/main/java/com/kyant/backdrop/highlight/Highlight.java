package com.kyant.backdrop.highlight;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Highlight.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/kyant/backdrop/highlight/Highlight;", "", "width", "Landroidx/compose/ui/unit/Dp;", "blurRadius", "alpha", "", "style", "Lcom/kyant/backdrop/highlight/HighlightStyle;", "<init>", "(FFFLcom/kyant/backdrop/highlight/HighlightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", "F", "getBlurRadius-D9Ej5fM", "getAlpha", "getStyle", "()Lcom/kyant/backdrop/highlight/HighlightStyle;", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component4", "copy", "copy-i1RSzL4", "(FFFLcom/kyant/backdrop/highlight/HighlightStyle;)Lcom/kyant/backdrop/highlight/Highlight;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Highlight {
    public static final int $stable = 0;
    private static final Highlight Ambient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Highlight Default;
    private static final Highlight Plain;
    private final float alpha;
    private final float blurRadius;
    private final HighlightStyle style;
    private final float width;

    public /* synthetic */ Highlight(float f, float f2, float f3, HighlightStyle highlightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, highlightStyle);
    }

    /* JADX INFO: renamed from: copy-i1RSzL4$default, reason: not valid java name */
    public static /* synthetic */ Highlight m6640copyi1RSzL4$default(Highlight highlight, float f, float f2, float f3, HighlightStyle highlightStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            f = highlight.width;
        }
        if ((i & 2) != 0) {
            f2 = highlight.blurRadius;
        }
        if ((i & 4) != 0) {
            f3 = highlight.alpha;
        }
        if ((i & 8) != 0) {
            highlightStyle = highlight.style;
        }
        return highlight.m6643copyi1RSzL4(f, f2, f3, highlightStyle);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HighlightStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: copy-i1RSzL4, reason: not valid java name */
    public final Highlight m6643copyi1RSzL4(float width, float blurRadius, float alpha, HighlightStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new Highlight(width, blurRadius, alpha, style, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Highlight)) {
            return false;
        }
        Highlight highlight = (Highlight) other;
        return Dp.m6307equalsimpl0(this.width, highlight.width) && Dp.m6307equalsimpl0(this.blurRadius, highlight.blurRadius) && Float.compare(this.alpha, highlight.alpha) == 0 && Intrinsics.areEqual(this.style, highlight.style);
    }

    public int hashCode() {
        return (((((Dp.m6308hashCodeimpl(this.width) * 31) + Dp.m6308hashCodeimpl(this.blurRadius)) * 31) + Float.hashCode(this.alpha)) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "Highlight(width=" + Dp.m6313toStringimpl(this.width) + ", blurRadius=" + Dp.m6313toStringimpl(this.blurRadius) + ", alpha=" + this.alpha + ", style=" + this.style + ")";
    }

    private Highlight(float f, float f2, float f3, HighlightStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.width = f;
        this.blurRadius = f2;
        this.alpha = f3;
        this.style = style;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m6645getWidthD9Ej5fM() {
        return this.width;
    }

    /* JADX INFO: renamed from: getBlurRadius-D9Ej5fM, reason: not valid java name */
    public final float m6644getBlurRadiusD9Ej5fM() {
        return this.blurRadius;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final HighlightStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: compiled from: Highlight.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/kyant/backdrop/highlight/Highlight$Companion;", "", "<init>", "()V", "Default", "Lcom/kyant/backdrop/highlight/Highlight;", "getDefault$annotations", "getDefault", "()Lcom/kyant/backdrop/highlight/Highlight;", "Ambient", "getAmbient$annotations", "getAmbient", "Plain", "getPlain$annotations", "getPlain", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAmbient$annotations() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getPlain$annotations() {
        }

        private Companion() {
        }

        public final Highlight getDefault() {
            return Highlight.Default;
        }

        public final Highlight getAmbient() {
            return Highlight.Ambient;
        }

        public final Highlight getPlain() {
            return Highlight.Plain;
        }
    }

    static {
        float f = 0.0f;
        float f2 = 0.0f;
        Default = new Highlight(0.0f, f, f2, null, 15, null);
        float f3 = 0.0f;
        Ambient = new Highlight(f, f2, f3, HighlightStyle.INSTANCE.getAmbient(), 7, null);
        Plain = new Highlight(f2, f3, 0.0f, HighlightStyle.INSTANCE.getPlain(), 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Highlight(float f, float f2, float f3, HighlightStyle.Default r10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float fM6302constructorimpl = (i & 1) != 0 ? Dp.m6302constructorimpl(0.5f) : f;
        this(fM6302constructorimpl, (i & 2) != 0 ? Dp.m6302constructorimpl(fM6302constructorimpl / 2.0f) : f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? HighlightStyle.INSTANCE.getDefault() : r10, null);
    }
}
