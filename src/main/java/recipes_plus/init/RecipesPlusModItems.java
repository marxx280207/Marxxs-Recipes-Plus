
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package recipes_plus.init;

import recipes_plus.item.TeethtridentItem;
import recipes_plus.item.SticktridentItem;
import recipes_plus.item.NetheriteironupgradesmithingtemplateItem;
import recipes_plus.item.NetheriteironswordItem;
import recipes_plus.item.NetheriteironshovelItem;
import recipes_plus.item.NetheriteironpickaxeItem;
import recipes_plus.item.NetheriteironingotItem;
import recipes_plus.item.NetheriteironhoeItem;
import recipes_plus.item.NetheriteironaxeItem;
import recipes_plus.item.NetheriteironItem;
import recipes_plus.item.NetheritegoldupgradesmithingtemplateItem;
import recipes_plus.item.NetheritegoldswordItem;
import recipes_plus.item.NetheritegoldshovelItem;
import recipes_plus.item.NetheritegoldpickaxeItem;
import recipes_plus.item.NetheritegoldingotItem;
import recipes_plus.item.NetheritegoldhoeItem;
import recipes_plus.item.NetheritegoldaxeItem;
import recipes_plus.item.NetheritegoldItem;
import recipes_plus.item.NetheriteemeraldupgradesmithingtemplateItem;
import recipes_plus.item.NetheriteemeraldswordItem;
import recipes_plus.item.NetheriteemeraldshovelItem;
import recipes_plus.item.NetheriteemeraldpickaxeItem;
import recipes_plus.item.NetheriteemeraldingotItem;
import recipes_plus.item.NetheriteemeraldhoeItem;
import recipes_plus.item.NetheriteemeraldaxeItem;
import recipes_plus.item.NetheriteemeraldItem;
import recipes_plus.item.NetheritediamondupgradesmithingtemplateItem;
import recipes_plus.item.NetheritediamondswordItem;
import recipes_plus.item.NetheritediamondshovelItem;
import recipes_plus.item.NetheritediamondpickaxeItem;
import recipes_plus.item.NetheritediamondingotItem;
import recipes_plus.item.NetheritediamondhoeItem;
import recipes_plus.item.NetheritediamondaxeItem;
import recipes_plus.item.NetheritediamondItem;
import recipes_plus.item.HearttridentItem;
import recipes_plus.item.ElytrawindItem;
import recipes_plus.item.CopperswordItem;
import recipes_plus.item.CoppershovelItem;
import recipes_plus.item.CopperpickaxeItem;
import recipes_plus.item.CoppernuggetItem;
import recipes_plus.item.CopperhoeItem;
import recipes_plus.item.CopperaxeItem;
import recipes_plus.item.CopperarmorItem;

import recipes_plus.RecipesPlusMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class RecipesPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RecipesPlusMod.MODID);
	public static final RegistryObject<Item> ELYTRAWING = REGISTRY.register("elytrawing", () -> new ElytrawindItem());
	public static final RegistryObject<Item> STICKTRIDENT = REGISTRY.register("sticktrident", () -> new SticktridentItem());
	public static final RegistryObject<Item> HEARTTRIDENT = REGISTRY.register("hearttrident", () -> new HearttridentItem());
	public static final RegistryObject<Item> TEETHTRIDENT = REGISTRY.register("teethtrident", () -> new TeethtridentItem());
	public static final RegistryObject<Item> NETHERITEIRONINGOT = REGISTRY.register("netheriteironingot", () -> new NetheriteironingotItem());
	public static final RegistryObject<Item> NETHERITEGOLDINGOT = REGISTRY.register("netheritegoldingot", () -> new NetheritegoldingotItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDINGOT = REGISTRY.register("netheritediamondingot", () -> new NetheritediamondingotItem());
	public static final RegistryObject<Item> NETHERITEEMERALDINGOT = REGISTRY.register("netheriteemeraldingot", () -> new NetheriteemeraldingotItem());
	public static final RegistryObject<Item> NETHERITEIRONSWORD = REGISTRY.register("netheriteironsword", () -> new NetheriteironswordItem());
	public static final RegistryObject<Item> NETHERITEIRONUPGRADESMITHINGTEMPLATE = REGISTRY.register("netheriteironupgradesmithingtemplate", () -> new NetheriteironupgradesmithingtemplateItem());
	public static final RegistryObject<Item> NETHERITEIRONPICKAXE = REGISTRY.register("netheriteironpickaxe", () -> new NetheriteironpickaxeItem());
	public static final RegistryObject<Item> NETHERITEIRONAXE = REGISTRY.register("netheriteironaxe", () -> new NetheriteironaxeItem());
	public static final RegistryObject<Item> NETHERITEIRONSHOVEL = REGISTRY.register("netheriteironshovel", () -> new NetheriteironshovelItem());
	public static final RegistryObject<Item> NETHERITEIRONHOE = REGISTRY.register("netheriteironhoe", () -> new NetheriteironhoeItem());
	public static final RegistryObject<Item> NETHERITEIRONBLOCK = block(RecipesPlusModBlocks.NETHERITEIRONBLOCK);
	public static final RegistryObject<Item> NETHERITEGOLDUPGRADESMITHINGTEMPLATE = REGISTRY.register("netheritegoldupgradesmithingtemplate", () -> new NetheritegoldupgradesmithingtemplateItem());
	public static final RegistryObject<Item> NETHERITEGOLDBLOCK = block(RecipesPlusModBlocks.NETHERITEGOLDBLOCK);
	public static final RegistryObject<Item> NETHERITEGOLDSWORD = REGISTRY.register("netheritegoldsword", () -> new NetheritegoldswordItem());
	public static final RegistryObject<Item> NETHERITEGOLDPICKAXE = REGISTRY.register("netheritegoldpickaxe", () -> new NetheritegoldpickaxeItem());
	public static final RegistryObject<Item> NETHERITEGOLDAXE = REGISTRY.register("netheritegoldaxe", () -> new NetheritegoldaxeItem());
	public static final RegistryObject<Item> NETHERITEGOLDSHOVEL = REGISTRY.register("netheritegoldshovel", () -> new NetheritegoldshovelItem());
	public static final RegistryObject<Item> NETHERITEGOLDHOE = REGISTRY.register("netheritegoldhoe", () -> new NetheritegoldhoeItem());
	public static final RegistryObject<Item> NETHERITEEMERALDUPGRADESMITHINGTEMPLATE = REGISTRY.register("netheriteemeraldupgradesmithingtemplate", () -> new NetheriteemeraldupgradesmithingtemplateItem());
	public static final RegistryObject<Item> NETHERITEEMERALDBLOCK = block(RecipesPlusModBlocks.NETHERITEEMERALDBLOCK);
	public static final RegistryObject<Item> NETHERITEEMERALDSWORD = REGISTRY.register("netheriteemeraldsword", () -> new NetheriteemeraldswordItem());
	public static final RegistryObject<Item> NETHERITEEMERALDPICKAXE = REGISTRY.register("netheriteemeraldpickaxe", () -> new NetheriteemeraldpickaxeItem());
	public static final RegistryObject<Item> NETHERITEEMERALDAXE = REGISTRY.register("netheriteemeraldaxe", () -> new NetheriteemeraldaxeItem());
	public static final RegistryObject<Item> NETHERITEEMERALDSHOVEL = REGISTRY.register("netheriteemeraldshovel", () -> new NetheriteemeraldshovelItem());
	public static final RegistryObject<Item> NETHERITEEMERALDHOE = REGISTRY.register("netheriteemeraldhoe", () -> new NetheriteemeraldhoeItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDUPGRADESMITHINGTEMPLATE = REGISTRY.register("netheritediamondupgradesmithingtemplate", () -> new NetheritediamondupgradesmithingtemplateItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDBLOCK = block(RecipesPlusModBlocks.NETHERITEDIAMONDBLOCK);
	public static final RegistryObject<Item> NETHERITEDIAMONDSWORD = REGISTRY.register("netheritediamondsword", () -> new NetheritediamondswordItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDPICKAXE = REGISTRY.register("netheritediamondpickaxe", () -> new NetheritediamondpickaxeItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDAXE = REGISTRY.register("netheritediamondaxe", () -> new NetheritediamondaxeItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDSHOVEL = REGISTRY.register("netheritediamondshovel", () -> new NetheritediamondshovelItem());
	public static final RegistryObject<Item> NETHERITEDIAMONDHOE = REGISTRY.register("netheritediamondhoe", () -> new NetheritediamondhoeItem());
	public static final RegistryObject<Item> NETHERITEIRON_HELMET = REGISTRY.register("netheriteiron_helmet", () -> new NetheriteironItem.Helmet());
	public static final RegistryObject<Item> NETHERITEIRON_CHESTPLATE = REGISTRY.register("netheriteiron_chestplate", () -> new NetheriteironItem.Chestplate());
	public static final RegistryObject<Item> NETHERITEIRON_LEGGINGS = REGISTRY.register("netheriteiron_leggings", () -> new NetheriteironItem.Leggings());
	public static final RegistryObject<Item> NETHERITEIRON_BOOTS = REGISTRY.register("netheriteiron_boots", () -> new NetheriteironItem.Boots());
	public static final RegistryObject<Item> NETHERITEGOLD_HELMET = REGISTRY.register("netheritegold_helmet", () -> new NetheritegoldItem.Helmet());
	public static final RegistryObject<Item> NETHERITEGOLD_CHESTPLATE = REGISTRY.register("netheritegold_chestplate", () -> new NetheritegoldItem.Chestplate());
	public static final RegistryObject<Item> NETHERITEGOLD_LEGGINGS = REGISTRY.register("netheritegold_leggings", () -> new NetheritegoldItem.Leggings());
	public static final RegistryObject<Item> NETHERITEGOLD_BOOTS = REGISTRY.register("netheritegold_boots", () -> new NetheritegoldItem.Boots());
	public static final RegistryObject<Item> NETHERITEEMERALD_HELMET = REGISTRY.register("netheriteemerald_helmet", () -> new NetheriteemeraldItem.Helmet());
	public static final RegistryObject<Item> NETHERITEEMERALD_CHESTPLATE = REGISTRY.register("netheriteemerald_chestplate", () -> new NetheriteemeraldItem.Chestplate());
	public static final RegistryObject<Item> NETHERITEEMERALD_LEGGINGS = REGISTRY.register("netheriteemerald_leggings", () -> new NetheriteemeraldItem.Leggings());
	public static final RegistryObject<Item> NETHERITEEMERALD_BOOTS = REGISTRY.register("netheriteemerald_boots", () -> new NetheriteemeraldItem.Boots());
	public static final RegistryObject<Item> NETHERITEDIAMOND_HELMET = REGISTRY.register("netheritediamond_helmet", () -> new NetheritediamondItem.Helmet());
	public static final RegistryObject<Item> NETHERITEDIAMOND_CHESTPLATE = REGISTRY.register("netheritediamond_chestplate", () -> new NetheritediamondItem.Chestplate());
	public static final RegistryObject<Item> NETHERITEDIAMOND_LEGGINGS = REGISTRY.register("netheritediamond_leggings", () -> new NetheritediamondItem.Leggings());
	public static final RegistryObject<Item> NETHERITEDIAMOND_BOOTS = REGISTRY.register("netheritediamond_boots", () -> new NetheritediamondItem.Boots());
	public static final RegistryObject<Item> COPPERNUGGET = REGISTRY.register("coppernugget", () -> new CoppernuggetItem());
	public static final RegistryObject<Item> COPPERARMOR_HELMET = REGISTRY.register("copperarmor_helmet", () -> new CopperarmorItem.Helmet());
	public static final RegistryObject<Item> COPPERARMOR_CHESTPLATE = REGISTRY.register("copperarmor_chestplate", () -> new CopperarmorItem.Chestplate());
	public static final RegistryObject<Item> COPPERARMOR_LEGGINGS = REGISTRY.register("copperarmor_leggings", () -> new CopperarmorItem.Leggings());
	public static final RegistryObject<Item> COPPERARMOR_BOOTS = REGISTRY.register("copperarmor_boots", () -> new CopperarmorItem.Boots());
	public static final RegistryObject<Item> COPPERSWORD = REGISTRY.register("coppersword", () -> new CopperswordItem());
	public static final RegistryObject<Item> COPPERPICKAXE = REGISTRY.register("copperpickaxe", () -> new CopperpickaxeItem());
	public static final RegistryObject<Item> COPPERAXE = REGISTRY.register("copperaxe", () -> new CopperaxeItem());
	public static final RegistryObject<Item> COPPERSHOVEL = REGISTRY.register("coppershovel", () -> new CoppershovelItem());
	public static final RegistryObject<Item> COPPERHOE = REGISTRY.register("copperhoe", () -> new CopperhoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
