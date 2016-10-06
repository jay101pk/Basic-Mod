package com.jay101pk.mod1st;

import com.jay101pk.mod1st.init.ModBlocks;
import com.jay101pk.mod1st.init.ModItems;
import com.jay101pk.mod1st.init.ModRecipes;
import com.jay101pk.mod1st.proxy.*;
import com.jay101pk.mod1st.reference.*;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid= Reference.MODID, version = Reference.VERSION)
public class mod1st {
	
	
	@Mod.Instance(Reference.MODID)
	public static mod1st instance;
	
	@SidedProxy(clientSide =Reference.clientProxy, serverSide =Reference.serverProxy)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("working");
		ModItems.init();
		ModBlocks.init();
		System.out.println("worked");
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		ModRecipes.addRecipes();
		//System.out.println("Dirt Block >> "+Blocks.DIRT.getUnlocalizedName());
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
