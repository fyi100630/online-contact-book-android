package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TimetableDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001aQ\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2$\u0010\u000b\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\r\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0002\u0010\u0010\" \u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\nX\u008a\u008e\u0002²\u0006\u0018\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"COMMON_SUBJECTS", "", "Lkotlin/Pair;", "", "WEEKDAY_COLUMNS", "TimetableDialog", "", "timetable", "Lcom/rhythmbyte/contactbook/data/model/TimetableData;", "isSuperAdmin", "", "onSave", "Lkotlin/Function1;", "", "onDismiss", "Lkotlin/Function0;", "(Lcom/rhythmbyte/contactbook/data/model/TimetableData;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "isEditing", "selectedCell", "", "customFullName", "customShortChar"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TimetableDialogKt {
    private static final List<Pair<String, String>> COMMON_SUBJECTS = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("國語文", "國"), TuplesKt.to("英語文", "英"), TuplesKt.to("數學", "數"), TuplesKt.to("物理", "物"), TuplesKt.to("化學", "化"), TuplesKt.to("生物", "生"), TuplesKt.to("地科", "地"), TuplesKt.to("歷史", "歷"), TuplesKt.to("地理", "理"), TuplesKt.to("公民", "公"), TuplesKt.to("體育", "體"), TuplesKt.to("資訊", "資"), TuplesKt.to("美術", "美"), TuplesKt.to("音樂", "音"), TuplesKt.to("自習", "自"), TuplesKt.to("班會", "班"), TuplesKt.to("輔導", "輔"), TuplesKt.to("社團", "社")});
    private static final List<Pair<String, String>> WEEKDAY_COLUMNS = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("1", "週一"), TuplesKt.to("2", "週二"), TuplesKt.to("3", "週三"), TuplesKt.to("4", "週四"), TuplesKt.to("5", "週五")});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimetableDialog$lambda$15(TimetableData timetableData, boolean z, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        TimetableDialog(timetableData, z, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TimetableDialog(final TimetableData timetableData, final boolean z, final Function1<? super Map<String, ? extends List<String>>, Unit> onSave, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        boolean z2;
        SnapshotStateMap snapshotStateMap;
        Composer composer2;
        TimetableData timetable = timetableData;
        Intrinsics.checkNotNullParameter(timetable, "timetable");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1579122866);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TimetableDialog)P(3!1,2)104@3834L21,106@3880L109,111@4012L34,113@4072L53,114@4152L31,115@4211L31,117@4271L474,133@4780L316,133@4751L345,149@5291L28693,143@5102L28882:TimetableDialog.kt#7ivg5k");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(timetable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSave) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1579122866, i3, -1, "com.rhythmbyte.contactbook.ui.components.TimetableDialog (TimetableDialog.kt:103)");
            }
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-575748624);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int value = LocalDate.now().getDayOfWeek().getValue();
                objRememberedValue = (1 > value || value >= 6) ? "0" : String.valueOf(value);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String str = (String) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-575744475);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-575742536);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-575739998);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-575738110);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-575735747);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(timetable);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateMapOf();
                int i4 = 1;
                while (i4 < 6) {
                    String strValueOf = String.valueOf(i4);
                    List<String> listEmptyList = timetable.getSchedule().get(strValueOf);
                    if (listEmptyList == null && (listEmptyList = TimetableData.INSTANCE.getDEFAULT_SCHEDULE().get(strValueOf)) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) listEmptyList);
                    while (mutableList.size() < 10) {
                        mutableList.add("");
                    }
                    ((Map) objRememberedValue6).put(strValueOf, mutableList);
                    i4++;
                    timetable = timetableData;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            Pair<String, Integer> pairTimetableDialog$lambda$5 = TimetableDialog$lambda$5(mutableState2);
            composerStartRestartGroup.startReplaceGroup(-575719617);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimetableDialog.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotStateMap2);
            TimetableDialogKt$TimetableDialog$1$1 timetableDialogKt$TimetableDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || timetableDialogKt$TimetableDialog$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                snapshotStateMap = snapshotStateMap2;
                timetableDialogKt$TimetableDialog$1$1RememberedValue = new TimetableDialogKt$TimetableDialog$1$1(snapshotStateMap, mutableState2, mutableState3, mutableState4, null);
                composerStartRestartGroup.updateRememberedValue(timetableDialogKt$TimetableDialog$1$1RememberedValue);
            } else {
                snapshotStateMap = snapshotStateMap2;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(pairTimetableDialog$lambda$5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) timetableDialogKt$TimetableDialog$1$1RememberedValue, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, null, false, false, 7, null), ComposableLambdaKt.rememberComposableLambda(-1825176283, true, new AnonymousClass2(zIsSystemInDarkTheme, z2, snapshotStateMap, onDismiss, mutableState, onSave, mutableState2, str, mutableState3, mutableState4), composerStartRestartGroup, 54), composer2, ((i3 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimetableDialogKt.TimetableDialog$lambda$15(timetableData, z, onSave, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TimetableDialog$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimetableDialog$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<String, Integer> TimetableDialog$lambda$5(MutableState<Pair<String, Integer>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TimetableDialog$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TimetableDialog$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2, reason: invalid class name */
    /* JADX INFO: compiled from: TimetableDialog.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<String> $customFullName$delegate;
        final /* synthetic */ MutableState<String> $customShortChar$delegate;
        final /* synthetic */ SnapshotStateMap<String, List<String>> $editableSchedule;
        final /* synthetic */ boolean $isDarkTheme;
        final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        final /* synthetic */ boolean $isSuperAdmin;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<Map<String, ? extends List<String>>, Unit> $onSave;
        final /* synthetic */ MutableState<Pair<String, Integer>> $selectedCell$delegate;
        final /* synthetic */ String $todayWeekday;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z, boolean z2, SnapshotStateMap<String, List<String>> snapshotStateMap, Function0<Unit> function0, MutableState<Boolean> mutableState, Function1<? super Map<String, ? extends List<String>>, Unit> function1, MutableState<Pair<String, Integer>> mutableState2, String str, MutableState<String> mutableState3, MutableState<String> mutableState4) {
            this.$isDarkTheme = z;
            this.$isSuperAdmin = z2;
            this.$editableSchedule = snapshotStateMap;
            this.$onDismiss = function0;
            this.$isEditing$delegate = mutableState;
            this.$onSave = function1;
            this.$selectedCell$delegate = mutableState2;
            this.$todayWeekday = str;
            this.$customFullName$delegate = mutableState3;
            this.$customShortChar$delegate = mutableState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:309:0x14dc  */
        /* JADX WARN: Code duplicated, block: B:431:0x1b43  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(Composer composer, int i) {
            String str;
            String str2;
            String str3;
            SnapshotStateMap<String, List<String>> snapshotStateMap;
            MutableState<Pair<String, Integer>> mutableState;
            long jM3842copywmQWz5c$default;
            long jM3842copywmQWz5c$default2;
            Object next;
            String str4;
            String str5;
            long jM3842copywmQWz5c$default3;
            long jColor;
            boolean z;
            long jM3842copywmQWz5c$default4;
            long jM3842copywmQWz5c$default5;
            final MutableState<Pair<String, Integer>> mutableState2;
            SnapshotStateMap<String, List<String>> snapshotStateMap2;
            String str6;
            long onSurface;
            String str7;
            String str8;
            String str9;
            Pair pairTimetableDialog$lambda$5;
            MutableState<Boolean> mutableState3;
            MutableState<Pair<String, Integer>> mutableState4;
            final MutableState<Boolean> mutableState5;
            final MutableState<Pair<String, Integer>> mutableState6;
            final MutableState<Boolean> mutableState7;
            final MutableState<Pair<String, Integer>> mutableState8;
            ComposerKt.sourceInformation(composer, "C150@5301L28677:TimetableDialog.kt#7ivg5k");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1825176283, i, -1, "com.rhythmbyte.contactbook.ui.components.TimetableDialog.<anonymous> (TimetableDialog.kt:150)");
                }
                Modifier modifierM239backgroundbw27NRU$default = BackgroundKt.m239backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(this.$isDarkTheme ? 4279179050L : 4294507260L), null, 2, null);
                boolean z2 = this.$isDarkTheme;
                boolean z3 = this.$isSuperAdmin;
                final SnapshotStateMap<String, List<String>> snapshotStateMap3 = this.$editableSchedule;
                Function0<Unit> function0 = this.$onDismiss;
                MutableState<Boolean> mutableState9 = this.$isEditing$delegate;
                final Function1<Map<String, ? extends List<String>>, Unit> function1 = this.$onSave;
                MutableState<Pair<String, Integer>> mutableState10 = this.$selectedCell$delegate;
                String str10 = this.$todayWeekday;
                MutableState<String> mutableState11 = this.$customFullName$delegate;
                MutableState<String> mutableState12 = this.$customShortChar$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM239backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1757881791, "C158@5519L565,173@6098L27870:TimetableDialog.kt#7ivg5k");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Brush.Companion companion = Brush.INSTANCE;
                Color[] colorArr = new Color[3];
                colorArr[0] = Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), z2 ? 0.15f : 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                colorArr[1] = Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald500(), z2 ? 0.08f : 0.05f, 0.0f, 0.0f, 0.0f, 14, null));
                colorArr[2] = Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU());
                BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m3796radialGradientP_VxKs$default(companion, CollectionsKt.listOf((Object[]) colorArr), 0L, 1200.0f, 0, 10, (Object) null), null, 0.0f, 6, null), composer, 0);
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierNavigationBarsPadding);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1550877881, "C180@6296L4606,268@10920L11568:TimetableDialog.kt#7ivg5k");
                float f = 16;
                float f2 = 12;
                Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(f2));
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM685paddingVpY3zN4);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1980350150, "C187@6630L1827,224@8479L2405:TimetableDialog.kt#7ivg5k");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -220319898, "C193@6971L11,188@6708L637,202@7371L40,204@7437L998:TimetableDialog.kt#7ivg5k");
                IconButtonKt.IconButton(function0, BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(38)), RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, ComposableSingletons$TimetableDialogKt.INSTANCE.m6733getLambda1$app_release(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2)), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, companion3);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1873456481, "C205@7474L545,215@8048L361:TimetableDialog.kt#7ivg5k");
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, companion4);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                Composer composerM3336constructorimpl6 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(composerM3336constructorimpl6, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m3343setimpl(composerM3336constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -899939334, "C206@7560L28,207@7621L39,212@7934L11,208@7693L296:TimetableDialog.kt#7ivg5k");
                MutableState<Boolean> mutableState13 = mutableState9;
                String str11 = str10;
                TextKt.m2376Text4IGK_g("📅", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
                float f3 = 6;
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer, 6);
                TextKt.m2376Text4IGK_g("411 班級完整課表", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m2376Text4IGK_g("連續 1～10 節 · 全週表格視圖".concat(TimetableDialogKt.TimetableDialog$lambda$2(mutableState13) ? " (管理員排課中)" : ""), (Modifier) null, TimetableDialogKt.TimetableDialog$lambda$2(mutableState13) ? com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500() : com.rhythmbyte.contactbook.ui.theme.ColorKt.getSlate400(), TextUnitKt.getSp(11.5d), (FontStyle) null, TimetableDialogKt.TimetableDialog$lambda$2(mutableState13) ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131026);
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                Modifier.Companion companion5 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion5);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl7 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl7, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM3336constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM3336constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m3343setimpl(composerM3336constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -218467772, "C:TimetableDialog.kt#7ivg5k");
                composer2.startReplaceGroup(-1531068001);
                ComposerKt.sourceInformation(composer2, "244@9681L166,251@10148L688,243@9623L1213");
                if (z3) {
                    composer2.startReplaceGroup(-1531067782);
                    ComposerKt.sourceInformation(composer2, "233@9000L41,228@8708L230,227@8654L837,240@9524L39");
                    if (TimetableDialogKt.TimetableDialog$lambda$2(mutableState13)) {
                        str = "C100@5047L9:Row.kt#2w3rfo";
                        str2 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                        str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        ButtonColors buttonColorsM1491buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald500(), 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14);
                        RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2));
                        PaddingValues paddingValuesM678PaddingValuesYgX7TsA = PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(10), Dp.m6302constructorimpl(f3));
                        Modifier modifierM715height3ABfNKs = SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(34));
                        composer2.startReplaceGroup(-1531065244);
                        ComposerKt.sourceInformation(composer2, "CC(remember):TimetableDialog.kt#9igjgp");
                        boolean zChanged = composer2.changed(function1) | composer2.changed(snapshotStateMap3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            mutableState7 = mutableState13;
                            mutableState8 = mutableState10;
                            objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TimetableDialogKt.AnonymousClass2.invoke$lambda$26$lambda$25$lambda$8$lambda$7$lambda$4$lambda$3(function1, snapshotStateMap3, mutableState7, mutableState8);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        } else {
                            mutableState7 = mutableState13;
                            mutableState8 = mutableState10;
                        }
                        composer2.endReplaceGroup();
                        snapshotStateMap = snapshotStateMap3;
                        mutableState3 = mutableState7;
                        mutableState4 = mutableState8;
                        ButtonKt.Button((Function0) objRememberedValue, modifierM715height3ABfNKs, false, roundedCornerShapeM967RoundedCornerShape0680j_4, buttonColorsM1491buttonColorsro_MJ88, null, null, paddingValuesM678PaddingValuesYgX7TsA, null, ComposableSingletons$TimetableDialogKt.INSTANCE.m6734getLambda2$app_release(), composer, 817889328, 356);
                        composer2 = composer;
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer2, 6);
                    } else {
                        str = "C100@5047L9:Row.kt#2w3rfo";
                        str2 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                        str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        mutableState3 = mutableState13;
                        snapshotStateMap = snapshotStateMap3;
                        mutableState4 = mutableState10;
                    }
                    composer2.endReplaceGroup();
                    RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2));
                    PaddingValues paddingValuesM678PaddingValuesYgX7TsA2 = PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(10), Dp.m6302constructorimpl(f3));
                    Modifier modifierM715height3ABfNKs2 = SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(34));
                    composer2.startReplaceGroup(-1531034172);
                    ComposerKt.sourceInformation(composer2, "CC(remember):TimetableDialog.kt#9igjgp");
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        mutableState5 = mutableState3;
                        mutableState6 = mutableState4;
                        objRememberedValue2 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TimetableDialogKt.AnonymousClass2.invoke$lambda$26$lambda$25$lambda$8$lambda$7$lambda$6$lambda$5(mutableState5, mutableState6);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState5 = mutableState3;
                        mutableState6 = mutableState4;
                    }
                    composer2.endReplaceGroup();
                    mutableState13 = mutableState5;
                    mutableState = mutableState6;
                    ButtonKt.OutlinedButton((Function0) objRememberedValue2, modifierM715height3ABfNKs2, false, roundedCornerShapeM967RoundedCornerShape0680j_5, null, null, null, paddingValuesM678PaddingValuesYgX7TsA2, null, ComposableLambdaKt.rememberComposableLambda(371753069, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$1$1$1$2$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            ComposerKt.sourceInformation(composer3, "C252@10182L285,257@10500L39,258@10572L234:TimetableDialog.kt#7ivg5k");
                            if ((i2 & 17) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(371753069, i2, -1, "com.rhythmbyte.contactbook.ui.components.TimetableDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimetableDialog.kt:252)");
                                }
                                IconKt.m1833Iconww6aTOc(TimetableDialogKt.TimetableDialog$lambda$2(mutableState5) ? VisibilityKt.getVisibility(Icons.INSTANCE.getDefault()) : EditKt.getEdit(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(14)), 0L, composer3, 432, 8);
                                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(4)), composer3, 6);
                                TextKt.m2376Text4IGK_g(TimetableDialogKt.TimetableDialog$lambda$2(mutableState5) ? "完成" : "編輯課表", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131030);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer, 817889334, 372);
                    composer2 = composer;
                } else {
                    str = "C100@5047L9:Row.kt#2w3rfo";
                    str2 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                    str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    snapshotStateMap = snapshotStateMap3;
                    mutableState = mutableState10;
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                float f4 = 10;
                Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m6302constructorimpl(f4), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                String str12 = str2;
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str12);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM686paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl8 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl8, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM3336constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM3336constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m3343setimpl(composerM3336constructorimpl8, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1985003064, "C283@11608L11,274@11098L2771,334@14071L21,340@14423L11,330@13891L8579:TimetableDialog.kt#7ivg5k");
                float f5 = 14;
                Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4$default(Dp.m6302constructorimpl(f5), Dp.m6302constructorimpl(f5), 0.0f, 0.0f, 12, null));
                if (z2) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4280166715L), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                float f6 = 1;
                Modifier modifierM686paddingVpY3zN4$default2 = PaddingKt.m686paddingVpY3zN4$default(BorderKt.border(BackgroundKt.m239backgroundbw27NRU$default(modifierClip, jM3842copywmQWz5c$default, null, 2, null), BorderStrokeKt.m266BorderStrokecXLIe8U(Dp.m6302constructorimpl(f6), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4$default(Dp.m6302constructorimpl(f5), Dp.m6302constructorimpl(f5), 0.0f, 0.0f, 12, null)), 0.0f, Dp.m6302constructorimpl(f4), 1, null);
                Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str12);
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM686paddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor9);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl9 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl9, measurePolicyRowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    composerM3336constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                    composerM3336constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                }
                Updater.m3343setimpl(composerM3336constructorimpl9, modifierMaterializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                String str13 = str;
                ComposerKt.sourceInformationMarkerStart(composer2, -407918630, str13);
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -215121291, "C290@11943L456:TimetableDialog.kt#7ivg5k");
                float f7 = 42;
                Modifier modifierM734width3ABfNKs = SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f7));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str12);
                int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM734width3ABfNKs);
                Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor10);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl10 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                    composerM3336constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                    composerM3336constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                }
                Updater.m3343setimpl(composerM3336constructorimpl10, modifierMaterializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1868859181, "C294@12130L243:TimetableDialog.kt#7ivg5k");
                String str14 = "C73@3429L9:Box.kt#2w3rfo";
                String str15 = "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo";
                String str16 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                String str17 = str13;
                String str18 = str12;
                String str19 = "C87@4365L9:Column.kt#2w3rfo";
                String str20 = "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo";
                String str21 = str3;
                int i2 = 2;
                TextKt.m2376Text4IGK_g("節次", (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getSlate400(), TextUnitKt.getSp(11.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                Composer composer3 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.startReplaceGroup(-1530945108);
                ComposerKt.sourceInformation(composer3, "*304@12554L1267");
                for (Pair pair : TimetableDialogKt.WEEKDAY_COLUMNS) {
                    String str22 = (String) pair.component1();
                    String str23 = (String) pair.component2();
                    String str24 = str11;
                    boolean zAreEqual = Intrinsics.areEqual(str24, str22);
                    Modifier modifierM686paddingVpY3zN4$default3 = PaddingKt.m686paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance5, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m6302constructorimpl(i2), 0.0f, i2, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    String str25 = str16;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str25);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    String str26 = str18;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str26);
                    int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM686paddingVpY3zN4$default3);
                    Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                    String str27 = str21;
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str27);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor11);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3336constructorimpl11 = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(composerM3336constructorimpl11, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                        composerM3336constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                        composerM3336constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl11, modifierMaterializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                    String str28 = str14;
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, str28);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1868117537, "C310@12856L935:TimetableDialog.kt#7ivg5k");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    String str29 = str20;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, str29);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str26);
                    int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer3, companion6);
                    Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str27);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor12);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3336constructorimpl12 = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(composerM3336constructorimpl12, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl12, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                        composerM3336constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                        composerM3336constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl12, modifierMaterializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                    String str30 = str19;
                    ComposerKt.sourceInformationMarkerStart(composer3, -384862393, str30);
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -894577853, "C311@12953L374:TimetableDialog.kt#7ivg5k");
                    long sp = TextUnitKt.getSp(12.5d);
                    FontWeight.Companion companion7 = FontWeight.INSTANCE;
                    FontWeight extraBold = zAreEqual ? companion7.getExtraBold() : companion7.getBold();
                    composer3.startReplaceGroup(-1968511912);
                    ComposerKt.sourceInformation(composer3, "315@13268L11");
                    long sky500 = zAreEqual ? com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500() : MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface();
                    composer3.endReplaceGroup();
                    str19 = str30;
                    str20 = str29;
                    TextKt.m2376Text4IGK_g(str23, (Modifier) null, sky500, sp, (FontStyle) null, extraBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131026);
                    composer3 = composer;
                    composer3.startReplaceGroup(-1968507259);
                    ComposerKt.sourceInformation(composer3, "318@13419L300");
                    if (zAreEqual) {
                        TextKt.m2376Text4IGK_g("今日", (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), TextUnitKt.getSp(9.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                        composer3 = composer;
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    str11 = str24;
                    str14 = str28;
                    str16 = str25;
                    str21 = str27;
                    str18 = str26;
                    i2 = 2;
                }
                String str31 = str14;
                String str32 = str16;
                String str33 = str11;
                String str34 = str21;
                String str35 = str18;
                Object obj = null;
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScopeInstance3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                if (z2) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(ColorKt.Color(4279179050L), 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierBorder = BorderKt.border(BackgroundKt.m239backgroundbw27NRU$default(modifierVerticalScroll$default, jM3842copywmQWz5c$default2, null, 2, null), BorderStrokeKt.m266BorderStrokecXLIe8U(Dp.m6302constructorimpl(f6), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m6302constructorimpl(f5), Dp.m6302constructorimpl(f5), 3, null));
                String str36 = str20;
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, str36);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                String str37 = str35;
                int i3 = -1323940314;
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str37);
                int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer3, modifierBorder);
                Function0<ComposeUiNode> constructor13 = ComposeUiNode.INSTANCE.getConstructor();
                String str38 = str34;
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str38);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor13);
                } else {
                    composer3.useNode();
                }
                Composer composerM3336constructorimpl13 = Updater.m3336constructorimpl(composer3);
                Updater.m3343setimpl(composerM3336constructorimpl13, measurePolicyColumnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl13, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl13.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                    composerM3336constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                    composerM3336constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                }
                Updater.m3343setimpl(composerM3336constructorimpl13, modifierMaterializeModifier13, ComposeUiNode.INSTANCE.getSetModifier());
                String str39 = str19;
                ComposerKt.sourceInformationMarkerStart(composer3, -384862393, str39);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, -212266687, "C465@22407L41:TimetableDialog.kt#7ivg5k");
                composer3.startReplaceGroup(-1530868032);
                ComposerKt.sourceInformation(composer3, "*348@14824L7532");
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i4 + 1;
                    boolean z4 = i4 % 2 == 0;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj);
                    composer3.startReplaceGroup(-1530863296);
                    ComposerKt.sourceInformation(composer3, "353@15111L11");
                    if (z4) {
                        jM3842copywmQWz5c$default3 = Color.INSTANCE.m3878getTransparent0d7_KjU();
                    } else {
                        jM3842copywmQWz5c$default3 = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM686paddingVpY3zN4$default4 = PaddingKt.m686paddingVpY3zN4$default(BackgroundKt.m239backgroundbw27NRU$default(modifierFillMaxWidth$default, jM3842copywmQWz5c$default3, null, 2, null), 0.0f, Dp.m6302constructorimpl(3), 1, obj);
                    Alignment.Vertical centerVertically6 = Alignment.INSTANCE.getCenterVertically();
                    String str40 = str15;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str40);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically6, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, i3, str37);
                    int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer3, modifierM686paddingVpY3zN4$default4);
                    Function0<ComposeUiNode> constructor14 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str38);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor14);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3336constructorimpl14 = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(composerM3336constructorimpl14, measurePolicyRowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl14, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl14.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                        composerM3336constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                        composerM3336constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl14, modifierMaterializeModifier14, ComposeUiNode.INSTANCE.getSetModifier());
                    String str41 = str17;
                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, str41);
                    RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1865410090, "C359@15398L1375:TimetableDialog.kt#7ivg5k");
                    float f8 = 4;
                    Modifier modifierM686paddingVpY3zN4$default5 = PaddingKt.m686paddingVpY3zN4$default(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f7)), 0.0f, Dp.m6302constructorimpl(f8), 1, obj);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    String str42 = str32;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str42);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, i3, str37);
                    int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer3, modifierM686paddingVpY3zN4$default5);
                    Function0<ComposeUiNode> constructor15 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str38);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor15);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3336constructorimpl15 = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(composerM3336constructorimpl15, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl15, currentCompositionLocalMap15, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                        composerM3336constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                        composerM3336constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl15, modifierMaterializeModifier15, ComposeUiNode.INSTANCE.getSetModifier());
                    String str43 = str31;
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, str43);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -891822480, "C365@15724L1015:TimetableDialog.kt#7ivg5k");
                    Modifier modifierClip2 = ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(24)), RoundedCornerShapeKt.getCircleShape());
                    if (z2) {
                        jColor = Color.m3842copywmQWz5c$default(ColorKt.Color(4281549141L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jColor = ColorKt.Color(4293060848L);
                    }
                    Modifier modifierM239backgroundbw27NRU$default2 = BackgroundKt.m239backgroundbw27NRU$default(modifierClip2, jColor, null, 2, null);
                    Alignment center4 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str42);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str37);
                    int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer3, modifierM239backgroundbw27NRU$default2);
                    Function0<ComposeUiNode> constructor16 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str38);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor16);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3336constructorimpl16 = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(composerM3336constructorimpl16, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl16, currentCompositionLocalMap16, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                        composerM3336constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                        composerM3336constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl16, modifierMaterializeModifier16, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, str43);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -333282911, "C379@16618L11,375@16342L359:TimetableDialog.kt#7ivg5k");
                    str15 = str40;
                    str17 = str41;
                    String str44 = str43;
                    final int i6 = i4;
                    String str45 = str42;
                    String str46 = str37;
                    String str47 = str39;
                    String str48 = str36;
                    String str49 = str38;
                    TextKt.m2376Text4IGK_g(String.valueOf(i5), (Modifier) null, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
                    composer3 = composer;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.startReplaceGroup(78416492);
                    ComposerKt.sourceInformation(composer3, "*421@19519L129,394@17520L4772");
                    Iterator it = TimetableDialogKt.WEEKDAY_COLUMNS.iterator();
                    while (it.hasNext()) {
                        final String str50 = (String) ((Pair) it.next()).component1();
                        String str51 = str33;
                        boolean zAreEqual2 = Intrinsics.areEqual(str51, str50);
                        SnapshotStateMap<String, List<String>> snapshotStateMap4 = snapshotStateMap;
                        List<String> listEmptyList = snapshotStateMap4.get(str50);
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        Pair<String, String> cell = TimetableData.INSTANCE.parseCell((i6 < 0 || i6 >= listEmptyList.size()) ? "" : listEmptyList.get(i6));
                        String strComponent1 = cell.component1();
                        String strComponent2 = cell.component2();
                        if (TimetableDialogKt.TimetableDialog$lambda$2(mutableState13)) {
                            Pair pairTimetableDialog$lambda$6 = TimetableDialogKt.TimetableDialog$lambda$5(mutableState);
                            if (Intrinsics.areEqual(pairTimetableDialog$lambda$6 != null ? (String) pairTimetableDialog$lambda$6.getFirst() : null, str50) && (pairTimetableDialog$lambda$5 = TimetableDialogKt.TimetableDialog$lambda$5(mutableState)) != null && ((Number) pairTimetableDialog$lambda$5.getSecond()).intValue() == i6) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        boolean z5 = StringsKt.trim((CharSequence) strComponent1).toString().length() == 0;
                        float f9 = 8;
                        Modifier modifierClip3 = ClipKt.clip(ShadowKt.m3507shadows4CzXII$default(PaddingKt.m684padding3ABfNKs(SizeKt.m715height3ABfNKs(RowScope.weight$default(rowScopeInstance6, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m6302constructorimpl(TimetableDialogKt.TimetableDialog$lambda$2(mutableState13) ? 50 : 44)), Dp.m6302constructorimpl((float) 1.5d)), z ? Dp.m6302constructorimpl(f8) : Dp.m6302constructorimpl(0), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f9)), false, 0L, 0L, 28, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f9)));
                        if (z) {
                            composer3.startReplaceGroup(78458992);
                            composer3.endReplaceGroup();
                            jM3842copywmQWz5c$default4 = Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else if (zAreEqual2) {
                            composer3.startReplaceGroup(78461900);
                            composer3.endReplaceGroup();
                            jM3842copywmQWz5c$default4 = Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), z2 ? 0.12f : 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else if (z5) {
                            composer3.startReplaceGroup(78466576);
                            ComposerKt.sourceInformation(composer3, "408@18522L11");
                            jM3842copywmQWz5c$default4 = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(78470224);
                            ComposerKt.sourceInformation(composer3, "409@18638L11");
                            jM3842copywmQWz5c$default4 = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                            composer3.endReplaceGroup();
                        }
                        Modifier modifierM239backgroundbw27NRU$default3 = BackgroundKt.m239backgroundbw27NRU$default(modifierClip3, jM3842copywmQWz5c$default4, null, 2, null);
                        float fM6302constructorimpl = z ? Dp.m6302constructorimpl(2) : Dp.m6302constructorimpl(f6);
                        composer3.startReplaceGroup(78480688);
                        ComposerKt.sourceInformation(composer3, "417@19223L11");
                        if (z) {
                            jM3842copywmQWz5c$default5 = com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500();
                        } else if (zAreEqual2) {
                            jM3842copywmQWz5c$default5 = Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM3842copywmQWz5c$default5 = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM250borderxT4_qwU = BorderKt.m250borderxT4_qwU(modifierM239backgroundbw27NRU$default3, fM6302constructorimpl, jM3842copywmQWz5c$default5, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f9)));
                        boolean zTimetableDialog$lambda$2 = TimetableDialogKt.TimetableDialog$lambda$2(mutableState13);
                        composer3.startReplaceGroup(78497886);
                        ComposerKt.sourceInformation(composer3, "CC(remember):TimetableDialog.kt#9igjgp");
                        boolean zChanged2 = composer3.changed(str50) | composer3.changed(i6);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            mutableState2 = mutableState;
                            objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$2$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TimetableDialogKt.AnonymousClass2.invoke$lambda$26$lambda$25$lambda$22$lambda$21$lambda$20$lambda$17$lambda$16(str50, i6, mutableState2);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableState2 = mutableState;
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(modifierM250borderxT4_qwU, zTimetableDialog$lambda$2, null, null, (Function0) objRememberedValue3, 6, null);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        String str52 = str45;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str52);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
                        String str53 = str46;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str53);
                        int currentCompositeKeyHash17 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierM272clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor17 = ComposeUiNode.INSTANCE.getConstructor();
                        String str54 = str49;
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str54);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor17);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl17 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl17, measurePolicyMaybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl17, currentCompositionLocalMap17, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash17 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl17.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl17.rememberedValue(), Integer.valueOf(currentCompositeKeyHash17))) {
                            composerM3336constructorimpl17.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash17));
                            composerM3336constructorimpl17.apply(Integer.valueOf(currentCompositeKeyHash17), setCompositeKeyHash17);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl17, modifierMaterializeModifier17, ComposeUiNode.INSTANCE.getSetModifier());
                        String str55 = str44;
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, str55);
                        BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -887728713, "C:TimetableDialog.kt#7ivg5k");
                        if (z5) {
                            composer3.startReplaceGroup(-887781476);
                            ComposerKt.sourceInformation(composer3, "427@19865L242");
                            str7 = str54;
                            str9 = str53;
                            str44 = str55;
                            snapshotStateMap2 = snapshotStateMap4;
                            TextKt.m2376Text4IGK_g("-", (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getSlate400(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3462, 0, 131058);
                            composer3 = composer;
                            composer3.endReplaceGroup();
                            str8 = str47;
                            str6 = str48;
                        } else {
                            str44 = str55;
                            snapshotStateMap2 = snapshotStateMap4;
                            composer3.startReplaceGroup(-887393325);
                            ComposerKt.sourceInformation(composer3, "433@20201L2011");
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center6 = Arrangement.INSTANCE.getCenter();
                            Modifier modifierM686paddingVpY3zN4$default6 = PaddingKt.m686paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6302constructorimpl(2), 0.0f, 2, null);
                            String str56 = str48;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, str56);
                            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(center6, centerHorizontally2, composer3, 54);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str53);
                            int currentCompositeKeyHash18 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, modifierM686paddingVpY3zN4$default6);
                            Function0<ComposeUiNode> constructor18 = ComposeUiNode.INSTANCE.getConstructor();
                            str6 = str56;
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str54);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor18);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3336constructorimpl18 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(composerM3336constructorimpl18, measurePolicyColumnMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl18, currentCompositionLocalMap18, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash18 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl18.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl18.rememberedValue(), Integer.valueOf(currentCompositeKeyHash18))) {
                                composerM3336constructorimpl18.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash18));
                                composerM3336constructorimpl18.apply(Integer.valueOf(currentCompositeKeyHash18), setCompositeKeyHash18);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl18, modifierMaterializeModifier18, ComposeUiNode.INSTANCE.getSetModifier());
                            String str57 = str47;
                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, str57);
                            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -329031168, "C438@20590L1009:TimetableDialog.kt#7ivg5k");
                            long sp2 = strComponent1.length() > 3 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(11.5d);
                            FontWeight bold = FontWeight.INSTANCE.getBold();
                            composer3.startReplaceGroup(-287699349);
                            ComposerKt.sourceInformation(composer3, "445@21240L11");
                            if (z) {
                                onSurface = z2 ? Color.INSTANCE.m3880getWhite0d7_KjU() : com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500();
                            } else if (zAreEqual2) {
                                onSurface = ColorKt.Color(z2 ? 4290438909L : 4278413729L);
                            } else {
                                onSurface = MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface();
                            }
                            composer3.endReplaceGroup();
                            str7 = str54;
                            str8 = str57;
                            str9 = str53;
                            TextKt.m2376Text4IGK_g(strComponent1, (Modifier) null, onSurface, sp2, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6184boximpl(TextAlign.INSTANCE.m6191getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m6241getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 120274);
                            composer3 = composer;
                            composer3.startReplaceGroup(-287675775);
                            ComposerKt.sourceInformation(composer3, "452@21717L399");
                            if (TimetableDialogKt.TimetableDialog$lambda$2(mutableState13)) {
                                TextKt.m2376Text4IGK_g("主頁: " + strComponent2, (Modifier) null, zAreEqual2 ? com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500() : com.rhythmbyte.contactbook.ui.theme.ColorKt.getSlate400(), TextUnitKt.getSp(8.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
                                composer3 = composer;
                            }
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        i6 = i6;
                        str45 = str52;
                        str46 = str9;
                        snapshotStateMap = snapshotStateMap2;
                        mutableState = mutableState2;
                        str33 = str51;
                        str47 = str8;
                        str48 = str6;
                        str49 = str7;
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    i4 = i5;
                    str32 = str45;
                    str37 = str46;
                    i3 = -1323940314;
                    str39 = str47;
                    str36 = str48;
                    str31 = str44;
                    str38 = str49;
                    obj = null;
                }
                MutableState<Pair<String, Integer>> mutableState14 = mutableState;
                SnapshotStateMap<String, List<String>> snapshotStateMap5 = snapshotStateMap;
                composer3.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer3, 6);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.startReplaceGroup(-642205832);
                ComposerKt.sourceInformation(composer3, "479@23198L11,484@23441L10495,476@22999L10937");
                if (TimetableDialogKt.TimetableDialog$lambda$2(mutableState13) && z3 && TimetableDialogKt.TimetableDialog$lambda$5(mutableState14) != null) {
                    Pair pairTimetableDialog$lambda$7 = TimetableDialogKt.TimetableDialog$lambda$5(mutableState14);
                    Intrinsics.checkNotNull(pairTimetableDialog$lambda$7);
                    Iterator it2 = TimetableDialogKt.WEEKDAY_COLUMNS.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(((Pair) next).getFirst(), pairTimetableDialog$lambda$7.getFirst()));
                    Pair pair2 = (Pair) next;
                    if (pair2 == null || (str4 = (String) pair2.getSecond()) == null) {
                        str4 = "週" + pairTimetableDialog$lambda$7.getFirst();
                    }
                    String str58 = str4;
                    int iIntValue = ((Number) pairTimetableDialog$lambda$7.getSecond()).intValue() + 1;
                    List<String> list = snapshotStateMap5.get(pairTimetableDialog$lambda$7.getFirst());
                    if (list == null) {
                        str5 = "";
                    } else {
                        int iIntValue2 = ((Number) pairTimetableDialog$lambda$7.getSecond()).intValue();
                        str5 = (iIntValue2 < 0 || iIntValue2 >= list.size()) ? "" : list.get(iIntValue2);
                        if (str5 == null) {
                            str5 = "";
                        }
                    }
                    Pair<String, String> cell2 = TimetableData.INSTANCE.parseCell(str5);
                    float f10 = 20;
                    LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6302constructorimpl(8), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4$default(Dp.m6302constructorimpl(f10), Dp.m6302constructorimpl(f10), 0.0f, 0.0f, 12, null), Dp.m6302constructorimpl(f10), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f5), ComposableLambdaKt.rememberComposableLambda(1116883163, true, new TimetableDialogKt$TimetableDialog$2$1$1$3(cell2, str58, iIntValue, mutableState14, snapshotStateMap5, pairTimetableDialog$lambda$7, mutableState11, mutableState12), composer3, 54), composer3, 1769862, 16);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$25$lambda$8$lambda$7$lambda$4$lambda$3(Function1 function1, SnapshotStateMap snapshotStateMap, MutableState mutableState, MutableState mutableState2) {
            function1.invoke(snapshotStateMap.toMap());
            TimetableDialogKt.TimetableDialog$lambda$3(mutableState, false);
            TimetableDialogKt.TimetableDialog$lambda$6(mutableState2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$25$lambda$8$lambda$7$lambda$6$lambda$5(MutableState mutableState, MutableState mutableState2) {
            TimetableDialogKt.TimetableDialog$lambda$3(mutableState, !TimetableDialogKt.TimetableDialog$lambda$2(mutableState));
            if (!TimetableDialogKt.TimetableDialog$lambda$2(mutableState)) {
                TimetableDialogKt.TimetableDialog$lambda$6(mutableState2, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$25$lambda$22$lambda$21$lambda$20$lambda$17$lambda$16(String str, int i, MutableState mutableState) {
            TimetableDialogKt.TimetableDialog$lambda$6(mutableState, TuplesKt.to(str, Integer.valueOf(i)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimetableDialog$lambda$6(MutableState<Pair<String, Integer>> mutableState, Pair<String, Integer> pair) {
        mutableState.setValue(pair);
    }
}
