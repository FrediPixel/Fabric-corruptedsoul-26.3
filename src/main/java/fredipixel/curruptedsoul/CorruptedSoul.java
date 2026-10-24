package fredipixel.curruptedsoul;

import fredipixel.curruptedsoul.items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CorruptedSoul implements ModInitializer {
	public static final String MOD_ID = "corruptedsoul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}


}
