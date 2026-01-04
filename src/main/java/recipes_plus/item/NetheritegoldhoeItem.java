
package recipes_plus.item;

import recipes_plus.init.RecipesPlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class NetheritegoldhoeItem extends HoeItem {
	public NetheritegoldhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2100;
			}

			public float getSpeed() {
				return 12f;
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
		}, 0, -3f, new Item.Properties().fireResistant());
	}
}
