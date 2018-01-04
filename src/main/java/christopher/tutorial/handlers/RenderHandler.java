package christopher.tutorial.handlers;

import christopher.tutorial.entity.EntityDiamondBrickGolem;
import christopher.tutorial.entity.render.RenderDiamondBrickGolem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBrickGolem.class, new IRenderFactory<EntityDiamondBrickGolem>()
				{
					@Override
					public Render<? super EntityDiamondBrickGolem> createRenderFor(RenderManager manager) 
					{
						return new RenderDiamondBrickGolem(manager);
					}
				});
	}
}
