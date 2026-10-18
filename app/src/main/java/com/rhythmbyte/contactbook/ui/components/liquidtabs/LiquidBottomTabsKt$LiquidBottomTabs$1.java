package com.rhythmbyte.contactbook.ui.components.liquidtabs;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderEffect;
import android.os.Build;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidRenderEffect_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.kyant.backdrop.Backdrop;
import com.kyant.backdrop.BackdropEffectScope;
import com.kyant.backdrop.DrawBackdropModifierKt;
import com.kyant.backdrop.backdrops.CombinedBackdropKt;
import com.kyant.backdrop.backdrops.LayerBackdrop;
import com.kyant.backdrop.backdrops.LayerBackdropModifierKt;
import com.kyant.backdrop.effects.BlurKt;
import com.kyant.backdrop.effects.ColorFilterKt;
import com.kyant.backdrop.effects.LensKt;
import com.kyant.backdrop.highlight.Highlight;
import com.kyant.backdrop.shadow.InnerShadow;
import com.kyant.backdrop.shadow.Shadow;
import com.kyant.shapes.Capsule;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: LiquidBottomTabs.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class LiquidBottomTabsKt$LiquidBottomTabs$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Backdrop $backdrop;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isLightTheme;
    final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
    final /* synthetic */ long $resolvedAccentColor;
    final /* synthetic */ long $resolvedContainerColor;
    final /* synthetic */ Function0<Integer> $selectedTabIndex;
    final /* synthetic */ LayerBackdrop $tabsBackdrop;
    final /* synthetic */ int $tabsCount;

    /* JADX WARN: Multi-variable type inference failed */
    LiquidBottomTabsKt$LiquidBottomTabs$1(Function0<Integer> function0, Function1<? super Integer, Unit> function1, Backdrop backdrop, long j, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, boolean z, LayerBackdrop layerBackdrop, boolean z2, int i, long j2) {
        this.$selectedTabIndex = function0;
        this.$onTabSelected = function1;
        this.$backdrop = backdrop;
        this.$resolvedContainerColor = j;
        this.$content = function3;
        this.$enabled = z;
        this.$tabsBackdrop = layerBackdrop;
        this.$isLightTheme = z2;
        this.$tabsCount = i;
        this.$resolvedAccentColor = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        final boolean z;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C80@3351L7,85@3511L27,86@3566L306,95@3915L7,96@3975L24,97@4028L88,100@4151L1320,132@5514L235,132@5481L268,140@5794L251,140@5758L287,149@6082L480,164@6629L66,169@6796L13,170@6841L160,175@7036L262,181@7336L36,162@6572L1068,192@7723L81,196@7875L2166,191@7650L2391,249@10153L240,257@10622L48,258@10700L13,259@10745L315,267@11094L161,271@11286L145,275@11467L259,282@11761L385,289@12184L409,246@10051L2648:LiquidBottomTabs.kt#9hgvmo");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650484939, i2, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs.<anonymous> (LiquidBottomTabs.kt:80)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            final Density density = (Density) objConsume;
            final float fM6255getMaxWidthimpl = (Constraints.m6255getMaxWidthimpl(BoxWithConstraints.mo591getConstraintsmsEJaDk()) - density.mo376toPx0680j_4(Dp.m6302constructorimpl(8.0f))) / this.$tabsCount;
            composer.startReplaceGroup(-1709574195);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final Animatable animatable = (Animatable) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709572156);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged = composer.changed(density);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$4$lambda$3(animatable, BoxWithConstraints, density));
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            final State state = (State) objRememberedValue2;
            composer.endReplaceGroup();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z2 = objConsume2 == LayoutDirection.Ltr;
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.startReplaceGroup(-1709557590);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged2 = composer.changed(this.$selectedTabIndex);
            Function0<Integer> function0 = this.$selectedTabIndex;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(function0.invoke().intValue());
                composer.updateRememberedValue(objRememberedValue4);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709552422);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged3 = composer.changed(coroutineScope);
            Function0<Integer> function1 = this.$selectedTabIndex;
            final int i3 = this.$tabsCount;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                z = z2;
                objRememberedValue5 = new DampedDragAnimation(coroutineScope, function1.invoke().intValue(), RangesKt.rangeTo(0.0f, i3 - 1), 0.001f, 1.0f, 1.3928572f, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$12$lambda$9((DampedDragAnimation) obj, (Offset) obj2);
                    }
                }, new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$12$lambda$10(i3, coroutineScope, mutableIntState, animatable, (DampedDragAnimation) obj);
                    }
                }, new Function3() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$12$lambda$11(fM6255getMaxWidthimpl, z, i3, coroutineScope, animatable, (DampedDragAnimation) obj, (IntSize) obj2, (Offset) obj3);
                    }
                });
                composer.updateRememberedValue(objRememberedValue5);
            } else {
                z = z2;
            }
            final DampedDragAnimation dampedDragAnimation = (DampedDragAnimation) objRememberedValue5;
            composer.endReplaceGroup();
            Function0<Integer> function2 = this.$selectedTabIndex;
            composer.startReplaceGroup(-1709509891);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged4 = composer.changed(this.$selectedTabIndex) | composer.changed(mutableIntState);
            Function0<Integer> function3 = this.$selectedTabIndex;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = (Function2) new LiquidBottomTabsKt$LiquidBottomTabs$1$1$1(function3, mutableIntState, null);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(function2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer, 0);
            composer.startReplaceGroup(-1709500915);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged5 = composer.changed(mutableIntState) | composer.changedInstance(dampedDragAnimation) | composer.changed(this.$onTabSelected);
            Function1<Integer, Unit> function4 = this.$onTabSelected;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = (Function2) new LiquidBottomTabsKt$LiquidBottomTabs$1$2$1(mutableIntState, dampedDragAnimation, function4, null);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(dampedDragAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, 0);
            composer.startReplaceGroup(-1709491470);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged6 = composer.changed(coroutineScope);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new InteractiveHighlight(coroutineScope, new Function2() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$16$lambda$15(z, dampedDragAnimation, fM6255getMaxWidthimpl, state, (Size) obj, (Offset) obj2);
                    }
                });
                composer.updateRememberedValue(objRememberedValue8);
            }
            InteractiveHighlight interactiveHighlight = (InteractiveHighlight) objRememberedValue8;
            composer.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1709474380);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged7 = composer.changed(state);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$18$lambda$17(state, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue9);
            Backdrop backdrop = this.$backdrop;
            composer.startReplaceGroup(-1709469089);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            Object objRememberedValue10 = composer.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$20$lambda$19();
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            Function0 function5 = (Function0) objRememberedValue10;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709467502);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            Object objRememberedValue11 = composer.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$22$lambda$21((BackdropEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue11);
            }
            Function1 function6 = (Function1) objRememberedValue11;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709461160);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue12 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$24$lambda$23(dampedDragAnimation, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue12);
            }
            Function1 function7 = (Function1) objRememberedValue12;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709451786);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged8 = composer.changed(this.$resolvedContainerColor);
            final long j = this.$resolvedContainerColor;
            Object objRememberedValue13 = composer.rememberedValue();
            if (zChanged8 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$26$lambda$25(j, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue13);
            }
            composer.endReplaceGroup();
            Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(SizeKt.fillMaxWidth$default(SizeKt.m715height3ABfNKs(DrawBackdropModifierKt.drawBackdrop(modifierGraphicsLayer, backdrop, function5, function6, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : null, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : null, (3064 & 32) != 0 ? null : null, (3064 & 64) != 0 ? null : function7, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue13, (3064 & 2048) != 0 ? null : null).then(interactiveHighlight.getModifier()), Dp.m6302constructorimpl(64.0f)), 0.0f, 1, null), Dp.m6302constructorimpl(4.0f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Function3<RowScope, Composer, Integer, Unit> function8 = this.$content;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            function8.invoke(RowScopeInstance.INSTANCE, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            ProvidableCompositionLocal<Function0<Float>> localLiquidBottomTabScale = LiquidBottomTabKt.getLocalLiquidBottomTabScale();
            composer.startReplaceGroup(-1709439357);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance2 = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue14 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$28$lambda$27(dampedDragAnimation));
                    }
                };
                composer.updateRememberedValue(objRememberedValue14);
            }
            composer.endReplaceGroup();
            providedValueArr[0] = localLiquidBottomTabScale.provides((Function0) objRememberedValue14);
            providedValueArr[1] = LiquidBottomTabKt.getLocalLiquidBottomTabInteractive().provides(false);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(947213941, true, new AnonymousClass9(this.$tabsBackdrop, state, this.$backdrop, dampedDragAnimation, this.$resolvedContainerColor, interactiveHighlight, this.$resolvedAccentColor, this.$content), composer, 54), composer, ProvidedValue.$stable | 48);
            Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6302constructorimpl(4.0f), 0.0f, 2, null);
            composer.startReplaceGroup(-1709361438);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChanged9 = composer.changed(z) | composer.changedInstance(dampedDragAnimation) | composer.changed(fM6255getMaxWidthimpl) | composer.changed(state);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChanged9 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue15 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$30$lambda$29(z, dampedDragAnimation, fM6255getMaxWidthimpl, state, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue15);
            }
            composer.endReplaceGroup();
            Modifier modifierThen = GraphicsLayerModifierKt.graphicsLayer(modifierM686paddingVpY3zN4$default, (Function1) objRememberedValue15).then(this.$enabled ? interactiveHighlight.getGestureModifier() : Modifier.INSTANCE).then(this.$enabled ? dampedDragAnimation.getModifier() : Modifier.INSTANCE);
            Backdrop backdropRememberCombinedBackdrop = CombinedBackdropKt.rememberCombinedBackdrop(this.$backdrop, this.$tabsBackdrop, composer, 0);
            composer.startReplaceGroup(-1709344161);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            Object objRememberedValue16 = composer.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue16 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$32$lambda$31();
                    }
                };
                composer.updateRememberedValue(objRememberedValue16);
            }
            Function0 function9 = (Function0) objRememberedValue16;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709342419);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance3 = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue17 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue17 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$34$lambda$33(dampedDragAnimation, (BackdropEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue17);
            }
            Function1 function10 = (Function1) objRememberedValue17;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709331405);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance4 = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue18 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue18 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$36$lambda$35(dampedDragAnimation);
                    }
                };
                composer.updateRememberedValue(objRememberedValue18);
            }
            Function0 function11 = (Function0) objRememberedValue18;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709325277);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance5 = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue19 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue19 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$38$lambda$37(dampedDragAnimation);
                    }
                };
                composer.updateRememberedValue(objRememberedValue19);
            }
            Function0 function12 = (Function0) objRememberedValue19;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709319371);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance6 = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue20 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue20 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$40$lambda$39(dampedDragAnimation);
                    }
                };
                composer.updateRememberedValue(objRememberedValue20);
            }
            Function0 function13 = (Function0) objRememberedValue20;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709309837);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance7 = composer.changedInstance(dampedDragAnimation);
            Object objRememberedValue21 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue21 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$42$lambda$41(dampedDragAnimation, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue21);
            }
            Function1 function14 = (Function1) objRememberedValue21;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1709296277);
            ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
            boolean zChangedInstance8 = composer.changedInstance(dampedDragAnimation) | composer.changed(this.$isLightTheme);
            final boolean z3 = this.$isLightTheme;
            Object objRememberedValue22 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue22 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$44$lambda$43(dampedDragAnimation, z3, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue22);
            }
            composer.endReplaceGroup();
            BoxKt.Box(SizeKt.fillMaxWidth(SizeKt.m715height3ABfNKs(DrawBackdropModifierKt.drawBackdrop(modifierThen, backdropRememberCombinedBackdrop, function9, function10, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function11, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : function12, (3064 & 32) != 0 ? null : function13, (3064 & 64) != 0 ? null : function14, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue22, (3064 & 2048) != 0 ? null : null), Dp.m6302constructorimpl(56.0f)), 1.0f / this.$tabsCount), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4$lambda$3(Animatable animatable, BoxWithConstraintsScope boxWithConstraintsScope, Density density) {
        float fFloatValue = ((Number) animatable.getValue()).floatValue() / Constraints.m6255getMaxWidthimpl(boxWithConstraintsScope.mo591getConstraintsmsEJaDk());
        if (fFloatValue < -1.0f) {
            fFloatValue = -1.0f;
        }
        if (fFloatValue > 1.0f) {
            fFloatValue = 1.0f;
        }
        return density.mo376toPx0680j_4(Dp.m6302constructorimpl(4.0f)) * Math.signum(fFloatValue) * EasingFunctionsKt.getEaseOut().transform(Math.abs(fFloatValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$7(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9(DampedDragAnimation DampedDragAnimation, Offset offset) {
        Intrinsics.checkNotNullParameter(DampedDragAnimation, "$this$DampedDragAnimation");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$10(int i, CoroutineScope coroutineScope, MutableIntState mutableIntState, Animatable animatable, DampedDragAnimation DampedDragAnimation) {
        Intrinsics.checkNotNullParameter(DampedDragAnimation, "$this$DampedDragAnimation");
        int iCoerceIn = RangesKt.coerceIn(Math.round(DampedDragAnimation.getTargetValue()), 0, i - 1);
        mutableIntState.setIntValue(iCoerceIn);
        DampedDragAnimation.animateToValue(iCoerceIn);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$2$1(animatable, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(float f, boolean z, int i, CoroutineScope coroutineScope, Animatable animatable, DampedDragAnimation DampedDragAnimation, IntSize intSize, Offset offset) {
        Intrinsics.checkNotNullParameter(DampedDragAnimation, "$this$DampedDragAnimation");
        float targetValue = DampedDragAnimation.getTargetValue() + ((Offset.m3602getXimpl(offset.getPackedValue()) / f) * (z ? 1.0f : -1.0f));
        float f2 = i - 1;
        if (targetValue < 0.0f) {
            targetValue = 0.0f;
        }
        if (targetValue <= f2) {
            f2 = targetValue;
        }
        DampedDragAnimation.updateValue(f2);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidBottomTabsKt$LiquidBottomTabs$1$dampedDragAnimation$1$3$1(animatable, offset, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset invoke$lambda$16$lambda$15(boolean z, DampedDragAnimation dampedDragAnimation, float f, State state, Size size, Offset offset) {
        float fM3671getWidthimpl;
        float fInvoke$lambda$5;
        if (z) {
            fM3671getWidthimpl = (dampedDragAnimation.getValue() + 0.5f) * f;
            fInvoke$lambda$5 = invoke$lambda$5(state);
        } else {
            fM3671getWidthimpl = Size.m3671getWidthimpl(size.getPackedValue()) - ((dampedDragAnimation.getValue() + 0.5f) * f);
            fInvoke$lambda$5 = invoke$lambda$5(state);
        }
        return Offset.m3591boximpl(OffsetKt.Offset(fM3671getWidthimpl + fInvoke$lambda$5, Size.m3668getHeightimpl(size.getPackedValue()) / 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(State state, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationX(invoke$lambda$5(state));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape invoke$lambda$20$lambda$19() {
        return new Capsule(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$21(BackdropEffectScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        ColorFilterKt.vibrancy(drawBackdrop);
        BlurKt.m6639blur3YTHUZs$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(8.0f)), 0, 2, null);
        LensKt.lens$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(24.0f)), drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(24.0f)), false, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23(DampedDragAnimation dampedDragAnimation, GraphicsLayerScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        float fLerp = MathHelpersKt.lerp(1.0f, (drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(16.0f)) / Size.m3671getWidthimpl(drawBackdrop.getSize())) + 1.0f, dampedDragAnimation.getPressProgress());
        drawBackdrop.setScaleX(fLerp);
        drawBackdrop.setScaleY(fLerp);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$26$lambda$25(long j, DrawScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        DrawScope.m4393drawRectnJ9OG0$default(drawBackdrop, j, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$28$lambda$27(DampedDragAnimation dampedDragAnimation) {
        return MathHelpersKt.lerp(1.0f, 1.2f, dampedDragAnimation.getPressProgress());
    }

    /* JADX INFO: renamed from: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9, reason: invalid class name */
    /* JADX INFO: compiled from: LiquidBottomTabs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass9 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Backdrop $backdrop;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ DampedDragAnimation $dampedDragAnimation;
        final /* synthetic */ InteractiveHighlight $interactiveHighlight;
        final /* synthetic */ State<Float> $panelOffset$delegate;
        final /* synthetic */ long $resolvedAccentColor;
        final /* synthetic */ long $resolvedContainerColor;
        final /* synthetic */ LayerBackdrop $tabsBackdrop;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(LayerBackdrop layerBackdrop, State<Float> state, Backdrop backdrop, DampedDragAnimation dampedDragAnimation, long j, InteractiveHighlight interactiveHighlight, long j2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
            this.$tabsBackdrop = layerBackdrop;
            this.$panelOffset$delegate = state;
            this.$backdrop = backdrop;
            this.$dampedDragAnimation = dampedDragAnimation;
            this.$resolvedContainerColor = j;
            this.$interactiveHighlight = interactiveHighlight;
            this.$resolvedAccentColor = j2;
            this.$content = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Modifier.Companion companionGraphicsLayer;
            ComposerKt.sourceInformation(composer, "C199@7961L2,202@8079L74,207@8266L13,208@8315L369,217@8722L173,221@8937L36,197@7889L2142:LiquidBottomTabs.kt#9hgvmo");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(947213941, i, -1, "com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabs.<anonymous>.<anonymous> (LiquidBottomTabs.kt:197)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(86031091);
                ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierLayerBackdrop = LayerBackdropModifierKt.layerBackdrop(AlphaKt.alpha(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) objRememberedValue), 0.0f), this.$tabsBackdrop);
                composer.startReplaceGroup(86034939);
                ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                boolean zChanged = composer.changed(this.$panelOffset$delegate);
                final State<Float> state = this.$panelOffset$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$3$lambda$2(state, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayerBackdrop, (Function1) objRememberedValue2);
                Backdrop backdrop = this.$backdrop;
                composer.startReplaceGroup(86040862);
                ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$5$lambda$4();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(86042786);
                ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(this.$dampedDragAnimation);
                final DampedDragAnimation dampedDragAnimation = this.$dampedDragAnimation;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$7$lambda$6(dampedDragAnimation, (BackdropEffectScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1 = (Function1) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(86055614);
                ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(this.$dampedDragAnimation);
                final DampedDragAnimation dampedDragAnimation2 = this.$dampedDragAnimation;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$9$lambda$8(dampedDragAnimation2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function2 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(86062357);
                ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                boolean zChanged2 = composer.changed(this.$resolvedContainerColor);
                final long j = this.$resolvedContainerColor;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$11$lambda$10(j, (DrawScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m715height3ABfNKs(DrawBackdropModifierKt.drawBackdrop(modifierGraphicsLayer, backdrop, function0, function1, (3064 & 8) != 0 ? DrawBackdropModifierKt.DefaultHighlight : function2, (3064 & 16) != 0 ? DrawBackdropModifierKt.DefaultShadow : null, (3064 & 32) != 0 ? null : null, (3064 & 64) != 0 ? null : null, (3064 & 128) != 0 ? null : null, (3064 & 256) != 0 ? null : null, (3064 & 512) != 0 ? DrawBackdropModifierKt.DefaultOnDrawBackdrop : null, (3064 & 1024) != 0 ? null : (Function1) objRememberedValue6, (3064 & 2048) != 0 ? null : null).then(this.$interactiveHighlight.getModifier()), Dp.m6302constructorimpl(56.0f)), 0.0f, 1, null), Dp.m6302constructorimpl(4.0f), 0.0f, 2, null);
                composer.startReplaceGroup(86072208);
                ComposerKt.sourceInformation(composer, "229@9352L448");
                if (Build.VERSION.SDK_INT >= 31) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer.startReplaceGroup(86076049);
                    ComposerKt.sourceInformation(composer, "CC(remember):LiquidBottomTabs.kt#9igjgp");
                    boolean zChanged3 = composer.changed(this.$resolvedAccentColor);
                    final long j2 = this.$resolvedAccentColor;
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabsKt$LiquidBottomTabs$1$9$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiquidBottomTabsKt$LiquidBottomTabs$1.AnonymousClass9.invoke$lambda$13$lambda$12(j2, (GraphicsLayerScope) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    composer.endReplaceGroup();
                    companionGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue7);
                } else {
                    companionGraphicsLayer = Modifier.INSTANCE;
                }
                composer.endReplaceGroup();
                Modifier modifierThen = modifierM686paddingVpY3zN4$default.then(companionGraphicsLayer);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierThen);
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
                Updater.m3343setimpl(composerM3336constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(composerM3336constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
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
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver clearAndSetSemantics) {
            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(State state, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationX(LiquidBottomTabsKt$LiquidBottomTabs$1.invoke$lambda$5(state));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Shape invoke$lambda$5$lambda$4() {
            return new Capsule(null, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(DampedDragAnimation dampedDragAnimation, BackdropEffectScope drawBackdrop) {
            Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
            float pressProgress = dampedDragAnimation.getPressProgress();
            ColorFilterKt.vibrancy(drawBackdrop);
            BlurKt.m6639blur3YTHUZs$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(8.0f)), 0, 2, null);
            LensKt.lens$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(24.0f)) * pressProgress, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(24.0f)) * pressProgress, false, false, 12, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Highlight invoke$lambda$9$lambda$8(DampedDragAnimation dampedDragAnimation) {
            return Highlight.m6640copyi1RSzL4$default(Highlight.INSTANCE.getDefault(), 0.0f, 0.0f, dampedDragAnimation.getPressProgress(), null, 11, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(long j, DrawScope drawBackdrop) {
            Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
            DrawScope.m4393drawRectnJ9OG0$default(drawBackdrop, j, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(long j, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(ColorKt.m3897toArgb8_81llA(j), BlendMode.SRC_IN));
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
            graphicsLayer.setRenderEffect(AndroidRenderEffect_androidKt.asComposeRenderEffect(renderEffectCreateColorFilterEffect));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$30$lambda$29(boolean z, DampedDragAnimation dampedDragAnimation, float f, State state, GraphicsLayerScope graphicsLayer) {
        float fM3671getWidthimpl;
        float fInvoke$lambda$5;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        if (z) {
            fM3671getWidthimpl = dampedDragAnimation.getValue() * f;
            fInvoke$lambda$5 = invoke$lambda$5(state);
        } else {
            fM3671getWidthimpl = Size.m3671getWidthimpl(graphicsLayer.getSize()) - ((dampedDragAnimation.getValue() + 1.0f) * f);
            fInvoke$lambda$5 = invoke$lambda$5(state);
        }
        graphicsLayer.setTranslationX(fM3671getWidthimpl + fInvoke$lambda$5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape invoke$lambda$32$lambda$31() {
        return new Capsule(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$34$lambda$33(DampedDragAnimation dampedDragAnimation, BackdropEffectScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        float pressProgress = dampedDragAnimation.getPressProgress();
        LensKt.lens$default(drawBackdrop, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(10.0f)) * pressProgress, drawBackdrop.mo376toPx0680j_4(Dp.m6302constructorimpl(14.0f)) * pressProgress, false, true, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Highlight invoke$lambda$36$lambda$35(DampedDragAnimation dampedDragAnimation) {
        return Highlight.m6640copyi1RSzL4$default(Highlight.INSTANCE.getDefault(), 0.0f, 0.0f, dampedDragAnimation.getPressProgress(), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow invoke$lambda$38$lambda$37(DampedDragAnimation dampedDragAnimation) {
        return new Shadow(0.0f, 0L, 0L, dampedDragAnimation.getPressProgress(), 0, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InnerShadow invoke$lambda$40$lambda$39(DampedDragAnimation dampedDragAnimation) {
        float pressProgress = dampedDragAnimation.getPressProgress();
        return new InnerShadow(Dp.m6302constructorimpl(Dp.m6302constructorimpl(8.0f) * pressProgress), 0L, 0L, pressProgress, 0, 22, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$42$lambda$41(DampedDragAnimation dampedDragAnimation, GraphicsLayerScope drawBackdrop) {
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        drawBackdrop.setScaleX(dampedDragAnimation.getScaleX());
        drawBackdrop.setScaleY(dampedDragAnimation.getScaleY());
        float velocity = dampedDragAnimation.getVelocity() / 10.0f;
        float scaleX = drawBackdrop.getScaleX();
        float f = 0.75f * velocity;
        if (f < -0.2f) {
            f = -0.2f;
        }
        if (f > 0.2f) {
            f = 0.2f;
        }
        drawBackdrop.setScaleX(scaleX / (1.0f - f));
        float scaleY = drawBackdrop.getScaleY();
        float f2 = velocity * 0.25f;
        float f3 = f2 >= -0.2f ? f2 : -0.2f;
        drawBackdrop.setScaleY(scaleY * (1.0f - (f3 <= 0.2f ? f3 : 0.2f)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$44$lambda$43(DampedDragAnimation dampedDragAnimation, boolean z, DrawScope drawBackdrop) {
        long jM3842copywmQWz5c$default;
        Intrinsics.checkNotNullParameter(drawBackdrop, "$this$drawBackdrop");
        float pressProgress = dampedDragAnimation.getPressProgress();
        if (z) {
            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        DrawScope.m4393drawRectnJ9OG0$default(drawBackdrop, jM3842copywmQWz5c$default, 0L, 0L, 1.0f - pressProgress, null, null, 0, 118, null);
        DrawScope.m4393drawRectnJ9OG0$default(drawBackdrop, Color.m3842copywmQWz5c$default(Color.INSTANCE.m3869getBlack0d7_KjU(), pressProgress * 0.03f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
