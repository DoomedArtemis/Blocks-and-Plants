package de.artemis.majesticmoss.util;

import de.artemis.majesticmoss.MajesticMoss;
import de.artemis.majesticmoss.blocks.ModBlocks;
import de.artemis.majesticmoss.data.ModBlockTags;
import de.artemis.majesticmoss.items.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MajesticMoss.MOD_ID);

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, MajesticMoss.MOD_ID);

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlockTags.Blocks.init();
        ModBlockTags.Items.init();

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

        ModItems.register();
        ModBlocks.register();
    }

}

