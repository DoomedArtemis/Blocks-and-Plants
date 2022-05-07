package de.artemis.blocksplantsandgadgets.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;

public class BookshelfSlabBlock extends SlabBlock {
    public BookshelfSlabBlock(Properties properties) {
        super(properties);
    }

    public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
        SlabType slabtype = state.getValue(TYPE);

        if (slabtype == SlabType.BOTTOM || slabtype == SlabType.TOP) {
            return 0.5f;
        } else {
            return 1;
        }
    }
}
