package net.moreofeverything.mofe.recipes;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.moreofeverything.mofe.mofeblock.BlockM;
import net.moreofeverything.mofe.mofeitem.ItemM;
import cpw.mods.fml.common.registry.GameRegistry;
import thaumcraft.api.ThaumcraftApi;

public class Recipes {
	





	/**
	 * @param Block The Block in which will be used to uncraft into Items.
	 * @param quantity The amount of Items that will be create.
	 * @param Item The Items in which is will be created.
	 */
	
	private static void recipeBlockToItem(Block block, int quantity, Item item)
	{
		GameRegistry.addShapelessRecipe(new ItemStack(item, quantity), new Object[]{
			block
		});
	}


private static Block[] blocks = 
{
	BlockM.satanBlock,
	BlockM.valeriusBlock,
	BlockM.patriciusBlock,
};

private static Item[] items = 
{
	ItemM.satanGem,
	ItemM.valeriusGem,
	ItemM.patriciusGem
};
	
	/**
	 * This is for Items and Blocks listed in an Array.
	 * 
	 * 
	 */

	private static void recipeBlock()
	{
		for(int i=0; i<blocks.length; i++)
		{
			for(int f=0; f<items.length; f++)
			{
				if(i == f)
				{
					System.out.println(blocks[i] + ":" + items[f]);
					
					GameRegistry.addRecipe(new ItemStack(blocks[i]), new Object[]
							{
								"VVV",
								"VVV",
								"VVV",
								'V', items[f]
							});
				}
			}
		}

	}
	/**
	 * @param item1 The top part of the Tool
	 * @param item2 The Handle part of the Tool
	 * @param item3 The Item it will Output
	 * @param itemName This ensures that the item you typed in gets to correct recipe
	 * @param itemNumber Number is based on Tool.
	 *
	*
	 * Pickaxe: 0,
	 * Axe: 1,
	 * Shovel: 2,
	 * Hoe: 3
	 */
	private static void recipeTool(int itemNumber, Item item1, Item item2, Item item3)
	{
		if(itemNumber == 0)
		{
		//Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(item3), new Object[]
				{
					"BBB",
					" S ",
					" S ",
					'B', item1,
					'S', item2
				});
		}else if(itemNumber == 1)
		{
			//Axe
			GameRegistry.addRecipe(new ItemStack(item3), new Object[]
					{
						"BB ",
						"BS ",
						" S ",
						'B', item1,
						'S', item2
					});
		}else if(itemNumber == 2)
		{
			//Shovel
			GameRegistry.addShapedRecipe(new ItemStack(item3), new Object[]
					{
						" B ",
						" S ",
						" S ",
						'B', item1,
						'S', item2
					});
		}else if(itemNumber == 3)
		{
			//Hoe
			GameRegistry.addRecipe(new ItemStack(item3), new Object[]
					{
						"BB ",
						" S ",
						" S ",
						'B', item1,
						'S', item2
					});
		}
		
		
	}
	
	
	public static void registerItems()
	{
		
		recipeBlockToItem(BlockM.valeriusBlock, 9, ItemM.valeriusGem);
		recipeBlockToItem(BlockM.patriciusBlock, 9, ItemM.patriciusGem);
		recipeBlockToItem(BlockM.satanBlock, 9, ItemM.satanGem);
		
		recipeTool(0, ItemM.valeriusGem, Items.stick, ItemM.valeriusPickaxe);
		recipeTool(1, ItemM.valeriusGem, Items.stick, ItemM.valeriusAxe);
		recipeTool(2, ItemM.valeriusGem, Items.stick, ItemM.valeriusSpade);
		
		recipeTool(0, ItemM.patriciusGem, Items.stick, ItemM.patriciusPickaxe);
		recipeTool(1, ItemM.patriciusGem, Items.stick, ItemM.patriciusAxe);
		recipeTool(2, ItemM.patriciusGem, Items.stick, ItemM.patriciusSpade);
		
		recipeTool(0, ItemM.satanGem, Items.stick, ItemM.satanPickaxe);
		recipeTool(1, ItemM.satanGem, Items.stick, ItemM.satanAxe);
		recipeTool(2, ItemM.satanGem, Items.stick, ItemM.satanSpade);

	}
	public static void registerBlocks()
	{

		recipeBlock();
		ThaumcraftApi.addSmeltingBonus("PatriciusOre", new ItemStack(ItemM.valeriusGem,0,0));
		
	}
	
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(new ItemStack(BlockM.patriciusOre), new ItemStack(ItemM.patriciusGem), 5);
		GameRegistry.addSmelting(new ItemStack(BlockM.granite), new ItemStack(BlockM.graniteSmooth), 2);
	}

}
