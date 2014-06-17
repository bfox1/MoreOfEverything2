package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemPickaxe;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class ValeriusPickaxe extends ItemPickaxe {

	public ValeriusPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("ValeriusPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);	}

}
