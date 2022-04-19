package de.artemis.majesticmoss.blocks;

import de.artemis.majesticmoss.worldgen.ModCaveFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.MossBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import java.util.Random;

public class EnderMossBlock extends MossBlock {

    public EnderMossBlock() {
        super(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.MOSS));
    }

    public void performBonemeal(ServerLevel p_153792_, Random p_153793_, BlockPos p_153794_, BlockState p_153795_) {
        ModCaveFeatures.ENDER_MOSS_PATCH_BONEMEAL.value().place(p_153792_, p_153792_.getChunkSource().getGenerator(), p_153793_, p_153794_.above());

    }
}
