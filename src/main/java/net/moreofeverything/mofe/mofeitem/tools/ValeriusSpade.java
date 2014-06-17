package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemSpade;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class ValeriusSpade extends ItemSpade {

	public ValeriusSpade(ToolMaterial material) {
		super(material);
		setUnlocalizedName("ValeriusShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);	}

}
