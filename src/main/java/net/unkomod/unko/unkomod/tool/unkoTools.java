package net.unkomod.unko.unkomod.tool;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.unkomod.unko.unkomod.material.unkoToolMaterial;

import static net.unkomod.unko.unkomod.Unkomod.MOD_ID;

public class unkoTools {
    public static unkoToolMaterial UNKO_TOOL_MATERIAL=new unkoToolMaterial();
    public static Item UNKO_SWORD=new SwordItem(UNKO_TOOL_MATERIAL,3,-3.0F,new Item.Settings());
    public static Item UNKO_AXE=new AxeItem(UNKO_TOOL_MATERIAL,6,-3.0F,new Item.Settings());
    public static Item UNKO_PICKAXE=new PickaxeItem(UNKO_TOOL_MATERIAL,1,-1.0F,new Item.Settings());
    public static Item UNKO_SHOVEL=new ShovelItem(UNKO_TOOL_MATERIAL,1,-1.0F,new Item.Settings());
    public static Item UNKO_HOE=new HoeItem(UNKO_TOOL_MATERIAL,-3,-3.0F,new Item.Settings());
    public static void Init(){
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko_sword"),UNKO_SWORD);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko_axe"),UNKO_AXE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko_pickaxe"),UNKO_PICKAXE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko_shovel"),UNKO_SHOVEL);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko_hoe"),UNKO_HOE);
        //クリエイティブタブに追加
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(UNKO_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(UNKO_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(UNKO_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(UNKO_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(UNKO_HOE));
    }
}
