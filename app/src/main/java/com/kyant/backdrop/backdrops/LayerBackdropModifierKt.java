package com.kyant.backdrop.backdrops;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerBackdropModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"layerBackdrop", "Landroidx/compose/ui/Modifier;", "backdrop", "Lcom/kyant/backdrop/backdrops/LayerBackdrop;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LayerBackdropModifierKt {
    public static final Modifier layerBackdrop(Modifier modifier, LayerBackdrop backdrop) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        return modifier.then(new LayerBackdropElement(backdrop));
    }
}
