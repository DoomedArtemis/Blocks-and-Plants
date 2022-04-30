package de.artemis.blocksplantsandgadgets.data;

import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ModBlockTags {

    public static class Blocks {

        public static final TagKey<Block> ENDER_MOSS_REPLACEABLE = mod("ender_moss_replaceable");

        public static void init(){}

        private static TagKey<Block> forge(@NotNull String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Block> mod(@NotNull String name) {
            return BlockTags.create(new ResourceLocation(BlocksPlantsAndGadgets.MOD_ID, name));
        }

    }

    public static class Items {

        public static void init(){}

        private static TagKey<Item> forge(@NotNull String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
