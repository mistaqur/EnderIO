package crazypants.enderio.machine;

import static crazypants.enderio.ModObject.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.EnderIO;
import crazypants.enderio.ModObject;
import crazypants.enderio.material.Alloy;

public class MachineRecipes {

  public static void addRecipes() {
    ItemStack industialBinder = new ItemStack(itemIndustrialBinder.actualId, 1, 0);
    ItemStack capacitor = new ItemStack(itemBasicCapacitor.actualId, 1, 0);

    ItemStack stirlingGen = new ItemStack(blockStirlingGenerator.actualId, 1, 0);
    GameRegistry.addShapedRecipe(stirlingGen, "bbb", "bfb", "bcb", 'b', industialBinder, 'f', Block.furnaceIdle, 'c', capacitor);

    ItemStack painter = new ItemStack(blockPainter.actualId, 1, 0);
    ItemStack red = new ItemStack(Item.dyePowder, 1, 1);
    ItemStack green = new ItemStack(Item.dyePowder, 1, 2);
    ItemStack blue = new ItemStack(Item.dyePowder, 1, 4);
    //System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! MachineRecipes.addRecipes: Adding painter recipe with output for item stack of " + painter.itemID);
    GameRegistry.addShapedRecipe(painter, "bbb", "RGB", "bcb", 'b', industialBinder, 'R', red, 'G', green, 'B', blue, 'c', capacitor);

    ItemStack reservoir = new ItemStack(blockReservoir.actualId, 1, 0);
    ItemStack glassPane = new ItemStack(Block.thinGlass, 1, 0);
    GameRegistry.addShapedRecipe(reservoir, "bgb", "gBg", "bgb", 'b', industialBinder, 'g', glassPane, 'B', Item.bucketEmpty);

    ItemStack alloySmelter = new ItemStack(blockAlloySmelter.actualId, 1, 0);
    GameRegistry.addShapedRecipe(alloySmelter, "bbb", "CfC", "bcb", 'b', industialBinder, 'f', Block.furnaceIdle, 'c', capacitor, 'C', Item.cauldron);
       
    ItemStack solarPanel = new ItemStack(blockSolarPanel.actualId,1,0);
    ItemStack activatedIron = new ItemStack(ModObject.itemAlloy.actualId,1,Alloy.ACTIVATED_IRON.ordinal());
    ItemStack activatedGold = new ItemStack(ModObject.itemAlloy.actualId,1,Alloy.ACTIVATED_GOLD.ordinal());
    ItemStack fusedQuartz = new ItemStack(ModObject.blockFusedQuartz.actualId, 1, 0);
    
    GameRegistry.addShapedRecipe(solarPanel, "qqq", "gig", "bcb", 'q', fusedQuartz, 'g', activatedGold, 'i', activatedIron, 'b', industialBinder,'c', capacitor);
  }

}