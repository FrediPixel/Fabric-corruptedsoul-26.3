package fredipixel.curruptedsoul;

import fredipixel.curruptedsoul.block.ModBlocks;
import fredipixel.curruptedsoul.creativemodetab.ModCreativeModeTabs;
import fredipixel.curruptedsoul.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CorruptedSoul implements ModInitializer {
	public static final String MOD_ID = "corruptedsoul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}



}
