
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package recipes_plus.init;

import recipes_plus.RecipesPlusMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RecipesPlusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RecipesPlusMod.MODID);
	public static final RegistryObject<CreativeModeTab> MARXXRECIPESPLUS = REGISTRY.register("marxxrecipesplus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.recipes_plus.marxxrecipesplus")).icon(() -> new ItemStack(RecipesPlusModItems.NETHERITEDIAMONDPICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RecipesPlusModItems.ELYTRAWING.get());
				tabData.accept(RecipesPlusModItems.STICKTRIDENT.get());
				tabData.accept(RecipesPlusModItems.HEARTTRIDENT.get());
				tabData.accept(RecipesPlusModItems.TEETHTRIDENT.get());
				tabData.accept(RecipesPlusModItems.COPPERNUGGET.get());
				tabData.accept(RecipesPlusModItems.COPPERSWORD.get());
				tabData.accept(RecipesPlusModItems.COPPERPICKAXE.get());
				tabData.accept(RecipesPlusModItems.COPPERAXE.get());
				tabData.accept(RecipesPlusModItems.COPPERSHOVEL.get());
				tabData.accept(RecipesPlusModItems.COPPERHOE.get());
				tabData.accept(RecipesPlusModItems.COPPERARMOR_HELMET.get());
				tabData.accept(RecipesPlusModItems.COPPERARMOR_CHESTPLATE.get());
				tabData.accept(RecipesPlusModItems.COPPERARMOR_LEGGINGS.get());
				tabData.accept(RecipesPlusModItems.COPPERARMOR_BOOTS.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONINGOT.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONUPGRADESMITHINGTEMPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONSWORD.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONPICKAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONSHOVEL.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRONHOE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRON_HELMET.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRON_CHESTPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRON_LEGGINGS.get());
				tabData.accept(RecipesPlusModItems.NETHERITEIRON_BOOTS.get());
				tabData.accept(RecipesPlusModBlocks.NETHERITEIRONBLOCK.get().asItem());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDINGOT.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDUPGRADESMITHINGTEMPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDSWORD.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDPICKAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDSHOVEL.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLDHOE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLD_HELMET.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLD_CHESTPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLD_LEGGINGS.get());
				tabData.accept(RecipesPlusModItems.NETHERITEGOLD_BOOTS.get());
				tabData.accept(RecipesPlusModBlocks.NETHERITEGOLDBLOCK.get().asItem());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDINGOT.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDUPGRADESMITHINGTEMPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDSWORD.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDPICKAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDSHOVEL.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALDHOE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_HELMET.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_CHESTPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_LEGGINGS.get());
				tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_BOOTS.get());
				tabData.accept(RecipesPlusModBlocks.NETHERITEEMERALDBLOCK.get().asItem());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDINGOT.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDUPGRADESMITHINGTEMPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDSWORD.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDPICKAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDAXE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDSHOVEL.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDHOE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_HELMET.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_CHESTPLATE.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_LEGGINGS.get());
				tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_BOOTS.get());
				tabData.accept(RecipesPlusModBlocks.NETHERITEDIAMONDBLOCK.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RecipesPlusModBlocks.NETHERITEIRONBLOCK.get().asItem());
			tabData.accept(RecipesPlusModBlocks.NETHERITEGOLDBLOCK.get().asItem());
			tabData.accept(RecipesPlusModBlocks.NETHERITEEMERALDBLOCK.get().asItem());
			tabData.accept(RecipesPlusModBlocks.NETHERITEDIAMONDBLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RecipesPlusModItems.ELYTRAWING.get());
			tabData.accept(RecipesPlusModItems.STICKTRIDENT.get());
			tabData.accept(RecipesPlusModItems.HEARTTRIDENT.get());
			tabData.accept(RecipesPlusModItems.TEETHTRIDENT.get());
			tabData.accept(RecipesPlusModItems.COPPERNUGGET.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONINGOT.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDINGOT.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDINGOT.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDINGOT.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONUPGRADESMITHINGTEMPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDUPGRADESMITHINGTEMPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDUPGRADESMITHINGTEMPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDUPGRADESMITHINGTEMPLATE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RecipesPlusModItems.COPPERSWORD.get());
			tabData.accept(RecipesPlusModItems.COPPERARMOR_HELMET.get());
			tabData.accept(RecipesPlusModItems.COPPERARMOR_CHESTPLATE.get());
			tabData.accept(RecipesPlusModItems.COPPERARMOR_LEGGINGS.get());
			tabData.accept(RecipesPlusModItems.COPPERARMOR_BOOTS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONSWORD.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRON_HELMET.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRON_CHESTPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRON_LEGGINGS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRON_BOOTS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDSWORD.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLD_HELMET.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLD_CHESTPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLD_LEGGINGS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLD_BOOTS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDSWORD.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_HELMET.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_CHESTPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_LEGGINGS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALD_BOOTS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDSWORD.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_HELMET.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_CHESTPLATE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_LEGGINGS.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMOND_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RecipesPlusModItems.COPPERPICKAXE.get());
			tabData.accept(RecipesPlusModItems.COPPERAXE.get());
			tabData.accept(RecipesPlusModItems.COPPERSHOVEL.get());
			tabData.accept(RecipesPlusModItems.COPPERHOE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONPICKAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONSHOVEL.get());
			tabData.accept(RecipesPlusModItems.NETHERITEIRONHOE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDPICKAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDSHOVEL.get());
			tabData.accept(RecipesPlusModItems.NETHERITEGOLDHOE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDPICKAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDSHOVEL.get());
			tabData.accept(RecipesPlusModItems.NETHERITEEMERALDHOE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDPICKAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDAXE.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDSHOVEL.get());
			tabData.accept(RecipesPlusModItems.NETHERITEDIAMONDHOE.get());
		}
	}
}
