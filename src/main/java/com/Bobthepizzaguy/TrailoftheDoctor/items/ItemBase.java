package com.Bobthepizzaguy.TrailoftheDoctor.items;

import com.Bobthepizzaguy.TrailoftheDoctor.Main;
import com.Bobthepizzaguy.TrailoftheDoctor.init.ModItems;
import com.Bobthepizzaguy.TrailoftheDoctor.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
