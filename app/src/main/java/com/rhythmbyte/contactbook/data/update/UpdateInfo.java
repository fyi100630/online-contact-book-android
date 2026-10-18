package com.rhythmbyte.contactbook.data.update;

import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpdateManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/rhythmbyte/contactbook/data/update/UpdateInfo;", "", "versionName", "", LinkHeader.Parameters.Title, "changelog", "apkDownloadUrl", "apkSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getVersionName", "()Ljava/lang/String;", "getTitle", "getChangelog", "getApkDownloadUrl", "getApkSize", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateInfo {
    public static final int $stable = 0;
    private final String apkDownloadUrl;
    private final long apkSize;
    private final String changelog;
    private final String title;
    private final String versionName;

    public static /* synthetic */ UpdateInfo copy$default(UpdateInfo updateInfo, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateInfo.versionName;
        }
        if ((i & 2) != 0) {
            str2 = updateInfo.title;
        }
        if ((i & 4) != 0) {
            str3 = updateInfo.changelog;
        }
        if ((i & 8) != 0) {
            str4 = updateInfo.apkDownloadUrl;
        }
        if ((i & 16) != 0) {
            j = updateInfo.apkSize;
        }
        long j2 = j;
        return updateInfo.copy(str, str2, str3, str4, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChangelog() {
        return this.changelog;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApkDownloadUrl() {
        return this.apkDownloadUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getApkSize() {
        return this.apkSize;
    }

    public final UpdateInfo copy(String versionName, String title, String changelog, String apkDownloadUrl, long apkSize) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(changelog, "changelog");
        Intrinsics.checkNotNullParameter(apkDownloadUrl, "apkDownloadUrl");
        return new UpdateInfo(versionName, title, changelog, apkDownloadUrl, apkSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) other;
        return Intrinsics.areEqual(this.versionName, updateInfo.versionName) && Intrinsics.areEqual(this.title, updateInfo.title) && Intrinsics.areEqual(this.changelog, updateInfo.changelog) && Intrinsics.areEqual(this.apkDownloadUrl, updateInfo.apkDownloadUrl) && this.apkSize == updateInfo.apkSize;
    }

    public int hashCode() {
        return (((((((this.versionName.hashCode() * 31) + this.title.hashCode()) * 31) + this.changelog.hashCode()) * 31) + this.apkDownloadUrl.hashCode()) * 31) + Long.hashCode(this.apkSize);
    }

    public String toString() {
        return "UpdateInfo(versionName=" + this.versionName + ", title=" + this.title + ", changelog=" + this.changelog + ", apkDownloadUrl=" + this.apkDownloadUrl + ", apkSize=" + this.apkSize + ")";
    }

    public UpdateInfo(String versionName, String title, String changelog, String apkDownloadUrl, long j) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(changelog, "changelog");
        Intrinsics.checkNotNullParameter(apkDownloadUrl, "apkDownloadUrl");
        this.versionName = versionName;
        this.title = title;
        this.changelog = changelog;
        this.apkDownloadUrl = apkDownloadUrl;
        this.apkSize = j;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getChangelog() {
        return this.changelog;
    }

    public final String getApkDownloadUrl() {
        return this.apkDownloadUrl;
    }

    public final long getApkSize() {
        return this.apkSize;
    }
}
