package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemSpade;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class SatanSpade extends ItemSpade {

	public SatanSpade(ToolMaterial material) {
		super(material);
		setUnlocalizedName("SatanShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);
	}

}
