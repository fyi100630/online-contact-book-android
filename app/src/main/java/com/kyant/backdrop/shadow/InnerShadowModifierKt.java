package com.kyant.backdrop.shadow;

import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Paint;
import kotlin.Metadata;

/* JADX INFO: compiled from: InnerShadowModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"ShadowMaskPaint", "Landroidx/compose/ui/graphics/Paint;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InnerShadowModifierKt {
    private static final Paint ShadowMaskPaint;

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo3721setBlendModes9anfk8(BlendMode.INSTANCE.m3758getClear0nO6VwU());
        ShadowMaskPaint = Paint;
    }
}
