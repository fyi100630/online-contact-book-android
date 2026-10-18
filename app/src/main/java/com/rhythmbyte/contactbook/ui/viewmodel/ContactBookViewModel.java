package com.rhythmbyte.contactbook.ui.viewmodel;

import android.app.Application;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.rhythmbyte.contactbook.data.datastore.AuthPreferences;
import com.rhythmbyte.contactbook.data.model.ContactBookEntry;
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import com.rhythmbyte.contactbook.data.model.UserRole;
import com.rhythmbyte.contactbook.data.repository.InstallStats;
import com.rhythmbyte.contactbook.data.repository.OfflineDataRepository;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: compiled from: ContactBookViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001aJ\u0016\u0010'\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)H\u0002J\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\u0016J\u0016\u0010/\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u00100\u001a\u00020\u001aJ\u001d\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u001a¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u0016J\u0006\u00106\u001a\u00020\u0016J \u00107\u001a\u00020\u00162\u0018\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0)09J\u000e\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006<"}, d2 = {"Lcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "repository", "Lcom/rhythmbyte/contactbook/data/repository/OfflineDataRepository;", "authPreferences", "Lcom/rhythmbyte/contactbook/data/datastore/AuthPreferences;", "dateFormatter", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "Ljava/time/format/DateTimeFormatter;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadLatestData", "", "setupRealtimeSubscription", "setSelectedDate", "date", "", "unlockWithPassword", "", HintConstants.AUTOFILL_HINT_PASSWORD, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "saveOrUpdateItem", "item", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "deleteItem", "itemId", "updateAnnouncement", "newAnnouncement", "publishRecords", "newRecords", "", "fetchHistoryLogs", "restoreFromLog", "log", "Lcom/rhythmbyte/contactbook/data/model/ContactBookLogEntry;", "clearToast", "isItemActiveOnDate", "targetDate", "getCountdownDays", "", "dueDate", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "fetchInstallStats", "loadTimetable", "updateTimetable", "newSchedule", "", "getShortTimetablePreview", "dateStr", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactBookViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ContactBookUiState> _uiState;
    private final AuthPreferences authPreferences;
    private final DateTimeFormatter dateFormatter;
    private final OfflineDataRepository repository;
    private final StateFlow<ContactBookUiState> uiState;

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$unlockWithPassword$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel", f = "ContactBookViewModel.kt", i = {0, 0, 1, 1}, l = {130, 133}, m = "unlockWithPassword", n = {"this", "trimmed", "this", "role"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C06381 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C06381(Continuation<? super C06381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContactBookViewModel.this.unlockWithPassword(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactBookViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.repository = new OfflineDataRepository();
        this.authPreferences = new AuthPreferences(application);
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateFormatter = dateTimeFormatterOfPattern;
        String str = LocalDate.now().format(dateTimeFormatterOfPattern);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = LocalDate.now().minusDays(1L).format(dateTimeFormatterOfPattern);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String str3 = LocalDate.now().format(dateTimeFormatterOfPattern);
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String str4 = LocalDate.now().plusDays(1L).format(dateTimeFormatterOfPattern);
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        MutableStateFlow<ContactBookUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new ContactBookUiState(null, null, null, str, str2, str3, str4, null, false, false, null, null, null, false, null, false, null, false, 262023, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        ContactBookViewModel contactBookViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(contactBookViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(contactBookViewModel), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(contactBookViewModel), null, null, new AnonymousClass3(null), 3, null);
        loadLatestData();
        setupRealtimeSubscription();
    }

    public final StateFlow<ContactBookUiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$1", f = "ContactBookViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UserRole> userRoleFlow = ContactBookViewModel.this.authPreferences.getUserRoleFlow();
                final ContactBookViewModel contactBookViewModel = ContactBookViewModel.this;
                this.label = 1;
                if (userRoleFlow.collect(new FlowCollector() { // from class: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((UserRole) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(UserRole userRole, Continuation<? super Unit> continuation) {
                        contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, userRole, false, false, null, null, null, false, null, false, null, false, 262015, null));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$2", f = "ContactBookViewModel.kt", i = {}, l = {74, 75}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            if (r1.m6724reportInstallation0E7RQCE((java.lang.String) r6, com.rhythmbyte.contactbook.BuildConfig.VERSION_NAME, r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L4e
                kotlin.Result r6 = (kotlin.Result) r6     // Catch: java.lang.Exception -> L4e
                r6.getValue()     // Catch: java.lang.Exception -> L4e
                goto L4e
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L4e
                goto L38
            L23:
                kotlin.ResultKt.throwOnFailure(r6)
                com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel r6 = com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel.this     // Catch: java.lang.Exception -> L4e
                com.rhythmbyte.contactbook.data.datastore.AuthPreferences r6 = com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel.access$getAuthPreferences$p(r6)     // Catch: java.lang.Exception -> L4e
                r1 = r5
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Exception -> L4e
                r5.label = r3     // Catch: java.lang.Exception -> L4e
                java.lang.Object r6 = r6.getOrCreateInstallId(r1)     // Catch: java.lang.Exception -> L4e
                if (r6 != r0) goto L38
                goto L4d
            L38:
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L4e
                com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel r1 = com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel.this     // Catch: java.lang.Exception -> L4e
                com.rhythmbyte.contactbook.data.repository.OfflineDataRepository r1 = com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel.access$getRepository$p(r1)     // Catch: java.lang.Exception -> L4e
                java.lang.String r3 = "2.0.0"
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L4e
                r5.label = r2     // Catch: java.lang.Exception -> L4e
                java.lang.Object r6 = r1.m6724reportInstallation0E7RQCE(r6, r3, r4)     // Catch: java.lang.Exception -> L4e
                if (r6 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$3", f = "ContactBookViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object savedTimetable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                savedTimetable = ContactBookViewModel.this.authPreferences.getSavedTimetable(this);
                if (savedTimetable == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                savedTimetable = obj;
            }
            TimetableData timetableData = (TimetableData) savedTimetable;
            if (timetableData != null) {
                ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, timetableData, false, 196607, null));
            }
            ContactBookViewModel.this.loadTimetable();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$loadLatestData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$loadLatestData$1", f = "ContactBookViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class C06331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C06331(Continuation<? super C06331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, null, true, false, null, null, null, false, null, false, null, false, 260863, null));
                this.label = 1;
                Object objM6720fetchContactBookIoAF18A = ContactBookViewModel.this.repository.m6720fetchContactBookIoAF18A(this);
                if (objM6720fetchContactBookIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM6720fetchContactBookIoAF18A;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            ContactBookViewModel contactBookViewModel = ContactBookViewModel.this;
            if (Result.m7119isSuccessimpl(value)) {
                ContactBookEntry contactBookEntry = (ContactBookEntry) value;
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), contactBookEntry.getClassTitle(), contactBookEntry.getAnnouncement(), contactBookEntry.getRecords(), null, null, null, null, null, false, true, null, null, null, false, null, false, null, false, 260344, null));
            }
            ContactBookViewModel contactBookViewModel2 = ContactBookViewModel.this;
            Throwable thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
            if (thM7115exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = contactBookViewModel2._uiState;
                ContactBookUiState contactBookUiState = (ContactBookUiState) contactBookViewModel2._uiState.getValue();
                String localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "網路異常";
                }
                mutableStateFlow.setValue(ContactBookUiState.copy$default(contactBookUiState, null, null, null, null, null, null, null, null, false, false, "無法連線至雲端資料庫：" + localizedMessage, null, null, false, null, false, null, false, 260351, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadLatestData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06331(null), 3, null);
    }

    private final void setupRealtimeSubscription() {
        try {
            this.repository.subscribeRealtime(ViewModelKt.getViewModelScope(this), new Function0() { // from class: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContactBookViewModel.setupRealtimeSubscription$lambda$0(this.f$0);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupRealtimeSubscription$lambda$0(ContactBookViewModel contactBookViewModel) {
        contactBookViewModel.loadLatestData();
        return Unit.INSTANCE;
    }

    public final void setSelectedDate(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        MutableStateFlow<ContactBookUiState> mutableStateFlow = this._uiState;
        mutableStateFlow.setValue(ContactBookUiState.copy$default(mutableStateFlow.getValue(), null, null, null, date, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 262135, null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object unlockWithPassword(String str, Continuation<? super Boolean> continuation) {
        C06381 c06381;
        String string;
        Object objM6728verifyPasswordgIAlus;
        ContactBookViewModel contactBookViewModel;
        UserRole userRole;
        ContactBookViewModel contactBookViewModel2;
        String str2;
        if (continuation instanceof C06381) {
            c06381 = (C06381) continuation;
            if ((c06381.label & Integer.MIN_VALUE) != 0) {
                c06381.label -= Integer.MIN_VALUE;
            } else {
                c06381 = new C06381(continuation);
            }
        } else {
            c06381 = new C06381(continuation);
        }
        Object obj = c06381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06381.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            string = StringsKt.trim((CharSequence) str).toString();
            OfflineDataRepository offlineRepository = this.repository;
            c06381.L$0 = this;
            c06381.L$1 = string;
            c06381.label = 1;
            objM6728verifyPasswordgIAlus = offlineRepository.m6728verifyPasswordgIAlus(string, c06381);
            if (objM6728verifyPasswordgIAlus != coroutine_suspended) {
                contactBookViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            string = (String) c06381.L$1;
            contactBookViewModel = (ContactBookViewModel) c06381.L$0;
            ResultKt.throwOnFailure(obj);
            objM6728verifyPasswordgIAlus = ((Result) obj).getValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserRole userRole2 = (UserRole) c06381.L$1;
            contactBookViewModel2 = (ContactBookViewModel) c06381.L$0;
            ResultKt.throwOnFailure(obj);
            userRole = userRole2;
        }
        MutableStateFlow<ContactBookUiState> mutableStateFlow = contactBookViewModel2._uiState;
        ContactBookUiState value = mutableStateFlow.getValue();
        if (userRole == UserRole.SUPER_ADMIN) {
            str2 = "👑 已登入管理員模式（身分已記住）";
        } else {
            str2 = "✏️ 已登入編輯模式（身分已記住）";
        }
        mutableStateFlow.setValue(ContactBookUiState.copy$default(value, null, null, null, null, null, null, null, userRole, false, false, null, str2, null, false, null, false, null, false, 259967, null));
        return Boxing.boxBoolean(true);
        if (Result.m7115exceptionOrNullimpl(objM6728verifyPasswordgIAlus) == null) {
            UserRole userRole3 = (UserRole) objM6728verifyPasswordgIAlus;
            AuthPreferences authPreferences = contactBookViewModel.authPreferences;
            c06381.L$0 = contactBookViewModel;
            c06381.L$1 = userRole3;
            c06381.label = 2;
            if (authPreferences.saveUserRole(userRole3, string, c06381) != coroutine_suspended) {
                userRole = userRole3;
                contactBookViewModel2 = contactBookViewModel;
                MutableStateFlow<ContactBookUiState> mutableStateFlow2 = contactBookViewModel2._uiState;
                ContactBookUiState value2 = mutableStateFlow2.getValue();
                if (userRole == UserRole.SUPER_ADMIN) {
                    str2 = "👑 已登入管理員模式（身分已記住）";
                } else {
                    str2 = "✏️ 已登入編輯模式（身分已記住）";
                }
                mutableStateFlow2.setValue(ContactBookUiState.copy$default(value2, null, null, null, null, null, null, null, userRole, false, false, null, str2, null, false, null, false, null, false, 259967, null));
                return Boxing.boxBoolean(true);
            }
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$logout$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$logout$1", f = "ContactBookViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class C06351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C06351(Continuation<? super C06351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ContactBookViewModel.this.authPreferences.clearUserRole(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, UserRole.VISITOR, false, false, null, "🚪 已登出回到訪客檢視", null, false, null, false, null, false, 259967, null));
            return Unit.INSTANCE;
        }
    }

    public final void logout() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06351(null), 3, null);
    }

    public final void saveOrUpdateItem(ItemRecord item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List<ItemRecord> mutableList = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getAllRecords());
        Iterator<ItemRecord> it = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), item.getId())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            mutableList.set(i, item);
        } else {
            mutableList.add(0, item);
        }
        publishRecords(mutableList);
    }

    public final void deleteItem(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        List<ItemRecord> allRecords = this._uiState.getValue().getAllRecords();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allRecords) {
            if (!Intrinsics.areEqual(((ItemRecord) obj).getId(), itemId)) {
                arrayList.add(obj);
            }
        }
        publishRecords(arrayList);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$updateAnnouncement$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$updateAnnouncement$1", f = "ContactBookViewModel.kt", i = {}, l = {173, 181}, m = "invokeSuspend", n = {}, s = {})
    static final class C06391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $newAnnouncement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06391(String str, Continuation<? super C06391> continuation) {
            super(2, continuation);
            this.$newAnnouncement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06391(this.$newAnnouncement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0083  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object savedPassword;
            Object value;
            ContactBookViewModel contactBookViewModel;
            String str;
            ContactBookViewModel contactBookViewModel2;
            Throwable thM7115exceptionOrNullimpl;
            String localizedMessage;
            String localizedMessage2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                savedPassword = ContactBookViewModel.this.authPreferences.getSavedPassword(this);
                if (savedPassword != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                savedPassword = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            contactBookViewModel = ContactBookViewModel.this;
            str = this.$newAnnouncement;
            if (Result.m7119isSuccessimpl(value)) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, str, null, null, null, null, null, null, false, false, null, "公告已更新並發布！", null, false, null, false, null, false, 260093, null));
            }
            contactBookViewModel2 = ContactBookViewModel.this;
            thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
            if (thM7115exceptionOrNullimpl != null) {
                contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "❌ 公告發布失敗：" + thM7115exceptionOrNullimpl.getLocalizedMessage(), null, false, null, false, null, false, 260095, null));
                localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                if ((localizedMessage == null && StringsKt.contains$default((CharSequence) localizedMessage, (CharSequence) "密碼", false, 2, (Object) null)) || ((localizedMessage2 = thM7115exceptionOrNullimpl.getLocalizedMessage()) != null && StringsKt.contains$default((CharSequence) localizedMessage2, (CharSequence) "權限", false, 2, (Object) null))) {
                    contactBookViewModel2.logout();
                }
            }
            return Unit.INSTANCE;
            String str2 = (String) savedPassword;
            if (str2 == null) {
                str2 = "";
            }
            ContactBookUiState contactBookUiState = (ContactBookUiState) ContactBookViewModel.this._uiState.getValue();
            ContactBookEntry contactBookEntry = new ContactBookEntry(OfflineDataRepository.ROW_ID, contactBookUiState.getClassTitle(), this.$newAnnouncement, contactBookUiState.getAllRecords(), (String) null, 16, (DefaultConstructorMarker) null);
            this.label = 2;
            Object objM6726updateContactBook0E7RQCE = ContactBookViewModel.this.repository.m6726updateContactBook0E7RQCE(str2, contactBookEntry, this);
            if (objM6726updateContactBook0E7RQCE != coroutine_suspended) {
                value = objM6726updateContactBook0E7RQCE;
                contactBookViewModel = ContactBookViewModel.this;
                str = this.$newAnnouncement;
                if (Result.m7119isSuccessimpl(value)) {
                    contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, str, null, null, null, null, null, null, false, false, null, "公告已更新並發布！", null, false, null, false, null, false, 260093, null));
                }
                contactBookViewModel2 = ContactBookViewModel.this;
                thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
                if (thM7115exceptionOrNullimpl != null) {
                    contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "❌ 公告發布失敗：" + thM7115exceptionOrNullimpl.getLocalizedMessage(), null, false, null, false, null, false, 260095, null));
                    localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                    if (localizedMessage == null) {
                        contactBookViewModel2.logout();
                    } else {
                        contactBookViewModel2.logout();
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    public final void updateAnnouncement(String newAnnouncement) {
        Intrinsics.checkNotNullParameter(newAnnouncement, "newAnnouncement");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06391(newAnnouncement, null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$publishRecords$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$publishRecords$1", f = "ContactBookViewModel.kt", i = {}, l = {194, ComposerKt.compositionLocalMapKey}, m = "invokeSuspend", n = {}, s = {})
    static final class C06361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ItemRecord> $newRecords;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06361(List<ItemRecord> list, Continuation<? super C06361> continuation) {
            super(2, continuation);
            this.$newRecords = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06361(this.$newRecords, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0083  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object savedPassword;
            Object value;
            ContactBookViewModel contactBookViewModel;
            List<ItemRecord> list;
            ContactBookViewModel contactBookViewModel2;
            Throwable thM7115exceptionOrNullimpl;
            String localizedMessage;
            String localizedMessage2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                savedPassword = ContactBookViewModel.this.authPreferences.getSavedPassword(this);
                if (savedPassword != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                savedPassword = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            contactBookViewModel = ContactBookViewModel.this;
            list = this.$newRecords;
            if (Result.m7119isSuccessimpl(value)) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, list, null, null, null, null, null, false, false, null, "✅ 變更已成功發布至雲端！", null, false, null, false, null, false, 260091, null));
            }
            contactBookViewModel2 = ContactBookViewModel.this;
            thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
            if (thM7115exceptionOrNullimpl != null) {
                contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "❌ 發布失敗：" + thM7115exceptionOrNullimpl.getLocalizedMessage(), null, false, null, false, null, false, 260095, null));
                localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                if ((localizedMessage == null && StringsKt.contains$default((CharSequence) localizedMessage, (CharSequence) "密碼", false, 2, (Object) null)) || ((localizedMessage2 = thM7115exceptionOrNullimpl.getLocalizedMessage()) != null && StringsKt.contains$default((CharSequence) localizedMessage2, (CharSequence) "權限", false, 2, (Object) null))) {
                    contactBookViewModel2.logout();
                }
            }
            return Unit.INSTANCE;
            String str = (String) savedPassword;
            if (str == null) {
                str = "";
            }
            ContactBookUiState contactBookUiState = (ContactBookUiState) ContactBookViewModel.this._uiState.getValue();
            ContactBookEntry contactBookEntry = new ContactBookEntry(OfflineDataRepository.ROW_ID, contactBookUiState.getClassTitle(), contactBookUiState.getAnnouncement(), this.$newRecords, (String) null, 16, (DefaultConstructorMarker) null);
            this.label = 2;
            Object objM6726updateContactBook0E7RQCE = ContactBookViewModel.this.repository.m6726updateContactBook0E7RQCE(str, contactBookEntry, this);
            if (objM6726updateContactBook0E7RQCE != coroutine_suspended) {
                value = objM6726updateContactBook0E7RQCE;
                contactBookViewModel = ContactBookViewModel.this;
                list = this.$newRecords;
                if (Result.m7119isSuccessimpl(value)) {
                    contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, list, null, null, null, null, null, false, false, null, "✅ 變更已成功發布至雲端！", null, false, null, false, null, false, 260091, null));
                }
                contactBookViewModel2 = ContactBookViewModel.this;
                thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
                if (thM7115exceptionOrNullimpl != null) {
                    contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "❌ 發布失敗：" + thM7115exceptionOrNullimpl.getLocalizedMessage(), null, false, null, false, null, false, 260095, null));
                    localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                    if (localizedMessage == null) {
                        contactBookViewModel2.logout();
                    } else {
                        contactBookViewModel2.logout();
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void publishRecords(List<ItemRecord> newRecords) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06361(newRecords, null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$fetchHistoryLogs$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$fetchHistoryLogs$1", f = "ContactBookViewModel.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    static final class C06311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C06311(Continuation<? super C06311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, true, null, false, null, false, 253951, null));
                this.label = 1;
                Object objM6721fetchHistoryLogsIoAF18A = ContactBookViewModel.this.repository.m6721fetchHistoryLogsIoAF18A(this);
                if (objM6721fetchHistoryLogsIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM6721fetchHistoryLogsIoAF18A;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            ContactBookViewModel contactBookViewModel = ContactBookViewModel.this;
            if (Result.m7119isSuccessimpl(value)) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, (List) value, false, null, false, null, false, 249855, null));
            }
            ContactBookViewModel contactBookViewModel2 = ContactBookViewModel.this;
            if (Result.m7115exceptionOrNullimpl(value) != null) {
                contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "取得歷史紀錄失敗", null, false, null, false, null, false, 251903, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchHistoryLogs() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06311(null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$restoreFromLog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$restoreFromLog$1", f = "ContactBookViewModel.kt", i = {}, l = {233, 234}, m = "invokeSuspend", n = {}, s = {})
    static final class C06371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ContactBookLogEntry $log;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06371(ContactBookLogEntry contactBookLogEntry, Continuation<? super C06371> continuation) {
            super(2, continuation);
            this.$log = contactBookLogEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06371(this.$log, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:25:0x00af  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object savedPassword;
            Object value;
            ContactBookViewModel contactBookViewModel;
            ContactBookLogEntry contactBookLogEntry;
            ContactBookViewModel contactBookViewModel2;
            Throwable thM7115exceptionOrNullimpl;
            String localizedMessage;
            String localizedMessage2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                savedPassword = ContactBookViewModel.this.authPreferences.getSavedPassword(this);
                if (savedPassword != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                savedPassword = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            contactBookViewModel = ContactBookViewModel.this;
            contactBookLogEntry = this.$log;
            if (Result.m7119isSuccessimpl(value)) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), contactBookLogEntry.getClassTitle(), contactBookLogEntry.getAnnouncement(), contactBookLogEntry.getRecords(), null, null, null, null, null, false, false, null, "🔄 已成功還原至指定歷史版本！", null, false, null, false, null, false, 260088, null));
            }
            contactBookViewModel2 = ContactBookViewModel.this;
            thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
            if (thM7115exceptionOrNullimpl != null) {
                contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "還原失敗：" + thM7115exceptionOrNullimpl.getLocalizedMessage(), null, false, null, false, null, false, 260095, null));
                localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                if ((localizedMessage == null && StringsKt.contains$default((CharSequence) localizedMessage, (CharSequence) "密碼", false, 2, (Object) null)) || ((localizedMessage2 = thM7115exceptionOrNullimpl.getLocalizedMessage()) != null && StringsKt.contains$default((CharSequence) localizedMessage2, (CharSequence) "權限", false, 2, (Object) null))) {
                    contactBookViewModel2.logout();
                }
            }
            return Unit.INSTANCE;
            String str = (String) savedPassword;
            if (str == null) {
                str = "";
            }
            this.label = 2;
            Object objM6725restoreFromLog0E7RQCE = ContactBookViewModel.this.repository.m6725restoreFromLog0E7RQCE(str, this.$log, this);
            if (objM6725restoreFromLog0E7RQCE != coroutine_suspended) {
                value = objM6725restoreFromLog0E7RQCE;
                contactBookViewModel = ContactBookViewModel.this;
                contactBookLogEntry = this.$log;
                if (Result.m7119isSuccessimpl(value)) {
                    contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), contactBookLogEntry.getClassTitle(), contactBookLogEntry.getAnnouncement(), contactBookLogEntry.getRecords(), null, null, null, null, null, false, false, null, "🔄 已成功還原至指定歷史版本！", null, false, null, false, null, false, 260088, null));
                }
                contactBookViewModel2 = ContactBookViewModel.this;
                thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
                if (thM7115exceptionOrNullimpl != null) {
                    contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "還原失敗：" + thM7115exceptionOrNullimpl.getLocalizedMessage(), null, false, null, false, null, false, 260095, null));
                    localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                    if (localizedMessage == null) {
                        contactBookViewModel2.logout();
                    } else {
                        contactBookViewModel2.logout();
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    public final void restoreFromLog(ContactBookLogEntry log) {
        Intrinsics.checkNotNullParameter(log, "log");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06371(log, null), 3, null);
    }

    public final void clearToast() {
        MutableStateFlow<ContactBookUiState> mutableStateFlow = this._uiState;
        mutableStateFlow.setValue(ContactBookUiState.copy$default(mutableStateFlow.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 260095, null));
    }

    public final boolean isItemActiveOnDate(ItemRecord item, String targetDate) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        if (item.getDate().length() == 0 && item.getDueDate().length() == 0) {
            return false;
        }
        if (item.getDueDate().length() > 0) {
            if (targetDate.compareTo(item.getDueDate()) >= 0) {
                return false;
            }
            String date = item.getDate();
            if (date.length() == 0) {
                date = item.getDueDate();
            }
            return targetDate.compareTo(date) >= 0;
        }
        return Intrinsics.areEqual(targetDate, item.getDate());
    }

    public final Long getCountdownDays(String dueDate, String targetDate) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(targetDate, "targetDate");
        if (dueDate.length() == 0) {
            return null;
        }
        try {
            return Long.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(targetDate, this.dateFormatter), LocalDate.parse(dueDate, this.dateFormatter)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$fetchInstallStats$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$fetchInstallStats$1", f = "ContactBookViewModel.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    static final class C06321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C06321(Continuation<? super C06321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, true, null, false, 229375, null));
                this.label = 1;
                Object objM6722fetchInstallStatsIoAF18A = ContactBookViewModel.this.repository.m6722fetchInstallStatsIoAF18A(this);
                if (objM6722fetchInstallStatsIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM6722fetchInstallStatsIoAF18A;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            ContactBookViewModel contactBookViewModel = ContactBookViewModel.this;
            if (Result.m7119isSuccessimpl(value)) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, (InstallStats) value, false, null, false, 212991, null));
            }
            ContactBookViewModel contactBookViewModel2 = ContactBookViewModel.this;
            if (Result.m7115exceptionOrNullimpl(value) != null) {
                contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "取得統計失敗，請先至 Offline 建立 app_installations 資料表", null, false, null, false, null, false, 227327, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchInstallStats() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06321(null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$loadTimetable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$loadTimetable$1", f = "ContactBookViewModel.kt", i = {}, l = {297, 299}, m = "invokeSuspend", n = {}, s = {})
    static final class C06341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C06341(Continuation<? super C06341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM6723fetchTimetableIoAF18A;
            Object obj2;
            ContactBookViewModel contactBookViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, true, 131071, null));
                this.label = 1;
                objM6723fetchTimetableIoAF18A = ContactBookViewModel.this.repository.m6723fetchTimetableIoAF18A(this);
                if (objM6723fetchTimetableIoAF18A != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objM6723fetchTimetableIoAF18A = ((Result) obj).getValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            objM6723fetchTimetableIoAF18A = obj2;
            contactBookViewModel = ContactBookViewModel.this;
            if (Result.m7115exceptionOrNullimpl(objM6723fetchTimetableIoAF18A) != null) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 131071, null));
            }
            return Unit.INSTANCE;
            ContactBookViewModel contactBookViewModel2 = ContactBookViewModel.this;
            if (Result.m7119isSuccessimpl(objM6723fetchTimetableIoAF18A)) {
                TimetableData timetableData = (TimetableData) objM6723fetchTimetableIoAF18A;
                contactBookViewModel2._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel2._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, timetableData, false, 65535, null));
                AuthPreferences authPreferences = contactBookViewModel2.authPreferences;
                this.L$0 = objM6723fetchTimetableIoAF18A;
                this.label = 2;
                if (authPreferences.saveTimetable(timetableData, this) != coroutine_suspended) {
                    obj2 = objM6723fetchTimetableIoAF18A;
                    objM6723fetchTimetableIoAF18A = obj2;
                }
                return coroutine_suspended;
            }
            contactBookViewModel = ContactBookViewModel.this;
            if (Result.m7115exceptionOrNullimpl(objM6723fetchTimetableIoAF18A) != null) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 131071, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadTimetable() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06341(null), 3, null);
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$updateTimetable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContactBookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel$updateTimetable$1", f = "ContactBookViewModel.kt", i = {1, 1}, l = {StatusLine.HTTP_PERM_REDIRECT, 314, 316}, m = "invokeSuspend", n = {"pwd", "updated"}, s = {"L$0", "L$1"})
    static final class C06401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, List<String>> $newSchedule;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06401(Map<String, ? extends List<String>> map, Continuation<? super C06401> continuation) {
            super(2, continuation);
            this.$newSchedule = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactBookViewModel.this.new C06401(this.$newSchedule, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:31:0x0134  */
        /* JADX WARN: Code duplicated, block: B:33:0x0149  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object savedPassword;
            String str;
            TimetableData timetableData;
            Object objM6727updateTimetable0E7RQCE;
            Object value;
            ContactBookViewModel contactBookViewModel;
            ContactBookViewModel contactBookViewModel2;
            Throwable thM7115exceptionOrNullimpl;
            String localizedMessage;
            String localizedMessage2;
            String localizedMessage3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                savedPassword = ContactBookViewModel.this.authPreferences.getSavedPassword(this);
                if (savedPassword != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                savedPassword = obj;
            } else {
                if (i == 2) {
                    timetableData = (TimetableData) this.L$1;
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objM6727updateTimetable0E7RQCE = ContactBookViewModel.this.repository.m6727updateTimetable0E7RQCE(str, timetableData, this);
                    if (objM6727updateTimetable0E7RQCE != coroutine_suspended) {
                        value = objM6727updateTimetable0E7RQCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            contactBookViewModel = ContactBookViewModel.this;
            if (Result.m7119isSuccessimpl(value)) {
                contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "📅 班級課表已安全發布！", null, false, null, false, null, false, 260095, null));
            }
            contactBookViewModel2 = ContactBookViewModel.this;
            thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
            if (thM7115exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = contactBookViewModel2._uiState;
                ContactBookUiState contactBookUiState = (ContactBookUiState) contactBookViewModel2._uiState.getValue();
                localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "請確認權限";
                }
                mutableStateFlow.setValue(ContactBookUiState.copy$default(contactBookUiState, null, null, null, null, null, null, null, null, false, false, null, "❌ 課表雲端發布失敗：" + localizedMessage, null, false, null, false, null, false, 260095, null));
                localizedMessage2 = thM7115exceptionOrNullimpl.getLocalizedMessage();
                if ((localizedMessage2 == null && StringsKt.contains$default((CharSequence) localizedMessage2, (CharSequence) "密碼", false, 2, (Object) null)) || ((localizedMessage3 = thM7115exceptionOrNullimpl.getLocalizedMessage()) != null && StringsKt.contains$default((CharSequence) localizedMessage3, (CharSequence) "權限", false, 2, (Object) null))) {
                    contactBookViewModel2.logout();
                }
            }
            return Unit.INSTANCE;
            String str2 = (String) savedPassword;
            if (str2 == null) {
                str2 = "";
            }
            str = str2;
            TimetableData timetableDataCopy$default = TimetableData.copy$default(((ContactBookUiState) ContactBookViewModel.this._uiState.getValue()).getTimetable(), null, this.$newSchedule, Instant.now().toString(), 1, null);
            ContactBookViewModel.this._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) ContactBookViewModel.this._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, timetableDataCopy$default, false, 196607, null));
            this.L$0 = str;
            this.L$1 = timetableDataCopy$default;
            this.label = 2;
            if (ContactBookViewModel.this.authPreferences.saveTimetable(timetableDataCopy$default, this) != coroutine_suspended) {
                timetableData = timetableDataCopy$default;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objM6727updateTimetable0E7RQCE = ContactBookViewModel.this.repository.m6727updateTimetable0E7RQCE(str, timetableData, this);
                if (objM6727updateTimetable0E7RQCE != coroutine_suspended) {
                    value = objM6727updateTimetable0E7RQCE;
                    contactBookViewModel = ContactBookViewModel.this;
                    if (Result.m7119isSuccessimpl(value)) {
                        contactBookViewModel._uiState.setValue(ContactBookUiState.copy$default((ContactBookUiState) contactBookViewModel._uiState.getValue(), null, null, null, null, null, null, null, null, false, false, null, "📅 班級課表已安全發布！", null, false, null, false, null, false, 260095, null));
                    }
                    contactBookViewModel2 = ContactBookViewModel.this;
                    thM7115exceptionOrNullimpl = Result.m7115exceptionOrNullimpl(value);
                    if (thM7115exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = contactBookViewModel2._uiState;
                        ContactBookUiState contactBookUiState2 = (ContactBookUiState) contactBookViewModel2._uiState.getValue();
                        localizedMessage = thM7115exceptionOrNullimpl.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "請確認權限";
                        }
                        mutableStateFlow2.setValue(ContactBookUiState.copy$default(contactBookUiState2, null, null, null, null, null, null, null, null, false, false, null, "❌ 課表雲端發布失敗：" + localizedMessage, null, false, null, false, null, false, 260095, null));
                        localizedMessage2 = thM7115exceptionOrNullimpl.getLocalizedMessage();
                        if (localizedMessage2 == null) {
                            contactBookViewModel2.logout();
                        } else {
                            contactBookViewModel2.logout();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
    }

    public final void updateTimetable(Map<String, ? extends List<String>> newSchedule) {
        Intrinsics.checkNotNullParameter(newSchedule, "newSchedule");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C06401(newSchedule, null), 3, null);
    }

    public final String getShortTimetablePreview(String dateStr) {
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        try {
            int value = LocalDate.parse(dateStr, this.dateFormatter).getDayOfWeek().getValue();
            if (1 <= value && value < 6) {
                List<String> listEmptyList = this._uiState.getValue().getTimetable().getSchedule().get(String.valueOf(value));
                if (listEmptyList == null && (listEmptyList = TimetableData.INSTANCE.getDEFAULT_SCHEDULE().get(String.valueOf(value))) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List listTake = CollectionsKt.take(listEmptyList, 10);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                Iterator it = listTake.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.trim((CharSequence) TimetableData.INSTANCE.getShortName((String) it.next())).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    String str = (String) obj;
                    if (str.length() > 0 && !Intrinsics.areEqual(str, "-") && !Intrinsics.areEqual(str, "空") && !Intrinsics.areEqual(str, "[空]")) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                return arrayList3.isEmpty() ? "今日無課" : CollectionsKt.joinToString$default(arrayList3, "·", null, null, 0, null, null, 62, null);
            }
            return "週末無課";
        } catch (Exception unused) {
            return "課表";
        }
    }
}
