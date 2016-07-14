package com.dyonovan.crashlogadditions;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ICrashCallable;

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
public class CLACrashCallable implements ICrashCallable {

    public static void create() {
        FMLCommonHandler.instance().registerCrashCallable(new CLACrashCallable());
    }

    @Override
    public String getLabel() {
        return ConfigHandler.modName;
    }

    @Override
    public String call() throws Exception {
        return ConfigHandler.modVersion;
    }
}
