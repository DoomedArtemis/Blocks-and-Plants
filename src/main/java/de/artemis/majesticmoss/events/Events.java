package de.artemis.majesticmoss.events;

import de.artemis.majesticmoss.MajesticMoss;
import de.artemis.majesticmoss.blocks.ModBlocks;
import de.artemis.majesticmoss.util.VillagerTrade;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MajesticMoss.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {

    @SubscribeEvent
    public static void onWanderingTrader(WandererTradesEvent event) {

        event.getGenericTrades().add(new VillagerTrade(VillagerTrade.Type.ItemForEmerald).setItem(ModBlocks.ENDER_MOSS_BLOCK.get()).setEmeraldPrice(1).setXp(2).setMaxUses(8));
    }
}
