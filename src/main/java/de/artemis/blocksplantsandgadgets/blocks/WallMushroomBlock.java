package de.artemis.blocksplantsandgadgets.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

import static net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock.FACE;

public class WallMushroomBlock extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    protected static final VoxelShape VOXEL_SHAPE_NORTH = Block.box(4.0D, 5.0D, 11.0D, 14.0D, 12.0D, 16.0D);
    protected static final VoxelShape VOXEL_SHAPE_EAST = Block.box(0.0D, 5.0D, 4.0D, 5.0D, 12.0D, 14.0D);
    protected static final VoxelShape VOXEL_SHAPE_SOUTH = Block.box(2.0D, 5.0D, 0.0D, 12.0D, 12.0D, 5.0D);
    protected static final VoxelShape VOXEL_SHAPE_WEST = Block.box(11.0D, 5.0D, 2.0D, 16.0D, 12.0D, 12.0D);

    public WallMushroomBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public @NotNull VoxelShape getShape(BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        switch ((Direction) blockState.getValue(FACING)) {
            case EAST:
            default:
                return VOXEL_SHAPE_EAST;
            case WEST:
                return VOXEL_SHAPE_WEST;
            case SOUTH:
                return VOXEL_SHAPE_SOUTH;
            case NORTH:
                return VOXEL_SHAPE_NORTH;
        }
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        Direction direction = blockState.getValue(FACING);
        BlockPos blockpos = blockPos.relative(direction.getOpposite());
        BlockState blockstate = levelReader.getBlockState(blockpos);
        return direction.getAxis().isHorizontal() && blockstate.isFaceSturdy(levelReader, blockpos, direction);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_57678_) {
        BlockState blockstate = this.defaultBlockState();
        LevelReader levelreader = p_57678_.getLevel();
        BlockPos blockpos = p_57678_.getClickedPos();
        Direction[] adirection = p_57678_.getNearestLookingDirections();

        for (Direction direction : adirection) {
            if (direction.getAxis().isHorizontal()) {
                Direction direction1 = direction.getOpposite();
                blockstate = blockstate.setValue(FACING, direction1);
                if (blockstate.canSurvive(levelreader, blockpos)) {
                    return blockstate;
                }
            }
        }

        return null;
    }

    @Override
    public @NotNull BlockState updateShape(BlockState p_57731_, Direction p_57732_, @NotNull BlockState p_57733_, @NotNull LevelAccessor p_57734_, @NotNull BlockPos p_57735_, @NotNull BlockPos p_57736_) {
        return p_57732_.getOpposite() == p_57731_.getValue(FACING) && !p_57731_.canSurvive(p_57734_, p_57735_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_57731_, p_57732_, p_57733_, p_57734_, p_57735_, p_57736_);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACE, FACING);
    }

}
