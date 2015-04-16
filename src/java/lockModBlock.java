package com.minecraft.lockmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class lockModBlock extends Block{

	String _Icon;
	IIcon _IIcon;
	public lockModBlock(Material material1) {
		super(material1);
		// TODO Auto-generated constructor stub
		
	}
	public void setIcon(String Icon){
		_Icon = Icon;
	}
	/**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return _IIcon;
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        _IIcon = p_149651_1_.registerIcon(_Icon);
    }
    
  
	public float getBlockHardness(World world, int x, int y, int z)
    {
		EntityPlayer player = world.getClosestPlayer(x, y, z, 10.0f);
		//System.out.println(player.getDisplayName());
		ItemStack itemStack = player.getItemInUse();
		if(itemStack != null){
			
		
			String item = itemStack.getDisplayName(); 
			//System.out.println(item.toString());
			if(item.toString().contains("keyItem")){
				return 1.0f;
			}
			else {
				return -1.0f;
			}
		}
		return -1.0f;
    	    
    
    	
    }
    
}
