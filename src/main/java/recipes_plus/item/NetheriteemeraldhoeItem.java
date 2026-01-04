
package recipes_plus.item;

import recipes_plus.init.RecipesPlusModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class NetheriteemeraldhoeItem extends HoeItem {
	public NetheriteemeraldhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2600;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RecipesPlusModItems.NETHERITEEMERALDINGOT.get()));
			}
		}, 0, -3f, new Item.Properties().fireResistant());
	}
}
