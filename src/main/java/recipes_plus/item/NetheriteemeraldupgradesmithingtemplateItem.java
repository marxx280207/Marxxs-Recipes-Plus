
package recipes_plus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class NetheriteemeraldupgradesmithingtemplateItem extends Item {
	public NetheriteemeraldupgradesmithingtemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.recipes_plus.netheriteemeraldupgradesmithingtemplate.description_0"));
		list.add(Component.translatable("item.recipes_plus.netheriteemeraldupgradesmithingtemplate.description_1"));
		list.add(Component.translatable("item.recipes_plus.netheriteemeraldupgradesmithingtemplate.description_2"));
		list.add(Component.translatable("item.recipes_plus.netheriteemeraldupgradesmithingtemplate.description_3"));
		list.add(Component.translatable("item.recipes_plus.netheriteemeraldupgradesmithingtemplate.description_4"));
		list.add(Component.translatable("item.recipes_plus.netheriteemeraldupgradesmithingtemplate.description_5"));
	}
}
