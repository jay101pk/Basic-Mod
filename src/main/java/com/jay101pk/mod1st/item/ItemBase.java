package com.jay101pk.mod1st.item;

import com.jay101pk.mod1st.mod1st;

import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider{
	protected String name;
	
	public ItemBase(String name){
		this.name=name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerItemModel(Item item){
		mod1st.proxy.registerItemRenderer(this, 0, name);
	}
	
	
}
