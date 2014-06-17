package net.moreofeverything.mofe.mofeblock;

import net.minecraft.block.Block;
import net.moreofeverything.mofe.help.ReferenceHelper;

public class BlockM {
	


	public static Block valeriusOre;
	public static Block patriciusOre;
	
	public static Block valeriusBlock;
	public static Block patriciusBlock;
	
	public static Block granite;
	public static Block graniteSmooth;

    public static Block satanOre;
    public static Block satanBlock;
    
    public static Block heavenOre;
    public static Block heavenBlock;
    
    public static Block poweredBlock;
    
    public static Block sacredCrystalBlock;
    

	
	public static void init()
	{
		valeriusOre = new ValeriusOre();
		patriciusOre = new PatriciusOre();

		heavenOre = new HeavenOre();
		
		valeriusBlock = new ValeriusBlock();
		patriciusBlock = new PatriciusBlock();
		satanBlock = new SatanBlock();
		
		granite = new Granite();
		graniteSmooth = new GraniteSmooth();
	}
	
	public static void registerInit()
	{
		ReferenceHelper.registerBlock(valeriusOre);
		ReferenceHelper.registerBlock(patriciusOre);
		ReferenceHelper.registerBlock(heavenOre);
		
		ReferenceHelper.registerBlock(valeriusBlock);
		ReferenceHelper.registerBlock(patriciusBlock);
		ReferenceHelper.registerBlock(satanBlock);
		
		ReferenceHelper.registerBlock(granite);
		ReferenceHelper.registerBlock(graniteSmooth);
	}

}
