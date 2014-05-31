package snetram.woodenmagic.common.block;

import snetram.woodenmagic.common.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class MagicWood extends BlockWoodenMagic {
	public MagicWood() {
		this.setBlockName(Strings.MagicWoodName);
		this.setHardness(1F);
		this.setResistance(3F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(Block.soundTypeWood);
		ModBlocks.register(this);
	}
}
