package net.moreofeverything.mofe.mofeblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class HeavenOre extends Block {

	public HeavenOre() {
		super(Material.rock);
		this.setBlockName("HeavenOre");
		this.setCreativeTab(MofeTabs.MOFE2);
		this.setStepSound(soundTypeStone);
		this.setHardness(5.0F);
		this.setHarvestLevel("Pickaxe", 6);
		this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		this.setResistance(5.0F);
		this.setLightOpacity(8);
	}

}
