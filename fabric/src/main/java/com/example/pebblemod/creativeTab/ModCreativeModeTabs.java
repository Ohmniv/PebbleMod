package com.example.pebblemod.creativeTab;

import com.example.pebblemod.pebbleMod;
import com.example.pebblemod.item.PebbleItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeModeTabs {
    public static final ItemGroup MEGA_SHOWDOWN_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(pebbleMod.MOD_ID, "pebblemod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(PebbleItems.GOLURKITE)) // Creative TAB icon
                    .displayName(Text.translatable("creativeTab.pebblemod.pebblemod"))
                    .entries(((displayContext, entries) -> {
                        entries.add(PebbleItems.ALCREMITE);
						entries.add(PebbleItems.CERULEDGITE);
						entries.add(PebbleItems.GOLURKITE);
                    }))
                    .build());

    public static void registerItemGroups(){

    }
}
