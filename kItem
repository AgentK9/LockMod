package com.minecraft.lockmod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class kItem extends Item{
	String _Icon;
	IIcon _IIcon;
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register )
    {
        _IIcon = register.registerIcon(_Icon); 
    }
	public void setIcon(String Icon){
		_Icon = Icon;
	}
	
	public kItem(){
		super();
	}
	@SideOnly(Side.CLIENT)
	public IIcon getIconIndex(ItemStack p_77650_1_)
	{
	    return _IIcon;
	}
	@SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int p_77618_1_, int p_77618_2_)
    {
        return _IIcon;
    }
	
	
}
