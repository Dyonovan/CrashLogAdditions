package com.dyonovan.crashlogadditions;

import net.minecraftforge.fml.CrashReportExtender;
import net.minecraftforge.fml.common.ICrashCallable;

import java.util.List;

public class CLACrashCallable implements ICrashCallable {

    public static void create() {
        CrashReportExtender.registerCrashCallable(new CLACrashCallable());
    }

    @Override
    public String getLabel() {
        return CLAConfig.GENERAL.modPackName.get() + " - " + CLAConfig.GENERAL.modPackVersion.get();
    }

    @Override
    public String call() throws Exception {
        String notes = "\n";
        List<? extends String> listNotes = CLAConfig.GENERAL.modpackNotes.get();
        for (String line : listNotes) {
            notes += "\t\t\t" + line + "\n";
        }

        return notes;
    }
}
