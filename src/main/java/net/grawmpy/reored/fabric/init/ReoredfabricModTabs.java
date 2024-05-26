
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.fabric.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.grawmpy.reored.fabric.ReoredfabricMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ReoredfabricModTabs {
	public static ResourceKey<CreativeModeTab> TAB_REORED_ARMORY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ReoredfabricMod.MODID, "reored_armory"));
	public static ResourceKey<CreativeModeTab> TAB_REORED_TOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ReoredfabricMod.MODID, "reored_tools"));
	public static ResourceKey<CreativeModeTab> TAB_REORED_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ReoredfabricMod.MODID, "reored_blocks"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_REORED_ARMORY,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ReoredfabricMod.MODID + ".reored_armory")).icon(() -> new ItemStack(ReoredfabricModItems.SILVER_SWORD)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_REORED_TOOLS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ReoredfabricMod.MODID + ".reored_tools")).icon(() -> new ItemStack(ReoredfabricModItems.SIVER_PICKAXE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_REORED_BLOCKS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ReoredfabricMod.MODID + ".reored_blocks")).icon(() -> new ItemStack(ReoredfabricModBlocks.SILVER_ORE)).build());
	}
}
