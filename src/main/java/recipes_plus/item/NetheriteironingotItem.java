
package recipes_plus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteironingotItem extends Item {
	public NetheriteironingotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
