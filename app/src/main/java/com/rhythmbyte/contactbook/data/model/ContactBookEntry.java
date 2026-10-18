package com.rhythmbyte.contactbook.data.model;

import com.rhythmbyte.contactbook.data.repository.OfflineDataRepository;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\rHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012¨\u00060"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ContactBookEntry;", "", "id", "", "classTitle", "announcement", "records", "", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getClassTitle$annotations", "()V", "getClassTitle", "getAnnouncement", "getRecords", "()Ljava/util/List;", "getUpdatedAt$annotations", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
public final /* data */ class ContactBookEntry {
    private final String announcement;
    private final String classTitle;
    private final String id;
    private final List<ItemRecord> records;
    private final String updatedAt;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ItemRecord$$serializer.INSTANCE), null};

    public ContactBookEntry() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactBookEntry copy$default(ContactBookEntry contactBookEntry, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactBookEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = contactBookEntry.classTitle;
        }
        if ((i & 4) != 0) {
            str3 = contactBookEntry.announcement;
        }
        if ((i & 8) != 0) {
            list = contactBookEntry.records;
        }
        if ((i & 16) != 0) {
            str4 = contactBookEntry.updatedAt;
        }
        String str5 = str4;
        String str6 = str3;
        return contactBookEntry.copy(str, str2, str6, list, str5);
    }

    @SerialName("class_title")
    public static /* synthetic */ void getClassTitle$annotations() {
    }

    @SerialName("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
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
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final ContactBookEntry copy(String id, String classTitle, String announcement, List<ItemRecord> records, String updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(classTitle, "classTitle");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(records, "records");
        return new ContactBookEntry(id, classTitle, announcement, records, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactBookEntry)) {
            return false;
        }
        ContactBookEntry contactBookEntry = (ContactBookEntry) other;
        return Intrinsics.areEqual(this.id, contactBookEntry.id) && Intrinsics.areEqual(this.classTitle, contactBookEntry.classTitle) && Intrinsics.areEqual(this.announcement, contactBookEntry.announcement) && Intrinsics.areEqual(this.records, contactBookEntry.records) && Intrinsics.areEqual(this.updatedAt, contactBookEntry.updatedAt);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.classTitle.hashCode()) * 31) + this.announcement.hashCode()) * 31) + this.records.hashCode()) * 31;
        String str = this.updatedAt;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ContactBookEntry(id=" + this.id + ", classTitle=" + this.classTitle + ", announcement=" + this.announcement + ", records=" + this.records + ", updatedAt=" + this.updatedAt + ")";
    }

    /* JADX INFO: compiled from: ContactBookModels.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ContactBookEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/rhythmbyte/contactbook/data/model/ContactBookEntry;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContactBookEntry> serializer() {
            return ContactBookEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContactBookEntry(int i, String str, String str2, String str3, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? OfflineDataRepository.ROW_ID : str;
        if ((i & 2) == 0) {
            this.classTitle = "班級聯絡簿";
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
            this.updatedAt = null;
        } else {
            this.updatedAt = str4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(ContactBookEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.id, OfflineDataRepository.ROW_ID)) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.classTitle, "班級聯絡簿")) {
            output.encodeStringElement(serialDesc, 1, self.classTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.announcement, "")) {
            output.encodeStringElement(serialDesc, 2, self.announcement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.records, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.records);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.updatedAt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.updatedAt);
    }

    public ContactBookEntry(String id, String classTitle, String announcement, List<ItemRecord> records, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(classTitle, "classTitle");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(records, "records");
        this.id = id;
        this.classTitle = classTitle;
        this.announcement = announcement;
        this.records = records;
        this.updatedAt = str;
    }

    public /* synthetic */ ContactBookEntry(String str, String str2, String str3, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OfflineDataRepository.ROW_ID : str, (i & 2) != 0 ? "班級聯絡簿" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : str4);
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

    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
