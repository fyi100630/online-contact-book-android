package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.kyant.backdrop.Backdrop;
import com.rhythmbyte.contactbook.data.model.ItemCategory;
import com.rhythmbyte.contactbook.data.model.ItemRecord;
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidButtonKt;
import com.rhythmbyte.contactbook.ui.components.liquid.LiquidToggleKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import io.ktor.sse.ServerSentEventKt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: EditItemDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class EditItemDialogKt$EditItemDialog$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $defaultDate;
    final /* synthetic */ MutableState<String> $details$delegate;
    final /* synthetic */ Backdrop $dialogBackdrop;
    final /* synthetic */ MutableState<String> $dueDate$delegate;
    final /* synthetic */ ItemRecord $initialItem;
    final /* synthetic */ MutableState<Boolean> $isHighPriority$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<ItemRecord, Unit> $onSave;
    final /* synthetic */ MutableState<String> $selectedCategory$delegate;
    final /* synthetic */ MutableState<String> $subject$delegate;
    final /* synthetic */ MutableState<String> $title$delegate;
    final /* synthetic */ MutableState<Boolean> $titleError$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    EditItemDialogKt$EditItemDialog$1$1$1(ItemRecord itemRecord, String str, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, Backdrop backdrop, MutableState<Boolean> mutableState7, Function0<Unit> function0, Function1<? super ItemRecord, Unit> function1) {
        this.$initialItem = itemRecord;
        this.$defaultDate = str;
        this.$selectedCategory$delegate = mutableState;
        this.$dueDate$delegate = mutableState2;
        this.$subject$delegate = mutableState3;
        this.$title$delegate = mutableState4;
        this.$titleError$delegate = mutableState5;
        this.$details$delegate = mutableState6;
        this.$dialogBackdrop = backdrop;
        this.$isHighPriority$delegate = mutableState7;
        this.$onDismiss = function0;
        this.$onSave = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    public final void invoke(Composer composer, int i) {
        final MutableState<String> mutableState;
        final MutableState<String> mutableState2;
        final MutableState<Boolean> mutableState3;
        final MutableState<String> mutableState4;
        final MutableState<String> mutableState5;
        final MutableState<Boolean> mutableState6;
        final MutableState<String> mutableState7;
        final MutableState<String> mutableState8;
        ComposerKt.sourceInformation(composer, "C106@4474L21,103@4346L8639:EditItemDialog.kt#yz3s17");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606773876, i, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemDialog.<anonymous>.<anonymous>.<anonymous> (EditItemDialog.kt:103)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(24)), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            final ItemRecord itemRecord = this.$initialItem;
            String str = this.$defaultDate;
            MutableState<String> mutableState9 = this.$selectedCategory$delegate;
            MutableState<String> mutableState10 = this.$dueDate$delegate;
            MutableState<String> mutableState11 = this.$subject$delegate;
            MutableState<String> mutableState12 = this.$title$delegate;
            MutableState<Boolean> mutableState13 = this.$titleError$delegate;
            MutableState<String> mutableState14 = this.$details$delegate;
            Backdrop backdrop = this.$dialogBackdrop;
            MutableState<Boolean> mutableState15 = this.$isHighPriority$delegate;
            Function0<Unit> function0 = this.$onDismiss;
            final Function1<ItemRecord, Unit> function1 = this.$onSave;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1068477901, "C110@4658L10,111@4723L11,108@4533L279,115@4830L41,117@4924L10,117@4889L75,118@4981L40,119@5038L1686,151@6742L41,161@7225L85,155@6893L16,153@6801L527,166@7346L41,182@8098L85,170@7495L122,177@7810L120,168@7405L796,187@8219L41,197@8718L85,191@8370L16,189@8278L543,202@8839L41,213@9353L85,206@8990L16,204@8898L558,218@9474L41,220@9533L1158,248@10709L41,250@10768L2203:EditItemDialog.kt#yz3s17");
            MutableState<String> mutableState16 = mutableState9;
            MutableState<String> mutableState17 = mutableState10;
            String str2 = str;
            TextKt.m2376Text4IGK_g(itemRecord == null ? "✨ 新增項目" : "✏️ 編輯項目", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            float f = 16;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
            TextKt.m2376Text4IGK_g("選擇分類", (Modifier) null, ColorKt.getSlate400(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 390, 0, 65530);
            Composer composer2 = composer;
            float f2 = 6;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2)), composer2, 6);
            float f3 = 0.0f;
            Object obj = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f2));
            String str3 = "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
            String str4 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str4);
            ?? r10 = 0;
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str5 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str5);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
            Updater.m3343setimpl(composerM3336constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(composerM3336constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            String str6 = "C100@5047L9:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -2050101806, "C:EditItemDialog.kt#yz3s17");
            composer2.startReplaceGroup(1457888988);
            ComposerKt.sourceInformation(composer2, "*132@5753L363,125@5341L1343");
            for (final ItemCategory itemCategory : ItemCategory.getEntries()) {
                boolean zAreEqual = Intrinsics.areEqual(EditItemDialogKt.EditItemDialog$lambda$1(mutableState16), itemCategory.getKey());
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                Modifier modifierClip = ClipKt.clip(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(12)));
                composer2.startReplaceGroup(1457898900);
                ComposerKt.sourceInformation(composer2, "130@5630L11");
                long emerald500 = zAreEqual ? ColorKt.getEmerald500() : Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.endReplaceGroup();
                Modifier modifierM239backgroundbw27NRU$default = BackgroundKt.m239backgroundbw27NRU$default(modifierClip, emerald500, null, 2, null);
                composer2.startReplaceGroup(1019416643);
                ComposerKt.sourceInformation(composer2, "CC(remember):EditItemDialog.kt#9igjgp");
                final String str7 = str2;
                boolean zChanged = composer2.changed(itemCategory) | composer2.changed(str7);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    mutableState7 = mutableState16;
                    mutableState8 = mutableState17;
                    objRememberedValue = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$4$lambda$3$lambda$1$lambda$0(itemCategory, str7, mutableState7, mutableState8);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState7 = mutableState16;
                    mutableState8 = mutableState17;
                }
                composer2.endReplaceGroup();
                Modifier modifierM686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(ClickableKt.m272clickableXHw0xAI$default(modifierM239backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null), f3, Dp.m6302constructorimpl(8), 1, obj);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, r10);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str4);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r10);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM686paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str5);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3336constructorimpl3 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(composerM3336constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(composerM3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3336constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3343setimpl(composerM3336constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1092255230, "C141@6296L362:EditItemDialog.kt#yz3s17");
                String str8 = itemCategory.getIcon() + ServerSentEventKt.SPACE + itemCategory.getTitle();
                String str9 = str6;
                long sp = TextUnitKt.getSp(11);
                FontWeight.Companion companion = FontWeight.INSTANCE;
                FontWeight bold = zAreEqual ? companion.getBold() : companion.getMedium();
                composer2.startReplaceGroup(796058107);
                ComposerKt.sourceInformation(composer2, "145@6607L11");
                long jM3880getWhite0d7_KjU = zAreEqual ? Color.INSTANCE.m3880getWhite0d7_KjU() : MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                composer2.endReplaceGroup();
                mutableState16 = mutableState7;
                mutableState17 = mutableState8;
                TextKt.m2376Text4IGK_g(str8, (Modifier) null, jM3880getWhite0d7_KjU, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131026);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                obj = null;
                rowScopeInstance = rowScopeInstance2;
                f2 = f2;
                str2 = str7;
                str6 = str9;
                str5 = str5;
                str4 = str4;
                str3 = str3;
                f3 = 0.0f;
                r10 = 0;
            }
            String str10 = str6;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            final String str14 = str2;
            float f4 = f2;
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            float f5 = 14;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f5)), composer2, 6);
            String strEditItemDialog$lambda$4 = EditItemDialogKt.EditItemDialog$lambda$4(mutableState11);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f5));
            TextFieldColors textFieldColorsM2026colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(1212526058);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState11;
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$6$lambda$5(mutableState, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState = mutableState11;
            }
            composer.endReplaceGroup();
            final MutableState<String> mutableState18 = mutableState;
            OutlinedTextFieldKt.OutlinedTextField(strEditItemDialog$lambda$4, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6793getLambda1$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6795getLambda2$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_4, textFieldColorsM2026colors0hiis_0, composer, 14156208, 12582912, 0, 1965880);
            float f6 = 10;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f6)), composer, 6);
            String strEditItemDialog$lambda$7 = EditItemDialogKt.EditItemDialog$lambda$7(mutableState12);
            boolean zEditItemDialog$lambda$19 = EditItemDialogKt.EditItemDialog$lambda$19(mutableState13);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f5));
            TextFieldColors textFieldColorsM2026colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(1212545428);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState12;
                mutableState3 = mutableState13;
                objRememberedValue3 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$8$lambda$7(mutableState2, mutableState3, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                mutableState2 = mutableState12;
                mutableState3 = mutableState13;
            }
            composer.endReplaceGroup();
            final MutableState<String> mutableState19 = mutableState2;
            final MutableState<Boolean> mutableState20 = mutableState3;
            OutlinedTextFieldKt.OutlinedTextField(strEditItemDialog$lambda$7, (Function1<? super String, Unit>) objRememberedValue3, modifierFillMaxWidth$default3, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6796getLambda3$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6797getLambda4$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1544672632, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$1$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i2) {
                    ComposerKt.sourceInformation(composer3, "C178@7890L11,178@7852L56:EditItemDialog.kt#yz3s17");
                    if ((i2 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1544672632, i2, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditItemDialog.kt:178)");
                    }
                    if (EditItemDialogKt.EditItemDialog$lambda$19(mutableState3)) {
                        TextKt.m2376Text4IGK_g("請輸入項目名稱", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 6, 0, 131066);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), zEditItemDialog$lambda$19, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_5, textFieldColorsM2026colors0hiis_1, composer, 14156208, 384, 0, 2084664);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f6)), composer, 6);
            String strEditItemDialog$lambda$13 = EditItemDialogKt.EditItemDialog$lambda$13(mutableState17);
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f5));
            TextFieldColors textFieldColorsM2026colors0hiis_2 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(1212573322);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableState4 = mutableState17;
                objRememberedValue4 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$10$lambda$9(mutableState4, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState4 = mutableState17;
            }
            composer.endReplaceGroup();
            final MutableState<String> mutableState21 = mutableState4;
            OutlinedTextFieldKt.OutlinedTextField(strEditItemDialog$lambda$13, (Function1<? super String, Unit>) objRememberedValue4, modifierFillMaxWidth$default4, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6798getLambda5$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6799getLambda6$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_6, textFieldColorsM2026colors0hiis_2, composer, 14156208, 12582912, 0, 1965880);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f6)), composer, 6);
            String strEditItemDialog$lambda$10 = EditItemDialogKt.EditItemDialog$lambda$10(mutableState14);
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f5));
            TextFieldColors textFieldColorsM2026colors0hiis_3 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(1212593162);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                mutableState5 = mutableState14;
                objRememberedValue5 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$12$lambda$11(mutableState5, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState5 = mutableState14;
            }
            composer.endReplaceGroup();
            final MutableState<String> mutableState22 = mutableState5;
            OutlinedTextFieldKt.OutlinedTextField(strEditItemDialog$lambda$10, (Function1<? super String, Unit>) objRememberedValue5, modifierFillMaxWidth$default5, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6800getLambda7$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemDialogKt.INSTANCE.m6801getLambda8$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 4, 2, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_7, textFieldColorsM2026colors0hiis_3, composer, 14156208, 905969664, 0, 1310520);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(12)), composer, 6);
            Modifier modifierM686paddingVpY3zN4$default2 = PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6302constructorimpl(f4), 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, str11);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str12);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM686paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str13);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl4 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3343setimpl(composerM3336constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, str10);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2045523633, "C227@9846L545,240@10412L40,242@10522L18,243@10577L23,241@10473L200:EditItemDialog.kt#yz3s17");
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str12);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str13);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl5 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m3343setimpl(composerM3336constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1541272545, "C232@10120L11,228@9911L256,234@10192L177:EditItemDialog.kt#yz3s17");
            TextKt.m2376Text4IGK_g("📌 置頂與加急提醒", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131026);
            TextKt.m2376Text4IGK_g("開啟後在列表最前排標記並重點顯示", (Modifier) null, ColorKt.getSlate400(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3462, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f6)), composer, 6);
            composer.startReplaceGroup(1458056843);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                mutableState6 = mutableState15;
                objRememberedValue6 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(EditItemDialogKt.access$EditItemDialog$lambda$16(mutableState6));
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            } else {
                mutableState6 = mutableState15;
            }
            Function0 function2 = (Function0) objRememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1458058608);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$18$lambda$17$lambda$16(mutableState6, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            LiquidToggleKt.m6766LiquidToggleM8YrEPQ(function2, (Function1) objRememberedValue7, backdrop, null, null, composer, 54, 24);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(20)), composer, 6);
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, str11);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically2, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str12);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default6);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str13);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM3336constructorimpl6 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(composerM3336constructorimpl6, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(composerM3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3336constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m3343setimpl(composerM3336constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407918630, str10);
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2044346842, "C258@11160L11,255@10997L459,263@11477L40,265@11586L1045,264@11538L1415:EditItemDialog.kt#yz3s17");
            float f7 = 8;
            final MutableState<Boolean> mutableState23 = mutableState6;
            LiquidButtonKt.m6762LiquidButtonePBljHA(function0, backdrop, null, null, false, 0L, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(f), Dp.m6302constructorimpl(f7)), 0.0f, 0.0f, null, ComposableSingletons$EditItemDialogKt.INSTANCE.m6802getLambda9$app_release(), composer, 12582912, 48, 1852);
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f6)), composer, 6);
            composer.startReplaceGroup(1458091918);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemDialog.kt#9igjgp");
            boolean zChanged2 = composer.changed(itemRecord) | composer.changed(str14) | composer.changed(function1);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                final MutableState<String> mutableState24 = mutableState16;
                Function0 function3 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemDialogKt$EditItemDialog$1$1$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditItemDialogKt$EditItemDialog$1$1$1.invoke$lambda$24$lambda$23$lambda$22$lambda$21(itemRecord, str14, function1, mutableState19, mutableState20, mutableState24, mutableState18, mutableState22, mutableState21, mutableState23);
                    }
                };
                composer.updateRememberedValue(function3);
                objRememberedValue8 = function3;
            }
            composer.endReplaceGroup();
            LiquidButtonKt.m6762LiquidButtonePBljHA((Function0) objRememberedValue8, backdrop, null, null, false, ColorKt.getEmerald500(), 0L, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6302constructorimpl(18), Dp.m6302constructorimpl(f7)), 0.0f, 0.0f, null, ComposableSingletons$EditItemDialogKt.INSTANCE.m6794getLambda10$app_release(), composer, 12779520, 48, 1884);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit invoke$lambda$24$lambda$4$lambda$3$lambda$1$lambda$0(ItemCategory itemCategory, String str, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(itemCategory.getKey());
        if (Intrinsics.areEqual(itemCategory.getKey(), "homework") && EditItemDialogKt.EditItemDialog$lambda$13(mutableState2).length() == 0) {
            mutableState2.setValue(LocalDate.parse(str).plusDays(1L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$6$lambda$5(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$8$lambda$7(MutableState mutableState, MutableState mutableState2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        if (!StringsKt.isBlank(it)) {
            EditItemDialogKt.EditItemDialog$lambda$20(mutableState2, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$10$lambda$9(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$12$lambda$11(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$18$lambda$17$lambda$16(MutableState mutableState, boolean z) {
        EditItemDialogKt.EditItemDialog$lambda$17(mutableState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    public static final Unit invoke$lambda$24$lambda$23$lambda$22$lambda$21(ItemRecord itemRecord, String str, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String str2;
        String str3;
        String date;
        String id;
        if (StringsKt.isBlank(EditItemDialogKt.EditItemDialog$lambda$7(mutableState))) {
            EditItemDialogKt.EditItemDialog$lambda$20(mutableState2, true);
            return Unit.INSTANCE;
        }
        if (itemRecord == null || (id = itemRecord.getId()) == null) {
            str2 = "rec-" + System.currentTimeMillis();
        } else {
            String str4 = id;
            if (str4.length() == 0) {
                str4 = null;
            }
            str2 = str4;
            if (str2 == null) {
                str2 = "rec-" + System.currentTimeMillis();
            }
        }
        String str5 = str2;
        if (itemRecord == null || (date = itemRecord.getDate()) == null) {
            str3 = str;
        } else {
            String str6 = date;
            String str7 = str6.length() != 0 ? str6 : null;
            if (str7 == null) {
                str3 = str;
            } else {
                str3 = str7;
            }
        }
        function1.invoke(new ItemRecord(str5, str3, EditItemDialogKt.EditItemDialog$lambda$1(mutableState3), StringsKt.trim((CharSequence) EditItemDialogKt.EditItemDialog$lambda$4(mutableState4)).toString(), StringsKt.trim((CharSequence) EditItemDialogKt.EditItemDialog$lambda$7(mutableState)).toString(), StringsKt.trim((CharSequence) EditItemDialogKt.EditItemDialog$lambda$10(mutableState5)).toString(), StringsKt.trim((CharSequence) EditItemDialogKt.EditItemDialog$lambda$13(mutableState6)).toString(), EditItemDialogKt.EditItemDialog$lambda$16(mutableState7) ? "high" : "normal"));
        return Unit.INSTANCE;
    }
}
