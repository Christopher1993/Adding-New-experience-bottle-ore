package christopher.tutorial.gen;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import scala.actors.threadpool.Arrays;
import christopher.tutorial.gen.generators.WorldGenStructure;

public class WorldGenCustomStructures implements IWorldGenerator
{
	public static final WorldGenStructure BIRCHVILLAGERHOUSE = new WorldGenStructure("birch_house");
	public static final WorldGenStructure JUNGLEVILLAGERHOUSE = new WorldGenStructure("jungle_house");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			
			break;
			
		case 0:
			
			generateStructure(BIRCHVILLAGERHOUSE, world, random, chunkX, chunkZ, 25, Blocks.GRASS, BiomeForest.class);
			generateStructure(JUNGLEVILLAGERHOUSE, world, random, chunkX, chunkZ, 25, Blocks.GRASS, BiomeJungle.class);
			
			break;
			
		case -1:
			
			break;
		}
		
	}
	
	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkx, int chunkz, int chance, Block topBlock, Class<?>... classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkx * 16) + random.nextInt(15);
		int z = (chunkz * 16) + random.nextInt(15);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		return y;
	}
}