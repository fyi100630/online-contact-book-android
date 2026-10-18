package com.kyant.backdrop;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShapeProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/kyant/backdrop/ShapeProvider;", "", "shapeBlock", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getShapeBlock", "()Lkotlin/jvm/functions/Function0;", "_shape", "_outline", "Landroidx/compose/ui/graphics/Outline;", "_size", "Landroidx/compose/ui/geometry/Size;", "J", "_layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "_density", "", "Ljava/lang/Float;", "innerShape", "getInnerShape", "()Landroidx/compose/ui/graphics/Shape;", "shape", "getShape", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShapeProvider {
    public static final int $stable = 0;
    private Float _density;
    private LayoutDirection _layoutDirection;
    private Outline _outline;
    private Shape _shape;
    private long _size;
    private final Shape shape;
    private final Function0<Shape> shapeBlock;

    /* JADX WARN: Multi-variable type inference failed */
    public ShapeProvider(Function0<? extends Shape> shapeBlock) {
        Intrinsics.checkNotNullParameter(shapeBlock, "shapeBlock");
        this.shapeBlock = shapeBlock;
        this._size = Size.INSTANCE.m3679getUnspecifiedNHjbRc();
        this.shape = new Shape() { // from class: com.kyant.backdrop.ShapeProvider$shape$1
            @Override // androidx.compose.ui.graphics.Shape
            /* JADX INFO: renamed from: createOutline-Pq9zytI */
            public Outline mo287createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                Shape shapeInvoke = this.this$0.getShapeBlock().invoke();
                if (!Intrinsics.areEqual(this.this$0._shape, shapeInvoke)) {
                    this.this$0._shape = shapeInvoke;
                    this.this$0._outline = null;
                }
                if (this.this$0._outline == null || !Size.m3667equalsimpl0(this.this$0._size, size) || this.this$0._layoutDirection != layoutDirection || !Intrinsics.areEqual(this.this$0._density, density.getDensity())) {
                    this.this$0._size = size;
                    this.this$0._layoutDirection = layoutDirection;
                    this.this$0._density = Float.valueOf(density.getDensity());
                    this.this$0._outline = shapeInvoke.mo287createOutlinePq9zytI(size, layoutDirection, density);
                }
                Outline outline = this.this$0._outline;
                Intrinsics.checkNotNull(outline);
                return outline;
            }
        };
    }

    public final Function0<Shape> getShapeBlock() {
        return this.shapeBlock;
    }

    public final Shape getInnerShape() {
        return this.shapeBlock.invoke();
    }

    public final Shape getShape() {
        return this.shape;
    }
}
