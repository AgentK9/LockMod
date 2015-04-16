package com.minecraft.lockmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class lockModTab extends CreativeTabs{

	public lockModTab(String TabName) {
		super(TabName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Items.iron_sword;
	}
	
}
