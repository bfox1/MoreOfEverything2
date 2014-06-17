package net.moreofeverything.mofe.mofeitem.tools;

import net.minecraft.item.ItemPickaxe;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class PatriciusPickaxe extends ItemPickaxe {

	public PatriciusPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("PatriciusPickaxe");
		setTextureName(Reference.MODID + ":"
				+ getUnlocalizedName().substring(5));
		setCreativeTab(MofeTabs.MOFE2Tools);

	}
}