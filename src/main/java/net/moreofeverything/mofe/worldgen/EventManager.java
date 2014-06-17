package net.moreofeverything.mofe.worldgen;

import cpw.mods.fml.common.registry.GameRegistry;

public class EventManager {
	
	static WorldGeneration worldgenerator = new WorldGeneration();
	
	public static void registerWorldGen()
	{
		GameRegistry.registerWorldGenerator(worldgenerator, 0);
	}

}
