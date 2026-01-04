
package recipes_plus.item;

import recipes_plus.init.RecipesPlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NetheritegoldshovelItem extends ShovelItem {
	public NetheritegoldshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2100;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RecipesPlusModItems.NETHERITEGOLDINGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
