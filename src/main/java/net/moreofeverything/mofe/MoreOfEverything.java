package net.moreofeverything.mofe;

import net.moreofeverything.mofe.help.Reference;
import net.moreofeverything.mofe.lib.MofeTabs;
import net.moreofeverything.mofe.mofeblock.BlockM;
import net.moreofeverything.mofe.mofeitem.ItemM;
import net.moreofeverything.mofe.recipes.Recipes;
import net.moreofeverything.mofe.worldgen.EventManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MoreOfEverything {

	/*
	 * blocks and items registry go here
	 */
	
	//WorldGeneration worldgenerator = new WorldGeneration();
	@EventHandler
	public void init(FMLPreInitializationEvent event) {
		MofeTabs.registerCreativeTabs();
		BlockM.init();
		ItemM.init();
		BlockM.registerInit();
		ItemM.registerInit();
		Recipes.registerBlocks();
		Recipes.registerItems();
		


	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		//GameRegistry.registerWorldGenerator(worldgenerator, 0);
		EventManager.registerWorldGen();
	}
}
