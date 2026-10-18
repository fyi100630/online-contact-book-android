package com.rhythmbyte.contactbook.ui.screens;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.backdrops.CanvasBackdropKt;
import com.rhythmbyte.contactbook.data.model.ContactBookLogEntry;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.data.model.TimetableData;
import com.rhythmbyte.contactbook.data.model.UserRole;
import com.rhythmbyte.contactbook.data.repository.InstallStats;
import com.rhythmbyte.contactbook.data.update.UpdateInfo;
import com.rhythmbyte.contactbook.ui.components.InstallStatsDialogKt;
import com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt;
import com.rhythmbyte.contactbook.ui.components.TimetableDialogKt;
import com.rhythmbyte.contactbook.ui.components.UpdateDialogKt;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookUiState;
import com.rhythmbyte.contactbook.ui.viewmodel.ContactBookViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aO\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001aI\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0007¢\u0006\u0002\u0010#\u001aT\u0010$\u001a\u00020\u000e2\u0010\u0010%\u001a\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u001b2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u000e0!¢\u0006\u0002\b-H\u0003¢\u0006\u0004\b.\u0010/\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\f\u00109\u001a\u0004\u0018\u00010:X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002²\u0006\f\u0010?\u001a\u0004\u0018\u00010@X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020BX\u008a\u008e\u0002"}, d2 = {"lerp", "", "start", "stop", "fraction", "lerpColor", "Landroidx/compose/ui/graphics/Color;", "end", "lerpColor-jxsXWHM", "(JJF)J", "FlymeAliveEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FlymeAliveExitEasing", "HomeScreen", "", "viewModel", "Lcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookViewModel;", "(Lcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookViewModel;Landroidx/compose/runtime/Composer;II)V", "CategorySection", "category", "Lcom/rhythmbyte/contactbook/data/model/ItemCategory;", "records", "", "Lcom/rhythmbyte/contactbook/data/model/ItemRecord;", "selectedDate", "", "isAdmin", "", "onEdit", "Lkotlin/Function1;", "(Lcom/rhythmbyte/contactbook/data/model/ItemCategory;Ljava/util/List;Ljava/lang/String;ZLcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ItemRow", "item", "Lkotlin/Function0;", "onDelete", "(Lcom/rhythmbyte/contactbook/data/model/ItemRecord;Ljava/lang/String;ZLcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FlymeAliveRevealOverlay", "anim", "Landroidx/compose/animation/core/Animatable;", "center", "Landroidx/compose/ui/geometry/Offset;", "screenWidth", "screenHeight", "isLightTheme", "content", "Landroidx/compose/runtime/Composable;", "FlymeAliveRevealOverlay-waEh7B4", "(Landroidx/compose/animation/core/Animatable;JFFZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release", "uiState", "Lcom/rhythmbyte/contactbook/ui/viewmodel/ContactBookUiState;", "showPasswordDialog", "showLogsDialog", "showStatsDialog", "showTimetableDialog", "showEditAnnouncementDialog", "editingAnnouncementText", "updateInfoToPrompt", "Lcom/rhythmbyte/contactbook/data/update/UpdateInfo;", "isCheckingUpdateManually", "isEditScreenVisible", "isMorphingFromBottom", "editingItem", "plusButtonBounds", "Landroidx/compose/ui/geometry/Rect;", "rootSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HomeScreenKt {
    private static final CubicBezierEasing FlymeAliveEasing = new CubicBezierEasing(0.18f, 0.15f, 0.1f, 1.0f);
    private static final CubicBezierEasing FlymeAliveExitEasing = new CubicBezierEasing(0.3f, 0.0f, 0.15f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CategorySection$lambda$90(ItemCategory itemCategory, List list, String str, boolean z, ContactBookViewModel contactBookViewModel, Function1 function1, int i, Composer composer, int i2) {
        CategorySection(itemCategory, list, str, z, contactBookViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlymeAliveRevealOverlay_waEh7B4$lambda$124(Animatable animatable, long j, float f, float f2, boolean z, Function2 function2, int i, Composer composer, int i2) {
        m6853FlymeAliveRevealOverlaywaEh7B4(animatable, j, f, f2, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$89(ContactBookViewModel contactBookViewModel, int i, int i2, Composer composer, int i3) {
        HomeScreen(contactBookViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ItemRow$lambda$97(ItemRecord itemRecord, String str, boolean z, ContactBookViewModel contactBookViewModel, Function0 function0, Function0 function1, int i, Composer composer, int i2) {
        ItemRow(itemRecord, str, z, contactBookViewModel, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX INFO: renamed from: lerpColor-jxsXWHM, reason: not valid java name */
    private static final long m6854lerpColorjxsXWHM(long j, long j2, float f) {
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        return ColorKt.Color$default(Color.m3849getRedimpl(j) + ((Color.m3849getRedimpl(j2) - Color.m3849getRedimpl(j)) * fCoerceIn), Color.m3848getGreenimpl(j) + ((Color.m3848getGreenimpl(j2) - Color.m3848getGreenimpl(j)) * fCoerceIn), Color.m3846getBlueimpl(j) + ((Color.m3846getBlueimpl(j2) - Color.m3846getBlueimpl(j)) * fCoerceIn), Color.m3845getAlphaimpl(j) + ((Color.m3845getAlphaimpl(j2) - Color.m3845getAlphaimpl(j)) * fCoerceIn), null, 16, null);
    }

    public static final void HomeScreen(ContactBookViewModel contactBookViewModel, Composer composer, final int i, final int i2) {
        ContactBookViewModel contactBookViewModel2;
        int i3;
        CreationExtras.Empty defaultViewModelCreationExtras;
        final MutableState mutableState;
        final MutableState mutableState2;
        final MutableState mutableState3;
        final CoroutineScope coroutineScope;
        Animatable animatable;
        int i4;
        boolean z;
        final ContactBookViewModel contactBookViewModel3;
        String str;
        Continuation continuation;
        int i5;
        boolean z2;
        final MutableState mutableState4;
        MutableState mutableState5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1083583966);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeScreen)158@7367L16,159@7415L7,160@7451L32,162@7526L143,162@7489L180,169@7701L34,170@7762L34,171@7824L34,172@7890L34,173@7963L34,174@8033L31,175@8095L46,176@8178L34,177@8244L34,178@8311L34,179@8369L46,180@8444L40,181@8505L41,183@8573L164,183@8552L185,190@8760L27,191@8813L24,193@8895L114,199@9054L416,215@9510L574,235@10107L179,243@10344L19,243@10308L55,247@10506L21,249@10578L354,249@10555L377,266@11032L22,263@10938L33505:HomeScreen.kt#yz3s17");
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                contactBookViewModel2 = contactBookViewModel;
                if (composerStartRestartGroup.changedInstance(contactBookViewModel2)) {
                    i6 = 4;
                }
                i3 = i | i6;
            } else {
                contactBookViewModel2 = contactBookViewModel;
            }
            i6 = 2;
            i3 = i | i6;
        } else {
            contactBookViewModel2 = contactBookViewModel;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "156@7314L11");
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ContactBookViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                contactBookViewModel2 = (ContactBookViewModel) viewModel;
                i3 &= -15;
            }
            ContactBookViewModel contactBookViewModel4 = contactBookViewModel2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1083583966, i3, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen (HomeScreen.kt:157)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(contactBookViewModel4.getUiState(), null, composerStartRestartGroup, 0, 1);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(338522116);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            String toastMessage = HomeScreen$lambda$0(stateCollectAsState).getToastMessage();
            composerStartRestartGroup.startReplaceGroup(338524627);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(contactBookViewModel4);
            HomeScreenKt$HomeScreen$1$1 homeScreenKt$HomeScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || homeScreenKt$HomeScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                homeScreenKt$HomeScreen$1$1RememberedValue = new HomeScreenKt$HomeScreen$1$1(stateCollectAsState, snackbarHostState, contactBookViewModel4, null);
                composerStartRestartGroup.updateRememberedValue(homeScreenKt$HomeScreen$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(toastMessage, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) homeScreenKt$HomeScreen$1$1RememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(338530118);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338532070);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState7 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338534054);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338536166);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338538502);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338540739);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState mutableState11 = (MutableState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338542738);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final MutableState mutableState12 = (MutableState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338545382);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState13 = (MutableState) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338547494);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final MutableState mutableState14 = (MutableState) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338549638);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableState mutableState15 = (MutableState) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338551506);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            final MutableState mutableState16 = (MutableState) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338553900);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            MutableState mutableState17 = (MutableState) objRememberedValue13;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338555853);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6464boximpl(IntSize.INSTANCE.m6477getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            final MutableState mutableState18 = (MutableState) objRememberedValue14;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(338558152);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            HomeScreenKt$HomeScreen$2$1 homeScreenKt$HomeScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (homeScreenKt$HomeScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                homeScreenKt$HomeScreen$2$1RememberedValue = new HomeScreenKt$HomeScreen$2$1(mutableState12, null);
                composerStartRestartGroup.updateRememberedValue(homeScreenKt$HomeScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) homeScreenKt$HomeScreen$2$1RememberedValue, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(338563999);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue15 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            final Animatable animatable2 = (Animatable) objRememberedValue15;
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue16 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue16).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(338568406);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue17 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt.HomeScreen$lambda$45$lambda$44(mutableState16, mutableState15, mutableState14, (ItemRecord) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            Function1 function1 = (Function1) objRememberedValue17;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338573796);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(animatable2);
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState16;
                mutableState2 = mutableState15;
                mutableState3 = mutableState14;
                objRememberedValue18 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$47$lambda$46(coroutineScope2, mutableState16, animatable2, mutableState15, mutableState14);
                    }
                };
                coroutineScope2 = coroutineScope2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            } else {
                mutableState3 = mutableState14;
                mutableState = mutableState16;
                mutableState2 = mutableState15;
            }
            Function0 function0 = (Function0) objRememberedValue18;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338588546);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(animatable2);
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                coroutineScope = coroutineScope2;
                objRememberedValue19 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$49$lambda$48(coroutineScope, mutableState2, animatable2, mutableState3, mutableState);
                    }
                };
                animatable = animatable2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            } else {
                coroutineScope = coroutineScope2;
                animatable = animatable2;
            }
            final Function0 function2 = (Function0) objRememberedValue19;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338607255);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue20 = CollectionsKt.listOf((Object[]) new ItemCategory[]{ItemCategory.HOMEWORK, ItemCategory.EXAM, ItemCategory.SUBMISSION, ItemCategory.REMINDER});
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            final List list = (List) objRememberedValue20;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(338614679);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue21 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(list.size());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            composerStartRestartGroup.endReplaceGroup();
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue21, composerStartRestartGroup, 6, 2);
            boolean z3 = HomeScreen$lambda$0(stateCollectAsState).getUserRole() != UserRole.VISITOR;
            if (HomeScreen$lambda$0(stateCollectAsState).getUserRole() == UserRole.SUPER_ADMIN) {
                z = true;
                i4 = 0;
            } else {
                i4 = 0;
                z = false;
            }
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, i4);
            composerStartRestartGroup.startReplaceGroup(338622502);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue22 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt.HomeScreen$lambda$54$lambda$53((DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            composerStartRestartGroup.endReplaceGroup();
            Backdrop backdropRememberCanvasBackdrop = CanvasBackdropKt.rememberCanvasBackdrop((Function1) objRememberedValue22, composerStartRestartGroup, 6);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(338636698);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue23 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt.HomeScreen$lambda$56$lambda$55(mutableState18, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue23);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            boolean z4 = z;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1098119463, "C270@11101L35,271@11143L26965,269@11068L27040:HomeScreen.kt#yz3s17");
            MutableState mutableState19 = mutableState2;
            MutableState mutableState20 = mutableState3;
            ScaffoldKt.m2091ScaffoldTvnljyQ(null, null, null, ComposableLambdaKt.rememberComposableLambda(1257144686, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ComposerKt.sourceInformation(composer2, "C270@11103L31:HomeScreen.kt#yz3s17");
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1257144686, i7, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous> (HomeScreen.kt:270)");
                    }
                    SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer2, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1172175881, true, new HomeScreenKt$HomeScreen$4$2(pagerStateRememberPagerState, list, backdropRememberCanvasBackdrop, z3, function0, zIsSystemInDarkTheme, z4, contactBookViewModel4, stateCollectAsState, context, coroutineScope, mutableState13, snackbarHostState, mutableState12, mutableState8, mutableState7, mutableState6, mutableState11, mutableState10, mutableState9, function1, mutableState17, mutableState19, mutableState20), composerStartRestartGroup, 54), composerStartRestartGroup, 805309440, 503);
            composerStartRestartGroup.startReplaceGroup(-379384441);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (!HomeScreen$lambda$28(mutableState20)) {
                composerStartRestartGroup = composerStartRestartGroup;
                contactBookViewModel3 = contactBookViewModel4;
                str = "CC(remember):HomeScreen.kt#9igjgp";
                continuation = null;
                i5 = 54;
                z2 = true;
            } else if (HomeScreen$lambda$31(mutableState19)) {
                composerStartRestartGroup.startReplaceGroup(1124026193);
                ComposerKt.sourceInformation(composerStartRestartGroup, "785@38228L7,786@38275L7,787@38315L21,792@38656L302,808@39292L505,802@39040L771");
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Configuration configuration = (Configuration) objConsume2;
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density = (Density) objConsume3;
                z2 = true;
                boolean z5 = !DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                float fM6472getWidthimpl = IntSize.m6472getWidthimpl(HomeScreen$lambda$40(mutableState18)) > 0 ? IntSize.m6472getWidthimpl(HomeScreen$lambda$40(mutableState18)) : density.mo376toPx0680j_4(Dp.m6302constructorimpl(configuration.screenWidthDp));
                float fM6471getHeightimpl = IntSize.m6471getHeightimpl(HomeScreen$lambda$40(mutableState18)) > 0 ? IntSize.m6471getHeightimpl(HomeScreen$lambda$40(mutableState18)) : density.mo376toPx0680j_4(Dp.m6302constructorimpl(configuration.screenHeightDp));
                composerStartRestartGroup.startReplaceGroup(-379369039);
                str = "CC(remember):HomeScreen.kt#9igjgp";
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChanged2 = composerStartRestartGroup.changed(fM6472getWidthimpl) | composerStartRestartGroup.changed(fM6471getHeightimpl) | composerStartRestartGroup.changed(density);
                Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    float f = 32;
                    objRememberedValue24 = Offset.m3591boximpl(OffsetKt.Offset((fM6472getWidthimpl - density.mo376toPx0680j_4(Dp.m6302constructorimpl(14))) - density.mo376toPx0680j_4(Dp.m6302constructorimpl(f)), (fM6471getHeightimpl - density.mo376toPx0680j_4(Dp.m6302constructorimpl(24))) - density.mo376toPx0680j_4(Dp.m6302constructorimpl(f))));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                }
                long packedValue = ((Offset) objRememberedValue24).getPackedValue();
                composerStartRestartGroup.endReplaceGroup();
                Rect rectHomeScreen$lambda$37 = HomeScreen$lambda$37(mutableState17);
                if (rectHomeScreen$lambda$37 != null) {
                    packedValue = rectHomeScreen$lambda$37.m3632getCenterF1C5BW0();
                }
                contactBookViewModel3 = contactBookViewModel4;
                m6853FlymeAliveRevealOverlaywaEh7B4(animatable, packedValue, fM6472getWidthimpl, fM6471getHeightimpl, z5, ComposableLambdaKt.rememberComposableLambda(1344463151, true, new HomeScreenKt$HomeScreen$4$3(list, pagerStateRememberPagerState, function2, contactBookViewModel4, mutableState, stateCollectAsState), composerStartRestartGroup, 54), composerStartRestartGroup, Animatable.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i5 = 54;
                continuation = null;
            } else {
                contactBookViewModel3 = contactBookViewModel4;
                str = "CC(remember):HomeScreen.kt#9igjgp";
                i5 = 54;
                z2 = true;
                composerStartRestartGroup.startReplaceGroup(1125630226);
                ComposerKt.sourceInformation(composerStartRestartGroup, "823@39842L500");
                continuation = null;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    mutableState5 = mutableState;
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup = composerStartRestartGroup;
                mutableState5 = mutableState;
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composerStartRestartGroup);
                Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1062082860, "C828@40128L21,829@40180L130,824@39899L429:HomeScreen.kt#yz3s17");
                ItemRecord itemRecordHomeScreen$lambda$34 = HomeScreen$lambda$34(mutableState5);
                String selectedDate = HomeScreen$lambda$0(stateCollectAsState).getSelectedDate();
                String key = ((ItemCategory) list.get(pagerStateRememberPagerState.getCurrentPage())).getKey();
                composerStartRestartGroup.startReplaceGroup(519935511);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChanged3 = composerStartRestartGroup.changed(function2);
                Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue25 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$65$lambda$62$lambda$61(function2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                }
                Function0 function3 = (Function0) objRememberedValue25;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(519937284);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(contactBookViewModel3) | composerStartRestartGroup.changed(function2);
                Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue26 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$65$lambda$64$lambda$63(contactBookViewModel3, function2, (ItemRecord) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                }
                composerStartRestartGroup.endReplaceGroup();
                EditItemScreenKt.EditItemScreen(itemRecordHomeScreen$lambda$34, selectedDate, key, function3, (Function1) objRememberedValue26, composerStartRestartGroup, 0, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-379314347);
            ComposerKt.sourceInformation(composerStartRestartGroup, "840@40450L30,841@40510L44,839@40406L162");
            if (HomeScreen$lambda$4(mutableState6)) {
                composerStartRestartGroup.startReplaceGroup(-379311903);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue27 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$67$lambda$66(mutableState6);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                }
                Function0 function4 = (Function0) objRememberedValue27;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-379309969);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(contactBookViewModel3);
                HomeScreenKt$HomeScreen$4$6$1 homeScreenKt$HomeScreen$4$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || homeScreenKt$HomeScreen$4$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    homeScreenKt$HomeScreen$4$6$1RememberedValue = new HomeScreenKt$HomeScreen$4$6$1(contactBookViewModel3, continuation);
                    composerStartRestartGroup.updateRememberedValue(homeScreenKt$HomeScreen$4$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                PasswordDialogKt.PasswordDialog(function4, (Function2) homeScreenKt$HomeScreen$4$6$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-379307160);
            ComposerKt.sourceInformation(composerStartRestartGroup, "849@40763L32,850@40825L26,851@40881L40,846@40622L313");
            if (HomeScreen$lambda$7(mutableState7)) {
                List<ContactBookLogEntry> logsList = HomeScreen$lambda$0(stateCollectAsState).getLogsList();
                boolean zIsLoadingLogs = HomeScreen$lambda$0(stateCollectAsState).isLoadingLogs();
                composerStartRestartGroup.startReplaceGroup(-379301885);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(contactBookViewModel3);
                Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance6 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue28 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$70$lambda$69(contactBookViewModel3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                }
                Function0 function5 = (Function0) objRememberedValue28;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-379299907);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue29 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$72$lambda$71(mutableState7);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                }
                Function0 function6 = (Function0) objRememberedValue29;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-379298101);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(contactBookViewModel3);
                Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance7 || objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue30 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$74$lambda$73(contactBookViewModel3, (ContactBookLogEntry) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue30);
                }
                composerStartRestartGroup.endReplaceGroup();
                HistoryLogsDialogKt.HistoryLogsDialog(logsList, zIsLoadingLogs, function5, function6, (Function1) objRememberedValue30, composerStartRestartGroup, 3072);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-379295478);
            ComposerKt.sourceInformation(composerStartRestartGroup, "859@41136L33,860@41199L27,856@40990L250");
            if (HomeScreen$lambda$10(mutableState8)) {
                InstallStats installStats = HomeScreen$lambda$0(stateCollectAsState).getInstallStats();
                boolean zIsLoadingStats = HomeScreen$lambda$0(stateCollectAsState).isLoadingStats();
                composerStartRestartGroup.startReplaceGroup(-379289948);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(contactBookViewModel3);
                Object objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance8 || objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue31 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$76$lambda$75(contactBookViewModel3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue31);
                }
                Function0 function7 = (Function0) objRememberedValue31;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-379287938);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue32 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$78$lambda$77(mutableState8);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                InstallStatsDialogKt.InstallStatsDialog(installStats, zIsLoadingStats, function7, (Function0) objRememberedValue32, composer2, InstallStats.$stable | 3072);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-379285698);
            ComposerKt.sourceInformation(composerStartRestartGroup, "868@41433L57,869@41520L31,865@41299L266");
            if (HomeScreen$lambda$13(mutableState9)) {
                TimetableData timetable = HomeScreen$lambda$0(stateCollectAsState).getTimetable();
                composerStartRestartGroup.startReplaceGroup(-379280420);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(contactBookViewModel3);
                Object objRememberedValue33 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance9 || objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue33 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$80$lambda$79(contactBookViewModel3, (Map) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue33);
                }
                Function1 function8 = (Function1) objRememberedValue33;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-379277662);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                Object objRememberedValue34 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue34 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$82$lambda$81(mutableState9);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue34);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer3 = composerStartRestartGroup;
                TimetableDialogKt.TimetableDialog(timetable, z4, function8, (Function0) objRememberedValue34, composer3, TimetableData.$stable | 3072);
                composerStartRestartGroup = composer3;
            }
            composerStartRestartGroup.endReplaceGroup();
            UpdateInfo updateInfoHomeScreen$lambda$22 = HomeScreen$lambda$22(mutableState12);
            composerStartRestartGroup.startReplaceGroup(-379274813);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*876@41712L29,874@41633L122");
            if (updateInfoHomeScreen$lambda$22 != null) {
                composerStartRestartGroup.startReplaceGroup(519986207);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                Object objRememberedValue35 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue35 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$85$lambda$84$lambda$83(mutableState12);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue35);
                }
                composerStartRestartGroup.endReplaceGroup();
                UpdateDialogKt.UpdateDialog(updateInfoHomeScreen$lambda$22, (Function0) objRememberedValue35, composerStartRestartGroup, 48);
                Unit unit2 = Unit.INSTANCE;
                Unit unit3 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-379266871);
            ComposerKt.sourceInformation(composerStartRestartGroup, "881@41847L38,881@41887L2540,881@41821L2606");
            if (HomeScreen$lambda$16(mutableState10)) {
                composerStartRestartGroup.startReplaceGroup(-379267191);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                Object objRememberedValue36 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                    mutableState4 = mutableState10;
                    objRememberedValue36 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$88$lambda$87$lambda$86(mutableState4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue36);
                } else {
                    mutableState4 = mutableState10;
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer4 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue36, null, ComposableLambdaKt.rememberComposableLambda(-1589633195, z2, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$16
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        ComposerKt.sourceInformation(composer5, "C885@42065L11,888@42218L2195,882@41905L2508:HomeScreen.kt#yz3s17");
                        if ((i7 & 3) != 2 || !composer5.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1589633195, i7, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous> (HomeScreen.kt:882)");
                            }
                            float f2 = 24;
                            LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2)), Dp.m6302constructorimpl(f2), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getSurface(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Dp.m6302constructorimpl(16), ComposableLambdaKt.rememberComposableLambda(-2086669388, true, new AnonymousClass1(mutableState11, contactBookViewModel3, mutableState4), composer5, 54), composer5, 1769862, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$16$1, reason: invalid class name */
                    /* JADX INFO: compiled from: HomeScreen.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ MutableState<String> $editingAnnouncementText$delegate;
                        final /* synthetic */ MutableState<Boolean> $showEditAnnouncementDialog$delegate;
                        final /* synthetic */ ContactBookViewModel $viewModel;

                        AnonymousClass1(MutableState<String> mutableState, ContactBookViewModel contactBookViewModel, MutableState<Boolean> mutableState2) {
                            this.$editingAnnouncementText$delegate = mutableState;
                            this.$viewModel = contactBookViewModel;
                            this.$showEditAnnouncementDialog$delegate = mutableState2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            final MutableState<String> mutableState;
                            final MutableState<Boolean> mutableState2;
                            ComposerKt.sourceInformation(composer, "C889@42240L2155:HomeScreen.kt#yz3s17");
                            if ((i & 3) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2086669388, i, -1, "com.rhythmbyte.contactbook.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:889)");
                                }
                                Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(20));
                                MutableState<String> mutableState3 = this.$editingAnnouncementText$delegate;
                                final ContactBookViewModel contactBookViewModel = this.$viewModel;
                                MutableState<Boolean> mutableState4 = this.$showEditAnnouncementDialog$delegate;
                                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM684padding3ABfNKs);
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
                                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer, -805896237, "C892@42415L10,894@42547L11,890@42309L285,896@42619L41,899@42809L32,897@42685L457,906@43167L41,907@43233L1140:HomeScreen.kt#yz3s17");
                                TextKt.m2376Text4IGK_g("📢 編輯班級重要公告", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65498);
                                float f = 12;
                                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                                String strHomeScreen$lambda$19 = HomeScreenKt.HomeScreen$lambda$19(mutableState3);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(14));
                                composer.startReplaceGroup(943848640);
                                ComposerKt.sourceInformation(composer, "CC(remember):HomeScreen.kt#9igjgp");
                                Object objRememberedValue = composer.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    mutableState = mutableState3;
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01a5: CONSTRUCTOR (r12v12 'objRememberedValue' java.lang.Object) = (r13v10 'mutableState' androidx.compose.runtime.MutableState<java.lang.String> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.MutableState):void (m)] (LINE:900) call: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$16$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$16.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$16$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 29 more
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 977
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$HomeScreen$4$16.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$7$lambda$1$lambda$0(MutableState mutableState, String it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$7$lambda$6$lambda$3$lambda$2(MutableState mutableState) {
                                    HomeScreenKt.HomeScreen$lambda$17(mutableState, false);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(ContactBookViewModel contactBookViewModel, MutableState mutableState, MutableState mutableState2) {
                                    contactBookViewModel.updateAnnouncement(StringsKt.trim((CharSequence) HomeScreenKt.HomeScreen$lambda$19(mutableState)).toString());
                                    HomeScreenKt.HomeScreen$lambda$17(mutableState2, false);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, i5), composer4, 390, 2);
                        composerStartRestartGroup = composer4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    contactBookViewModel3 = contactBookViewModel2;
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HomeScreenKt.HomeScreen$lambda$89(contactBookViewModel3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }

            private static final boolean HomeScreen$lambda$4(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean HomeScreen$lambda$7(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean HomeScreen$lambda$10(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean HomeScreen$lambda$13(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean HomeScreen$lambda$16(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String HomeScreen$lambda$19(MutableState<String> mutableState) {
                return mutableState.getValue();
            }

            private static final UpdateInfo HomeScreen$lambda$22(MutableState<UpdateInfo> mutableState) {
                return mutableState.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean HomeScreen$lambda$25(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$26(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean HomeScreen$lambda$28(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$29(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean HomeScreen$lambda$31(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void HomeScreen$lambda$32(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ItemRecord HomeScreen$lambda$34(MutableState<ItemRecord> mutableState) {
                return mutableState.getValue();
            }

            private static final Rect HomeScreen$lambda$37(MutableState<Rect> mutableState) {
                return mutableState.getValue();
            }

            private static final long HomeScreen$lambda$40(MutableState<IntSize> mutableState) {
                return mutableState.getValue().getPackedValue();
            }

            private static final void HomeScreen$lambda$41(MutableState<IntSize> mutableState, long j) {
                mutableState.setValue(IntSize.m6464boximpl(j));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$45$lambda$44(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ItemRecord item) {
                Intrinsics.checkNotNullParameter(item, "item");
                mutableState.setValue(item);
                HomeScreen$lambda$32(mutableState2, false);
                HomeScreen$lambda$29(mutableState3, true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$47$lambda$46(CoroutineScope coroutineScope, MutableState mutableState, Animatable animatable, MutableState mutableState2, MutableState mutableState3) {
                mutableState.setValue(null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomeScreenKt$HomeScreen$openCreateFromBottom$1$1$1(animatable, mutableState2, mutableState3, null), 3, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$49$lambda$48(CoroutineScope coroutineScope, MutableState mutableState, Animatable animatable, MutableState mutableState2, MutableState mutableState3) {
                if (HomeScreen$lambda$31(mutableState)) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HomeScreenKt$HomeScreen$closeEditScreen$1$1$1(animatable, mutableState2, mutableState, mutableState3, null), 3, null);
                } else {
                    HomeScreen$lambda$29(mutableState2, false);
                    mutableState3.setValue(null);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$54$lambda$53(DrawScope rememberCanvasBackdrop) {
                Intrinsics.checkNotNullParameter(rememberCanvasBackdrop, "$this$rememberCanvasBackdrop");
                DrawScope.m4392drawRectAsUm42w$default(rememberCanvasBackdrop, Brush.Companion.m3796radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald500(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getAmber500(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU())}), 0L, 1200.0f, 0, 10, (Object) null), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$56$lambda$55(MutableState mutableState, LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                HomeScreen$lambda$41(mutableState, it.mo5186getSizeYbymL2g());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$65$lambda$62$lambda$61(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$65$lambda$64$lambda$63(ContactBookViewModel contactBookViewModel, Function0 function0, ItemRecord item) {
                Intrinsics.checkNotNullParameter(item, "item");
                contactBookViewModel.saveOrUpdateItem(item);
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$67$lambda$66(MutableState mutableState) {
                HomeScreen$lambda$5(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$70$lambda$69(ContactBookViewModel contactBookViewModel) {
                contactBookViewModel.fetchHistoryLogs();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$72$lambda$71(MutableState mutableState) {
                HomeScreen$lambda$8(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$74$lambda$73(ContactBookViewModel contactBookViewModel, ContactBookLogEntry log) {
                Intrinsics.checkNotNullParameter(log, "log");
                contactBookViewModel.restoreFromLog(log);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$76$lambda$75(ContactBookViewModel contactBookViewModel) {
                contactBookViewModel.fetchInstallStats();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$78$lambda$77(MutableState mutableState) {
                HomeScreen$lambda$11(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$80$lambda$79(ContactBookViewModel contactBookViewModel, Map newSchedule) {
                Intrinsics.checkNotNullParameter(newSchedule, "newSchedule");
                contactBookViewModel.updateTimetable(newSchedule);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$82$lambda$81(MutableState mutableState) {
                HomeScreen$lambda$14(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$85$lambda$84$lambda$83(MutableState mutableState) {
                mutableState.setValue(null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HomeScreen$lambda$88$lambda$87$lambda$86(MutableState mutableState) {
                HomeScreen$lambda$17(mutableState, false);
                return Unit.INSTANCE;
            }

            public static final void CategorySection(final ItemCategory category, final List<ItemRecord> records, final String selectedDate, final boolean z, final ContactBookViewModel viewModel, final Function1<? super ItemRecord, Unit> onEdit, Composer composer, final int i) {
                int i2;
                boolean z2;
                Composer composer2;
                Intrinsics.checkNotNullParameter(category, "category");
                Intrinsics.checkNotNullParameter(records, "records");
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                Intrinsics.checkNotNullParameter(onEdit, "onEdit");
                Composer composerStartRestartGroup = composer.startRestartGroup(-2074323459);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(CategorySection)P(!1,3,4!1,5)950@44830L2602,945@44665L2767:HomeScreen.kt#yz3s17");
                if ((i & 6) == 0) {
                    i2 = (composerStartRestartGroup.changed(category) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(records) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= composerStartRestartGroup.changed(selectedDate) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    z2 = z;
                    i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                } else {
                    z2 = z;
                }
                if ((i & 24576) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(viewModel) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(onEdit) ? 131072 : 65536;
                }
                if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2074323459, i2, -1, "com.rhythmbyte.contactbook.ui.screens.CategorySection (HomeScreen.kt:944)");
                    }
                    float f = 24;
                    composer2 = composerStartRestartGroup;
                    LiquidGlassCardKt.m6752LiquidGlassCardH3kbamo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f)), Dp.m6302constructorimpl(f), 0L, 0L, Dp.m6302constructorimpl(6), ComposableLambdaKt.rememberComposableLambda(-1585049572, true, new AnonymousClass1(records, category, selectedDate, z2, viewModel, onEdit), composerStartRestartGroup, 54), composer2, 1769862, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HomeScreenKt.CategorySection$lambda$90(category, records, selectedDate, z, viewModel, onEdit, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }

            /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$CategorySection$1, reason: invalid class name */
            /* JADX INFO: compiled from: HomeScreen.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ ItemCategory $category;
                final /* synthetic */ boolean $isAdmin;
                final /* synthetic */ Function1<ItemRecord, Unit> $onEdit;
                final /* synthetic */ List<ItemRecord> $records;
                final /* synthetic */ String $selectedDate;
                final /* synthetic */ ContactBookViewModel $viewModel;

                /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$CategorySection$1$WhenMappings */
                /* JADX INFO: compiled from: HomeScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ItemCategory.values().length];
                        try {
                            iArr[ItemCategory.HOMEWORK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ItemCategory.EXAM.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ItemCategory.SUBMISSION.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ItemCategory.REMINDER.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(List<ItemRecord> list, ItemCategory itemCategory, String str, boolean z, ContactBookViewModel contactBookViewModel, Function1<? super ItemRecord, Unit> function1) {
                    this.$records = list;
                    this.$category = itemCategory;
                    this.$selectedDate = str;
                    this.$isAdmin = z;
                    this.$viewModel = contactBookViewModel;
                    this.$onEdit = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    String str;
                    ComposerKt.sourceInformation(composer, "C951@44840L2586:HomeScreen.kt#yz3s17");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1585049572, i, -1, "com.rhythmbyte.contactbook.ui.screens.CategorySection.<anonymous> (HomeScreen.kt:951)");
                        }
                        Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(18));
                        List<ItemRecord> list = this.$records;
                        ItemCategory itemCategory = this.$category;
                        String str2 = this.$selectedDate;
                        boolean z = this.$isAdmin;
                        ContactBookViewModel contactBookViewModel = this.$viewModel;
                        Function1<ItemRecord, Unit> function1 = this.$onEdit;
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM684padding3ABfNKs);
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
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -2119168543, "C953@44898L1094,981@46006L41:HomeScreen.kt#yz3s17");
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
                        ComposerKt.sourceInformationMarkerStart(composer, 1035233848, "C957@45050L37,958@45104L39,961@45251L10,963@45367L11,959@45160L246,965@45423L39,966@45479L499:HomeScreen.kt#yz3s17");
                        ContactBookViewModel contactBookViewModel2 = contactBookViewModel;
                        Function1<ItemRecord, Unit> function2 = function1;
                        TextKt.m2376Text4IGK_g(itemCategory.getIcon(), (Modifier) null, 0L, TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131062);
                        float f = 8;
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                        TextKt.m2376Text4IGK_g(itemCategory.getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape()), Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald500(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(2));
                        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                        Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1708418143, "C972@45744L216:HomeScreen.kt#yz3s17");
                        TextKt.m2376Text4IGK_g(String.valueOf(list.size()), (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald600(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
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
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composer2, 6);
                        if (list.isEmpty()) {
                            composer2.startReplaceGroup(-2118046313);
                            ComposerKt.sourceInformation(composer2, "984@46102L735");
                            Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6302constructorimpl(16), 1, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM686paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor4);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1036494804, "C996@46667L152:HomeScreen.kt#yz3s17");
                            int i2 = WhenMappings.$EnumSwitchMapping$0[itemCategory.ordinal()];
                            if (i2 == 1) {
                                str = "✨ 目前無待辦作業，太棒了！";
                            } else if (i2 == 2) {
                                str = "✨ 目前無考試或評量預告。";
                            } else if (i2 == 3) {
                                str = "✨ 目前無待繳交項目。";
                            } else {
                                if (i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "✨ 目前無重要提醒事項。";
                            }
                            TextKt.m2376Text4IGK_g(str, (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getSlate400(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-2117285945);
                            ComposerKt.sourceInformation(composer2, "1003@46875L527");
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f));
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor5);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1037107178, "C:HomeScreen.kt#yz3s17");
                            composer2.startReplaceGroup(-1213470671);
                            ComposerKt.sourceInformation(composer2, "*1010@47246L16,1011@47303L33,1005@47004L358");
                            for (final ItemRecord itemRecord : list) {
                                composer2.startReplaceGroup(776221594);
                                ComposerKt.sourceInformation(composer2, "CC(remember):HomeScreen.kt#9igjgp");
                                final Function1<ItemRecord, Unit> function3 = function2;
                                boolean zChanged = composer2.changed(function3) | composer2.changed(itemRecord);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$CategorySection$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HomeScreenKt.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7$lambda$4$lambda$3(function3, itemRecord);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(776223435);
                                ComposerKt.sourceInformation(composer2, "CC(remember):HomeScreen.kt#9igjgp");
                                final ContactBookViewModel contactBookViewModel3 = contactBookViewModel2;
                                boolean zChangedInstance = composer2.changedInstance(contactBookViewModel3) | composer2.changed(itemRecord);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$CategorySection$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HomeScreenKt.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(contactBookViewModel3, itemRecord);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                HomeScreenKt.ItemRow(itemRecord, str2, z, contactBookViewModel3, function0, (Function0) objRememberedValue2, composer2, 0);
                                composer2 = composer;
                                contactBookViewModel2 = contactBookViewModel3;
                                function2 = function3;
                            }
                            composer.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceGroup();
                        }
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
                public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$4$lambda$3(Function1 function1, ItemRecord itemRecord) {
                    function1.invoke(itemRecord);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(ContactBookViewModel contactBookViewModel, ItemRecord itemRecord) {
                    contactBookViewModel.deleteItem(itemRecord.getId());
                    return Unit.INSTANCE;
                }
            }

            public static final void ItemRow(final ItemRecord item, final String selectedDate, final boolean z, final ContactBookViewModel viewModel, final Function0<Unit> onEdit, final Function0<Unit> onDelete, Composer composer, final int i) {
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                Intrinsics.checkNotNullParameter(onEdit, "onEdit");
                Intrinsics.checkNotNullParameter(onDelete, "onDelete");
                Composer composerStartRestartGroup = composer.startRestartGroup(1772591025);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(ItemRow)P(1,4!1,5,3)1035@47845L11,1031@47701L3066:HomeScreen.kt#yz3s17");
                if ((i & 6) == 0) {
                    i2 = (composerStartRestartGroup.changed(item) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= composerStartRestartGroup.changed(selectedDate) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(viewModel) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(onEdit) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(onDelete) ? 131072 : 65536;
                }
                if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1772591025, i2, -1, "com.rhythmbyte.contactbook.ui.screens.ItemRow (HomeScreen.kt:1028)");
                    }
                    Long countdownDays = viewModel.getCountdownDays(item.getDueDate(), selectedDate);
                    Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(14))), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6302constructorimpl(12));
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM684padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1745161440, "C1040@48051L2201:HomeScreen.kt#yz3s17");
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -523268515, "C1041@48104L1865:HomeScreen.kt#yz3s17");
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1158832707, "C1063@49057L11,1059@48878L218:HomeScreen.kt#yz3s17");
                    composerStartRestartGroup.startReplaceGroup(-101166727);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "1043@48227L555,1056@48803L39");
                    if (item.getSubject().length() > 0) {
                        float f = 6;
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f))), Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald500(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(2));
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composerStartRestartGroup);
                        Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1142107282, "C1049@48529L231:HomeScreen.kt#yz3s17");
                        i3 = 12;
                        TextKt.m2376Text4IGK_g(item.getSubject(), (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getEmerald600(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composerStartRestartGroup, 6);
                    } else {
                        i3 = 12;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    TextKt.m2376Text4IGK_g(item.getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
                    composerStartRestartGroup.startReplaceGroup(-101136492);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "1067@49159L39,1069@49269L668");
                    if (countdownDays != null) {
                        float f2 = 6;
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2)), composerStartRestartGroup, 6);
                        boolean z2 = countdownDays.longValue() <= 1;
                        Modifier modifierM685paddingVpY3zN5 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f2))), Color.m3842copywmQWz5c$default(z2 ? com.rhythmbyte.contactbook.ui.theme.ColorKt.getRose500() : com.rhythmbyte.contactbook.ui.theme.ColorKt.getAmber500(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6302constructorimpl(f2), Dp.m6302constructorimpl(2));
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN5);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composerStartRestartGroup);
                        Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1143187694, "C1075@49616L299:HomeScreen.kt#yz3s17");
                        TextKt.m2376Text4IGK_g(countdownDays.longValue() == 0 ? "⏳ 今天截止" : "⏳ 剩餘 " + countdownDays + " 天", (Modifier) null, z2 ? com.rhythmbyte.contactbook.ui.theme.ColorKt.getRose500() : com.rhythmbyte.contactbook.ui.theme.ColorKt.getOrange500(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(-432463377);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "1086@50032L40,1087@50089L139");
                    if (item.getDetails().length() > 0) {
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(4)), composerStartRestartGroup, 6);
                        TextKt.m2376Text4IGK_g(item.getDetails(), (Modifier) null, com.rhythmbyte.contactbook.ui.theme.ColorKt.getSlate500(), TextUnitKt.getSp(i3), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(887648064);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "1096@50289L462");
                    if (z) {
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, r15);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3336constructorimpl6 = Updater.m3336constructorimpl(composerStartRestartGroup);
                        Updater.m3343setimpl(composerM3336constructorimpl6, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3336constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -521132243, "C1097@50311L203,1100@50531L206:HomeScreen.kt#yz3s17");
                        float f3 = 32;
                        IconButtonKt.IconButton(onEdit, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6828getLambda9$app_release(), composerStartRestartGroup, ((i2 >> 12) & 14) | 196656, 28);
                        IconButtonKt.IconButton(onDelete, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3)), false, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m6820getLambda10$app_release(), composerStartRestartGroup, ((i2 >> 15) & 14) | 196656, 28);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HomeScreenKt.ItemRow$lambda$97(item, selectedDate, z, viewModel, onEdit, onDelete, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }

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
            /* JADX INFO: renamed from: FlymeAliveRevealOverlay-waEh7B4, reason: not valid java name */
            private static final void m6853FlymeAliveRevealOverlaywaEh7B4(final Animatable<Float, ?> animatable, final long j, final float f, final float f2, final boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
                int i2;
                float f3;
                final float f4;
                final float f5;
                Object obj;
                int i3;
                final long j2;
                Function2<? super Composer, ? super Integer, Unit> function3;
                Composer composer2;
                final Animatable<Float, ?> animatable2;
                Composer composerStartRestartGroup = composer.startRestartGroup(-1130619041);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(FlymeAliveRevealOverlay)P(!1,1:c#ui.geometry.Offset,5,4,3)1117@51019L7,1118@51049L52,1119@51122L319,1127@51462L85,1128@51579L11,1129@51625L19,1131@51663L77,1132@51758L79,1134@51843L5139:HomeScreen.kt#yz3s17");
                if ((i & 6) == 0) {
                    i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
                }
                if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1130619041, i2, -1, "com.rhythmbyte.contactbook.ui.screens.FlymeAliveRevealOverlay (HomeScreen.kt:1116)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Density density = (Density) objConsume;
                    composerStartRestartGroup.startReplaceGroup(179512636);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    boolean zChanged = composerStartRestartGroup.changed(density);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = Float.valueOf(density.mo376toPx0680j_4(Dp.m6302constructorimpl(32)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    float fFloatValue = ((Number) objRememberedValue).floatValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(179515239);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    int i4 = i2 & 112;
                    int i5 = i2 & 896;
                    int i6 = i2 & 7168;
                    boolean z2 = (i4 == 32) | (i5 == 256) | (i6 == 2048);
                    int i7 = i2;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = Float.valueOf(ComparisonsKt.maxOf((float) Math.hypot(Offset.m3602getXimpl(j), Offset.m3603getYimpl(j)), (float) Math.hypot(f - Offset.m3602getXimpl(j), Offset.m3603getYimpl(j)), (float) Math.hypot(Offset.m3602getXimpl(j), f2 - Offset.m3603getYimpl(j)), (float) Math.hypot(f - Offset.m3602getXimpl(j), f2 - Offset.m3603getYimpl(j))) * 1.05f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    float fFloatValue2 = ((Number) objRememberedValue2).floatValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(179525885);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    int i8 = i7 & 57344;
                    boolean z3 = i8 == 16384;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = Color.m3833boximpl(ColorKt.Color(z ? 4279179050L : 4280166715L));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final long jM3853unboximpl = ((Color) objRememberedValue3).m3853unboximpl();
                    composerStartRestartGroup.endReplaceGroup();
                    final long background = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground();
                    composerStartRestartGroup.startReplaceGroup(179531035);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = AndroidPath_androidKt.Path();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    final Path path = (Path) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    float fM3602getXimpl = Offset.m3602getXimpl(j);
                    composerStartRestartGroup.startReplaceGroup(179532309);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    boolean zChanged2 = (i5 == 256) | composerStartRestartGroup.changed(fM3602getXimpl);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = Float.valueOf(RangesKt.coerceIn(Offset.m3602getXimpl(j) / f, 0.0f, 1.0f));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    final float fFloatValue3 = ((Number) objRememberedValue5).floatValue();
                    composerStartRestartGroup.endReplaceGroup();
                    float fM3603getYimpl = Offset.m3603getYimpl(j);
                    composerStartRestartGroup.startReplaceGroup(179535351);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    boolean zChanged3 = (i6 == 2048) | composerStartRestartGroup.changed(fM3603getYimpl);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        f3 = 0.0f;
                        objRememberedValue6 = Float.valueOf(RangesKt.coerceIn(Offset.m3603getYimpl(j) / f2, 0.0f, 1.0f));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        f3 = 0.0f;
                    }
                    final float fFloatValue4 = ((Number) objRememberedValue6).floatValue();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, f3, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 826852321, "C1140@52029L39,1142@52126L2,1136@51893L245,1145@52190L1154,1145@52148L1196,1178@53453L1518,1213@55005L719,1175@53354L2414,1237@55839L197,1244@56097L416,1235@55778L1198:HomeScreen.kt#yz3s17");
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1497348690);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1497345623);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(ClickableKt.m270clickableO2vRcR0$default(modifierFillMaxSize$default2, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue8, 28, null), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1497342423);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    int i9 = i7 & 14;
                    boolean zChanged4 = (i9 == 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable))) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(fFloatValue2) | composerStartRestartGroup.changed(jM3853unboximpl) | composerStartRestartGroup.changed(background) | (i4 == 32) | (i8 == 16384);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        f4 = fFloatValue2;
                        f5 = fFloatValue;
                        i3 = i4;
                        obj = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$109$lambda$108(animatable, f5, f4, jM3853unboximpl, background, j, z, (DrawScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        f5 = fFloatValue;
                        obj = objRememberedValue9;
                        i3 = i4;
                        f4 = fFloatValue2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CanvasKt.Canvas(modifierFillMaxSize$default3, (Function1) obj, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1497301643);
                    ComposerKt.sourceInformation(composerStartRestartGroup, r4);
                    boolean zChanged5 = composerStartRestartGroup.changed(f5) | (i9 == 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable))) | composerStartRestartGroup.changed(f4) | composerStartRestartGroup.changed(fFloatValue3) | composerStartRestartGroup.changed(fFloatValue4) | (i3 == 32);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        Function1 function1 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$111$lambda$110(animatable, f5, f4, fFloatValue3, fFloatValue4, j, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue10 = function1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default4, (Function1) objRememberedValue10);
                    composerStartRestartGroup.startReplaceGroup(-1497252778);
                    ComposerKt.sourceInformation(composerStartRestartGroup, r4);
                    boolean zChanged6 = composerStartRestartGroup.changed(f5) | (i9 == 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable))) | composerStartRestartGroup.changed(f4) | composerStartRestartGroup.changedInstance(path) | (i3 == 32);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        Function1 function4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$114$lambda$113(animatable, f5, f4, path, j, (ContentDrawScope) obj2);
                            }
                        };
                        j2 = j;
                        composerStartRestartGroup.updateRememberedValue(function4);
                        objRememberedValue11 = function4;
                    } else {
                        j2 = j;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierGraphicsLayer, (Function1) objRememberedValue11);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDrawWithContent);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2010385364, "C1232@55749L9:HomeScreen.kt#yz3s17");
                    function3 = function2;
                    function3.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 15) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1497226612);
                    ComposerKt.sourceInformation(composerStartRestartGroup, r4);
                    boolean zChanged7 = (i3 == 32) | composerStartRestartGroup.changed(f5);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$117$lambda$116(j2, f5, (Density) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM729size3ABfNKs = SizeKt.m729size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(companion, (Function1) objRememberedValue12), Dp.m6302constructorimpl(64));
                    composerStartRestartGroup.startReplaceGroup(-1497218137);
                    ComposerKt.sourceInformation(composerStartRestartGroup, r4);
                    boolean z4 = i9 == 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable2));
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda25
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$119$lambda$118(animatable, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs, (Function1) objRememberedValue13);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2011228130, "C1263@56825L127,1257@56587L379:HomeScreen.kt#yz3s17");
                    ImageVector add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    long jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    Modifier modifierM729size3ABfNKs2 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(28));
                    composerStartRestartGroup.startReplaceGroup(-1736229627);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreen.kt#9igjgp");
                    boolean z5 = i9 == 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable2));
                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$122$lambda$121$lambda$120(animatable2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs2, (Function1) objRememberedValue14);
                    composer2 = composerStartRestartGroup;
                    IconKt.m1833Iconww6aTOc(add, (String) null, modifierGraphicsLayer3, jM3880getWhite0d7_KjU, composer2, 3120, 0);
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
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    animatable2 = animatable;
                    function3 = function2;
                    composer2 = composerStartRestartGroup;
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Animatable<Float, ?> animatable3 = animatable2;
                    final Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return HomeScreenKt.FlymeAliveRevealOverlay_waEh7B4$lambda$124(animatable3, j, f, f2, z, function5, i, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$109$lambda$108(Animatable animatable, float f, float f2, long j, long j2, long j3, boolean z, DrawScope Canvas) {
                float f3;
                long jM3880getWhite0d7_KjU;
                float f4;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float fCoerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), 0.0f, 1.0f);
                float fLerp = lerp(f, f2, fCoerceIn);
                long jM6854lerpColorjxsXWHM = m6854lerpColorjxsXWHM(j, j2, RangesKt.coerceIn(fCoerceIn / 0.16f, 0.0f, 1.0f));
                if (fCoerceIn < 0.98f) {
                    DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), RangesKt.coerceIn((1.0f - fCoerceIn) * 0.14f, 0.0f, 0.14f), 0.0f, 0.0f, 0.0f, 14, null), (Canvas.mo376toPx0680j_4(Dp.m6302constructorimpl(6)) * (1.0f - (0.4f * fCoerceIn))) + fLerp, j3, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                    float fCoerceIn2 = RangesKt.coerceIn(((float) Math.sin(fCoerceIn * 3.1415927f)) * 0.22f, 0.0f, 0.22f);
                    Color.Companion companion = Color.INSTANCE;
                    if (z) {
                        jM3880getWhite0d7_KjU = companion.m3869getBlack0d7_KjU();
                        f4 = 0.08f;
                    } else {
                        jM3880getWhite0d7_KjU = companion.m3880getWhite0d7_KjU();
                        f4 = 0.2f;
                    }
                    f3 = fLerp;
                    DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU, fCoerceIn2 * f4, 0.0f, 0.0f, 0.0f, 14, null), f3, j3, 0.0f, new Stroke(Canvas.mo376toPx0680j_4(Dp.m6302constructorimpl(1)), 0.0f, 0, 0, null, 30, null), null, 0, LocationRequestCompat.QUALITY_LOW_POWER, null);
                } else {
                    f3 = fLerp;
                }
                DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, jM6854lerpColorjxsXWHM, f3, j3, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$111$lambda$110(Animatable animatable, float f, float f2, float f3, float f4, final long j, GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                float fCoerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), 0.0f, 1.0f);
                final float fLerp = lerp(f, f2, fCoerceIn);
                float fLerp2 = lerp(0.88f, 1.0f, fCoerceIn);
                graphicsLayer.setScaleX(fLerp2);
                graphicsLayer.setScaleY(fLerp2);
                graphicsLayer.mo4036setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(f3, f4));
                graphicsLayer.setAlpha(RangesKt.coerceIn((fCoerceIn - 0.06f) / 0.3f, 0.0f, 1.0f));
                if (fCoerceIn < 1.0f) {
                    graphicsLayer.setClip(true);
                    graphicsLayer.setShape(new Shape() { // from class: com.rhythmbyte.contactbook.ui.screens.HomeScreenKt$FlymeAliveRevealOverlay$1$4$1$1
                        @Override // androidx.compose.ui.graphics.Shape
                        /* JADX INFO: renamed from: createOutline-Pq9zytI */
                        public Outline mo287createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                            Intrinsics.checkNotNullParameter(density, "density");
                            float fM3602getXimpl = Offset.m3602getXimpl(j) - fLerp;
                            float fM3603getYimpl = Offset.m3603getYimpl(j) - fLerp;
                            float fM3602getXimpl2 = Offset.m3602getXimpl(j) + fLerp;
                            float fM3603getYimpl2 = Offset.m3603getYimpl(j);
                            float f5 = fLerp;
                            return new Outline.Rounded(RoundRectKt.m3656RoundRectgG7oq9Y(fM3602getXimpl, fM3603getYimpl, fM3602getXimpl2, fM3603getYimpl2 + f5, CornerRadiusKt.CornerRadius(f5, f5)));
                        }
                    });
                } else {
                    graphicsLayer.setClip(false);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$114$lambda$113(Animatable animatable, float f, float f2, Path path, long j, ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float fCoerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), 0.0f, 1.0f);
                if (fCoerceIn < 1.0f) {
                    float fLerp = lerp(f, f2, fCoerceIn);
                    path.rewind();
                    Path.addOval$default(path, RectKt.m3641Rect3MmeM6k(j, fLerp), null, 2, null);
                    int iM3832getIntersectrtfAjoo = ClipOp.INSTANCE.m3832getIntersectrtfAjoo();
                    DrawContext drawContext = drawWithContent.getDrawContext();
                    long jMo4320getSizeNHjbRc = drawContext.mo4320getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo4322clipPathmtrdDE(path, iM3832getIntersectrtfAjoo);
                        drawWithContent.drawContent();
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo4321setSizeuvyYCjk(jMo4320getSizeNHjbRc);
                    }
                } else {
                    drawWithContent.drawContent();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final IntOffset FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$117$lambda$116(long j, float f, Density offset) {
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                return IntOffset.m6421boximpl(IntOffsetKt.IntOffset(MathKt.roundToInt(Offset.m3602getXimpl(j) - f), MathKt.roundToInt(Offset.m3603getYimpl(j) - f)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$119$lambda$118(Animatable animatable, GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                float fCoerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), 0.0f, 1.0f);
                if (fCoerceIn < 0.18f) {
                    float f = fCoerceIn / 0.18f;
                    graphicsLayer.setAlpha(RangesKt.coerceIn(1.0f - f, 0.0f, 1.0f));
                    float f2 = 1.0f - (f * 0.2f);
                    graphicsLayer.setScaleX(f2);
                    graphicsLayer.setScaleY(f2);
                } else {
                    graphicsLayer.setAlpha(0.0f);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit FlymeAliveRevealOverlay_waEh7B4$lambda$123$lambda$122$lambda$121$lambda$120(Animatable animatable, GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setRotationZ(RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), 0.0f, 1.0f) * 45.0f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ContactBookUiState HomeScreen$lambda$0(State<ContactBookUiState> state) {
                return state.getValue();
            }
        }
