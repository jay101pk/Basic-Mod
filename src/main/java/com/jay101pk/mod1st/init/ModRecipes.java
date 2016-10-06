package com.jay101pk.mod1st.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void addRecipes() {
		//shaped crafting recipes
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND,64), "###", "###", "###", '#', Blocks.DIRT);
	
		//shapeless crafting recipes
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), new ItemStack(ModItems.corn));
		
		//smelting recipes
		//GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 1.0f);
		
	}
}
