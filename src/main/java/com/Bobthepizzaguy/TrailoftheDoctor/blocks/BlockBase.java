package com.Bobthepizzaguy.TrailoftheDoctor.blocks;

import com.Bobthepizzaguy.TrailoftheDoctor.Main;
import com.Bobthepizzaguy.TrailoftheDoctor.init.ModBlocks;
import com.Bobthepizzaguy.TrailoftheDoctor.init.ModItems;
import com.Bobthepizzaguy.TrailoftheDoctor.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel 
{
	public BlockBase(String name, Material material) 
	{
		super (material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
	    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
