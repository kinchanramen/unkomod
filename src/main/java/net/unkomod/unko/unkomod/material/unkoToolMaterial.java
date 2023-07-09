package net.unkomod.unko.unkomod.material;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.unkomod.unko.unkomod.Unkomod;
import net.unkomod.unko.unkomod.item.items;

public class unkoToolMaterial implements ToolMaterial {
    //耐久値
    @Override
    public int getDurability() {
        return 2031;
    }

    //採掘速度
    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    //攻撃力
    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    //採掘レベル
    @Override
    public int getMiningLevel() {
        return 4;
    }

    //エンチャント適正
    @Override
    public int getEnchantability() {
        return 100;
    }

    //修理に必要な材料
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(items.UNKO);
    }
}
