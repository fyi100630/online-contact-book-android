package com.rhythmbyte.contactbook.data.update;

import androidx.core.app.NotificationCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpdateManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/rhythmbyte/contactbook/data/update/DownloadState;", "", "<init>", "()V", "Idle", "Downloading", "Finished", "Error", "Lcom/rhythmbyte/contactbook/data/update/DownloadState$Downloading;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState$Error;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState$Finished;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState$Idle;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DownloadState {
    public static final int $stable = 0;

    public /* synthetic */ DownloadState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: UpdateManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/rhythmbyte/contactbook/data/update/DownloadState$Idle;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle extends DownloadState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    private DownloadState() {
    }

    /* JADX INFO: compiled from: UpdateManager.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/rhythmbyte/contactbook/data/update/DownloadState$Downloading;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState;", NotificationCompat.CATEGORY_PROGRESS, "", "downloadedBytes", "", "totalBytes", "<init>", "(FJJ)V", "getProgress", "()F", "getDownloadedBytes", "()J", "getTotalBytes", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Downloading extends DownloadState {
        public static final int $stable = 0;
        private final long downloadedBytes;
        private final float progress;
        private final long totalBytes;

        public static /* synthetic */ Downloading copy$default(Downloading downloading, float f, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = downloading.progress;
            }
            if ((i & 2) != 0) {
                j = downloading.downloadedBytes;
            }
            if ((i & 4) != 0) {
                j2 = downloading.totalBytes;
            }
            return downloading.copy(f, j, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getDownloadedBytes() {
            return this.downloadedBytes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTotalBytes() {
            return this.totalBytes;
        }

        public final Downloading copy(float progress, long downloadedBytes, long totalBytes) {
            return new Downloading(progress, downloadedBytes, totalBytes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Downloading)) {
                return false;
            }
            Downloading downloading = (Downloading) other;
            return Float.compare(this.progress, downloading.progress) == 0 && this.downloadedBytes == downloading.downloadedBytes && this.totalBytes == downloading.totalBytes;
        }

        public int hashCode() {
            return (((Float.hashCode(this.progress) * 31) + Long.hashCode(this.downloadedBytes)) * 31) + Long.hashCode(this.totalBytes);
        }

        public String toString() {
            return "Downloading(progress=" + this.progress + ", downloadedBytes=" + this.downloadedBytes + ", totalBytes=" + this.totalBytes + ")";
        }

        public final float getProgress() {
            return this.progress;
        }

        public final long getDownloadedBytes() {
            return this.downloadedBytes;
        }

        public final long getTotalBytes() {
            return this.totalBytes;
        }

        public Downloading(float f, long j, long j2) {
            super(null);
            this.progress = f;
            this.downloadedBytes = j;
            this.totalBytes = j2;
        }
    }

    /* JADX INFO: compiled from: UpdateManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/rhythmbyte/contactbook/data/update/DownloadState$Finished;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState;", "apkFile", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getApkFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Finished extends DownloadState {
        public static final int $stable = 8;
        private final File apkFile;

        public static /* synthetic */ Finished copy$default(Finished finished, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                file = finished.apkFile;
            }
            return finished.copy(file);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getApkFile() {
            return this.apkFile;
        }

        public final Finished copy(File apkFile) {
            Intrinsics.checkNotNullParameter(apkFile, "apkFile");
            return new Finished(apkFile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Finished) && Intrinsics.areEqual(this.apkFile, ((Finished) other).apkFile);
        }

        public int hashCode() {
            return this.apkFile.hashCode();
        }

        public String toString() {
            return "Finished(apkFile=" + this.apkFile + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finished(File apkFile) {
            super(null);
            Intrinsics.checkNotNullParameter(apkFile, "apkFile");
            this.apkFile = apkFile;
        }

        public final File getApkFile() {
            return this.apkFile;
        }
    }

    /* JADX INFO: compiled from: UpdateManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/rhythmbyte/contactbook/data/update/DownloadState$Error;", "Lcom/rhythmbyte/contactbook/data/update/DownloadState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends DownloadState {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
