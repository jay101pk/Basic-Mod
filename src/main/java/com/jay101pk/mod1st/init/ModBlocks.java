package com.jay101pk.mod1st.init;

import com.jay101pk.mod1st.block.BlockPimp;
import com.jay101pk.mod1st.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static BlockPimp pimp;
	public static void init(){
		pimp=(BlockPimp) register(new BlockPimp("pimp").setCreativeTab(CreativeTabs.MATERIALS));
	}
	
	private static <T extends Block> T register (T block,ItemBlock itemBlock){
		GameRegistry.register(block);
		if(itemBlock != null){
			GameRegistry.register(itemBlock);
		}
		if(block instanceof ItemModelProvider){
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		 ItemBlock itemBlock = new ItemBlock(block);
		 itemBlock.setRegistryName(block.getRegistryName());
		 return register(block, itemBlock);
	}
}

