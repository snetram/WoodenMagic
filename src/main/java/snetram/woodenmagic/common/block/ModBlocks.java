package snetram.woodenmagic.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block magicWood;
	
	public static void init() {
		magicWood = new MagicWood();
	}
public static void register(BlockWoodenMagic block)
{
	GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
}
}
