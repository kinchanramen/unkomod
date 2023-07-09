package net.unkomod.unko.unkomod.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class unkoToolMaterial implements ToolMaterial {
    //耐久値
    @Override
    public int getDurability() {
        return 0;
    }

    //採掘速度
    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    //攻撃力
    @Override
    public float getAttackDamage() {
        return 0;
    }

    //採掘レベル
    @Override
    public int getMiningLevel() {
        return 0;
    }

    //エンチャント適正
    @Override
    public int getEnchantability() {
        return 0;
    }

    //修理に必要な材料
    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
