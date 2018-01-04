package christopher.tutorial.entity.render;

import christopher.tutorial.Reference;
import christopher.tutorial.entity.EntityDiamondBrickGolem;
import christopher.tutorial.entity.model.ModelDiamondBrickGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiamondBrickGolem extends RenderLiving<EntityDiamondBrickGolem>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/diamond_brick_golem.png");
	
	public RenderDiamondBrickGolem(RenderManager manager) 
	{
		super(manager, new ModelDiamondBrickGolem(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDiamondBrickGolem entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityDiamondBrickGolem entityLiving,
			float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
