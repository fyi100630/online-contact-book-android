package com.kyant.backdrop.effects;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.LayoutDirection;
import com.kyant.backdrop.BackdropEffectScope;
import com.kyant.backdrop.ShadersKt;
import com.kyant.shapes.RoundedRectangularShape;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Lens.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\b\u0010\r\u001a\u00020\u000eH\u0002\"\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"lens", "", "Lcom/kyant/backdrop/BackdropEffectScope;", "refractionHeight", "", "refractionAmount", "depthEffect", "", "chromaticAberration", "cornerRadii", "", "getCornerRadii", "(Lcom/kyant/backdrop/BackdropEffectScope;)[F", "throwUnsupportedSDFException", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LensKt {
    public static /* synthetic */ void lens$default(BackdropEffectScope backdropEffectScope, float f, float f2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        lens(backdropEffectScope, f, f2, z, z2);
    }

    public static final void lens(BackdropEffectScope backdropEffectScope, float f, float f2, boolean z, boolean z2) {
        RenderEffect renderEffectCreateRuntimeShaderEffect;
        RuntimeShader runtimeShaderObtainRuntimeShader;
        Intrinsics.checkNotNullParameter(backdropEffectScope, "<this>");
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        if (backdropEffectScope.getPadding() > 0.0f) {
            float padding = backdropEffectScope.getPadding() - f;
            if (padding < 0.0f) {
                padding = 0.0f;
            }
            backdropEffectScope.setPadding(padding);
        }
        float[] cornerRadii = getCornerRadii(backdropEffectScope);
        try {
            if (cornerRadii != null) {
                if (!z2) {
                    runtimeShaderObtainRuntimeShader = backdropEffectScope.obtainRuntimeShader("Refraction", ShadersKt.RoundedRectRefractionShaderString);
                } else {
                    runtimeShaderObtainRuntimeShader = backdropEffectScope.obtainRuntimeShader("RefractionWithDispersion", ShadersKt.getRoundedRectRefractionWithDispersionShaderString());
                }
                runtimeShaderObtainRuntimeShader.setFloatUniform(ContentDisposition.Parameters.Size, Size.m3671getWidthimpl(backdropEffectScope.mo6623getSizeNHjbRc()), Size.m3668getHeightimpl(backdropEffectScope.mo6623getSizeNHjbRc()));
                runtimeShaderObtainRuntimeShader.setFloatUniform("offset", -backdropEffectScope.getPadding(), -backdropEffectScope.getPadding());
                runtimeShaderObtainRuntimeShader.setFloatUniform("cornerRadii", cornerRadii);
                runtimeShaderObtainRuntimeShader.setFloatUniform("refractionHeight", f);
                runtimeShaderObtainRuntimeShader.setFloatUniform("refractionAmount", -f2);
                runtimeShaderObtainRuntimeShader.setFloatUniform("depthEffect", z ? 1.0f : 0.0f);
                if (z2) {
                    runtimeShaderObtainRuntimeShader.setFloatUniform("chromaticAberration", 1.0f);
                }
                renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderObtainRuntimeShader, "content");
            } else {
                renderEffectCreateRuntimeShaderEffect = null;
            }
            if (renderEffectCreateRuntimeShaderEffect != null) {
                RenderEffectKt.effect(backdropEffectScope, renderEffectCreateRuntimeShaderEffect);
            }
        } catch (Throwable unused) {
        }
    }

    private static final float[] getCornerRadii(BackdropEffectScope backdropEffectScope) {
        float fMo958toPxTmRCtEA;
        float fMo958toPxTmRCtEA2;
        float fMo958toPxTmRCtEA3;
        float fMo958toPxTmRCtEA4;
        Shape shape = backdropEffectScope.getShape();
        if (shape instanceof RoundedRectangularShape) {
            RoundedRectangularShape.Corners cornersMo6678cornersPq9zytI = ((RoundedRectangularShape) shape).mo6678cornersPq9zytI(backdropEffectScope.mo6623getSizeNHjbRc(), backdropEffectScope.getLayoutDirection(), backdropEffectScope);
            return new float[]{cornersMo6678cornersPq9zytI.getTopLeft(), cornersMo6678cornersPq9zytI.getTopRight(), cornersMo6678cornersPq9zytI.getBottomRight(), cornersMo6678cornersPq9zytI.getBottomLeft()};
        }
        if (shape instanceof AbsoluteRoundedCornerShape) {
            long jMo6623getSizeNHjbRc = backdropEffectScope.mo6623getSizeNHjbRc();
            float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(jMo6623getSizeNHjbRc) / 2.0f;
            AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) shape;
            BackdropEffectScope backdropEffectScope2 = backdropEffectScope;
            float fMo958toPxTmRCtEA5 = absoluteRoundedCornerShape.getTopStart().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc, backdropEffectScope2);
            float fMo958toPxTmRCtEA6 = absoluteRoundedCornerShape.getTopEnd().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc, backdropEffectScope2);
            float fMo958toPxTmRCtEA7 = absoluteRoundedCornerShape.getBottomEnd().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc, backdropEffectScope2);
            float fMo958toPxTmRCtEA8 = absoluteRoundedCornerShape.getBottomStart().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc, backdropEffectScope2);
            if (fMo958toPxTmRCtEA5 > fM3670getMinDimensionimpl) {
                fMo958toPxTmRCtEA5 = fM3670getMinDimensionimpl;
            }
            if (fMo958toPxTmRCtEA6 > fM3670getMinDimensionimpl) {
                fMo958toPxTmRCtEA6 = fM3670getMinDimensionimpl;
            }
            if (fMo958toPxTmRCtEA7 > fM3670getMinDimensionimpl) {
                fMo958toPxTmRCtEA7 = fM3670getMinDimensionimpl;
            }
            if (fMo958toPxTmRCtEA8 <= fM3670getMinDimensionimpl) {
                fM3670getMinDimensionimpl = fMo958toPxTmRCtEA8;
            }
            return new float[]{fMo958toPxTmRCtEA5, fMo958toPxTmRCtEA6, fMo958toPxTmRCtEA7, fM3670getMinDimensionimpl};
        }
        if (!(shape instanceof CornerBasedShape)) {
            return null;
        }
        long jMo6623getSizeNHjbRc2 = backdropEffectScope.mo6623getSizeNHjbRc();
        float fM3670getMinDimensionimpl2 = Size.m3670getMinDimensionimpl(jMo6623getSizeNHjbRc2) / 2.0f;
        boolean z = backdropEffectScope.getLayoutDirection() == LayoutDirection.Ltr;
        if (z) {
            fMo958toPxTmRCtEA = ((CornerBasedShape) shape).getTopStart().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        } else {
            fMo958toPxTmRCtEA = ((CornerBasedShape) shape).getTopEnd().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        }
        if (z) {
            fMo958toPxTmRCtEA2 = ((CornerBasedShape) shape).getTopEnd().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        } else {
            fMo958toPxTmRCtEA2 = ((CornerBasedShape) shape).getTopStart().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        }
        if (z) {
            fMo958toPxTmRCtEA3 = ((CornerBasedShape) shape).getBottomEnd().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        } else {
            fMo958toPxTmRCtEA3 = ((CornerBasedShape) shape).getBottomStart().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        }
        if (z) {
            fMo958toPxTmRCtEA4 = ((CornerBasedShape) shape).getBottomStart().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        } else {
            fMo958toPxTmRCtEA4 = ((CornerBasedShape) shape).getBottomEnd().mo958toPxTmRCtEA(jMo6623getSizeNHjbRc2, backdropEffectScope);
        }
        if (fMo958toPxTmRCtEA > fM3670getMinDimensionimpl2) {
            fMo958toPxTmRCtEA = fM3670getMinDimensionimpl2;
        }
        if (fMo958toPxTmRCtEA2 > fM3670getMinDimensionimpl2) {
            fMo958toPxTmRCtEA2 = fM3670getMinDimensionimpl2;
        }
        if (fMo958toPxTmRCtEA3 > fM3670getMinDimensionimpl2) {
            fMo958toPxTmRCtEA3 = fM3670getMinDimensionimpl2;
        }
        if (fMo958toPxTmRCtEA4 <= fM3670getMinDimensionimpl2) {
            fM3670getMinDimensionimpl2 = fMo958toPxTmRCtEA4;
        }
        return new float[]{fMo958toPxTmRCtEA, fMo958toPxTmRCtEA2, fMo958toPxTmRCtEA3, fM3670getMinDimensionimpl2};
    }

    private static final Void throwUnsupportedSDFException() {
        throw new UnsupportedOperationException("Only RoundedRectangularShape or CornerBasedShape is supported in lens effects.");
    }
}
