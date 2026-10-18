package com.rhythmbyte.contactbook.ui.screens;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import com.rhythmbyte.contactbook.ui.components.LiquidGlassPillKt;
import com.rhythmbyte.contactbook.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: EditItemScreen.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class EditItemScreenKt$EditItemScreen$5$1$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $details$delegate;
    final /* synthetic */ MutableState<String> $dueDate$delegate;
    final /* synthetic */ String $nextDay;
    final /* synthetic */ MutableState<String> $subject$delegate;
    final /* synthetic */ MutableState<String> $title$delegate;
    final /* synthetic */ MutableState<Boolean> $titleError$delegate;
    final /* synthetic */ String $tomorrow;

    EditItemScreenKt$EditItemScreen$5$1$1$2(String str, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, String str2, MutableState<String> mutableState5) {
        this.$tomorrow = str;
        this.$subject$delegate = mutableState;
        this.$title$delegate = mutableState2;
        this.$titleError$delegate = mutableState3;
        this.$dueDate$delegate = mutableState4;
        this.$nextDay = str2;
        this.$details$delegate = mutableState5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        final MutableState<Boolean> mutableState;
        final MutableState<String> mutableState2;
        final MutableState<String> mutableState3;
        ComposerKt.sourceInformation(composer, "C311@13919L5192:EditItemScreen.kt#yz3s17");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1294559611, i, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditItemScreen.kt:311)");
            }
            Modifier modifierM684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(18));
            final String str = this.$tomorrow;
            final MutableState<String> mutableState4 = this.$subject$delegate;
            final MutableState<String> mutableState5 = this.$title$delegate;
            MutableState<Boolean> mutableState6 = this.$titleError$delegate;
            MutableState<String> mutableState7 = this.$dueDate$delegate;
            final String str2 = this.$nextDay;
            final MutableState<String> mutableState8 = this.$details$delegate;
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
            ComposerKt.sourceInformationMarkerStart(composer, 457239866, "C321@14481L101,315@14097L16,313@13989L619,326@14634L41,346@15674L101,330@14807L146,337@15190L208,328@14701L1100,351@15827L41,364@16579L101,355@16002L16,353@15894L812,369@16732L40,392@18361L41,403@18962L101,396@18536L16,394@18428L661:EditItemScreen.kt#yz3s17");
            String strEditItemScreen$lambda$6 = EditItemScreenKt.EditItemScreen$lambda$6(mutableState4);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f = 14;
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            TextFieldColors textFieldColorsM2026colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(14748045);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditItemScreenKt$EditItemScreen$5$1$1$2.invoke$lambda$13$lambda$1$lambda$0(mutableState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(strEditItemScreen$lambda$6, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6807getLambda3$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6808getLambda4$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_4, textFieldColorsM2026colors0hiis_0, composer, 14156208, 12582912, 0, 1965880);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
            String strEditItemScreen$lambda$9 = EditItemScreenKt.EditItemScreen$lambda$9(mutableState5);
            boolean zEditItemScreen$lambda$21 = EditItemScreenKt.EditItemScreen$lambda$21(mutableState6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            TextFieldColors textFieldColorsM2026colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(14770895);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState6;
                objRememberedValue2 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditItemScreenKt$EditItemScreen$5$1$1$2.invoke$lambda$13$lambda$3$lambda$2(mutableState5, mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState = mutableState6;
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(strEditItemScreen$lambda$9, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6809getLambda5$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6810getLambda6$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1814195687, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C339@15316L11,339@15278L56:EditItemScreen.kt#yz3s17");
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1814195687, i2, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditItemScreen.kt:338)");
                        }
                        if (EditItemScreenKt.EditItemScreen$lambda$21(mutableState)) {
                            TextKt.m2376Text4IGK_g("請輸入項目名稱", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131066);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54), zEditItemScreen$lambda$21, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 4, 2, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_5, textFieldColorsM2026colors0hiis_1, composer, 14156208, 905970048, 0, 1298232);
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
            String strEditItemScreen$lambda$15 = EditItemScreenKt.EditItemScreen$lambda$15(mutableState7);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            TextFieldColors textFieldColorsM2026colors0hiis_2 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(14809005);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState7;
                objRememberedValue3 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditItemScreenKt$EditItemScreen$5$1$1$2.invoke$lambda$13$lambda$5$lambda$4(mutableState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                mutableState2 = mutableState7;
            }
            composer.endReplaceGroup();
            MutableState<String> mutableState9 = mutableState2;
            OutlinedTextFieldKt.OutlinedTextField(strEditItemScreen$lambda$15, (Function1<? super String, Unit>) objRememberedValue3, modifierFillMaxWidth$default3, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6811getLambda7$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6812getLambda8$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6813getLambda9$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_6, textFieldColorsM2026colors0hiis_2, composer, 114819504, 12582912, 0, 1965624);
            float f2 = 8;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f2)), composer, 6);
            composer.startReplaceGroup(14835967);
            ComposerKt.sourceInformation(composer, "371@16854L1455");
            Intrinsics.checkNotNull(str);
            if (str.length() > 0) {
                Arrangement.HorizontalOrVertical horizontalOrVerticalM564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6302constructorimpl(f2));
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
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
                ComposerKt.sourceInformationMarkerStart(composer, -521045678, "C378@17416L22,379@17473L189,375@17074L588,385@18035L21,386@18091L188,382@17695L584:EditItemScreen.kt#yz3s17");
                composer.startReplaceGroup(-1956469408);
                ComposerKt.sourceInformation(composer, "376@17200L11");
                long emerald500 = Intrinsics.areEqual(EditItemScreenKt.EditItemScreen$lambda$15(mutableState9), str) ? ColorKt.getEmerald500() : Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
                long emerald501 = Intrinsics.areEqual(EditItemScreenKt.EditItemScreen$lambda$15(mutableState9), str) ? ColorKt.getEmerald500() : Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceGroup(-1956460814);
                ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
                boolean zChanged = composer.changed(str);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    mutableState3 = mutableState9;
                    objRememberedValue4 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditItemScreenKt$EditItemScreen$5$1$1$2.invoke$lambda$13$lambda$10$lambda$7$lambda$6(str, mutableState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState3 = mutableState9;
                }
                composer.endReplaceGroup();
                LiquidGlassPillKt.m6754LiquidGlassPillDTcfvLk(null, emerald500, emerald501, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-572380028, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$1$5$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        ComposerKt.sourceInformation(composer2, "C380@17511L117:EditItemScreen.kt#yz3s17");
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-572380028, i2, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditItemScreen.kt:380)");
                        }
                        long sp = TextUnitKt.getSp(11);
                        composer2.startReplaceGroup(61222888);
                        ComposerKt.sourceInformation(composer2, "380@17606L11");
                        long jM3880getWhite0d7_KjU = Intrinsics.areEqual(EditItemScreenKt.EditItemScreen$lambda$15(mutableState3), str) ? Color.INSTANCE.m3880getWhite0d7_KjU() : MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                        composer2.endReplaceGroup();
                        TextKt.m2376Text4IGK_g("明日截止", (Modifier) null, jM3880getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 24576, 1);
                composer.startReplaceGroup(-1956449537);
                ComposerKt.sourceInformation(composer, "383@17820L11");
                long emerald502 = Intrinsics.areEqual(EditItemScreenKt.EditItemScreen$lambda$15(mutableState3), str2) ? ColorKt.getEmerald500() : Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
                long emerald503 = Intrinsics.areEqual(EditItemScreenKt.EditItemScreen$lambda$15(mutableState3), str2) ? ColorKt.getEmerald500() : Color.m3842copywmQWz5c$default(Color.INSTANCE.m3880getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceGroup(-1956441007);
                ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
                boolean zChanged2 = composer.changed(str2);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditItemScreenKt$EditItemScreen$5$1$1$2.invoke$lambda$13$lambda$10$lambda$9$lambda$8(str2, mutableState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                LiquidGlassPillKt.m6754LiquidGlassPillDTcfvLk(null, emerald502, emerald503, (Function0) objRememberedValue5, ComposableLambdaKt.rememberComposableLambda(2105166651, true, new Function2<Composer, Integer, Unit>() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$1$5$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        ComposerKt.sourceInformation(composer2, "C387@18129L116:EditItemScreen.kt#yz3s17");
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2105166651, i2, -1, "com.rhythmbyte.contactbook.ui.screens.EditItemScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditItemScreen.kt:387)");
                        }
                        long sp = TextUnitKt.getSp(11);
                        composer2.startReplaceGroup(61242663);
                        ComposerKt.sourceInformation(composer2, "387@18223L11");
                        long jM3880getWhite0d7_KjU = Intrinsics.areEqual(EditItemScreenKt.EditItemScreen$lambda$15(mutableState3), str2) ? Color.INSTANCE.m3880getWhite0d7_KjU() : MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                        composer2.endReplaceGroup();
                        TextKt.m2376Text4IGK_g("後天截止", (Modifier) null, jM3880getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 24576, 1);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            }
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6302constructorimpl(f)), composer, 6);
            String strEditItemScreen$lambda$12 = EditItemScreenKt.EditItemScreen$lambda$12(mutableState8);
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM967RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6302constructorimpl(f));
            TextFieldColors textFieldColorsM2026colors0hiis_3 = OutlinedTextFieldDefaults.INSTANCE.m2026colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, ColorKt.getEmerald500(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 48, 0, 0, 3072, 2147481599, 4095);
            composer.startReplaceGroup(14890093);
            ComposerKt.sourceInformation(composer, "CC(remember):EditItemScreen.kt#9igjgp");
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.rhythmbyte.contactbook.ui.screens.EditItemScreenKt$EditItemScreen$5$1$1$2$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditItemScreenKt$EditItemScreen$5$1$1$2.invoke$lambda$13$lambda$12$lambda$11(mutableState8, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(strEditItemScreen$lambda$12, (Function1<? super String, Unit>) objRememberedValue6, modifierFillMaxWidth$default5, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6804getLambda10$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditItemScreenKt.INSTANCE.m6805getLambda11$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 6, 3, (MutableInteractionSource) null, (Shape) roundedCornerShapeM967RoundedCornerShape0680j_7, textFieldColorsM2026colors0hiis_3, composer, 14156208, 905969664, 0, 1310520);
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
    public static final Unit invoke$lambda$13$lambda$1$lambda$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$3$lambda$2(MutableState mutableState, MutableState mutableState2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        if (!StringsKt.isBlank(it)) {
            EditItemScreenKt.EditItemScreen$lambda$22(mutableState2, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$5$lambda$4(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$10$lambda$7$lambda$6(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$10$lambda$9$lambda$8(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }
}
