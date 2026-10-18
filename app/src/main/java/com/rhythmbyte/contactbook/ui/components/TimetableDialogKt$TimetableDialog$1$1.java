package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TimetableDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.TimetableDialogKt$TimetableDialog$1$1", f = "TimetableDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class TimetableDialogKt$TimetableDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $customFullName$delegate;
    final /* synthetic */ MutableState<String> $customShortChar$delegate;
    final /* synthetic */ SnapshotStateMap<String, List<String>> $editableSchedule;
    final /* synthetic */ MutableState<Pair<String, Integer>> $selectedCell$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimetableDialogKt$TimetableDialog$1$1(SnapshotStateMap<String, List<String>> snapshotStateMap, MutableState<Pair<String, Integer>> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Continuation<? super TimetableDialogKt$TimetableDialog$1$1> continuation) {
        super(2, continuation);
        this.$editableSchedule = snapshotStateMap;
        this.$selectedCell$delegate = mutableState;
        this.$customFullName$delegate = mutableState2;
        this.$customShortChar$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimetableDialogKt$TimetableDialog$1$1(this.$editableSchedule, this.$selectedCell$delegate, this.$customFullName$delegate, this.$customShortChar$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TimetableDialogKt$TimetableDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (TimetableDialogKt.TimetableDialog$lambda$5(this.$selectedCell$delegate) != null) {
                Pair pairTimetableDialog$lambda$5 = TimetableDialogKt.TimetableDialog$lambda$5(this.$selectedCell$delegate);
                Intrinsics.checkNotNull(pairTimetableDialog$lambda$5);
                List<String> list = this.$editableSchedule.get(pairTimetableDialog$lambda$5.getFirst());
                String str = "";
                if (list != null) {
                    int iIntValue = ((Number) pairTimetableDialog$lambda$5.getSecond()).intValue();
                    String str2 = (iIntValue < 0 || iIntValue >= list.size()) ? "" : list.get(iIntValue);
                    if (str2 != null) {
                        str = str2;
                    }
                }
                Pair<String, String> cell = TimetableData.INSTANCE.parseCell(str);
                String strComponent1 = cell.component1();
                String strComponent2 = cell.component2();
                this.$customFullName$delegate.setValue(strComponent1);
                this.$customShortChar$delegate.setValue(strComponent2);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
