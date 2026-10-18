package com.kyant.backdrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.kyant.backdrop.backdrops.LayerBackdrop;
import com.kyant.backdrop.highlight.Highlight;
import com.kyant.backdrop.highlight.HighlightElement;
import com.kyant.backdrop.shadow.InnerShadow;
import com.kyant.backdrop.shadow.InnerShadowElement;
import com.kyant.backdrop.shadow.Shadow;
import com.kyant.backdrop.shadow.ShadowElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawBackdropModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001aú\u0001\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2?\b\u0002\u0010\u0018\u001a9\u0012\u0004\u0012\u00020\u0007\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n\u001a¶\u0002\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0012\b\u0002\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0012\b\u0002\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00012\u0012\b\u0002\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u00012\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2?\b\u0002\u0010\u0018\u001a9\u0012\u0004\u0012\u00020\u0007\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"6\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"DefaultHighlight", "Lkotlin/Function0;", "Lcom/kyant/backdrop/highlight/Highlight;", "DefaultShadow", "Lcom/kyant/backdrop/shadow/Shadow;", "DefaultOnDrawBackdrop", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "drawPlainBackdrop", "Landroidx/compose/ui/Modifier;", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "shape", "Landroidx/compose/ui/graphics/Shape;", "effects", "Lcom/kyant/backdrop/BackdropEffectScope;", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "exportedBackdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "onDrawBehind", "onDrawBackdrop", "Lkotlin/ParameterName;", "name", "drawBackdrop", "onDrawSurface", "onDrawFront", "highlight", "shadow", "innerShadow", "Lcom/kyant/backdrop/shadow/InnerShadow;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DrawBackdropModifierKt {
    private static final Function0<Highlight> DefaultHighlight = new Function0() { // from class: com.kyant.backdrop.DrawBackdropModifierKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DrawBackdropModifierKt.DefaultHighlight$lambda$0();
        }
    };
    private static final Function0<Shadow> DefaultShadow = new Function0() { // from class: com.kyant.backdrop.DrawBackdropModifierKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DrawBackdropModifierKt.DefaultShadow$lambda$1();
        }
    };
    private static final Function2<DrawScope, Function1<? super DrawScope, Unit>, Unit> DefaultOnDrawBackdrop = new Function2() { // from class: com.kyant.backdrop.DrawBackdropModifierKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return DrawBackdropModifierKt.DefaultOnDrawBackdrop$lambda$2((DrawScope) obj, (Function1) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Highlight DefaultHighlight$lambda$0() {
        return Highlight.INSTANCE.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow DefaultShadow$lambda$1() {
        return Shadow.INSTANCE.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultOnDrawBackdrop$lambda$2(DrawScope drawScope, Function1 it) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        it.invoke(drawScope);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier drawPlainBackdrop$default(Modifier modifier, Backdrop backdrop, Function0 function0, Function1 function1, Function1 function2, LayerBackdrop layerBackdrop, Function1 function3, Function2 function4, Function1 function5, Function1 function6, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = null;
        }
        if ((i & 16) != 0) {
            layerBackdrop = null;
        }
        if ((i & 32) != 0) {
            function3 = null;
        }
        if ((i & 64) != 0) {
            function4 = DefaultOnDrawBackdrop;
        }
        if ((i & 128) != 0) {
            function5 = null;
        }
        if ((i & 256) != 0) {
            function6 = null;
        }
        return drawPlainBackdrop(modifier, backdrop, function0, function1, function2, layerBackdrop, function3, function4, function5, function6);
    }

    public static final Modifier drawPlainBackdrop(Modifier modifier, Backdrop backdrop, Function0<? extends Shape> shape, Function1<? super BackdropEffectScope, Unit> effects, Function1<? super GraphicsLayerScope, Unit> function1, LayerBackdrop layerBackdrop, Function1<? super DrawScope, Unit> function2, Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDrawBackdrop, Function1<? super DrawScope, Unit> function3, Function1<? super DrawScope, Unit> function4) {
        Modifier.Companion companionGraphicsLayer;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(onDrawBackdrop, "onDrawBackdrop");
        ShapeProvider shapeProvider = new ShapeProvider(shape);
        if (function1 != null) {
            companionGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, function1);
        } else {
            companionGraphicsLayer = Modifier.INSTANCE;
        }
        return modifier.then(companionGraphicsLayer).then(new DrawBackdropElement(backdrop, shapeProvider, effects, function1, layerBackdrop, function2, onDrawBackdrop, function3, function4));
    }

    public static final Modifier drawBackdrop(Modifier modifier, Backdrop backdrop, Function0<? extends Shape> shape, Function1<? super BackdropEffectScope, Unit> effects, Function0<Highlight> function0, Function0<Shadow> function1, Function0<InnerShadow> function2, Function1<? super GraphicsLayerScope, Unit> function3, LayerBackdrop layerBackdrop, Function1<? super DrawScope, Unit> function4, Function2<? super DrawScope, ? super Function1<? super DrawScope, Unit>, Unit> onDrawBackdrop, Function1<? super DrawScope, Unit> function5, Function1<? super DrawScope, Unit> function6) {
        Modifier.Companion companionGraphicsLayer;
        Modifier.Companion innerShadowElement;
        Modifier.Companion shadowElement;
        Modifier.Companion highlightElement;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(onDrawBackdrop, "onDrawBackdrop");
        ShapeProvider shapeProvider = new ShapeProvider(shape);
        if (function3 != null) {
            companionGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, function3);
        } else {
            companionGraphicsLayer = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifier.then(companionGraphicsLayer);
        if (function2 != null) {
            innerShadowElement = new InnerShadowElement(shapeProvider, function2);
        } else {
            innerShadowElement = Modifier.INSTANCE;
        }
        Modifier modifierThen2 = modifierThen.then(innerShadowElement);
        if (function1 != null) {
            shadowElement = new ShadowElement(shapeProvider, function1);
        } else {
            shadowElement = Modifier.INSTANCE;
        }
        Modifier modifierThen3 = modifierThen2.then(shadowElement);
        if (function0 != null) {
            highlightElement = new HighlightElement(shapeProvider, function0);
        } else {
            highlightElement = Modifier.INSTANCE;
        }
        return modifierThen3.then(highlightElement).then(new DrawBackdropElement(backdrop, shapeProvider, effects, function3, layerBackdrop, function4, onDrawBackdrop, function5, function6));
    }
}
