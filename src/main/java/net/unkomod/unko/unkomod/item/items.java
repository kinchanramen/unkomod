package net.unkomod.unko.unkomod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.unkomod.unko.unkomod.Unkomod.MOD_ID;

public class items {
    public static Item UNKO=new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,400,0),1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,100,0),1.0F).build()).maxCount(64));
    public static Item SPECIAL_UNKO=new Item(new FabricItemSettings());

    public static void Init(){
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko"),UNKO);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((entries -> entries.add(UNKO)));
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"special_unko"),UNKO);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((entries -> entries.add(SPECIAL_UNKO)));
    }
}
