package com.rhythmbyte.contactbook.data.model;

import com.rhythmbyte.contactbook.data.repository.OfflineDataRepository;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: ContactBookModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002'(B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBK\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010¨\u0006)"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/TimetableData;", "", "id", "", "schedule", "", "", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getSchedule", "()Ljava/util/Map;", "getUpdatedAt$annotations", "()V", "getUpdatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
public final /* data */ class TimetableData {
    private final String id;
    private final Map<String, List<String>> schedule;
    private final String updatedAt;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(StringSerializer.INSTANCE)), null};
    private static final Map<String, List<String>> DEFAULT_SCHEDULE = MapsKt.mapOf(TuplesKt.to("1", CollectionsKt.listOf((Object[]) new String[]{"國語文", "英語文", "數學", "物理", "化學", "生物", "歷史", "地理", "公民", "自習"})), TuplesKt.to("2", CollectionsKt.listOf((Object[]) new String[]{"數學", "國語文", "英語文", "體育", "資訊", "美術", "音樂", "理化", "輔導", "自習"})), TuplesKt.to("3", CollectionsKt.listOf((Object[]) new String[]{"英語文", "數學", "國語文", "歷史", "地理", "體育", "班會", "團體活動", "自習", "自習"})), TuplesKt.to("4", CollectionsKt.listOf((Object[]) new String[]{"國語文", "物理", "化學", "英語文", "數學", "公民", "體育", "地科", "輔導", "自習"})), TuplesKt.to("5", CollectionsKt.listOf((Object[]) new String[]{"數學", "英語文", "國語文", "體育", "生物", "歷史", "社團活動", "彈性課程", "自習", "自習"})));

    public TimetableData() {
        this((String) null, (Map) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimetableData copy$default(TimetableData timetableData, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timetableData.id;
        }
        if ((i & 2) != 0) {
            map = timetableData.schedule;
        }
        if ((i & 4) != 0) {
            str2 = timetableData.updatedAt;
        }
        return timetableData.copy(str, map, str2);
    }

    @SerialName("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, List<String>> component2() {
        return this.schedule;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final TimetableData copy(String id, Map<String, ? extends List<String>> schedule, String updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        return new TimetableData(id, schedule, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimetableData)) {
            return false;
        }
        TimetableData timetableData = (TimetableData) other;
        return Intrinsics.areEqual(this.id, timetableData.id) && Intrinsics.areEqual(this.schedule, timetableData.schedule) && Intrinsics.areEqual(this.updatedAt, timetableData.updatedAt);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.schedule.hashCode()) * 31;
        String str = this.updatedAt;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TimetableData(id=" + this.id + ", schedule=" + this.schedule + ", updatedAt=" + this.updatedAt + ")";
    }

    public /* synthetic */ TimetableData(int i, String str, Map map, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? OfflineDataRepository.ROW_ID : str;
        if ((i & 2) == 0) {
            this.schedule = DEFAULT_SCHEDULE;
        } else {
            this.schedule = map;
        }
        if ((i & 4) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(TimetableData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.id, OfflineDataRepository.ROW_ID)) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.schedule, DEFAULT_SCHEDULE)) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.schedule);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.updatedAt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.updatedAt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimetableData(String id, Map<String, ? extends List<String>> schedule, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        this.id = id;
        this.schedule = schedule;
        this.updatedAt = str;
    }

    public /* synthetic */ TimetableData(String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OfflineDataRepository.ROW_ID : str, (i & 2) != 0 ? DEFAULT_SCHEDULE : map, (i & 4) != 0 ? null : str2);
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, List<String>> getSchedule() {
        return this.schedule;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: compiled from: ContactBookModels.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R#\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/TimetableData$Companion;", "", "<init>", "()V", "parseCell", "Lkotlin/Pair;", "", "raw", "getFullName", "getShortName", "formatCell", "full", "short", "DEFAULT_SCHEDULE", "", "", "getDEFAULT_SCHEDULE", "()Ljava/util/Map;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/rhythmbyte/contactbook/data/model/TimetableData;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimetableData> serializer() {
            return TimetableData$$serializer.INSTANCE;
        }

        public final Pair<String, String> parseCell(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String string = StringsKt.trim((CharSequence) raw).toString();
            String str = string;
            if (str.length() == 0) {
                return TuplesKt.to("", "");
            }
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "|", false, 2, (Object) null)) {
                String string2 = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(string, "|", (String) null, 2, (Object) null)).toString();
                String strTake = StringsKt.take(StringsKt.trim((CharSequence) StringsKt.substringAfter$default(string, "|", (String) null, 2, (Object) null)).toString(), 1);
                if (strTake.length() <= 0) {
                    strTake = StringsKt.take(string2, 1);
                }
                return TuplesKt.to(string2, strTake);
            }
            return TuplesKt.to(string, StringsKt.take(string, 1));
        }

        public final String getFullName(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            return parseCell(raw).getFirst();
        }

        public final String getShortName(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            return parseCell(raw).getSecond();
        }

        public final String formatCell(String full, String str) {
            Intrinsics.checkNotNullParameter(full, "full");
            Intrinsics.checkNotNullParameter(str, "short");
            String string = StringsKt.trim((CharSequence) full).toString();
            String strTake = StringsKt.take(StringsKt.trim((CharSequence) str).toString(), 1);
            if (string.length() == 0) {
                return "";
            }
            return (strTake.length() <= 0 || Intrinsics.areEqual(strTake, StringsKt.take(string, 1))) ? string : string + "|" + strTake;
        }

        public final Map<String, List<String>> getDEFAULT_SCHEDULE() {
            return TimetableData.DEFAULT_SCHEDULE;
        }
    }
}
