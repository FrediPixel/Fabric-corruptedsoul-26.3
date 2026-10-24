package fredipixel.curruptedsoul.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import fredipixel.curruptedsoul.CorruptedSoul;
import fredipixel.curruptedsoul.block.ModBlocks;
import fredipixel.curruptedsoul.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab CORRUPTEDSOUL_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CorruptedSoul.MOD_ID, "corruptedsouls"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLASS_FLASK))
                    .title(Component.translatable("creativemodetab.curruptedsoul.curruptedsoul"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.GLASS_FLASK);
                        output.accept(ModItems.FLASK_OF_SOULS);
                        output.accept(ModItems.SOUL_ALLOY);
                        output.accept(ModBlocks.BLOCK_OF_SOUL_ALLOY);

                    }).build());



    public static void registerModCreativeModeTabs() {
        CorruptedSoul.LOGGER.info("Registering Creative Mode Tabs for " + CorruptedSoul.MOD_ID);
    }
}