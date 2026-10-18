package com.kyant.backdrop;

import android.graphics.RuntimeShader;
import kotlin.Metadata;

/* JADX INFO: compiled from: RuntimeShaderCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kyant/backdrop/RuntimeShaderCache;", "", "obtainRuntimeShader", "Landroid/graphics/RuntimeShader;", "key", "", "string", "Lcom/kyant/backdrop/BackdropEffectScope;", "Lcom/kyant/backdrop/BackdropEffectScopeImpl;", "Lcom/kyant/backdrop/RuntimeShaderCacheImpl;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RuntimeShaderCache {
    RuntimeShader obtainRuntimeShader(String key, String string);
}
