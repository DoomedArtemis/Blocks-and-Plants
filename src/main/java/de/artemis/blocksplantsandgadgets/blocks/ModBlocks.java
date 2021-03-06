package de.artemis.blocksplantsandgadgets.blocks;

import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import de.artemis.blocksplantsandgadgets.items.BPGBlockItem;
import de.artemis.blocksplantsandgadgets.Registration;
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
                new Item.Properties().tab(BlocksPlantsAndGadgets.INVENTORY_TAB)));

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

    // Prismarine

    public static final RegistryObject<WallBlock> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));


    public static final RegistryObject<WallBlock> DARK_PRISMARINE_WALL = register("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    // Concrete

    public static final RegistryObject<StairBlock> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs",
            () -> new StairBlock(() -> WHITE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = register("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> WHITE_CONCRETE_WALL = register("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs",
            () -> new StairBlock(() -> ORANGE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> ORANGE_CONCRETE_WALL = register("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs",
            () -> new StairBlock(() -> MAGENTA_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs",
            () -> new StairBlock(() -> LIGHT_BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs",
            () -> new StairBlock(() -> YELLOW_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> YELLOW_CONCRETE_WALL = register("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs",
            () -> new StairBlock(() -> LIME_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = register("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> LIME_CONCRETE_WALL = register("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs",
            () -> new StairBlock(() -> PINK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = register("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> PINK_CONCRETE_WALL = register("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs",
            () -> new StairBlock(() -> GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = register("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> GRAY_CONCRETE_WALL = register("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs",
            () -> new StairBlock(() -> LIGHT_GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs",
            () -> new StairBlock(() -> CYAN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> CYAN_CONCRETE_WALL = register("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs",
            () -> new StairBlock(() -> PURPLE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> PURPLE_CONCRETE_WALL = register("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs",
            () -> new StairBlock(() -> BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = register("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> BLUE_CONCRETE_WALL = register("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs",
            () -> new StairBlock(() -> BROWN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = register("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> BROWN_CONCRETE_WALL = register("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs",
            () -> new StairBlock(() -> GREEN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = register("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> GREEN_CONCRETE_WALL = register("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> RED_CONCRETE_STAIRS = register("red_concrete_stairs",
            () -> new StairBlock(() -> RED_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = register("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> RED_CONCRETE_WALL = register("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<StairBlock> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs",
            () -> new StairBlock(() -> BLACK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = register("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    public static final RegistryObject<WallBlock> BLACK_CONCRETE_WALL = register("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F)));

    // Misc Thin Block

    public static final RegistryObject<PostBlock> THIN_PURPUR_PILLAR = register("thin_purpur_pillar",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<PostBlock> THIN_POLISHED_BASALT = register("thin_polished_basalt",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

    public static final RegistryObject<PostBlock> THIN_QUARTZ_PILLAR = register("thin_quartz_pillar",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)));

    public static final RegistryObject<PostBlock> THIN_BONE_BLOCK = register("thin_bone_block",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F).sound(SoundType.BONE_BLOCK)));

    // Dye Block

    public static final RegistryObject<Block> BLOCK_OF_WHITE_DYE = register("block_of_white_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_ORANGE_DYE = register("block_of_orange_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_MAGENTA_DYE = register("block_of_magenta_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_LIGHT_BLUE_DYE = register("block_of_light_blue_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_YELLOW_DYE = register("block_of_yellow_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_LIME_DYE = register("block_of_lime_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_PINK_DYE = register("block_of_pink_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_GRAY_DYE = register("block_of_gray_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_LIGHT_GRAY_DYE = register("block_of_light_gray_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_CYAN_DYE = register("block_of_cyan_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_PURPLE_DYE = register("block_of_purple_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_BLUE_DYE = register("block_of_blue_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_BROWN_DYE = register("block_of_brown_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_GREEN_DYE = register("block_of_green_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_RED_DYE = register("block_of_red_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    public static final RegistryObject<Block> BLOCK_OF_BLACK_DYE = register("block_of_black_dye",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.75F, 0.75F).sound(SoundType.CANDLE)));

    // Iron

    public static final RegistryObject<Block> CUT_IRON = register("cut_iron",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<StairBlock> CUT_IRON_STAIRS = register("cut_iron_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_IRON.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<SlabBlock> CUT_IRON_SLAB = register("cut_iron_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<PostBlock> CUT_IRON_POST = register("cut_iron_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<RodBlock> CUT_IRON_ROD = register("cut_iron_rod",
            () -> new RodBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    // Thin Log

    public static final RegistryObject<PostBlock> THIN_OAK_LOG = register("thin_oak_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_OAK_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_OAK_LOG = register("thin_stripped_oak_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_OAK_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_SPRUCE_LOG = register("thin_spruce_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_SPRUCE_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_SPRUCE_LOG = register("thin_stripped_spruce_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_SPRUCE_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_BIRCH_LOG = register("thin_birch_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_BIRCH_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_BIRCH_LOG = register("thin_stripped_birch_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_BIRCH_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_DARK_OAK_LOG = register("thin_dark_oak_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_DARK_OAK_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_DARK_OAK_LOG = register("thin_stripped_dark_oak_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_DARK_OAK_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_ACACIA_LOG = register("thin_acacia_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_ACACIA_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_ACACIA_LOG = register("thin_stripped_acacia_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_ACACIA_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_JUNGLE_LOG = register("thin_jungle_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_JUNGLE_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_JUNGLE_LOG = register("thin_stripped_jungle_log",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_JUNGLE_LOG.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_CRIMSON_STEM = register("thin_crimson_stem",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F).sound(SoundType.STEM)), () -> new BPGBlockItem(ModBlocks.THIN_CRIMSON_STEM.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_CRIMSON_STEM = register("thin_stripped_crimson_stem",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F).sound(SoundType.STEM)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_CRIMSON_STEM.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_WARPED_STEM = register("thin_warped_stem",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F).sound(SoundType.STEM)), () -> new BPGBlockItem(ModBlocks.THIN_WARPED_STEM.get(), BPGBlockItem.Tooltip.NONE, 75));

    public static final RegistryObject<PostBlock> THIN_STRIPPED_WARPED_STEM = register("thin_stripped_warped_stem",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F).sound(SoundType.STEM)), () -> new BPGBlockItem(ModBlocks.THIN_STRIPPED_WARPED_STEM.get(), BPGBlockItem.Tooltip.NONE, 75));

    // Mushroom

    public static final RegistryObject<PostBlock> THIN_MUSHROOM_STEM = register("thin_mushroom_stem",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).sound(SoundType.WOOD)));

    public static final RegistryObject<WallMushroomBlock> WILD_BROWN_MUSHROOM = register("wild_brown_mushroom",
            () -> new WallMushroomBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<WallMushroomBlock> WILD_RED_MUSHROOM = register("wild_red_mushroom",
            () -> new WallMushroomBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));

    // Nylium

    public static final RegistryObject<CarpetBlock> CRIMSON_NYLIUM_CARPET = register("crimson_nylium_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.NYLIUM)));

    public static final RegistryObject<StackableBlock> STACKABLE_CRIMSON_NYLIUM_CARPET = register("stackable_crimson_nylium_carpet",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.NYLIUM)));

    public static final RegistryObject<CarpetBlock> WARPED_NYLIUM_CARPET = register("warped_nylium_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.NYLIUM)));

    public static final RegistryObject<StackableBlock> STACKABLE_WARPED_NYLIUM_CARPET = register("stackable_warped_nylium_carpet",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.NYLIUM)));

    // Patches

    public static final RegistryObject<StackableBlock> GRASS_BLOCK_PATCH = register("grass_block_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));

    public static final RegistryObject<StackableBlock> DIRT_PATCH = register("dirt_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<StackableBlock> COARSE_DIRT_PATCH = register("coarse_dirt_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<StackableBlock> PODZOL_PATCH = register("podzol_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<StackableBlock> ROOTED_DIRT_PATCH = register("rooted_dirt_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F).sound(SoundType.ROOTED_DIRT)));

    public static final RegistryObject<StackableBlock> SAND_PATCH = register("sand_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<StackableBlock> RED_SAND_PATCH = register("red_sand_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<StackableBlock> GRAVEL_PATCH = register("gravel_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.SAND).strength(0.6F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<StackableBlock> CLAY_PATCH = register("clay_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<StackableBlock> MYCELIUM_PATCH = register("mycelium_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));

    public static final RegistryObject<StackableSoulSandBlock> SOUL_SAND_PATCH = register("soul_sand_patch",
            () -> new StackableSoulSandBlock(BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).speedFactor(0.4F).sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<StackableBlock> SOUL_SOIL_PATCH = register("soul_soil_patch",
            () -> new StackableBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F).sound(SoundType.SOUL_SOIL)));

    public static final RegistryObject<StackablePathBlock> DIRT_PATH_PATCH = register("dirt_path_patch",
            () -> new StackablePathBlock(BlockBehaviour.Properties.of(Material.DIRT).strength(0.65F).sound(SoundType.GRASS)));

    // Bars

    public static final RegistryObject<IronBarsBlock> COPPER_BARS = register("copper_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.COPPER).noOcclusion()));

    public static final RegistryObject<IronBarsBlock> BROKEN_COPPER_BARS = register("broken_copper_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.COPPER).noOcclusion()));

    public static final RegistryObject<IronBarsBlock> BROKEN_IRON_BARS = register("broken_iron_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<IronBarsBlock> GOLD_BARS = register("gold_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<IronBarsBlock> BROKEN_GOLD_BARS = register("broken_gold_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    // Chain

    public static final RegistryObject<ChainBlock> COPPER_CHAIN = register("copper_chain",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()));

    public static final RegistryObject<ChainBlock> GOLD_CHAIN = register("gold_chain",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()));

    // Smooth Basalt

    public static final RegistryObject<StairBlock> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

    public static final RegistryObject<SlabBlock> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

    public static final RegistryObject<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));

    // Tuff

    public static final RegistryObject<StairBlock> TUFF_STAIRS = register("tuff_stairs",
            () -> new StairBlock(() -> Blocks.TUFF.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.TUFF)));

    public static final RegistryObject<SlabBlock> TUFF_SLAB = register("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.TUFF)));

    public static final RegistryObject<WallBlock> TUFF_WALL = register("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.TUFF)));

    // Calcite

    public static final RegistryObject<StairBlock> CALCITE_STAIRS = register("calcite_stairs",
            () -> new StairBlock(() -> Blocks.CALCITE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.75f).sound(SoundType.CALCITE)));

    public static final RegistryObject<SlabBlock> CALCITE_SLAB = register("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.75f).sound(SoundType.CALCITE)));

    public static final RegistryObject<WallBlock> CALCITE_WALL = register("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.75f).sound(SoundType.CALCITE)));

    // Bookshelf

    public static final RegistryObject<BookshelfBlock> SPRUCE_BOOKSHELF = register("spruce_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.SPRUCE_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<BookshelfBlock> BIRCH_BOOKSHELF = register("birch_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.BIRCH_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<BookshelfBlock> DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.DARK_OAK_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<BookshelfBlock> ACACIA_BOOKSHELF = register("acacia_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.ACACIA_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<BookshelfBlock> JUNGLE_BOOKSHELF = register("jungle_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.JUNGLE_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<BookshelfBlock> CRIMSON_BOOKSHELF = register("crimson_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.CRIMSON_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<BookshelfBlock> WARPED_BOOKSHELF = register("warped_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.WARPED_BOOKSHELF.get(), BPGBlockItem.Tooltip.NONE, 300));

    // Bookshelf Slab

    public static final RegistryObject<BookshelfSlabBlock> BOOKSHELF_SLAB = register("bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> SPRUCE_BOOKSHELF_SLAB = register("spruce_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.SPRUCE_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> BIRCH_BOOKSHELF_SLAB = register("birch_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.BIRCH_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> DARK_OAK_BOOKSHELF_SLAB = register("dark_oak_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.DARK_OAK_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> ACACIA_BOOKSHELF_SLAB = register("acacia_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.ACACIA_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> JUNGLE_BOOKSHELF_SLAB = register("jungle_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.JUNGLE_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> CRIMSON_BOOKSHELF_SLAB = register("crimson_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.CRIMSON_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    public static final RegistryObject<BookshelfSlabBlock> WARPED_BOOKSHELF_SLAB = register("warped_bookshelf_slab",
            () -> new BookshelfSlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.WARPED_BOOKSHELF_SLAB.get(), BPGBlockItem.Tooltip.NONE, 150));

    // Wood Wall

    public static final RegistryObject<WallBlock> OAK_WALL = register("oak_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.OAK_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> SPRUCE_WALL = register("spruce_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.SPRUCE_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> BIRCH_WALL = register("birch_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.BIRCH_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> DARK_OAK_WALL = register("dark_oak_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.DARK_OAK_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> ACACIA_WALL = register("acacia_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.ACACIA_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> JUNGLE_WALL = register("jungle_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.JUNGLE_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> CRIMSON_WALL = register("crimson_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.CRIMSON_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

    public static final RegistryObject<WallBlock> WARPED_WALL = register("warped_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), () -> new BPGBlockItem(ModBlocks.WARPED_WALL.get(), BPGBlockItem.Tooltip.NONE, 300));

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
            () -> new EnderBushBlock(), () -> new BPGBlockItem(ModBlocks.ENDER_BUSH.get(), BPGBlockItem.Tooltip.NONE, 100));

    public static final RegistryObject<FlowerPotBlock> POTTED_ENDER_BUSH = registerNoItem("potted_ender_bush",
            () -> new FlowerPotBlock(ENDER_BUSH.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    public static final RegistryObject<EnderBushBlock> FLOWERING_ENDER_BUSH = register("flowering_ender_bush",
            () -> new EnderBushBlock(), () -> new BPGBlockItem(ModBlocks.FLOWERING_ENDER_BUSH.get(), BPGBlockItem.Tooltip.NONE, 100));

    public static final RegistryObject<FlowerPotBlock> POTTED_FLOWERING_ENDER_BUSH = registerNoItem("potted_flowering_ender_bush",
            () -> new FlowerPotBlock(FLOWERING_ENDER_BUSH.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

    // Misc

    public static final RegistryObject<ChainBlock> ROPE = register("rope",
            () -> new ChainBlock(BlockBehaviour.Properties.of(Material.WOOL).strength(0.5F).sound(SoundType.WOOL).noOcclusion()));

    // Lantern Rope

    public static final RegistryObject<LanternBlock> COPPER_LANTERN_ROPE = register("copper_lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15)));

    public static final RegistryObject<LanternBlock> COPPER_SOUL_LANTERN_ROPE = register("copper_soul_lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 10)));

    public static final RegistryObject<LanternBlock> GOLD_LANTERN_ROPE = register("gold_lantern_rope",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15)));

    public static final RegistryObject<LanternBlock> GOLD_SOUL_LANTERN_ROPE = register("gold_soul_lantern_rope",
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

    public static final RegistryObject<LanternBlock> GOLD_LANTERN = register("gold_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15)));

    public static final RegistryObject<LanternBlock> GOLD_SOUL_LANTERN = register("gold_soul_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187433_) -> 10)));

    // Copper Post

    public static final RegistryObject<PostBlock> COPPER_POST = register("copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<PostBlock> EXPOSED_COPPER_POST = register("exposed_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.EXPOSED_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<PostBlock> WEATHERED_COPPER_POST = register("weathered_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.WEATHERED_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<PostBlock> OXIDIZED_COPPER_POST = register("oxidized_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.OXIDIZED_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    // Cut Copper Post

    public static final RegistryObject<PostBlock> CUT_COPPER_POST = register("cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.CUT_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<PostBlock> EXPOSED_CUT_COPPER_POST = register("exposed_cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.EXPOSED_CUT_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<PostBlock> WEATHERED_CUT_COPPER_POST = register("weathered_cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.WEATHERED_CUT_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<PostBlock> OXIDIZED_CUT_COPPER_POST = register("oxidized_cut_copper_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.OXIDIZED_CUT_COPPER_POST.get(), BPGBlockItem.Tooltip.WIP, 0));

    // Copper Stairs

    public static final RegistryObject<WeatheringCopperStairBlock> COPPER_STAIRS = register("copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.UNAFFECTED, COPPER_BLOCK.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(COPPER_BLOCK))), () -> new BPGBlockItem(ModBlocks.COPPER_STAIRS.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<WeatheringCopperStairBlock> EXPOSED_COPPER_STAIRS = register("exposed_copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.EXPOSED, EXPOSED_COPPER.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(EXPOSED_COPPER))), () -> new BPGBlockItem(ModBlocks.EXPOSED_COPPER_STAIRS.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<WeatheringCopperStairBlock> WEATHERED_COPPER_STAIRS = register("weathered_copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.WEATHERED, WEATHERED_COPPER.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(WEATHERED_COPPER))), () -> new BPGBlockItem(ModBlocks.WEATHERED_COPPER_STAIRS.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<WeatheringCopperStairBlock> OXIDIZED_COPPER_STAIRS = register("oxidized_copper_stairs",
            () -> new WeatheringCopperStairBlock(WeatheringCopperStairBlock.WeatherState.OXIDIZED, OXIDIZED_COPPER.defaultBlockState(),
                    (BlockBehaviour.Properties.copy(OXIDIZED_COPPER))), () -> new BPGBlockItem(ModBlocks.OXIDIZED_COPPER_STAIRS.get(), BPGBlockItem.Tooltip.WIP, 0));

    // Copper Slab

    public static final RegistryObject<WeatheringCopperSlabBlock> COPPER_SLAB = register("copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.COPPER_SLAB.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<WeatheringCopperSlabBlock> EXPOSED_COPPER_SLAB = register("exposed_copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.EXPOSED_COPPER_SLAB.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<WeatheringCopperSlabBlock> WEATHERED_COPPER_SLAB = register("weathered_copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.WEATHERED_COPPER_SLAB.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<WeatheringCopperSlabBlock> OXIDIZED_COPPER_SLAB = register("oxidized_copper_slab",
            () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)), () -> new BPGBlockItem(ModBlocks.OXIDIZED_COPPER_SLAB.get(), BPGBlockItem.Tooltip.WIP, 0));

    // Amethyst

    public static final RegistryObject<Block> SMOOTH_AMETHYST_BLOCK = register("smooth_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    // Peridot

    public static final RegistryObject<AmethystBlock> PERIDOT_BLOCK = register("peridot_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new BPGBlockItem(ModBlocks.PERIDOT_BLOCK.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<BuddingPeridotBlock> BUDDING_PERIDOT = register("budding_peridot",
            BuddingPeridotBlock::new);

    public static final RegistryObject<AmethystClusterBlock> PERIDOT_CLUSTER = register("peridot_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new BPGBlockItem(ModBlocks.PERIDOT_CLUSTER.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> LARGE_PERIDOT_BUD = register("large_peridot_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new BPGBlockItem(ModBlocks.LARGE_PERIDOT_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_PERIDOT_BUD = register("medium_peridot_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new BPGBlockItem(ModBlocks.MEDIUM_PERIDOT_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> SMALL_PERIDOT_BUD = register("small_peridot_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new BPGBlockItem(ModBlocks.SMALL_PERIDOT_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<Block> SMOOTH_PERIDOT_BLOCK = register("smooth_peridot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    // Ruby

    public static final RegistryObject<AmethystBlock> RUBY_BLOCK = register("ruby_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new BPGBlockItem(ModBlocks.RUBY_BLOCK.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<BuddingRubyBlock> BUDDING_RUBY = register("budding_ruby",
            BuddingRubyBlock::new);

    public static final RegistryObject<AmethystClusterBlock> RUBY_CLUSTER = register("ruby_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new BPGBlockItem(ModBlocks.RUBY_CLUSTER.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> LARGE_RUBY_BUD = register("large_ruby_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new BPGBlockItem(ModBlocks.LARGE_RUBY_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_RUBY_BUD = register("medium_ruby_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new BPGBlockItem(ModBlocks.MEDIUM_RUBY_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> SMALL_RUBY_BUD = register("small_ruby_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new BPGBlockItem(ModBlocks.SMALL_RUBY_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<Block> SMOOTH_RUBY_BLOCK = register("smooth_ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    //Sapphire

    public static final RegistryObject<AmethystBlock> SAPPHIRE_BLOCK = register("sapphire_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new BPGBlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<BuddingSapphireBlock> BUDDING_SAPPHIRE = register("budding_sapphire",
            BuddingSapphireBlock::new);

    public static final RegistryObject<AmethystClusterBlock> SAPPHIRE_CLUSTER = register("sapphire_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new BPGBlockItem(ModBlocks.SAPPHIRE_CLUSTER.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> LARGE_SAPPHIRE_BUD = register("large_sapphire_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new BPGBlockItem(ModBlocks.LARGE_SAPPHIRE_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_SAPPHIRE_BUD = register("medium_sapphire_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new BPGBlockItem(ModBlocks.MEDIUM_SAPPHIRE_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> SMALL_SAPPHIRE_BUD = register("small_sapphire_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new BPGBlockItem(ModBlocks.SMALL_SAPPHIRE_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<Block> SMOOTH_SAPPHIRE_BLOCK = register("smooth_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    //Topaz

    public static final RegistryObject<AmethystBlock> TOPAZ_BLOCK = register("topaz_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), () -> new BPGBlockItem(ModBlocks.TOPAZ_BLOCK.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<BuddingTopazBlock> BUDDING_TOPAZ = register("budding_topaz",
            BuddingTopazBlock::new);

    public static final RegistryObject<AmethystClusterBlock> TOPAZ_CLUSTER = register("topaz_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)), () -> new BPGBlockItem(ModBlocks.TOPAZ_CLUSTER.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> LARGE_TOPAZ_BUD = register("large_topaz_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.MEDIUM_AMETHYST_BUD).strength(1.5F).lightLevel((p_152632_) -> 4)), () -> new BPGBlockItem(ModBlocks.LARGE_TOPAZ_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> MEDIUM_TOPAZ_BUD = register("medium_topaz_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.LARGE_AMETHYST_BUD).strength(1.5F).lightLevel((p_152617_) -> 2)), () -> new BPGBlockItem(ModBlocks.MEDIUM_TOPAZ_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

    public static final RegistryObject<AmethystClusterBlock> SMALL_TOPAZ_BUD = register("small_topaz_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.SMALL_AMETHYST_BUD).strength(1.5F).lightLevel((p_187409_) -> 1)), () -> new BPGBlockItem(ModBlocks.SMALL_TOPAZ_BUD.get(), BPGBlockItem.Tooltip.WIP, 0));

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

    // Overgrown Log

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

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_CRIMSON_STEM = register("overgrown_crimson_stem",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(CRIMSON_STEM)));

    public static final RegistryObject<OvergrownLogBlock> OVERGROWN_WARPED_STEM= register("overgrown_warped_stem",
            () -> new OvergrownLogBlock(BlockBehaviour.Properties.copy(WARPED_STEM)));

    // Bamboo

    public static final RegistryObject<RotatedPillarBlock> BAMBOO_BLOCK = register("bamboo_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)), () -> new BPGBlockItem(ModBlocks.BAMBOO_BLOCK.get(), BPGBlockItem.Tooltip.NONE, 450));

    public static final RegistryObject<WallBlock> BAMBOO_WALL = register("bamboo_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)), () -> new BPGBlockItem(ModBlocks.BAMBOO_WALL.get(), BPGBlockItem.Tooltip.NONE, 450));

    public static final RegistryObject<SlabBlock> BAMBOO_SLAB = register("bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)), () -> new BPGBlockItem(ModBlocks.BAMBOO_SLAB.get(), BPGBlockItem.Tooltip.NONE, 225));

    public static final RegistryObject<StairBlock> BAMBOO_STAIRS = register("bamboo_stairs",
            () -> new StairBlock(() -> ModBlocks.BAMBOO_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)), () -> new BPGBlockItem(ModBlocks.BAMBOO_STAIRS.get(), BPGBlockItem.Tooltip.NONE, 450));

    public static final RegistryObject<PostBlock> BAMBOO_POST = register("bamboo_post",
            () -> new PostBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)), () -> new BPGBlockItem(ModBlocks.BAMBOO_POST.get(), BPGBlockItem.Tooltip.NONE, 112));

    public static final RegistryObject<RodBlock> BAMBOO_ROD = register("bamboo_rod",
            () -> new RodBlock(BlockBehaviour.Properties.of(Material.BAMBOO).strength(1.0F).sound(SoundType.BAMBOO)), () -> new BPGBlockItem(ModBlocks.BAMBOO_ROD.get(), BPGBlockItem.Tooltip.NONE, 28));

}


