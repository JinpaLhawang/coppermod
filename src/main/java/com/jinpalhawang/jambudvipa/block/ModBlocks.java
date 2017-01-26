package com.jinpalhawang.jambudvipa.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.jinpalhawang.jambudvipa.item.ItemModelProvider;
import com.jinpalhawang.jambudvipa.item.ItemOreDict;

public class ModBlocks {

  public static BlockOre oreCopper;

  public static void init() {
    oreCopper = register(new BlockOre("copper_ore", "oreCopper")
        .setCreativeTab(CreativeTabs.MATERIALS));
  }

  private static <T extends Block> T register(T block, ItemBlock itemBlock) {
    GameRegistry.register(block);
    if (itemBlock != null) {
      GameRegistry.register(itemBlock);

      if (block instanceof ItemModelProvider) {
        ((ItemModelProvider) block).registerItemModel(itemBlock);
      }
      if (block instanceof ItemOreDict) {
        ((ItemOreDict) block).initOreDict();
      }
      if (itemBlock instanceof ItemOreDict) {
        ((ItemOreDict) itemBlock).initOreDict();
      }
    }

    return block;
  }

  private static <T extends Block> T register(T block) {
    ItemBlock itemBlock = new ItemBlock(block);
    itemBlock.setRegistryName(block.getRegistryName());
    return register(block, itemBlock);
  }

}
