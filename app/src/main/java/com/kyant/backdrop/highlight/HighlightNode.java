package com.kyant.backdrop.highlight;

import android.graphics.BlurMaskFilter;
import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.kyant.backdrop.OutlineKt;
import com.kyant.backdrop.RuntimeShaderCacheImpl;
import com.kyant.backdrop.ShapeProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HighlightModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\f\u0010 \u001a\u00020!*\u00020\"H\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\u0014\u0010%\u001a\u00020!*\u00020&2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "shapeProvider", "Lcom/kyant/backdrop/ShapeProvider;", "highlight", "Lkotlin/Function0;", "Lcom/kyant/backdrop/highlight/Highlight;", "<init>", "(Lcom/kyant/backdrop/ShapeProvider;Lkotlin/jvm/functions/Function0;)V", "getShapeProvider", "()Lcom/kyant/backdrop/ShapeProvider;", "setShapeProvider", "(Lcom/kyant/backdrop/ShapeProvider;)V", "getHighlight", "()Lkotlin/jvm/functions/Function0;", "setHighlight", "(Lkotlin/jvm/functions/Function0;)V", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "highlightLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "paint", "Landroidx/compose/ui/graphics/Paint;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "runtimeShaderCache", "Lcom/kyant/backdrop/RuntimeShaderCacheImpl;", "prevStyle", "Lcom/kyant/backdrop/highlight/HighlightStyle;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onAttach", "onDetach", "configurePaint", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HighlightNode extends Modifier.Node implements DrawModifierNode {
    public static final int $stable = 8;
    private Path clipPath;
    private Function0<Highlight> highlight;
    private GraphicsLayer highlightLayer;
    private final Paint paint;
    private HighlightStyle prevStyle;
    private final RuntimeShaderCacheImpl runtimeShaderCache;
    private ShapeProvider shapeProvider;
    private final boolean shouldAutoInvalidate;

    public final ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public final void setShapeProvider(ShapeProvider shapeProvider) {
        Intrinsics.checkNotNullParameter(shapeProvider, "<set-?>");
        this.shapeProvider = shapeProvider;
    }

    public final Function0<Highlight> getHighlight() {
        return this.highlight;
    }

    public final void setHighlight(Function0<Highlight> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.highlight = function0;
    }

    public HighlightNode(ShapeProvider shapeProvider, Function0<Highlight> highlight) {
        Intrinsics.checkNotNullParameter(shapeProvider, "shapeProvider");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        this.shapeProvider = shapeProvider;
        this.highlight = highlight;
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo3726setStylek9PVt8s(PaintingStyle.INSTANCE.m4111getStrokeTiuSbCo());
        this.paint = Paint;
        this.runtimeShaderCache = new RuntimeShaderCacheImpl();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        final Path Path;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        Highlight highlightInvoke = this.highlight.invoke();
        if (highlightInvoke == null || highlightInvoke.m6645getWidthD9Ej5fM() <= 0.0f) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        GraphicsLayer graphicsLayer = this.highlightLayer;
        if (graphicsLayer != null) {
            try {
                long j = contentDrawScope.mo4399getSizeNHjbRc();
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                long jIntSize = IntSizeKt.IntSize(((int) Math.ceil(Size.m3671getWidthimpl(j))) + 2, ((int) Math.ceil(Size.m3668getHeightimpl(j))) + 2);
                final Outline outlineMo287createOutlinePq9zytI = this.shapeProvider.getShape().mo287createOutlinePq9zytI(j, layoutDirection, contentDrawScope);
                if (outlineMo287createOutlinePq9zytI instanceof Outline.Rounded) {
                    Path = this.clipPath;
                    if (Path == null) {
                        Path = AndroidPath_androidKt.Path();
                        this.clipPath = Path;
                    }
                } else {
                    Path = null;
                }
                configurePaint(contentDrawScope, highlightInvoke);
                graphicsLayer.setAlpha(highlightInvoke.getAlpha());
                graphicsLayer.m4495setBlendModes9anfk8(highlightInvoke.getStyle().getBlendMode());
                contentDrawScope.mo4400recordJVtK1S4(graphicsLayer, jIntSize, new Function1() { // from class: com.kyant.backdrop.highlight.HighlightNode$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HighlightNode.draw$lambda$3(outlineMo287createOutlinePq9zytI, Path, this, (DrawScope) obj);
                    }
                });
                ContentDrawScope contentDrawScope2 = contentDrawScope;
                contentDrawScope2.getDrawContext().getTransform().translate(-1.0f, -1.0f);
                try {
                    GraphicsLayerKt.drawLayer(contentDrawScope2, graphicsLayer);
                } finally {
                    contentDrawScope2.getDrawContext().getTransform().translate(1.0f, 1.0f);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.highlightLayer = DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        GraphicsContext graphicsContextRequireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        GraphicsLayer graphicsLayer = this.highlightLayer;
        if (graphicsLayer != null) {
            graphicsContextRequireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
            this.highlightLayer = null;
        }
        this.clipPath = null;
        this.runtimeShaderCache.clear();
        this.prevStyle = null;
    }

    private final void configurePaint(DrawScope drawScope, Highlight highlight) {
        this.paint.mo3722setColor8_81llA(highlight.getStyle().getColor());
        Paint paint = this.paint;
        float f = drawScope.mo376toPx0680j_4(highlight.m6645getWidthD9Ej5fM());
        float fM3670getMinDimensionimpl = Size.m3670getMinDimensionimpl(drawScope.mo4399getSizeNHjbRc()) / 2.0f;
        if (f > fM3670getMinDimensionimpl) {
            f = fM3670getMinDimensionimpl;
        }
        paint.setStrokeWidth(((float) Math.ceil(f)) * 2.0f);
        float f2 = drawScope.mo376toPx0680j_4(highlight.m6644getBlurRadiusD9Ej5fM());
        this.paint.getInternalPaint().setMaskFilter(f2 > 0.0f ? new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL) : null);
        if (Build.VERSION.SDK_INT >= 31) {
            this.paint.setShader(highlight.getStyle().createShader(drawScope, this.shapeProvider.getShape(), this.runtimeShaderCache));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draw$lambda$3(Outline outline, Path path, HighlightNode highlightNode, DrawScope record) {
        Intrinsics.checkNotNullParameter(record, "$this$record");
        record.getDrawContext().getTransform().translate(1.0f, 1.0f);
        try {
            Canvas canvas = record.getDrawContext().getCanvas();
            canvas.save();
            OutlineKt.clipOutline(canvas, outline, path);
            androidx.compose.ui.graphics.OutlineKt.drawOutline(canvas, outline, highlightNode.paint);
            canvas.restore();
            return Unit.INSTANCE;
        } finally {
            record.getDrawContext().getTransform().translate(-1.0f, -1.0f);
        }
    }
}
