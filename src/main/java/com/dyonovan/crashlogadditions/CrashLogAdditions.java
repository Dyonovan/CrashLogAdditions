package com.dyonovan.crashlogadditions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This file was created for Crash Log Additions
 * <p>
 * Crash Log Additions is licensed under the
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * @author Dyonovan
 * @since 7/14/2016
 */
@Mod(name = "Crash Log Additions", modid = "crashlogadditions", version = "1.0", dependencies = "required-after:Forge@[12.18.1.2011,)")
public class CrashLogAdditions {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigHandler.preInit(event.getModConfigurationDirectory().getAbsolutePath());
        CLACrashCallable.create();
    }
}
