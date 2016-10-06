package com.jay101pk.mod1st.init;

import com.jay101pk.mod1st.item.ItemBase;
import com.jay101pk.mod1st.item.ItemModelProvider;
import com.jay101pk.mod1st.item.armor.ObsidianChest;
import com.jay101pk.mod1st.item.tools.PickHam;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ItemBase PickGod;
	public static PickHam hammer;
	public static ObsidianChest obsidianChest;
	//public static ObsidianHead obsidianHead;
	//public static ObsidianLegs obsidianLegs;
	//public static ObsidianBoots obsidianBoots;
	
	public static void init(){
		int a[]={10,10,10,10};
		ArmorMaterial obsidian = EnumHelper.addArmorMaterial("OBSIDIAN", "Obsidian",1000, a, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
		PickGod = (ItemBase) register(new ItemBase("PickGod").setCreativeTab(CreativeTabs.TOOLS));
		hammer = register(new PickHam("hammer"));
		
		obsidianChest=register(new ObsidianChest(obsidian));
		//obsidianHead=register(new ObsidianHead(obsidian));
		//obsidianLegs=register(new ObsidianLegs(obsidian));
		//obsidianBoots=register(new ObsidianBoots(obsidian));
	}
	
	private static <K extends Item> K register(K item){
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider){
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
	
}
