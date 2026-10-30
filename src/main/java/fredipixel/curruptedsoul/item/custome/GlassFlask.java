package fredipixel.curruptedsoul.item.custome;

import fredipixel.curruptedsoul.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;

public class GlassFlask extends Item {

    public GlassFlask(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity entity, InteractionHand hand
    ) {
        if (!(entity instanceof Warden)) {
            return InteractionResult.PASS;
        }

        Level level = player.level();

        if (!level.isClientSide()) {


            level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ALLAY_DEATH, SoundSource.NEUTRAL, 2.0F, 1.0F);

            player.setItemInHand(hand, ItemUtils.createFilledResult(stack, player, new ItemStack(ModItems.FLASK_OF_SOULS.getDefaultInstance().getItem())));
        }


        return InteractionResult.SUCCESS;
    }
}
