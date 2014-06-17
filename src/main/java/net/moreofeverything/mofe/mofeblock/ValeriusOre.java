package net.moreofeverything.mofe.mofeblock;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;
import net.moreofeverything.mofe.mofeitem.ItemM;

public class ValeriusOre extends Block {

	public ValeriusOre() {
		super(Material.rock);
		this.setBlockName("ValeriusOre");
		this.setCreativeTab(MofeTabs.MOFE2);
		this.setStepSound(soundTypeStone);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		this.setResistance(5.0F);
		
		
	}
	

    
	@Override
    public Item getItemDropped(int metadat, Random random, int fortune)
    {
        return ItemM.valeriusGem;
    }
	
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
	@Override
    public int quantityDroppedWithBonus(int par1, Random par2)
    {
        return this.quantityDropped(par2) + par2.nextInt(par1 + 1);
    }


	/**
     * Returns the quantity of items to drop on block destruction.
     */
	@Override
    public int quantityDropped(Random par1)
    {
        return 2 + par1.nextInt(2);
    }
	


}
