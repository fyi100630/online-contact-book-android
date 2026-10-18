package com.kyant.backdrop.backdrops;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerBackdrop.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a<\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\f\"\u001f\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DefaultOnDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "rememberLayerBackdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawOnScreen", "", "onDraw", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LayerBackdropKt {
    private static final Function1<ContentDrawScope, Unit> DefaultOnDraw = new Function1() { // from class: com.kyant.backdrop.backdrops.LayerBackdropKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return LayerBackdropKt.DefaultOnDraw$lambda$0((ContentDrawScope) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultOnDraw$lambda$0(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        contentDrawScope.drawContent();
        return Unit.INSTANCE;
    }

    public static final LayerBackdrop rememberLayerBackdrop(GraphicsLayer graphicsLayer, boolean z, Function1<? super ContentDrawScope, Unit> function1, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-144902888);
        ComposerKt.sourceInformation(composer, "C(rememberLayerBackdrop)P(1)25@1063L23,29@1208L112:LayerBackdrop.kt#3v2h7d");
        if ((i2 & 1) != 0) {
            graphicsLayer = GraphicsLayerScopeKt.rememberGraphicsLayer(composer, 0);
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            function1 = DefaultOnDraw;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-144902888, i, -1, "com.kyant.backdrop.backdrops.rememberLayerBackdrop (LayerBackdrop.kt:28)");
        }
        composer.startReplaceGroup(-80936797);
        ComposerKt.sourceInformation(composer, "CC(remember):LayerBackdrop.kt#9igjgp");
        boolean zChanged = composer.changed(graphicsLayer) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(function1)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LayerBackdrop(graphicsLayer, z, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        LayerBackdrop layerBackdrop = (LayerBackdrop) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return layerBackdrop;
    }
}
