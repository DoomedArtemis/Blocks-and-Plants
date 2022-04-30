package de.artemis.blocksplantsandgadgets.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModCavePlacements {

    public static final Holder<PlacedFeature> PERIDOT_GEODE = PlacementUtils.register("peridot_geode", ModCaveFeatures.PERIDOT_GEODE, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> RUBY_GEODE = PlacementUtils.register("ruby_geode", ModCaveFeatures.RUBY_GEODE, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> SAPPHIRE_GEODE = PlacementUtils.register("sapphire_geode", ModCaveFeatures.SAPPHIRE_GEODE, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> TOPAZ_GEODE = PlacementUtils.register("topaz_geode", ModCaveFeatures.TOPAZ_GEODE, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    public static void register() {

    }

}
