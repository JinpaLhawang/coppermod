package com.jinpalhawang.jambudvipa.item;

import com.jinpalhawang.jambudvipa.CopperMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {

  private String name;

  public ItemArmor(ArmorMaterial materialIn,
      EntityEquipmentSlot slot, String name) {
    super(materialIn, 0, slot);

    setRegistryName(name);
    setUnlocalizedName(name);

    this.name = name;
  }

  @Override
  public void registerItemModel(Item item) {
    CopperMod.proxy.registerItemRenderer(this, 0, name);
  }

}
