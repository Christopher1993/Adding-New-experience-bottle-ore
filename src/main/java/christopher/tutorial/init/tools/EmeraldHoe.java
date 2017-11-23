package christopher.tutorial.init.tools;

import christopher.tutorial.Tutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldHoe extends ItemHoe 
{
	private int attackSpeed;

	public EmeraldHoe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_hoe");
		setRegistryName("emerald_hoe");
		this.setCreativeTab(Tutorial.christophertab);
		this.attackSpeed = 100;
	}

}
