package net.salju.trialstowers.init;

import net.salju.trialstowers.item.*;
import net.salju.trialstowers.TrialsMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TrialsItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrialsMod.MODID);
	public static final RegistryObject<Item> TUFF_STAIRS = block(TrialsBlocks.TUFF_STAIRS);
	public static final RegistryObject<Item> TUFF_SLAB = block(TrialsBlocks.TUFF_SLAB);
	public static final RegistryObject<Item> TUFF_WALL = block(TrialsBlocks.TUFF_WALL);
	public static final RegistryObject<Item> POLISHED_TUFF = block(TrialsBlocks.POLISHED_TUFF);
	public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = block(TrialsBlocks.POLISHED_TUFF_STAIRS);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = block(TrialsBlocks.POLISHED_TUFF_SLAB);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = block(TrialsBlocks.POLISHED_TUFF_WALL);
	public static final RegistryObject<Item> TUFF_BRICKS = block(TrialsBlocks.TUFF_BRICKS);
	public static final RegistryObject<Item> TUFF_BRICKS_STAIRS = block(TrialsBlocks.TUFF_BRICKS_STAIRS);
	public static final RegistryObject<Item> TUFF_BRICKS_SLAB = block(TrialsBlocks.TUFF_BRICKS_SLAB);
	public static final RegistryObject<Item> TUFF_BRICKS_WALL = block(TrialsBlocks.TUFF_BRICKS_WALL);
	public static final RegistryObject<Item> CHISELED_TUFF = block(TrialsBlocks.CHISELED_TUFF);
	public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = block(TrialsBlocks.CHISELED_TUFF_BRICKS);
	public static final RegistryObject<Item> CHISELED_TUFF_BULB = block(TrialsBlocks.CHISELED_TUFF_BULB);
	public static final RegistryObject<Item> SPAWNER = block(TrialsBlocks.SPAWNER);
	public static final RegistryObject<Item> VAULT = block(TrialsBlocks.VAULT);
	public static final RegistryObject<Item> HEAVY_CORE = block(TrialsBlocks.HEAVY_CORE);
	public static final RegistryObject<Item> MACE = REGISTRY.register("mace", () -> new MaceItem(TrialsItemTiers.MACE, 3, -2.8F, new Item.Properties()));
	public static final RegistryObject<Item> TRIAL_KEY = REGISTRY.register("trial_key", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> BREEZE_ROD = REGISTRY.register("breeze_rod", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> WIND_CHARGE = REGISTRY.register("wind_charge", () -> new WindItem(new Item.Properties()));
	public static final RegistryObject<Item> TRIAL_BOTTLE = REGISTRY.register("ominous_bottle", () -> new OmniItem(new Item.Properties()));
	public static final RegistryObject<Item> BOGGED_SPAWN_EGG = REGISTRY.register("bogged_spawn_egg", () -> new ForgeSpawnEggItem(TrialsMobs.BOGGED, -6684775, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> FLOW_SHERD = REGISTRY.register("flow_pottery_sherd", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> GUSTER_SHERD = REGISTRY.register("guster_pottery_sherd", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> SCRAPE_SHERD = REGISTRY.register("scrape_pottery_sherd", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> BOLT_TEMPLATE = REGISTRY.register("bolt_template", () -> SmithingTemplateItem.createArmorTrimTemplate(new ResourceLocation("bolt")));
	public static final RegistryObject<Item> FLOW_TEMPLATE = REGISTRY.register("flow_template", () -> SmithingTemplateItem.createArmorTrimTemplate(new ResourceLocation("flow")));
	public static final RegistryObject<Item> MUSIC_DISC_CREATOR = REGISTRY.register("music_disc_creator", () -> new RecordItem(0, () -> TrialsModSounds.MUSIC_DISC_CREATOR.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3540));
	public static final RegistryObject<Item> MUSIC_DISC_CREATOR_BOX = REGISTRY.register("music_disc_creator_box", () -> new RecordItem(0, () -> TrialsModSounds.MUSIC_DISC_CREATOR_BOX.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1480));
	public static final RegistryObject<Item> MUSIC_DISC_PRECIPICE = REGISTRY.register("music_disc_precipice", () -> new RecordItem(0, () -> TrialsModSounds.MUSIC_DISC_PRECIPICE.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5980));
	public static final RegistryObject<Item> BANNER_PATTERN_FLOW = REGISTRY.register("banner_pattern_flow", () -> new BannerPatternItem(TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(TrialsMod.MODID, "pattern_for_flow")), (new Item.Properties()).stacksTo(1)));
	public static final RegistryObject<Item> BANNER_PATTERN_GUSTER = REGISTRY.register("banner_pattern_guster", () -> new BannerPatternItem(TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(TrialsMod.MODID, "pattern_for_guster")), (new Item.Properties()).stacksTo(1)));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}