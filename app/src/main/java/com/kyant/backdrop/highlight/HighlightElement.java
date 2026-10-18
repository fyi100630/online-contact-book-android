package com.kyant.backdrop.highlight;

import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.kyant.backdrop.ShapeProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HighlightModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\f\u0010\u0012\u001a\u00020\u0010*\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/kyant/backdrop/highlight/HighlightNode;", "shapeProvider", "Lcom/kyant/backdrop/ShapeProvider;", "highlight", "Lkotlin/Function0;", "Lcom/kyant/backdrop/highlight/Highlight;", "<init>", "(Lcom/kyant/backdrop/ShapeProvider;Lkotlin/jvm/functions/Function0;)V", "getShapeProvider", "()Lcom/kyant/backdrop/ShapeProvider;", "getHighlight", "()Lkotlin/jvm/functions/Function0;", "create", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "equals", "", "other", "", "hashCode", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HighlightElement extends ModifierNodeElement<HighlightNode> {
    public static final int $stable = 0;
    private final Function0<Highlight> highlight;
    private final ShapeProvider shapeProvider;

    public final ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public final Function0<Highlight> getHighlight() {
        return this.highlight;
    }

    public HighlightElement(ShapeProvider shapeProvider, Function0<Highlight> highlight) {
        Intrinsics.checkNotNullParameter(shapeProvider, "shapeProvider");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        this.shapeProvider = shapeProvider;
        this.highlight = highlight;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public HighlightNode getNode() {
        return new HighlightNode(this.shapeProvider, this.highlight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HighlightNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setShapeProvider(this.shapeProvider);
        node.setHighlight(this.highlight);
        DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("highlight");
        inspectorInfo.getProperties().set("shapeProvider", this.shapeProvider);
        inspectorInfo.getProperties().set("highlight", this.highlight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightElement)) {
            return false;
        }
        HighlightElement highlightElement = (HighlightElement) other;
        return Intrinsics.areEqual(this.shapeProvider, highlightElement.shapeProvider) && Intrinsics.areEqual(this.highlight, highlightElement.highlight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.shapeProvider.hashCode() * 31) + this.highlight.hashCode();
    }
}
