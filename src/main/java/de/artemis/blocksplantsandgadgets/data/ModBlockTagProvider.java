package de.artemis.blocksplantsandgadgets.data;

import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import de.artemis.blocksplantsandgadgets.blocks.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

public class ModBlockTagProvider extends TagsProvider<Block> {

    protected ModBlockTagProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, Registry.BLOCK, BlocksPlantsAndGadgets.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(ModBlockTags.Blocks.ENDER_MOSS_REPLACEABLE).add(Blocks.END_STONE, ModBlocks.MOSSY_END_STONE.get(), Blocks.END_STONE_BRICKS, ModBlocks.MOSSY_END_STONE_BRICKS.get(), Blocks.PURPUR_BLOCK, ModBlocks.MOSSY_PURPUR_BLOCK.get(),  Blocks.PURPUR_PILLAR, ModBlocks.MOSSY_PURPUR_PILLAR.get());
    }

    @NotNull
    @Override
    protected Path getPath(ResourceLocation id) {
        return this.generator.getOutputFolder().resolve("data/" + id.getNamespace() + "/tags/blocks/" + id.getPath() + ".json");
    }

    @NotNull
    @Override
    public String getName() {
        return "Artemis BlockTags";
    }
}
