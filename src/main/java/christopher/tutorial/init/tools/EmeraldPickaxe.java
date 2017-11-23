package christopher.tutorial.init.tools;

import christopher.tutorial.Tutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldPickaxe extends ItemPickaxe 
{
	public EmeraldPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("emerald_pickaxe");
		setRegistryName("emerald_pickaxe");
		this.setCreativeTab(Tutorial.christophertab);
		this.attackSpeed = 100;
	}

}
