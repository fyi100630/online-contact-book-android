package com.kyant.backdrop;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackdropEffectScope.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0017J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u001f\u0010/\u001a\u0002002\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020002¢\u0006\u0002\b3J\u0006\u00104\u001a\u000200R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/kyant/backdrop/BackdropEffectScopeImpl;", "Lcom/kyant/backdrop/BackdropEffectScope;", "Lcom/kyant/backdrop/RuntimeShaderCache;", "<init>", "()V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "padding", "getPadding", "setPadding", "renderEffect", "Landroid/graphics/RenderEffect;", "getRenderEffect", "()Landroid/graphics/RenderEffect;", "setRenderEffect", "(Landroid/graphics/RenderEffect;)V", "runtimeShaderCache", "Lcom/kyant/backdrop/RuntimeShaderCacheImpl;", "obtainRuntimeShader", "Landroid/graphics/RuntimeShader;", "key", "", "string", "update", "", "scope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "apply", "", "effects", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reset", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BackdropEffectScopeImpl implements BackdropEffectScope, RuntimeShaderCache {
    public static final int $stable = 0;
    private float padding;
    private RenderEffect renderEffect;
    private float density = 1.0f;
    private float fontScale = 1.0f;
    private long size = Size.INSTANCE.m3679getUnspecifiedNHjbRc();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final RuntimeShaderCacheImpl runtimeShaderCache = new RuntimeShaderCacheImpl();

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    public void setDensity(float f) {
        this.density = f;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public void setFontScale(float f) {
        this.fontScale = f;
    }

    @Override // com.kyant.backdrop.BackdropEffectScope
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: from getter */
    public long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m6624setSizeuvyYCjk(long j) {
        this.size = j;
    }

    @Override // com.kyant.backdrop.BackdropEffectScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public void setLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    @Override // com.kyant.backdrop.BackdropEffectScope
    public float getPadding() {
        return this.padding;
    }

    @Override // com.kyant.backdrop.BackdropEffectScope
    public void setPadding(float f) {
        this.padding = f;
    }

    @Override // com.kyant.backdrop.BackdropEffectScope
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // com.kyant.backdrop.BackdropEffectScope
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // com.kyant.backdrop.RuntimeShaderCache
    public RuntimeShader obtainRuntimeShader(String key, String string) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(string, "string");
        return this.runtimeShaderCache.obtainRuntimeShader(key, string);
    }

    public final boolean update(DrawScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        float density = scope.getDensity();
        float fontScale = scope.getFontScale();
        long jMo4399getSizeNHjbRc = scope.mo4399getSizeNHjbRc();
        LayoutDirection layoutDirection = scope.getLayoutDirection();
        boolean z = (density == getDensity() && fontScale == getFontScale() && Size.m3667equalsimpl0(jMo4399getSizeNHjbRc, getSize()) && layoutDirection == getLayoutDirection()) ? false : true;
        if (z) {
            setDensity(density);
            setFontScale(fontScale);
            m6624setSizeuvyYCjk(jMo4399getSizeNHjbRc);
            setLayoutDirection(layoutDirection);
        }
        return z;
    }

    public final void apply(Function1<? super BackdropEffectScope, Unit> effects) {
        Intrinsics.checkNotNullParameter(effects, "effects");
        setPadding(0.0f);
        setRenderEffect(null);
        effects.invoke(this);
    }

    public final void reset() {
        setDensity(1.0f);
        setFontScale(1.0f);
        m6624setSizeuvyYCjk(Size.INSTANCE.m3679getUnspecifiedNHjbRc());
        setLayoutDirection(LayoutDirection.Ltr);
        setPadding(0.0f);
        setRenderEffect(null);
        this.runtimeShaderCache.clear();
    }
}
