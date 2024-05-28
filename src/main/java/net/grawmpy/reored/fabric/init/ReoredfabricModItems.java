/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.fabric.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.grawmpy.reored.fabric.item.SiverPickaxeItem;
import net.grawmpy.reored.fabric.item.SilverSwordItem;
import net.grawmpy.reored.fabric.item.SilverShovelItem;
import net.grawmpy.reored.fabric.item.SilverNuggetItem;
import net.grawmpy.reored.fabric.item.SilverIngotItem;
import net.grawmpy.reored.fabric.item.SilverHoeItem;
import net.grawmpy.reored.fabric.item.SilverAxeItem;
import net.grawmpy.reored.fabric.item.SilverArmorItem;
import net.grawmpy.reored.fabric.item.RawSilverItem;
import net.grawmpy.reored.fabric.item.OakArmorItem;
import net.grawmpy.reored.fabric.item.CopperSwordItem;
import net.grawmpy.reored.fabric.item.CopperShovelItem;
import net.grawmpy.reored.fabric.item.CopperPickaxeItem;
import net.grawmpy.reored.fabric.item.CopperHoeItem;
import net.grawmpy.reored.fabric.item.CopperAxeItem;
import net.grawmpy.reored.fabric.item.CopperArmorItem;
import net.grawmpy.reored.fabric.ReoredfabricMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ReoredfabricModItems {
	public static Item OAK_ARMOR_HELMET;
	public static Item OAK_ARMOR_CHESTPLATE;
	public static Item OAK_ARMOR_LEGGINGS;
	public static Item OAK_ARMOR_BOOTS;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_SWORD;
	public static Item COPPER_AXE;
	public static Item COPPER_SHOVEL;
	public static Item COPPER_HOE;
	public static Item COPPER_ARMOR_HELMET;
	public static Item COPPER_ARMOR_CHESTPLATE;
	public static Item COPPER_ARMOR_LEGGINGS;
	public static Item COPPER_ARMOR_BOOTS;
	public static Item SILVER_ORE;
	public static Item DEEPSLATE_SILVER_ORE;
	public static Item SILVER_SWORD;
	public static Item RAW_SILVER;
	public static Item SILVER_INGOT;
	public static Item SILVER_NUGGET;
	public static Item SILVER_PICKAXE;
	public static Item SILVER_AXE;
	public static Item SILVER_SHOVEL;
	public static Item SILVER_HOE;
	public static Item SILVER_ARMOR_HELMET;
	public static Item SILVER_ARMOR_CHESTPLATE;
	public static Item SILVER_ARMOR_LEGGINGS;
	public static Item SILVER_ARMOR_BOOTS;

	public static void load() {
		OAK_ARMOR_HELMET = register("oak_armor_helmet", new OakArmorItem.Helmet());
		OAK_ARMOR_CHESTPLATE = register("oak_armor_chestplate", new OakArmorItem.Chestplate());
		OAK_ARMOR_LEGGINGS = register("oak_armor_leggings", new OakArmorItem.Leggings());
		OAK_ARMOR_BOOTS = register("oak_armor_boots", new OakArmorItem.Boots());
		COPPER_PICKAXE = register("copper_pickaxe", new CopperPickaxeItem());
		COPPER_SWORD = register("copper_sword", new CopperSwordItem());
		COPPER_AXE = register("copper_axe", new CopperAxeItem());
		COPPER_SHOVEL = register("copper_shovel", new CopperShovelItem());
		COPPER_HOE = register("copper_hoe", new CopperHoeItem());
		COPPER_ARMOR_HELMET = register("copper_armor_helmet", new CopperArmorItem.Helmet());
		COPPER_ARMOR_CHESTPLATE = register("copper_armor_chestplate", new CopperArmorItem.Chestplate());
		COPPER_ARMOR_LEGGINGS = register("copper_armor_leggings", new CopperArmorItem.Leggings());
		COPPER_ARMOR_BOOTS = register("copper_armor_boots", new CopperArmorItem.Boots());
		SILVER_ORE = register("silver_ore", new BlockItem(ReoredfabricModBlocks.SILVER_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReoredfabricModTabs.TAB_REORED_BLOCKS).register(content -> content.accept(SILVER_ORE));
		DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new BlockItem(ReoredfabricModBlocks.DEEPSLATE_SILVER_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ReoredfabricModTabs.TAB_REORED_BLOCKS).register(content -> content.accept(DEEPSLATE_SILVER_ORE));
		SILVER_SWORD = register("silver_sword", new SilverSwordItem());
		RAW_SILVER = register("raw_silver", new RawSilverItem());
		SILVER_INGOT = register("silver_ingot", new SilverIngotItem());
		SILVER_NUGGET = register("silver_nugget", new SilverNuggetItem());
		SILVER_PICKAXE = register("silver_pickaxe", new SiverPickaxeItem());
		SILVER_AXE = register("silver_axe", new SilverAxeItem());
		SILVER_SHOVEL = register("silver_shovel", new SilverShovelItem());
		SILVER_HOE = register("silver_hoe", new SilverHoeItem());
		SILVER_ARMOR_HELMET = register("silver_armor_helmet", new SilverArmorItem.Helmet());
		SILVER_ARMOR_CHESTPLATE = register("silver_armor_chestplate", new SilverArmorItem.Chestplate());
		SILVER_ARMOR_LEGGINGS = register("silver_armor_leggings", new SilverArmorItem.Leggings());
		SILVER_ARMOR_BOOTS = register("silver_armor_boots", new SilverArmorItem.Boots());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ReoredfabricMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
