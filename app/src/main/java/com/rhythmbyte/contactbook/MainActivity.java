package com.rhythmbyte.contactbook;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/rhythmbyte/contactbook/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Display defaultDisplay;
        Display.Mode mode;
        super.onCreate(savedInstanceState);
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.rhythmbyte.contactbook.MainActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                MainActivity.onCreate$lambda$1(this.f$0, defaultUncaughtExceptionHandler, thread, th);
            }
        });
        MainActivity mainActivity = this;
        EdgeToEdge.enable$default(mainActivity, null, null, 3, null);
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                defaultDisplay = getDisplay();
            } else {
                defaultDisplay = getWindowManager().getDefaultDisplay();
            }
            Display.Mode[] supportedModes = defaultDisplay != null ? defaultDisplay.getSupportedModes() : null;
            if (supportedModes != null && supportedModes.length != 0) {
                mode = supportedModes[0];
                int lastIndex = ArraysKt.getLastIndex(supportedModes);
                if (lastIndex != 0) {
                    float refreshRate = mode.getRefreshRate();
                    if (1 <= lastIndex) {
                        int i = 1;
                        while (true) {
                            Display.Mode mode2 = supportedModes[i];
                            float refreshRate2 = mode2.getRefreshRate();
                            if (Float.compare(refreshRate, refreshRate2) < 0) {
                                mode = mode2;
                                refreshRate = refreshRate2;
                            }
                            if (i == lastIndex) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } else {
                mode = null;
            }
            float fCoerceAtLeast = mode != null ? RangesKt.coerceAtLeast(mode.getRefreshRate(), 120.0f) : 120.0f;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            if (mode != null) {
                attributes.preferredDisplayModeId = mode.getModeId();
            }
            attributes.preferredRefreshRate = fCoerceAtLeast;
            try {
                Field field = attributes.getClass().getField("preferredMinDisplayRefreshRate");
                Field field2 = attributes.getClass().getField("preferredMaxDisplayRefreshRate");
                field.setFloat(attributes, fCoerceAtLeast);
                field2.setFloat(attributes, fCoerceAtLeast);
            } catch (Throwable unused) {
            }
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().post(new Runnable() { // from class: com.rhythmbyte.contactbook.MainActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onCreate$lambda$3(this.f$0);
                }
            });
        } catch (Throwable unused2) {
        }
        ComponentActivityKt.setContent$default(mainActivity, null, ComposableSingletons$MainActivityKt.INSTANCE.m6716getLambda3$app_release(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(final MainActivity mainActivity, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, final Throwable th) {
        Log.e("ContactBookCrash", "Crash in thread " + thread.getName(), th);
        try {
            mainActivity.runOnUiThread(new Runnable() { // from class: com.rhythmbyte.contactbook.MainActivity$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onCreate$lambda$1$lambda$0(this.f$0, th);
                }
            });
        } catch (Throwable unused) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1$lambda$0(MainActivity mainActivity, Throwable th) {
        ComponentActivityKt.setContent$default(mainActivity, null, ComposableLambdaKt.composableLambdaInstance(-724835687, true, new MainActivity$onCreate$1$1$1(th, mainActivity)), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(MainActivity mainActivity) {
        try {
            mainActivity.getWindow().getDecorView().getClass().getMethod("setFrameRate", Float.TYPE, Integer.TYPE).invoke(mainActivity.getWindow().getDecorView(), Float.valueOf(120.0f), 0);
        } catch (Throwable unused) {
        }
    }
}
