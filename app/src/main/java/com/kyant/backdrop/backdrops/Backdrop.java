package com.kyant.backdrop.backdrops;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Backdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012=\u0010\u0003\u001a9\u0012\u0004\u0012\u00020\u0005\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\u000b¢\u0006\u0004\b\f\u0010\rJ9\u0010\n\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRH\u0010\u0003\u001a9\u0012\u0004\u0012\u00020\u0005\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/kyant/backdrop/backdrops/Backdrop;", "Lcom/kyant/backdrop/Backdrop;", "backdrop", "onDraw", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "drawBackdrop", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lcom/kyant/backdrop/Backdrop;Lkotlin/jvm/functions/Function2;)V", "getBackdrop", "()Lcom/kyant/backdrop/Backdrop;", "getOnDraw", "()Lkotlin/jvm/functions/Function2;", "isCoordinatesDependent", "", "()Z", "density", "Landroidx/compose/ui/unit/Density;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Backdrop implements com.kyant.backdrop.Backdrop {
    private final com.kyant.backdrop.Backdrop backdrop;
    private final boolean isCoordinatesDependent;
    private final Function2<DrawScope, Function1<? super DrawScope, Unit>, Unit> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public Backdrop(com.kyant.backdrop.Backdrop backdrop, Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.backdrop = backdrop;
        this.onDraw = onDraw;
        this.isCoordinatesDependent = backdrop.getIsCoordinatesDependent();
    }

    public final com.kyant.backdrop.Backdrop getBackdrop() {
        return this.backdrop;
    }

    public final Function2<DrawScope, Function1<? super DrawScope, Unit>, Unit> getOnDraw() {
        return this.onDraw;
    }

    @Override // com.kyant.backdrop.Backdrop
    /* JADX INFO: renamed from: isCoordinatesDependent, reason: from getter */
    public boolean getIsCoordinatesDependent() {
        return this.isCoordinatesDependent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawBackdrop$lambda$1(Backdrop backdrop, Density density, LayoutCoordinates layoutCoordinates, Function1 function1, DrawScope onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "$this$onDraw");
        backdrop.backdrop.drawBackdrop(onDraw, density, layoutCoordinates, function1);
        return Unit.INSTANCE;
    }

    @Override // com.kyant.backdrop.Backdrop
    public void drawBackdrop(DrawScope drawScope, final Density density, final LayoutCoordinates layoutCoordinates, final Function1<? super GraphicsLayerScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        this.onDraw.invoke(drawScope, new Function1() { // from class: com.kyant.backdrop.backdrops.Backdrop$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Backdrop.drawBackdrop$lambda$1(this.f$0, density, layoutCoordinates, function1, (DrawScope) obj);
            }
        });
    }
}
