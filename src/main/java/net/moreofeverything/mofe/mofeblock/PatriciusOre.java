package net.moreofeverything.mofe.mofeblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class PatriciusOre extends Block {

	public PatriciusOre() {
		super(Material.rock);
		this.setBlockName("PatriciusOre");
		this.setCreativeTab(MofeTabs.MOFE2);
		this.setStepSound(soundTypeStone);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		this.setResistance(10.0F);

		
		
	}

	

	


}
