package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemSpade;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class PatriciusSpade extends ItemSpade {

	public PatriciusSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		setUnlocalizedName("PatriciusShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);	}

}
