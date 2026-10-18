package com.kyant.shapes;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Lerp.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\b"}, d2 = {"lerp", "Lcom/kyant/shapes/RoundedRectangularShape;", "start", "stop", "fraction", "", "style", "Lcom/kyant/shapes/RoundedCornerStyle;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LerpKt {
    public static final RoundedRectangularShape lerp(RoundedRectangularShape start, RoundedRectangularShape stop, float f, RoundedCornerStyle style) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        Intrinsics.checkNotNullParameter(style, "style");
        if (f == 0.0f) {
            return start;
        }
        return f == 1.0f ? stop : new LerpRoundedRectangle(start, stop, f, style);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    public static final RoundedRectangularShape lerp(RoundedRectangularShape start, RoundedRectangularShape stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        if (f == 0.0f) {
            return start;
        }
        if (f == 1.0f) {
            return stop;
        }
        RoundedCornerStyle style = start.getStyle();
        RoundedCornerStyle style2 = stop.getStyle();
        if (style == null || style2 == null) {
            if (style == null) {
                if (style2 == null) {
                    style = null;
                } else {
                    style = style2;
                }
            }
        } else if (f >= 0.5f) {
            style = style2;
        }
        return new LerpRoundedRectangle(start, stop, f, style);
    }
}
