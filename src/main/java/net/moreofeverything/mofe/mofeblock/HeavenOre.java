package net.moreofeverything.mofe.mofeblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;

public class HeavenOre extends Block {

	public HeavenOre(boolean par2) {
		super(Material.glass);
		this.setBlockName("HeavenOre");
		this.setCreativeTab(MofeTabs.MOFE2);
		this.setStepSound(soundTypeStone);
		this.setHardness(5.0F);
		this.setHarvestLevel("Pickaxe", 6);
		this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		this.setResistance(5.0F);
		this.setLightOpacity(0);


	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube() {
		return false;
	}


	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

    


}
