package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.backdrops.CanvasBackdropKt;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: EditItemDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"EditItemDialog", "", "initialItem", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "defaultDate", "", "defaultCategory", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "(Lcom/rhythmbyte/contactbook/data/model/ItemRecord;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "selectedCategory", "subject", LinkHeader.Parameters.Title, "details", "dueDate", "isHighPriority", "", "titleError"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EditItemDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditItemDialog$lambda$21(ItemRecord itemRecord, String str, String str2, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        EditItemDialog(itemRecord, str, str2, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX WARN: Code duplicated, block: B:101:0x0199  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0117  */
    /* JADX WARN: Code duplicated, block: B:80:0x0119  */
    /* JADX WARN: Code duplicated, block: B:82:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:93:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x016d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0173  */
    public static final void EditItemDialog(ItemRecord itemRecord, final String defaultDate, String str, final Function0<Unit> onDismiss, final Function1<? super ItemRecord, Unit> onSave, Composer composer, final int i, final int i2) {
        ItemRecord itemRecord2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        ItemRecord itemRecord3;
        String str3;
        Object objRememberedValue;
        Object objRememberedValue2;
        String str4;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Composer composer2;
        final ItemRecord itemRecord4;
        final String str5;
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
        Composer composerStartRestartGroup = composer.startRestartGroup(1118359824);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EditItemDialog)P(2,1)62@2686L69,63@2775L55,64@2848L53,65@2921L55,66@2996L55,67@3078L60,68@3161L34,70@3238L9765,70@3201L9802:EditItemDialog.kt#yz3s17");
        int i7 = i2 & 1;
        if (i7 != 0) {
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
        int i8 = i2 & 4;
        if (i8 == 0) {
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
            i6 = i3;
            if ((i6 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                itemRecord4 = itemRecord2;
                str5 = str2;
                composer2 = composerStartRestartGroup;
            } else {
                if (i7 != 0) {
                    itemRecord3 = null;
                } else {
                    itemRecord3 = itemRecord2;
                }
                if (i8 != 0) {
                    str3 = "homework";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1118359824, i6, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemDialog (EditItemDialog.kt:61)");
                }
                composerStartRestartGroup.startReplaceGroup(445281091);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (category = itemRecord3.getCategory()) == null) {
                        category = str3;
                    }
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(category, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(445283925);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                str4 = "";
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (subject = itemRecord3.getSubject()) == null) {
                        subject = "";
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subject, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(445286259);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (title = itemRecord3.getTitle()) == null) {
                        title = "";
                    }
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(title, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState3 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(445288597);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null || (details = itemRecord3.getDetails()) == null) {
                        details = "";
                    }
                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(details, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                    objRememberedValue4 = mutableStateMutableStateOf$default;
                }
                MutableState mutableState4 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(445290997);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null && (dueDate = itemRecord3.getDueDate()) != null) {
                        str4 = dueDate;
                    }
                    MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str4, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                    objRememberedValue5 = mutableStateMutableStateOf$default2;
                }
                MutableState mutableState5 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(445293626);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    if (itemRecord3 != null) {
                        priority = itemRecord3.getPriority();
                    } else {
                        priority = null;
                    }
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(priority, "high")), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                MutableState mutableState6 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(445296256);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                ItemRecord itemRecord5 = itemRecord3;
                AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-1098653529, true, new AnonymousClass1(itemRecord5, defaultDate, mutableState, mutableState5, mutableState2, mutableState3, (MutableState) objRememberedValue7, mutableState4, mutableState6, onDismiss, onSave), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = composerStartRestartGroup;
                itemRecord4 = itemRecord5;
                str5 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EditItemDialogKt.EditItemDialog$lambda$21(itemRecord4, defaultDate, str5, onDismiss, onSave, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i6 = i3;
        if ((i6 & 9363) != 9362) {
            if (i7 != 0) {
                itemRecord3 = null;
            } else {
                itemRecord3 = itemRecord2;
            }
            if (i8 != 0) {
                str3 = "homework";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1118359824, i6, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemDialog (EditItemDialog.kt:61)");
            }
            composerStartRestartGroup.startReplaceGroup(445281091);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    category = str3;
                } else {
                    category = str3;
                }
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(category, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445283925);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            str4 = "";
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    subject = "";
                } else {
                    subject = "";
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subject, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445286259);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    title = "";
                } else {
                    title = "";
                }
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(title, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445288597);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    details = "";
                } else {
                    details = "";
                }
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(details, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue4 = mutableStateMutableStateOf$default3;
            }
            MutableState mutableState10 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445290997);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    str4 = dueDate;
                }
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str4, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue5 = mutableStateMutableStateOf$default4;
            }
            MutableState mutableState11 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445293626);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    priority = itemRecord3.getPriority();
                } else {
                    priority = null;
                }
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(priority, "high")), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445296256);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            ItemRecord itemRecord6 = itemRecord3;
            AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-1098653529, true, new AnonymousClass1(itemRecord6, defaultDate, mutableState7, mutableState11, mutableState8, mutableState9, (MutableState) objRememberedValue7, mutableState10, mutableState12, onDismiss, onSave), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            itemRecord4 = itemRecord6;
            str5 = str3;
        } else {
            if (i7 != 0) {
                itemRecord3 = null;
            } else {
                itemRecord3 = itemRecord2;
            }
            if (i8 != 0) {
                str3 = "homework";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1118359824, i6, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemDialog (EditItemDialog.kt:61)");
            }
            composerStartRestartGroup.startReplaceGroup(445281091);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    category = str3;
                } else {
                    category = str3;
                }
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(category, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState13 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445283925);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            str4 = "";
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    subject = "";
                } else {
                    subject = "";
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subject, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState14 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445286259);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    title = "";
                } else {
                    title = "";
                }
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(title, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445288597);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    details = "";
                } else {
                    details = "";
                }
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(details, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue4 = mutableStateMutableStateOf$default5;
            }
            MutableState mutableState16 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445290997);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    str4 = dueDate;
                }
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str4, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue5 = mutableStateMutableStateOf$default6;
            }
            MutableState mutableState17 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445293626);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                if (itemRecord3 != null) {
                    priority = itemRecord3.getPriority();
                } else {
                    priority = null;
                }
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(priority, "high")), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState18 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(445296256);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EditItemDialog.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            ItemRecord itemRecord7 = itemRecord3;
            AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-1098653529, true, new AnonymousClass1(itemRecord7, defaultDate, mutableState13, mutableState17, mutableState14, mutableState15, (MutableState) objRememberedValue7, mutableState16, mutableState18, onDismiss, onSave), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            itemRecord4 = itemRecord7;
            str5 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EditItemDialogKt.EditItemDialog$lambda$21(itemRecord4, defaultDate, str5, onDismiss, onSave, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemDialog$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemDialog$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EditItemDialog$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EditItemDialog$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditItemDialog$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EditItemDialog$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditItemDialog$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1, reason: invalid class name */
    /* JADX INFO: compiled from: EditItemDialog.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $defaultDate;
        final /* synthetic */ MutableState<String> $details$delegate;
        final /* synthetic */ MutableState<String> $dueDate$delegate;
        final /* synthetic */ ItemRecord $initialItem;
        final /* synthetic */ MutableState<Boolean> $isHighPriority$delegate;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<ItemRecord, Unit> $onSave;
        final /* synthetic */ MutableState<String> $selectedCategory$delegate;
        final /* synthetic */ MutableState<String> $subject$delegate;
        final /* synthetic */ MutableState<String> $title$delegate;
        final /* synthetic */ MutableState<Boolean> $titleError$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ItemRecord itemRecord, String str, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, MutableState<Boolean> mutableState7, Function0<Unit> function0, Function1<? super ItemRecord, Unit> function1) {
            this.$initialItem = itemRecord;
            this.$defaultDate = str;
            this.$selectedCategory$delegate = mutableState;
            this.$dueDate$delegate = mutableState2;
            this.$subject$delegate = mutableState3;
            this.$title$delegate = mutableState4;
            this.$titleError$delegate = mutableState5;
            this.$details$delegate = mutableState6;
            this.$isHighPriority$delegate = mutableState7;
            this.$onDismiss = function0;
            this.$onSave = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C71@3292L260,71@3269L283,81@3561L9440:EditItemDialog.kt#yz3s17");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1098653529, i, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemDialog.<anonymous> (EditItemDialog.kt:71)");
                }
                composer.startReplaceGroup(-1466755903);
                ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EditItemDialogKt.AnonymousClass1.invoke$lambda$1$lambda$0((DrawScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Backdrop backdropRememberCanvasBackdrop = CanvasBackdropKt.rememberCanvasBackdrop((Function1) objRememberedValue, composer, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ItemRecord itemRecord = this.$initialItem;
                String str = this.$defaultDate;
                MutableState<String> mutableState = this.$selectedCategory$delegate;
                MutableState<String> mutableState2 = this.$dueDate$delegate;
                MutableState<String> mutableState3 = this.$subject$delegate;
                MutableState<String> mutableState4 = this.$title$delegate;
                MutableState<Boolean> mutableState5 = this.$titleError$delegate;
                MutableState<String> mutableState6 = this.$details$delegate;
                MutableState<Boolean> mutableState7 = this.$isHighPriority$delegate;
                Function0<Unit> function0 = this.$onDismiss;
                Function1<ItemRecord, Unit> function1 = this.$onSave;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                ComposerKt.sourceInformationMarkerStart(composer, -1427850108, "C83@3616L409,99@4187L11,102@4328L8667,96@4039L8956:EditItemDialog.kt#yz3s17");
                BoxKt.Box(BackgroundKt.background$default(boxScopeInstance.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 0);
                float f = 28;
                LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(16), ComposableLambdaKt.rememberComposableLambda(-606773876, true, new EditItemDialogKt$EditItemDialog$1$1$1(itemRecord, str, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, backdropRememberCanvasBackdrop, mutableState7, function0, function1), composer, 54), composer, 1769862, 16);
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
        public static final Unit invoke$lambda$1$lambda$0(DrawScope rememberCanvasBackdrop) {
            Intrinsics.checkNotNullParameter(rememberCanvasBackdrop, "$this$rememberCanvasBackdrop");
            DrawScope.m4392drawRectAsUm42w$default(rememberCanvasBackdrop, Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.getEmerald500(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
            return Unit.INSTANCE;
        }
    }
}
