package com.jay101pk.mod1st.block;

import com.jay101pk.mod1st.mod1st;
import com.jay101pk.mod1st.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider{
	protected String name;
	
	public BlockBase(Material materialIn,String name){
		super(materialIn);
		this.name=name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(Item itemBlock){
		mod1st.proxy.registerItemRenderer(itemBlock, 0, name);
	}
}
