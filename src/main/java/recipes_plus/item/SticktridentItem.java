
package recipes_plus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SticktridentItem extends Item {
	public SticktridentItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
