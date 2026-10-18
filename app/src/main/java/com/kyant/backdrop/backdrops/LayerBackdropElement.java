package com.kyant.backdrop.backdrops;

import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerBackdropModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\f\u0010\r\u001a\u00020\u000b*\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/kyant/backdrop/backdrops/LayerBackdropElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/kyant/backdrop/backdrops/LayerBackdropNode;", "backdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "<init>", "(Lcom/kyant/backdrop/backdrops/LayerBackdrop;)V", "getBackdrop", "()Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "create", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "equals", "", "other", "", "hashCode", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LayerBackdropElement extends ModifierNodeElement<LayerBackdropNode> {
    private final LayerBackdrop backdrop;

    public final LayerBackdrop getBackdrop() {
        return this.backdrop;
    }

    public LayerBackdropElement(LayerBackdrop backdrop) {
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        this.backdrop = backdrop;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public LayerBackdropNode getNode() {
        return new LayerBackdropNode(this.backdrop);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayerBackdropNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setBackdrop(this.backdrop);
        DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("layerBackdrop");
        inspectorInfo.getProperties().set("backdrop", this.backdrop);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayerBackdropElement) && Intrinsics.areEqual(this.backdrop, ((LayerBackdropElement) other).backdrop);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.backdrop.hashCode();
    }
}
