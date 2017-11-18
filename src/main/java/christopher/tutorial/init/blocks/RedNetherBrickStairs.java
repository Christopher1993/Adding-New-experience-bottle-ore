package christopher.tutorial.init.blocks;

import christopher.tutorial.Tutorial;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class RedNetherBrickStairs extends BlockStairs
{
	public RedNetherBrickStairs(String name, IBlockState modelState)
	{
		super(modelState);
		setUnlocalizedName("red_nether_brick_stairs");
		setRegistryName("red_nether_brick_stairs");
		this.useNeighborBrightness = true;
		this.setCreativeTab(Tutorial.christophertab);
	}
}
