package com.jay101pk.mod1st.item.tools;

import com.jay101pk.mod1st.mod1st;
import com.jay101pk.mod1st.item.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class PickHam extends ItemPickaxe implements ItemModelProvider{
	protected String name;
	 public PickHam(String name){
		 super(EnumHelper.addToolMaterial("Cobalt", 3, 1000000, 50.0F, 1F, 50));
		 this.name=name;
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(CreativeTabs.TOOLS);
		 
	 }
	 
	 public void registerItemModel(Item item) {
			mod1st.proxy.registerItemRenderer(this, 0, name);
		}
		
		@Override
		public PickHam setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}

}
