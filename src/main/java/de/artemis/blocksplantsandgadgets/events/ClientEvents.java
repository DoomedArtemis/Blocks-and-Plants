package de.artemis.blocksplantsandgadgets.events;

import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import de.artemis.blocksplantsandgadgets.blocks.ModBlocks;
import de.artemis.blocksplantsandgadgets.util.KeyBindings;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BlocksPlantsAndGadgets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onBlockColorEvent(ColorHandlerEvent.Item event) {
        event.getBlockColors().register((state, level, pos, tint) -> level != null && pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.OAK_LEAF_CARPET.get(),ModBlocks.DARK_OAK_LEAF_CARPET.get(), ModBlocks.ACACIA_LEAF_CARPET.get(), ModBlocks.JUNGLE_LEAF_CARPET.get(),
                ModBlocks.SMALL_OAK_LEAF_CARPET.get(), ModBlocks.SMALL_DARK_OAK_LEAF_CARPET.get(), ModBlocks.SMALL_ACACIA_LEAF_CARPET.get(), ModBlocks.SMALL_JUNGLE_LEAF_CARPET.get(),
                ModBlocks.STACKABLE_OAK_LEAF_CARPET.get(), ModBlocks.STACKABLE_DARK_OAK_LEAF_CARPET.get(), ModBlocks.STACKABLE_ACACIA_LEAF_CARPET.get(), ModBlocks.STACKABLE_JUNGLE_LEAF_CARPET.get(), ModBlocks.GRASS_BLOCK_PATCH.get());

        event.getBlockColors().register((state, level, pos, tint) -> FoliageColor.getEvergreenColor(),
                 ModBlocks.SPRUCE_LEAF_CARPET.get(), ModBlocks.SMALL_SPRUCE_LEAF_CARPET.get(), ModBlocks.STACKABLE_SPRUCE_LEAF_CARPET.get());

        event.getBlockColors().register((state, level, pos, tint) -> FoliageColor.getBirchColor(),
                ModBlocks.BIRCH_LEAF_CARPET.get(), ModBlocks.SMALL_BIRCH_LEAF_CARPET.get(), ModBlocks.STACKABLE_BIRCH_LEAF_CARPET.get(), ModBlocks.GRASS_BLOCK_PATCH.get());

        event.getItemColors().register((p_92687_, p_92688_) -> {
            BlockState blockstate = ((BlockItem)p_92687_.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(blockstate, null, null, p_92688_);
        }, ModBlocks.OAK_LEAF_CARPET.get(), ModBlocks.BIRCH_LEAF_CARPET.get(), ModBlocks.SPRUCE_LEAF_CARPET.get(),
                ModBlocks.DARK_OAK_LEAF_CARPET.get(), ModBlocks.ACACIA_LEAF_CARPET.get(), ModBlocks.JUNGLE_LEAF_CARPET.get(),
                ModBlocks.SMALL_OAK_LEAF_CARPET.get(), ModBlocks.SMALL_BIRCH_LEAF_CARPET.get(), ModBlocks.SMALL_SPRUCE_LEAF_CARPET.get(),
                ModBlocks.SMALL_DARK_OAK_LEAF_CARPET.get(), ModBlocks.SMALL_ACACIA_LEAF_CARPET.get(), ModBlocks.SMALL_JUNGLE_LEAF_CARPET.get(),
                ModBlocks.STACKABLE_OAK_LEAF_CARPET.get(), ModBlocks.STACKABLE_BIRCH_LEAF_CARPET.get(), ModBlocks.STACKABLE_SPRUCE_LEAF_CARPET.get(),
                ModBlocks.STACKABLE_DARK_OAK_LEAF_CARPET.get(), ModBlocks.STACKABLE_ACACIA_LEAF_CARPET.get(), ModBlocks.STACKABLE_JUNGLE_LEAF_CARPET.get(),
                ModBlocks.GRASS_BLOCK_PATCH.get(), ModBlocks.GRASS_BLOCK_PATCH.get());
    }

    @SubscribeEvent
    public static void onStartUpEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_LEAF_CARPET.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_AZALEA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_FLOWERING_AZALEA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_BIRCH_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_SPRUCE_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_DARK_OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_ACACIA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_JUNGLE_LEAF_CARPET.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_AZALEA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_FLOWERING_AZALEA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_BIRCH_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_SPRUCE_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_DARK_OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_ACACIA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STACKABLE_JUNGLE_LEAF_CARPET.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENDER_SPROUTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TALL_ENDER_SPROUTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENDER_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_ENDER_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_ENDER_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_FLOWERING_ENDER_BUSH.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_BARS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PERIDOT_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_PERIDOT_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MEDIUM_PERIDOT_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_PERIDOT_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RUBY_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_RUBY_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MEDIUM_RUBY_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_RUBY_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAPPHIRE_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_SAPPHIRE_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MEDIUM_SAPPHIRE_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_SAPPHIRE_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOPAZ_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_TOPAZ_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MEDIUM_TOPAZ_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_TOPAZ_BUD.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROKEN_IRON_BARS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROKEN_COPPER_BARS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASS_BLOCK_PATCH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PODZOL_PATCH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MYCELIUM_PATCH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRT_PATH_PATCH.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_BARS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROKEN_GOLD_BARS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_LANTERN_ROPE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_SOUL_LANTERN_ROPE.get(), RenderType.cutout());


        KeyBindings.register();

    }
}

