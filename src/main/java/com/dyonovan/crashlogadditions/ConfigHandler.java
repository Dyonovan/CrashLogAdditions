package com.dyonovan.crashlogadditions;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

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
public class ConfigHandler {

    public static String modName;
    public static String modVersion;

    public static void preInit(String path) {

        Configuration config = new Configuration(new File(path + File.separator + "CrashLogAdditions.cfg"));

        config.load();

        modName = config.get("Mod Pack Name", "modPackName", "Mod Pack Name").getString();
        modVersion = config.get("Mod Pack Version", "modPackVersion", "Mod Pack Version").getString();

        config.save();
    }
}
