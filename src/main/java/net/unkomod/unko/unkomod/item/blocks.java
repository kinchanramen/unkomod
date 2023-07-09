package net.unkomod.unko.unkomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.unkomod.unko.unkomod.Unkomod.MOD_ID;

public class blocks {
    public static Block UNKO_BLOCK=new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F,3.0F).mapColor(MapColor.BROWN));
    public static Item UNKO_BLOCK_ITEM=new BlockItem(UNKO_BLOCK,new Item.Settings());
    public static void Init(){
        Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"unko_block"),UNKO_BLOCK);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"unko_block"),UNKO_BLOCK_ITEM);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((entries -> entries.add(UNKO_BLOCK_ITEM)));
    }
}
