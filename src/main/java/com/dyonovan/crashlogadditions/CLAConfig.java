package com.dyonovan.crashlogadditions;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.function.Predicate;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CLAConfig {

    public static final ForgeConfigSpec genSpec;
    public static final General GENERAL;

    static {
        final Pair<General, ForgeConfigSpec> genSpecPair = new ForgeConfigSpec.Builder().configure(General::new);
        genSpec = genSpecPair.getRight();
        GENERAL = genSpecPair.getLeft();
    }

    public static class General {

        public final ForgeConfigSpec.ConfigValue<String> modPackName;
        public final ForgeConfigSpec.ConfigValue<String> modPackVersion;
        public final ForgeConfigSpec.ConfigValue<List<? extends String>> modpackNotes;

        private General(ForgeConfigSpec.Builder builder) {
            Predicate<Object> validator = o -> o instanceof String;

            builder.push("ModPack Info");

            modPackName = builder
                    .comment("Mod Pack Name")
                    .define("ModPackName", "SomeModPack");

            modPackVersion = builder
                    .comment("Mod Pack Version")
                    .define("ModPackVersion", "1.0.0");


            modpackNotes = builder
                    .comment("Mod Pack Notes")
                    .defineList("ModPackNotes", Lists.newArrayList("Line1", "Line2", "Line3"), validator);

            builder.pop();
        }

    }

}
