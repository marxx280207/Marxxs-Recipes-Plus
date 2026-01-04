
package recipes_plus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElytrawindItem extends Item {
	public ElytrawindItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
