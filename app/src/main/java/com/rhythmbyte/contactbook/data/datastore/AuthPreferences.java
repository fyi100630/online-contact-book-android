package com.rhythmbyte.contactbook.data.datastore;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import com.rhythmbyte.contactbook.data.model.UserRole;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: AuthPreferences.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/rhythmbyte/contactbook/data/datastore/AuthPreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "userRoleFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rhythmbyte/contactbook/data/model/UserRole;", "getUserRoleFlow", "()Lkotlinx/coroutines/flow/Flow;", "saveUserRole", "", "role", HintConstants.AUTOFILL_HINT_PASSWORD, "", "(Lcom/rhythmbyte/contactbook/data/model/UserRole;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearUserRole", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedPassword", "getOrCreateInstallId", "getSavedTimetable", "Lcom/rhythmbyte/contactbook/data/model/TimetableData;", "saveTimetable", "data", "(Lcom/rhythmbyte/contactbook/data/model/TimetableData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthPreferences {
    private final Context context;
    private final Flow<UserRole> userRoleFlow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Preferences.Key<Integer> KEY_AUTH_VERSION = PreferencesKeys.intKey("auth_version_v2");
    private static final Preferences.Key<String> KEY_USER_ROLE = PreferencesKeys.stringKey("saved_user_role");
    private static final Preferences.Key<String> KEY_SAVED_PASSWORD = PreferencesKeys.stringKey("saved_password");
    private static final Preferences.Key<String> KEY_INSTALL_ID = PreferencesKeys.stringKey("app_install_id");
    private static final Preferences.Key<String> KEY_TIMETABLE_JSON = PreferencesKeys.stringKey("cached_timetable_json");
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AuthPreferences.json$lambda$1((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$getOrCreateInstallId$1, reason: invalid class name */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences", f = "AuthPreferences.kt", i = {0, 1}, l = {73, 79}, m = "getOrCreateInstallId", n = {"this", "newId"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthPreferences.this.getOrCreateInstallId(this);
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$getSavedPassword$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences", f = "AuthPreferences.kt", i = {}, l = {66}, m = "getSavedPassword", n = {}, s = {})
    static final class C06211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C06211(Continuation<? super C06211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthPreferences.this.getSavedPassword(this);
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$getSavedTimetable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences", f = "AuthPreferences.kt", i = {}, l = {86}, m = "getSavedTimetable", n = {}, s = {})
    static final class C06221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C06221(Continuation<? super C06221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthPreferences.this.getSavedTimetable(this);
        }
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$saveTimetable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences", f = "AuthPreferences.kt", i = {}, l = {98}, m = "saveTimetable", n = {}, s = {})
    static final class C06231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C06231(Continuation<? super C06231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthPreferences.this.saveTimetable(null, this);
        }
    }

    public AuthPreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Flow<Preferences> data = AuthPreferencesKt.getUserDataStore(context).getData();
        this.userRoleFlow = new Flow<UserRole>() { // from class: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$special$$inlined$map$1

            /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences$special$$inlined$map$1$2", f = "AuthPreferences.kt", i = {}, l = {AccessibilityNodeInfoCompat.MAX_NUMBER_OF_PREFETCHED_NODES}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    UserRole userRoleValueOf;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Preferences preferences = (Preferences) obj;
                        Integer num = (Integer) preferences.get(AuthPreferences.KEY_AUTH_VERSION);
                        if ((num != null ? num.intValue() : 0) < 2) {
                            userRoleValueOf = UserRole.VISITOR;
                        } else {
                            String str = (String) preferences.get(AuthPreferences.KEY_USER_ROLE);
                            if (str == null) {
                                str = "VISITOR";
                            }
                            try {
                                userRoleValueOf = UserRole.valueOf(str);
                            } catch (Exception unused) {
                                userRoleValueOf = UserRole.VISITOR;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(userRoleValueOf, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserRole> flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/rhythmbyte/contactbook/data/datastore/AuthPreferences$Companion;", "", "<init>", "()V", "KEY_AUTH_VERSION", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getKEY_AUTH_VERSION", "()Landroidx/datastore/preferences/core/Preferences$Key;", "KEY_USER_ROLE", "", "getKEY_USER_ROLE", "KEY_SAVED_PASSWORD", "getKEY_SAVED_PASSWORD", "KEY_INSTALL_ID", "getKEY_INSTALL_ID", "KEY_TIMETABLE_JSON", "getKEY_TIMETABLE_JSON", "json", "Lkotlinx/serialization/json/Json;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Preferences.Key<Integer> getKEY_AUTH_VERSION() {
            return AuthPreferences.KEY_AUTH_VERSION;
        }

        public final Preferences.Key<String> getKEY_USER_ROLE() {
            return AuthPreferences.KEY_USER_ROLE;
        }

        public final Preferences.Key<String> getKEY_SAVED_PASSWORD() {
            return AuthPreferences.KEY_SAVED_PASSWORD;
        }

        public final Preferences.Key<String> getKEY_INSTALL_ID() {
            return AuthPreferences.KEY_INSTALL_ID;
        }

        public final Preferences.Key<String> getKEY_TIMETABLE_JSON() {
            return AuthPreferences.KEY_TIMETABLE_JSON;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$1(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final Flow<UserRole> getUserRoleFlow() {
        return this.userRoleFlow;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$saveUserRole$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences$saveUserRole$2", f = "AuthPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06252 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $password;
        final /* synthetic */ UserRole $role;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06252(UserRole userRole, String str, Continuation<? super C06252> continuation) {
            super(2, continuation);
            this.$role = userRole;
            this.$password = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06252 c06252 = new C06252(this.$role, this.$password, continuation);
            c06252.L$0 = obj;
            return c06252;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C06252) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            mutablePreferences.set(AuthPreferences.INSTANCE.getKEY_AUTH_VERSION(), Boxing.boxInt(2));
            mutablePreferences.set(AuthPreferences.INSTANCE.getKEY_USER_ROLE(), this.$role.name());
            if (this.$password.length() > 0) {
                mutablePreferences.set(AuthPreferences.INSTANCE.getKEY_SAVED_PASSWORD(), this.$password);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object saveUserRole$default(AuthPreferences authPreferences, UserRole userRole, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return authPreferences.saveUserRole(userRole, str, continuation);
    }

    public final Object saveUserRole(UserRole userRole, String str, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(AuthPreferencesKt.getUserDataStore(this.context), new C06252(userRole, str, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$clearUserRole$2, reason: invalid class name */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences$clearUserRole$2", f = "AuthPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            mutablePreferences.set(AuthPreferences.INSTANCE.getKEY_AUTH_VERSION(), Boxing.boxInt(2));
            mutablePreferences.set(AuthPreferences.INSTANCE.getKEY_USER_ROLE(), "VISITOR");
            mutablePreferences.remove(AuthPreferences.INSTANCE.getKEY_SAVED_PASSWORD());
            return Unit.INSTANCE;
        }
    }

    public final Object clearUserRole(Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(AuthPreferencesKt.getUserDataStore(this.context), new AnonymousClass2(null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getSavedPassword(Continuation<? super String> continuation) {
        C06211 c06211;
        if (continuation instanceof C06211) {
            c06211 = (C06211) continuation;
            if ((c06211.label & Integer.MIN_VALUE) != 0) {
                c06211.label -= Integer.MIN_VALUE;
            } else {
                c06211 = new C06211(continuation);
            }
        } else {
            c06211 = new C06211(continuation);
        }
        Object objFirst = c06211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06211.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Preferences> data = AuthPreferencesKt.getUserDataStore(this.context).getData();
            c06211.label = 1;
            objFirst = FlowKt.first(data, c06211);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        Preferences preferences = (Preferences) objFirst;
        Integer num = (Integer) preferences.get(KEY_AUTH_VERSION);
        if ((num != null ? num.intValue() : 0) < 2) {
            return null;
        }
        return preferences.get(KEY_SAVED_PASSWORD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getOrCreateInstallId(Continuation<? super String> continuation) {
        AnonymousClass1 anonymousClass1;
        AuthPreferences authPreferences;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objFirst = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Preferences> data = AuthPreferencesKt.getUserDataStore(this.context).getData();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objFirst = FlowKt.first(data, anonymousClass1);
            if (objFirst != coroutine_suspended) {
                authPreferences = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objFirst);
            return str;
        }
        authPreferences = (AuthPreferences) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objFirst);
        String str2 = (String) ((Preferences) objFirst).get(KEY_INSTALL_ID);
        String str3 = str2;
        if (str3 != null && str3.length() != 0) {
            return str2;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        DataStore<Preferences> userDataStore = AuthPreferencesKt.getUserDataStore(authPreferences.context);
        C06202 c06202 = new C06202(string, null);
        anonymousClass1.L$0 = string;
        anonymousClass1.label = 2;
        return PreferencesKt.edit(userDataStore, c06202, anonymousClass1) == coroutine_suspended ? coroutine_suspended : string;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$getOrCreateInstallId$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences$getOrCreateInstallId$2", f = "AuthPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06202 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $newId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06202(String str, Continuation<? super C06202> continuation) {
            super(2, continuation);
            this.$newId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06202 c06202 = new C06202(this.$newId, continuation);
            c06202.L$0 = obj;
            return c06202;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C06202) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(AuthPreferences.INSTANCE.getKEY_INSTALL_ID(), this.$newId);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getSavedTimetable(Continuation<? super TimetableData> continuation) {
        C06221 c06221;
        if (continuation instanceof C06221) {
            c06221 = (C06221) continuation;
            if ((c06221.label & Integer.MIN_VALUE) != 0) {
                c06221.label -= Integer.MIN_VALUE;
            } else {
                c06221 = new C06221(continuation);
            }
        } else {
            c06221 = new C06221(continuation);
        }
        Object objFirst = c06221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06221.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Preferences> data = AuthPreferencesKt.getUserDataStore(this.context).getData();
            c06221.label = 1;
            objFirst = FlowKt.first(data, c06221);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        String str = (String) ((Preferences) objFirst).get(KEY_TIMETABLE_JSON);
        if (str == null) {
            return null;
        }
        try {
            Json json2 = json;
            json2.getSerializersModule();
            return (TimetableData) json2.decodeFromString(TimetableData.INSTANCE.serializer(), str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object saveTimetable(TimetableData timetableData, Continuation<? super Unit> continuation) {
        C06231 c06231;
        if (continuation instanceof C06231) {
            c06231 = (C06231) continuation;
            if ((c06231.label & Integer.MIN_VALUE) != 0) {
                c06231.label -= Integer.MIN_VALUE;
            } else {
                c06231 = new C06231(continuation);
            }
        } else {
            c06231 = new C06231(continuation);
        }
        Object obj = c06231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06231.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strEncodeToString = json.encodeToString(TimetableData.INSTANCE.serializer(), timetableData);
                DataStore<Preferences> userDataStore = AuthPreferencesKt.getUserDataStore(this.context);
                C06242 c06242 = new C06242(strEncodeToString, null);
                c06231.label = 1;
                if (PreferencesKt.edit(userDataStore, c06242, c06231) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.data.datastore.AuthPreferences$saveTimetable$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AuthPreferences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.rhythmbyte.contactbook.data.datastore.AuthPreferences$saveTimetable$2", f = "AuthPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06242 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $jsonString;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06242(String str, Continuation<? super C06242> continuation) {
            super(2, continuation);
            this.$jsonString = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06242 c06242 = new C06242(this.$jsonString, continuation);
            c06242.L$0 = obj;
            return c06242;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C06242) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(AuthPreferences.INSTANCE.getKEY_TIMETABLE_JSON(), this.$jsonString);
            return Unit.INSTANCE;
        }
    }
}
