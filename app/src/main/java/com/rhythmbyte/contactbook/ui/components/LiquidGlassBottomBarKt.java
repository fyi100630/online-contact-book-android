package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EditNoteKt;
import androidx.compose.material.icons.outlined.InboxKt;
import androidx.compose.material.icons.outlined.NotificationsKt;
import androidx.compose.material.icons.outlined.SchoolKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.backdrop.Backdrop;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt;
import com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LiquidGlassBottomBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001ac\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"iconVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/rhythmbyte/contactbook/data/model/ItemCategory;", "tabTitle", "", "LiquidGlassBottomBar", "", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "categories", "", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "onAddClick", "Lkotlin/Function0;", "onPlusButtonPositioned", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "isPlusButtonHidden", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/foundation/pager/PagerState;Ljava/util/List;Lcom/kyant/backdrop/Backdrop;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "currentTab", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidGlassBottomBarKt {

    /* JADX INFO: compiled from: LiquidGlassBottomBar.kt */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassBottomBar$lambda$17(PagerState pagerState, List list, Backdrop backdrop, Function0 function0, Function1 function1, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LiquidGlassBottomBar(pagerState, list, backdrop, function0, function1, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ImageVector iconVector(ItemCategory itemCategory) {
        Intrinsics.checkNotNullParameter(itemCategory, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[itemCategory.ordinal()];
        if (i == 1) {
            return EditNoteKt.getEditNote(Icons.Outlined.INSTANCE);
        }
        if (i == 2) {
            return SchoolKt.getSchool(Icons.Outlined.INSTANCE);
        }
        if (i == 3) {
            return InboxKt.getInbox(Icons.Outlined.INSTANCE);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return NotificationsKt.getNotifications(Icons.Outlined.INSTANCE);
    }

    public static final String tabTitle(ItemCategory itemCategory) {
        Intrinsics.checkNotNullParameter(itemCategory, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[itemCategory.ordinal()];
        if (i == 1) {
            return "作業";
        }
        if (i == 2) {
            return "考試";
        }
        if (i == 3) {
            return "繳交";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "提醒";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassBottomBar$lambda$1$lambda$0(Rect it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:106:0x018f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:114:0x020b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x021b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0240  */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:126:0x028f  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02be  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x032f  */
    /* JADX WARN: Code duplicated, block: B:145:0x034d  */
    /* JADX WARN: Code duplicated, block: B:146:0x034f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0358  */
    /* JADX WARN: Code duplicated, block: B:151:0x0360  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:163:0x0418  */
    /* JADX WARN: Code duplicated, block: B:164:0x041b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0422  */
    /* JADX WARN: Code duplicated, block: B:169:0x042a  */
    /* JADX WARN: Code duplicated, block: B:172:0x045a  */
    /* JADX WARN: Code duplicated, block: B:175:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:179:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    public static final void LiquidGlassBottomBar(final PagerState pagerState, final List<? extends ItemCategory> categories, final Backdrop backdrop, final Function0<Unit> onAddClick, Function1<? super Rect, Unit> function1, boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Rect, Unit> function2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Object objRememberedValue;
        final CoroutineScope coroutineScope;
        boolean zIsSystemInDarkTheme;
        long jM3880getWhite0d7_KjU;
        long j;
        long jColor;
        int i8;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        final Function1<? super Rect, Unit> function3;
        Composer composerM3336constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        final MutableIntState mutableIntState;
        int i9;
        boolean z3;
        LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1 liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue;
        long jColor2;
        int i10;
        Object obj;
        float f;
        final boolean z4;
        Object objRememberedValue3;
        boolean z5;
        boolean z6;
        Object objRememberedValue4;
        boolean z7;
        Object objRememberedValue5;
        boolean z8;
        Object objRememberedValue6;
        Object objRememberedValue7;
        final Modifier modifier3;
        final boolean z9;
        final Function1<? super Rect, Unit> function4;
        Object objRememberedValue8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Intrinsics.checkNotNullParameter(onAddClick, "onAddClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(336427084);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidGlassBottomBar)P(6,1!1,4,5)66@2809L2,70@2917L24,71@2966L21,77@3235L2793:LiquidGlassBottomBar.kt#7ivg5k");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(categories) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(backdrop) : composerStartRestartGroup.changedInstance(backdrop) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddClick) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                function2 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceGroup(593286800);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function2 = (Function1) objRememberedValue8;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    if (zIsSystemInDarkTheme) {
                        jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    } else {
                        jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                    }
                    if (zIsSystemInDarkTheme) {
                        j = 4287931320L;
                    } else {
                        j = 4284773515L;
                    }
                    long jColor3 = ColorKt.Color(j);
                    if (zIsSystemInDarkTheme) {
                        jColor = ColorKt.Color(4280166715L);
                    } else {
                        jColor = ColorKt.Color(4279179050L);
                    }
                    float f2 = 64;
                    Modifier modifierM715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f2));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    i8 = i3;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    function3 = function2;
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
                    composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
                    composerStartRestartGroup.startReplaceGroup(-1122455741);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableIntState = (MutableIntState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Integer numValueOf = Integer.valueOf(pagerState.getTargetPage());
                    composerStartRestartGroup.startReplaceGroup(-1122452505);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    i9 = i8 & 14;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z3 || liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                        composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
                    int size = categories.size();
                    if (zIsSystemInDarkTheme) {
                        jColor2 = ColorKt.Color(4280166715L);
                        i10 = 14;
                        obj = null;
                        f = 0.75f;
                    } else {
                        jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                        i10 = 14;
                        obj = null;
                        f = 0.72f;
                    }
                    long jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
                    z4 = z2;
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1122448805);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1122447236);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
                    if (i9 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zChangedInstance | z5;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function0, (Function1) objRememberedValue4, backdrop, size, modifierWeight$default, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor3), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
                    SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
                    Modifier modifierM729size3ABfNKs = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2));
                    composerStartRestartGroup.startReplaceGroup(-1122388481);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    if ((i8 & 458752) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z7 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs, (Function1) objRememberedValue5);
                    composerStartRestartGroup.startReplaceGroup(-1122384586);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    if ((i8 & 57344) == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z8 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer, (Function1) objRememberedValue6);
                    PaddingValues paddingValuesM677PaddingValues0680j_4 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
                    composerStartRestartGroup.startReplaceGroup(-1122392036);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    long j2 = jColor;
                    Modifier modifier4 = modifier2;
                    LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned, (Function0) objRememberedValue7, false, j2, 0L, paddingValuesM677PaddingValues0680j_4, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z9 = z4;
                    function4 = function3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function4 = function2;
                    z9 = z2;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$17(pagerState, categories, backdrop, onAddClick, function4, z9, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            if ((i3 & 599187) == 599186) {
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceGroup(593286800);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = (Function1) objRememberedValue8;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                if (zIsSystemInDarkTheme) {
                    j = 4284773515L;
                } else {
                    j = 4287931320L;
                }
                long jColor4 = ColorKt.Color(j);
                if (zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279179050L);
                } else {
                    jColor = ColorKt.Color(4280166715L);
                }
                float f3 = 64;
                Modifier modifierM715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f3));
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                i8 = i3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs2);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                function3 = function2;
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
                composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
                composerStartRestartGroup.startReplaceGroup(-1122455741);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Integer numValueOf2 = Integer.valueOf(pagerState.getTargetPage());
                composerStartRestartGroup.startReplaceGroup(-1122452505);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                i9 = i8 & 14;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                } else {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
                int size2 = categories.size();
                if (zIsSystemInDarkTheme) {
                    jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                    i10 = 14;
                    obj = null;
                    f = 0.72f;
                } else {
                    jColor2 = ColorKt.Color(4280166715L);
                    i10 = 14;
                    obj = null;
                    f = 0.75f;
                }
                long jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
                z4 = z2;
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1122448805);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function5 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1122447236);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope);
                if (i9 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zChangedInstance2 | z5;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function5, (Function1) objRememberedValue4, backdrop, size2, modifierWeight$default2, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default2), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor4), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
                Modifier modifierM729size3ABfNKs2 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f3));
                composerStartRestartGroup.startReplaceGroup(-1122388481);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z7) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs2, (Function1) objRememberedValue5);
                composerStartRestartGroup.startReplaceGroup(-1122384586);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer2, (Function1) objRememberedValue6);
                PaddingValues paddingValuesM677PaddingValues0680j_5 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
                composerStartRestartGroup.startReplaceGroup(-1122392036);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                long j3 = jColor;
                Modifier modifier5 = modifier2;
                LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned2, (Function0) objRememberedValue7, false, j3, 0L, paddingValuesM677PaddingValues0680j_5, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                z9 = z4;
                function4 = function3;
            } else {
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceGroup(593286800);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = (Function1) objRememberedValue8;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                if (zIsSystemInDarkTheme) {
                    j = 4284773515L;
                } else {
                    j = 4287931320L;
                }
                long jColor5 = ColorKt.Color(j);
                if (zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279179050L);
                } else {
                    jColor = ColorKt.Color(4280166715L);
                }
                float f4 = 64;
                Modifier modifierM715height3ABfNKs3 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f4));
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                i8 = i3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs3);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                function3 = function2;
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
                composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
                composerStartRestartGroup.startReplaceGroup(-1122455741);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Integer numValueOf3 = Integer.valueOf(pagerState.getTargetPage());
                composerStartRestartGroup.startReplaceGroup(-1122452505);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                i9 = i8 & 14;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                } else {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
                int size3 = categories.size();
                if (zIsSystemInDarkTheme) {
                    jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                    i10 = 14;
                    obj = null;
                    f = 0.72f;
                } else {
                    jColor2 = ColorKt.Color(4280166715L);
                    i10 = 14;
                    obj = null;
                    f = 0.75f;
                }
                long jM3842copywmQWz5c$default3 = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
                z4 = z2;
                Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1122448805);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function6 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1122447236);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope);
                if (i9 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zChangedInstance3 | z5;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function6, (Function1) objRememberedValue4, backdrop, size3, modifierWeight$default3, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default3), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor5), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
                Modifier modifierM729size3ABfNKs3 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f4));
                composerStartRestartGroup.startReplaceGroup(-1122388481);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z7) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs3, (Function1) objRememberedValue5);
                composerStartRestartGroup.startReplaceGroup(-1122384586);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer3, (Function1) objRememberedValue6);
                PaddingValues paddingValuesM677PaddingValues0680j_6 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
                composerStartRestartGroup.startReplaceGroup(-1122392036);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                long j4 = jColor;
                Modifier modifier6 = modifier2;
                LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned3, (Function0) objRememberedValue7, false, j4, 0L, paddingValuesM677PaddingValues0680j_6, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                z9 = z4;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$17(pagerState, categories, backdrop, onAddClick, function4, z9, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function2 = function1;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            if ((i3 & 599187) == 599186) {
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceGroup(593286800);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = (Function1) objRememberedValue8;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                if (zIsSystemInDarkTheme) {
                    j = 4284773515L;
                } else {
                    j = 4287931320L;
                }
                long jColor6 = ColorKt.Color(j);
                if (zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279179050L);
                } else {
                    jColor = ColorKt.Color(4280166715L);
                }
                float f5 = 64;
                Modifier modifierM715height3ABfNKs4 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f5));
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                i8 = i3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs4);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                function3 = function2;
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
                composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
                composerStartRestartGroup.startReplaceGroup(-1122455741);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Integer numValueOf4 = Integer.valueOf(pagerState.getTargetPage());
                composerStartRestartGroup.startReplaceGroup(-1122452505);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                i9 = i8 & 14;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                } else {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
                int size4 = categories.size();
                if (zIsSystemInDarkTheme) {
                    jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                    i10 = 14;
                    obj = null;
                    f = 0.72f;
                } else {
                    jColor2 = ColorKt.Color(4280166715L);
                    i10 = 14;
                    obj = null;
                    f = 0.75f;
                }
                long jM3842copywmQWz5c$default4 = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
                z4 = z2;
                Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance4, Modifier.INSTANCE, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1122448805);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function7 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1122447236);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(coroutineScope);
                if (i9 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zChangedInstance4 | z5;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function7, (Function1) objRememberedValue4, backdrop, size4, modifierWeight$default4, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default4), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor6), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
                Modifier modifierM729size3ABfNKs4 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f5));
                composerStartRestartGroup.startReplaceGroup(-1122388481);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z7) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer4 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs4, (Function1) objRememberedValue5);
                composerStartRestartGroup.startReplaceGroup(-1122384586);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned4 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer4, (Function1) objRememberedValue6);
                PaddingValues paddingValuesM677PaddingValues0680j_7 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
                composerStartRestartGroup.startReplaceGroup(-1122392036);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                long j5 = jColor;
                Modifier modifier7 = modifier2;
                LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned4, (Function0) objRememberedValue7, false, j5, 0L, paddingValuesM677PaddingValues0680j_7, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                z9 = z4;
                function4 = function3;
            } else {
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceGroup(593286800);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = (Function1) objRememberedValue8;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (zIsSystemInDarkTheme) {
                    jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
                } else {
                    jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                }
                if (zIsSystemInDarkTheme) {
                    j = 4284773515L;
                } else {
                    j = 4287931320L;
                }
                long jColor7 = ColorKt.Color(j);
                if (zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279179050L);
                } else {
                    jColor = ColorKt.Color(4280166715L);
                }
                float f6 = 64;
                Modifier modifierM715height3ABfNKs5 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f6));
                Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                i8 = i3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs5);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                function3 = function2;
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
                composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
                composerStartRestartGroup.startReplaceGroup(-1122455741);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Integer numValueOf5 = Integer.valueOf(pagerState.getTargetPage());
                composerStartRestartGroup.startReplaceGroup(-1122452505);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                i9 = i8 & 14;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                } else {
                    liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
                int size5 = categories.size();
                if (zIsSystemInDarkTheme) {
                    jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                    i10 = 14;
                    obj = null;
                    f = 0.72f;
                } else {
                    jColor2 = ColorKt.Color(4280166715L);
                    i10 = 14;
                    obj = null;
                    f = 0.75f;
                }
                long jM3842copywmQWz5c$default5 = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
                z4 = z2;
                Modifier modifierWeight$default5 = RowScope.weight$default(rowScopeInstance5, Modifier.INSTANCE, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1122448805);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function8 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1122447236);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(coroutineScope);
                if (i9 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zChangedInstance5 | z5;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function8, (Function1) objRememberedValue4, backdrop, size5, modifierWeight$default5, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default5), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor7), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
                SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
                Modifier modifierM729size3ABfNKs5 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f6));
                composerStartRestartGroup.startReplaceGroup(-1122388481);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z7) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer5 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs5, (Function1) objRememberedValue5);
                composerStartRestartGroup.startReplaceGroup(-1122384586);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                if ((i8 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned5 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer5, (Function1) objRememberedValue6);
                PaddingValues paddingValuesM677PaddingValues0680j_8 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
                composerStartRestartGroup.startReplaceGroup(-1122392036);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                long j6 = jColor;
                Modifier modifier8 = modifier2;
                LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned5, (Function0) objRememberedValue7, false, j6, 0L, paddingValuesM677PaddingValues0680j_8, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                z9 = z4;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$17(pagerState, categories, backdrop, onAddClick, function4, z9, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(modifier2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        if ((i3 & 599187) == 599186) {
            if (i11 != 0) {
                composerStartRestartGroup.startReplaceGroup(593286800);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                function2 = (Function1) objRememberedValue8;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i6 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                objRememberedValue = compositionScopedCoroutineScopeCanceller6;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            if (zIsSystemInDarkTheme) {
                jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
            } else {
                jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
            }
            if (zIsSystemInDarkTheme) {
                j = 4284773515L;
            } else {
                j = 4287931320L;
            }
            long jColor8 = ColorKt.Color(j);
            if (zIsSystemInDarkTheme) {
                jColor = ColorKt.Color(4279179050L);
            } else {
                jColor = ColorKt.Color(4280166715L);
            }
            float f7 = 64;
            Modifier modifierM715height3ABfNKs6 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f7));
            Alignment.Vertical centerVertically6 = Alignment.INSTANCE.getCenterVertically();
            i8 = i3;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically6, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs6);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            function3 = function2;
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
            composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl.getInserting()) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
            composerStartRestartGroup.startReplaceGroup(-1122455741);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableIntState = (MutableIntState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf6 = Integer.valueOf(pagerState.getTargetPage());
            composerStartRestartGroup.startReplaceGroup(-1122452505);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            i9 = i8 & 14;
            if (i9 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3) {
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
            } else {
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
            int size6 = categories.size();
            if (zIsSystemInDarkTheme) {
                jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                i10 = 14;
                obj = null;
                f = 0.72f;
            } else {
                jColor2 = ColorKt.Color(4280166715L);
                i10 = 14;
                obj = null;
                f = 0.75f;
            }
            long jM3842copywmQWz5c$default6 = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
            z4 = z2;
            Modifier modifierWeight$default6 = RowScope.weight$default(rowScopeInstance6, Modifier.INSTANCE, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1122448805);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function9 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1122447236);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(coroutineScope);
            if (i9 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zChangedInstance6 | z5;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6) {
                objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function9, (Function1) objRememberedValue4, backdrop, size6, modifierWeight$default6, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default6), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor8), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
            Modifier modifierM729size3ABfNKs6 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f7));
            composerStartRestartGroup.startReplaceGroup(-1122388481);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            if ((i8 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z7) {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer6 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs6, (Function1) objRememberedValue5);
            composerStartRestartGroup.startReplaceGroup(-1122384586);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            if ((i8 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z8) {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned6 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer6, (Function1) objRememberedValue6);
            PaddingValues paddingValuesM677PaddingValues0680j_9 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
            composerStartRestartGroup.startReplaceGroup(-1122392036);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            long j7 = jColor;
            Modifier modifier9 = modifier2;
            LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned6, (Function0) objRememberedValue7, false, j7, 0L, paddingValuesM677PaddingValues0680j_9, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
            composerStartRestartGroup = composerStartRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier9;
            z9 = z4;
            function4 = function3;
        } else {
            if (i11 != 0) {
                composerStartRestartGroup.startReplaceGroup(593286800);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$1$lambda$0((Rect) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                function2 = (Function1) objRememberedValue8;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i6 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336427084, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar (LiquidGlassBottomBar.kt:69)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                objRememberedValue = compositionScopedCoroutineScopeCanceller7;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            if (zIsSystemInDarkTheme) {
                jM3880getWhite0d7_KjU = ColorKt.Color(4279179050L);
            } else {
                jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
            }
            if (zIsSystemInDarkTheme) {
                j = 4284773515L;
            } else {
                j = 4287931320L;
            }
            long jColor9 = ColorKt.Color(j);
            if (zIsSystemInDarkTheme) {
                jColor = ColorKt.Color(4279179050L);
            } else {
                jColor = ColorKt.Color(4280166715L);
            }
            float f8 = 64;
            Modifier modifierM715height3ABfNKs7 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6302constructorimpl(f8));
            Alignment.Vertical centerVertically7 = Alignment.INSTANCE.getCenterVertically();
            i8 = i3;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically7, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715height3ABfNKs7);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            function3 = function2;
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
            composerM3336constructorimpl = Updater.m3336constructorimpl(composerStartRestartGroup);
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl.getInserting()) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -436327693, "C83@3413L54,84@3514L58,84@3476L96,89@3631L14,90@3675L175,101@4125L1085,88@3582L1628,131@5220L40,140@5514L82,143@5635L105,137@5405L15,133@5270L752:LiquidGlassBottomBar.kt#7ivg5k");
            composerStartRestartGroup.startReplaceGroup(-1122455741);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(pagerState.getCurrentPage());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableIntState = (MutableIntState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf7 = Integer.valueOf(pagerState.getTargetPage());
            composerStartRestartGroup.startReplaceGroup(-1122452505);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            i9 = i8 & 14;
            if (i9 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3) {
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
            } else {
                liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue = new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1(pagerState, mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGlassBottomBarKt$LiquidGlassBottomBar$2$1$1RememberedValue, composerStartRestartGroup, 0);
            int size7 = categories.size();
            if (zIsSystemInDarkTheme) {
                jColor2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                i10 = 14;
                obj = null;
                f = 0.72f;
            } else {
                jColor2 = ColorKt.Color(4280166715L);
                i10 = 14;
                obj = null;
                f = 0.75f;
            }
            long jM3842copywmQWz5c$default7 = Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, i10, obj);
            z4 = z2;
            Modifier modifierWeight$default7 = RowScope.weight$default(rowScopeInstance7, Modifier.INSTANCE, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1122448805);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function10 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1122447236);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(coroutineScope);
            if (i9 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zChangedInstance7 | z5;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6) {
                objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(coroutineScope, mutableIntState, pagerState, ((Integer) obj2).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            LiquidBottomTabsKt.m6781LiquidBottomTabs42sRYA(function10, (Function1) objRememberedValue4, backdrop, size7, modifierWeight$default7, false, Color.m3833boximpl(jM3880getWhite0d7_KjU), Color.m3833boximpl(jM3842copywmQWz5c$default7), ComposableLambdaKt.rememberComposableLambda(1214761874, true, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(categories, coroutineScope, pagerState, mutableIntState, jColor9), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 896) | 100663302, 32);
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(10)), composerStartRestartGroup, 6);
            Modifier modifierM729size3ABfNKs7 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f8));
            composerStartRestartGroup.startReplaceGroup(-1122388481);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            if ((i8 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z7) {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(z4, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer7 = GraphicsLayerModifierKt.graphicsLayer(modifierM729size3ABfNKs7, (Function1) objRememberedValue5);
            composerStartRestartGroup.startReplaceGroup(-1122384586);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            if ((i8 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z8) {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(function3, (LayoutCoordinates) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned7 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer7, (Function1) objRememberedValue6);
            PaddingValues paddingValuesM677PaddingValues0680j_10 = PaddingKt.m677PaddingValues0680j_4(Dp.m6302constructorimpl(0));
            composerStartRestartGroup.startReplaceGroup(-1122392036);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            long j8 = jColor;
            Modifier modifier10 = modifier2;
            LiquidButtonKt.m6762LiquidButtonePBljHA(onAddClick, backdrop, modifierOnGloballyPositioned7, (Function0) objRememberedValue7, false, j8, 0L, paddingValuesM677PaddingValues0680j_10, 0.0f, 0.0f, null, ComposableSingletons$LiquidGlassBottomBarKt.INSTANCE.m6732getLambda1$app_release(), composerStartRestartGroup, ((i8 >> 9) & 14) | 12585984 | ((i8 >> 3) & 112), 48, 1872);
            composerStartRestartGroup = composerStartRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            z9 = z4;
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$17(pagerState, categories, backdrop, onAddClick, function4, z9, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LiquidGlassBottomBar$lambda$16$lambda$3(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassBottomBar$lambda$16$lambda$9$lambda$8(CoroutineScope coroutineScope, MutableIntState mutableIntState, PagerState pagerState, int i) {
        mutableIntState.setIntValue(i);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$3$1$1(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape LiquidGlassBottomBar$lambda$16$lambda$15$lambda$14() {
        return RoundedCornerShapeKt.getCircleShape();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassBottomBar$lambda$16$lambda$11$lambda$10(boolean z, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(z ? 0.0f : 1.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassBottomBar$lambda$16$lambda$13$lambda$12(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        function1.invoke(LayoutCoordinatesKt.boundsInRoot(coordinates));
        return Unit.INSTANCE;
    }
}
