package com.kyant.backdrop.effects;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import com.kyant.backdrop.BackdropEffectScope;
import com.kyant.backdrop.ShadersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u001a(\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007\u001a&\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"colorFilter", "", "Lcom/kyant/backdrop/BackdropEffectScope;", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "opacity", "alpha", "", "colorControls", "brightness", "contrast", "saturation", "vibrancy", "VibrantColorFilter", "exposureAdjustment", "ev", "gammaAdjustment", "power", "colorControlsColorFilter", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ColorFilterKt {
    private static final ColorFilter VibrantColorFilter = colorControlsColorFilter$default(0.0f, 0.0f, 1.5f, 3, null);

    public static final void colorFilter(BackdropEffectScope backdropEffectScope, ColorFilter colorFilter) {
        RenderEffect renderEffectCreateColorFilterEffect;
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        RenderEffect renderEffect = backdropEffectScope.getRenderEffect();
        if (renderEffect != null) {
            renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(colorFilter, renderEffect);
        } else {
            renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(colorFilter);
        }
        backdropEffectScope.setRenderEffect(renderEffectCreateColorFilterEffect);
    }

    public static final void colorFilter(BackdropEffectScope backdropEffectScope, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        colorFilter(backdropEffectScope, AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
    }

    public static final void opacity(BackdropEffectScope backdropEffectScope, float f) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        colorFilter(backdropEffectScope, new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f})));
    }

    public static /* synthetic */ void colorControls$default(BackdropEffectScope backdropEffectScope, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        colorControls(backdropEffectScope, f, f2, f3);
    }

    public static final void colorControls(BackdropEffectScope backdropEffectScope, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        if (f == 0.0f && f2 == 1.0f && f3 == 1.0f) {
            return;
        }
        colorFilter(backdropEffectScope, colorControlsColorFilter(f, f2, f3));
    }

    public static final void vibrancy(BackdropEffectScope backdropEffectScope) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        colorFilter(backdropEffectScope, VibrantColorFilter);
    }

    public static final void exposureAdjustment(BackdropEffectScope backdropEffectScope, float f) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        float fPow = (float) Math.pow(2.0f, f / 2.2f);
        colorFilter(backdropEffectScope, new ColorMatrixColorFilter(new ColorMatrix(new float[]{fPow, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fPow, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fPow, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
    }

    public static final void gammaAdjustment(BackdropEffectScope backdropEffectScope, float f) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        RuntimeShader runtimeShaderObtainRuntimeShader = backdropEffectScope.obtainRuntimeShader("GammaAdjustment", ShadersKt.GammaAdjustmentShaderString);
        runtimeShaderObtainRuntimeShader.setFloatUniform("power", f);
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderObtainRuntimeShader, "content");
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateRuntimeShaderEffect, "createRuntimeShaderEffect(...)");
        RenderEffectKt.effect(backdropEffectScope, renderEffectCreateRuntimeShaderEffect);
    }

    static /* synthetic */ ColorFilter colorControlsColorFilter$default(float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        return colorControlsColorFilter(f, f2, f3);
    }

    private static final ColorFilter colorControlsColorFilter(float f, float f2, float f3) {
        float f4 = 1.0f - f3;
        float f5 = ((0.5f - (f2 * 0.5f)) + f) * 255.0f;
        float f6 = 0.213f * f4 * f2;
        float f7 = 0.715f * f4 * f2;
        float f8 = f4 * 0.072f * f2;
        float f9 = f2 * f3;
        return new ColorMatrixColorFilter(new ColorMatrix(new float[]{f6 + f9, f7, f8, 0.0f, f5, f6, f7 + f9, f8, 0.0f, f5, f6, f7, f9 + f8, 0.0f, f5, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }
}
