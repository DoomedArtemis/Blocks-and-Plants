package de.artemis.majesticmoss.items;

import de.artemis.majesticmoss.MajesticMoss;
import de.artemis.majesticmoss.util.Registration;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static void register() {
    }

    public static final RegistryObject<Item> COPPER_NUGGET =
            Registration.ITEMS.register("copper_nugget",
                    () -> new Item(new Item.Properties().tab(MajesticMoss.INVENTORY_TAB)));

    public static final RegistryObject<Item> PERIDOT_SHARD =
            Registration.ITEMS.register("peridot_shard",
                    () -> new Item(new Item.Properties().tab(MajesticMoss.INVENTORY_TAB)));

    public static final RegistryObject<Item> RUBY_SHARD =
            Registration.ITEMS.register("ruby_shard",
                    () -> new Item(new Item.Properties().tab(MajesticMoss.INVENTORY_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_SHARD =
            Registration.ITEMS.register("sapphire_shard",
                    () -> new Item(new Item.Properties().tab(MajesticMoss.INVENTORY_TAB)));

    public static final RegistryObject<Item> TOPAZ_SHARD =
            Registration.ITEMS.register("topaz_shard",
                    () -> new Item(new Item.Properties().tab(MajesticMoss.INVENTORY_TAB)));

}
