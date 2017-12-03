package christopher.tutorial.init.blocks.fence;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;

public class RedNetherBrickFence extends BlockFence
{
	public RedNetherBrickFence(String name, float hardness, float resistance)
	{
		super(Material.ROCK, Material.ROCK.getMaterialMapColor());
		this.blockSoundType = SoundType.STONE;
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(resistance);
		setHardness(hardness);
		this.useNeighborBrightness = true;
	}
}
