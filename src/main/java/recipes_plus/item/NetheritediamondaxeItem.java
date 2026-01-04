
package recipes_plus.item;

import recipes_plus.init.RecipesPlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class NetheritediamondaxeItem extends AxeItem {
	public NetheritediamondaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 10.5f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RecipesPlusModItems.NETHERITEDIAMONDINGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
