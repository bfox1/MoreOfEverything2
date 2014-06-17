package net.moreofeverything.mofe.mofeblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class Granite extends Block {

	public Granite() {
		super(Material.rock);
		setBlockName("Granite");
		setCreativeTab(MofeTabs.MOFE2);
		setStepSound(soundTypeStone);
		setHardness(1.0F);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setResistance(3.0F);
	}

}
