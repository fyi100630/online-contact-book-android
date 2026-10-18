package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.shapes.Capsule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiquidBottomTab.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\t\u001a\u00020\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016\"\u001d\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0005¨\u0006\u0017"}, d2 = {"LocalLiquidBottomTabScale", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function0;", "", "getLocalLiquidBottomTabScale", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalLiquidBottomTabInteractive", "", "getLocalLiquidBottomTabInteractive", "LiquidBottomTab", "", "Landroidx/compose/foundation/layout/RowScope;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "selected", "enabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/layout/RowScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidBottomTabKt {
    private static final ProvidableCompositionLocal<Function0<Float>> LocalLiquidBottomTabScale = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiquidBottomTabKt.LocalLiquidBottomTabScale$lambda$1();
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalLiquidBottomTabInteractive = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LiquidBottomTabKt.LocalLiquidBottomTabInteractive$lambda$2());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidBottomTab$lambda$7(RowScope rowScope, Function0 function0, Modifier modifier, boolean z, boolean z2, Function3 function3, int i, int i2, Composer composer, int i3) {
        LiquidBottomTab(rowScope, function0, modifier, z, z2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalLiquidBottomTabInteractive$lambda$2() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 LocalLiquidBottomTabScale$lambda$1() {
        return new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(LiquidBottomTabKt.LocalLiquidBottomTabScale$lambda$1$lambda$0());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LocalLiquidBottomTabScale$lambda$1$lambda$0() {
        return 1.0f;
    }

    public static final ProvidableCompositionLocal<Function0<Float>> getLocalLiquidBottomTabScale() {
        return LocalLiquidBottomTabScale;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalLiquidBottomTabInteractive() {
        return LocalLiquidBottomTabInteractive;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01de  */
    /* JADX WARN: Code duplicated, block: B:110:0x0245  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x0255  */
    /* JADX WARN: Code duplicated, block: B:117:0x027a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0288  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0139  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    /* JADX WARN: Code duplicated, block: B:96:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    public static final void LiquidBottomTab(final RowScope rowScope, final Function0<Unit> onClick, Modifier modifier, boolean z, boolean z2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        Modifier modifier3;
        boolean z5;
        Function0 function0;
        Object objConsume;
        boolean z6;
        Modifier modifierClip;
        Function0 function1;
        Modifier modifier4;
        final boolean z7;
        Object obj;
        int i10;
        Modifier.Companion companionM270clickableO2vRcR0$default;
        int i11;
        Object objRememberedValue;
        final Function0 function2;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3336constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z8;
        final boolean z9;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-596250427);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidBottomTab)P(3,2,4,1)34@1239L7,35@1303L7,52@1784L56,57@1921L101,37@1327L875:LiquidBottomTab.kt#9hgvmo");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        if (composerStartRestartGroup.changed(z4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((74899 & i9) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i12 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                        }
                        ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal = LocalLiquidBottomTabScale;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(providableCompositionLocal);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        function0 = (Function0) objConsume2;
                        ProvidableCompositionLocal<Boolean> providableCompositionLocal2 = LocalLiquidBottomTabInteractive;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        objConsume = composerStartRestartGroup.consume(providableCompositionLocal2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (((Boolean) objConsume).booleanValue() || !z5) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                        if (z6) {
                            obj = null;
                            z7 = z3;
                            function1 = function0;
                            modifier4 = modifierClip;
                            i10 = 1;
                            companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                        } else {
                            function1 = function0;
                            modifier4 = modifierClip;
                            z7 = z3;
                            obj = null;
                            i10 = 1;
                            companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                        }
                        Modifier modifierThen = modifier4.then(companionM270clickableO2vRcR0$default);
                        composerStartRestartGroup.startReplaceGroup(-279103592);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                        if ((i9 & 7168) == 2048) {
                            i11 = i10;
                        } else {
                            i11 = 0;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i11 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceGroup(-279099163);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                        function2 = function1;
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default, (Function1) objRememberedValue2);
                        Arrangement.Vertical verticalM566spacedByD5KLDUw = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        int i13 = ((i9 >> 6) & 7168) | 432;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw, centerHorizontally, composerStartRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i13 >> 6) & 112) | 6));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z8 = z7;
                        z9 = z5;
                        modifier5 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        z8 = z3;
                        z9 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                z4 = z2;
                if ((i2 & 16) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((74899 & i9) == 74898) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                    }
                    ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal3 = LocalLiquidBottomTabScale;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume3 = composerStartRestartGroup.consume(providableCompositionLocal3);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function0 = (Function0) objConsume3;
                    ProvidableCompositionLocal<Boolean> providableCompositionLocal4 = LocalLiquidBottomTabInteractive;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(providableCompositionLocal4);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (((Boolean) objConsume).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                    if (z6) {
                        obj = null;
                        z7 = z3;
                        function1 = function0;
                        modifier4 = modifierClip;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                    } else {
                        function1 = function0;
                        modifier4 = modifierClip;
                        z7 = z3;
                        obj = null;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                    }
                    Modifier modifierThen2 = modifier4.then(companionM270clickableO2vRcR0$default);
                    composerStartRestartGroup.startReplaceGroup(-279103592);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    if ((i9 & 7168) == 2048) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 == 0) {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen2, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-279099163);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    function2 = function1;
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default2, (Function1) objRememberedValue2);
                    Arrangement.Vertical verticalM566spacedByD5KLDUw2 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    int i14 = ((i9 >> 6) & 7168) | 432;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw2, centerHorizontally2, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3336constructorimpl.getInserting()) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z5;
                    modifier5 = modifier3;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                    }
                    ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal5 = LocalLiquidBottomTabScale;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume4 = composerStartRestartGroup.consume(providableCompositionLocal5);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function0 = (Function0) objConsume4;
                    ProvidableCompositionLocal<Boolean> providableCompositionLocal6 = LocalLiquidBottomTabInteractive;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(providableCompositionLocal6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (((Boolean) objConsume).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                    if (z6) {
                        obj = null;
                        z7 = z3;
                        function1 = function0;
                        modifier4 = modifierClip;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                    } else {
                        function1 = function0;
                        modifier4 = modifierClip;
                        z7 = z3;
                        obj = null;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                    }
                    Modifier modifierThen3 = modifier4.then(companionM270clickableO2vRcR0$default);
                    composerStartRestartGroup.startReplaceGroup(-279103592);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    if ((i9 & 7168) == 2048) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 == 0) {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default3 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen3, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-279099163);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    function2 = function1;
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default3, (Function1) objRememberedValue2);
                    Arrangement.Vertical verticalM566spacedByD5KLDUw3 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                    int i15 = ((i9 >> 6) & 7168) | 432;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw3, centerHorizontally3, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer3);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3336constructorimpl.getInserting()) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i15 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z5;
                    modifier5 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((74899 & i9) == 74898) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                    }
                    ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal7 = LocalLiquidBottomTabScale;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume5 = composerStartRestartGroup.consume(providableCompositionLocal7);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function0 = (Function0) objConsume5;
                    ProvidableCompositionLocal<Boolean> providableCompositionLocal8 = LocalLiquidBottomTabInteractive;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(providableCompositionLocal8);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (((Boolean) objConsume).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                    if (z6) {
                        obj = null;
                        z7 = z3;
                        function1 = function0;
                        modifier4 = modifierClip;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                    } else {
                        function1 = function0;
                        modifier4 = modifierClip;
                        z7 = z3;
                        obj = null;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                    }
                    Modifier modifierThen4 = modifier4.then(companionM270clickableO2vRcR0$default);
                    composerStartRestartGroup.startReplaceGroup(-279103592);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    if ((i9 & 7168) == 2048) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 == 0) {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default4 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen4, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-279099163);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    function2 = function1;
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer4 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default4, (Function1) objRememberedValue2);
                    Arrangement.Vertical verticalM566spacedByD5KLDUw4 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                    int i16 = ((i9 >> 6) & 7168) | 432;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw4, centerHorizontally4, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer4);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3336constructorimpl.getInserting()) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i16 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z5;
                    modifier5 = modifier3;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                    }
                    ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal9 = LocalLiquidBottomTabScale;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume6 = composerStartRestartGroup.consume(providableCompositionLocal9);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function0 = (Function0) objConsume6;
                    ProvidableCompositionLocal<Boolean> providableCompositionLocal10 = LocalLiquidBottomTabInteractive;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(providableCompositionLocal10);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (((Boolean) objConsume).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                    if (z6) {
                        obj = null;
                        z7 = z3;
                        function1 = function0;
                        modifier4 = modifierClip;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                    } else {
                        function1 = function0;
                        modifier4 = modifierClip;
                        z7 = z3;
                        obj = null;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                    }
                    Modifier modifierThen5 = modifier4.then(companionM270clickableO2vRcR0$default);
                    composerStartRestartGroup.startReplaceGroup(-279103592);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    if ((i9 & 7168) == 2048) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 == 0) {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default5 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen5, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-279099163);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    function2 = function1;
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer5 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default5, (Function1) objRememberedValue2);
                    Arrangement.Vertical verticalM566spacedByD5KLDUw5 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally5 = Alignment.INSTANCE.getCenterHorizontally();
                    int i17 = ((i9 >> 6) & 7168) | 432;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw5, centerHorizontally5, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer5);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3336constructorimpl.getInserting()) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z5;
                    modifier5 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            if ((i2 & 16) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            i9 = i3;
            if ((74899 & i9) == 74898) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                }
                ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal11 = LocalLiquidBottomTabScale;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume7 = composerStartRestartGroup.consume(providableCompositionLocal11);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function0 = (Function0) objConsume7;
                ProvidableCompositionLocal<Boolean> providableCompositionLocal12 = LocalLiquidBottomTabInteractive;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(providableCompositionLocal12);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (((Boolean) objConsume).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                if (z6) {
                    obj = null;
                    z7 = z3;
                    function1 = function0;
                    modifier4 = modifierClip;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                } else {
                    function1 = function0;
                    modifier4 = modifierClip;
                    z7 = z3;
                    obj = null;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                }
                Modifier modifierThen6 = modifier4.then(companionM270clickableO2vRcR0$default);
                composerStartRestartGroup.startReplaceGroup(-279103592);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                if ((i9 & 7168) == 2048) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i11 == 0) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWeight$default6 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen6, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-279099163);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                function2 = function1;
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer6 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default6, (Function1) objRememberedValue2);
                Arrangement.Vertical verticalM566spacedByD5KLDUw6 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                Alignment.Horizontal centerHorizontally6 = Alignment.INSTANCE.getCenterHorizontally();
                int i18 = ((i9 >> 6) & 7168) | 432;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw6, centerHorizontally6, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer6);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i18 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                z9 = z5;
                modifier5 = modifier3;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                }
                ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal13 = LocalLiquidBottomTabScale;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume8 = composerStartRestartGroup.consume(providableCompositionLocal13);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function0 = (Function0) objConsume8;
                ProvidableCompositionLocal<Boolean> providableCompositionLocal14 = LocalLiquidBottomTabInteractive;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(providableCompositionLocal14);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (((Boolean) objConsume).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                if (z6) {
                    obj = null;
                    z7 = z3;
                    function1 = function0;
                    modifier4 = modifierClip;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                } else {
                    function1 = function0;
                    modifier4 = modifierClip;
                    z7 = z3;
                    obj = null;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                }
                Modifier modifierThen7 = modifier4.then(companionM270clickableO2vRcR0$default);
                composerStartRestartGroup.startReplaceGroup(-279103592);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                if ((i9 & 7168) == 2048) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i11 == 0) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWeight$default7 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen7, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-279099163);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                function2 = function1;
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer7 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default7, (Function1) objRememberedValue2);
                Arrangement.Vertical verticalM566spacedByD5KLDUw7 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                Alignment.Horizontal centerHorizontally7 = Alignment.INSTANCE.getCenterHorizontally();
                int i19 = ((i9 >> 6) & 7168) | 432;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw7, centerHorizontally7, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer7);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i19 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                z9 = z5;
                modifier5 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((74899 & i9) == 74898) {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                    }
                    ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal15 = LocalLiquidBottomTabScale;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume9 = composerStartRestartGroup.consume(providableCompositionLocal15);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function0 = (Function0) objConsume9;
                    ProvidableCompositionLocal<Boolean> providableCompositionLocal16 = LocalLiquidBottomTabInteractive;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(providableCompositionLocal16);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (((Boolean) objConsume).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                    if (z6) {
                        obj = null;
                        z7 = z3;
                        function1 = function0;
                        modifier4 = modifierClip;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                    } else {
                        function1 = function0;
                        modifier4 = modifierClip;
                        z7 = z3;
                        obj = null;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                    }
                    Modifier modifierThen8 = modifier4.then(companionM270clickableO2vRcR0$default);
                    composerStartRestartGroup.startReplaceGroup(-279103592);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    if ((i9 & 7168) == 2048) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 == 0) {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default8 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen8, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-279099163);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    function2 = function1;
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer8 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default8, (Function1) objRememberedValue2);
                    Arrangement.Vertical verticalM566spacedByD5KLDUw8 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally8 = Alignment.INSTANCE.getCenterHorizontally();
                    int i110 = ((i9 >> 6) & 7168) | 432;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw8, centerHorizontally8, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer8);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3336constructorimpl.getInserting()) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i110 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z5;
                    modifier5 = modifier3;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                    }
                    ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal17 = LocalLiquidBottomTabScale;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume10 = composerStartRestartGroup.consume(providableCompositionLocal17);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function0 = (Function0) objConsume10;
                    ProvidableCompositionLocal<Boolean> providableCompositionLocal18 = LocalLiquidBottomTabInteractive;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(providableCompositionLocal18);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (((Boolean) objConsume).booleanValue()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                    if (z6) {
                        obj = null;
                        z7 = z3;
                        function1 = function0;
                        modifier4 = modifierClip;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                    } else {
                        function1 = function0;
                        modifier4 = modifierClip;
                        z7 = z3;
                        obj = null;
                        i10 = 1;
                        companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                    }
                    Modifier modifierThen9 = modifier4.then(companionM270clickableO2vRcR0$default);
                    composerStartRestartGroup.startReplaceGroup(-279103592);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    if ((i9 & 7168) == 2048) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 == 0) {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default9 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen9, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-279099163);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                    function2 = function1;
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer9 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default9, (Function1) objRememberedValue2);
                    Arrangement.Vertical verticalM566spacedByD5KLDUw9 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally9 = Alignment.INSTANCE.getCenterHorizontally();
                    int i111 = ((i9 >> 6) & 7168) | 432;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw9, centerHorizontally9, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer9);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3336constructorimpl.getInserting()) {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i111 >> 6) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z7;
                    z9 = z5;
                    modifier5 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            if ((i2 & 16) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            i9 = i3;
            if ((74899 & i9) == 74898) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                }
                ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal19 = LocalLiquidBottomTabScale;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume11 = composerStartRestartGroup.consume(providableCompositionLocal19);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function0 = (Function0) objConsume11;
                ProvidableCompositionLocal<Boolean> providableCompositionLocal110 = LocalLiquidBottomTabInteractive;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(providableCompositionLocal110);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (((Boolean) objConsume).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                if (z6) {
                    obj = null;
                    z7 = z3;
                    function1 = function0;
                    modifier4 = modifierClip;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                } else {
                    function1 = function0;
                    modifier4 = modifierClip;
                    z7 = z3;
                    obj = null;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                }
                Modifier modifierThen10 = modifier4.then(companionM270clickableO2vRcR0$default);
                composerStartRestartGroup.startReplaceGroup(-279103592);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                if ((i9 & 7168) == 2048) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i11 == 0) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWeight$default10 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen10, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-279099163);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                function2 = function1;
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer10 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default10, (Function1) objRememberedValue2);
                Arrangement.Vertical verticalM566spacedByD5KLDUw10 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                Alignment.Horizontal centerHorizontally10 = Alignment.INSTANCE.getCenterHorizontally();
                int i112 = ((i9 >> 6) & 7168) | 432;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw10, centerHorizontally10, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer10);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy10, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i112 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                z9 = z5;
                modifier5 = modifier3;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                }
                ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal111 = LocalLiquidBottomTabScale;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume12 = composerStartRestartGroup.consume(providableCompositionLocal111);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function0 = (Function0) objConsume12;
                ProvidableCompositionLocal<Boolean> providableCompositionLocal112 = LocalLiquidBottomTabInteractive;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(providableCompositionLocal112);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (((Boolean) objConsume).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                if (z6) {
                    obj = null;
                    z7 = z3;
                    function1 = function0;
                    modifier4 = modifierClip;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                } else {
                    function1 = function0;
                    modifier4 = modifierClip;
                    z7 = z3;
                    obj = null;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                }
                Modifier modifierThen11 = modifier4.then(companionM270clickableO2vRcR0$default);
                composerStartRestartGroup.startReplaceGroup(-279103592);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                if ((i9 & 7168) == 2048) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i11 == 0) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWeight$default11 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen11, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-279099163);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                function2 = function1;
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer11 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default11, (Function1) objRememberedValue2);
                Arrangement.Vertical verticalM566spacedByD5KLDUw11 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                Alignment.Horizontal centerHorizontally11 = Alignment.INSTANCE.getCenterHorizontally();
                int i113 = ((i9 >> 6) & 7168) | 432;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw11, centerHorizontally11, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer11);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy11, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i113 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                z9 = z5;
                modifier5 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            i9 = i3;
            if ((74899 & i9) == 74898) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                }
                ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal113 = LocalLiquidBottomTabScale;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume13 = composerStartRestartGroup.consume(providableCompositionLocal113);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function0 = (Function0) objConsume13;
                ProvidableCompositionLocal<Boolean> providableCompositionLocal114 = LocalLiquidBottomTabInteractive;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(providableCompositionLocal114);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (((Boolean) objConsume).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                if (z6) {
                    obj = null;
                    z7 = z3;
                    function1 = function0;
                    modifier4 = modifierClip;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                } else {
                    function1 = function0;
                    modifier4 = modifierClip;
                    z7 = z3;
                    obj = null;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                }
                Modifier modifierThen12 = modifier4.then(companionM270clickableO2vRcR0$default);
                composerStartRestartGroup.startReplaceGroup(-279103592);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                if ((i9 & 7168) == 2048) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i11 == 0) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWeight$default12 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen12, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-279099163);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                function2 = function1;
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer12 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default12, (Function1) objRememberedValue2);
                Arrangement.Vertical verticalM566spacedByD5KLDUw12 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                Alignment.Horizontal centerHorizontally12 = Alignment.INSTANCE.getCenterHorizontally();
                int i114 = ((i9 >> 6) & 7168) | 432;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw12, centerHorizontally12, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer12);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy12, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i114 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                z9 = z5;
                modifier5 = modifier3;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
                }
                ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal115 = LocalLiquidBottomTabScale;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume14 = composerStartRestartGroup.consume(providableCompositionLocal115);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function0 = (Function0) objConsume14;
                ProvidableCompositionLocal<Boolean> providableCompositionLocal116 = LocalLiquidBottomTabInteractive;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(providableCompositionLocal116);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (((Boolean) objConsume).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
                if (z6) {
                    obj = null;
                    z7 = z3;
                    function1 = function0;
                    modifier4 = modifierClip;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
                } else {
                    function1 = function0;
                    modifier4 = modifierClip;
                    z7 = z3;
                    obj = null;
                    i10 = 1;
                    companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
                }
                Modifier modifierThen13 = modifier4.then(companionM270clickableO2vRcR0$default);
                composerStartRestartGroup.startReplaceGroup(-279103592);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                if ((i9 & 7168) == 2048) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i11 == 0) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierWeight$default13 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen13, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-279099163);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
                function2 = function1;
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer13 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default13, (Function1) objRememberedValue2);
                Arrangement.Vertical verticalM566spacedByD5KLDUw13 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
                Alignment.Horizontal centerHorizontally13 = Alignment.INSTANCE.getCenterHorizontally();
                int i115 = ((i9 >> 6) & 7168) | 432;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw13, centerHorizontally13, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer13);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy13, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3336constructorimpl.getInserting()) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier13, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i115 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                z9 = z5;
                modifier5 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        z4 = z2;
        if ((i2 & 16) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        i9 = i3;
        if ((74899 & i9) == 74898) {
            if (i12 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
            }
            ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal117 = LocalLiquidBottomTabScale;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume15 = composerStartRestartGroup.consume(providableCompositionLocal117);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            function0 = (Function0) objConsume15;
            ProvidableCompositionLocal<Boolean> providableCompositionLocal118 = LocalLiquidBottomTabInteractive;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            objConsume = composerStartRestartGroup.consume(providableCompositionLocal118);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (((Boolean) objConsume).booleanValue()) {
                z6 = false;
            } else {
                z6 = false;
            }
            modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
            if (z6) {
                obj = null;
                z7 = z3;
                function1 = function0;
                modifier4 = modifierClip;
                i10 = 1;
                companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
            } else {
                function1 = function0;
                modifier4 = modifierClip;
                z7 = z3;
                obj = null;
                i10 = 1;
                companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
            }
            Modifier modifierThen14 = modifier4.then(companionM270clickableO2vRcR0$default);
            composerStartRestartGroup.startReplaceGroup(-279103592);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
            if ((i9 & 7168) == 2048) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 == 0) {
                objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierWeight$default14 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen14, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-279099163);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
            function2 = function1;
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer14 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default14, (Function1) objRememberedValue2);
            Arrangement.Vertical verticalM566spacedByD5KLDUw14 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
            Alignment.Horizontal centerHorizontally14 = Alignment.INSTANCE.getCenterHorizontally();
            int i116 = ((i9 >> 6) & 7168) | 432;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw14, centerHorizontally14, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer14);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy14, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3336constructorimpl.getInserting()) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier14, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i116 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z8 = z7;
            z9 = z5;
            modifier5 = modifier3;
        } else {
            if (i12 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596250427, i9, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTab (LiquidBottomTab.kt:33)");
            }
            ProvidableCompositionLocal<Function0<Float>> providableCompositionLocal119 = LocalLiquidBottomTabScale;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume16 = composerStartRestartGroup.consume(providableCompositionLocal119);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            function0 = (Function0) objConsume16;
            ProvidableCompositionLocal<Boolean> providableCompositionLocal1110 = LocalLiquidBottomTabInteractive;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            objConsume = composerStartRestartGroup.consume(providableCompositionLocal1110);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (((Boolean) objConsume).booleanValue()) {
                z6 = false;
            } else {
                z6 = false;
            }
            modifierClip = ClipKt.clip(modifier3, new Capsule(null, 1, null));
            if (z6) {
                obj = null;
                z7 = z3;
                function1 = function0;
                modifier4 = modifierClip;
                i10 = 1;
                companionM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, Role.m5590boximpl(Role.INSTANCE.m5603getTabo7Vup1c()), onClick, 12, null);
            } else {
                function1 = function0;
                modifier4 = modifierClip;
                z7 = z3;
                obj = null;
                i10 = 1;
                companionM270clickableO2vRcR0$default = Modifier.INSTANCE;
            }
            Modifier modifierThen15 = modifier4.then(companionM270clickableO2vRcR0$default);
            composerStartRestartGroup.startReplaceGroup(-279103592);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
            if ((i9 & 7168) == 2048) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 == 0) {
                objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$4$lambda$3(z7, (SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierWeight$default15 = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(SemanticsModifierKt.semantics$default(modifierThen15, false, (Function1) objRememberedValue, i10, obj), 0.0f, i10, obj), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-279099163);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidBottomTab.kt#9igjgp");
            function2 = function1;
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LiquidBottomTabKt.LiquidBottomTab$lambda$6$lambda$5(function2, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer15 = GraphicsLayerModifierKt.graphicsLayer(modifierWeight$default15, (Function1) objRememberedValue2);
            Arrangement.Vertical verticalM566spacedByD5KLDUw15 = Arrangement.INSTANCE.m566spacedByD5KLDUw(Dp.m6302constructorimpl(2.0f), Alignment.INSTANCE.getCenterVertically());
            Alignment.Horizontal centerHorizontally15 = Alignment.INSTANCE.getCenterHorizontally();
            int i117 = ((i9 >> 6) & 7168) | 432;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(verticalM566spacedByD5KLDUw15, centerHorizontally15, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer15);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyColumnMeasurePolicy15, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap15, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3336constructorimpl.getInserting()) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier15, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i117 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z8 = z7;
            z9 = z5;
            modifier5 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LiquidBottomTabKt.LiquidBottomTab$lambda$7(rowScope, onClick, modifier5, z8, z9, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidBottomTab$lambda$4$lambda$3(boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidBottomTab$lambda$6$lambda$5(Function0 function0, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        float fFloatValue = ((Number) function0.invoke()).floatValue();
        graphicsLayer.setScaleX(fFloatValue);
        graphicsLayer.setScaleY(fFloatValue);
        return Unit.INSTANCE;
    }
}
