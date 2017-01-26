package com.jinpalhawang.jambudvipa.item.tool;

import net.minecraft.item.Item;

import com.jinpalhawang.jambudvipa.CopperMod;
import com.jinpalhawang.jambudvipa.item.ItemModelProvider;

public class ItemAxe
    extends net.minecraft.item.ItemAxe
    implements ItemModelProvider {

  private String name;

  public ItemAxe(ToolMaterial material, String name) {
    super(material, 8f, -3.1f);
    setRegistryName(name);
    setUnlocalizedName(name);
    this.name = name;
  }
  
  @Override
  public void registerItemModel(Item item) {
    CopperMod.proxy.registerItemRenderer(this, 0, name);
  }

}
