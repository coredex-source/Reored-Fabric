
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.fabric.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.grawmpy.reored.fabric.block.SilverOreBlock;
import net.grawmpy.reored.fabric.block.DeepslateSilverOreBlock;
import net.grawmpy.reored.fabric.block.DeepslateDeepIronOreBlock;
import net.grawmpy.reored.fabric.block.DeepIronOreBlock;
import net.grawmpy.reored.fabric.block.DeepIronBlockBlock;
import net.grawmpy.reored.fabric.ReoredfabricMod;

public class ReoredfabricModBlocks {
	public static Block SILVER_ORE;
	public static Block DEEPSLATE_SILVER_ORE;
	public static Block DEEP_IRON_ORE;
	public static Block DEEPSLATE_DEEP_IRON_ORE;
	public static Block DEEP_IRON_BLOCK;

	public static void load() {
		SILVER_ORE = register("silver_ore", new SilverOreBlock());
		DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new DeepslateSilverOreBlock());
		DEEP_IRON_ORE = register("deep_iron_ore", new DeepIronOreBlock());
		DEEPSLATE_DEEP_IRON_ORE = register("deepslate_deep_iron_ore", new DeepslateDeepIronOreBlock());
		DEEP_IRON_BLOCK = register("deep_iron_block", new DeepIronBlockBlock());
	}

	public static void clientLoad() {
		SilverOreBlock.clientInit();
		DeepslateSilverOreBlock.clientInit();
		DeepIronOreBlock.clientInit();
		DeepslateDeepIronOreBlock.clientInit();
		DeepIronBlockBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ReoredfabricMod.MODID, registryName), block);
	}
}
