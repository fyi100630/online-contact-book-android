package com.kyant.backdrop.backdrops;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CanvasBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000e\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006H\u0016R\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/kyant/backdrop/backdrops/CanvasBackdrop;", "Lcom/kyant/backdrop/Backdrop;", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "isCoordinatesDependent", "", "()Z", "drawBackdrop", "density", "Landroidx/compose/ui/unit/Density;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CanvasBackdrop implements com.kyant.backdrop.Backdrop {
    private final boolean isCoordinatesDependent;
    private final Function1<DrawScope, Unit> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public CanvasBackdrop(Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.onDraw = onDraw;
    }

    public final Function1<DrawScope, Unit> getOnDraw() {
        return this.onDraw;
    }

    @Override // com.kyant.backdrop.Backdrop
    /* JADX INFO: renamed from: isCoordinatesDependent, reason: from getter */
    public boolean getIsCoordinatesDependent() {
        return this.isCoordinatesDependent;
    }

    @Override // com.kyant.backdrop.Backdrop
    public void drawBackdrop(DrawScope drawScope, Density density, LayoutCoordinates layoutCoordinates, Function1<? super GraphicsLayerScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        this.onDraw.invoke(drawScope);
    }
}
