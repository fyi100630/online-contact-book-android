package com.rhythmbyte.contactbook.ui.components.liquid;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.BackdropEffectScope;
import com.kyant.backdrop.DrawBackdropModifierKt;
import com.kyant.backdrop.backdrops.BackdropKt;
import com.kyant.backdrop.backdrops.CombinedBackdropKt;
import com.kyant.backdrop.backdrops.LayerBackdrop;
import com.kyant.backdrop.backdrops.LayerBackdropKt;
import com.kyant.backdrop.backdrops.LayerBackdropModifierKt;
import com.kyant.backdrop.effects.BlurKt;
import com.kyant.backdrop.effects.LensKt;
import com.kyant.backdrop.highlight.Highlight;
import com.kyant.backdrop.shadow.InnerShadow;
import com.kyant.backdrop.shadow.Shadow;
import com.kyant.shapes.Capsule;
import com.rhythmbyte.contactbook.ui.components.liquidtabs.DampedDragAnimation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: LiquidToggle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"LiquidToggle", "", "selected", "Lkotlin/Function0;", "", "onSelect", "Lkotlin/Function1;", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "modifier", "Landroidx/compose/ui/Modifier;", "accentColorOverride", "Landroidx/compose/ui/graphics/Color;", "LiquidToggle-M8YrEPQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/kyant/backdrop/Backdrop;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "app_release", "didDrag", "fraction", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidToggleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$37(Function0 function0, Function1 function1, Backdrop backdrop, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        m6766LiquidToggleM8YrEPQ(function0, function1, backdrop, modifier, color, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:105:0x021f  */
    /* JADX WARN: Code duplicated, block: B:108:0x026c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0274  */
    /* JADX WARN: Code duplicated, block: B:113:0x0298  */
    /* JADX WARN: Code duplicated, block: B:114:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:122:0x031d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0329  */
    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0352  */
    /* JADX WARN: Code duplicated, block: B:131:0x0360  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:143:0x0448  */
    /* JADX WARN: Code duplicated, block: B:145:0x0450  */
    /* JADX WARN: Code duplicated, block: B:148:0x0476  */
    /* JADX WARN: Code duplicated, block: B:151:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:153:0x04af  */
    /* JADX WARN: Code duplicated, block: B:156:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x0502  */
    /* JADX WARN: Code duplicated, block: B:161:0x050a  */
    /* JADX WARN: Code duplicated, block: B:164:0x052c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0534  */
    /* JADX WARN: Code duplicated, block: B:169:0x0558  */
    /* JADX WARN: Code duplicated, block: B:172:0x057a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0582  */
    /* JADX WARN: Code duplicated, block: B:177:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:179:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:182:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:184:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:187:0x061f  */
    /* JADX WARN: Code duplicated, block: B:191:0x062c  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f7  */
    /* JADX INFO: renamed from: LiquidToggle-M8YrEPQ, reason: not valid java name */
    public static final void m6766LiquidToggleM8YrEPQ(final Function0<Boolean> selected, final Function1<? super Boolean, Unit> onSelect, Backdrop backdrop, Modifier modifier, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Color color2;
        int i5;
        Modifier modifier3;
        Color color3;
        boolean zIsSystemInDarkTheme;
        long jColor;
        final long j;
        long jM3842copywmQWz5c$default;
        final long j2;
        Object objConsume;
        final boolean z;
        final float fMo376toPx0680j_4;
        Object objRememberedValue;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        final MutableState mutableState;
        Object objRememberedValue3;
        final MutableFloatState mutableFloatState;
        boolean zChanged;
        Object objRememberedValue4;
        final DampedDragAnimation dampedDragAnimation;
        boolean zChangedInstance;
        LiquidToggleKt$LiquidToggle$1$1 liquidToggleKt$LiquidToggle$1$1RememberedValue;
        int i6;
        boolean z2;
        boolean zChangedInstance2;
        LiquidToggleKt$LiquidToggle$2$1 liquidToggleKt$LiquidToggle$2$1RememberedValue;
        final boolean z3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3336constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        boolean zChangedInstance3;
        Object objRememberedValue5;
        boolean zChangedInstance4;
        Object objRememberedValue6;
        Object objRememberedValue7;
        boolean zChangedInstance5;
        Object objRememberedValue8;
        Backdrop backdrop2;
        Object objRememberedValue9;
        boolean zChangedInstance6;
        Object objRememberedValue10;
        boolean zChangedInstance7;
        Object objRememberedValue11;
        Object objRememberedValue12;
        boolean zChangedInstance8;
        Object objRememberedValue13;
        boolean zChangedInstance9;
        Object objRememberedValue14;
        boolean zChangedInstance10;
        Object objRememberedValue15;
        final Color color4;
        final Modifier modifier4;
        float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(backdrop, "backdrop");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1829413191);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidToggle)P(4,3,1,2,0:c#ui.graphics.Color)57@2360L21,66@2661L7,67@2706L7,69@2814L24,70@2858L34,71@2913L60,72@3004L1220,106@4265L140,106@4229L176,112@4435L317,112@4410L342,123@4778L23,125@4807L4000:LiquidToggle.kt#m72kpu");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(selected) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelect) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(backdrop) : composerStartRestartGroup.changedInstance(backdrop) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    color2 = color;
                    if (composerStartRestartGroup.changed(color2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    if (color3 != null) {
                        jColor = color3.m3853unboximpl();
                    } else if (!zIsSystemInDarkTheme) {
                        jColor = ColorKt.Color(4279286145L);
                    } else {
                        jColor = ColorKt.Color(4281652121L);
                    }
                    j = jColor;
                    if (!zIsSystemInDarkTheme) {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j2 = jM3842copywmQWz5c$default;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Density density = (Density) objConsume2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    objConsume = composerStartRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (objConsume == LayoutDirection.Ltr) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fMo376toPx0680j_4 = density.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
                    composerStartRestartGroup.startReplaceGroup(1508584510);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1508586296);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        if (selected.invoke().booleanValue()) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    mutableFloatState = (MutableFloatState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1508590368);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(coroutineScope);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                            }
                        }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                            }
                        }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1508629640);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || liquidToggleKt$LiquidToggle$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                        composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1508635257);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    i6 = i3 & 14;
                    if (i6 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || liquidToggleKt$LiquidToggle$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                        composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
                    z3 = z;
                    int i8 = i3;
                    Color color5 = color3;
                    LayerBackdrop layerBackdropRememberLayerBackdrop = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
                    Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier5 = modifier3;
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
                    Modifier modifierClip = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop), new Capsule(null, 1, null));
                    float fM6302constructorimpl = Dp.m6302constructorimpl(1);
                    long jM3880getWhite0d7_KjU = Color.INSTANCE.m3880getWhite0d7_KjU();
                    if (zIsSystemInDarkTheme) {
                        f = 0.15f;
                    } else {
                        f = 0.35f;
                    }
                    Modifier modifierBorder = BorderKt.border(modifierClip, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
                    composerStartRestartGroup.startReplaceGroup(2046178179);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(2046186374);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue6);
                    composerStartRestartGroup.startReplaceGroup(2046196597);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierThen = SemanticsModifierKt.semantics$default(modifierGraphicsLayer, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
                    LayerBackdrop layerBackdrop = layerBackdropRememberLayerBackdrop;
                    composerStartRestartGroup.startReplaceGroup(2046206396);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    backdrop2 = backdrop;
                    Backdrop backdropRememberCombinedBackdrop = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i8 >> 6) & 14);
                    composerStartRestartGroup.startReplaceGroup(2046226952);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    Function0 function0 = (Function0) objRememberedValue9;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2046228754);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    Function1 function1 = (Function1) objRememberedValue10;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2046241828);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    Function0 function2 = (Function0) objRememberedValue11;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2046254204);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    Function0 function3 = (Function0) objRememberedValue12;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2046261598);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance8 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    Function0 function4 = (Function0) objRememberedValue13;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2046271096);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance9 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    Function1 function5 = (Function1) objRememberedValue14;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2046283301);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                    zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                    objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance10 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen, backdropRememberCombinedBackdrop, function0, function1, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function2, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function3, (3064 & 32) != 0 ? null : function4, (3064 & 64) != 0 ? null : function5, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    color4 = color5;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    backdrop2 = backdrop;
                    modifier4 = modifier2;
                    color4 = color2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Backdrop backdrop3 = backdrop2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$37(selected, onSelect, backdrop3, modifier4, color4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            color2 = color;
            if ((i3 & 9363) == 9362) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (color3 != null) {
                    jColor = color3.m3853unboximpl();
                } else if (!zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279286145L);
                } else {
                    jColor = ColorKt.Color(4281652121L);
                }
                j = jColor;
                if (!zIsSystemInDarkTheme) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                j2 = jM3842copywmQWz5c$default;
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density2 = (Density) objConsume3;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (objConsume == LayoutDirection.Ltr) {
                    z = true;
                } else {
                    z = false;
                }
                fMo376toPx0680j_4 = density2.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
                composerStartRestartGroup.startReplaceGroup(1508584510);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508586296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    if (selected.invoke().booleanValue()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableFloatState = (MutableFloatState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508590368);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508629640);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1508635257);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                i6 = i3 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
                z3 = z;
                int i9 = i3;
                Color color6 = color3;
                LayerBackdrop layerBackdropRememberLayerBackdrop2 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
                Alignment centerStart2 = Alignment.INSTANCE.getCenterStart();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier6 = modifier3;
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
                Modifier modifierClip2 = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop2), new Capsule(null, 1, null));
                float fM6302constructorimpl2 = Dp.m6302constructorimpl(1);
                long jM3880getWhite0d7_KjU2 = Color.INSTANCE.m3880getWhite0d7_KjU();
                if (zIsSystemInDarkTheme) {
                    f = 0.35f;
                } else {
                    f = 0.15f;
                }
                Modifier modifierBorder2 = BorderKt.border(modifierClip2, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl2, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU2, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
                composerStartRestartGroup.startReplaceGroup(2046178179);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder2, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2046186374);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance4) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue6);
                composerStartRestartGroup.startReplaceGroup(2046196597);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = SemanticsModifierKt.semantics$default(modifierGraphicsLayer2, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
                LayerBackdrop layerBackdrop2 = layerBackdropRememberLayerBackdrop2;
                composerStartRestartGroup.startReplaceGroup(2046206396);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance5) {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                backdrop2 = backdrop;
                Backdrop backdropRememberCombinedBackdrop2 = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop2, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i9 >> 6) & 14);
                composerStartRestartGroup.startReplaceGroup(2046226952);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Function0 function6 = (Function0) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046228754);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance6) {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                Function1 function7 = (Function1) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046241828);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance7) {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                Function0 function8 = (Function0) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046254204);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                Function0 function9 = (Function0) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046261598);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance8) {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                Function0 function10 = (Function0) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046271096);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance9) {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                } else {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                Function1 function11 = (Function1) objRememberedValue14;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046283301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance10) {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                } else {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen2, backdropRememberCombinedBackdrop2, function6, function7, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function8, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function9, (3064 & 32) != 0 ? null : function10, (3064 & 64) != 0 ? null : function11, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                color4 = color6;
                modifier4 = modifier6;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (color3 != null) {
                    jColor = color3.m3853unboximpl();
                } else if (!zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279286145L);
                } else {
                    jColor = ColorKt.Color(4281652121L);
                }
                j = jColor;
                if (!zIsSystemInDarkTheme) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                j2 = jM3842copywmQWz5c$default;
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume4 = composerStartRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density3 = (Density) objConsume4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (objConsume == LayoutDirection.Ltr) {
                    z = true;
                } else {
                    z = false;
                }
                fMo376toPx0680j_4 = density3.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
                composerStartRestartGroup.startReplaceGroup(1508584510);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508586296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    if (selected.invoke().booleanValue()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableFloatState = (MutableFloatState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508590368);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508629640);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1508635257);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                i6 = i3 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
                z3 = z;
                int i10 = i3;
                Color color7 = color3;
                LayerBackdrop layerBackdropRememberLayerBackdrop3 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
                Alignment centerStart3 = Alignment.INSTANCE.getCenterStart();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart3, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier7 = modifier3;
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
                Modifier modifierClip3 = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop3), new Capsule(null, 1, null));
                float fM6302constructorimpl3 = Dp.m6302constructorimpl(1);
                long jM3880getWhite0d7_KjU3 = Color.INSTANCE.m3880getWhite0d7_KjU();
                if (zIsSystemInDarkTheme) {
                    f = 0.35f;
                } else {
                    f = 0.15f;
                }
                Modifier modifierBorder3 = BorderKt.border(modifierClip3, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl3, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU3, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
                composerStartRestartGroup.startReplaceGroup(2046178179);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder3, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2046186374);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance4) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) objRememberedValue6);
                composerStartRestartGroup.startReplaceGroup(2046196597);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen3 = SemanticsModifierKt.semantics$default(modifierGraphicsLayer3, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
                LayerBackdrop layerBackdrop3 = layerBackdropRememberLayerBackdrop3;
                composerStartRestartGroup.startReplaceGroup(2046206396);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance5) {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                backdrop2 = backdrop;
                Backdrop backdropRememberCombinedBackdrop3 = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop3, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i10 >> 6) & 14);
                composerStartRestartGroup.startReplaceGroup(2046226952);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Function0 function12 = (Function0) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046228754);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance6) {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                Function1 function13 = (Function1) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046241828);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance7) {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                Function0 function14 = (Function0) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046254204);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                Function0 function15 = (Function0) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046261598);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance8) {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                Function0 function16 = (Function0) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046271096);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance9) {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                } else {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                Function1 function17 = (Function1) objRememberedValue14;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046283301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance10) {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                } else {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen3, backdropRememberCombinedBackdrop3, function12, function13, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function14, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function15, (3064 & 32) != 0 ? null : function16, (3064 & 64) != 0 ? null : function17, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                color4 = color7;
                modifier4 = modifier7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Backdrop backdrop4 = backdrop2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$37(selected, onSelect, backdrop4, modifier4, color4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                color2 = color;
                if (composerStartRestartGroup.changed(color2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) == 9362) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (color3 != null) {
                    jColor = color3.m3853unboximpl();
                } else if (!zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279286145L);
                } else {
                    jColor = ColorKt.Color(4281652121L);
                }
                j = jColor;
                if (!zIsSystemInDarkTheme) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                j2 = jM3842copywmQWz5c$default;
                ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume5 = composerStartRestartGroup.consume(localDensity4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density4 = (Density) objConsume5;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(localLayoutDirection4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (objConsume == LayoutDirection.Ltr) {
                    z = true;
                } else {
                    z = false;
                }
                fMo376toPx0680j_4 = density4.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
                composerStartRestartGroup.startReplaceGroup(1508584510);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508586296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    if (selected.invoke().booleanValue()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableFloatState = (MutableFloatState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508590368);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508629640);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1508635257);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                i6 = i3 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
                z3 = z;
                int i11 = i3;
                Color color8 = color3;
                LayerBackdrop layerBackdropRememberLayerBackdrop4 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
                Alignment centerStart4 = Alignment.INSTANCE.getCenterStart();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart4, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier8 = modifier3;
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
                Modifier modifierClip4 = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop4), new Capsule(null, 1, null));
                float fM6302constructorimpl4 = Dp.m6302constructorimpl(1);
                long jM3880getWhite0d7_KjU4 = Color.INSTANCE.m3880getWhite0d7_KjU();
                if (zIsSystemInDarkTheme) {
                    f = 0.35f;
                } else {
                    f = 0.15f;
                }
                Modifier modifierBorder4 = BorderKt.border(modifierClip4, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl4, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU4, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
                composerStartRestartGroup.startReplaceGroup(2046178179);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder4, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2046186374);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance4) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer4 = GraphicsLayerModifierKt.graphicsLayer(companion4, (Function1) objRememberedValue6);
                composerStartRestartGroup.startReplaceGroup(2046196597);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen4 = SemanticsModifierKt.semantics$default(modifierGraphicsLayer4, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
                LayerBackdrop layerBackdrop4 = layerBackdropRememberLayerBackdrop4;
                composerStartRestartGroup.startReplaceGroup(2046206396);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance5) {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                backdrop2 = backdrop;
                Backdrop backdropRememberCombinedBackdrop4 = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop4, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i11 >> 6) & 14);
                composerStartRestartGroup.startReplaceGroup(2046226952);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Function0 function18 = (Function0) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046228754);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance6) {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                Function1 function19 = (Function1) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046241828);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance7) {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                Function0 function110 = (Function0) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046254204);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                Function0 function111 = (Function0) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046261598);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance8) {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                Function0 function112 = (Function0) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046271096);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance9) {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                } else {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                Function1 function113 = (Function1) objRememberedValue14;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046283301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance10) {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                } else {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen4, backdropRememberCombinedBackdrop4, function18, function19, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function110, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function111, (3064 & 32) != 0 ? null : function112, (3064 & 64) != 0 ? null : function113, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                color4 = color8;
                modifier4 = modifier8;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
                }
                zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                if (color3 != null) {
                    jColor = color3.m3853unboximpl();
                } else if (!zIsSystemInDarkTheme) {
                    jColor = ColorKt.Color(4279286145L);
                } else {
                    jColor = ColorKt.Color(4281652121L);
                }
                j = jColor;
                if (!zIsSystemInDarkTheme) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                j2 = jM3842copywmQWz5c$default;
                ProvidableCompositionLocal<Density> localDensity5 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume6 = composerStartRestartGroup.consume(localDensity5);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density5 = (Density) objConsume6;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection5 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(localLayoutDirection5);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (objConsume == LayoutDirection.Ltr) {
                    z = true;
                } else {
                    z = false;
                }
                fMo376toPx0680j_4 = density5.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
                composerStartRestartGroup.startReplaceGroup(1508584510);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508586296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    if (selected.invoke().booleanValue()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableFloatState = (MutableFloatState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508590368);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                        }
                    }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                        }
                    }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1508629640);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1508635257);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                i6 = i3 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
                liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                } else {
                    liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
                z3 = z;
                int i12 = i3;
                Color color9 = color3;
                LayerBackdrop layerBackdropRememberLayerBackdrop5 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
                Alignment centerStart5 = Alignment.INSTANCE.getCenterStart();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart5, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier9 = modifier3;
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
                Modifier modifierClip5 = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop5), new Capsule(null, 1, null));
                float fM6302constructorimpl5 = Dp.m6302constructorimpl(1);
                long jM3880getWhite0d7_KjU5 = Color.INSTANCE.m3880getWhite0d7_KjU();
                if (zIsSystemInDarkTheme) {
                    f = 0.35f;
                } else {
                    f = 0.15f;
                }
                Modifier modifierBorder5 = BorderKt.border(modifierClip5, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl5, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU5, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
                composerStartRestartGroup.startReplaceGroup(2046178179);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder5, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2046186374);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance4) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer5 = GraphicsLayerModifierKt.graphicsLayer(companion5, (Function1) objRememberedValue6);
                composerStartRestartGroup.startReplaceGroup(2046196597);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen5 = SemanticsModifierKt.semantics$default(modifierGraphicsLayer5, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
                LayerBackdrop layerBackdrop5 = layerBackdropRememberLayerBackdrop5;
                composerStartRestartGroup.startReplaceGroup(2046206396);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance5) {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                backdrop2 = backdrop;
                Backdrop backdropRememberCombinedBackdrop5 = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop5, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i12 >> 6) & 14);
                composerStartRestartGroup.startReplaceGroup(2046226952);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Function0 function114 = (Function0) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046228754);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance6) {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                Function1 function115 = (Function1) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046241828);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance7) {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                Function0 function116 = (Function0) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046254204);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                Function0 function117 = (Function0) objRememberedValue12;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046261598);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance8) {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                Function0 function118 = (Function0) objRememberedValue13;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046271096);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance9) {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                } else {
                    objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                Function1 function119 = (Function1) objRememberedValue14;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2046283301);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
                zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance10) {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                } else {
                    objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen5, backdropRememberCombinedBackdrop5, function114, function115, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function116, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function117, (3064 & 32) != 0 ? null : function118, (3064 & 64) != 0 ? null : function119, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                color4 = color9;
                modifier4 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Backdrop backdrop5 = backdrop2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$37(selected, onSelect, backdrop5, modifier4, color4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        color2 = color;
        if ((i3 & 9363) == 9362) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
            }
            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            if (color3 != null) {
                jColor = color3.m3853unboximpl();
            } else if (!zIsSystemInDarkTheme) {
                jColor = ColorKt.Color(4279286145L);
            } else {
                jColor = ColorKt.Color(4281652121L);
            }
            j = jColor;
            if (!zIsSystemInDarkTheme) {
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            j2 = jM3842copywmQWz5c$default;
            ProvidableCompositionLocal<Density> localDensity6 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume7 = composerStartRestartGroup.consume(localDensity6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density6 = (Density) objConsume7;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection6 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            objConsume = composerStartRestartGroup.consume(localLayoutDirection6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (objConsume == LayoutDirection.Ltr) {
                z = true;
            } else {
                z = false;
            }
            fMo376toPx0680j_4 = density6.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
            composerStartRestartGroup.startReplaceGroup(1508584510);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1508586296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (selected.invoke().booleanValue()) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableFloatState = (MutableFloatState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1508590368);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                    }
                }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                    }
                }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                    }
                }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                    }
                }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1508629640);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
            } else {
                liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1508635257);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            i6 = i3 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
            liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance2) {
                liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
            } else {
                liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
            z3 = z;
            int i13 = i3;
            Color color10 = color3;
            LayerBackdrop layerBackdropRememberLayerBackdrop6 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
            Alignment centerStart6 = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart6, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier10 = modifier3;
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
            Modifier modifierClip6 = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop6), new Capsule(null, 1, null));
            float fM6302constructorimpl6 = Dp.m6302constructorimpl(1);
            long jM3880getWhite0d7_KjU6 = Color.INSTANCE.m3880getWhite0d7_KjU();
            if (zIsSystemInDarkTheme) {
                f = 0.35f;
            } else {
                f = 0.15f;
            }
            Modifier modifierBorder6 = BorderKt.border(modifierClip6, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl6, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU6, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
            composerStartRestartGroup.startReplaceGroup(2046178179);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance3) {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder6, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
            Modifier.Companion companion6 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2046186374);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance4) {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer6 = GraphicsLayerModifierKt.graphicsLayer(companion6, (Function1) objRememberedValue6);
            composerStartRestartGroup.startReplaceGroup(2046196597);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen6 = SemanticsModifierKt.semantics$default(modifierGraphicsLayer6, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
            LayerBackdrop layerBackdrop6 = layerBackdropRememberLayerBackdrop6;
            composerStartRestartGroup.startReplaceGroup(2046206396);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance5) {
                objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            backdrop2 = backdrop;
            Backdrop backdropRememberCombinedBackdrop6 = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop6, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i13 >> 6) & 14);
            composerStartRestartGroup.startReplaceGroup(2046226952);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function0 function1110 = (Function0) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046228754);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance6) {
                objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            } else {
                objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Function1 function1111 = (Function1) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046241828);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance7) {
                objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            Function0 function1112 = (Function0) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046254204);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            Function0 function1113 = (Function0) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046261598);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance8) {
                objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            } else {
                objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            Function0 function1114 = (Function0) objRememberedValue13;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046271096);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance9) {
                objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            } else {
                objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            Function1 function1115 = (Function1) objRememberedValue14;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046283301);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance10) {
                objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen6, backdropRememberCombinedBackdrop6, function1110, function1111, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function1112, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function1113, (3064 & 32) != 0 ? null : function1114, (3064 & 64) != 0 ? null : function1115, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            color4 = color10;
            modifier4 = modifier10;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829413191, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggle (LiquidToggle.kt:56)");
            }
            zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            if (color3 != null) {
                jColor = color3.m3853unboximpl();
            } else if (!zIsSystemInDarkTheme) {
                jColor = ColorKt.Color(4279286145L);
            } else {
                jColor = ColorKt.Color(4281652121L);
            }
            j = jColor;
            if (!zIsSystemInDarkTheme) {
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085240L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4286085248L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            j2 = jM3842copywmQWz5c$default;
            ProvidableCompositionLocal<Density> localDensity7 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume8 = composerStartRestartGroup.consume(localDensity7);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density7 = (Density) objConsume8;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection7 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            objConsume = composerStartRestartGroup.consume(localLayoutDirection7);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (objConsume == LayoutDirection.Ltr) {
                z = true;
            } else {
                z = false;
            }
            fMo376toPx0680j_4 = density7.mo376toPx0680j_4(Dp.m6302constructorimpl(22.0f));
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
            composerStartRestartGroup.startReplaceGroup(1508584510);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1508586296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (selected.invoke().booleanValue()) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableFloatState = (MutableFloatState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1508590368);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                    }
                }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                    }
                }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new DampedDragAnimation(coroutineScope, LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState), RangesKt.rangeTo(0.0f, 1.0f), 0.001f, 1.0f, 1.0f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$7((DampedDragAnimation) obj, (Offset) obj2);
                    }
                }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$8(onSelect, selected, mutableState, mutableFloatState, (DampedDragAnimation) obj);
                    }
                }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$10$lambda$9(fMo376toPx0680j_4, z, mutableState, mutableFloatState, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            dampedDragAnimation = (DampedDragAnimation) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1508629640);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            liquidToggleKt$LiquidToggle$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
            } else {
                liquidToggleKt$LiquidToggle$1$1RememberedValue = new LiquidToggleKt$LiquidToggle$1$1(mutableFloatState, dampedDragAnimation, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$1$1RememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1508635257);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            i6 = i3 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(dampedDragAnimation);
            liquidToggleKt$LiquidToggle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance2) {
                liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
            } else {
                liquidToggleKt$LiquidToggle$2$1RememberedValue = new LiquidToggleKt$LiquidToggle$2$1(selected, dampedDragAnimation, mutableFloatState, null);
                composerStartRestartGroup.updateRememberedValue(liquidToggleKt$LiquidToggle$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(selected, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidToggleKt$LiquidToggle$2$1RememberedValue, composerStartRestartGroup, i6);
            z3 = z;
            int i14 = i3;
            Color color11 = color3;
            LayerBackdrop layerBackdropRememberLayerBackdrop7 = LayerBackdropKt.rememberLayerBackdrop(null, false, null, composerStartRestartGroup, 0, 7);
            Alignment centerStart7 = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart7, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier11 = modifier3;
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -993251930, "C140@5281L136,129@4895L570,149@5532L299,156@5859L58,163@6148L609,163@6116L641,161@6032L747,176@6809L13,177@6854L375,186@7263L361,194@7655L193,200@7884L259,207@8178L349,213@8565L170,147@5475L3326:LiquidToggle.kt#m72kpu");
            Modifier modifierClip7 = ClipKt.clip(LayerBackdropModifierKt.layerBackdrop(Modifier.INSTANCE, layerBackdropRememberLayerBackdrop7), new Capsule(null, 1, null));
            float fM6302constructorimpl7 = Dp.m6302constructorimpl(1);
            long jM3880getWhite0d7_KjU7 = Color.INSTANCE.m3880getWhite0d7_KjU();
            if (zIsSystemInDarkTheme) {
                f = 0.35f;
            } else {
                f = 0.15f;
            }
            Modifier modifierBorder7 = BorderKt.border(modifierClip7, BorderStrokeKt.m266BorderStrokecXLIe8U(fM6302constructorimpl7, Color.m3842copywmQWz5c$default(jM3880getWhite0d7_KjU7, f, 0.0f, 0.0f, 0.0f, 14, null)), new Capsule(null, 1, null));
            composerStartRestartGroup.startReplaceGroup(2046178179);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance3 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance3) {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(dampedDragAnimation, j2, j, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawModifierKt.drawBehind(modifierBorder7, (Function1) objRememberedValue5), Dp.m6302constructorimpl(60.0f), Dp.m6302constructorimpl(32.0f)), composerStartRestartGroup, 0);
            Modifier.Companion companion7 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2046186374);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance4 = composerStartRestartGroup.changedInstance(dampedDragAnimation) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo376toPx0680j_4);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance4) {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(dampedDragAnimation, z3, fMo376toPx0680j_4, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer7 = GraphicsLayerModifierKt.graphicsLayer(companion7, (Function1) objRememberedValue6);
            composerStartRestartGroup.startReplaceGroup(2046196597);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen7 = SemanticsModifierKt.semantics$default(modifierGraphicsLayer7, false, (Function1) objRememberedValue7, 1, null).then(dampedDragAnimation.getModifier());
            LayerBackdrop layerBackdrop7 = layerBackdropRememberLayerBackdrop7;
            composerStartRestartGroup.startReplaceGroup(2046206396);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance5 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance5) {
                objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(dampedDragAnimation, (DrawScope) obj, (Function1) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            backdrop2 = backdrop;
            Backdrop backdropRememberCombinedBackdrop7 = CombinedBackdropKt.rememberCombinedBackdrop(backdrop2, BackdropKt.rememberBackdrop(layerBackdrop7, (Function2) objRememberedValue8, composerStartRestartGroup, 0), composerStartRestartGroup, (i14 >> 6) & 14);
            composerStartRestartGroup.startReplaceGroup(2046226952);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function0 function1116 = (Function0) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046228754);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance6 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance6) {
                objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            } else {
                objRememberedValue10 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(dampedDragAnimation, (BackdropEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Function1 function1117 = (Function1) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046241828);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance7 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance7) {
                objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                objRememberedValue11 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            Function0 function1118 = (Function0) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046254204);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            Function0 function1119 = (Function0) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046261598);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance8 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance8) {
                objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            } else {
                objRememberedValue13 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(dampedDragAnimation);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            Function0 function11110 = (Function0) objRememberedValue13;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046271096);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance9 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance9) {
                objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            } else {
                objRememberedValue14 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(dampedDragAnimation, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            Function1 function11111 = (Function1) objRememberedValue14;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2046283301);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidToggle.kt#9igjgp");
            zChangedInstance10 = composerStartRestartGroup.changedInstance(dampedDragAnimation);
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance10) {
                objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(dampedDragAnimation, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(SizeKt.m731sizeVpY3zN4(DrawBackdropModifierKt.drawBackdrop(modifierThen7, backdropRememberCombinedBackdrop7, function1116, function1117, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function1118, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function1119, (3064 & 32) != 0 ? null : function11110, (3064 & 64) != 0 ? null : function11111, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue15, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(32.0f), Dp.m6302constructorimpl(26.0f)), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            color4 = color11;
            modifier4 = modifier11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Backdrop backdrop6 = backdrop2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiquidToggleKt.LiquidToggle_M8YrEPQ$lambda$37(selected, onSelect, backdrop6, modifier4, color4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean LiquidToggle_M8YrEPQ$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LiquidToggle_M8YrEPQ$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LiquidToggle_M8YrEPQ$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$10$lambda$7(DampedDragAnimation DampedDragAnimation, Offset offset) {
        Intrinsics.checkNotNullParameter(DampedDragAnimation, "$this$DampedDragAnimation");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$10$lambda$8(Function1 function1, Function0 function0, MutableState mutableState, MutableFloatState mutableFloatState, DampedDragAnimation DampedDragAnimation) {
        float f;
        Intrinsics.checkNotNullParameter(DampedDragAnimation, "$this$DampedDragAnimation");
        if (LiquidToggle_M8YrEPQ$lambda$2(mutableState)) {
            f = LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState) >= 0.5f ? 1.0f : 0.0f;
            mutableFloatState.setFloatValue(f);
            function1.invoke(Boolean.valueOf(f == 1.0f));
            DampedDragAnimation.animateToValue(f);
            LiquidToggle_M8YrEPQ$lambda$3(mutableState, false);
        } else {
            f = ((Boolean) function0.invoke()).booleanValue() ? 0.0f : 1.0f;
            mutableFloatState.setFloatValue(f);
            function1.invoke(Boolean.valueOf(f == 1.0f));
            DampedDragAnimation.animateToValue(f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[PHI: r7
      0x003d: PHI (r7v5 float) = (r7v3 float), (r7v6 float) binds: [B:24:0x004c, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$10$lambda$9(float f, boolean z, MutableState mutableState, MutableFloatState mutableFloatState, DampedDragAnimation DampedDragAnimation, IntSize intSize, Offset offset) {
        float f2;
        Intrinsics.checkNotNullParameter(DampedDragAnimation, "$this$DampedDragAnimation");
        if (!LiquidToggle_M8YrEPQ$lambda$2(mutableState)) {
            LiquidToggle_M8YrEPQ$lambda$3(mutableState, !(Offset.m3602getXimpl(offset.getPackedValue()) == 0.0f));
        }
        float fM3602getXimpl = Offset.m3602getXimpl(offset.getPackedValue()) / f;
        float f3 = 1.0f;
        if (z) {
            float fLiquidToggle_M8YrEPQ$lambda$5 = LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState) + fM3602getXimpl;
            f2 = fLiquidToggle_M8YrEPQ$lambda$5 >= 0.0f ? fLiquidToggle_M8YrEPQ$lambda$5 : 0.0f;
            if (f2 <= 1.0f) {
                f3 = f2;
            }
        } else {
            float fLiquidToggle_M8YrEPQ$lambda$6 = LiquidToggle_M8YrEPQ$lambda$5(mutableFloatState) - fM3602getXimpl;
            f2 = fLiquidToggle_M8YrEPQ$lambda$6 >= 0.0f ? fLiquidToggle_M8YrEPQ$lambda$6 : 0.0f;
            if (f2 <= 1.0f) {
                f3 = f2;
            }
        }
        mutableFloatState.setFloatValue(f3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$14$lambda$13(DampedDragAnimation dampedDragAnimation, long j, long j2, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m4393drawRectnJ9OG0$default(drawBehind, ColorKt.m3894lerpjxsXWHM(j, j2, dampedDragAnimation.getValue()), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$16$lambda$15(DampedDragAnimation dampedDragAnimation, boolean z, float f, GraphicsLayerScope graphicsLayer) {
        float fLerp;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        float value = dampedDragAnimation.getValue();
        float f2 = graphicsLayer.mo376toPx0680j_4(Dp.m6302constructorimpl(3.0f));
        if (z) {
            fLerp = MathHelpersKt.lerp(f2, f + f2, value);
        } else {
            fLerp = MathHelpersKt.lerp(-f2, -(f2 + f), value);
        }
        graphicsLayer.setTranslationX(fLerp);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$18$lambda$17(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m5616setRolekuIjeqM(semantics, Role.INSTANCE.m5602getSwitcho7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$21$lambda$20(DampedDragAnimation dampedDragAnimation, DrawScope rememberBackdrop, Function1 drawBackdrop) {
        Intrinsics.checkNotNullParameter(rememberBackdrop, "$this$rememberBackdrop");
        Intrinsics.checkNotNullParameter(drawBackdrop, "drawBackdrop");
        float pressProgress = dampedDragAnimation.getPressProgress();
        float fCoerceAtLeast = RangesKt.coerceAtLeast(MathHelpersKt.lerp(0.6666667f, 0.75f, pressProgress), 0.01f);
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(MathHelpersKt.lerp(0.01f, 0.75f, pressProgress), 0.01f);
        try {
            long jMo4398getCenterF1C5BW0 = rememberBackdrop.mo4398getCenterF1C5BW0();
            DrawContext drawContext = rememberBackdrop.getDrawContext();
            long jMo4320getSizeNHjbRc = drawContext.mo4320getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo4327scale0AR0LA0(fCoerceAtLeast, fCoerceAtLeast2, jMo4398getCenterF1C5BW0);
                drawBackdrop.invoke(rememberBackdrop);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo4321setSizeuvyYCjk(jMo4320getSizeNHjbRc);
            }
        } catch (Throwable unused) {
            drawBackdrop.invoke(rememberBackdrop);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape LiquidToggle_M8YrEPQ$lambda$36$lambda$23$lambda$22() {
        return new Capsule(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$25$lambda$24(DampedDragAnimation dampedDragAnimation, BackdropEffectScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        float pressProgress = dampedDragAnimation.getPressProgress();
        BlurKt.m6639blur3YTHUZs$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(8.0f)) * (1.0f - pressProgress), 0, 2, null);
        LensKt.lens$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(5.0f)) * pressProgress, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(10.0f)) * pressProgress, false, true, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Highlight LiquidToggle_M8YrEPQ$lambda$36$lambda$27$lambda$26(DampedDragAnimation dampedDragAnimation) {
        return Highlight.m6640copyi1RSzL4$default(Highlight.INSTANCE.getAmbient(), Dp.m6302constructorimpl(Highlight.INSTANCE.getAmbient().m6645getWidthD9Ej5fM() / 1.5f), Dp.m6302constructorimpl(Highlight.INSTANCE.getAmbient().m6644getBlurRadiusD9Ej5fM() / 1.5f), dampedDragAnimation.getPressProgress(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow LiquidToggle_M8YrEPQ$lambda$36$lambda$29$lambda$28() {
        return new Shadow(Dp.m6302constructorimpl(4.0f), 0L, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0, 26, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InnerShadow LiquidToggle_M8YrEPQ$lambda$36$lambda$31$lambda$30(DampedDragAnimation dampedDragAnimation) {
        float pressProgress = dampedDragAnimation.getPressProgress();
        return new InnerShadow(Dp.m6302constructorimpl(Dp.m6302constructorimpl(4.0f) * pressProgress), 0L, 0L, pressProgress, 0, 22, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$33$lambda$32(DampedDragAnimation dampedDragAnimation, GraphicsLayerScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        float pressProgress = dampedDragAnimation.getPressProgress();
        float velocity = dampedDragAnimation.getVelocity() / 80.0f;
        if (velocity < -0.05f) {
            velocity = -0.05f;
        }
        if (velocity > 0.05f) {
            velocity = 0.05f;
        }
        float f = pressProgress * 0.04f;
        drawBackdrop.setScaleX(f + 1.0f + Math.abs(velocity));
        drawBackdrop.setScaleY(1.0f - f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidToggle_M8YrEPQ$lambda$36$lambda$35$lambda$34(DampedDragAnimation dampedDragAnimation, DrawScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        DrawScope.m4393drawRectnJ9OG0$default(drawBackdrop, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 1.0f - dampedDragAnimation.getPressProgress(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }
}
