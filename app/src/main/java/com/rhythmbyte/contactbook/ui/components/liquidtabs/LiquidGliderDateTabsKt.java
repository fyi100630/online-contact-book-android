package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.BackdropEffectScope;
import com.kyant.backdrop.DrawBackdropModifierKt;
import com.kyant.backdrop.effects.BlurKt;
import com.kyant.backdrop.effects.ColorFilterKt;
import com.kyant.backdrop.effects.LensKt;
import com.kyant.shapes.Capsule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: LiquidGliderDateTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"LiquidGliderDateTabs", "", "selectedDate", "", "yesterdayDate", "todayDate", "tomorrowDate", "onDateSelected", "Lkotlin/Function1;", "onCustomDateClick", "Lkotlin/Function0;", "backdrop", "Lcom/kyant/backdrop/Backdrop;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/kyant/backdrop/Backdrop;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "isDragging", "", "textColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LiquidGliderDateTabsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGliderDateTabs$lambda$11(String str, String str2, String str3, String str4, Function1 function1, Function0 function0, Backdrop backdrop, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LiquidGliderDateTabs(str, str2, str3, str4, function1, function0, backdrop, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0252  */
    /* JADX WARN: Code duplicated, block: B:130:0x026d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0296  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0301  */
    /* JADX WARN: Code duplicated, block: B:145:0x0329  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0430  */
    /* JADX WARN: Code duplicated, block: B:156:0x04b9  */
    public static final void LiquidGliderDateTabs(final String selectedDate, final String yesterdayDate, final String todayDate, final String tomorrowDate, final Function1<? super String, Unit> onDateSelected, final Function0<Unit> onCustomDateClick, Backdrop backdrop, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        final Capsule capsule;
        long jM3842copywmQWz5c$default;
        final long j;
        Modifier modifierBackground$default;
        float f;
        List listListOf;
        Composer composer2;
        final Modifier modifier3;
        Object objRememberedValue;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        Backdrop backdrop2 = backdrop;
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(yesterdayDate, "yesterdayDate");
        Intrinsics.checkNotNullParameter(todayDate, "todayDate");
        Intrinsics.checkNotNullParameter(tomorrowDate, "tomorrowDate");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        Intrinsics.checkNotNullParameter(onCustomDateClick, "onCustomDateClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1943019012);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LiquidGliderDateTabs)P(4,7,5,6,3,2)66@2757L21,67@2810L7,68@2843L24,77@3034L46,78@3103L34,80@3171L281,80@3143L309,151@5396L7184,124@4359L8221:LiquidGliderDateTabs.kt#9hgvmo");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(selectedDate) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(yesterdayDate) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(todayDate) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(tomorrowDate) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDateSelected) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCustomDateClick) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        int i6 = 1572864;
        if (i5 != 0) {
            i3 |= i6;
        } else if ((1572864 & i) == 0) {
            i6 = (2097152 & i) == 0 ? composerStartRestartGroup.changed(backdrop2) : composerStartRestartGroup.changedInstance(backdrop2) ? 1048576 : 524288;
            i3 |= i6;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            Backdrop backdrop3 = i5 != 0 ? null : backdrop2;
            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1943019012, i3, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabs (LiquidGliderDateTabs.kt:65)");
            }
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue4 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (Intrinsics.areEqual(selectedDate, yesterdayDate)) {
                i4 = 0;
            } else if (Intrinsics.areEqual(selectedDate, todayDate)) {
                i4 = 1;
            } else {
                i4 = Intrinsics.areEqual(selectedDate, tomorrowDate) ? 2 : 3;
            }
            composerStartRestartGroup.startReplaceGroup(-294446511);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(i4, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                objRememberedValue5 = animatableAnimatable$default;
            }
            Animatable animatable = (Animatable) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-294444315);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf = Integer.valueOf(i4);
            composerStartRestartGroup.startReplaceGroup(-294441892);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(i4);
            LiquidGliderDateTabsKt$LiquidGliderDateTabs$1$1 liquidGliderDateTabsKt$LiquidGliderDateTabs$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                z = zIsSystemInDarkTheme;
            } else {
                z = zIsSystemInDarkTheme;
                if (liquidGliderDateTabsKt$LiquidGliderDateTabs$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGliderDateTabsKt$LiquidGliderDateTabs$1$1RememberedValue, composerStartRestartGroup, 0);
                float fM6302constructorimpl = Dp.m6302constructorimpl(4);
                capsule = new Capsule(null, 1, null);
                if (z) {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4280166715L), 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                j = jM3842copywmQWz5c$default;
                composerStartRestartGroup.startReplaceGroup(-294424406);
                ComposerKt.sourceInformation(composerStartRestartGroup, "104@3814L18,105@3856L129,110@4015L30");
                if (backdrop3 != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-294421579);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$6$lambda$5(capsule);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-294420124);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$8$lambda$7((BackdropEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-294415135);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(j);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$10$lambda$9(j, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierBackground$default = DrawBackdropModifierKt.drawBackdrop(companion2, backdrop3, function0, function1, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : null, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : null, (3064 & 32) != 0 ? null : null, (3064 & 64) != 0 ? null : null, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue3, (3064 & 2048) != 0 ? null : null);
                } else {
                    modifierBackground$default = BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(j), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j, 0.45f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), capsule, 0.0f, 4, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6302constructorimpl(46));
                float fM6302constructorimpl2 = Dp.m6302constructorimpl(6);
                Capsule capsule2 = capsule;
                long jM3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                long jColor = ColorKt.Color(4279787232L);
                if (z) {
                    f = 0.15f;
                } else {
                    f = 0.18f;
                }
                Modifier modifierClip = ClipKt.clip(ShadowKt.m3507shadows4CzXII$default(modifierM715height3ABfNKs, fM6302constructorimpl2, capsule2, false, jM3842copywmQWz5c$default2, Color.m3842copywmQWz5c$default(jColor, f, 0.0f, 0.0f, 0.0f, 14, null), 4, null).then(modifierBackground$default), capsule2);
                float fM6302constructorimpl3 = Dp.m6302constructorimpl((float) 1.2d);
                Brush.Companion companion3 = Brush.INSTANCE;
                if (z) {
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null))});
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null))});
                }
                Modifier modifier4 = companion;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(BorderKt.border(modifierClip, new BorderStroke(fM6302constructorimpl3, Brush.Companion.m3800verticalGradient8A3gB4$default(companion3, listListOf, 0.0f, 0.0f, 0, 14, (Object) null), null), capsule2), null, false, ComposableLambdaKt.rememberComposableLambda(-345466642, true, new AnonymousClass2(fM6302constructorimpl, density, capsule, z, animatable, i4, coroutineScope, onDateSelected, yesterdayDate, todayDate, tomorrowDate, onCustomDateClick, mutableState, selectedDate), composerStartRestartGroup, 54), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                backdrop2 = backdrop3;
            }
            liquidGliderDateTabsKt$LiquidGliderDateTabs$1$1RememberedValue = new LiquidGliderDateTabsKt$LiquidGliderDateTabs$1$1(animatable, i4, mutableState, null);
            composerStartRestartGroup.updateRememberedValue(liquidGliderDateTabsKt$LiquidGliderDateTabs$1$1RememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) liquidGliderDateTabsKt$LiquidGliderDateTabs$1$1RememberedValue, composerStartRestartGroup, 0);
            float fM6302constructorimpl4 = Dp.m6302constructorimpl(4);
            capsule = new Capsule(null, 1, null);
            if (z) {
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorKt.Color(4280166715L), 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            j = jM3842copywmQWz5c$default;
            composerStartRestartGroup.startReplaceGroup(-294424406);
            ComposerKt.sourceInformation(composerStartRestartGroup, "104@3814L18,105@3856L129,110@4015L30");
            if (backdrop3 != null) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-294421579);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$6$lambda$5(capsule);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function2 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-294420124);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$8$lambda$7((BackdropEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function3 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-294415135);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(j);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$10$lambda$9(j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$10$lambda$9(j, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierBackground$default = DrawBackdropModifierKt.drawBackdrop(companion4, backdrop3, function2, function3, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : null, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : null, (3064 & 32) != 0 ? null : null, (3064 & 64) != 0 ? null : null, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue3, (3064 & 2048) != 0 ? null : null);
            } else {
                modifierBackground$default = BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m3800verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(j), Color.m3833boximpl(Color.m3842copywmQWz5c$default(j, 0.45f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), capsule, 0.0f, 4, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6302constructorimpl(46));
            float fM6302constructorimpl5 = Dp.m6302constructorimpl(6);
            Capsule capsule3 = capsule;
            long jM3842copywmQWz5c$default3 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
            long jColor2 = ColorKt.Color(4279787232L);
            if (z) {
                f = 0.15f;
            } else {
                f = 0.18f;
            }
            Modifier modifierClip2 = ClipKt.clip(ShadowKt.m3507shadows4CzXII$default(modifierM715height3ABfNKs2, fM6302constructorimpl5, capsule3, false, jM3842copywmQWz5c$default3, Color.m3842copywmQWz5c$default(jColor2, f, 0.0f, 0.0f, 0.0f, 14, null), 4, null).then(modifierBackground$default), capsule3);
            float fM6302constructorimpl6 = Dp.m6302constructorimpl((float) 1.2d);
            Brush.Companion companion5 = Brush.INSTANCE;
            if (z) {
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null))});
            } else {
                listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null))});
            }
            Modifier modifier5 = companion;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(BorderKt.border(modifierClip2, new BorderStroke(fM6302constructorimpl6, Brush.Companion.m3800verticalGradient8A3gB4$default(companion5, listListOf, 0.0f, 0.0f, 0, 14, (Object) null), null), capsule3), null, false, ComposableLambdaKt.rememberComposableLambda(-345466642, true, new AnonymousClass2(fM6302constructorimpl4, density, capsule, z, animatable, i4, coroutineScope, onDateSelected, yesterdayDate, todayDate, tomorrowDate, onCustomDateClick, mutableState, selectedDate), composerStartRestartGroup, 54), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            backdrop2 = backdrop3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Backdrop backdrop4 = backdrop2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$11(selectedDate, yesterdayDate, todayDate, tomorrowDate, onDateSelected, onCustomDateClick, backdrop4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LiquidGliderDateTabs$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LiquidGliderDateTabs$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape LiquidGliderDateTabs$lambda$6$lambda$5(Capsule capsule) {
        return capsule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGliderDateTabs$lambda$8$lambda$7(BackdropEffectScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        ColorFilterKt.vibrancy(drawBackdrop);
        BlurKt.m6639blur3YTHUZs$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(12.0f)), 0, 2, null);
        LensKt.lens$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(24.0f)), drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(28.0f)), false, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiquidGliderDateTabs$lambda$10$lambda$9(long j, DrawScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        DrawScope.m4393drawRectnJ9OG0$default(drawBackdrop, j, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2, reason: invalid class name */
    /* JADX INFO: compiled from: LiquidGliderDateTabs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animIndex;
        final /* synthetic */ Capsule $containerShape;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ Density $density;
        final /* synthetic */ float $innerPadding;
        final /* synthetic */ boolean $isDarkTheme;
        final /* synthetic */ MutableState<Boolean> $isDragging$delegate;
        final /* synthetic */ Function0<Unit> $onCustomDateClick;
        final /* synthetic */ Function1<String, Unit> $onDateSelected;
        final /* synthetic */ String $selectedDate;
        final /* synthetic */ int $targetIndex;
        final /* synthetic */ String $todayDate;
        final /* synthetic */ String $tomorrowDate;
        final /* synthetic */ String $yesterdayDate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(float f, Density density, Capsule capsule, boolean z, Animatable<Float, AnimationVector1D> animatable, int i, CoroutineScope coroutineScope, Function1<? super String, Unit> function1, String str, String str2, String str3, Function0<Unit> function0, MutableState<Boolean> mutableState, String str4) {
            this.$innerPadding = f;
            this.$density = density;
            this.$containerShape = capsule;
            this.$isDarkTheme = z;
            this.$animIndex = animatable;
            this.$targetIndex = i;
            this.$coroutineScope = coroutineScope;
            this.$onDateSelected = function1;
            this.$yesterdayDate = str;
            this.$todayDate = str2;
            this.$tomorrowDate = str3;
            this.$onCustomDateClick = function0;
            this.$isDragging$delegate = mutableState;
            this.$selectedDate = str4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
            List listListOf;
            List listListOf2;
            long jColor;
            CoroutineScope coroutineScope;
            Animatable<Float, AnimationVector1D> animatable;
            Function1<String, Unit> function1;
            String str;
            String str2;
            String str3;
            Function0<Unit> function0;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            ComposerKt.sourceInformation(composer2, "C158@5635L462,173@6107L1814,219@8106L1955,215@7931L4643:LiquidGliderDateTabs.kt#9hgvmo");
            int i2 = (i & 6) == 0 ? i | (composer2.changed(BoxWithConstraints) ? 4 : 2) : i;
            if ((i2 & 19) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-345466642, i2, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabs.<anonymous> (LiquidGliderDateTabs.kt:152)");
                }
                float fM6302constructorimpl = Dp.m6302constructorimpl(Dp.m6302constructorimpl(BoxWithConstraints.mo593getMaxWidthD9Ej5fM() - Dp.m6302constructorimpl(this.$innerPadding * 2)) / 4);
                float fMo376toPx0680j_4 = this.$density.mo376toPx0680j_4(fM6302constructorimpl);
                Modifier modifierClip = ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6302constructorimpl(22)), this.$containerShape);
                Brush.Companion companion = Brush.INSTANCE;
                Color[] colorArr = new Color[2];
                colorArr[0] = Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), this.$isDarkTheme ? 0.12f : 0.35f, 0.0f, 0.0f, 0.0f, 14, null));
                colorArr[1] = Color.m3833boximpl(Color.INSTANCE.m3878getTransparent0d7_KjU());
                BoxKt.Box(BackgroundKt.background$default(modifierClip, Brush.Companion.m3800verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) colorArr), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                Modifier modifierM3507shadows4CzXII$default = ShadowKt.m3507shadows4CzXII$default(PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.m734width3ABfNKs(OffsetKt.m645offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m6302constructorimpl(this.$innerPadding + Dp.m6302constructorimpl(RangesKt.coerceIn(this.$animIndex.getValue().floatValue(), 0.0f, 3.0f) * fM6302constructorimpl)), 0.0f, 2, null), fM6302constructorimpl), 0.0f, 1, null), 0.0f, Dp.m6302constructorimpl((float) 3.5d), 1, null), Dp.m6302constructorimpl(LiquidGliderDateTabsKt.LiquidGliderDateTabs$lambda$2(this.$isDragging$delegate) ? 8 : 5), RoundedCornerShapeKt.getCircleShape(), false, this.$isDarkTheme ? Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3842copywmQWz5c$default(ColorKt.Color(4279787232L), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), this.$isDarkTheme ? Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3842copywmQWz5c$default(ColorKt.Color(4279787232L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 4, null);
                Brush.Companion companion2 = Brush.INSTANCE;
                if (this.$isDarkTheme) {
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null))});
                } else {
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.Color(4293062139L), 0.88f, 0.0f, 0.0f, 0.0f, 14, null))});
                }
                Modifier modifierClip2 = ClipKt.clip(BackgroundKt.background$default(modifierM3507shadows4CzXII$default, Brush.Companion.m3800verticalGradient8A3gB4$default(companion2, listListOf, 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), RoundedCornerShapeKt.getCircleShape());
                float fM6302constructorimpl2 = Dp.m6302constructorimpl((float) 1.2d);
                Brush.Companion companion3 = Brush.INSTANCE;
                if (this.$isDarkTheme) {
                    listListOf2 = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(com.rhythmbyte.contactbook.ui.theme.ColorKt.getSky500(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null))});
                } else {
                    listListOf2 = CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.INSTANCE.m3880getWhite0d7_KjU()), Color.m3833boximpl(Color.m3842copywmQWz5c$default(ColorKt.Color(4279787232L), 0.35f, 0.0f, 0.0f, 0.0f, 14, null))});
                }
                BoxKt.Box(BorderKt.border(modifierClip2, new BorderStroke(fM6302constructorimpl2, Brush.Companion.m3800verticalGradient8A3gB4$default(companion3, listListOf2, 0.0f, 0.0f, 0, 14, (Object) null), null), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
                Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.$innerPadding, 0.0f, 2, null);
                Float fValueOf = Float.valueOf(fMo376toPx0680j_4);
                Integer numValueOf = Integer.valueOf(this.$targetIndex);
                composer2.startReplaceGroup(-1894735547);
                ComposerKt.sourceInformation(composer2, "CC(remember):LiquidGliderDateTabs.kt#9igjgp");
                boolean zChangedInstance = composer2.changedInstance(this.$animIndex) | composer2.changedInstance(this.$coroutineScope) | composer2.changed(this.$onDateSelected) | composer2.changed(this.$yesterdayDate) | composer2.changed(this.$todayDate) | composer2.changed(this.$tomorrowDate) | composer2.changed(this.$onCustomDateClick) | composer2.changed(this.$targetIndex) | composer2.changed(fMo376toPx0680j_4);
                MutableState<Boolean> mutableState = this.$isDragging$delegate;
                Animatable<Float, AnimationVector1D> animatable2 = this.$animIndex;
                CoroutineScope coroutineScope2 = this.$coroutineScope;
                Function1<String, Unit> function2 = this.$onDateSelected;
                String str4 = this.$yesterdayDate;
                String str5 = "CC(remember):LiquidGliderDateTabs.kt#9igjgp";
                String str6 = this.$todayDate;
                String str7 = this.$tomorrowDate;
                int i3 = 1;
                Function0<Unit> function3 = this.$onCustomDateClick;
                int i4 = this.$targetIndex;
                LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1 liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1RememberedValue = composer2.rememberedValue();
                if (zChangedInstance || liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1RememberedValue = new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1(mutableState, animatable2, coroutineScope2, function2, str4, str6, str7, function3, i4, fMo376toPx0680j_4, null);
                    composer2.updateRememberedValue(liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1RememberedValue);
                }
                composer2.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM686paddingVpY3zN4$default, fValueOf, numValueOf, (Function2) liquidGliderDateTabsKt$LiquidGliderDateTabs$2$1$1RememberedValue);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Animatable<Float, AnimationVector1D> animatable3 = this.$animIndex;
                int i5 = this.$targetIndex;
                String str8 = this.$selectedDate;
                boolean z = this.$isDarkTheme;
                CoroutineScope coroutineScope3 = this.$coroutineScope;
                Function1<String, Unit> function4 = this.$onDateSelected;
                String str9 = this.$yesterdayDate;
                String str10 = this.$todayDate;
                String str11 = this.$tomorrowDate;
                Function0<Unit> function5 = this.$onCustomDateClick;
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPointerInput);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                boolean z2 = z;
                String str12 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                String str13 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 677298512, "C:LiquidGliderDateTabs.kt#9hgvmo");
                int iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(animatable3.getValue().floatValue()), 0, 3);
                Pair[] pairArr = new Pair[4];
                pairArr[0] = TuplesKt.to(0, "昨日");
                pairArr[1] = TuplesKt.to(1, "今日");
                pairArr[2] = TuplesKt.to(2, "明日");
                pairArr[3] = TuplesKt.to(3, i5 == 3 ? "📅 " + StringsKt.takeLast(str8, 5) : "📅 自訂");
                List<Pair> listListOf3 = CollectionsKt.listOf((Object[]) pairArr);
                composer2.startReplaceGroup(21857453);
                ComposerKt.sourceInformation(composer2, "*273@10562L418,289@11247L39,291@11360L682,283@10998L1552");
                for (Pair pair : listListOf3) {
                    final int iIntValue = ((Number) pair.component1()).intValue();
                    String str14 = (String) pair.component2();
                    int i6 = iCoerceIn == iIntValue ? i3 : 0;
                    if (i6 != 0) {
                        jColor = z2 ? ColorKt.Color(4290438909L) : ColorKt.Color(4279787232L);
                    } else {
                        jColor = ColorKt.Color(z2 ? 4287931320L : 4282865001L);
                    }
                    int i7 = iCoerceIn;
                    final Function0<Unit> function6 = function5;
                    String str15 = str13;
                    String str16 = str12;
                    final String str17 = str11;
                    int i8 = i3;
                    State<Color> stateM117animateColorAsStateeuL9pac = SingleValueAnimationKt.m117animateColorAsStateeuL9pac(jColor, AnimationSpecKt.tween$default(180, 0, null, 6, null), "textColor_" + iIntValue, null, composer2, 48, 8);
                    Composer composer3 = composer2;
                    Modifier modifierClip3 = ClipKt.clip(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, i8, null), RoundedCornerShapeKt.getCircleShape());
                    composer3.startReplaceGroup(21881192);
                    String str18 = str5;
                    ComposerKt.sourceInformation(composer3, str18);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(21885451);
                    ComposerKt.sourceInformation(composer3, str18);
                    boolean zChangedInstance2 = composer3.changedInstance(coroutineScope3) | composer3.changedInstance(animatable3) | composer3.changed(iIntValue) | composer3.changed(function4) | composer3.changed(str9) | composer3.changed(str10) | composer3.changed(str17) | composer3.changed(function6);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Animatable<Float, AnimationVector1D> animatable4 = animatable3;
                        final CoroutineScope coroutineScope4 = coroutineScope3;
                        final Function1<String, Unit> function7 = function4;
                        final String str19 = str9;
                        final String str20 = str10;
                        Function0 function8 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LiquidGliderDateTabsKt.AnonymousClass2.invoke$lambda$7$lambda$5$lambda$4(coroutineScope4, animatable4, iIntValue, function7, str19, str20, str17, function6);
                            }
                        };
                        coroutineScope = coroutineScope4;
                        animatable = animatable4;
                        function1 = function7;
                        str = str19;
                        str2 = str20;
                        str3 = str17;
                        function0 = function6;
                        composer3.updateRememberedValue(function8);
                        objRememberedValue2 = function8;
                    } else {
                        str3 = str17;
                        function0 = function6;
                        animatable = animatable3;
                        coroutineScope = coroutineScope3;
                        function1 = function4;
                        str = str9;
                        str2 = str10;
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM270clickableO2vRcR0$default = ClickableKt.m270clickableO2vRcR0$default(modifierClip3, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str16);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM270clickableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str15);
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
                    Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, 95474203, "C307@12140L392:LiquidGliderDateTabs.kt#9hgvmo");
                    long sp = TextUnitKt.getSp(12);
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    TextKt.m2376Text4IGK_g(str14, (Modifier) null, invoke$lambda$7$lambda$2(stateM117animateColorAsStateeuL9pac), sp, (FontStyle) null, i6 != 0 ? companion4.getBold() : companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6184boximpl(TextAlign.INSTANCE.m6191getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m6241getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 3120, 120274);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer2 = composer;
                    i3 = i8;
                    animatable3 = animatable;
                    coroutineScope3 = coroutineScope;
                    function4 = function1;
                    str9 = str;
                    iCoerceIn = i7;
                    str10 = str2;
                    str11 = str3;
                    function5 = function0;
                    str13 = str15;
                    str12 = str16;
                    str5 = str18;
                    z2 = z2;
                }
                composer.endReplaceGroup();
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
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$5$lambda$4(CoroutineScope coroutineScope, Animatable animatable, int i, Function1 function1, String str, String str2, String str3, Function0 function0) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidGliderDateTabsKt$LiquidGliderDateTabs$2$2$2$1$1(animatable, i, function1, str, str2, str3, function0, null), 3, null);
            return Unit.INSTANCE;
        }

        private static final long invoke$lambda$7$lambda$2(State<Color> state) {
            return state.getValue().m3853unboximpl();
        }
    }
}
