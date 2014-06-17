package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemAxe;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class ValeriusAxe extends ItemAxe {

	public ValeriusAxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("ValeriusAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);	}

}
