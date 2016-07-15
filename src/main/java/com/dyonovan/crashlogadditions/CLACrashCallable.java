package com.dyonovan.crashlogadditions;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.ICrashCallable;

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
        return ConfigHandler.modName + " - " + ConfigHandler.modVersion;
    }

    @Override
    public String call() throws Exception {

        String notes = "\n";
        String[] configNotes = ConfigHandler.modNotes;

        for (int i = 0; i < configNotes.length; i++) {
            notes += "\t\t\t" + configNotes[i] + "\n";
        }

        return notes;
    }
}
