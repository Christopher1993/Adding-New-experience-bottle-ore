package christopher.tutorial.init.tools;

import christopher.tutorial.Tutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldShovel extends ItemSpade 
{
	public EmeraldShovel(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_shovel");
		setRegistryName("emerald_shovel");
		this.setCreativeTab(Tutorial.christophertab);
		this.attackSpeed = 100;
	}

}
