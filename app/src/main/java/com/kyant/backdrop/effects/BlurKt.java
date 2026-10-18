package com.kyant.backdrop.effects;

import android.graphics.RenderEffect;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.graphics.TileMode;
import com.kyant.backdrop.BackdropEffectScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"blur", "", "Lcom/kyant/backdrop/BackdropEffectScope;", "radius", "", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "blur-3YTHUZs", "(Lcom/kyant/backdrop/BackdropEffectScope;FI)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BlurKt {
    /* JADX INFO: renamed from: blur-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ void m6639blur3YTHUZs$default(BackdropEffectScope backdropEffectScope, float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = TileMode.INSTANCE.m4216getClamp3opZhB0();
        }
        m6638blur3YTHUZs(backdropEffectScope, f, i);
    }

    /* JADX INFO: renamed from: blur-3YTHUZs, reason: not valid java name */
    public static final void m6638blur3YTHUZs(BackdropEffectScope blur, float f, int i) {
        RenderEffect renderEffectCreateBlurEffect;
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        if (Build.VERSION.SDK_INT >= 31 && f > 0.0f) {
            if ((!TileMode.m4212equalsimpl0(i, TileMode.INSTANCE.m4216getClamp3opZhB0()) || blur.getRenderEffect() != null) && f > blur.getPadding()) {
                blur.setPadding(f);
            }
            RenderEffect renderEffect = blur.getRenderEffect();
            if (renderEffect != null) {
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, renderEffect, AndroidTileMode_androidKt.m3748toAndroidTileMode0vamqd0(i));
            } else {
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, AndroidTileMode_androidKt.m3748toAndroidTileMode0vamqd0(i));
            }
            blur.setRenderEffect(renderEffectCreateBlurEffect);
        }
    }
}
