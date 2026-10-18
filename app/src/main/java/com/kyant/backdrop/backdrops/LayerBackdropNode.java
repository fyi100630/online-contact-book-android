package com.kyant.backdrop.backdrops;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import com.kyant.backdrop.LayerRecorderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerBackdropModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/kyant/backdrop/backdrops/LayerBackdropNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "backdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "<init>", "(Lcom/kyant/backdrop/backdrops/LayerBackdrop;)V", "getBackdrop", "()Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "setBackdrop", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onDetach", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LayerBackdropNode extends Modifier.Node implements DrawModifierNode, GlobalPositionAwareModifierNode {
    private LayerBackdrop backdrop;

    public final LayerBackdrop getBackdrop() {
        return this.backdrop;
    }

    public final void setBackdrop(LayerBackdrop layerBackdrop) {
        Intrinsics.checkNotNullParameter(layerBackdrop, "<set-?>");
        this.backdrop = layerBackdrop;
    }

    public LayerBackdropNode(LayerBackdrop backdrop) {
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        this.backdrop = backdrop;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        try {
            LayerRecorderKt.m6636recordLayerTdoYBX4$default(contentDrawScope, this, this.backdrop.getGraphicsLayer(), 0L, new Function1() { // from class: com.kyant.backdrop.backdrops.LayerBackdropNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LayerBackdropNode.draw$lambda$0(this.f$0, contentDrawScope, (DrawScope) obj);
                }
            }, 4, null);
            if (this.backdrop.getDrawOnScreen()) {
                GraphicsLayerKt.drawLayer(contentDrawScope, this.backdrop.getGraphicsLayer());
            }
        } catch (Throwable unused) {
            contentDrawScope.drawContent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draw$lambda$0(LayerBackdropNode layerBackdropNode, ContentDrawScope contentDrawScope, DrawScope recordLayer) {
        Intrinsics.checkNotNullParameter(recordLayer, "$this$recordLayer");
        layerBackdropNode.backdrop.getOnDraw$app_release().invoke(contentDrawScope);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (coordinates.isAttached()) {
            this.backdrop.setLayerCoordinates$app_release(coordinates);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.backdrop.setLayerCoordinates$app_release(null);
    }
}
