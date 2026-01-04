
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package recipes_plus.init;

import recipes_plus.block.NetheriteironblockBlock;
import recipes_plus.block.NetheritegoldblockBlock;
import recipes_plus.block.NetheriteemeraldblockBlock;
import recipes_plus.block.NetheritediamondblockBlock;

import recipes_plus.RecipesPlusMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class RecipesPlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RecipesPlusMod.MODID);
	public static final RegistryObject<Block> NETHERITEIRONBLOCK = REGISTRY.register("netheriteironblock", () -> new NetheriteironblockBlock());
	public static final RegistryObject<Block> NETHERITEGOLDBLOCK = REGISTRY.register("netheritegoldblock", () -> new NetheritegoldblockBlock());
	public static final RegistryObject<Block> NETHERITEEMERALDBLOCK = REGISTRY.register("netheriteemeraldblock", () -> new NetheriteemeraldblockBlock());
	public static final RegistryObject<Block> NETHERITEDIAMONDBLOCK = REGISTRY.register("netheritediamondblock", () -> new NetheritediamondblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
