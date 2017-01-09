package com.jinpalhawang.jambudvipa.item;

import com.jinpalhawang.jambudvipa.CopperMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

  protected String name;

  public ItemBase(String name) {
    this.name = name;
    setUnlocalizedName(name);
    setRegistryName(name);
  }

  public void registerItemModel() {
    CopperMod.proxy.registerItemRenderer(this, 0, name);
  }

  @Override
  public ItemBase setCreativeTab(CreativeTabs tab) {
    super.setCreativeTab(tab);
    return this;
  }

}
