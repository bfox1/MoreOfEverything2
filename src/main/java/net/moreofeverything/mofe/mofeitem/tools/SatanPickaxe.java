package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemPickaxe;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class SatanPickaxe extends ItemPickaxe {

	public SatanPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("SatanPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);
	}

}
