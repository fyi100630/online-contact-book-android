package com.kyant.backdrop.shadow;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.kyant.backdrop.OutlineKt;
import com.kyant.backdrop.ShapeProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InnerShadowModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u001e\u001a\u00020\u001f*\u00020 H\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0014\u0010#\u001a\u00020\u001f*\u00020$2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002J\u001c\u0010%\u001a\u00020\u001f*\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0017H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/kyant/backdrop/shadow/InnerShadowNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "shapeProvider", "Lcom/kyant/backdrop/ShapeProvider;", "shadow", "Lkotlin/Function0;", "Lcom/kyant/backdrop/shadow/InnerShadow;", "<init>", "(Lcom/kyant/backdrop/ShapeProvider;Lkotlin/jvm/functions/Function0;)V", "getShapeProvider", "()Lcom/kyant/backdrop/ShapeProvider;", "setShapeProvider", "(Lcom/kyant/backdrop/ShapeProvider;)V", "getShadow", "()Lkotlin/jvm/functions/Function0;", "setShadow", "(Lkotlin/jvm/functions/Function0;)V", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "shadowLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "paint", "Landroidx/compose/ui/graphics/Paint;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "prevRadius", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onAttach", "onDetach", "configurePaint", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawMaskedShadow", "outline", "Landroidx/compose/ui/graphics/Outline;", "layer", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InnerShadowNode extends Modifier.Node implements DrawModifierNode {
    public static final int $stable = 8;
    private Path clipPath;
    private final Paint paint;
    private float prevRadius;
    private Function0<InnerShadow> shadow;
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

    public final Function0<InnerShadow> getShadow() {
        return this.shadow;
    }

    public final void setShadow(Function0<InnerShadow> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.shadow = function0;
    }

    public InnerShadowNode(ShapeProvider shapeProvider, Function0<InnerShadow> shadow) {
        Intrinsics.checkNotNullParameter(shapeProvider, "shapeProvider");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        this.shapeProvider = shapeProvider;
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
        this.prevRadius = Float.NaN;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        InnerShadow innerShadowInvoke;
        GraphicsLayer graphicsLayer;
        final Path path;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        contentDrawScope.drawContent();
        if (Build.VERSION.SDK_INT < 31 || (innerShadowInvoke = this.shadow.invoke()) == null || (graphicsLayer = this.shadowLayer) == null) {
            return;
        }
        try {
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            float f = contentDrawScope.mo376toPx0680j_4(innerShadowInvoke.m6665getRadiusD9Ej5fM());
            final float f2 = contentDrawScope.mo376toPx0680j_4(DpOffset.m6363getXD9Ej5fM(innerShadowInvoke.m6664getOffsetRKDOV3M()));
            final float f3 = contentDrawScope.mo376toPx0680j_4(DpOffset.m6365getYD9Ej5fM(innerShadowInvoke.m6664getOffsetRKDOV3M()));
            final Outline outlineMo287createOutlinePq9zytI = this.shapeProvider.getShape().mo287createOutlinePq9zytI(contentDrawScope.mo4399getSizeNHjbRc(), layoutDirection, contentDrawScope);
            if (outlineMo287createOutlinePq9zytI instanceof Outline.Rounded) {
                Path Path = this.clipPath;
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                    this.clipPath = Path;
                }
                path = Path;
            } else {
                path = null;
            }
            configurePaint(contentDrawScope, innerShadowInvoke);
            graphicsLayer.setAlpha(innerShadowInvoke.getAlpha());
            graphicsLayer.m4495setBlendModes9anfk8(innerShadowInvoke.m6662getBlendMode0nO6VwU());
            if (this.prevRadius != f) {
                graphicsLayer.setRenderEffect(f > 0.0f ? RenderEffectKt.m4151BlurEffect3YTHUZs(f, f, TileMode.INSTANCE.m4217getDecal3opZhB0()) : null);
                this.prevRadius = f;
            }
            DrawScope.m4397recordJVtK1S4$default(contentDrawScope, graphicsLayer, 0L, new Function1() { // from class: com.kyant.backdrop.shadow.InnerShadowNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InnerShadowNode.draw$lambda$1(outlineMo287createOutlinePq9zytI, path, this, f2, f3, (DrawScope) obj);
                }
            }, 1, null);
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            canvas.save();
            OutlineKt.clipOutline(canvas, outlineMo287createOutlinePq9zytI, path);
            GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
            canvas.restore();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draw$lambda$1(Outline outline, Path path, InnerShadowNode innerShadowNode, float f, float f2, DrawScope record) {
        Intrinsics.checkNotNullParameter(record, "$this$record");
        Canvas canvas = record.getDrawContext().getCanvas();
        canvas.save();
        OutlineKt.clipOutline(canvas, outline, path);
        androidx.compose.ui.graphics.OutlineKt.drawOutline(canvas, outline, innerShadowNode.paint);
        canvas.translate(f, f2);
        androidx.compose.ui.graphics.OutlineKt.drawOutline(canvas, outline, InnerShadowModifierKt.ShadowMaskPaint);
        canvas.translate(-f, -f2);
        canvas.restore();
        return Unit.INSTANCE;
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

    private final void configurePaint(DrawScope drawScope, InnerShadow innerShadow) {
        this.paint.mo3722setColor8_81llA(innerShadow.m6663getColor0d7_KjU());
    }

    private final void drawMaskedShadow(DrawScope drawScope, Outline outline, GraphicsLayer graphicsLayer) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        canvas.save();
        OutlineKt.clipOutline(canvas, outline, this.clipPath);
        GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
        canvas.restore();
    }
}
