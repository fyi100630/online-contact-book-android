package com.kyant.backdrop;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.kyant.backdrop.backdrops.LayerBackdrop;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawBackdropModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u0012\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b\u0012=\u0010\u0012\u001a9\u0012\u0004\u0012\u00020\u0011\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u000b\u0012\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b\u0012\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0002H\u0016J\f\u0010,\u001a\u00020\n*\u00020-H\u0016J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u000203H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R$\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R$\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 RH\u0010\u0012\u001a9\u0012\u0004\u0012\u00020\u0011\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R$\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R$\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 ¨\u00064"}, d2 = {"Lcom/kyant/backdrop/DrawBackdropElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/kyant/backdrop/DrawBackdropNode;", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "shapeProvider", "Lcom/kyant/backdrop/ShapeProvider;", "effects", "Lkotlin/Function1;", "Lcom/kyant/backdrop/BackdropEffectScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "exportedBackdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "onDrawBehind", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDrawBackdrop", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "drawBackdrop", "onDrawSurface", "onDrawFront", "<init>", "(Lcom/kyant/backdrop/Backdrop;Lcom/kyant/backdrop/ShapeProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/kyant/backdrop/backdrops/LayerBackdrop;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBackdrop", "()Lcom/kyant/backdrop/Backdrop;", "getShapeProvider", "()Lcom/kyant/backdrop/ShapeProvider;", "getEffects", "()Lkotlin/jvm/functions/Function1;", "getLayerBlock", "getExportedBackdrop", "()Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "getOnDrawBehind", "getOnDrawBackdrop", "()Lkotlin/jvm/functions/Function2;", "getOnDrawSurface", "getOnDrawFront", "create", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "equals", "", "other", "", "hashCode", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DrawBackdropElement extends ModifierNodeElement<DrawBackdropNode> {
    private final Backdrop backdrop;
    private final Function1<BackdropEffectScope, Unit> effects;
    private final LayerBackdrop exportedBackdrop;
    private final Function1<GraphicsLayerScope, Unit> layerBlock;
    private final Function2<DrawScope, Function1<? super DrawScope, Unit>, Unit> onDrawBackdrop;
    private final Function1<DrawScope, Unit> onDrawBehind;
    private final Function1<DrawScope, Unit> onDrawFront;
    private final Function1<DrawScope, Unit> onDrawSurface;
    private final ShapeProvider shapeProvider;

    public final Backdrop getBackdrop() {
        return this.backdrop;
    }

    public final ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public final Function1<BackdropEffectScope, Unit> getEffects() {
        return this.effects;
    }

    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final LayerBackdrop getExportedBackdrop() {
        return this.exportedBackdrop;
    }

    public final Function1<DrawScope, Unit> getOnDrawBehind() {
        return this.onDrawBehind;
    }

    public final Function2<DrawScope, Function1<? super DrawScope, Unit>, Unit> getOnDrawBackdrop() {
        return this.onDrawBackdrop;
    }

    public final Function1<DrawScope, Unit> getOnDrawSurface() {
        return this.onDrawSurface;
    }

    public final Function1<DrawScope, Unit> getOnDrawFront() {
        return this.onDrawFront;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBackdropElement(Backdrop backdrop, ShapeProvider shapeProvider, Function1<? super BackdropEffectScope, Unit> effects, Function1<? super GraphicsLayerScope, Unit> function1, LayerBackdrop layerBackdrop, Function1<? super DrawScope, Unit> function2, Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDrawBackdrop, Function1<? super DrawScope, Unit> function3, Function1<? super DrawScope, Unit> function4) {
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
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public DrawBackdropNode getNode() {
        return new DrawBackdropNode(this.backdrop, this.shapeProvider, this.effects, this.layerBlock, this.exportedBackdrop, this.onDrawBehind, this.onDrawBackdrop, this.onDrawSurface, this.onDrawFront);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DrawBackdropNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setBackdrop(this.backdrop);
        node.setShapeProvider(this.shapeProvider);
        node.setEffects(this.effects);
        node.setLayerBlock(this.layerBlock);
        node.setExportedBackdrop(this.exportedBackdrop);
        node.setOnDrawBehind(this.onDrawBehind);
        node.setOnDrawBackdrop(this.onDrawBackdrop);
        node.setOnDrawSurface(this.onDrawSurface);
        node.setOnDrawFront(this.onDrawFront);
        node.invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("drawBackdrop");
        inspectorInfo.getProperties().set("backdrop", this.backdrop);
        inspectorInfo.getProperties().set("shapeProvider", this.shapeProvider);
        inspectorInfo.getProperties().set("effects", this.effects);
        inspectorInfo.getProperties().set("layerBlock", this.layerBlock);
        inspectorInfo.getProperties().set("exportedBackdrop", this.exportedBackdrop);
        inspectorInfo.getProperties().set("onDrawBehind", this.onDrawBehind);
        inspectorInfo.getProperties().set("onDrawBackdrop", this.onDrawBackdrop);
        inspectorInfo.getProperties().set("onDrawSurface", this.onDrawSurface);
        inspectorInfo.getProperties().set("onDrawFront", this.onDrawFront);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawBackdropElement)) {
            return false;
        }
        DrawBackdropElement drawBackdropElement = (DrawBackdropElement) other;
        return Intrinsics.areEqual(this.backdrop, drawBackdropElement.backdrop) && Intrinsics.areEqual(this.shapeProvider, drawBackdropElement.shapeProvider) && Intrinsics.areEqual(this.effects, drawBackdropElement.effects) && Intrinsics.areEqual(this.layerBlock, drawBackdropElement.layerBlock) && Intrinsics.areEqual(this.exportedBackdrop, drawBackdropElement.exportedBackdrop) && Intrinsics.areEqual(this.onDrawBehind, drawBackdropElement.onDrawBehind) && Intrinsics.areEqual(this.onDrawBackdrop, drawBackdropElement.onDrawBackdrop) && Intrinsics.areEqual(this.onDrawSurface, drawBackdropElement.onDrawSurface) && Intrinsics.areEqual(this.onDrawFront, drawBackdropElement.onDrawFront);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((this.backdrop.hashCode() * 31) + this.shapeProvider.hashCode()) * 31) + this.effects.hashCode()) * 31;
        Function1<GraphicsLayerScope, Unit> function1 = this.layerBlock;
        int iHashCode2 = (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31;
        LayerBackdrop layerBackdrop = this.exportedBackdrop;
        int iHashCode3 = (iHashCode2 + (layerBackdrop != null ? layerBackdrop.hashCode() : 0)) * 31;
        Function1<DrawScope, Unit> function2 = this.onDrawBehind;
        int iHashCode4 = (((iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.onDrawBackdrop.hashCode()) * 31;
        Function1<DrawScope, Unit> function3 = this.onDrawSurface;
        int iHashCode5 = (iHashCode4 + (function3 != null ? function3.hashCode() : 0)) * 31;
        Function1<DrawScope, Unit> function4 = this.onDrawFront;
        return iHashCode5 + (function4 != null ? function4.hashCode() : 0);
    }
}
