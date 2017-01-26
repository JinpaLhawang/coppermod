package com.jinpalhawang.jambudvipa.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.jinpalhawang.jambudvipa.CopperMod;
import com.jinpalhawang.jambudvipa.item.tool.ItemAxe;
import com.jinpalhawang.jambudvipa.item.tool.ItemPickaxe;
import com.jinpalhawang.jambudvipa.item.tool.ItemShovel;
import com.jinpalhawang.jambudvipa.item.tool.ItemSword;

public class ModItems {

  // INGOTS
  public static ItemBase ingotCopper;

  // TOOLS
  public static ItemSword copperSword;
  public static ItemPickaxe copperPickaxe;
  public static ItemAxe copperAxe;
  public static ItemShovel copperShovel;
  public static ItemSword copperHoe;

  // ARMOR
  public static ItemArmor copperHelmet;
  public static ItemArmor copperChestplate;
  public static ItemArmor copperLeggings;
  public static ItemArmor copperBoots;

  public static void init() {

    // INGOTS
    ingotCopper = register(new ItemOre("copper_ingot", "ingotCopper")
        .setCreativeTab(CreativeTabs.MATERIALS));

    // TOOLS
    copperSword = register(new ItemSword(CopperMod.copperToolMaterial,
        "copper_sword"));
    copperPickaxe = register(new ItemPickaxe(CopperMod.copperToolMaterial,
        "copper_pickaxe"));
    copperAxe = register(new ItemAxe(CopperMod.copperToolMaterial,
        "copper_axe"));
    copperShovel = register(new ItemShovel(CopperMod.copperToolMaterial,
        "copper_shovel"));
    copperHoe = register(new ItemSword(CopperMod.copperToolMaterial,
        "copper_hoe"));

    // ARMOR
    copperHelmet = register(new ItemArmor(CopperMod.copperArmorMaterial,
        EntityEquipmentSlot.HEAD, "copper_helmet"));
    copperChestplate = register(new ItemArmor(CopperMod.copperArmorMaterial,
        EntityEquipmentSlot.CHEST, "copper_chestplate"));
    copperLeggings = register(new ItemArmor(CopperMod.copperArmorMaterial,
        EntityEquipmentSlot.LEGS, "copper_leggings"));
    copperBoots = register(new ItemArmor(CopperMod.copperArmorMaterial,
        EntityEquipmentSlot.FEET, "copper_boots"));
  }

  private static <T extends Item> T register(T item) {
    GameRegistry.register(item);

    if (item instanceof ItemModelProvider) {
      ((ItemModelProvider) item).registerItemModel(item);
    }
    if (item instanceof ItemOreDict) {
      ((ItemOreDict) item).initOreDict();
    }

    return item;
  }

}
