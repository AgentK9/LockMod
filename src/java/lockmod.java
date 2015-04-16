package com.minecraft.lockmod;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = lockmod.MODID, version = lockmod.VERSION)
public class lockmod
{
    public static final String MODID = "lockmod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	lockModTab lockTab = new lockModTab("Lock Mod Stuff");
		// some example code
       // System.out.println("Key");
    	lockModBlock lockBlock = new lockModBlock(Material.rock);
    	lockBlock.setIcon(MODID+":LockBlockSkin");
    	System.out.println(MODID+":LockBlockSkin");
    	lockBlock.setCreativeTab(lockTab);
    	lockBlock.setBlockName("lockBlock");
    	GameRegistry.registerBlock(lockBlock, "lockBlock");
    	
    	keyItem Key = new keyItem();
    	Key.setIcon(MODID+":KeyImage");
    	Key.setCreativeTab(lockTab);
    	Key.setUnlocalizedName("KeyItem");
    	GameRegistry.registerItem(Key,"KeyItem");
    	
    	kItem ring = new kItem();
    	ring.setIcon(MODID+":keyRing");
    	ring.setCreativeTab(lockTab);
    	ring.setUnlocalizedName("keyRing");
    	GameRegistry.registerItem(ring,"keyRing");
    	
    	kItem teeth = new kItem();
    	teeth.setIcon(MODID+":keyTeeth");
    	teeth.setCreativeTab(lockTab);
    	teeth.setUnlocalizedName("keyTeeth");
    	GameRegistry.registerItem(teeth,"keyTeeth");
    	
    	lockChest lockedChest = new lockChest(1);
    	lockedChest.setBottomIcon(MODID+":lockChestUD");
    	lockedChest.setTopIcon(MODID+":lockChestUD");
    	lockedChest.setNorthIcon(MODID+":lockChestF");
    	lockedChest.setSouthIcon(MODID+":lockChestS");
    	lockedChest.setEastIcon(MODID+":lockChestS");
    	lockedChest.setWestIcon(MODID+":lockChestS");
    	lockedChest.setCreativeTab(lockTab);
    	lockedChest.setBlockName("lockedChest");
    	//lockedChest.setHardness(-1.0f);
    	GameRegistry.registerBlock(lockedChest,"Lock Chest");
    	
    	lockModBlock metalLeaves = new lockModBlock(Material.rock);
    	metalLeaves.setIcon(MODID+":MetalLeaves");
    	metalLeaves.setCreativeTab(lockTab);
    	metalLeaves.setBlockName("metalLeaves");
    	GameRegistry.registerBlock(metalLeaves, "metalLeaves");
    	
    	lockModBlock decorBlock = new lockModBlock(Material.rock);
    	decorBlock.setIcon(MODID+":ultimate decoratin block 1");
    	System.out.println(MODID+":LockBlockSkin");
    	decorBlock.setCreativeTab(lockTab);
    	decorBlock.setBlockName("decorBlock");
    	GameRegistry.registerBlock(decorBlock, "decorBlock");
    	
    	  GameRegistry.addRecipe
    	    ( new ItemStack(lockBlock, 1) 
    	    , "yyy"
    	    , "yxy" 
    	    , "yyy"
    	    , 'x', new ItemStack(Key)
    	    , 'y', Items.iron_ingot
    	    
    	    );
    	  GameRegistry.addRecipe
  	    ( new ItemStack(ring, 1) 
  	    , "yyy"
  	    , "y y" 
  	    , "yyy"
  	    , 'y', Items.iron_ingot
  	    
  	    );
    	  
    	  GameRegistry.addRecipe
    	    ( new ItemStack(teeth, 1) 
    	    , "y  "
    	    , "yy " 
    	    , "  y"
    	    , 'y', Items.iron_ingot
    	    
    	    );
    	  GameRegistry.addRecipe
  	    ( new ItemStack(Key, 1) 
  	    , "   "
  	    , "yx " 
  	    , "   "
  	    , 'x', new ItemStack(ring)
  	    , 'y', new ItemStack(teeth)
  	    
  	    );
    	  
    	  GameRegistry.addRecipe
  	    ( new ItemStack(decorBlock, 1) 
  	    , "gdg"
  	    , "yxy" 
  	    , "lil"
  	    , 'x', Blocks.redstone_block
  	    , 'y', Blocks.emerald_block
  	    , 'd', Blocks.diamond_block
  	    , 'g', Blocks.gold_block
  	    , 'l', Blocks.lapis_block
  	    , 'i', Blocks.iron_block
  	    );
    	  GameRegistry.addRecipe
  	    ( new ItemStack(metalLeaves, 5) 
  	    , "y y"
  	    , " y " 
  	    , "y y"
  	    , 'y', Blocks.iron_bars
  	    
  	    );
    	/**GameRegistry.addRecipe
    	    ( Items.spawn_egg 
    	    , "yyy"
    	    , "yxy" 
    	    , "yyy"
    	    , 'y', Items.leather
    	    , 'x', Items.rotten_flesh
    	    
    	    );**/
    }
    
}
