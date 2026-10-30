package fredipixel.curruptedsoul.item;

import fredipixel.curruptedsoul.CorruptedSoul;
import fredipixel.curruptedsoul.item.custome.GlassFlask;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {


    public static final Item GLASS_FLASK = registerItem("glass_flask", properties -> new GlassFlask(properties.overrideDescription("Glass Flask")));

    public static final  Item FLASK_OF_SOULS = registerItem("flask_of_souls", Item::new);
    public static final  Item SOUL_ALLOY = registerItem("soul_alloy", Item::new);









    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CorruptedSoul.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CorruptedSoul.MOD_ID, name)))));
    }

    public static  void registerModItems(){
        CorruptedSoul.LOGGER.info("Register Mod Items for " + CorruptedSoul.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(fabricCreativeModeTabOutput -> {
            fabricCreativeModeTabOutput.accept(GLASS_FLASK);
            fabricCreativeModeTabOutput.accept(FLASK_OF_SOULS);
        });
    }
}
