package com.rhythmbyte.contactbook.ui.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.ui.components.liquidtabs.LiquidBottomTabKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LiquidGlassBottomBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4 implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ List<ItemCategory> $categories;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableIntState $currentTab$delegate;
    final /* synthetic */ long $inactiveColor;
    final /* synthetic */ PagerState $pagerState;

    /* JADX WARN: Multi-variable type inference failed */
    LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4(List<? extends ItemCategory> list, CoroutineScope coroutineScope, PagerState pagerState, MutableIntState mutableIntState, long j) {
        this.$categories = list;
        this.$coroutineScope = coroutineScope;
        this.$pagerState = pagerState;
        this.$currentTab$delegate = mutableIntState;
        this.$inactiveColor = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope rowScope, Composer composer, int i) {
        RowScope LiquidBottomTabs = rowScope;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(LiquidBottomTabs, "$this$LiquidBottomTabs");
        ComposerKt.sourceInformation(composer2, "C*107@4346L206,113@4571L615,105@4256L930:LiquidGlassBottomBar.kt#7ivg5k");
        int i2 = (i & 6) == 0 ? i | (composer2.changed(LiquidBottomTabs) ? 4 : 2) : i;
        if ((i2 & 19) != 18 || !composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1214761874, i2, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar.<anonymous>.<anonymous> (LiquidGlassBottomBar.kt:102)");
            }
            List<ItemCategory> list = this.$categories;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final PagerState pagerState = this.$pagerState;
            final MutableIntState mutableIntState = this.$currentTab$delegate;
            final long j = this.$inactiveColor;
            final int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final ItemCategory itemCategory = (ItemCategory) obj;
                final boolean z = LiquidGlassBottomBarKt.LiquidGlassBottomBar$lambda$16$lambda$3(mutableIntState) == i3;
                composer2.startReplaceGroup(-1051038983);
                ComposerKt.sourceInformation(composer2, "CC(remember):LiquidGlassBottomBar.kt#9igjgp");
                boolean zChanged = composer2.changed(i3) | composer2.changedInstance(coroutineScope) | composer2.changed(pagerState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4.invoke$lambda$2$lambda$1$lambda$0(i3, coroutineScope, mutableIntState, pagerState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                LiquidBottomTabKt.LiquidBottomTab(LiquidBottomTabs, (Function0) objRememberedValue, null, z, false, ComposableLambdaKt.rememberComposableLambda(1455184861, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope LiquidBottomTab, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(LiquidBottomTab, "$this$LiquidBottomTab");
                        ComposerKt.sourceInformation(composer3, "C114@4593L256,120@4870L298:LiquidGlassBottomBar.kt#7ivg5k");
                        if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1455184861, i5, -1, "com.rhythmbyte.contactbook.ui.components.LiquidGlassBottomBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiquidGlassBottomBar.kt:114)");
                            }
                            IconKt.m1833Iconww6aTOc(LiquidGlassBottomBarKt.iconVector(itemCategory), LiquidGlassBottomBarKt.tabTitle(itemCategory), SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(24)), j, composer3, 384, 0);
                            TextKt.m2376Text4IGK_g(LiquidGlassBottomBarKt.tabTitle(itemCategory), (Modifier) null, j, TextUnitKt.getSp(11), (FontStyle) null, z ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 3072, 122834);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), composer2, (i2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 10);
                LiquidBottomTabs = rowScope;
                composer2 = composer;
                i3 = i4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(int i, CoroutineScope coroutineScope, MutableIntState mutableIntState, PagerState pagerState) {
        mutableIntState.setIntValue(i);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiquidGlassBottomBarKt$LiquidGlassBottomBar$2$4$1$1$1$1(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }
}
