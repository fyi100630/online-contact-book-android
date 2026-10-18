package com.rhythmbyte.contactbook.data.model;

import androidx.core.app.NotificationCompat;
import io.ktor.http.LinkHeader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContactBookModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ItemCategory;", "", "key", "", LinkHeader.Parameters.Title, "icon", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getTitle", "getIcon", "HOMEWORK", "EXAM", "SUBMISSION", "REMINDER", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ItemCategory {
    HOMEWORK("homework", "作業", "📝"),
    EXAM("exam", "考試／評量", "📋"),
    SUBMISSION("submission", "繳交項目", "📦"),
    REMINDER(NotificationCompat.CATEGORY_REMINDER, "重要提醒", "🔔");

    private final String icon;
    private final String key;
    private final String title;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ItemCategory> getEntries() {
        return $ENTRIES;
    }

    ItemCategory(String str, String str2, String str3) {
        this.key = str;
        this.title = str2;
        this.icon = str3;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: compiled from: ContactBookModels.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/rhythmbyte/contactbook/data/model/ItemCategory$Companion;", "", "<init>", "()V", "fromKey", "Lcom/rhythmbyte/contactbook/data/model/ItemCategory;", "key", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ItemCategory fromKey(String key) {
            ItemCategory next;
            Intrinsics.checkNotNullParameter(key, "key");
            Iterator<ItemCategory> it = ItemCategory.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getKey(), key));
            ItemCategory itemCategory = next;
            return itemCategory == null ? ItemCategory.HOMEWORK : itemCategory;
        }
    }
}
