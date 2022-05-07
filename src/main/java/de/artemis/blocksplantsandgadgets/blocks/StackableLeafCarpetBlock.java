package de.artemis.blocksplantsandgadgets.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class StackableLeafCarpetBlock extends SnowLayerBlock {

    public StackableLeafCarpetBlock(String type) {
        super(BlockBehaviour.Properties.of(Material.LEAVES).sound(type.equalsIgnoreCase("azalea") ? SoundType.AZALEA_LEAVES : SoundType.GRASS).noOcclusion().isViewBlocking(ModBlocks::never).strength(0.2F));
    }

    @SuppressWarnings("deprecation")
    @NotNull
    @Override
    public RenderShape getRenderShape(@NotNull BlockState p_149645_1_) {
        return RenderShape.MODEL;
    }

    @NotNull
    @Override
    public VoxelShape getCollisionShape(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SHAPE_BY_LAYER[state.getValue(LAYERS)];
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        return true;
    }

    @Override
    public boolean useShapeForLightOcclusion(@NotNull BlockState state) {
        return false;
    }

    public boolean canBeReplaced(BlockState blockState, BlockPlaceContext blockPlaceContext) {
        int i = blockState.getValue(LAYERS);
        if (blockPlaceContext.getItemInHand().is(this.asItem()) && i < 8) {
            if (blockPlaceContext.replacingClickedOnBlock()) {
                return blockPlaceContext.getClickedFace() == Direction.UP;
            }
            return true;
        }
        return false;
    }

}
