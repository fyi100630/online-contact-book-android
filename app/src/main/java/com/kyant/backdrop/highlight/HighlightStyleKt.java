package com.kyant.backdrop.highlight;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: HighlightStyle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"getCornerRadii", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shape", "Landroidx/compose/ui/graphics/Shape;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HighlightStyleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] getCornerRadii(DrawScope drawScope, Shape shape) {
        float fMo958toPxTmRCtEA;
        float fMo958toPxTmRCtEA2;
        float fMo958toPxTmRCtEA3;
        float fMo958toPxTmRCtEA4;
        long jMo4399getSizeNHjbRc = drawScope.mo4399getSizeNHjbRc();
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(jMo4399getSizeNHjbRc) / 2.0f;
        CornerBasedShape cornerBasedShape = shape instanceof CornerBasedShape ? (CornerBasedShape) shape : null;
        if (cornerBasedShape == null) {
            float[] fArr = new float[4];
            for (int i = 0; i < 4; i++) {
                fArr[i] = fM3670getMinDimensionimpl;
            }
            return fArr;
        }
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        if (z) {
            fMo958toPxTmRCtEA = cornerBasedShape.getTopStart().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        } else {
            fMo958toPxTmRCtEA = cornerBasedShape.getTopEnd().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        }
        if (z) {
            fMo958toPxTmRCtEA2 = cornerBasedShape.getTopEnd().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        } else {
            fMo958toPxTmRCtEA2 = cornerBasedShape.getTopStart().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        }
        if (z) {
            fMo958toPxTmRCtEA3 = cornerBasedShape.getBottomEnd().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        } else {
            fMo958toPxTmRCtEA3 = cornerBasedShape.getBottomStart().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        }
        if (z) {
            fMo958toPxTmRCtEA4 = cornerBasedShape.getBottomStart().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        } else {
            fMo958toPxTmRCtEA4 = cornerBasedShape.getBottomEnd().mo958toPxTmRCtEA(jMo4399getSizeNHjbRc, drawScope);
        }
        if (fMo958toPxTmRCtEA > fM3670getMinDimensionimpl) {
            fMo958toPxTmRCtEA = fM3670getMinDimensionimpl;
        }
        if (fMo958toPxTmRCtEA2 > fM3670getMinDimensionimpl) {
            fMo958toPxTmRCtEA2 = fM3670getMinDimensionimpl;
        }
        if (fMo958toPxTmRCtEA3 > fM3670getMinDimensionimpl) {
            fMo958toPxTmRCtEA3 = fM3670getMinDimensionimpl;
        }
        if (fMo958toPxTmRCtEA4 <= fM3670getMinDimensionimpl) {
            fM3670getMinDimensionimpl = fMo958toPxTmRCtEA4;
        }
        return new float[]{fMo958toPxTmRCtEA, fMo958toPxTmRCtEA2, fMo958toPxTmRCtEA3, fM3670getMinDimensionimpl};
    }
}
