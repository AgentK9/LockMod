package com.minecraft.lockmod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class keyItem extends ItemAxe{
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
	
	public keyItem(){
		super(Item.ToolMaterial.EMERALD);
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
	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
	{
		//do something here
		Block lockBlock = world.getBlock(x, y, z);
		System.out.println(lockBlock.getClass().toString());
		if(lockBlock.getClass().toString().contains("lockModBlock")){
			lockBlock.dropBlockAsItem(world, x, y, z, 0, 0);
			world.setBlockToAir(x, y, z);
		}
		else if(lockBlock.getClass().toString().contains("lockChest")){
			
			((lockChest)lockBlock).onBlockActivatedWithKey(world, x, y, z, player  ,p_77648_7_,  p_77648_8_,  p_77648_9_,  p_77648_10_);
		}
		
	    return false;
	}
	/**
     * Called when the player Left Clicks (attacks) an entity.
     * Processed before damage is done, if return value is true further processing is canceled
     * and the entity is not attacked.
     *
     * @param stack The Item being used
     * @param player The player that is attacking
     * @param entity The entity being attacked
     * @return True to cancel the rest of the interaction.
     */
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
    	System.out.println("chest");
        return false;
    }
    public boolean itemInteractionForEntity(ItemStack p_111207_1_, EntityPlayer p_111207_2_, EntityLivingBase p_111207_3_)
    {
    	System.out.println("lock chest");
        return false;
    }
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
    	System.out.println("locked chest");
        return false;
    }
    public boolean canHarvestBlock(Block par1Block, ItemStack itemStack)
    {
    	System.out.println("harvest block method");
        return true;  
    }
    /**
     * Called before a block is broken.  Return true to prevent default block harvesting.
     *
     * Note: In SMP, this is called on both client and server sides!
     *
     * @param itemstack The current ItemStack
     * @param X The X Position
     * @param Y The X Position
     * @param Z The X Position
     * @param player The Player that is wielding the item
     * @return True to prevent harvesting, false to continue as normal
     */
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
    	System.out.println("block start break");
        return true;
    }

    /**
     * Called each tick while using an item.
     * @param stack The Item being used
     * @param player The Player using the item
     * @param count The amount of time in tick the item has been used for continuously
     */
    public void onUsingTick(ItemStack stack, EntityPlayer player, int count)
    {
    	System.out.println("using tick");
    }
}

