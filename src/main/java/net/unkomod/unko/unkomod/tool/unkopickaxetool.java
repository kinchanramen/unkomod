package net.unkomod.unko.unkomod.tool;

import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class unkopickaxetool extends MiningToolItem
{
    public unkopickaxetool(float attackDamage, float attackSpeed, ToolMaterial material, TagKey<Block> effectiveBlocks, Settings settings) {
        super(attackDamage, attackSpeed, material, effectiveBlocks, settings);
    }
}
