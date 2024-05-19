
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.fabric.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.grawmpy.reored.fabric.block.SilverOreBlock;
import net.grawmpy.reored.fabric.block.DeepslateSilverOreBlock;
import net.grawmpy.reored.fabric.ReoredfabricMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class ReoredfabricModFeatures {
	public static void load() {
		register("silver_ore", new OreFeature(OreConfiguration.CODEC), SilverOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("deepslate_silver_ore", new OreFeature(OreConfiguration.CODEC), DeepslateSilverOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	public static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(ReoredfabricMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ReoredfabricMod.MODID, registryName)));
	}
}
