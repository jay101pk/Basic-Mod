package com.jay101pk.mod1st.proxy;

import com.jay101pk.mod1st.reference.Reference;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
	public void registerItemRenderer(Item item,int meta,String id){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID+":"+id,"inventory"));
	}
	public void getArmorModel(int id){
		
	}
}
