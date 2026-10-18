package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiquidGlassCard.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a^\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LiquidGlassCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "elevation", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "LiquidGlassCard-H3kbamo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidGlassCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGlassCard_H3kbamo$lambda$1(Modifier modifier, Shape shape, float f, long j, long j2, float f2, Function2 function2, int i, int i2, Composer composer, int i3) {
        m6752LiquidGlassCardH3kbamo(modifier, shape, f, j, j2, f2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0182  */
    /* JADX WARN: Code duplicated, block: B:107:0x030f  */
    /* JADX WARN: Code duplicated, block: B:110:0x031b  */
    /* JADX WARN: Code duplicated, block: B:111:0x031f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0344  */
    /* JADX WARN: Code duplicated, block: B:116:0x0352  */
    /* JADX WARN: Code duplicated, block: B:119:0x043d  */
    /* JADX WARN: Code duplicated, block: B:123:0x044f  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff A[PHI: r0 r4 r5 r6 r7 r12
      0x00ff: PHI (r0v18 float) = (r0v8 float), (r0v22 float) binds: [B:100:0x016b, B:84:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r4v26 androidx.compose.ui.Modifier) = (r4v4 androidx.compose.ui.Modifier), (r4v3 androidx.compose.ui.Modifier) binds: [B:100:0x016b, B:84:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r5v20 int) = (r5v16 int), (r5v22 int) binds: [B:100:0x016b, B:84:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r6v11 androidx.compose.ui.graphics.Shape) = (r6v3 androidx.compose.ui.graphics.Shape), (r6v2 androidx.compose.ui.graphics.Shape) binds: [B:100:0x016b, B:84:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r7v8 long) = (r7v3 long), (r7v2 long) binds: [B:100:0x016b, B:84:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r12v20 long) = (r12v3 long), (r12v2 long) binds: [B:100:0x016b, B:84:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x0153  */
    /* JADX INFO: renamed from: LiquidGlassCard-H3kbamo, reason: not valid java name */
    public static final void m6752LiquidGlassCardH3kbamo(Modifier modifier, Shape shape, float f, long j, long j2, float f2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shapeM967RoundedCornerShape0680j_4;
        long jM3842copywmQWz5c$default;
        long jM3842copywmQWz5c$default2;
        int i4;
        float f3;
        int i5;
        int i6;
        float fM6302constructorimpl;
        float fM6302constructorimpl2;
        Modifier modifier3;
        Shape shape2;
        long j3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3336constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final float f4;
        final float f5;
        final Shape shape3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1121238441);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidGlassCard)P(4,5,2:c#ui.unit.Dp,6:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.unit.Dp)28@1042L1634:LiquidGlassCard.kt#7ivg5k");
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
                shapeM967RoundedCornerShape0680j_4 = shape;
                int i8 = composerStartRestartGroup.changed(shapeM967RoundedCornerShape0680j_4) ? 32 : 16;
                i3 |= i8;
            } else {
                shapeM967RoundedCornerShape0680j_4 = shape;
            }
            i3 |= i8;
        } else {
            shapeM967RoundedCornerShape0680j_4 = shape;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM3842copywmQWz5c$default = j;
                int i9 = composerStartRestartGroup.changed(jM3842copywmQWz5c$default) ? 2048 : 1024;
                i3 |= i9;
            } else {
                jM3842copywmQWz5c$default = j;
            }
            i3 |= i9;
        } else {
            jM3842copywmQWz5c$default = j;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                jM3842copywmQWz5c$default2 = j2;
                i3 |= composerStartRestartGroup.changed(jM3842copywmQWz5c$default2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    f3 = f2;
                    if (composerStartRestartGroup.changed(f3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((i3 & 599059) == 599058 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                        }
                        if ((i2 & 4) != 0) {
                            fM6302constructorimpl = Dp.m6302constructorimpl(24);
                        } else {
                            fM6302constructorimpl = f;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (i10 != 0) {
                            jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (i4 != 0) {
                            fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                            modifier3 = modifier2;
                            shape2 = shapeM967RoundedCornerShape0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
                        }
                        long j5 = jM3842copywmQWz5c$default;
                        j3 = j5;
                        Shape shape4 = shape2;
                        long j6 = jM3842copywmQWz5c$default2;
                        Modifier modifierBorder = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j5, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j5, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape4, 0.0f, 4, null), shape4), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j6, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j6, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j6, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape4);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
                        BoxKt.Box(BackgroundKt.background$default(boxScopeInstance.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape4, 0.0f, 4, null), composerStartRestartGroup, 0);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6302constructorimpl;
                        modifier2 = modifier3;
                        f5 = fM6302constructorimpl2;
                        shape3 = shape4;
                        j4 = j6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        fM6302constructorimpl = f;
                    }
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                    fM6302constructorimpl2 = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
                    }
                    long j7 = jM3842copywmQWz5c$default;
                    j3 = j7;
                    Shape shape5 = shape2;
                    long j8 = jM3842copywmQWz5c$default2;
                    Modifier modifierBorder2 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j7, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j7, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape5, 0.0f, 4, null), shape5), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j8, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j8, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j8, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape5);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder2);
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
                    BoxKt.Box(BackgroundKt.background$default(boxScopeInstance2.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape5, 0.0f, 4, null), composerStartRestartGroup, 0);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6302constructorimpl;
                    modifier2 = modifier3;
                    f5 = fM6302constructorimpl2;
                    shape3 = shape5;
                    j4 = j8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f4 = f;
                    shape3 = shapeM967RoundedCornerShape0680j_4;
                    j3 = jM3842copywmQWz5c$default;
                    j4 = jM3842copywmQWz5c$default2;
                    f5 = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j9 = j3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidGlassCardKt.LiquidGlassCard_H3kbamo$lambda$1(modifier4, shape3, f4, j9, j4, f5, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f3 = f2;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((i3 & 599059) == 599058) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
                }
                long j10 = jM3842copywmQWz5c$default;
                j3 = j10;
                Shape shape6 = shape2;
                long j11 = jM3842copywmQWz5c$default2;
                Modifier modifierBorder3 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j10, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j10, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape6, 0.0f, 4, null), shape6), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j11, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j11, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j11, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape6);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder3);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
                BoxKt.Box(BackgroundKt.background$default(boxScopeInstance3.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape6, 0.0f, 4, null), composerStartRestartGroup, 0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6302constructorimpl;
                modifier2 = modifier3;
                f5 = fM6302constructorimpl2;
                shape3 = shape6;
                j4 = j11;
            } else {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
                }
                long j12 = jM3842copywmQWz5c$default;
                j3 = j12;
                Shape shape7 = shape2;
                long j13 = jM3842copywmQWz5c$default2;
                Modifier modifierBorder4 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j12, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j12, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape7, 0.0f, 4, null), shape7), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j13, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j13, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j13, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape7);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder4);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
                BoxKt.Box(BackgroundKt.background$default(boxScopeInstance4.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape7, 0.0f, 4, null), composerStartRestartGroup, 0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6302constructorimpl;
                modifier2 = modifier3;
                f5 = fM6302constructorimpl2;
                shape3 = shape7;
                j4 = j13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                final long j14 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidGlassCardKt.LiquidGlassCard_H3kbamo$lambda$1(modifier5, shape3, f4, j14, j4, f5, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        jM3842copywmQWz5c$default2 = j2;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((i3 & 599059) == 599058) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
                }
                long j15 = jM3842copywmQWz5c$default;
                j3 = j15;
                Shape shape8 = shape2;
                long j16 = jM3842copywmQWz5c$default2;
                Modifier modifierBorder5 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j15, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j15, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape8, 0.0f, 4, null), shape8), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j16, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j16, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j16, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape8);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder5);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
                BoxKt.Box(BackgroundKt.background$default(boxScopeInstance5.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape8, 0.0f, 4, null), composerStartRestartGroup, 0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6302constructorimpl;
                modifier2 = modifier3;
                f5 = fM6302constructorimpl2;
                shape3 = shape8;
                j4 = j16;
            } else {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                    }
                    if ((i2 & 4) != 0) {
                        fM6302constructorimpl = Dp.m6302constructorimpl(24);
                    } else {
                        fM6302constructorimpl = f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i10 != 0) {
                        jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (i4 != 0) {
                        fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                    } else {
                        modifier3 = modifier2;
                        shape2 = shapeM967RoundedCornerShape0680j_4;
                        fM6302constructorimpl2 = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
                }
                long j17 = jM3842copywmQWz5c$default;
                j3 = j17;
                Shape shape9 = shape2;
                long j18 = jM3842copywmQWz5c$default2;
                Modifier modifierBorder6 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j17, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j17, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape9, 0.0f, 4, null), shape9), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j18, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j18, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j18, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape9);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder6);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
                BoxKt.Box(BackgroundKt.background$default(boxScopeInstance6.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape9, 0.0f, 4, null), composerStartRestartGroup, 0);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6302constructorimpl;
                modifier2 = modifier3;
                f5 = fM6302constructorimpl2;
                shape3 = shape9;
                j4 = j18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = modifier2;
                final long j19 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidGlassCardKt.LiquidGlassCard_H3kbamo$lambda$1(modifier6, shape3, f4, j19, j4, f5, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        f3 = f2;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((i3 & 599059) == 599058) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                }
                if ((i2 & 4) != 0) {
                    fM6302constructorimpl = Dp.m6302constructorimpl(24);
                } else {
                    fM6302constructorimpl = f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i10 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i4 != 0) {
                    fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                } else {
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                    fM6302constructorimpl2 = f3;
                }
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                }
                if ((i2 & 4) != 0) {
                    fM6302constructorimpl = Dp.m6302constructorimpl(24);
                } else {
                    fM6302constructorimpl = f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i10 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i4 != 0) {
                    fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                } else {
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                    fM6302constructorimpl2 = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
            }
            long j110 = jM3842copywmQWz5c$default;
            j3 = j110;
            Shape shape10 = shape2;
            long j111 = jM3842copywmQWz5c$default2;
            Modifier modifierBorder7 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j110, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j110, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape10, 0.0f, 4, null), shape10), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j111, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j111, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j111, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape10);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder7);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
            BoxKt.Box(BackgroundKt.background$default(boxScopeInstance7.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape10, 0.0f, 4, null), composerStartRestartGroup, 0);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM6302constructorimpl;
            modifier2 = modifier3;
            f5 = fM6302constructorimpl2;
            shape3 = shape10;
            j4 = j111;
        } else {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "23@873L11");
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                }
                if ((i2 & 4) != 0) {
                    fM6302constructorimpl = Dp.m6302constructorimpl(24);
                } else {
                    fM6302constructorimpl = f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i10 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i4 != 0) {
                    fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                } else {
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                    fM6302constructorimpl2 = f3;
                }
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    shapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(24));
                }
                if ((i2 & 4) != 0) {
                    fM6302constructorimpl = Dp.m6302constructorimpl(24);
                } else {
                    fM6302constructorimpl = f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i10 != 0) {
                    jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (i4 != 0) {
                    fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                } else {
                    modifier3 = modifier2;
                    shape2 = shapeM967RoundedCornerShape0680j_4;
                    fM6302constructorimpl2 = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1121238441, i3, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassCard (LiquidGlassCard.kt:27)");
            }
            long j112 = jM3842copywmQWz5c$default;
            j3 = j112;
            Shape shape11 = shape2;
            long j113 = jM3842copywmQWz5c$default2;
            Modifier modifierBorder8 = BorderKt.border(ClipKt.clip(BackgroundKt.background$default(ShadowKt.m3507shadows4CzXII$default(modifier3, fM6302constructorimpl2, shape2, false, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j112, 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j112, 0.7f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), shape11, 0.0f, 4, null), shape11), new BorderStroke(Dp.m6302constructorimpl((float) 1.2d), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(j113, 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j113, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j113, 0.1f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null), shape11);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder8);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -260514970, "C60@2106L546,76@2661L9:LiquidGlassCard.kt#7ivg5k");
            BoxKt.Box(BackgroundKt.background$default(boxScopeInstance8.matchParentSize(Modifier.INSTANCE), Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 140.0f, 0, 8, (Object) null), shape11, 0.0f, 4, null), composerStartRestartGroup, 0);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM6302constructorimpl;
            modifier2 = modifier3;
            f5 = fM6302constructorimpl2;
            shape3 = shape11;
            j4 = j113;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier7 = modifier2;
            final long j114 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiquidGlassCardKt.LiquidGlassCard_H3kbamo$lambda$1(modifier7, shape3, f4, j114, j4, f5, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
