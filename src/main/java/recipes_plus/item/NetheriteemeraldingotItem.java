
package recipes_plus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteemeraldingotItem extends Item {
	public NetheriteemeraldingotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
