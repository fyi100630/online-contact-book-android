package com.kyant.backdrop;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerRecorder.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"recordLayer", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/IntSize;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "recordLayer-TdoYBX4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LayerRecorderKt {
    /* JADX INFO: renamed from: recordLayer-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m6636recordLayerTdoYBX4$default(DrawScope drawScope, DelegatableNode delegatableNode, GraphicsLayer graphicsLayer, long j, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSizeKt.m6483toIntSizeuvyYCjk(drawScope.mo4399getSizeNHjbRc());
        }
        m6635recordLayerTdoYBX4(drawScope, delegatableNode, graphicsLayer, j, function1);
    }

    /* JADX INFO: renamed from: recordLayer-TdoYBX4, reason: not valid java name */
    public static final void m6635recordLayerTdoYBX4(DrawScope recordLayer, DelegatableNode node, GraphicsLayer layer, long j, final Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(recordLayer, "$this$recordLayer");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(layer, "layer");
        Intrinsics.checkNotNullParameter(block, "block");
        final Density densityRequireDensity = DelegatableNodeKt.requireDensity(node);
        recordLayer.mo4400recordJVtK1S4(layer, j, new Function1() { // from class: com.kyant.backdrop.LayerRecorderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LayerRecorderKt.recordLayer_TdoYBX4$lambda$0(densityRequireDensity, block, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordLayer_TdoYBX4$lambda$0(Density density, Function1 function1, DrawScope record) {
        Intrinsics.checkNotNullParameter(record, "$this$record");
        Density density2 = record.getDrawContext().getDensity();
        record.getDrawContext().setDensity(density);
        try {
            function1.invoke(record);
            return Unit.INSTANCE;
        } finally {
            record.getDrawContext().setDensity(density2);
        }
    }
}
