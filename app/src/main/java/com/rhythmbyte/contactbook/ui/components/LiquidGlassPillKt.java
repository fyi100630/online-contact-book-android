package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiquidGlassPill.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LiquidGlassPill", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "onClick", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "LiquidGlassPill-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidGlassPillKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassPill_DTcfvLk$lambda$1(Modifier modifier, long j, long j2, Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        m6754LiquidGlassPillDTcfvLk(modifier, j, j2, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02af  */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x030a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0319  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[PHI: r6 r9 r11 r17
      0x00d7: PHI (r6v17 int) = (r6v14 int), (r6v18 int) binds: [B:83:0x0121, B:71:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r9v12 long) = (r9v3 long), (r9v2 long) binds: [B:83:0x0121, B:71:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r11v8 long) = (r11v2 long), (r11v9 long) binds: [B:83:0x0121, B:71:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r17v4 androidx.compose.ui.Modifier) = (r17v0 androidx.compose.ui.Modifier), (r17v5 androidx.compose.ui.Modifier) binds: [B:83:0x0121, B:71:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0136  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0286  */
    /* JADX WARN: Code duplicated, block: B:97:0x028a  */
    /* JADX INFO: renamed from: LiquidGlassPill-DTcfvLk, reason: not valid java name */
    public static final void m6754LiquidGlassPillDTcfvLk(Modifier modifier, long j, long j2, Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM3842copywmQWz5c$default;
        long j3;
        int i4;
        Function0<Unit> function1;
        int i5;
        int i6;
        Modifier.Companion companion;
        long jM3842copywmQWz5c$default2;
        Modifier modifier3;
        Modifier.Companion companionM272clickableXHw0xAI$default;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3336constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final long j4;
        final long j5;
        final Function0<Unit> function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(347943704);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidGlassPill)P(3,0:c#ui.graphics.Color,1:c#ui.graphics.Color,4)31@1141L1080:LiquidGlassPill.kt#7ivg5k");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jM3842copywmQWz5c$default = j;
                int i8 = composerStartRestartGroup.changed(jM3842copywmQWz5c$default) ? 32 : 16;
                i3 |= i8;
            } else {
                jM3842copywmQWz5c$default = j;
            }
            i3 |= i8;
        } else {
            jM3842copywmQWz5c$default = j;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                j3 = j2;
                i3 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -113;
                        }
                        if (i9 != 0) {
                            jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM3842copywmQWz5c$default2 = j3;
                        }
                        modifier3 = companion;
                        if (i4 != 0) {
                            function1 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
                        }
                        if (function1 != null) {
                            companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
                        } else {
                            companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
                        }
                        long j6 = jM3842copywmQWz5c$default;
                        long j7 = jM3842copywmQWz5c$default2;
                        Modifier modifierM685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j6, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j7, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN4);
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
                        Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j6;
                        j5 = j7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        modifier3 = modifier2;
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    function1 = function1;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
                    }
                    if (function1 != null) {
                        companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
                    } else {
                        companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
                    }
                    long j8 = jM3842copywmQWz5c$default;
                    long j9 = jM3842copywmQWz5c$default2;
                    Modifier modifierM685paddingVpY3zN5 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j8, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j9, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN5);
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
                    Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j8;
                    j5 = j9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j4 = jM3842copywmQWz5c$default;
                    j5 = j3;
                }
                function2 = function1;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassPillKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidGlassPillKt.LiquidGlassPill_DTcfvLk$lambda$1(modifier4, j4, j5, function2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function1 = function0;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
                }
                if (function1 != null) {
                    companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
                } else {
                    companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                long j10 = jM3842copywmQWz5c$default;
                long j11 = jM3842copywmQWz5c$default2;
                Modifier modifierM685paddingVpY3zN6 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j10, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j11, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
                Alignment center3 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN6);
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j4 = j10;
                j5 = j11;
            } else {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
                }
                if (function1 != null) {
                    companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
                } else {
                    companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                long j12 = jM3842copywmQWz5c$default;
                long j13 = jM3842copywmQWz5c$default2;
                Modifier modifierM685paddingVpY3zN7 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j12, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j13, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
                Alignment center4 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN7);
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j4 = j12;
                j5 = j13;
            }
            function2 = function1;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassPillKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidGlassPillKt.LiquidGlassPill_DTcfvLk$lambda$1(modifier5, j4, j5, function2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        j3 = j2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
                }
                if (function1 != null) {
                    companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
                } else {
                    companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                long j14 = jM3842copywmQWz5c$default;
                long j15 = jM3842copywmQWz5c$default2;
                Modifier modifierM685paddingVpY3zN8 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j14, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j15, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
                Alignment center5 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN8);
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j4 = j14;
                j5 = j15;
            } else {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -113;
                    }
                    if (i9 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default2 = j3;
                    }
                    modifier3 = companion;
                    if (i4 != 0) {
                        function1 = null;
                    } else {
                        function1 = function1;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
                }
                if (function1 != null) {
                    companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
                } else {
                    companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                long j16 = jM3842copywmQWz5c$default;
                long j17 = jM3842copywmQWz5c$default2;
                Modifier modifierM685paddingVpY3zN9 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j16, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j17, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
                Alignment center6 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center6, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN9);
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j4 = j16;
                j5 = j17;
            }
            function2 = function1;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassPillKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidGlassPillKt.LiquidGlassPill_DTcfvLk$lambda$1(modifier6, j4, j5, function2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        function1 = function0;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -113;
                }
                if (i9 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default2 = j3;
                }
                modifier3 = companion;
                if (i4 != 0) {
                    function1 = null;
                } else {
                    function1 = function1;
                }
            } else {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -113;
                }
                if (i9 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default2 = j3;
                }
                modifier3 = companion;
                if (i4 != 0) {
                    function1 = null;
                } else {
                    function1 = function1;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
            }
            if (function1 != null) {
                companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
            } else {
                companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
            }
            long j18 = jM3842copywmQWz5c$default;
            long j19 = jM3842copywmQWz5c$default2;
            Modifier modifierM685paddingVpY3zN10 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j18, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j19, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
            Alignment center7 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(center7, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN10);
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
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j18;
            j5 = j19;
        } else {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "22@851L11");
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -113;
                }
                if (i9 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default2 = j3;
                }
                modifier3 = companion;
                if (i4 != 0) {
                    function1 = null;
                } else {
                    function1 = function1;
                }
            } else {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -113;
                }
                if (i9 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default2 = j3;
                }
                modifier3 = companion;
                if (i4 != 0) {
                    function1 = null;
                } else {
                    function1 = function1;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(347943704, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassPill (LiquidGlassPill.kt:26)");
            }
            if (function1 != null) {
                companionM272clickableXHw0xAI$default = ClickableKt.m272clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function1, 7, null);
            } else {
                companionM272clickableXHw0xAI$default = Modifier.INSTANCE;
            }
            long j110 = jM3842copywmQWz5c$default;
            long j111 = jM3842copywmQWz5c$default2;
            Modifier modifierM685paddingVpY3zN11 = PaddingKt.m685paddingVpY3zN4(BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, Dp.m6302constructorimpl(4), RoundedCornerShapeKt.getCircleShape(), false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 20, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j110, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(Dp.m6302constructorimpl(1), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(jM3842copywmQWz5c$default2), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j111, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()).then(companionM272clickableXHw0xAI$default), Dp.m6302constructorimpl(14), Dp.m6302constructorimpl(7));
            Alignment center8 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(center8, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM685paddingVpY3zN11);
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
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1354506648, "C64@2206L9:LiquidGlassPill.kt#7ivg5k");
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j110;
            j5 = j111;
        }
        function2 = function1;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier7 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassPillKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiquidGlassPillKt.LiquidGlassPill_DTcfvLk$lambda$1(modifier7, j4, j5, function2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
