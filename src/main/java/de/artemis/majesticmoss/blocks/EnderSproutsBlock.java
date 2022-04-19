package de.artemis.majesticmoss.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Material;

import java.util.Random;

public class EnderSproutsBlock extends NetherSproutsBlock implements BonemealableBlock {

    public EnderSproutsBlock() {
        super(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS));
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
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

    public boolean isValidBonemealTarget(BlockGetter level, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    public boolean isBonemealSuccess(Level level, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    public void performBonemeal(ServerLevel level, Random rand, BlockPos pos, BlockState state) {
        popResource(level, pos, new ItemStack(this));
    }
}
