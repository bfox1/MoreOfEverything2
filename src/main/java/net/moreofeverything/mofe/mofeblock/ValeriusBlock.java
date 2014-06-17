package net.moreofeverything.mofe.mofeblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class ValeriusBlock extends Block {

	public ValeriusBlock() {
		super(Material.rock);
		setBlockName("ValeriusBlock");
		setCreativeTab(MofeTabs.MOFE2);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setResistance(5.0F);
	}

}
