package lol.skydash.stoneyshovelaxi;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lol.skydash.stoneyshovelaxi.init.RegisterItems;
import lol.skydash.stoneyshovelaxi.proxy.CommonProxy;
import lol.skydash.stoneyshovelaxi.utils.Reference;
import lol.skydash.stoneyshovelaxi.utils.ShovelaxiTabShovel;

@Mod(
    modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    version = Reference.MOD_VERSION,
    acceptedMinecraftVersions = Reference.MC_VERSION)
public class StoneyShovelaxi {

    @Mod.Instance(Reference.MOD_ID)
    public static StoneyShovelaxi instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    public static ShovelaxiTabShovel StoneyShovelaxiTab = new ShovelaxiTabShovel("stoneyshovelaxiTab");

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegisterItems.init();
        RegisterItems.register();
    }

    public static class WorldLoadHandler {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(proxy);
        proxy.registerRenders();
        proxy.registerEntities();
    }
}
