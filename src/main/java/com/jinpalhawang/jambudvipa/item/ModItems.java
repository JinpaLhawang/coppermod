package com.jinpalhawang.jambudvipa.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.jinpalhawang.jambudvipa.CopperMod;
import com.jinpalhawang.jambudvipa.item.tool.ItemSword;

public class ModItems {

  public static ItemBase ingotCopper;
  public static ItemSword copperSword;

  public static void init() {
    ingotCopper = register(new ItemOre("ingot_copper", "ingotCopper")
        .setCreativeTab(CreativeTabs.MATERIALS));
    copperSword = register(new ItemSword(CopperMod.copperToolMaterial, "copper_sword"));
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
