package christopher.tutorial.init;

import christopher.tutorial.Reference;
import christopher.tutorial.Tutorial;
import christopher.tutorial.entity.EntityDiamondBrickGolem;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("diamond_brick_golem", EntityDiamondBrickGolem.class, Reference.ENTITY_DIAMOND_BRICK_GOLEM, 50, 65535, 35723);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Tutorial.INSTANCE, range, 1, true, color1, color2);
	}
}
