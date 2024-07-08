package net.unkomod.unko.unkomod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.*;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


import java.util.Objects;
import java.util.logging.Logger;

import static net.unkomod.unko.unkomod.Unkomod.MOD_ID;

public class special_item extends Item {
    public static Logger LOGGER;
    public static String aho,boke;
    public special_item(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world,PlayerEntity playerEntity,Hand hand){
        playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_BREAK,1.0F,1.0F);
        playerEntity.getInventory().removeOne(Items.TOTEM_OF_UNDYING.getDefaultStack());
        playerEntity.setStackInHand(Hand.OFF_HAND, Items.TOTEM_OF_UNDYING.getDefaultStack());
        LOGGER=Logger.getLogger(MOD_ID);
        LOGGER.info("He is cheating");
        playerEntity.sendMessage(Text.of("あほばかぼけ"));
        playerEntity.sendMessage(Text.of(aho= String.valueOf(playerEntity.getPos())));
        playerEntity.sendMessage(Text.of(boke=playerEntity.getEntityName()));
        playerEntity.sendMessage(Text.of(playerEntity.getInventory().toString()));
        return new TypedActionResult<>(ActionResult.SUCCESS,playerEntity.getStackInHand(hand));
    }
}
