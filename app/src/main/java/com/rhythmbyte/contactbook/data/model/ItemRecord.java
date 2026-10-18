package com.rhythmbyte.contactbook.data.model;

import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: ContactBookModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000eHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u00063"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "", "id", "", "date", "category", "subject", LinkHeader.Parameters.Title, "details", "dueDate", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getDate", "getCategory", "getSubject", "getTitle", "getDetails", "getDueDate", "getPriority", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
public final /* data */ class ItemRecord {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String category;
    private final String date;
    private final String details;
    private final String dueDate;
    private final String id;
    private final String priority;
    private final String subject;
    private final String title;

    public ItemRecord() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ItemRecord copy$default(ItemRecord itemRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemRecord.id;
        }
        if ((i & 2) != 0) {
            str2 = itemRecord.date;
        }
        if ((i & 4) != 0) {
            str3 = itemRecord.category;
        }
        if ((i & 8) != 0) {
            str4 = itemRecord.subject;
        }
        if ((i & 16) != 0) {
            str5 = itemRecord.title;
        }
        if ((i & 32) != 0) {
            str6 = itemRecord.details;
        }
        if ((i & 64) != 0) {
            str7 = itemRecord.dueDate;
        }
        if ((i & 128) != 0) {
            str8 = itemRecord.priority;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return itemRecord.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPriority() {
        return this.priority;
    }

    public final ItemRecord copy(String id, String date, String category, String subject, String title, String details, String dueDate, String priority) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(priority, "priority");
        return new ItemRecord(id, date, category, subject, title, details, dueDate, priority);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemRecord)) {
            return false;
        }
        ItemRecord itemRecord = (ItemRecord) other;
        return Intrinsics.areEqual(this.id, itemRecord.id) && Intrinsics.areEqual(this.date, itemRecord.date) && Intrinsics.areEqual(this.category, itemRecord.category) && Intrinsics.areEqual(this.subject, itemRecord.subject) && Intrinsics.areEqual(this.title, itemRecord.title) && Intrinsics.areEqual(this.details, itemRecord.details) && Intrinsics.areEqual(this.dueDate, itemRecord.dueDate) && Intrinsics.areEqual(this.priority, itemRecord.priority);
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.date.hashCode()) * 31) + this.category.hashCode()) * 31) + this.subject.hashCode()) * 31) + this.title.hashCode()) * 31) + this.details.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.priority.hashCode();
    }

    public String toString() {
        return "ItemRecord(id=" + this.id + ", date=" + this.date + ", category=" + this.category + ", subject=" + this.subject + ", title=" + this.title + ", details=" + this.details + ", dueDate=" + this.dueDate + ", priority=" + this.priority + ")";
    }

    /* JADX INFO: compiled from: ContactBookModels.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ItemRecord$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ItemRecord> serializer() {
            return ItemRecord$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ItemRecord(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.date = "";
        } else {
            this.date = str2;
        }
        if ((i & 4) == 0) {
            this.category = "homework";
        } else {
            this.category = str3;
        }
        if ((i & 8) == 0) {
            this.subject = "";
        } else {
            this.subject = str4;
        }
        if ((i & 16) == 0) {
            this.title = "";
        } else {
            this.title = str5;
        }
        if ((i & 32) == 0) {
            this.details = "";
        } else {
            this.details = str6;
        }
        if ((i & 64) == 0) {
            this.dueDate = "";
        } else {
            this.dueDate = str7;
        }
        if ((i & 128) == 0) {
            this.priority = "normal";
        } else {
            this.priority = str8;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(ItemRecord self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.date, "")) {
            output.encodeStringElement(serialDesc, 1, self.date);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.category, "homework")) {
            output.encodeStringElement(serialDesc, 2, self.category);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.subject, "")) {
            output.encodeStringElement(serialDesc, 3, self.subject);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.title, "")) {
            output.encodeStringElement(serialDesc, 4, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.details, "")) {
            output.encodeStringElement(serialDesc, 5, self.details);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.dueDate, "")) {
            output.encodeStringElement(serialDesc, 6, self.dueDate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && Intrinsics.areEqual(self.priority, "normal")) {
            return;
        }
        output.encodeStringElement(serialDesc, 7, self.priority);
    }

    public ItemRecord(String id, String date, String category, String subject, String title, String details, String dueDate, String priority) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.id = id;
        this.date = date;
        this.category = category;
        this.subject = subject;
        this.title = title;
        this.details = details;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public /* synthetic */ ItemRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "homework" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "normal" : str8);
    }

    public final String getId() {
        return this.id;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getPriority() {
        return this.priority;
    }
}
