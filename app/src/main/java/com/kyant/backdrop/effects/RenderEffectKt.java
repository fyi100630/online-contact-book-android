package com.kyant.backdrop.effects;

import android.graphics.RenderEffect;
import android.os.Build;
import com.kyant.backdrop.BackdropEffectScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RenderEffect.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"effect", "", "Lcom/kyant/backdrop/BackdropEffectScope;", "Landroid/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RenderEffectKt {
    public static final void effect(BackdropEffectScope backdropEffectScope, RenderEffect effect) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        RenderEffect renderEffect = backdropEffectScope.getRenderEffect();
        if (renderEffect != null) {
            effect = RenderEffect.createChainEffect(effect, renderEffect);
        }
        backdropEffectScope.setRenderEffect(effect);
    }

    public static final void effect(BackdropEffectScope backdropEffectScope, androidx.compose.ui.graphics.RenderEffect effect) {
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        effect(backdropEffectScope, effect.asAndroidRenderEffect());
    }
}
