package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemAxe;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class PatriciusAxe extends ItemAxe {

	public PatriciusAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setUnlocalizedName("PatriciusAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);	}

}
