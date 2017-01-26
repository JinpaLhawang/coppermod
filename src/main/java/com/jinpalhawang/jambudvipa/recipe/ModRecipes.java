package com.jinpalhawang.jambudvipa.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.jinpalhawang.jambudvipa.block.ModBlocks;
import com.jinpalhawang.jambudvipa.item.ModItems;

public class ModRecipes {

  public static void init() {

    // ORE
    GameRegistry.addSmelting(ModBlocks.oreCopper,
        new ItemStack(ModItems.ingotCopper), 0.7f);

    // ITEMS
    GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET,
        "I I", " I ", 'I', "ingotCopper"));
    GameRegistry.addShapedRecipe(new ItemStack(Items.SHIELD),
        "PCP", "PPP", " P ", 'C', ModItems.ingotCopper, 'P', Blocks.PLANKS);

    // TOOLS
    // Copper Sword
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword),
        "C  ", "C  ", "S  ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword),
        " C ", " C ", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword),
        "  C", "  C", "  S", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    // Copper Pickaxe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperPickaxe),
        "CCC", " S ", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    // Copper Axe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperAxe),
        "CC ", "CS ", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperAxe),
        " CC", " SC", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    // Copper Shovel
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperShovel),
        "C  ", "S  ", "S  ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperShovel),
        " C ", " S ", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperShovel),
        "  C", "  S", "  S", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    // Copper Hoe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHoe),
        "CC ", " S ", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHoe),
        " CC", " S ", " S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);

    // ARMOR
    // Copper Helmet
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHelmet),
        "CCC", "C C", "   ", 'C', ModItems.ingotCopper);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHelmet),
        "   ", "CCC", "C C", 'C', ModItems.ingotCopper);
    // Copper Chestplate
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperChestplate),
        "C C", "CCC", "CCC", 'C', ModItems.ingotCopper);
    // Copper Leggings
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperLeggings),
        "CCC", "C C", "C C", 'C', ModItems.ingotCopper);
    // Copper Boots
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperBoots),
        "C C", "C C", "   ", 'C', ModItems.ingotCopper);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperBoots),
        "   ", "C C", "C C", 'C', ModItems.ingotCopper);
  }

}
