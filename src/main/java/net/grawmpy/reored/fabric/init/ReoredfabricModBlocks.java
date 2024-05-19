
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
import net.grawmpy.reored.fabric.ReoredfabricMod;

public class ReoredfabricModBlocks {
	public static Block SILVER_ORE;
	public static Block DEEPSLATE_SILVER_ORE;

	public static void load() {
		SILVER_ORE = register("silver_ore", new SilverOreBlock());
		DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new DeepslateSilverOreBlock());
	}

	public static void clientLoad() {
		SilverOreBlock.clientInit();
		DeepslateSilverOreBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ReoredfabricMod.MODID, registryName), block);
	}
}
