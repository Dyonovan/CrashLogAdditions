package com.dyonovan.crashlogadditions;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CrashLogAdditions.MODID)
public class CrashLogAdditions
{
    public static final String MODID = "crashlogadditions";
    //private static final Logger LOGGER = LogManager.getLogger();

    public CrashLogAdditions() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CLAConfig.genSpec, "CrashLogAdditions-common.toml");
    }



    private void setup(final FMLCommonSetupEvent event)
    {
        CLACrashCallable.create();
    }

}
