package com.kyant.backdrop.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.kyant.backdrop.ShapeProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShadowModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0014\u0010\u001f\u001a\u00020\u001b*\u00020 2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/kyant/backdrop/shadow/ShadowNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "shapeProvider", "Lcom/kyant/backdrop/ShapeProvider;", "shadow", "Lkotlin/Function0;", "Lcom/kyant/backdrop/shadow/Shadow;", "<init>", "(Lcom/kyant/backdrop/ShapeProvider;Lkotlin/jvm/functions/Function0;)V", "getShapeProvider", "()Lcom/kyant/backdrop/ShapeProvider;", "setShapeProvider", "(Lcom/kyant/backdrop/ShapeProvider;)V", "getShadow", "()Lkotlin/jvm/functions/Function0;", "setShadow", "(Lkotlin/jvm/functions/Function0;)V", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "shadowLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "paint", "Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onAttach", "onDetach", "configurePaint", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShadowNode extends Modifier.Node implements DrawModifierNode {
    public static final int $stable = 8;
    private final Paint paint;
    private Function0<Shadow> shadow;
    private GraphicsLayer shadowLayer;
    private ShapeProvider shapeProvider;
    private final boolean shouldAutoInvalidate;

    public final ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public final void setShapeProvider(ShapeProvider shapeProvider) {
        Intrinsics.checkNotNullParameter(shapeProvider, "<set-?>");
        this.shapeProvider = shapeProvider;
    }

    public final Function0<Shadow> getShadow() {
        return this.shadow;
    }

    public final void setShadow(Function0<Shadow> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.shadow = function0;
    }

    public ShadowNode(ShapeProvider shapeProvider, Function0<Shadow> shadow) {
        Intrinsics.checkNotNullParameter(shapeProvider, "shapeProvider");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        this.shapeProvider = shapeProvider;
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        Shadow shadowInvoke = this.shadow.invoke();
        if (shadowInvoke == null) {
            contentDrawScope.drawContent();
            return;
        }
        GraphicsLayer graphicsLayer = this.shadowLayer;
        if (graphicsLayer != null) {
            try {
                long j = contentDrawScope.mo4399getSizeNHjbRc();
                ContentDrawScope contentDrawScope2 = contentDrawScope;
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                final float f = contentDrawScope.mo376toPx0680j_4(shadowInvoke.m6676getRadiusD9Ej5fM());
                final float f2 = contentDrawScope.mo376toPx0680j_4(DpOffset.m6363getXD9Ej5fM(shadowInvoke.m6675getOffsetRKDOV3M()));
                final float f3 = contentDrawScope.mo376toPx0680j_4(DpOffset.m6365getYD9Ej5fM(shadowInvoke.m6675getOffsetRKDOV3M()));
                float f4 = 4.0f * f;
                int iCeil = (int) Math.ceil(Size.m3671getWidthimpl(j) + f4 + f2);
                int iCeil2 = (int) Math.ceil(Size.m3668getHeightimpl(j) + f4 + f3);
                if (iCeil > 0 && iCeil2 > 0) {
                    long jIntSize = IntSizeKt.IntSize(iCeil, iCeil2);
                    final Outline outlineMo287createOutlinePq9zytI = this.shapeProvider.getShape().mo287createOutlinePq9zytI(j, layoutDirection, contentDrawScope2);
                    configurePaint(contentDrawScope, shadowInvoke);
                    graphicsLayer.setAlpha(shadowInvoke.getAlpha());
                    graphicsLayer.m4495setBlendModes9anfk8(shadowInvoke.m6673getBlendMode0nO6VwU());
                    contentDrawScope.mo4400recordJVtK1S4(graphicsLayer, jIntSize, new Function1() { // from class: com.kyant.backdrop.shadow.ShadowNode$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShadowNode.draw$lambda$1(f, f2, f3, outlineMo287createOutlinePq9zytI, this, (DrawScope) obj);
                        }
                    });
                    ContentDrawScope contentDrawScope3 = contentDrawScope;
                    float f5 = 2.0f * (-f);
                    contentDrawScope3.getDrawContext().getTransform().translate(f5, f5);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope3, graphicsLayer);
                        float f6 = -f5;
                        contentDrawScope3.getDrawContext().getTransform().translate(f6, f6);
                    } catch (Throwable th) {
                        float f7 = -f5;
                        contentDrawScope3.getDrawContext().getTransform().translate(f7, f7);
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer graphicsLayerCreateGraphicsLayer = DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer();
        graphicsLayerCreateGraphicsLayer.m4496setCompositingStrategyWpw9cng(CompositingStrategy.INSTANCE.m4481getOffscreenke2Ky5w());
        this.shadowLayer = graphicsLayerCreateGraphicsLayer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        GraphicsContext graphicsContextRequireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        GraphicsLayer graphicsLayer = this.shadowLayer;
        if (graphicsLayer != null) {
            graphicsContextRequireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
            this.shadowLayer = null;
        }
    }

    private final void configurePaint(DrawScope drawScope, Shadow shadow) {
        this.paint.mo3722setColor8_81llA(shadow.m6674getColor0d7_KjU());
        float f = drawScope.mo376toPx0680j_4(shadow.m6676getRadiusD9Ej5fM());
        this.paint.getInternalPaint().setMaskFilter(f > 0.0f ? new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draw$lambda$1(float f, float f2, float f3, Outline outline, ShadowNode shadowNode, DrawScope record) {
        Intrinsics.checkNotNullParameter(record, "$this$record");
        float f4 = f * 2.0f;
        float f5 = f4 + f2;
        float f6 = f4 + f3;
        record.getDrawContext().getTransform().translate(f5, f6);
        try {
            Canvas canvas = record.getDrawContext().getCanvas();
            OutlineKt.drawOutline(canvas, outline, shadowNode.paint);
            canvas.translate(-f2, -f3);
            OutlineKt.drawOutline(canvas, outline, ShadowModifierKt.ShadowMaskPaint);
            canvas.translate(f2, f3);
            return Unit.INSTANCE;
        } finally {
            record.getDrawContext().getTransform().translate(-f5, -f6);
        }
    }
}
