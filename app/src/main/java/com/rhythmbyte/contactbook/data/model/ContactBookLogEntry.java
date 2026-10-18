package com.rhythmbyte.contactbook.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: ContactBookModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0014¨\u00067"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ContactBookLogEntry;", "", "id", "", "classTitle", "announcement", "records", "", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "summary", "editorRole", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getClassTitle$annotations", "()V", "getClassTitle", "getAnnouncement", "getRecords", "()Ljava/util/List;", "getSummary", "getEditorRole$annotations", "getEditorRole", "getCreatedAt$annotations", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
public final /* data */ class ContactBookLogEntry {
    private final String announcement;
    private final String classTitle;
    private final String createdAt;
    private final String editorRole;
    private final String id;
    private final List<ItemRecord> records;
    private final String summary;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ItemRecord$$serializer.INSTANCE), null, null, null};

    public ContactBookLogEntry() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactBookLogEntry copy$default(ContactBookLogEntry contactBookLogEntry, String str, String str2, String str3, List list, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactBookLogEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = contactBookLogEntry.classTitle;
        }
        if ((i & 4) != 0) {
            str3 = contactBookLogEntry.announcement;
        }
        if ((i & 8) != 0) {
            list = contactBookLogEntry.records;
        }
        if ((i & 16) != 0) {
            str4 = contactBookLogEntry.summary;
        }
        if ((i & 32) != 0) {
            str5 = contactBookLogEntry.editorRole;
        }
        if ((i & 64) != 0) {
            str6 = contactBookLogEntry.createdAt;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return contactBookLogEntry.copy(str, str2, str10, list, str9, str7, str8);
    }

    @SerialName("class_title")
    public static /* synthetic */ void getClassTitle$annotations() {
    }

    @SerialName("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @SerialName("editor_role")
    public static /* synthetic */ void getEditorRole$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClassTitle() {
        return this.classTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnnouncement() {
        return this.announcement;
    }

    public final List<ItemRecord> component4() {
        return this.records;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEditorRole() {
        return this.editorRole;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final ContactBookLogEntry copy(String id, String classTitle, String announcement, List<ItemRecord> records, String summary, String editorRole, String createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(classTitle, "classTitle");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new ContactBookLogEntry(id, classTitle, announcement, records, summary, editorRole, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactBookLogEntry)) {
            return false;
        }
        ContactBookLogEntry contactBookLogEntry = (ContactBookLogEntry) other;
        return Intrinsics.areEqual(this.id, contactBookLogEntry.id) && Intrinsics.areEqual(this.classTitle, contactBookLogEntry.classTitle) && Intrinsics.areEqual(this.announcement, contactBookLogEntry.announcement) && Intrinsics.areEqual(this.records, contactBookLogEntry.records) && Intrinsics.areEqual(this.summary, contactBookLogEntry.summary) && Intrinsics.areEqual(this.editorRole, contactBookLogEntry.editorRole) && Intrinsics.areEqual(this.createdAt, contactBookLogEntry.createdAt);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.classTitle.hashCode()) * 31) + this.announcement.hashCode()) * 31) + this.records.hashCode()) * 31;
        String str = this.summary;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.editorRole;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "ContactBookLogEntry(id=" + this.id + ", classTitle=" + this.classTitle + ", announcement=" + this.announcement + ", records=" + this.records + ", summary=" + this.summary + ", editorRole=" + this.editorRole + ", createdAt=" + this.createdAt + ")";
    }

    /* JADX INFO: compiled from: ContactBookModels.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ContactBookLogEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/rhythmbyte/contactbook/data/model/ContactBookLogEntry;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContactBookLogEntry> serializer() {
            return ContactBookLogEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContactBookLogEntry(int i, String str, String str2, String str3, List list, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.classTitle = "";
        } else {
            this.classTitle = str2;
        }
        if ((i & 4) == 0) {
            this.announcement = "";
        } else {
            this.announcement = str3;
        }
        if ((i & 8) == 0) {
            this.records = CollectionsKt.emptyList();
        } else {
            this.records = list;
        }
        if ((i & 16) == 0) {
            this.summary = "";
        } else {
            this.summary = str4;
        }
        if ((i & 32) == 0) {
            this.editorRole = "admin";
        } else {
            this.editorRole = str5;
        }
        if ((i & 64) == 0) {
            this.createdAt = "";
        } else {
            this.createdAt = str6;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(ContactBookLogEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.classTitle, "")) {
            output.encodeStringElement(serialDesc, 1, self.classTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.announcement, "")) {
            output.encodeStringElement(serialDesc, 2, self.announcement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.records, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.records);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.summary, "")) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.summary);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.editorRole, "admin")) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.editorRole);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && Intrinsics.areEqual(self.createdAt, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 6, self.createdAt);
    }

    public ContactBookLogEntry(String id, String classTitle, String announcement, List<ItemRecord> records, String str, String str2, String createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(classTitle, "classTitle");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.id = id;
        this.classTitle = classTitle;
        this.announcement = announcement;
        this.records = records;
        this.summary = str;
        this.editorRole = str2;
        this.createdAt = createdAt;
    }

    public /* synthetic */ ContactBookLogEntry(String str, String str2, String str3, List list, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "admin" : str5, (i & 64) != 0 ? "" : str6);
    }

    public final String getId() {
        return this.id;
    }

    public final String getClassTitle() {
        return this.classTitle;
    }

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final List<ItemRecord> getRecords() {
        return this.records;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getEditorRole() {
        return this.editorRole;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }
}
