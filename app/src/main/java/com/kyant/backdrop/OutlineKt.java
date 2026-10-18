package com.kyant.backdrop;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, d2 = {"clipOutline", "", "Landroidx/compose/ui/graphics/Canvas;", "outline", "Landroidx/compose/ui/graphics/Outline;", "path", "Landroidx/compose/ui/graphics/Path;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class OutlineKt {
    public static final void clipOutline(Canvas canvas, Outline outline, Path path) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            Canvas.m3816clipRectmtrdDE$default(canvas, ((Outline.Rectangle) outline).getRect(), 0, 2, null);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Intrinsics.checkNotNull(path);
            path.rewind();
            Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
            Canvas.m3814clipPathmtrdDE$default(canvas, path, 0, 2, null);
            return;
        }
        if (!(outline instanceof Outline.Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        Canvas.m3814clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
    }
}
