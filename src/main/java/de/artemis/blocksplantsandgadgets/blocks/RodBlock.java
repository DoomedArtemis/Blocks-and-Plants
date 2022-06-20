package de.artemis.blocksplantsandgadgets.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class RodBlock extends Block{

    public RodBlock(Properties properties) {
        super(properties);
    }

    protected static final VoxelShape voxelShape = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);

    public @NotNull VoxelShape getShape(@NotNull BlockState p_154346_, @NotNull BlockGetter p_154347_, @NotNull BlockPos p_154348_, @NotNull CollisionContext p_154349_) {
        return voxelShape;
    }
}
