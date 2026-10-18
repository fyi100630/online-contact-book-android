package com.kyant.backdrop.backdrops;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CombinedBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0016R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/kyant/backdrop/backdrops/CombinedBackdrops;", "Lcom/kyant/backdrop/Backdrop;", "backdrops", "", "<init>", "([Lcom/kyant/backdrop/Backdrop;)V", "getBackdrops", "()[Lcom/kyant/backdrop/Backdrop;", "[Lcom/kyant/backdrop/Backdrop;", "isCoordinatesDependent", "", "()Z", "drawBackdrop", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CombinedBackdrops implements com.kyant.backdrop.Backdrop {
    private final com.kyant.backdrop.Backdrop[] backdrops;
    private final boolean isCoordinatesDependent;

    public CombinedBackdrops(com.kyant.backdrop.Backdrop... backdrops) {
        Intrinsics.checkNotNullParameter(backdrops, "backdrops");
        this.backdrops = backdrops;
        boolean z = false;
        for (com.kyant.backdrop.Backdrop backdrop : backdrops) {
            if (backdrop.getIsCoordinatesDependent()) {
                z = true;
                break;
            }
        }
        this.isCoordinatesDependent = z;
    }

    public final com.kyant.backdrop.Backdrop[] getBackdrops() {
        return this.backdrops;
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
        for (com.kyant.backdrop.Backdrop backdrop : this.backdrops) {
            backdrop.drawBackdrop(drawScope, density, layoutCoordinates, function1);
        }
    }
}
