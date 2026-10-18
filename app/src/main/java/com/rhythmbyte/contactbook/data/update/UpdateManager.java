package com.rhythmbyte.contactbook.data.update;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/** No-network placeholder. Update checks and downloads are disabled. */
public final class UpdateManager {
    public static final UpdateManager INSTANCE = new UpdateManager();
    private UpdateManager() {}
    public final boolean isNewerVersion(String current, String remote) { return false; }
    public final Object checkForUpdates(String current, Continuation<? super UpdateInfo> continuation) { return null; }
    public final Object downloadApk(Context context, String url, Function1<? super DownloadState, Unit> progress,
            Continuation<? super File> continuation) { return null; }
    public final boolean installApk(Context context, File apkFile) { return false; }
}
