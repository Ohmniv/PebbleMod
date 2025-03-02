package com.example.pebblemod.item;

import com.example.pebblemod.pebbleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class PebbleItems {
    public static final Item ALCREMITE = registerItem("alcremite", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.pebblemod.alcremite.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
	
	public static final Item CERULEDGITE = registerItem("ceruledgite", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.pebblemod.ceruledgite.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
	
	public static final Item GOLURKITE = registerItem("golurkite", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.pebblemod.golurkite.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(pebbleMod.MOD_ID, name), item);
    }

    public static void registerModItem(){

    }
}
