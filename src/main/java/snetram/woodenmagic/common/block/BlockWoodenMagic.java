package snetram.woodenmagic.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import snetram.woodenmagic.common.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockWoodenMagic extends Block {
	public BlockWoodenMagic() {
		super(Material.rock);
	}

	public BlockWoodenMagic(Material material) {
		super(material);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("%s%", References.RESOURCEPREFIX,
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(References.RESOURCEPREFIX
				+ getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

}
