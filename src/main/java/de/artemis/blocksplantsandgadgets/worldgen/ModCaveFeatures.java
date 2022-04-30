package de.artemis.blocksplantsandgadgets.worldgen;

import de.artemis.blocksplantsandgadgets.blocks.ModBlocks;
import de.artemis.blocksplantsandgadgets.data.ModBlockTags;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import java.util.List;

public class ModCaveFeatures {

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> ENDER_MOSS_VEGETATION = FeatureUtils.register("ender_moss_vegetation", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.FLOWERING_ENDER_BUSH.get().defaultBlockState(), 4).add(ModBlocks.ENDER_BUSH.get().defaultBlockState(), 7).add(ModBlocks.ENDER_MOSS_CARPET.get().defaultBlockState(), 25).add(ModBlocks.ENDER_SPROUTS.get().defaultBlockState(), 50).add(ModBlocks.TALL_ENDER_SPROUTS.get().defaultBlockState(), 10))));
    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> ENDER_MOSS_PATCH_BONEMEAL = FeatureUtils.register("ender_moss_patch_bonemeal", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(ModBlockTags.Blocks.ENDER_MOSS_REPLACEABLE, BlockStateProvider.simple(ModBlocks.ENDER_MOSS_BLOCK.get()), PlacementUtils.inlinePlaced(ENDER_MOSS_VEGETATION), CaveSurface.FLOOR, ConstantInt.of(1), 0.0F, 5, 0.6F, UniformInt.of(1, 2), 0.75F));
    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> PERIDOT_GEODE = FeatureUtils.register("peridot_geode", Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.PERIDOT_BLOCK.get()), BlockStateProvider.simple(ModBlocks.BUDDING_PERIDOT.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_PERIDOT_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_PERIDOT_BUD.get().defaultBlockState(), ModBlocks.LARGE_PERIDOT_BUD.get().defaultBlockState(), ModBlocks.PERIDOT_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> RUBY_GEODE = FeatureUtils.register("ruby_geode", Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.RUBY_BLOCK.get()), BlockStateProvider.simple(ModBlocks.BUDDING_RUBY.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_RUBY_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_RUBY_BUD.get().defaultBlockState(), ModBlocks.LARGE_RUBY_BUD.get().defaultBlockState(), ModBlocks.RUBY_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> SAPPHIRE_GEODE = FeatureUtils.register("sapphire_geode", Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.SAPPHIRE_BLOCK.get()), BlockStateProvider.simple(ModBlocks.BUDDING_SAPPHIRE.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_SAPPHIRE_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_SAPPHIRE_BUD.get().defaultBlockState(), ModBlocks.LARGE_SAPPHIRE_BUD.get().defaultBlockState(), ModBlocks.SAPPHIRE_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> TOPAZ_GEODE = FeatureUtils.register("topaz_geode", Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.TOPAZ_BLOCK.get()), BlockStateProvider.simple(ModBlocks.BUDDING_TOPAZ.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_TOPAZ_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_TOPAZ_BUD.get().defaultBlockState(), ModBlocks.LARGE_TOPAZ_BUD.get().defaultBlockState(), ModBlocks.TOPAZ_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

}
