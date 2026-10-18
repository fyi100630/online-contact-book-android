package com.rhythmbyte.contactbook.ui.viewmodel;

import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import com.rhythmbyte.contactbook.data.model.UserRole;
import com.rhythmbyte.contactbook.data.repository.InstallStats;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContactBookViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\t\u0010A\u001a\u00020\u001aHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003JÏ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000fHÆ\u0001J\u0013\u0010D\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010)R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010)R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010)¨\u0006I"}, d2 = {"Lcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookUiState;", "", "classTitle", "", "announcement", "allRecords", "", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "selectedDate", "yesterdayDate", "todayDate", "tomorrowDate", "userRole", "Lcom/rhythmbyte/contactbook/data/model/UserRole;", "isLoading", "", "isRealtimeConnected", "errorMessage", "toastMessage", "logsList", "Lcom/rhythmbyte/contactbook/data/model/ContactBookLogEntry;", "isLoadingLogs", "installStats", "Lcom/rhythmbyte/contactbook/data/repository/InstallStats;", "isLoadingStats", "timetable", "Lcom/rhythmbyte/contactbook/data/model/TimetableData;", "isLoadingTimetable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/rhythmbyte/contactbook/data/model/UserRole;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/rhythmbyte/contactbook/data/repository/InstallStats;ZLcom/rhythmbyte/contactbook/data/model/TimetableData;Z)V", "getClassTitle", "()Ljava/lang/String;", "getAnnouncement", "getAllRecords", "()Ljava/util/List;", "getSelectedDate", "getYesterdayDate", "getTodayDate", "getTomorrowDate", "getUserRole", "()Lcom/rhythmbyte/contactbook/data/model/UserRole;", "()Z", "getErrorMessage", "getToastMessage", "getLogsList", "getInstallStats", "()Lcom/rhythmbyte/contactbook/data/repository/InstallStats;", "getTimetable", "()Lcom/rhythmbyte/contactbook/data/model/TimetableData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ContactBookUiState {
    public static final int $stable = 8;
    private final List<ItemRecord> allRecords;
    private final String announcement;
    private final String classTitle;
    private final String errorMessage;
    private final InstallStats installStats;
    private final boolean isLoading;
    private final boolean isLoadingLogs;
    private final boolean isLoadingStats;
    private final boolean isLoadingTimetable;
    private final boolean isRealtimeConnected;
    private final List<ContactBookLogEntry> logsList;
    private final String selectedDate;
    private final TimetableData timetable;
    private final String toastMessage;
    private final String todayDate;
    private final String tomorrowDate;
    private final UserRole userRole;
    private final String yesterdayDate;

    public ContactBookUiState() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 262143, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactBookUiState copy$default(ContactBookUiState contactBookUiState, String str, String str2, List list, String str3, String str4, String str5, String str6, UserRole userRole, boolean z, boolean z2, String str7, String str8, List list2, boolean z3, InstallStats installStats, boolean z4, TimetableData timetableData, boolean z5, int i, Object obj) {
        boolean z6;
        TimetableData timetableData2;
        String str9 = (i & 1) != 0 ? contactBookUiState.classTitle : str;
        String str10 = (i & 2) != 0 ? contactBookUiState.announcement : str2;
        List list3 = (i & 4) != 0 ? contactBookUiState.allRecords : list;
        String str11 = (i & 8) != 0 ? contactBookUiState.selectedDate : str3;
        String str12 = (i & 16) != 0 ? contactBookUiState.yesterdayDate : str4;
        String str13 = (i & 32) != 0 ? contactBookUiState.todayDate : str5;
        String str14 = (i & 64) != 0 ? contactBookUiState.tomorrowDate : str6;
        UserRole userRole2 = (i & 128) != 0 ? contactBookUiState.userRole : userRole;
        boolean z7 = (i & 256) != 0 ? contactBookUiState.isLoading : z;
        boolean z8 = (i & 512) != 0 ? contactBookUiState.isRealtimeConnected : z2;
        String str15 = (i & 1024) != 0 ? contactBookUiState.errorMessage : str7;
        String str16 = (i & 2048) != 0 ? contactBookUiState.toastMessage : str8;
        List list4 = (i & 4096) != 0 ? contactBookUiState.logsList : list2;
        boolean z9 = (i & 8192) != 0 ? contactBookUiState.isLoadingLogs : z3;
        String str17 = str9;
        InstallStats installStats2 = (i & 16384) != 0 ? contactBookUiState.installStats : installStats;
        boolean z10 = (i & 32768) != 0 ? contactBookUiState.isLoadingStats : z4;
        TimetableData timetableData3 = (i & 65536) != 0 ? contactBookUiState.timetable : timetableData;
        if ((i & 131072) != 0) {
            timetableData2 = timetableData3;
            z6 = contactBookUiState.isLoadingTimetable;
        } else {
            z6 = z5;
            timetableData2 = timetableData3;
        }
        return contactBookUiState.copy(str17, str10, list3, str11, str12, str13, str14, userRole2, z7, z8, str15, str16, list4, z9, installStats2, z10, timetableData2, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClassTitle() {
        return this.classTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsRealtimeConnected() {
        return this.isRealtimeConnected;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getToastMessage() {
        return this.toastMessage;
    }

    public final List<ContactBookLogEntry> component13() {
        return this.logsList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsLoadingLogs() {
        return this.isLoadingLogs;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final InstallStats getInstallStats() {
        return this.installStats;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsLoadingStats() {
        return this.isLoadingStats;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TimetableData getTimetable() {
        return this.timetable;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsLoadingTimetable() {
        return this.isLoadingTimetable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnnouncement() {
        return this.announcement;
    }

    public final List<ItemRecord> component3() {
        return this.allRecords;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getYesterdayDate() {
        return this.yesterdayDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTodayDate() {
        return this.todayDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTomorrowDate() {
        return this.tomorrowDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final UserRole getUserRole() {
        return this.userRole;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ContactBookUiState copy(String classTitle, String announcement, List<ItemRecord> allRecords, String selectedDate, String yesterdayDate, String todayDate, String tomorrowDate, UserRole userRole, boolean isLoading, boolean isRealtimeConnected, String errorMessage, String toastMessage, List<ContactBookLogEntry> logsList, boolean isLoadingLogs, InstallStats installStats, boolean isLoadingStats, TimetableData timetable, boolean isLoadingTimetable) {
        Intrinsics.checkNotNullParameter(classTitle, "classTitle");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(allRecords, "allRecords");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(yesterdayDate, "yesterdayDate");
        Intrinsics.checkNotNullParameter(todayDate, "todayDate");
        Intrinsics.checkNotNullParameter(tomorrowDate, "tomorrowDate");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(logsList, "logsList");
        Intrinsics.checkNotNullParameter(timetable, "timetable");
        return new ContactBookUiState(classTitle, announcement, allRecords, selectedDate, yesterdayDate, todayDate, tomorrowDate, userRole, isLoading, isRealtimeConnected, errorMessage, toastMessage, logsList, isLoadingLogs, installStats, isLoadingStats, timetable, isLoadingTimetable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactBookUiState)) {
            return false;
        }
        ContactBookUiState contactBookUiState = (ContactBookUiState) other;
        return Intrinsics.areEqual(this.classTitle, contactBookUiState.classTitle) && Intrinsics.areEqual(this.announcement, contactBookUiState.announcement) && Intrinsics.areEqual(this.allRecords, contactBookUiState.allRecords) && Intrinsics.areEqual(this.selectedDate, contactBookUiState.selectedDate) && Intrinsics.areEqual(this.yesterdayDate, contactBookUiState.yesterdayDate) && Intrinsics.areEqual(this.todayDate, contactBookUiState.todayDate) && Intrinsics.areEqual(this.tomorrowDate, contactBookUiState.tomorrowDate) && this.userRole == contactBookUiState.userRole && this.isLoading == contactBookUiState.isLoading && this.isRealtimeConnected == contactBookUiState.isRealtimeConnected && Intrinsics.areEqual(this.errorMessage, contactBookUiState.errorMessage) && Intrinsics.areEqual(this.toastMessage, contactBookUiState.toastMessage) && Intrinsics.areEqual(this.logsList, contactBookUiState.logsList) && this.isLoadingLogs == contactBookUiState.isLoadingLogs && Intrinsics.areEqual(this.installStats, contactBookUiState.installStats) && this.isLoadingStats == contactBookUiState.isLoadingStats && Intrinsics.areEqual(this.timetable, contactBookUiState.timetable) && this.isLoadingTimetable == contactBookUiState.isLoadingTimetable;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.classTitle.hashCode() * 31) + this.announcement.hashCode()) * 31) + this.allRecords.hashCode()) * 31) + this.selectedDate.hashCode()) * 31) + this.yesterdayDate.hashCode()) * 31) + this.todayDate.hashCode()) * 31) + this.tomorrowDate.hashCode()) * 31) + this.userRole.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isRealtimeConnected)) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toastMessage;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.logsList.hashCode()) * 31) + Boolean.hashCode(this.isLoadingLogs)) * 31;
        InstallStats installStats = this.installStats;
        return ((((((iHashCode3 + (installStats != null ? installStats.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoadingStats)) * 31) + this.timetable.hashCode()) * 31) + Boolean.hashCode(this.isLoadingTimetable);
    }

    public String toString() {
        return "ContactBookUiState(classTitle=" + this.classTitle + ", announcement=" + this.announcement + ", allRecords=" + this.allRecords + ", selectedDate=" + this.selectedDate + ", yesterdayDate=" + this.yesterdayDate + ", todayDate=" + this.todayDate + ", tomorrowDate=" + this.tomorrowDate + ", userRole=" + this.userRole + ", isLoading=" + this.isLoading + ", isRealtimeConnected=" + this.isRealtimeConnected + ", errorMessage=" + this.errorMessage + ", toastMessage=" + this.toastMessage + ", logsList=" + this.logsList + ", isLoadingLogs=" + this.isLoadingLogs + ", installStats=" + this.installStats + ", isLoadingStats=" + this.isLoadingStats + ", timetable=" + this.timetable + ", isLoadingTimetable=" + this.isLoadingTimetable + ")";
    }

    public ContactBookUiState(String classTitle, String announcement, List<ItemRecord> allRecords, String selectedDate, String yesterdayDate, String todayDate, String tomorrowDate, UserRole userRole, boolean z, boolean z2, String str, String str2, List<ContactBookLogEntry> logsList, boolean z3, InstallStats installStats, boolean z4, TimetableData timetable, boolean z5) {
        Intrinsics.checkNotNullParameter(classTitle, "classTitle");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(allRecords, "allRecords");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(yesterdayDate, "yesterdayDate");
        Intrinsics.checkNotNullParameter(todayDate, "todayDate");
        Intrinsics.checkNotNullParameter(tomorrowDate, "tomorrowDate");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(logsList, "logsList");
        Intrinsics.checkNotNullParameter(timetable, "timetable");
        this.classTitle = classTitle;
        this.announcement = announcement;
        this.allRecords = allRecords;
        this.selectedDate = selectedDate;
        this.yesterdayDate = yesterdayDate;
        this.todayDate = todayDate;
        this.tomorrowDate = tomorrowDate;
        this.userRole = userRole;
        this.isLoading = z;
        this.isRealtimeConnected = z2;
        this.errorMessage = str;
        this.toastMessage = str2;
        this.logsList = logsList;
        this.isLoadingLogs = z3;
        this.installStats = installStats;
        this.isLoadingStats = z4;
        this.timetable = timetable;
        this.isLoadingTimetable = z5;
    }

    public /* synthetic */ ContactBookUiState(String str, String str2, List list, String str3, String str4, String str5, String str6, UserRole userRole, boolean z, boolean z2, String str7, String str8, List list2, boolean z3, InstallStats installStats, boolean z4, TimetableData timetableData, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "班級聯絡簿" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? UserRole.VISITOR : userRole, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? CollectionsKt.emptyList() : list2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? null : installStats, (i & 32768) != 0 ? false : z4, (i & 65536) != 0 ? new TimetableData((String) null, (Map) null, (String) null, 7, (DefaultConstructorMarker) null) : timetableData, (i & 131072) != 0 ? false : z5);
    }

    public final String getClassTitle() {
        return this.classTitle;
    }

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final List<ItemRecord> getAllRecords() {
        return this.allRecords;
    }

    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public final String getYesterdayDate() {
        return this.yesterdayDate;
    }

    public final String getTodayDate() {
        return this.todayDate;
    }

    public final String getTomorrowDate() {
        return this.tomorrowDate;
    }

    public final UserRole getUserRole() {
        return this.userRole;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRealtimeConnected() {
        return this.isRealtimeConnected;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getToastMessage() {
        return this.toastMessage;
    }

    public final List<ContactBookLogEntry> getLogsList() {
        return this.logsList;
    }

    public final boolean isLoadingLogs() {
        return this.isLoadingLogs;
    }

    public final InstallStats getInstallStats() {
        return this.installStats;
    }

    public final boolean isLoadingStats() {
        return this.isLoadingStats;
    }

    public final TimetableData getTimetable() {
        return this.timetable;
    }

    public final boolean isLoadingTimetable() {
        return this.isLoadingTimetable;
    }
}
