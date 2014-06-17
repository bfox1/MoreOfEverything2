package net.moreofeverything.mofe.mofeblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class PatriciusBlock extends Block {

	public PatriciusBlock() {
		super(Material.rock);
		setBlockName("PatriciusBlock");
		setCreativeTab(MofeTabs.MOFE2);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setResistance(5.0F);
	}

}
