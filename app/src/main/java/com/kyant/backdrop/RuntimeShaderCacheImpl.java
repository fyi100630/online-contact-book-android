package com.kyant.backdrop;

import android.graphics.RuntimeShader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RuntimeShaderCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0017J\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/kyant/backdrop/RuntimeShaderCacheImpl;", "Lcom/kyant/backdrop/RuntimeShaderCache;", "<init>", "()V", "runtimeShaders", "", "", "Landroid/graphics/RuntimeShader;", "obtainRuntimeShader", "key", "string", "clear", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RuntimeShaderCacheImpl implements RuntimeShaderCache {
    public static final int $stable = 8;
    private final Map<String, RuntimeShader> runtimeShaders = new LinkedHashMap();

    @Override // com.kyant.backdrop.RuntimeShaderCache
    public RuntimeShader obtainRuntimeShader(String key, String string) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(string, "string");
        Map<String, RuntimeShader> map = this.runtimeShaders;
        RuntimeShader runtimeShader = map.get(key);
        if (runtimeShader == null) {
            runtimeShader = new RuntimeShader(string);
            map.put(key, runtimeShader);
        }
        return runtimeShader;
    }

    public final void clear() {
        this.runtimeShaders.clear();
    }
}
