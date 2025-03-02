package com.example.pebblemod;

import com.cobblemon.yajatkaul.mega_showdown.utility.Utils;
import com.example.pebblemod.creativeTab.ModCreativeModeTabs;
import com.example.pebblemod.item.PebbleItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.cobblemon.yajatkaul.mega_showdown.utility.Utils.getSpecies;

public class pebbleMod implements ModInitializer {
    public static final String MOD_ID = "pebblemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        PebbleItems.registerModItem();
        ModCreativeModeTabs.registerItemGroups();

        ServerLifecycleEvents.SERVER_STARTED.register(this::onServerStarted);
    }

    private void onServerStarted(MinecraftServer server) {
        Utils.MEGA_STONE_IDS.put(PebbleItems.ALCREMITE.asItem(), getSpecies("alcremie"));
		Utils.MEGA_STONE_IDS.put(PebbleItems.CERULEDGITE.asItem(), getSpecies("ceruledge"));
		Utils.MEGA_STONE_IDS.put(PebbleItems.GOLURKITE.asItem(), getSpecies("golurk"));
    }
}