package net.moreofeverything.mofe.mofeitem;

import net.minecraft.item.Item;
import net.moreofeverything.mofe.help.ReferenceHelper;
import net.moreofeverything.mofe.material.ToolMaterialMofe;
import net.moreofeverything.mofe.mofeitem.gem.DestabilizedIngot;
import net.moreofeverything.mofe.mofeitem.gem.HeavenGem;
import net.moreofeverything.mofe.mofeitem.gem.PatriciusGem;
import net.moreofeverything.mofe.mofeitem.gem.PoweredGem;
import net.moreofeverything.mofe.mofeitem.gem.SacredCrystal;
import net.moreofeverything.mofe.mofeitem.gem.SacredPowerCrystal;
import net.moreofeverything.mofe.mofeitem.gem.SatanGem;
import net.moreofeverything.mofe.mofeitem.gem.SatanPoweredIngot;
import net.moreofeverything.mofe.mofeitem.gem.TaintedGem;
import net.moreofeverything.mofe.mofeitem.gem.ValeriusGem;
import net.moreofeverything.mofe.mofeitem.tools.PatriciusAxe;
import net.moreofeverything.mofe.mofeitem.tools.PatriciusPickaxe;
import net.moreofeverything.mofe.mofeitem.tools.PatriciusSpade;
import net.moreofeverything.mofe.mofeitem.tools.SatanAxe;
import net.moreofeverything.mofe.mofeitem.tools.SatanPickaxe;
import net.moreofeverything.mofe.mofeitem.tools.SatanSpade;
import net.moreofeverything.mofe.mofeitem.tools.ValeriusAxe;
import net.moreofeverything.mofe.mofeitem.tools.ValeriusPickaxe;
import net.moreofeverything.mofe.mofeitem.tools.ValeriusSpade;

public class ItemM {

	public static Item valeriusGem;
	public static Item patriciusGem;
	public static Item satanGem;
	public static Item taintedGem;
	public static Item poweredGem;
	public static Item heavenGem;
	public static Item sacredCrystal;
	public static Item sacredPowerCrystal;
	public static Item destabilizedIngot;
	public static Item satanPoweredIngot;

	public static Item valeriusPickaxe;
	public static Item valeriusAxe;
	public static Item valeriusSpade;

	public static Item patriciusPickaxe;
	public static Item patriciusAxe;
	public static Item patriciusSpade;

	public static Item satanPickaxe;
	public static Item satanAxe;
	public static Item satanSpade;

	public static void init() {
		valeriusGem = new ValeriusGem();
		patriciusGem = new PatriciusGem();
		satanGem = new SatanGem();
		taintedGem = new TaintedGem();
		poweredGem = new PoweredGem();
		heavenGem = new HeavenGem();
		sacredCrystal = new SacredCrystal();
		sacredPowerCrystal = new SacredPowerCrystal();
		destabilizedIngot = new DestabilizedIngot();
		satanPoweredIngot = new SatanPoweredIngot();

		satanPickaxe = new SatanPickaxe(ToolMaterialMofe.satanToolMaterial);
		satanAxe = new SatanAxe(ToolMaterialMofe.satanToolMaterial);
		satanSpade = new SatanSpade(ToolMaterialMofe.satanToolMaterial);

		valeriusPickaxe = new ValeriusPickaxe(
				ToolMaterialMofe.valeriusToolMaterial);
		valeriusAxe = new ValeriusAxe(ToolMaterialMofe.valeriusToolMaterial);
		valeriusSpade = new ValeriusSpade(ToolMaterialMofe.valeriusToolMaterial);

		patriciusPickaxe = new PatriciusPickaxe(
				ToolMaterialMofe.patriciusToolMaterial);
		patriciusAxe = new PatriciusAxe(ToolMaterialMofe.patriciusToolMaterial);
		patriciusSpade = new PatriciusSpade(
				ToolMaterialMofe.patriciusToolMaterial);
	}

	public static void registerInit() {
		ReferenceHelper.registerItem(valeriusGem);
		ReferenceHelper.registerItem(patriciusGem);
		ReferenceHelper.registerItem(satanGem);
		ReferenceHelper.registerItem(taintedGem);
		ReferenceHelper.registerItem(poweredGem);
		ReferenceHelper.registerItem(heavenGem);
		ReferenceHelper.registerItem(sacredCrystal);
		ReferenceHelper.registerItem(sacredPowerCrystal);
		ReferenceHelper.registerItem(destabilizedIngot);
		ReferenceHelper.registerItem(satanPoweredIngot);

		ReferenceHelper.registerItem(satanPickaxe);
		ReferenceHelper.registerItem(satanAxe);
		ReferenceHelper.registerItem(satanSpade);

		ReferenceHelper.registerItem(valeriusPickaxe);
		ReferenceHelper.registerItem(valeriusAxe);
		ReferenceHelper.registerItem(valeriusSpade);

		ReferenceHelper.registerItem(patriciusPickaxe);
		ReferenceHelper.registerItem(patriciusAxe);
		ReferenceHelper.registerItem(patriciusSpade);
	}

}
