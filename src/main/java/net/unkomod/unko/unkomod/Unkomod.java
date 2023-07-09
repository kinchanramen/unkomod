package net.unkomod.unko.unkomod;

import net.fabricmc.api.ModInitializer;
import net.unkomod.unko.unkomod.item.blocks;
import net.unkomod.unko.unkomod.item.items;

public class Unkomod implements ModInitializer {
    public static String MOD_ID= "unkomod";
    @Override
    public void onInitialize() {

        items.Init();
        blocks.Init();
    }
}