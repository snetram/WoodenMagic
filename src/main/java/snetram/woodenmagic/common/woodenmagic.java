package snetram.woodenmagic.common;

import snetram.woodenmagic.common.core.proxy.CommonProxy;
import snetram.woodenmagic.common.init.init;
import snetram.woodenmagic.common.init.postinit;
import snetram.woodenmagic.common.init.preinit;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = woodenmagic.MODID, name = woodenmagic.MODNAME, version = woodenmagic.MODVERSION, certificateFingerprint = woodenmagic.FINGERPRINT, acceptedMinecraftVersions = woodenmagic.acceptedMinecraftVersions)
public class woodenmagic {
	@SidedProxy(clientSide = woodenmagic.CLIENTPROXYLOCATION, serverSide = woodenmagic.COMMONPROXYLOCATION)
	public static CommonProxy proxy;
	public static final String MODID = "woodenmagic";
	public static final String MODNAME = "Wooden Magic";
	public static final String MODVERSION = "0.0.1";
	public static final String FINGERPRINT = "@FINGERPRINT@";
	public static final String acceptedMinecraftVersions = "1.7.2";
	public static final String CLIENTPROXYLOCATION = "snetram.woodenmagic.common.core.proxy.ClientProxy";
	public static final String COMMONPROXYLOCATION = "snetram.woodenmagic.common.core.proxy.CommonProxy";

	public static void preInit(FMLPreInitializationEvent event) {
		preinit.preInit();
	}

	public static void Init(FMLInitializationEvent event) {
		init.Init();
	}

	public static void postInit(FMLPostInitializationEvent event) {
		postinit.postInit();
	}
}
