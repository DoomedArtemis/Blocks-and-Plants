package de.artemis.majesticmoss.blocks;

import de.artemis.majesticmoss.MajesticMoss;
import de.artemis.majesticmoss.items.TooltipBlockItem;
import de.artemis.majesticmoss.util.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(MajesticMoss.INVENTORY_TAB)));

        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Supplier<? extends BlockItem> item) {

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        return toReturn;
    }

    public static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }

    public static void register() {
    }

    // Stone

    public static final RegistryObject<WallBlock> STONE_WALL = register("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    // Overgrown End Stone

    public static final RegistryObject<Block> OVERGROWN_END_STONE = register("overgrown_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> OVERGROWN_END_STONE_STAIRS = register("overgrown_end_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.OVERGROWN_END_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> OVERGROWN_END_STONE_SLAB = register("overgrown_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    // Mossy End Stone

    public static final RegistryObject<Block> MOSSY_END_STONE = register("mossy_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> MOSSY_END_STONE_STAIRS = register("mossy_end_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_END_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> MOSSY_END_STONE_SLAB = register("mossy_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> MOSSY_END_STONE_WALL = register("mossy_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    // Overgrown End Stone Bricks

    public static final RegistryObject<Block> OVERGROWN_END_STONE_BRICKS = register("overgrown_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> OVERGROWN_END_STONE_BRICK_STAIRS = register("overgrown_end_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.OVERGROWN_END_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> OVERGROWN_END_STONE_BRICK_SLAB = register("overgrown_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    // Mossy End Stone Bricks

    public static final RegistryObject<Block> MOSSY_END_STONE_BRICKS = register("mossy_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> MOSSY_END_STONE_BRICK_STAIRS = register("mossy_end_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_END_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> MOSSY_END_STONE_BRICK_SLAB = register("mossy_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> MOSSY_END_STONE_BRICK_WALL = register("mossy_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.STONE)));

    // Purpur

    public static final RegistryObject<Block> MOSSY_PURPUR_BLOCK = register("mossy_purpur_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> MOSSY_PURPUR_STAIRS = register("mossy_purpur_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_PURPUR_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> MOSSY_PURPUR_SLAB = register("mossy_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> MOSSY_PURPUR_WALL = register("mossy_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> PURPUR_WALL = register("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<RotatedPillarBlock> MOSSY_PURPUR_PILLAR = register("mossy_purpur_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    // Moss

    public static final RegistryObject<StairBlock> MOSS_STAIRS = register("moss_stairs",
            () -> new StairBlock(() -> Blocks.MOSS_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));

    public static final RegistryObject<SlabBlock> MOSS_SLAB = register("moss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));

    public static final RegistryObject<WallBlock> MOSS_WALL = register("moss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.MOSS_BLOCK)));

    // Ender Moss

    public static final RegistryObject<EnderMossBlock> ENDER_MOSS_BLOCK = register("ender_moss_block",
            EnderMossBlock::new);

    public static final RegistryObject<StairBlock> ENDER_MOSS_STAIRS = register("ender_moss_stairs",
            () -> new StairBlock(() -> ModBlocks.ENDER_MOSS_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.MOSS_BLOCK)));

    public static final RegistryObject<SlabBlock> ENDER_MOSS_SLAB = register("ender_moss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.MOSS_BLOCK)));

    public static final RegistryObject<WallBlock> ENDER_MOSS_WALL = register("ender_moss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.MOSS_BLOCK)));

    public static final RegistryObject<CarpetBlock> ENDER_MOSS_CARPET = register("ender_moss_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.MOSS_CARPET)));

    // Stackable Moss

    public static final RegistryObject<StackableMossCarpetBlock> STACKABLE_ENDER_MOSS_CARPET = register("stackable_ender_moss_carpet",
            StackableMossCarpetBlock::new);

    public static final RegistryObject<StackableMossCarpetBlock> STACKABLE_MOSS_CARPET = register("stackable_moss_carpet",
            StackableMossCarpetBlock::new);

    // Leaf Carpet

    public static final RegistryObject<CarpetBlock> AZALEA_LEAF_CARPET = register("azalea_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.AZALEA_LEAVES).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> FLOWERING_AZALEA_LEAF_CARPET = register("flowering_azalea_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.AZALEA_LEAVES).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> OAK_LEAF_CARPET = register("oak_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> BIRCH_LEAF_CARPET = register("birch_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SPRUCE_LEAF_CARPET = register("spruce_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> DARK_OAK_LEAF_CARPET = register("dark_oak_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> ACACIA_LEAF_CARPET = register("acacia_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> JUNGLE_LEAF_CARPET = register("jungle_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    // Small Leaf Carpet

    public static final RegistryObject<CarpetBlock> SMALL_AZALEA_LEAF_CARPET = register("small_azalea_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.AZALEA_LEAVES).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_FLOWERING_AZALEA_LEAF_CARPET = register("small_flowering_azalea_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.AZALEA_LEAVES).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_OAK_LEAF_CARPET = register("small_oak_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_BIRCH_LEAF_CARPET = register("small_birch_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_SPRUCE_LEAF_CARPET = register("small_spruce_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_DARK_OAK_LEAF_CARPET = register("small_dark_oak_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_ACACIA_LEAF_CARPET = register("small_acacia_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));

    public static final RegistryObject<CarpetBlock> SMALL_JUNGLE_LEAF_CARPET = register("small_jungle_leaf_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).noCollission().instabreak()));


    // Stackable Leaf Carpet

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_AZALEA_LEAF_CARPET = register("stackable_azalea_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Azalea"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_FLOWERING_AZALEA_LEAF_CARPET = register("stackable_flowering_azalea_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Azalea"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_OAK_LEAF_CARPET = register("stackable_oak_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Grass"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_BIRCH_LEAF_CARPET = register("stackable_birch_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Grass"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_SPRUCE_LEAF_CARPET = register("stackable_spruce_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Grass"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_DARK_OAK_LEAF_CARPET = register("stackable_dark_oak_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Grass"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_ACACIA_LEAF_CARPET = register("stackable_acacia_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Grass"));

    public static final RegistryObject<StackableLeafCarpetBlock> STACKABLE_JUNGLE_LEAF_CARPET = register("stackable_jungle_leaf_carpet",
            () -> new StackableLeafCarpetBlock("Grass"));

    // Plants

    public static final RegistryObject<EnderSproutsBlock> ENDER_SPROUTS = register("ender_sprouts",
            EnderSproutsBlock::new);

    public static final RegistryObject<EnderSproutsBlock> TALL_ENDER_SPROUTS = register("tall_ender_sprouts",
            EnderSproutsBlock::new);

    public static final RegistryObject<EnderBushBlock> ENDER_BUSH = register("ender_bush",
            EnderBushBlock::new);

    public static final RegistryObject<FlowerPotBlock> POTTED_ENDER_BUSH = registerNoItem("potted_ender_bush",
            () -> new FlowerPotBlock(ENDER_BUSH.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<EnderBushBlock> FLOWERING_ENDER_BUSH = register("flowering_ender_bush",
            EnderBushBlock::new);

    public static final RegistryObject<FlowerPotBlock> POTTED_FLOWERING_ENDER_BUSH = registerNoItem("potted_flowering_ender_bush",
            () -> new FlowerPotBlock(FLOWERING_ENDER_BUSH.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    // Misc

    public static final RegistryObject<ChainBlock> COPPER_CHAIN = register("copper_chain",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()));

    public static final RegistryObject<ChainBlock> ROPE = register("rope",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.WOOL).strength(0.5F).sound(SoundType.WOOL).noOcclusion()));

    // Lantern Rope

    public static final RegistryObject<LanternBlock> COPPER_LANTERN_ROPE = register("copper_lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15)));

    public static final RegistryObject<LanternBlock> COPPER_SOUL_LANTERN_ROPE = register("copper_soul_lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 10)));

    public static final RegistryObject<LanternBlock> LANTERN_ROPE = register("lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15)));

    public static final RegistryObject<LanternBlock> SOUL_LANTERN_ROPE = register("soul_lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 10)));

    // Lantern Chain

    public static final RegistryObject<LanternBlock> COPPER_LANTERN = register("copper_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15)));

    public static final RegistryObject<LanternBlock> COPPER_SOUL_LANTERN = register("copper_soul_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 10)));

    public static final RegistryObject<IronBarsBlock> COPPER_BARS = register("copper_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    // Copper Post

    public static final RegistryObject<PostBlock> COPPER_POST = register("copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<PostBlock> EXPOSED_COPPER_POST = register("exposed_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.EXPOSED_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<PostBlock> WEATHERED_COPPER_POST = register("weathered_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.WEATHERED_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<PostBlock> OXIDIZED_COPPER_POST = register("oxidized_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.OXIDIZED_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    // Cut Copper Post

    public static final RegistryObject<PostBlock> CUT_COPPER_POST = register("cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.CUT_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<PostBlock> EXPOSED_CUT_COPPER_POST = register("exposed_cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.EXPOSED_CUT_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<PostBlock> WEATHERED_CUT_COPPER_POST = register("weathered_cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.WEATHERED_CUT_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<PostBlock> OXIDIZED_CUT_COPPER_POST = register("oxidized_cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.OXIDIZED_CUT_COPPER_POST.get(), TooltipBlockItem.Tooltip.COPPER));

    // Copper Stairs

    public static final RegistryObject<WeatheringCopperStairBlock> COPPER_STAIRS = register("copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.UNAFFECTED, COPPER_BLOCK.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(COPPER_BLOCK))), () -> new TooltipBlockItem(ModBlocks.COPPER_STAIRS.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<WeatheringCopperStairBlock> EXPOSED_COPPER_STAIRS = register("exposed_copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.EXPOSED, EXPOSED_COPPER.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(EXPOSED_COPPER))), () -> new TooltipBlockItem(ModBlocks.EXPOSED_COPPER_STAIRS.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<WeatheringCopperStairBlock> WEATHERED_COPPER_STAIRS = register("weathered_copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.WEATHERED, WEATHERED_COPPER.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(WEATHERED_COPPER))), () -> new TooltipBlockItem(ModBlocks.WEATHERED_COPPER_STAIRS.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<WeatheringCopperStairBlock> OXIDIZED_COPPER_STAIRS = register("oxidized_copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.OXIDIZED, OXIDIZED_COPPER.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(OXIDIZED_COPPER))), () -> new TooltipBlockItem(ModBlocks.OXIDIZED_COPPER_STAIRS.get(), TooltipBlockItem.Tooltip.COPPER));

    // Copper Slab

    public static final RegistryObject<WeatheringCopperSlabBlock> COPPER_SLAB = register("copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.COPPER_SLAB.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<WeatheringCopperSlabBlock> EXPOSED_COPPER_SLAB = register("exposed_copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.EXPOSED_COPPER_SLAB.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<WeatheringCopperSlabBlock> WEATHERED_COPPER_SLAB = register("weathered_copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.WEATHERED_COPPER_SLAB.get(), TooltipBlockItem.Tooltip.COPPER));

    public static final RegistryObject<WeatheringCopperSlabBlock> OXIDIZED_COPPER_SLAB = register("oxidized_copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new TooltipBlockItem(ModBlocks.OXIDIZED_COPPER_SLAB.get(), TooltipBlockItem.Tooltip.COPPER));

    // Amethyst

    public static final RegistryObject<Block> SMOOTH_AMETHYST_BLOCK = register("smooth_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    // Peridot

    public static final RegistryObject<AmethystBlock> PERIDOT_BLOCK = register("peridot_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new TooltipBlockItem(ModBlocks.PERIDOT_BLOCK.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<BuddingPeridotBlock> BUDDING_PERIDOT = register("budding_peridot",
            BuddingPeridotBlock::new);

    public static final RegistryObject<AmethystClusterBlock> PERIDOT_CLUSTER = register("peridot_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new TooltipBlockItem(ModBlocks.PERIDOT_CLUSTER.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> LARGE_PERIDOT_BUD = register("large_peridot_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new TooltipBlockItem(ModBlocks.LARGE_PERIDOT_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_PERIDOT_BUD = register("medium_peridot_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new TooltipBlockItem(ModBlocks.MEDIUM_PERIDOT_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> SMALL_PERIDOT_BUD = register("small_peridot_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new TooltipBlockItem(ModBlocks.SMALL_PERIDOT_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<Block> SMOOTH_PERIDOT_BLOCK = register("smooth_peridot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    // Ruby

    public static final RegistryObject<AmethystBlock> RUBY_BLOCK = register("ruby_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new TooltipBlockItem(ModBlocks.RUBY_BLOCK.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<BuddingRubyBlock> BUDDING_RUBY = register("budding_ruby",
            BuddingRubyBlock::new);

    public static final RegistryObject<AmethystClusterBlock> RUBY_CLUSTER = register("ruby_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new TooltipBlockItem(ModBlocks.RUBY_CLUSTER.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> LARGE_RUBY_BUD = register("large_ruby_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new TooltipBlockItem(ModBlocks.LARGE_RUBY_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_RUBY_BUD = register("medium_ruby_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new TooltipBlockItem(ModBlocks.MEDIUM_RUBY_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> SMALL_RUBY_BUD = register("small_ruby_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new TooltipBlockItem(ModBlocks.SMALL_RUBY_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<Block> SMOOTH_RUBY_BLOCK = register("smooth_ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    //Sapphire

    public static final RegistryObject<AmethystBlock> SAPPHIRE_BLOCK = register("sapphire_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new TooltipBlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<BuddingSapphireBlock> BUDDING_SAPPHIRE = register("budding_sapphire",
            BuddingSapphireBlock::new);

    public static final RegistryObject<AmethystClusterBlock> SAPPHIRE_CLUSTER = register("sapphire_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new TooltipBlockItem(ModBlocks.SAPPHIRE_CLUSTER.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> LARGE_SAPPHIRE_BUD = register("large_sapphire_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new TooltipBlockItem(ModBlocks.LARGE_SAPPHIRE_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_SAPPHIRE_BUD = register("medium_sapphire_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new TooltipBlockItem(ModBlocks.MEDIUM_SAPPHIRE_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> SMALL_SAPPHIRE_BUD = register("small_sapphire_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new TooltipBlockItem(ModBlocks.SMALL_SAPPHIRE_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<Block> SMOOTH_SAPPHIRE_BLOCK = register("smooth_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    //Topaz

    public static final RegistryObject<AmethystBlock> TOPAZ_BLOCK = register("topaz_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new TooltipBlockItem(ModBlocks.TOPAZ_BLOCK.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<BuddingTopazBlock> BUDDING_TOPAZ = register("budding_topaz",
            BuddingTopazBlock::new);

    public static final RegistryObject<AmethystClusterBlock> TOPAZ_CLUSTER = register("topaz_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new TooltipBlockItem(ModBlocks.TOPAZ_CLUSTER.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> LARGE_TOPAZ_BUD = register("large_topaz_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new TooltipBlockItem(ModBlocks.LARGE_TOPAZ_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_TOPAZ_BUD = register("medium_topaz_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new TooltipBlockItem(ModBlocks.MEDIUM_TOPAZ_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<AmethystClusterBlock> SMALL_TOPAZ_BUD = register("small_topaz_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new TooltipBlockItem(ModBlocks.SMALL_TOPAZ_BUD.get(), TooltipBlockItem.Tooltip.AMETHYST));

    public static final RegistryObject<Block> SMOOTH_TOPAZ_BLOCK = register("smooth_topaz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    // Mossy Quartz Bricks

    public static final RegistryObject<Block> MOSSY_QUARTZ_BRICKS = register("mossy_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(QUARTZ_BLOCK)));

    public static final RegistryObject<StairBlock> MOSSY_QUARTZ_BRICK_STAIRS = register("mossy_quartz_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> MOSSY_QUARTZ_BRICK_SLAB = register("mossy_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> MOSSY_QUARTZ_BRICK_WALL = register("mossy_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    // Flowering mossy Quartz Bricks

    public static final RegistryObject<Block> FLOWERING_MOSSY_QUARTZ_BRICKS = register("flowering_mossy_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> FLOWERING_MOSSY_QUARTZ_BRICK_STAIRS = register("flowering_mossy_quartz_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FLOWERING_MOSSY_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> FLOWERING_MOSSY_QUARTZ_BRICK_SLAB = register("flowering_mossy_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> FLOWERING_MOSSY_QUARTZ_BRICK_WALL = register("flowering_mossy_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    // Overgrown Quartz Bricks

    public static final RegistryObject<Block> OVERGROWN_QUARTZ_BRICKS = register("overgrown_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> OVERGROWN_QUARTZ_BRICK_STAIRS = register("overgrown_quartz_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.OVERGROWN_QUARTZ_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> OVERGROWN_QUARTZ_BRICK_SLAB = register("overgrown_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    // Quartz Pillar

    public static final RegistryObject<RotatedPillarBlock> MOSSY_QUARTZ_PILLAR = register("mossy_quartz_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)));

    public static final RegistryObject<RotatedPillarBlock> FLOWERING_MOSSY_QUARTZ_PILLAR = register("flowering_mossy_quartz_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)));

    public static final RegistryObject<RotatedPillarBlock> OVERGROWN_QUARTZ_PILLAR = register("overgrown_quartz_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)));

    // Mossy Quartz Block

    public static final RegistryObject<Block> MOSSY_QUARTZ_BLOCK = register("mossy_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(QUARTZ_BLOCK)));

    public static final RegistryObject<StairBlock> MOSSY_QUARTZ_STAIRS = register("mossy_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> MOSSY_QUARTZ_SLAB = register("mossy_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> MOSSY_QUARTZ_WALL = register("mossy_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    // Flowering Mossy Quartz Block

    public static final RegistryObject<Block> FLOWERING_MOSSY_QUARTZ_BLOCK = register("flowering_mossy_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(QUARTZ_BLOCK)));

    public static final RegistryObject<StairBlock> FLOWERING_MOSSY_QUARTZ_STAIRS = register("flowering_mossy_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.FLOWERING_MOSSY_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> FLOWERING_MOSSY_QUARTZ_SLAB = register("flowering_mossy_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<WallBlock> FLOWERING_MOSSY_QUARTZ_WALL = register("flowering_mossy_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    // Overgrown Quartz Block

    public static final RegistryObject<Block> OVERGROWN_QUARTZ_BLOCK = register("overgrown_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> OVERGROWN_QUARTZ_STAIRS = register("overgrown_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.OVERGROWN_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> OVERGROWN_QUARTZ_SLAB = register("overgrown_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    // Overgrown Oak Log

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_OAK_LOG = register("overgrown_oak_log",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(OAK_LOG)));

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_BIRCH_LOG = register("overgrown_birch_log",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(BIRCH_LOG)));

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_SPRUCE_LOG = register("overgrown_spruce_log",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(SPRUCE_LOG)));

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_DARK_OAK_LOG = register("overgrown_dark_oak_log",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(DARK_OAK_LOG)));

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_ACACIA_LOG = register("overgrown_acacia_log",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(ACACIA_LOG)));

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_JUNGLE_LOG = register("overgrown_jungle_log",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(JUNGLE_LOG)));

    // Bamboo

    public static final RegistryObject<RotatedPillarBlock> BAMBOO_BLOCK = register("bamboo_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)));

    public static final RegistryObject<WallBlock> BAMBOO_WALL = register("bamboo_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)));

    public static final RegistryObject<SlabBlock> BAMBOO_SLAB = register("bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)));

    public static final RegistryObject<StairBlock> BAMBOO_STAIRS = register("bamboo_stairs",
            () -> new StairBlock(() -> ModBlocks.BAMBOO_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)));

}


