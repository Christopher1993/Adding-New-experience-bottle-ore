package christopher.tutorial.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import christopher.tutorial.Reference;
import christopher.tutorial.Tutorial;
import christopher.tutorial.init.blocks.CustomBlockFurnace;
import christopher.tutorial.init.blocks.DiamondBrick;
import christopher.tutorial.init.blocks.DiamondBrickStairs;
import christopher.tutorial.init.blocks.ExperienceOre;
import christopher.tutorial.init.blocks.RedNetherBrickStairs;
import christopher.tutorial.init.blocks.fence.DiamondBrickFence;
import christopher.tutorial.init.blocks.fence.DiamondBrickFenceGate;
import christopher.tutorial.init.blocks.fence.RedNetherBrickFence;
import christopher.tutorial.init.blocks.slab.DiamondBrickDoubleSlab;
import christopher.tutorial.init.blocks.slab.DiamondBrickHalfSlab;
import christopher.tutorial.init.blocks.slab.RedNetherBrickDoubleSlab;
import christopher.tutorial.init.blocks.slab.RedNetherBrickHalfSlab;

public class BlockInit 
{
	public static DiamondBrick diamond_brick;
	public static DiamondBrickStairs diamond_brick_stairs;
	public static DiamondBrickHalfSlab diamond_brick_slab_half;
	public static DiamondBrickDoubleSlab diamond_brick_slab_double;
	public static DiamondBrickFence diamond_brick_fence;
	public static DiamondBrickFenceGate diamond_brick_fence_gate;
	
	public static CustomBlockFurnace custom_furnace_idle, custom_furnace_active;
	
	public static ExperienceOre experience_ore;
	
	public static RedNetherBrickStairs red_nether_brick_stairs;
	public static RedNetherBrickHalfSlab red_nether_brick_slab;
	public static RedNetherBrickDoubleSlab red_nether_brick_slab_double;
	public static RedNetherBrickFence red_nether_brick_fence;
	
	public static void init()
	{
		diamond_brick = new DiamondBrick("diamond_brick", 45.0F, 25000000.0F, 3);
		diamond_brick_stairs = new DiamondBrickStairs("diamond_brick_stairs", diamond_brick.getDefaultState());
		diamond_brick_slab_half = new DiamondBrickHalfSlab("diamond_brick_slab_half");
		diamond_brick_slab_double = new DiamondBrickDoubleSlab("diamond_brick_slab_double");
		diamond_brick_fence = new DiamondBrickFence("diamond_brick_fence", 45.0F, 25000000.0F);
		diamond_brick_fence_gate = new DiamondBrickFenceGate("diamond_brick_fence_gate", 45.0F, 25000000.0F);
		custom_furnace_active = new CustomBlockFurnace("custom_furnace_active", 45.0F, 25000000.0F, true);
		custom_furnace_idle = new CustomBlockFurnace("custom_furnace_idle", 45.0F, 25000000.0F, false);
		experience_ore = new ExperienceOre("experience_ore", 45.0F, 25000000.0F);
		red_nether_brick_stairs = new RedNetherBrickStairs("red_nether_brick_stairs", Blocks.NETHER_BRICK_STAIRS.getDefaultState());
		red_nether_brick_slab = new RedNetherBrickHalfSlab("red_nether_brick_slab");
		red_nether_brick_slab_double = new RedNetherBrickDoubleSlab("red_nether_brick_slab_double");
		red_nether_brick_fence = new RedNetherBrickFence("red_nether_brick_fence", 2.0F, 30.0F);
	}
	
	public static void register()
	{
		registerBlock(diamond_brick);
		registerBlock(diamond_brick_stairs);
		registerBlock(diamond_brick_slab_half, new ItemSlab(diamond_brick_slab_half, diamond_brick_slab_half, diamond_brick_slab_double));
		ForgeRegistries.BLOCKS.register(diamond_brick_slab_double);
		registerBlock(diamond_brick_fence);
		registerBlock(diamond_brick_fence_gate);
		registerBlock(red_nether_brick_stairs);
		
		registerBlock(custom_furnace_idle);
		ForgeRegistries.BLOCKS.register(custom_furnace_active);
		
		registerBlock(experience_ore);
		registerBlock(red_nether_brick_slab, new ItemSlab(red_nether_brick_slab, red_nether_brick_slab, red_nether_brick_slab_double));
		ForgeRegistries.BLOCKS.register(red_nether_brick_slab_double);
		registerBlock(red_nether_brick_fence);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Tutorial.christophertab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Tutorial.christophertab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerRender(Block block, int meta, String filename)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), "inventory"));
	}

}
