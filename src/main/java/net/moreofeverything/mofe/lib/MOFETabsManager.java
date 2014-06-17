package net.moreofeverything.mofe.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.moreofeverything.mofe.mofeitem.ItemM;

public class MOFETabsManager extends CreativeTabs {

	public MOFETabsManager(int id, String name) {
		super(id, name);
	}

	@Override
	public Item getTabIconItem() {
		return ItemM.valeriusGem;
	}

}
