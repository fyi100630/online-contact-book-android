package com.kyant.backdrop.backdrops;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmptyBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\u0002\b\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/kyant/backdrop/backdrops/EmptyBackdrop;", "Lcom/kyant/backdrop/Backdrop;", "<init>", "()V", "isCoordinatesDependent", "", "()Z", "drawBackdrop", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EmptyBackdrop implements com.kyant.backdrop.Backdrop {
    public static final EmptyBackdrop INSTANCE = new EmptyBackdrop();
    private static final boolean isCoordinatesDependent = false;

    @Override // com.kyant.backdrop.Backdrop
    public void drawBackdrop(DrawScope drawScope, Density density, LayoutCoordinates layoutCoordinates, Function1<? super GraphicsLayerScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
    }

    private EmptyBackdrop() {
    }

    @Override // com.kyant.backdrop.Backdrop
    public boolean isCoordinatesDependent() {
        return isCoordinatesDependent;
    }
}
