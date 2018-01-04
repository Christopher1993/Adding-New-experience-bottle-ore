
package christopher.tutorial.handlers;

import christopher.tutorial.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerFurnaceRecipes()
	{
		GameRegistry.addSmelting(BlockInit.diamond_brick, new ItemStack(Items.DIAMOND), 100);
		GameRegistry.addSmelting(BlockInit.experience_ore, new ItemStack(Items.EXPERIENCE_BOTTLE), 1000000);
		GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(Items.LAVA_BUCKET), 100);
		GameRegistry.addSmelting(Blocks.PLANKS, new ItemStack(Blocks.COBBLESTONE), 1000);
		GameRegistry.addSmelting(Blocks.STONE, new ItemStack(Blocks.NETHERRACK), 1000);
		GameRegistry.addSmelting(Items.WHEAT, new ItemStack(Blocks.DIRT), 0);
	}
}