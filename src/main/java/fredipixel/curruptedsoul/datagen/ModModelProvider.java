package fredipixel.curruptedsoul.datagen;

import fredipixel.curruptedsoul.block.ModBlocks;
import fredipixel.curruptedsoul.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
    blockModelGenerators.createTrivialCube(ModBlocks.BLOCK_OF_SOUL_ALLOY);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.GLASS_FLASK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLASK_OF_SOULS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SOUL_ALLOY, ModelTemplates.FLAT_ITEM);
    }
}
