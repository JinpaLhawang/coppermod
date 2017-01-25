package com.jinpalhawang.jambudvipa.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.jinpalhawang.jambudvipa.block.ModBlocks;
import com.jinpalhawang.jambudvipa.item.ModItems;

public class ModRecipes {

  public static void init() {
    GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
    GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET, "I I", " I ", 'I', "ingotCopper"));
  }

}
