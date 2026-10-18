package com.rhythmbyte.contactbook.ui.screens;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.backdrops.CanvasBackdropKt;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt;
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import io.ktor.http.LinkHeader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: EditItemScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"EditItemScreen", "", "initialItem", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "defaultDate", "", "defaultCategory", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "(Lcom/rhythmbyte/contactbook/data/model/ItemRecord;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "selectedCategory", "subject", LinkHeader.Parameters.Title, "details", "dueDate", "isHighPriority", "", "titleError"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EditItemScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditItemScreen$lambda$27(ItemRecord itemRecord, String str, String str2, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        EditItemScreen(itemRecord, str, str2, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0202  */
    /* JADX WARN: Code duplicated, block: B:119:0x0207  */
    /* JADX WARN: Code duplicated, block: B:123:0x0236  */
    /* JADX WARN: Code duplicated, block: B:124:0x0246  */
    /* JADX WARN: Code duplicated, block: B:127:0x025d  */
    /* JADX WARN: Code duplicated, block: B:128:0x025f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0267  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:158:0x0387  */
    /* JADX WARN: Code duplicated, block: B:162:0x0393  */
    /* JADX WARN: Code duplicated, block: B:168:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    public static final void EditItemScreen(ItemRecord itemRecord, final String defaultDate, String str, final Function0<Unit> onDismiss, final Function1<? super ItemRecord, Unit> onSave, Composer composer, final int i, final int i2) {
        ItemRecord itemRecord2;
        int i3;
        String str2;
        int i4;
        int i5;
        final ItemRecord itemRecord3;
        String str3;
        boolean z;
        Object objRememberedValue;
        Object objRememberedValue2;
        MutableState mutableState;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        MutableState mutableState2;
        Object objRememberedValue7;
        Object objRememberedValue8;
        MutableState mutableState3;
        boolean z2;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        Object objM7112constructorimpl;
        Pair pair;
        Object obj;
        Object objRememberedValue9;
        Composer composer2;
        final ItemRecord itemRecord4;
        final String str4;
        String priority;
        String dueDate;
        String details;
        String title;
        String subject;
        String category;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(defaultDate, "defaultDate");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Composer composerStartRestartGroup = composer.startRestartGroup(-900547128);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EditItemScreen)P(2,1)69@3134L27,69@3122L39,73@3191L69,74@3280L55,75@3353L53,76@3426L55,77@3501L55,78@3583L60,79@3666L34,81@3732L329,90@4109L304,90@4086L327,104@4468L11,105@4509L1738,148@6269L3035,216@9311L11658,103@4419L16550:EditItemScreen.kt#yz3s17");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            itemRecord2 = itemRecord;
        } else if ((i & 6) == 0) {
            itemRecord2 = itemRecord;
            i3 = (composerStartRestartGroup.changed(itemRecord2) ? 4 : 2) | i;
        } else {
            itemRecord2 = itemRecord;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(defaultDate) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(onDismiss)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(onSave)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                itemRecord4 = itemRecord2;
                str4 = str2;
                composer2 = composerStartRestartGroup;
            } else {
                if (i6 != 0) {
                    itemRecord3 = null;
                } else {
                    itemRecord3 = itemRecord2;
                }
                if (i7 != 0) {
                    str3 = "homework";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-900547128, i3, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen (EditItemScreen.kt:68)");
                }
                composerStartRestartGroup.startReplaceGroup(267531581);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                if ((i3 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditItemScreenKt.EditItemScreen$lambda$1$lambda$0(onDismiss);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(267533447);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (category = itemRecord3.getCategory()) == null) {
                        category = str3;
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(category, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267536281);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (subject = itemRecord3.getSubject()) == null) {
                        subject = "";
                    }
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subject, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final MutableState mutableState7 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267538615);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (title = itemRecord3.getTitle()) == null) {
                        title = "";
                    }
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(title, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final MutableState mutableState8 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267540953);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (details = itemRecord3.getDetails()) == null) {
                        details = "";
                    }
                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(details, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                    objRememberedValue5 = mutableStateMutableStateOf$default;
                }
                final MutableState mutableState9 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267543353);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (dueDate = itemRecord3.getDueDate()) == null) {
                        dueDate = "";
                    }
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(dueDate, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState2 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267545982);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null) {
                        priority = itemRecord3.getPriority();
                    } else {
                        priority = null;
                    }
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(priority, "high")), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final MutableState mutableState10 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267548612);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState3 = (MutableState) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(267551019);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        LocalDate localDate = LocalDate.parse(defaultDate);
                        mutableState4 = mutableState3;
                        mutableState5 = mutableState2;
                        try {
                            mutableState6 = mutableState;
                            try {
                                objM7112constructorimpl = Result.m7112constructorimpl(TuplesKt.to(localDate.plusDays(1L).format(DateTimeFormatter.ofPattern(r0)), localDate.plusDays(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
                            } catch (Throwable th) {
                                th = th;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM7112constructorimpl = Result.m7112constructorimpl(ResultKt.createFailure(th));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mutableState6 = mutableState;
                            Result.Companion companion3 = Result.INSTANCE;
                            objM7112constructorimpl = Result.m7112constructorimpl(ResultKt.createFailure(th));
                            pair = TuplesKt.to("", "");
                            if (Result.m7118isFailureimpl(objM7112constructorimpl)) {
                                objM7112constructorimpl = pair;
                            }
                            obj = (Pair) objM7112constructorimpl;
                            composerStartRestartGroup.updateRememberedValue(obj);
                            Pair pair2 = (Pair) obj;
                            composerStartRestartGroup.endReplaceGroup();
                            final String str5 = (String) pair2.component1();
                            final String str6 = (String) pair2.component2();
                            composerStartRestartGroup.startReplaceGroup(267563058);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return EditItemScreenKt.EditItemScreen$lambda$26$lambda$25((DrawScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final Backdrop backdropRememberCanvasBackdrop = CanvasBackdropKt.rememberCanvasBackdrop((Function1) objRememberedValue9, composerStartRestartGroup, 6);
                            long background = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-822275956, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    ComposerKt.sourceInformation(composer3, "C106@4523L1714:EditItemScreen.kt#yz3s17");
                                    if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-822275956, i8, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:106)");
                                        }
                                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6302constructorimpl(16), Dp.m6302constructorimpl(8));
                                        Function0<Unit> function0 = onDismiss;
                                        ItemRecord itemRecord5 = itemRecord3;
                                        String str7 = defaultDate;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 818508218, "C112@4742L1481:EditItemScreen.kt#yz3s17");
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                                        Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 61944853, "C121@5153L11,116@4910L596,130@5528L40,132@5590L615:EditItemScreen.kt#yz3s17");
                                        IconButtonKt.IconButton(function0, BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurfaceVariant(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, ComposableSingletons$EditItemScreenKt.INSTANCE.m6803getLambda1$app_release(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(12)), composer3, 6);
                                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                                        Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1321295243, "C135@5802L10,137@5933L11,133@5655L325,139@6005L178:EditItemScreen.kt#yz3s17");
                                        TextKt.m2376Text4IGK_g(itemRecord5 == null ? "✨ 新增聯絡簿項目" : "✏️ 編輯聯絡簿項目", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                        TextKt.m2376Text4IGK_g("發布日期：" + str7, (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
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
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54);
                            final MutableState mutableState11 = mutableState4;
                            final MutableState mutableState12 = mutableState5;
                            AnonymousClass4 anonymousClass4 = new AnonymousClass4(onDismiss, backdropRememberCanvasBackdrop, itemRecord3, defaultDate, onSave, mutableState8, mutableState11, mutableState6, mutableState7, mutableState9, mutableState12, mutableState10);
                            ItemRecord itemRecord5 = itemRecord3;
                            final MutableState mutableState13 = mutableState6;
                            composer2 = composerStartRestartGroup;
                            ScaffoldKt.m2091ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(-629344755, true, anonymousClass4, composerStartRestartGroup, 54), null, null, 0, background, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1038773801, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.5
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues innerPadding, Composer composer3, int i8) {
                                    int i9;
                                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                                    ComposerKt.sourceInformation(composer3, "C217@9337L11626:EditItemScreen.kt#yz3s17");
                                    if ((i8 & 6) == 0) {
                                        i9 = i8 | (composer3.changed(innerPadding) ? 4 : 2);
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i9 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1038773801, i9, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:217)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
                                        String str7 = defaultDate;
                                        MutableState<String> mutableState14 = mutableState13;
                                        MutableState<String> mutableState15 = mutableState12;
                                        String str8 = str5;
                                        MutableState<String> mutableState16 = mutableState7;
                                        MutableState<String> mutableState17 = mutableState8;
                                        MutableState<Boolean> mutableState18 = mutableState11;
                                        String str9 = str6;
                                        MutableState<String> mutableState19 = mutableState9;
                                        Backdrop backdrop = backdropRememberCanvasBackdrop;
                                        MutableState<Boolean> mutableState20 = mutableState10;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 823507495, "C223@9469L509,241@10107L21,238@9992L10961:EditItemScreen.kt#yz3s17");
                                        BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getSky500(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1400.0f, 0, 10, (Object) null), null, 0.0f, 6, null), composer3, 6);
                                        float f = 20;
                                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(8));
                                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                                        Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 67513166, "C248@10389L11,251@10541L2967,245@10229L3279,302@13526L41,307@13745L11,310@13897L5232,304@13585L5544,410@19147L41,415@19366L11,418@19518L1362,412@19206L1674,449@20898L41:EditItemScreen.kt#yz3s17");
                                        float f2 = 4;
                                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1362702052, true, new EditItemScreenKt$EditItemScreen$5$1$1$1(str7, mutableState14, mutableState15), composer3, 54), composer3, 1769862, 16);
                                        float f3 = 16;
                                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1294559611, true, new EditItemScreenKt$EditItemScreen$5$1$1$2(str8, mutableState16, mutableState17, mutableState18, mutableState15, str9, mutableState19), composer3, 54), composer3, 1769862, 16);
                                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1160972700, true, new EditItemScreenKt$EditItemScreen$5$1$1$3(backdrop, mutableState20), composer3, 54), composer3, 1769862, 16);
                                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(30)), composer3, 6);
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
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composer2, 805306800, 441);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            itemRecord4 = itemRecord5;
                            str4 = str3;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return EditItemScreenKt.EditItemScreen$lambda$27(itemRecord4, defaultDate, str4, onDismiss, onSave, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        mutableState4 = mutableState3;
                        mutableState5 = mutableState2;
                    }
                    pair = TuplesKt.to("", "");
                    if (Result.m7118isFailureimpl(objM7112constructorimpl)) {
                        objM7112constructorimpl = pair;
                    }
                    obj = (Pair) objM7112constructorimpl;
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    mutableState4 = mutableState3;
                    mutableState5 = mutableState2;
                    obj = objRememberedValue10;
                    mutableState6 = mutableState;
                }
                Pair pair3 = (Pair) obj;
                composerStartRestartGroup.endReplaceGroup();
                final String str7 = (String) pair3.component1();
                final String str8 = (String) pair3.component2();
                composerStartRestartGroup.startReplaceGroup(267563058);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return EditItemScreenKt.EditItemScreen$lambda$26$lambda$25((DrawScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                final Backdrop backdropRememberCanvasBackdrop2 = CanvasBackdropKt.rememberCanvasBackdrop((Function1) objRememberedValue9, composerStartRestartGroup, 6);
                long background2 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground();
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-822275956, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        ComposerKt.sourceInformation(composer3, "C106@4523L1714:EditItemScreen.kt#yz3s17");
                        if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-822275956, i8, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:106)");
                            }
                            Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6302constructorimpl(16), Dp.m6302constructorimpl(8));
                            Function0<Unit> function0 = onDismiss;
                            ItemRecord itemRecord6 = itemRecord3;
                            String str9 = defaultDate;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 818508218, "C112@4742L1481:EditItemScreen.kt#yz3s17");
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 61944853, "C121@5153L11,116@4910L596,130@5528L40,132@5590L615:EditItemScreen.kt#yz3s17");
                            IconButtonKt.IconButton(function0, BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurfaceVariant(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, ComposableSingletons$EditItemScreenKt.INSTANCE.m6803getLambda1$app_release(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(12)), composer3, 6);
                            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1321295243, "C135@5802L10,137@5933L11,133@5655L325,139@6005L178:EditItemScreen.kt#yz3s17");
                            TextKt.m2376Text4IGK_g(itemRecord6 == null ? "✨ 新增聯絡簿項目" : "✏️ 編輯聯絡簿項目", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                            TextKt.m2376Text4IGK_g("發布日期：" + str9, (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
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
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54);
                final MutableState<Boolean> mutableState14 = mutableState4;
                final MutableState<String> mutableState15 = mutableState5;
                AnonymousClass4 anonymousClass5 = new AnonymousClass4(onDismiss, backdropRememberCanvasBackdrop2, itemRecord3, defaultDate, onSave, mutableState8, mutableState14, mutableState6, mutableState7, mutableState9, mutableState15, mutableState10);
                ItemRecord itemRecord6 = itemRecord3;
                final MutableState<String> mutableState16 = mutableState6;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m2091ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda2, ComposableLambdaKt.rememberComposableLambda(-629344755, true, anonymousClass5, composerStartRestartGroup, 54), null, null, 0, background2, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1038773801, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues innerPadding, Composer composer3, int i8) {
                        int i9;
                        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                        ComposerKt.sourceInformation(composer3, "C217@9337L11626:EditItemScreen.kt#yz3s17");
                        if ((i8 & 6) == 0) {
                            i9 = i8 | (composer3.changed(innerPadding) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i9 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1038773801, i9, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:217)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
                            String str9 = defaultDate;
                            MutableState<String> mutableState17 = mutableState16;
                            MutableState<String> mutableState18 = mutableState15;
                            String str10 = str7;
                            MutableState<String> mutableState19 = mutableState7;
                            MutableState<String> mutableState110 = mutableState8;
                            MutableState<Boolean> mutableState111 = mutableState14;
                            String str11 = str8;
                            MutableState<String> mutableState112 = mutableState9;
                            Backdrop backdrop = backdropRememberCanvasBackdrop2;
                            MutableState<Boolean> mutableState20 = mutableState10;
                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 823507495, "C223@9469L509,241@10107L21,238@9992L10961:EditItemScreen.kt#yz3s17");
                            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getSky500(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1400.0f, 0, 10, (Object) null), null, 0.0f, 6, null), composer3, 6);
                            float f = 20;
                            Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 67513166, "C248@10389L11,251@10541L2967,245@10229L3279,302@13526L41,307@13745L11,310@13897L5232,304@13585L5544,410@19147L41,415@19366L11,418@19518L1362,412@19206L1674,449@20898L41:EditItemScreen.kt#yz3s17");
                            float f2 = 4;
                            LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1362702052, true, new EditItemScreenKt$EditItemScreen$5$1$1$1(str9, mutableState17, mutableState18), composer3, 54), composer3, 1769862, 16);
                            float f3 = 16;
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                            LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1294559611, true, new EditItemScreenKt$EditItemScreen$5$1$1$2(str10, mutableState19, mutableState110, mutableState111, mutableState18, str11, mutableState112), composer3, 54), composer3, 1769862, 16);
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                            LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1160972700, true, new EditItemScreenKt$EditItemScreen$5$1$1$3(backdrop, mutableState20), composer3, 54), composer3, 1769862, 16);
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(30)), composer3, 6);
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
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, 805306800, 441);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                itemRecord4 = itemRecord6;
                str4 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return EditItemScreenKt.EditItemScreen$lambda$27(itemRecord4, defaultDate, str4, onDismiss, onSave, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(onDismiss)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(onSave)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            if (i6 != 0) {
                itemRecord3 = null;
            } else {
                itemRecord3 = itemRecord2;
            }
            if (i7 != 0) {
                str3 = "homework";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-900547128, i3, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen (EditItemScreen.kt:68)");
            }
            composerStartRestartGroup.startReplaceGroup(267531581);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            if ((i3 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditItemScreenKt.EditItemScreen$lambda$1$lambda$0(onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditItemScreenKt.EditItemScreen$lambda$1$lambda$0(onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(267533447);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    category = str3;
                } else {
                    category = str3;
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(category, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267536281);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    subject = "";
                } else {
                    subject = "";
                }
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subject, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState<String> mutableState17 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267538615);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    title = "";
                } else {
                    title = "";
                }
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(title, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState<String> mutableState18 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267540953);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    details = "";
                } else {
                    details = "";
                }
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(details, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue5 = mutableStateMutableStateOf$default2;
            }
            final MutableState<String> mutableState19 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267543353);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    dueDate = "";
                } else {
                    dueDate = "";
                }
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(dueDate, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState2 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267545982);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    priority = itemRecord3.getPriority();
                } else {
                    priority = null;
                }
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(priority, "high")), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState<Boolean> mutableState110 = (MutableState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267548612);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState3 = (MutableState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267551019);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                Result.Companion companion4 = Result.INSTANCE;
                LocalDate localDate2 = LocalDate.parse(defaultDate);
                mutableState4 = mutableState3;
                mutableState5 = mutableState2;
                mutableState6 = mutableState;
                objM7112constructorimpl = Result.m7112constructorimpl(TuplesKt.to(localDate2.plusDays(1L).format(DateTimeFormatter.ofPattern(r0)), localDate2.plusDays(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
                pair = TuplesKt.to("", "");
                if (Result.m7118isFailureimpl(objM7112constructorimpl)) {
                    objM7112constructorimpl = pair;
                }
                obj = (Pair) objM7112constructorimpl;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                Result.Companion companion5 = Result.INSTANCE;
                LocalDate localDate3 = LocalDate.parse(defaultDate);
                mutableState4 = mutableState3;
                mutableState5 = mutableState2;
                mutableState6 = mutableState;
                objM7112constructorimpl = Result.m7112constructorimpl(TuplesKt.to(localDate3.plusDays(1L).format(DateTimeFormatter.ofPattern(r0)), localDate3.plusDays(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
                pair = TuplesKt.to("", "");
                if (Result.m7118isFailureimpl(objM7112constructorimpl)) {
                    objM7112constructorimpl = pair;
                }
                obj = (Pair) objM7112constructorimpl;
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            Pair pair4 = (Pair) obj;
            composerStartRestartGroup.endReplaceGroup();
            final String str9 = (String) pair4.component1();
            final String str10 = (String) pair4.component2();
            composerStartRestartGroup.startReplaceGroup(267563058);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemScreenKt.EditItemScreen$lambda$26$lambda$25((DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            final Backdrop backdropRememberCanvasBackdrop3 = CanvasBackdropKt.rememberCanvasBackdrop((Function1) objRememberedValue9, composerStartRestartGroup, 6);
            long background3 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground();
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-822275956, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    ComposerKt.sourceInformation(composer3, "C106@4523L1714:EditItemScreen.kt#yz3s17");
                    if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-822275956, i8, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:106)");
                        }
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6302constructorimpl(16), Dp.m6302constructorimpl(8));
                        Function0<Unit> function0 = onDismiss;
                        ItemRecord itemRecord7 = itemRecord3;
                        String str11 = defaultDate;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 818508218, "C112@4742L1481:EditItemScreen.kt#yz3s17");
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 61944853, "C121@5153L11,116@4910L596,130@5528L40,132@5590L615:EditItemScreen.kt#yz3s17");
                        IconButtonKt.IconButton(function0, BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurfaceVariant(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, ComposableSingletons$EditItemScreenKt.INSTANCE.m6803getLambda1$app_release(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(12)), composer3, 6);
                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1321295243, "C135@5802L10,137@5933L11,133@5655L325,139@6005L178:EditItemScreen.kt#yz3s17");
                        TextKt.m2376Text4IGK_g(itemRecord7 == null ? "✨ 新增聯絡簿項目" : "✏️ 編輯聯絡簿項目", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        TextKt.m2376Text4IGK_g("發布日期：" + str11, (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
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
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            final MutableState<Boolean> mutableState111 = mutableState4;
            final MutableState<String> mutableState112 = mutableState5;
            AnonymousClass4 anonymousClass6 = new AnonymousClass4(onDismiss, backdropRememberCanvasBackdrop3, itemRecord3, defaultDate, onSave, mutableState18, mutableState111, mutableState6, mutableState17, mutableState19, mutableState112, mutableState110);
            ItemRecord itemRecord7 = itemRecord3;
            final MutableState<String> mutableState113 = mutableState6;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m2091ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda3, ComposableLambdaKt.rememberComposableLambda(-629344755, true, anonymousClass6, composerStartRestartGroup, 54), null, null, 0, background3, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1038773801, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues innerPadding, Composer composer3, int i8) {
                    int i9;
                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                    ComposerKt.sourceInformation(composer3, "C217@9337L11626:EditItemScreen.kt#yz3s17");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer3.changed(innerPadding) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038773801, i9, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:217)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
                        String str11 = defaultDate;
                        MutableState<String> mutableState114 = mutableState113;
                        MutableState<String> mutableState115 = mutableState112;
                        String str12 = str9;
                        MutableState<String> mutableState116 = mutableState17;
                        MutableState<String> mutableState117 = mutableState18;
                        MutableState<Boolean> mutableState118 = mutableState111;
                        String str13 = str10;
                        MutableState<String> mutableState119 = mutableState19;
                        Backdrop backdrop = backdropRememberCanvasBackdrop3;
                        MutableState<Boolean> mutableState20 = mutableState110;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 823507495, "C223@9469L509,241@10107L21,238@9992L10961:EditItemScreen.kt#yz3s17");
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getSky500(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1400.0f, 0, 10, (Object) null), null, 0.0f, 6, null), composer3, 6);
                        float f = 20;
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 67513166, "C248@10389L11,251@10541L2967,245@10229L3279,302@13526L41,307@13745L11,310@13897L5232,304@13585L5544,410@19147L41,415@19366L11,418@19518L1362,412@19206L1674,449@20898L41:EditItemScreen.kt#yz3s17");
                        float f2 = 4;
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1362702052, true, new EditItemScreenKt$EditItemScreen$5$1$1$1(str11, mutableState114, mutableState115), composer3, 54), composer3, 1769862, 16);
                        float f3 = 16;
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1294559611, true, new EditItemScreenKt$EditItemScreen$5$1$1$2(str12, mutableState116, mutableState117, mutableState118, mutableState115, str13, mutableState119), composer3, 54), composer3, 1769862, 16);
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1160972700, true, new EditItemScreenKt$EditItemScreen$5$1$1$3(backdrop, mutableState20), composer3, 54), composer3, 1769862, 16);
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(30)), composer3, 6);
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, 805306800, 441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            itemRecord4 = itemRecord7;
            str4 = str3;
        } else {
            if (i6 != 0) {
                itemRecord3 = null;
            } else {
                itemRecord3 = itemRecord2;
            }
            if (i7 != 0) {
                str3 = "homework";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-900547128, i3, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen (EditItemScreen.kt:68)");
            }
            composerStartRestartGroup.startReplaceGroup(267531581);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            if ((i3 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditItemScreenKt.EditItemScreen$lambda$1$lambda$0(onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditItemScreenKt.EditItemScreen$lambda$1$lambda$0(onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(267533447);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    category = str3;
                } else {
                    category = str3;
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(category, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267536281);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    subject = "";
                } else {
                    subject = "";
                }
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subject, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState<String> mutableState114 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267538615);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    title = "";
                } else {
                    title = "";
                }
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(title, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState<String> mutableState115 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267540953);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    details = "";
                } else {
                    details = "";
                }
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(details, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue5 = mutableStateMutableStateOf$default3;
            }
            final MutableState<String> mutableState116 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267543353);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    dueDate = "";
                } else {
                    dueDate = "";
                }
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(dueDate, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState2 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267545982);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    priority = itemRecord3.getPriority();
                } else {
                    priority = null;
                }
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(priority, "high")), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState<Boolean> mutableState117 = (MutableState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267548612);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState3 = (MutableState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(267551019);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                Result.Companion companion6 = Result.INSTANCE;
                LocalDate localDate4 = LocalDate.parse(defaultDate);
                mutableState4 = mutableState3;
                mutableState5 = mutableState2;
                mutableState6 = mutableState;
                objM7112constructorimpl = Result.m7112constructorimpl(TuplesKt.to(localDate4.plusDays(1L).format(DateTimeFormatter.ofPattern(r0)), localDate4.plusDays(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
                pair = TuplesKt.to("", "");
                if (Result.m7118isFailureimpl(objM7112constructorimpl)) {
                    objM7112constructorimpl = pair;
                }
                obj = (Pair) objM7112constructorimpl;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                Result.Companion companion7 = Result.INSTANCE;
                LocalDate localDate5 = LocalDate.parse(defaultDate);
                mutableState4 = mutableState3;
                mutableState5 = mutableState2;
                mutableState6 = mutableState;
                objM7112constructorimpl = Result.m7112constructorimpl(TuplesKt.to(localDate5.plusDays(1L).format(DateTimeFormatter.ofPattern(r0)), localDate5.plusDays(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
                pair = TuplesKt.to("", "");
                if (Result.m7118isFailureimpl(objM7112constructorimpl)) {
                    objM7112constructorimpl = pair;
                }
                obj = (Pair) objM7112constructorimpl;
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            Pair pair5 = (Pair) obj;
            composerStartRestartGroup.endReplaceGroup();
            final String str11 = (String) pair5.component1();
            final String str12 = (String) pair5.component2();
            composerStartRestartGroup.startReplaceGroup(267563058);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemScreen.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemScreenKt.EditItemScreen$lambda$26$lambda$25((DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            final Backdrop backdropRememberCanvasBackdrop4 = CanvasBackdropKt.rememberCanvasBackdrop((Function1) objRememberedValue9, composerStartRestartGroup, 6);
            long background4 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground();
            ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-822275956, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    ComposerKt.sourceInformation(composer3, "C106@4523L1714:EditItemScreen.kt#yz3s17");
                    if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-822275956, i8, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:106)");
                        }
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6302constructorimpl(16), Dp.m6302constructorimpl(8));
                        Function0<Unit> function0 = onDismiss;
                        ItemRecord itemRecord8 = itemRecord3;
                        String str13 = defaultDate;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 818508218, "C112@4742L1481:EditItemScreen.kt#yz3s17");
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 61944853, "C121@5153L11,116@4910L596,130@5528L40,132@5590L615:EditItemScreen.kt#yz3s17");
                        IconButtonKt.IconButton(function0, BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurfaceVariant(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, ComposableSingletons$EditItemScreenKt.INSTANCE.m6803getLambda1$app_release(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(12)), composer3, 6);
                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1321295243, "C135@5802L10,137@5933L11,133@5655L325,139@6005L178:EditItemScreen.kt#yz3s17");
                        TextKt.m2376Text4IGK_g(itemRecord8 == null ? "✨ 新增聯絡簿項目" : "✏️ 編輯聯絡簿項目", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        TextKt.m2376Text4IGK_g("發布日期：" + str13, (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
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
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            final MutableState<Boolean> mutableState118 = mutableState4;
            final MutableState<String> mutableState119 = mutableState5;
            AnonymousClass4 anonymousClass7 = new AnonymousClass4(onDismiss, backdropRememberCanvasBackdrop4, itemRecord3, defaultDate, onSave, mutableState115, mutableState118, mutableState6, mutableState114, mutableState116, mutableState119, mutableState117);
            ItemRecord itemRecord8 = itemRecord3;
            final MutableState<String> mutableState1110 = mutableState6;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m2091ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda4, ComposableLambdaKt.rememberComposableLambda(-629344755, true, anonymousClass7, composerStartRestartGroup, 54), null, null, 0, background4, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1038773801, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt.EditItemScreen.5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues innerPadding, Composer composer3, int i8) {
                    int i9;
                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                    ComposerKt.sourceInformation(composer3, "C217@9337L11626:EditItemScreen.kt#yz3s17");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer3.changed(innerPadding) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1038773801, i9, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:217)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
                        String str13 = defaultDate;
                        MutableState<String> mutableState1111 = mutableState1110;
                        MutableState<String> mutableState1112 = mutableState119;
                        String str14 = str11;
                        MutableState<String> mutableState1113 = mutableState114;
                        MutableState<String> mutableState1114 = mutableState115;
                        MutableState<Boolean> mutableState1115 = mutableState118;
                        String str15 = str12;
                        MutableState<String> mutableState1116 = mutableState116;
                        Backdrop backdrop = backdropRememberCanvasBackdrop4;
                        MutableState<Boolean> mutableState20 = mutableState117;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 823507495, "C223@9469L509,241@10107L21,238@9992L10961:EditItemScreen.kt#yz3s17");
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getSky500(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1400.0f, 0, 10, (Object) null), null, 0.0f, 6, null), composer3, 6);
                        float f = 20;
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM685paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 67513166, "C248@10389L11,251@10541L2967,245@10229L3279,302@13526L41,307@13745L11,310@13897L5232,304@13585L5544,410@19147L41,415@19366L11,418@19518L1362,412@19206L1674,449@20898L41:EditItemScreen.kt#yz3s17");
                        float f2 = 4;
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1362702052, true, new EditItemScreenKt$EditItemScreen$5$1$1$1(str13, mutableState1111, mutableState1112), composer3, 54), composer3, 1769862, 16);
                        float f3 = 16;
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1294559611, true, new EditItemScreenKt$EditItemScreen$5$1$1$2(str14, mutableState1113, mutableState1114, mutableState1115, mutableState1112, str15, mutableState1116), composer3, 54), composer3, 1769862, 16);
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), composer3, 6);
                        LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(f2), ComposableLambdaKt.rememberComposableLambda(-1160972700, true, new EditItemScreenKt$EditItemScreen$5$1$1$3(backdrop, mutableState20), composer3, 54), composer3, 1769862, 16);
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(30)), composer3, 6);
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, 805306800, 441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            itemRecord4 = itemRecord8;
            str4 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EditItemScreenKt.EditItemScreen$lambda$27(itemRecord4, defaultDate, str4, onDismiss, onSave, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditItemScreen$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemScreen$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemScreen$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemScreen$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemScreen$lambda$15(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EditItemScreen$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditItemScreen$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EditItemScreen$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditItemScreen$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditItemScreen$lambda$26$lambda$25(DrawScope rememberCanvasBackdrop) {
        Intrinsics.checkNotNullParameter(rememberCanvasBackdrop, "$this$rememberCanvasBackdrop");
        DrawScope.m4392drawRectAsUm42w$default(rememberCanvasBackdrop, Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getSky500(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1200.0f, 0, 10, (Object) null), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$4, reason: invalid class name */
    /* JADX INFO: compiled from: EditItemScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $defaultDate;
        final /* synthetic */ MutableState<String> $details$delegate;
        final /* synthetic */ MutableState<String> $dueDate$delegate;
        final /* synthetic */ ItemRecord $initialItem;
        final /* synthetic */ MutableState<Boolean> $isHighPriority$delegate;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<ItemRecord, Unit> $onSave;
        final /* synthetic */ Backdrop $pageBackdrop;
        final /* synthetic */ MutableState<String> $selectedCategory$delegate;
        final /* synthetic */ MutableState<String> $subject$delegate;
        final /* synthetic */ MutableState<String> $title$delegate;
        final /* synthetic */ MutableState<Boolean> $titleError$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function0<Unit> function0, Backdrop backdrop, ItemRecord itemRecord, String str, Function1<? super ItemRecord, Unit> function1, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<Boolean> mutableState7) {
            this.$onDismiss = function0;
            this.$pageBackdrop = backdrop;
            this.$initialItem = itemRecord;
            this.$defaultDate = str;
            this.$onSave = function1;
            this.$title$delegate = mutableState;
            this.$titleError$delegate = mutableState2;
            this.$selectedCategory$delegate = mutableState3;
            this.$subject$delegate = mutableState4;
            this.$details$delegate = mutableState5;
            this.$dueDate$delegate = mutableState6;
            this.$isHighPriority$delegate = mutableState7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C150@6284L3010:EditItemScreen.kt#yz3s17");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-629344755, i, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous> (EditItemScreen.kt:150)");
                }
                float f = 14;
                Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6302constructorimpl(20), Dp.m6302constructorimpl(f));
                Function0<Unit> function0 = this.$onDismiss;
                Backdrop backdrop = this.$pageBackdrop;
                final ItemRecord itemRecord = this.$initialItem;
                final String str = this.$defaultDate;
                final Function1<ItemRecord, Unit> function1 = this.$onSave;
                final MutableState<String> mutableState = this.$title$delegate;
                final MutableState<Boolean> mutableState2 = this.$titleError$delegate;
                final MutableState<String> mutableState3 = this.$selectedCategory$delegate;
                final MutableState<String> mutableState4 = this.$subject$delegate;
                final MutableState<String> mutableState5 = this.$details$delegate;
                final MutableState<String> mutableState6 = this.$dueDate$delegate;
                final MutableState<Boolean> mutableState7 = this.$isHighPriority$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM685paddingVpY3zN4);
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
                ComposerKt.sourceInformationMarkerStart(composer, 820297228, "C156@6505L2775:EditItemScreen.kt#yz3s17");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, centerVertically, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 63804016, "C164@6907L11,161@6746L752,179@7568L1045,205@8950L312,178@7520L1742:EditItemScreen.kt#yz3s17");
                long jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                float f2 = 52;
                Modifier modifierM715height3ABfNKs = SizeKt.m715height3ABfNKs(modifierWeight$default, Dp.m6302constructorimpl(f2));
                float f3 = 16;
                float f4 = 12;
                LiquidButtonKt.m6762LiquidButtonePBljHA(function0, backdrop, modifierM715height3ABfNKs, null, false, 0L, jM3842copywmQWz5c$default, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(f3), Dp.m6302constructorimpl(f4)), 0.0f, 0.0f, null, ComposableSingletons$EditItemScreenKt.INSTANCE.m6806getLambda2$app_release(), composer, 12582912, 48, 1848);
                long emerald500 = ColorKt.getEmerald500();
                Modifier modifierM715height3ABfNKs2 = SizeKt.m715height3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m6302constructorimpl(f2));
                PaddingValues paddingValuesM678PaddingValuesYgX7TsA = PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(f3), Dp.m6302constructorimpl(f4));
                composer.startReplaceGroup(1110461684);
                ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
                boolean zChanged = composer.changed(itemRecord) | composer.changed(str) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditItemScreenKt.AnonymousClass4.invoke$lambda$5$lambda$4$lambda$3$lambda$2(itemRecord, str, function1, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                composer.endReplaceGroup();
                LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue, backdrop, modifierM715height3ABfNKs2, null, false, emerald500, 0L, paddingValuesM678PaddingValuesYgX7TsA, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1100533383, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$4$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope LiquidButton, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(LiquidButton, "$this$LiquidButton");
                        ComposerKt.sourceInformation(composer2, "C206@8976L264:EditItemScreen.kt#yz3s17");
                        if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1100533383, i2, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditItemScreen.kt:206)");
                            }
                            TextKt.m2376Text4IGK_g(itemRecord == null ? "儲存並發布" : "更新項目", (Modifier) null, Color.INSTANCE.m3880getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 12779520, 48, 1880);
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
        /* JADX WARN: Code duplicated, block: B:15:0x0029  */
        /* JADX WARN: Code duplicated, block: B:28:0x0056  */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(ItemRecord itemRecord, String str, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
            String str2;
            String str3;
            String date;
            String id;
            if (StringsKt.isBlank(EditItemScreenKt.EditItemScreen$lambda$9(mutableState))) {
                EditItemScreenKt.EditItemScreen$lambda$22(mutableState2, true);
                return Unit.INSTANCE;
            }
            if (itemRecord == null || (id = itemRecord.getId()) == null) {
                str2 = "rec-" + System.currentTimeMillis();
            } else {
                String str4 = id;
                if (str4.length() == 0) {
                    str4 = null;
                }
                str2 = str4;
                if (str2 == null) {
                    str2 = "rec-" + System.currentTimeMillis();
                }
            }
            String str5 = str2;
            if (itemRecord == null || (date = itemRecord.getDate()) == null) {
                str3 = str;
            } else {
                String str6 = date;
                String str7 = str6.length() != 0 ? str6 : null;
                if (str7 == null) {
                    str3 = str;
                } else {
                    str3 = str7;
                }
            }
            function1.invoke(new ItemRecord(str5, str3, EditItemScreenKt.EditItemScreen$lambda$3(mutableState3), StringsKt.trim((CharSequence) EditItemScreenKt.EditItemScreen$lambda$6(mutableState4)).toString(), StringsKt.trim((CharSequence) EditItemScreenKt.EditItemScreen$lambda$9(mutableState)).toString(), StringsKt.trim((CharSequence) EditItemScreenKt.EditItemScreen$lambda$12(mutableState5)).toString(), StringsKt.trim((CharSequence) EditItemScreenKt.EditItemScreen$lambda$15(mutableState6)).toString(), EditItemScreenKt.EditItemScreen$lambda$18(mutableState7) ? "high" : "normal"));
            return Unit.INSTANCE;
        }
    }
}
