package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemAxe;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class SatanAxe extends ItemAxe {

	public SatanAxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("SatanAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);
	}

}
