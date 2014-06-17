package net.moreofeverything.mofe.mofeitem.gem;

import net.minecraft.item.Item;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class PatriciusGem extends Item {
	
	public PatriciusGem()
	{
		super();
		setUnlocalizedName("PatriciusGem");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2);
	}

}
