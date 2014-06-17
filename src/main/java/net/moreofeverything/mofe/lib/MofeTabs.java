package net.moreofeverything.mofe.lib;

import net.minecraft.creativetab.CreativeTabs;

public class MofeTabs {
	
	public static CreativeTabs MOFE2;
	
	public static CreativeTabs MOFE2Tools;
	
	public static void registerCreativeTabs()
	{
	MOFE2 = new MOFETabsManager(CreativeTabs.getNextID(), "MOFE2");
	MOFE2Tools = new MOFETabsManager(CreativeTabs.getNextID(), "MOFE2Tools");
	}
}
