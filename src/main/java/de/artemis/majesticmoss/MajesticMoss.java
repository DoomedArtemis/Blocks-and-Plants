package de.artemis.majesticmoss;

import de.artemis.majesticmoss.blocks.ModBlocks;
import de.artemis.majesticmoss.items.ModItems;
import de.artemis.majesticmoss.util.Registration;
import de.artemis.majesticmoss.worldgen.ModCavePlacements;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

@Mod(MajesticMoss.MOD_ID)
public class MajesticMoss {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "majesticmoss";

    public static final CreativeModeTab INVENTORY_TAB = new CreativeModeTab(MajesticMoss.MOD_ID) {
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
                    ModBlocks.MOSSY_PURPUR_PILLAR.get().asItem(), ModItems.COPPER_NUGGET.get(), ModBlocks.COPPER_BARS.get().asItem(),
                    ModBlocks.COPPER_CHAIN.get().asItem(), ModBlocks.ROPE.get().asItem(), ModBlocks.COPPER_LANTERN.get().asItem(),
                    ModBlocks.COPPER_LANTERN_ROPE.get().asItem(), ModBlocks.COPPER_SOUL_LANTERN.get().asItem(), ModBlocks.COPPER_SOUL_LANTERN_ROPE.get().asItem(),
                    ModBlocks.LANTERN_ROPE.get().asItem(), ModBlocks.SOUL_LANTERN_ROPE.get().asItem(), ModBlocks.COPPER_STAIRS.get().asItem(),
                    ModBlocks.COPPER_SLAB.get().asItem(), ModBlocks.COPPER_POST.get().asItem(), ModBlocks.CUT_COPPER_POST.get().asItem(),
                    ModBlocks.EXPOSED_COPPER_STAIRS.get().asItem(), ModBlocks.EXPOSED_COPPER_SLAB.get().asItem(), ModBlocks.EXPOSED_COPPER_POST.get().asItem(),
                    ModBlocks.EXPOSED_CUT_COPPER_POST.get().asItem(), ModBlocks.WEATHERED_COPPER_STAIRS.get().asItem(), ModBlocks.WEATHERED_COPPER_SLAB.get().asItem(),
                    ModBlocks.WEATHERED_COPPER_POST.get().asItem(), ModBlocks.WEATHERED_CUT_COPPER_POST.get().asItem(), ModBlocks.OXIDIZED_COPPER_STAIRS.get().asItem(),
                    ModBlocks.OXIDIZED_COPPER_SLAB.get().asItem(), ModBlocks.OXIDIZED_COPPER_POST.get().asItem(), ModBlocks.OXIDIZED_CUT_COPPER_POST.get().asItem());
            for (Item x : blockList) {

                items.add(run, new ItemStack(x));
                run++;
            }
        }
    };

    public MajesticMoss() {
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
