package com.jinpalhawang.jambudvipa.item.tool;

import net.minecraft.item.Item;

import com.jinpalhawang.jambudvipa.CopperMod;
import com.jinpalhawang.jambudvipa.item.ItemModelProvider;

public class ItemPickaxe
    extends net.minecraft.item.ItemPickaxe
    implements ItemModelProvider {

  private String name;

  public ItemPickaxe(ToolMaterial material, String name) {
    super(material);
    setRegistryName(name);
    setUnlocalizedName(name);
    this.name = name;
  }
  
  @Override
  public void registerItemModel(Item item) {
    CopperMod.proxy.registerItemRenderer(this, 0, name);
  }

}
