package com.kyant.backdrop;

import android.graphics.RenderEffect;
import android.os.Build;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidRenderEffect_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.kyant.backdrop.backdrops.LayerBackdrop;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawBackdropModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001;\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005Bå\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e\u0012\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e\u0012=\u0010\u0015\u001a9\u0012\u0004\u0012\u00020\u0014\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u000e\u0012\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e\u0012\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010S\u001a\u00020T*\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\f\u0010\\\u001a\u00020\r*\u00020]H\u0016J\u0010\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020AH\u0016J\b\u0010`\u001a\u00020\rH\u0016J\u0006\u0010a\u001a\u00020\rJ\b\u0010b\u001a\u00020\rH\u0002J\b\u0010c\u001a\u00020\rH\u0002J\b\u0010d\u001a\u00020\rH\u0016J\b\u0010e\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R-\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R-\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)RQ\u0010\u0015\u001a9\u0012\u0004\u0012\u00020\u0014\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R-\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R-\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\u0010\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0004\n\u0002\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010B\u001a\u0004\u0018\u00010A2\b\u0010@\u001a\u0004\u0018\u00010A8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010J\u001a\u00020I2\u0006\u0010@\u001a\u00020I8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001f\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010R\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/kyant/backdrop/DrawBackdropNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "shapeProvider", "Lcom/kyant/backdrop/ShapeProvider;", "effects", "Lkotlin/Function1;", "Lcom/kyant/backdrop/BackdropEffectScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "exportedBackdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "onDrawBehind", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDrawBackdrop", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "drawBackdrop", "onDrawSurface", "onDrawFront", "<init>", "(Lcom/kyant/backdrop/Backdrop;Lcom/kyant/backdrop/ShapeProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/kyant/backdrop/backdrops/LayerBackdrop;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBackdrop", "()Lcom/kyant/backdrop/Backdrop;", "setBackdrop", "(Lcom/kyant/backdrop/Backdrop;)V", "getShapeProvider", "()Lcom/kyant/backdrop/ShapeProvider;", "setShapeProvider", "(Lcom/kyant/backdrop/ShapeProvider;)V", "getEffects", "()Lkotlin/jvm/functions/Function1;", "setEffects", "(Lkotlin/jvm/functions/Function1;)V", "getLayerBlock", "setLayerBlock", "getExportedBackdrop", "()Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "setExportedBackdrop", "(Lcom/kyant/backdrop/backdrops/LayerBackdrop;)V", "getOnDrawBehind", "setOnDrawBehind", "getOnDrawBackdrop", "()Lkotlin/jvm/functions/Function2;", "setOnDrawBackdrop", "(Lkotlin/jvm/functions/Function2;)V", "getOnDrawSurface", "setOnDrawSurface", "getOnDrawFront", "setOnDrawFront", "effectScope", "com/kyant/backdrop/DrawBackdropNode$effectScope$1", "Lcom/kyant/backdrop/DrawBackdropNode$effectScope$1;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layoutLayerBlock", "<set-?>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "", "padding", "getPadding", "()F", "setPadding", "(F)V", "padding$delegate", "Landroidx/compose/runtime/MutableFloatState;", "recordBackdropBlock", "drawBackdropLayer", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onGloballyPositioned", "coordinates", "onObservedReadsChanged", "invalidateDrawCache", "observeEffects", "updateEffects", "onAttach", "onDetach", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DrawBackdropNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode, ObserverModifierNode {
    private Backdrop backdrop;
    private final Function1<DrawScope, Unit> drawBackdropLayer;
    private final DrawBackdropNode$effectScope$1 effectScope;
    private Function1<? super BackdropEffectScope, Unit> effects;
    private LayerBackdrop exportedBackdrop;
    private GraphicsLayer graphicsLayer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;

    /* JADX INFO: renamed from: layoutCoordinates$delegate, reason: from kotlin metadata */
    private final MutableState layoutCoordinates;
    private final Function1<GraphicsLayerScope, Unit> layoutLayerBlock;
    private Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDrawBackdrop;
    private Function1<? super DrawScope, Unit> onDrawBehind;
    private Function1<? super DrawScope, Unit> onDrawFront;
    private Function1<? super DrawScope, Unit> onDrawSurface;

    /* JADX INFO: renamed from: padding$delegate, reason: from kotlin metadata */
    private final MutableFloatState padding;
    private final Function1<DrawScope, Unit> recordBackdropBlock;
    private ShapeProvider shapeProvider;

    public final Backdrop getBackdrop() {
        return this.backdrop;
    }

    public final void setBackdrop(Backdrop backdrop) {
        Intrinsics.checkNotNullParameter(backdrop, "<set-?>");
        this.backdrop = backdrop;
    }

    public final ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public final void setShapeProvider(ShapeProvider shapeProvider) {
        Intrinsics.checkNotNullParameter(shapeProvider, "<set-?>");
        this.shapeProvider = shapeProvider;
    }

    public final Function1<BackdropEffectScope, Unit> getEffects() {
        return this.effects;
    }

    public final void setEffects(Function1<? super BackdropEffectScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.effects = function1;
    }

    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final void setLayerBlock(Function1<? super GraphicsLayerScope, Unit> function1) {
        this.layerBlock = function1;
    }

    public final LayerBackdrop getExportedBackdrop() {
        return this.exportedBackdrop;
    }

    public final void setExportedBackdrop(LayerBackdrop layerBackdrop) {
        this.exportedBackdrop = layerBackdrop;
    }

    public final Function1<DrawScope, Unit> getOnDrawBehind() {
        return this.onDrawBehind;
    }

    public final void setOnDrawBehind(Function1<? super DrawScope, Unit> function1) {
        this.onDrawBehind = function1;
    }

    public final Function2<DrawScope, Function1<? super DrawScope, Unit>, Unit> getOnDrawBackdrop() {
        return this.onDrawBackdrop;
    }

    public final void setOnDrawBackdrop(Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onDrawBackdrop = function2;
    }

    public final Function1<DrawScope, Unit> getOnDrawSurface() {
        return this.onDrawSurface;
    }

    public final void setOnDrawSurface(Function1<? super DrawScope, Unit> function1) {
        this.onDrawSurface = function1;
    }

    public final Function1<DrawScope, Unit> getOnDrawFront() {
        return this.onDrawFront;
    }

    public final void setOnDrawFront(Function1<? super DrawScope, Unit> function1) {
        this.onDrawFront = function1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.kyant.backdrop.DrawBackdropNode$effectScope$1] */
    public DrawBackdropNode(Backdrop backdrop, ShapeProvider shapeProvider, Function1<? super BackdropEffectScope, Unit> effects, Function1<? super GraphicsLayerScope, Unit> function1, LayerBackdrop layerBackdrop, Function1<? super DrawScope, Unit> function2, Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDrawBackdrop, Function1<? super DrawScope, Unit> function3, Function1<? super DrawScope, Unit> function4) {
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(shapeProvider, "shapeProvider");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(onDrawBackdrop, "onDrawBackdrop");
        this.backdrop = backdrop;
        this.shapeProvider = shapeProvider;
        this.effects = effects;
        this.layerBlock = function1;
        this.exportedBackdrop = layerBackdrop;
        this.onDrawBehind = function2;
        this.onDrawBackdrop = onDrawBackdrop;
        this.onDrawSurface = function3;
        this.onDrawFront = function4;
        this.effectScope = new BackdropEffectScopeImpl() { // from class: com.kyant.backdrop.DrawBackdropNode$effectScope$1
            @Override // com.kyant.backdrop.BackdropEffectScope
            public Shape getShape() {
                return this.this$0.getShapeProvider().getInnerShape();
            }
        };
        this.layoutLayerBlock = new Function1() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawBackdropNode.layoutLayerBlock$lambda$0(this.f$0, (GraphicsLayerScope) obj);
            }
        };
        this.layoutCoordinates = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.padding = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.recordBackdropBlock = new Function1() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawBackdropNode.recordBackdropBlock$lambda$3(this.f$0, (DrawScope) obj);
            }
        };
        this.drawBackdropLayer = new Function1() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawBackdropNode.drawBackdropLayer$lambda$4(this.f$0, (DrawScope) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit layoutLayerBlock$lambda$0(DrawBackdropNode drawBackdropNode, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "<this>");
        graphicsLayerScope.setClip(true);
        graphicsLayerScope.setShape(drawBackdropNode.shapeProvider.getShape());
        graphicsLayerScope.mo4034setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m3934getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    private final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    private final float getPadding() {
        return this.padding.getFloatValue();
    }

    private final void setPadding(float f) {
        this.padding.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordBackdropBlock$lambda$3(final DrawBackdropNode drawBackdropNode, DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        float padding = drawBackdropNode.getPadding();
        if (padding != 0.0f) {
            canvas.translate(padding, padding);
        }
        drawBackdropNode.onDrawBackdrop.invoke(drawScope, new Function1() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawBackdropNode.recordBackdropBlock$lambda$3$lambda$2(this.f$0, (DrawScope) obj);
            }
        });
        if (padding != 0.0f) {
            float f = -padding;
            canvas.translate(f, f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordBackdropBlock$lambda$3$lambda$2(DrawBackdropNode drawBackdropNode, DrawScope onDrawBackdrop) {
        Intrinsics.checkNotNullParameter(onDrawBackdrop, "$this$onDrawBackdrop");
        drawBackdropNode.backdrop.drawBackdrop(onDrawBackdrop, drawBackdropNode.effectScope, drawBackdropNode.getLayoutCoordinates(), drawBackdropNode.layerBlock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawBackdropLayer$lambda$4(DrawBackdropNode drawBackdropNode, DrawScope drawScope) {
        long jIntOffset;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        GraphicsLayer graphicsLayer = drawBackdropNode.graphicsLayer;
        if (graphicsLayer != null) {
            float padding = drawBackdropNode.getPadding();
            try {
                int i = (int) padding;
                int i2 = i * 2;
                LayerRecorderKt.m6635recordLayerTdoYBX4(drawScope, drawBackdropNode, graphicsLayer, IntSizeKt.IntSize(((int) Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc())) + i2, ((int) Size.m3668getHeightimpl(drawScope.mo4399getSizeNHjbRc())) + i2), drawBackdropNode.recordBackdropBlock);
                if (padding != 0.0f) {
                    int i3 = -i;
                    jIntOffset = IntOffsetKt.IntOffset(i3, i3);
                } else {
                    jIntOffset = IntOffset.INSTANCE.m6440getZeronOccac();
                }
                graphicsLayer.m4501setTopLeftgyyYBs(jIntOffset);
                GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
            } catch (Throwable unused) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo94measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo5178measureBRTryo0 = measurable.mo5178measureBRTryo0(j);
        return MeasureScope.layout$default(measure, placeableMo5178measureBRTryo0.getWidth(), placeableMo5178measureBRTryo0.getHeight(), null, new Function1() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawBackdropNode.measure_3p2s80s$lambda$5(placeableMo5178measureBRTryo0, this, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$5(Placeable placeable, DrawBackdropNode drawBackdropNode, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.m5246placeWithLayeraW9wM$default(layout, placeable, IntOffset.INSTANCE.m6440getZeronOccac(), 0.0f, drawBackdropNode.layoutLayerBlock, 2, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        GraphicsLayer graphicsLayer;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        try {
            if (update(contentDrawScope)) {
                updateEffects();
            }
            Function1<? super DrawScope, Unit> function1 = this.onDrawBehind;
            if (function1 != null) {
                function1.invoke(contentDrawScope);
            }
            this.drawBackdropLayer.invoke(contentDrawScope);
            Function1<? super DrawScope, Unit> function2 = this.onDrawSurface;
            if (function2 != null) {
                function2.invoke(contentDrawScope);
            }
            contentDrawScope.drawContent();
            Function1<? super DrawScope, Unit> function3 = this.onDrawFront;
            if (function3 != null) {
                function3.invoke(contentDrawScope);
            }
            LayerBackdrop layerBackdrop = this.exportedBackdrop;
            if (layerBackdrop == null || (graphicsLayer = layerBackdrop.getGraphicsLayer()) == null) {
                return;
            }
            LayerRecorderKt.m6636recordLayerTdoYBX4$default(contentDrawScope, this, graphicsLayer, 0L, new Function1() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DrawBackdropNode.draw$lambda$7$lambda$6(this.f$0, (DrawScope) obj);
                }
            }, 4, null);
        } catch (Throwable unused) {
            contentDrawScope.drawContent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draw$lambda$7$lambda$6(DrawBackdropNode drawBackdropNode, DrawScope recordLayer) {
        Intrinsics.checkNotNullParameter(recordLayer, "$this$recordLayer");
        Function1<? super DrawScope, Unit> function1 = drawBackdropNode.onDrawBehind;
        if (function1 != null) {
            function1.invoke(recordLayer);
        }
        drawBackdropNode.drawBackdropLayer.invoke(recordLayer);
        Function1<? super DrawScope, Unit> function2 = drawBackdropNode.onDrawSurface;
        if (function2 != null) {
            function2.invoke(recordLayer);
        }
        Function1<? super DrawScope, Unit> function3 = drawBackdropNode.onDrawFront;
        if (function3 != null) {
            function3.invoke(recordLayer);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (coordinates.isAttached()) {
            if (this.backdrop.getIsCoordinatesDependent()) {
                setLayoutCoordinates(coordinates);
            } else if (getLayoutCoordinates() != null) {
                setLayoutCoordinates(null);
            }
            LayerBackdrop layerBackdrop = this.exportedBackdrop;
            if (layerBackdrop != null) {
                layerBackdrop.setLayerCoordinates$app_release(coordinates);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void invalidateDrawCache() {
        observeEffects();
    }

    private final void observeEffects() {
        ObserverModifierNodeKt.observeReads(this, new Function0() { // from class: com.kyant.backdrop.DrawBackdropNode$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawBackdropNode.observeEffects$lambda$8(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeEffects$lambda$8(DrawBackdropNode drawBackdropNode) {
        drawBackdropNode.updateEffects();
        return Unit.INSTANCE;
    }

    private final void updateEffects() {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                apply(this.effects);
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                if (graphicsLayer != null) {
                    RenderEffect renderEffect = getRenderEffect();
                    graphicsLayer.setRenderEffect(renderEffect != null ? AndroidRenderEffect_androidKt.asComposeRenderEffect(renderEffect) : null);
                }
                setPadding(getPadding());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.graphicsLayer = DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer();
        observeEffects();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        GraphicsContext graphicsContextRequireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (graphicsLayer != null) {
            graphicsContextRequireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
            this.graphicsLayer = null;
        }
        reset();
        setLayoutCoordinates(null);
        LayerBackdrop layerBackdrop = this.exportedBackdrop;
        if (layerBackdrop != null) {
            layerBackdrop.setLayerCoordinates$app_release(null);
        }
    }
}
