package de.artemis.blocksplantsandgadgets.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BookshelfBlock extends Block {
    public BookshelfBlock(Properties properties) {
        super(properties);
    }

    public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
        return 1;
    }

}
