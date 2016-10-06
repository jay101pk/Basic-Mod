package com.jay101pk.mod1st.item.armor;

import com.jay101pk.mod1st.mod1st;
import com.jay101pk.mod1st.item.ItemModelProvider;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ObsidianArmor extends ItemArmor implements ItemModelProvider{
	protected String name;
	
	public ObsidianArmor(ArmorMaterial mat,String name,EntityEquipmentSlot type){
		super(mat,0,type);
		this.name=name;
		setRegistryName(name);
		setUnlocalizedName(name);
		//this.getArmorMaterial().setDamageReductionAmount(EntityEquipmentSlot.CHEST);
	}

	@Override
	public void registerItemModel(Item item) {
		mod1st.proxy.registerItemRenderer(this, 0, name);
	}
	
	/*@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(){
		ModelBiped armorModel=null;
		armorModel.bipedHead.showModel=false;
		return armorModel;
	}
	*/
	
}
