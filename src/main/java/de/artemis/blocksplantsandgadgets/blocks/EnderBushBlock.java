package de.artemis.blocksplantsandgadgets.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.AzaleaBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class EnderBushBlock extends AzaleaBlock {

    public EnderBushBlock() {
        super(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.AZALEA).instabreak().noOcclusion());
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
        if (state.getBlock() instanceof SlabBlock) {
            if (state.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
                return false;
            }
        }

        return state.is(ModBlocks.ENDER_MOSS_BLOCK.get()) || state.is(ModBlocks.ENDER_MOSS_SLAB.get()) ||
                state.is(ModBlocks.MOSSY_END_STONE.get()) || state.is(ModBlocks.MOSSY_END_STONE_SLAB.get()) ||
                state.is(ModBlocks.MOSSY_END_STONE_BRICKS.get()) || state.is(ModBlocks.MOSSY_END_STONE_BRICK_SLAB.get()) ||
                state.is(Blocks.END_STONE);
    }
    @Override
    public boolean isValidBonemealTarget(BlockGetter p_152074_, BlockPos p_152075_, BlockState p_152076_, boolean p_152077_) {
        return false;
    }
    @Override
    public void performBonemeal(ServerLevel p_152069_, Random p_152070_, BlockPos p_152071_, BlockState p_152072_) {
        // Overwritten so it won't do anything
    }
}
