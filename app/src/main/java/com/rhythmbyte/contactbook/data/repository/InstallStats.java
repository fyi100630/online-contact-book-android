package com.rhythmbyte.contactbook.data.repository;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflineDataRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/rhythmbyte/contactbook/data/repository/InstallStats;", "", "totalInstalls", "", "versionCounts", "", "", "<init>", "(ILjava/util/Map;)V", "getTotalInstalls", "()I", "getVersionCounts", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InstallStats {
    public static final int $stable = 8;
    private final int totalInstalls;
    private final Map<String, Integer> versionCounts;

    /* JADX WARN: Multi-variable type inference failed */
    public InstallStats() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstallStats copy$default(InstallStats installStats, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = installStats.totalInstalls;
        }
        if ((i2 & 2) != 0) {
            map = installStats.versionCounts;
        }
        return installStats.copy(i, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalInstalls() {
        return this.totalInstalls;
    }

    public final Map<String, Integer> component2() {
        return this.versionCounts;
    }

    public final InstallStats copy(int totalInstalls, Map<String, Integer> versionCounts) {
        Intrinsics.checkNotNullParameter(versionCounts, "versionCounts");
        return new InstallStats(totalInstalls, versionCounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallStats)) {
            return false;
        }
        InstallStats installStats = (InstallStats) other;
        return this.totalInstalls == installStats.totalInstalls && Intrinsics.areEqual(this.versionCounts, installStats.versionCounts);
    }

    public int hashCode() {
        return (Integer.hashCode(this.totalInstalls) * 31) + this.versionCounts.hashCode();
    }

    public String toString() {
        return "InstallStats(totalInstalls=" + this.totalInstalls + ", versionCounts=" + this.versionCounts + ")";
    }

    public InstallStats(int i, Map<String, Integer> versionCounts) {
        Intrinsics.checkNotNullParameter(versionCounts, "versionCounts");
        this.totalInstalls = i;
        this.versionCounts = versionCounts;
    }

    public final int getTotalInstalls() {
        return this.totalInstalls;
    }

    public /* synthetic */ InstallStats(int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, Integer> getVersionCounts() {
        return this.versionCounts;
    }
}
