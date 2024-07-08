package net.unkomod.unko.unkomod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.unkomod.unko.unkomod.item.blocks;
import net.unkomod.unko.unkomod.item.items;
import net.unkomod.unko.unkomod.tool.unkoTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Unkomod implements ModInitializer{

    public static String MOD_ID="unkomod";
    public static final Logger LOGGER= LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.error("-- ModInitializer --");
        blocks.Init();
        items.Init();
        unkoTools.Init();
    }
}