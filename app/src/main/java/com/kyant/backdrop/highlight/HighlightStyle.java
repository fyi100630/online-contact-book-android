package com.kyant.backdrop.highlight;

import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.kyant.backdrop.RuntimeShaderCache;
import com.kyant.backdrop.ShadersKt;
import io.ktor.http.ContentDisposition;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HighlightStyle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00152\u00020\u0001:\u0004\u0012\u0013\u0014\u0015J$\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shape", "Landroidx/compose/ui/graphics/Shape;", "runtimeShaderCache", "Lcom/kyant/backdrop/RuntimeShaderCache;", "Plain", "Default", "Ambient", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HighlightStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Shader createShader(DrawScope drawScope, Shape shape, RuntimeShaderCache runtimeShaderCache);

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int getBlendMode();

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    long getColor();

    /* JADX INFO: compiled from: HighlightStyle.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\fJ$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightStyle$Plain;", "Lcom/kyant/backdrop/highlight/HighlightStyle;", "color", "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "<init>", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getBlendMode-0nO6VwU", "()I", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shape", "Landroidx/compose/ui/graphics/Shape;", "runtimeShaderCache", "Lcom/kyant/backdrop/RuntimeShaderCache;", "component1", "component1-0d7_KjU", "component2", "component2-0nO6VwU", "copy", "copy-xETnrds", "(JI)Lcom/kyant/backdrop/highlight/HighlightStyle$Plain;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Plain implements HighlightStyle {
        public static final int $stable = 0;
        private final int blendMode;
        private final long color;

        public /* synthetic */ Plain(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i);
        }

        /* JADX INFO: renamed from: copy-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ Plain m6652copyxETnrds$default(Plain plain, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = plain.color;
            }
            if ((i2 & 2) != 0) {
                i = plain.blendMode;
            }
            return plain.m6655copyxETnrds(j, i);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component2-0nO6VwU, reason: not valid java name and from getter */
        public final int getBlendMode() {
            return this.blendMode;
        }

        /* JADX INFO: renamed from: copy-xETnrds, reason: not valid java name */
        public final Plain m6655copyxETnrds(long color, int blendMode) {
            return new Plain(color, blendMode, null);
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        public Shader createShader(DrawScope drawScope, Shape shape, RuntimeShaderCache runtimeShaderCache) {
            Intrinsics.checkNotNullParameter(drawScope, "<this>");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(runtimeShaderCache, "runtimeShaderCache");
            return null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plain)) {
                return false;
            }
            Plain plain = (Plain) other;
            return Color.m3844equalsimpl0(this.color, plain.color) && BlendMode.m3754equalsimpl0(this.blendMode, plain.blendMode);
        }

        public int hashCode() {
            return (Color.m3850hashCodeimpl(this.color) * 31) + BlendMode.m3755hashCodeimpl(this.blendMode);
        }

        public String toString() {
            return "Plain(color=" + Color.m3851toStringimpl(this.color) + ", blendMode=" + BlendMode.m3756toStringimpl(this.blendMode) + ")";
        }

        private Plain(long j, int i) {
            this.color = j;
            this.blendMode = i;
        }

        public /* synthetic */ Plain(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j, (i2 & 2) != 0 ? BlendMode.INSTANCE.m3777getPlus0nO6VwU() : i, null);
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        /* JADX INFO: renamed from: getColor-0d7_KjU */
        public long getColor() {
            return this.color;
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
        public int getBlendMode() {
            return this.blendMode;
        }
    }

    /* JADX INFO: compiled from: HighlightStyle.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fJ$\u0010\u0016\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0011J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J8\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006/"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightStyle$Default;", "Lcom/kyant/backdrop/highlight/HighlightStyle;", "color", "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "angle", "", "falloff", "<init>", "(JIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intensity", "(FFF)V", "getColor-0d7_KjU", "()J", "J", "getBlendMode-0nO6VwU", "()I", "I", "getAngle", "()F", "getFalloff", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shape", "Landroidx/compose/ui/graphics/Shape;", "runtimeShaderCache", "Lcom/kyant/backdrop/RuntimeShaderCache;", "component1", "component1-0d7_KjU", "component2", "component2-0nO6VwU", "component3", "component4", "copy", "copy-UVf8vpc", "(JIFF)Lcom/kyant/backdrop/highlight/HighlightStyle$Default;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Default implements HighlightStyle {
        public static final int $stable = 0;
        private final float angle;
        private final int blendMode;
        private final long color;
        private final float falloff;

        public /* synthetic */ Default(long j, int i, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i, f, f2);
        }

        /* JADX INFO: renamed from: copy-UVf8vpc$default, reason: not valid java name */
        public static /* synthetic */ Default m6648copyUVf8vpc$default(Default r6, long j, int i, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = r6.color;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                i = r6.blendMode;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                f = r6.angle;
            }
            float f3 = f;
            if ((i2 & 8) != 0) {
                f2 = r6.falloff;
            }
            return r6.m6651copyUVf8vpc(j2, i3, f3, f2);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component2-0nO6VwU, reason: not valid java name and from getter */
        public final int getBlendMode() {
            return this.blendMode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getAngle() {
            return this.angle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getFalloff() {
            return this.falloff;
        }

        /* JADX INFO: renamed from: copy-UVf8vpc, reason: not valid java name */
        public final Default m6651copyUVf8vpc(long color, int blendMode, float angle, float falloff) {
            return new Default(color, blendMode, angle, falloff, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r8 = (Default) other;
            return Color.m3844equalsimpl0(this.color, r8.color) && BlendMode.m3754equalsimpl0(this.blendMode, r8.blendMode) && Float.compare(this.angle, r8.angle) == 0 && Float.compare(this.falloff, r8.falloff) == 0;
        }

        public int hashCode() {
            return (((((Color.m3850hashCodeimpl(this.color) * 31) + BlendMode.m3755hashCodeimpl(this.blendMode)) * 31) + Float.hashCode(this.angle)) * 31) + Float.hashCode(this.falloff);
        }

        public String toString() {
            return "Default(color=" + Color.m3851toStringimpl(this.color) + ", blendMode=" + BlendMode.m3756toStringimpl(this.blendMode) + ", angle=" + this.angle + ", falloff=" + this.falloff + ")";
        }

        private Default(long j, int i, float f, float f2) {
            this.color = j;
            this.blendMode = i;
            this.angle = f;
            this.falloff = f2;
        }

        public /* synthetic */ Default(long j, int i, float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : j, (i2 & 2) != 0 ? BlendMode.INSTANCE.m3777getPlus0nO6VwU() : i, (i2 & 4) != 0 ? 45.0f : f, (i2 & 8) != 0 ? 1.0f : f2, (DefaultConstructorMarker) null);
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        /* JADX INFO: renamed from: getColor-0d7_KjU */
        public long getColor() {
            return this.color;
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
        public int getBlendMode() {
            return this.blendMode;
        }

        public final float getAngle() {
            return this.angle;
        }

        public final float getFalloff() {
            return this.falloff;
        }

        public /* synthetic */ Default(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, (i & 2) != 0 ? 45.0f : f2, (i & 4) != 0 ? 1.0f : f3);
        }

        @Deprecated(message = "Use the constructor with color parameter instead.", replaceWith = @ReplaceWith(expression = "HighlightStyle.Default(color = Color.White.copy(alpha = intensity), angle = angle, falloff = falloff)", imports = {}))
        public Default(float f, float f2, float f3) {
            this(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), 0, f2, f3, 2, null);
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        public Shader createShader(DrawScope drawScope, Shape shape, RuntimeShaderCache runtimeShaderCache) {
            Intrinsics.checkNotNullParameter(drawScope, "<this>");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(runtimeShaderCache, "runtimeShaderCache");
            RuntimeShader runtimeShader = null;
            if (Build.VERSION.SDK_INT < 33) {
                return null;
            }
            try {
                RuntimeShader runtimeShaderObtainRuntimeShader = runtimeShaderCache.obtainRuntimeShader("Default", ShadersKt.DefaultHighlightShaderString);
                runtimeShaderObtainRuntimeShader.setFloatUniform(ContentDisposition.Parameters.Size, Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Size.m3668getHeightimpl(drawScope.mo4399getSizeNHjbRc()));
                runtimeShaderObtainRuntimeShader.setFloatUniform("cornerRadii", HighlightStyleKt.getCornerRadii(drawScope, shape));
                runtimeShaderObtainRuntimeShader.setColorUniform("color", ColorKt.m3897toArgb8_81llA(Color.m3842copywmQWz5c$default(getColor(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null)));
                runtimeShaderObtainRuntimeShader.setFloatUniform("angle", this.angle * 0.017453292f);
                runtimeShaderObtainRuntimeShader.setFloatUniform("falloff", this.falloff);
                runtimeShader = runtimeShaderObtainRuntimeShader;
            } catch (Throwable unused) {
            }
            return runtimeShader;
        }
    }

    /* JADX INFO: compiled from: HighlightStyle.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightStyle$Ambient;", "Lcom/kyant/backdrop/highlight/HighlightStyle;", "intensity", "", "<init>", "(F)V", "getIntensity", "()F", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "J", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shape", "Landroidx/compose/ui/graphics/Shape;", "runtimeShaderCache", "Lcom/kyant/backdrop/RuntimeShaderCache;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ambient implements HighlightStyle {
        public static final int $stable = 0;
        private final int blendMode;
        private final long color;
        private final float intensity;

        public Ambient() {
            this(0.0f, 1, null);
        }

        public static /* synthetic */ Ambient copy$default(Ambient ambient, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = ambient.intensity;
            }
            return ambient.copy(f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getIntensity() {
            return this.intensity;
        }

        public final Ambient copy(float intensity) {
            return new Ambient(intensity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ambient) && Float.compare(this.intensity, ((Ambient) other).intensity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.intensity);
        }

        public String toString() {
            return "Ambient(intensity=" + this.intensity + ")";
        }

        public Ambient(float f) {
            this.intensity = f;
            this.color = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null);
            this.blendMode = DrawScope.INSTANCE.m4401getDefaultBlendMode0nO6VwU();
        }

        public /* synthetic */ Ambient(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.38f : f);
        }

        public final float getIntensity() {
            return this.intensity;
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: from getter */
        public long getColor() {
            return this.color;
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: from getter */
        public int getBlendMode() {
            return this.blendMode;
        }

        @Override // com.kyant.backdrop.highlight.HighlightStyle
        public Shader createShader(DrawScope drawScope, Shape shape, RuntimeShaderCache runtimeShaderCache) {
            Intrinsics.checkNotNullParameter(drawScope, "<this>");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(runtimeShaderCache, "runtimeShaderCache");
            RuntimeShader runtimeShader = null;
            if (Build.VERSION.SDK_INT < 33) {
                return null;
            }
            try {
                RuntimeShader runtimeShaderObtainRuntimeShader = runtimeShaderCache.obtainRuntimeShader("Ambient", ShadersKt.AmbientHighlightShaderString);
                runtimeShaderObtainRuntimeShader.setFloatUniform(ContentDisposition.Parameters.Size, Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Size.m3668getHeightimpl(drawScope.mo4399getSizeNHjbRc()));
                runtimeShaderObtainRuntimeShader.setFloatUniform("cornerRadii", HighlightStyleKt.getCornerRadii(drawScope, shape));
                runtimeShaderObtainRuntimeShader.setFloatUniform("angle", 0.7853982f);
                runtimeShaderObtainRuntimeShader.setFloatUniform("falloff", 1.0f);
                runtimeShader = runtimeShaderObtainRuntimeShader;
            } catch (Throwable unused) {
            }
            return runtimeShader;
        }
    }

    /* JADX INFO: compiled from: HighlightStyle.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kyant/backdrop/highlight/HighlightStyle$Companion;", "", "<init>", "()V", "Default", "Lcom/kyant/backdrop/highlight/HighlightStyle$Default;", "getDefault$annotations", "getDefault", "()Lcom/kyant/backdrop/highlight/HighlightStyle$Default;", "Ambient", "Lcom/kyant/backdrop/highlight/HighlightStyle$Ambient;", "getAmbient$annotations", "getAmbient", "()Lcom/kyant/backdrop/highlight/HighlightStyle$Ambient;", "Plain", "Lcom/kyant/backdrop/highlight/HighlightStyle$Plain;", "getPlain$annotations", "getPlain", "()Lcom/kyant/backdrop/highlight/HighlightStyle$Plain;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Default Default = new Default(0, 0, 0.0f, 0.0f, 15, null);
        private static final Ambient Ambient = new Ambient(0.0f, 1, null);
        private static final Plain Plain = new Plain(0, 0, 3, null);

        public static /* synthetic */ void getAmbient$annotations() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getPlain$annotations() {
        }

        private Companion() {
        }

        public final Default getDefault() {
            return Default;
        }

        public final Ambient getAmbient() {
            return Ambient;
        }

        public final Plain getPlain() {
            return Plain;
        }
    }
}
