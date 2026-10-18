package com.kyant.backdrop.backdrops;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import com.kyant.backdrop.InverseLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u001f\u001a\u00020\t*\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00152\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\nH\u0016J\b\u0010&\u001a\u00020\u001eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "Lcom/kyant/backdrop/Backdrop;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawOnScreen", "", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;ZLkotlin/jvm/functions/Function1;)V", "getGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getDrawOnScreen", "()Z", "getOnDraw$app_release", "()Lkotlin/jvm/functions/Function1;", "isCoordinatesDependent", "<set-?>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layerCoordinates", "getLayerCoordinates$app_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayerCoordinates$app_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layerCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "inverseLayerScope", "Lcom/kyant/backdrop/InverseLayerScope;", "drawBackdrop", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "coordinates", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "obtainInverseLayerScope", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayerBackdrop implements com.kyant.backdrop.Backdrop {
    public static final int $stable = 0;
    private final boolean drawOnScreen;
    private final GraphicsLayer graphicsLayer;
    private InverseLayerScope inverseLayerScope;
    private final boolean isCoordinatesDependent;

    /* JADX INFO: renamed from: layerCoordinates$delegate, reason: from kotlin metadata */
    private final MutableState layerCoordinates;
    private final Function1<ContentDrawScope, Unit> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerBackdrop(GraphicsLayer graphicsLayer, boolean z, Function1<? super ContentDrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "graphicsLayer");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.graphicsLayer = graphicsLayer;
        this.drawOnScreen = z;
        this.onDraw = onDraw;
        this.isCoordinatesDependent = true;
        this.layerCoordinates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ LayerBackdrop(GraphicsLayer graphicsLayer, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphicsLayer, (i & 2) != 0 ? true : z, function1);
    }

    public final GraphicsLayer getGraphicsLayer() {
        return this.graphicsLayer;
    }

    public final boolean getDrawOnScreen() {
        return this.drawOnScreen;
    }

    public final Function1<ContentDrawScope, Unit> getOnDraw$app_release() {
        return this.onDraw;
    }

    @Override // com.kyant.backdrop.Backdrop
    /* JADX INFO: renamed from: isCoordinatesDependent, reason: from getter */
    public boolean getIsCoordinatesDependent() {
        return this.isCoordinatesDependent;
    }

    public final LayoutCoordinates getLayerCoordinates$app_release() {
        return (LayoutCoordinates) this.layerCoordinates.getValue();
    }

    public final void setLayerCoordinates$app_release(LayoutCoordinates layoutCoordinates) {
        this.layerCoordinates.setValue(layoutCoordinates);
    }

    @Override // com.kyant.backdrop.Backdrop
    public void drawBackdrop(DrawScope drawScope, Density density, LayoutCoordinates layoutCoordinates, Function1<? super GraphicsLayerScope, Unit> function1) {
        LayoutCoordinates layerCoordinates$app_release;
        long jM3606minusMKHz9U;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (layoutCoordinates == null || (layerCoordinates$app_release = getLayerCoordinates$app_release()) == null) {
            return;
        }
        try {
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo4320getSizeNHjbRc = drawContext.mo4320getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                DrawTransform transform = drawContext.getTransform();
                if (function1 != null) {
                    obtainInverseLayerScope().inverseTransform(transform, density, function1);
                }
                try {
                    jM3606minusMKHz9U = LayoutCoordinates.m5185localPositionOfS_NoaFU$default(layerCoordinates$app_release, layoutCoordinates, 0L, false, 6, null);
                } catch (Exception unused) {
                    jM3606minusMKHz9U = Offset.m3606minusMKHz9U(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), LayoutCoordinatesKt.positionInWindow(layerCoordinates$app_release));
                }
                transform.translate(-Offset.m3602getXimpl(jM3606minusMKHz9U), -Offset.m3603getYimpl(jM3606minusMKHz9U));
                GraphicsLayerKt.drawLayer(drawScope, this.graphicsLayer);
                drawContext.getCanvas().restore();
                drawContext.mo4321setSizeuvyYCjk(jMo4320getSizeNHjbRc);
            } catch (Throwable th) {
                drawContext.getCanvas().restore();
                drawContext.mo4321setSizeuvyYCjk(jMo4320getSizeNHjbRc);
                throw th;
            }
        } catch (Throwable unused2) {
        }
    }

    private final InverseLayerScope obtainInverseLayerScope() {
        InverseLayerScope inverseLayerScope = this.inverseLayerScope;
        if (inverseLayerScope != null) {
            inverseLayerScope.reset();
            return inverseLayerScope;
        }
        InverseLayerScope inverseLayerScope2 = new InverseLayerScope();
        this.inverseLayerScope = inverseLayerScope2;
        return inverseLayerScope2;
    }
}
