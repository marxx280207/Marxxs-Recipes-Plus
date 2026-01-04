
package recipes_plus.item;

import recipes_plus.init.RecipesPlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NetheriteironshovelItem extends ShovelItem {
	public NetheriteironshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2300;
			}

			public float getSpeed() {
				return 11.5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RecipesPlusModItems.NETHERITEIRONINGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
