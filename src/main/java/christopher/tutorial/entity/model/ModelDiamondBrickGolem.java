package christopher.tutorial.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelIronGolem - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelDiamondBrickGolem extends ModelBase {
    public ModelRenderer IronGolemChest;
    public ModelRenderer IronGolemWaist;
    public ModelRenderer IronGolemLeftArm;
    public ModelRenderer IronGolemRightArm;
    public ModelRenderer IronGolemRightLeg;
    public ModelRenderer IronGolemHead;
    public ModelRenderer IronGolemNose;
    public ModelRenderer IronGolemLeftLeg;

    public ModelDiamondBrickGolem() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.IronGolemLeftArm = new ModelRenderer(this, 60, 58);
        this.IronGolemLeftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.IronGolemLeftArm.addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.IronGolemHead = new ModelRenderer(this, 0, 0);
        this.IronGolemHead.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.IronGolemHead.addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, 0.0F);
        this.IronGolemLeftLeg = new ModelRenderer(this, 60, 0);
        this.IronGolemLeftLeg.mirror = true;
        this.IronGolemLeftLeg.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.IronGolemLeftLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.IronGolemRightArm = new ModelRenderer(this, 60, 21);
        this.IronGolemRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.IronGolemRightArm.addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.IronGolemNose = new ModelRenderer(this, 24, 0);
        this.IronGolemNose.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.IronGolemNose.addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, 0.0F);
        this.IronGolemChest = new ModelRenderer(this, 0, 40);
        this.IronGolemChest.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.IronGolemChest.addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F);
        this.IronGolemWaist = new ModelRenderer(this, 0, 70);
        this.IronGolemWaist.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.IronGolemWaist.addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F);
        this.IronGolemRightLeg = new ModelRenderer(this, 37, 0);
        this.IronGolemRightLeg.setRotationPoint(-4.0F, 11.0F, 0.0F);
        this.IronGolemRightLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.IronGolemLeftArm.render(f5);
        this.IronGolemHead.render(f5);
        this.IronGolemLeftLeg.render(f5);
        this.IronGolemRightArm.render(f5);
        this.IronGolemNose.render(f5);
        this.IronGolemChest.render(f5);
        this.IronGolemWaist.render(f5);
        this.IronGolemRightLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.IronGolemLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.IronGolemRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.IronGolemHead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.IronGolemHead.rotateAngleX = headPitch * 0.017453292F;
    	
    	this.IronGolemNose.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.IronGolemNose.rotateAngleX = headPitch * 0.017453292F;
    }
}
