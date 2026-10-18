package com.rhythmbyte.contactbook.ui.components;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.rhythmbyte.contactbook.data.update.DownloadState;
import com.rhythmbyte.contactbook.data.update.UpdateInfo;
import com.rhythmbyte.contactbook.data.update.UpdateManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: UpdateDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.rhythmbyte.contactbook.ui.components.UpdateDialogKt$UpdateDialog$startDownload$1$1$1", f = "UpdateDialog.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
final class UpdateDialogKt$UpdateDialog$startDownload$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<DownloadState> $downloadState$delegate;
    final /* synthetic */ MutableState<File> $downloadedFile$delegate;
    final /* synthetic */ UpdateInfo $updateInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateDialogKt$UpdateDialog$startDownload$1$1$1(UpdateInfo updateInfo, Context context, MutableState<DownloadState> mutableState, MutableState<File> mutableState2, Continuation<? super UpdateDialogKt$UpdateDialog$startDownload$1$1$1> continuation) {
        super(2, continuation);
        this.$updateInfo = updateInfo;
        this.$context = context;
        this.$downloadState$delegate = mutableState;
        this.$downloadedFile$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateDialogKt$UpdateDialog$startDownload$1$1$1(this.$updateInfo, this.$context, this.$downloadState$delegate, this.$downloadedFile$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdateDialogKt$UpdateDialog$startDownload$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$downloadState$delegate.setValue(new DownloadState.Downloading(0.0f, 0L, this.$updateInfo.getApkSize()));
            UpdateManager updateManager = UpdateManager.INSTANCE;
            Context context = this.$context;
            String apkDownloadUrl = this.$updateInfo.getApkDownloadUrl();
            final MutableState<DownloadState> mutableState = this.$downloadState$delegate;
            final MutableState<File> mutableState2 = this.$downloadedFile$delegate;
            this.label = 1;
            obj = updateManager.downloadApk(context, apkDownloadUrl, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.UpdateDialogKt$UpdateDialog$startDownload$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UpdateDialogKt$UpdateDialog$startDownload$1$1$1.invokeSuspend$lambda$0(mutableState, mutableState2, (DownloadState) obj2);
                }
            }, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        File file = (File) obj;
        if (file != null) {
            this.$downloadedFile$delegate.setValue(file);
            UpdateManager.INSTANCE.installApk(this.$context, file);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, MutableState mutableState2, DownloadState downloadState) {
        mutableState.setValue(downloadState);
        if (downloadState instanceof DownloadState.Finished) {
            mutableState2.setValue(((DownloadState.Finished) downloadState).getApkFile());
        }
        return Unit.INSTANCE;
    }
}
