
package net.grawmpy.reored.fabric.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.grawmpy.reored.fabric.init.ReoredfabricModTabs;
import net.grawmpy.reored.fabric.init.ReoredfabricModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class SiverPickaxeItem extends PickaxeItem {
	public SiverPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 550;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredfabricModItems.SILVER_INGOT));
			}
		}, 1, -2.8f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(ReoredfabricModTabs.TAB_REORED_TOOLS).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
