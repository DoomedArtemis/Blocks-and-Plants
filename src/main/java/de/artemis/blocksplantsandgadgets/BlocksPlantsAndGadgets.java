package de.artemis.blocksplantsandgadgets;

import de.artemis.blocksplantsandgadgets.blocks.ModBlocks;
import de.artemis.blocksplantsandgadgets.items.ModItems;
import de.artemis.blocksplantsandgadgets.util.Registration;
import de.artemis.blocksplantsandgadgets.worldgen.ModCavePlacements;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

@Mod(BlocksPlantsAndGadgets.MOD_ID)
public class BlocksPlantsAndGadgets {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "blocksplantsandgadgets";

    public static final CreativeModeTab INVENTORY_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {

            return new ItemStack(ModBlocks.ENDER_MOSS_BLOCK.get());
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> items) {
            ArrayList<Item> blockList = new ArrayList<>();

            int run = 0;

            Collections.addAll(blockList,
                    ModBlocks.ENDER_MOSS_BLOCK.get().asItem(), ModBlocks.ENDER_MOSS_STAIRS.get().asItem(), ModBlocks.ENDER_MOSS_SLAB.get().asItem(),
                    ModBlocks.ENDER_MOSS_WALL.get().asItem(), ModBlocks.STACKABLE_ENDER_MOSS_CARPET.get().asItem(), ModBlocks.ENDER_MOSS_CARPET.get().asItem(),
                    ModBlocks.ENDER_BUSH.get().asItem(), ModBlocks.FLOWERING_ENDER_BUSH.get().asItem(), ModBlocks.ENDER_SPROUTS.get().asItem(),
                    ModBlocks.TALL_ENDER_SPROUTS.get().asItem(), ModBlocks.MOSS_STAIRS.get().asItem(), ModBlocks.MOSS_SLAB.get().asItem(),
                    ModBlocks.MOSS_WALL.get().asItem(), ModBlocks.STACKABLE_MOSS_CARPET.get().asItem(), ModBlocks.BAMBOO_BLOCK.get().asItem(),
                    ModBlocks.BAMBOO_STAIRS.get().asItem(), ModBlocks.BAMBOO_SLAB.get().asItem(), ModBlocks.BAMBOO_WALL.get().asItem(),
                    ModBlocks.OVERGROWN_OAK_LOG.get().asItem(), ModBlocks.OVERGROWN_BIRCH_LOG.get().asItem(), ModBlocks.OVERGROWN_SPRUCE_LOG.get().asItem(),
                    ModBlocks.OVERGROWN_DARK_OAK_LOG.get().asItem(), ModBlocks.OVERGROWN_ACACIA_LOG.get().asItem(), ModBlocks.OVERGROWN_JUNGLE_LOG.get().asItem(),
                    ModBlocks.OVERGROWN_CRIMSON_STEM.get().asItem(), ModBlocks.OVERGROWN_WARPED_STEM.get().asItem(), ModBlocks.CRIMSON_NYLIUM_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_CRIMSON_NYLIUM_CARPET.get().asItem(), ModBlocks.WARPED_NYLIUM_CARPET.get().asItem(), ModBlocks.STACKABLE_WARPED_NYLIUM_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_OAK_LEAF_CARPET.get().asItem(), ModBlocks.OAK_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_OAK_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_BIRCH_LEAF_CARPET.get().asItem(), ModBlocks.BIRCH_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_BIRCH_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_SPRUCE_LEAF_CARPET.get().asItem(), ModBlocks.SPRUCE_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_SPRUCE_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_DARK_OAK_LEAF_CARPET.get().asItem(), ModBlocks.DARK_OAK_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_DARK_OAK_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_ACACIA_LEAF_CARPET.get().asItem(), ModBlocks.ACACIA_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_ACACIA_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_JUNGLE_LEAF_CARPET.get().asItem(), ModBlocks.JUNGLE_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_JUNGLE_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_AZALEA_LEAF_CARPET.get().asItem(), ModBlocks.AZALEA_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_AZALEA_LEAF_CARPET.get().asItem(),
                    ModBlocks.STACKABLE_FLOWERING_AZALEA_LEAF_CARPET.get().asItem(), ModBlocks.FLOWERING_AZALEA_LEAF_CARPET.get().asItem(), ModBlocks.SMALL_FLOWERING_AZALEA_LEAF_CARPET.get().asItem(),
                    ModBlocks.PERIDOT_BLOCK.get().asItem(), ModBlocks.BUDDING_PERIDOT.get().asItem(), ModBlocks.PERIDOT_CLUSTER.get().asItem(),
                    ModBlocks.LARGE_PERIDOT_BUD.get().asItem(), ModBlocks.MEDIUM_PERIDOT_BUD.get().asItem(), ModBlocks.SMALL_PERIDOT_BUD.get().asItem(),
                    ModBlocks.SMOOTH_PERIDOT_BLOCK.get().asItem(), ModItems.PERIDOT_SHARD.get(), ModBlocks.RUBY_BLOCK.get().asItem(), ModBlocks.BUDDING_RUBY.get().asItem(),
                    ModBlocks.RUBY_CLUSTER.get().asItem(), ModBlocks.LARGE_RUBY_BUD.get().asItem(), ModBlocks.MEDIUM_RUBY_BUD.get().asItem(),
                    ModBlocks.SMALL_RUBY_BUD.get().asItem(), ModBlocks.SMOOTH_RUBY_BLOCK.get().asItem(), ModItems.RUBY_SHARD.get(), ModBlocks.SAPPHIRE_BLOCK.get().asItem(),
                    ModBlocks.BUDDING_SAPPHIRE.get().asItem(), ModBlocks.SAPPHIRE_CLUSTER.get().asItem(), ModBlocks.LARGE_SAPPHIRE_BUD.get().asItem(),
                    ModBlocks.MEDIUM_SAPPHIRE_BUD.get().asItem(), ModBlocks.SMALL_SAPPHIRE_BUD.get().asItem(), ModBlocks.SMOOTH_SAPPHIRE_BLOCK.get().asItem(), ModItems.SAPPHIRE_SHARD.get(),
                    ModBlocks.TOPAZ_BLOCK.get().asItem(), ModBlocks.BUDDING_TOPAZ.get().asItem(), ModBlocks.TOPAZ_CLUSTER.get().asItem(),
                    ModBlocks.LARGE_TOPAZ_BUD.get().asItem(), ModBlocks.MEDIUM_TOPAZ_BUD.get().asItem(), ModBlocks.SMALL_TOPAZ_BUD.get().asItem(),
                    ModBlocks.SMOOTH_TOPAZ_BLOCK.get().asItem(), ModItems.TOPAZ_SHARD.get(), ModBlocks.SMOOTH_AMETHYST_BLOCK.get().asItem(), ModBlocks.MOSSY_QUARTZ_BLOCK.get().asItem(),
                    ModBlocks.MOSSY_QUARTZ_STAIRS.get().asItem(), ModBlocks.MOSSY_QUARTZ_SLAB.get().asItem(), ModBlocks.MOSSY_QUARTZ_WALL.get().asItem(),
                    ModBlocks.FLOWERING_MOSSY_QUARTZ_BLOCK.get().asItem(), ModBlocks.FLOWERING_MOSSY_QUARTZ_STAIRS.get().asItem(), ModBlocks.FLOWERING_MOSSY_QUARTZ_SLAB.get().asItem(),
                    ModBlocks.FLOWERING_MOSSY_QUARTZ_WALL.get().asItem(), ModBlocks.OVERGROWN_QUARTZ_BLOCK.get().asItem(), ModBlocks.OVERGROWN_QUARTZ_STAIRS.get().asItem(), ModBlocks.OVERGROWN_QUARTZ_SLAB.get().asItem(),
                    ModBlocks.MOSSY_QUARTZ_BRICKS.get().asItem(), ModBlocks.MOSSY_QUARTZ_BRICK_STAIRS.get().asItem(), ModBlocks.MOSSY_QUARTZ_BRICK_SLAB.get().asItem(),
                    ModBlocks.MOSSY_QUARTZ_BRICK_WALL.get().asItem(), ModBlocks.FLOWERING_MOSSY_QUARTZ_BRICKS.get().asItem(), ModBlocks.FLOWERING_MOSSY_QUARTZ_BRICK_STAIRS.get().asItem(),
                    ModBlocks.FLOWERING_MOSSY_QUARTZ_BRICK_SLAB.get().asItem(), ModBlocks.FLOWERING_MOSSY_QUARTZ_BRICK_WALL.get().asItem(), ModBlocks.OVERGROWN_QUARTZ_BRICKS.get().asItem(), ModBlocks.OVERGROWN_QUARTZ_BRICK_STAIRS.get().asItem(),
                    ModBlocks.OVERGROWN_QUARTZ_BRICK_SLAB.get().asItem(), ModBlocks.MOSSY_QUARTZ_PILLAR.get().asItem(), ModBlocks.FLOWERING_MOSSY_QUARTZ_PILLAR.get().asItem(),
                    ModBlocks.OVERGROWN_QUARTZ_PILLAR.get().asItem(), ModBlocks.MOSSY_END_STONE.get().asItem(), ModBlocks.MOSSY_END_STONE_STAIRS.get().asItem(),
                    ModBlocks.MOSSY_END_STONE_SLAB.get().asItem(), ModBlocks.MOSSY_END_STONE_WALL.get().asItem(), ModBlocks.OVERGROWN_END_STONE.get().asItem(), ModBlocks.OVERGROWN_END_STONE_STAIRS.get().asItem(),
                    ModBlocks.OVERGROWN_END_STONE_SLAB.get().asItem(), ModBlocks.MOSSY_END_STONE_BRICKS.get().asItem(), ModBlocks.MOSSY_END_STONE_BRICK_STAIRS.get().asItem(),
                    ModBlocks.MOSSY_END_STONE_BRICK_SLAB.get().asItem(), ModBlocks.MOSSY_END_STONE_BRICK_SLAB.get().asItem(), ModBlocks.OVERGROWN_END_STONE_BRICKS.get().asItem(), ModBlocks.OVERGROWN_END_STONE_BRICK_STAIRS.get().asItem(),
                    ModBlocks.OVERGROWN_END_STONE_BRICK_SLAB.get().asItem(), ModBlocks.MOSSY_PURPUR_BLOCK.get().asItem(), ModBlocks.MOSSY_PURPUR_STAIRS.get().asItem(),
                    ModBlocks.MOSSY_PURPUR_SLAB.get().asItem(), ModBlocks.MOSSY_PURPUR_WALL.get().asItem(), ModBlocks.PURPUR_WALL.get().asItem(),
                    ModBlocks.MOSSY_PURPUR_PILLAR.get().asItem(), ModItems.COPPER_NUGGET.get(),ModBlocks.BROKEN_IRON_BARS.get().asItem(), ModBlocks.COPPER_BARS.get().asItem(), ModBlocks.BROKEN_COPPER_BARS.get().asItem(),
                    ModBlocks.COPPER_CHAIN.get().asItem(), ModBlocks.COPPER_LANTERN.get().asItem(), ModBlocks.COPPER_LANTERN_ROPE.get().asItem(),
                    ModBlocks.COPPER_SOUL_LANTERN.get().asItem(), ModBlocks.COPPER_SOUL_LANTERN_ROPE.get().asItem(), ModBlocks.GOLD_BARS.get().asItem(),
                    ModBlocks.BROKEN_GOLD_BARS.get().asItem(), ModBlocks.GOLD_CHAIN.get().asItem(), ModBlocks.GOLD_LANTERN.get().asItem(),
                    ModBlocks.GOLD_LANTERN_ROPE.get().asItem(), ModBlocks.GOLD_SOUL_LANTERN.get().asItem(), ModBlocks.GOLD_SOUL_LANTERN_ROPE.get().asItem(), ModBlocks.ROPE.get().asItem(),
                    ModBlocks.LANTERN_ROPE.get().asItem(), ModBlocks.SOUL_LANTERN_ROPE.get().asItem(), ModBlocks.COPPER_STAIRS.get().asItem(),
                    ModBlocks.COPPER_SLAB.get().asItem(), ModBlocks.COPPER_POST.get().asItem(), ModBlocks.CUT_COPPER_POST.get().asItem(),
                    ModBlocks.EXPOSED_COPPER_STAIRS.get().asItem(), ModBlocks.EXPOSED_COPPER_SLAB.get().asItem(), ModBlocks.EXPOSED_COPPER_POST.get().asItem(),
                    ModBlocks.EXPOSED_CUT_COPPER_POST.get().asItem(), ModBlocks.WEATHERED_COPPER_STAIRS.get().asItem(), ModBlocks.WEATHERED_COPPER_SLAB.get().asItem(),
                    ModBlocks.WEATHERED_COPPER_POST.get().asItem(), ModBlocks.WEATHERED_CUT_COPPER_POST.get().asItem(), ModBlocks.OXIDIZED_COPPER_STAIRS.get().asItem(),
                    ModBlocks.OXIDIZED_COPPER_SLAB.get().asItem(), ModBlocks.OXIDIZED_COPPER_POST.get().asItem(), ModBlocks.OXIDIZED_CUT_COPPER_POST.get().asItem(),
                    ModBlocks.STONE_WALL.get().asItem(), ModBlocks.OAK_WALL.get().asItem(), ModBlocks.SPRUCE_WALL.get().asItem(),
                    ModBlocks.BIRCH_WALL.get().asItem(), ModBlocks.DARK_OAK_WALL.get().asItem(), ModBlocks.ACACIA_WALL.get().asItem(),
                    ModBlocks.JUNGLE_WALL.get().asItem(), ModBlocks.CRIMSON_WALL.get().asItem(), ModBlocks.WARPED_WALL.get().asItem(),
                    ModBlocks.THIN_BOOKSHELF.get().asItem(), ModBlocks.SPRUCE_BOOKSHELF.get().asItem(),
                    ModBlocks.THIN_SPRUCE_BOOKSHELF.get().asItem(), ModBlocks.BIRCH_BOOKSHELF.get().asItem(), ModBlocks.THIN_BIRCH_BOOKSHELF.get().asItem(),
                    ModBlocks.DARK_OAK_BOOKSHELF.get().asItem(), ModBlocks.THIN_DARK_OAK_BOOKSHELF.get().asItem(), ModBlocks.ACACIA_BOOKSHELF.get().asItem(),
                    ModBlocks.THIN_ACACIA_BOOKSHELF.get().asItem(), ModBlocks.JUNGLE_BOOKSHELF.get().asItem(), ModBlocks.THIN_JUNGLE_BOOKSHELF.get().asItem(),
                    ModBlocks.CRIMSON_BOOKSHELF.get().asItem(), ModBlocks.THIN_CRIMSON_BOOKSHELF.get().asItem(), ModBlocks.WARPED_BOOKSHELF.get().asItem(),
                    ModBlocks.THIN_WARPED_BOOKSHELF.get().asItem(),
                    ModBlocks.TUFF_STAIRS.get().asItem(), ModBlocks.TUFF_SLAB.get().asItem(), ModBlocks.TUFF_WALL.get().asItem(),
                    ModBlocks.CALCITE_STAIRS.get().asItem(), ModBlocks.CALCITE_SLAB.get().asItem(), ModBlocks.CALCITE_WALL.get().asItem(),
                    ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem(), ModBlocks.SMOOTH_BASALT_SLAB.get().asItem(), ModBlocks.SMOOTH_BASALT_WALL.get().asItem(),
                    ModBlocks.GRASS_BLOCK_PATCH.get().asItem(),ModBlocks.DIRT_PATCH.get().asItem(),ModBlocks.COARSE_DIRT_PATCH.get().asItem(),
                    ModBlocks.PODZOL_PATCH.get().asItem(),ModBlocks.ROOTED_DIRT_PATCH.get().asItem(),ModBlocks.SAND_PATCH.get().asItem(),
                    ModBlocks.RED_SAND_PATCH.get().asItem(),ModBlocks.GRAVEL_PATCH.get().asItem(),ModBlocks.CLAY_PATCH.get().asItem(),
                    ModBlocks.MYCELIUM_PATCH.get().asItem(), ModBlocks.SOUL_SAND_PATCH.get().asItem(), ModBlocks.SOUL_SOIL_PATCH.get().asItem(),
                    ModBlocks.DIRT_PATH_PATCH.get().asItem());
            for (Item x : blockList) {

                items.add(run, new ItemStack(x));
                run++;
            }
        }
    };

    public BlocksPlantsAndGadgets() {
        Registration.register();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::onCommonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModCavePlacements.register();
        });
    }
}
