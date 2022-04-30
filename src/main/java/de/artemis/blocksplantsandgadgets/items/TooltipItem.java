package de.artemis.blocksplantsandgadgets.items;

import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import de.artemis.blocksplantsandgadgets.util.KeyBindings;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TooltipItem extends Item {

    public final Tooltip tooltip;

    public TooltipItem(TooltipItem.Tooltip tooltip) {
        super(new Properties().tab(BlocksPlantsAndGadgets.INVENTORY_TAB));
        this.tooltip = tooltip;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        if (KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.isDown()) {
            tooltip.add(new TranslatableComponent(this.tooltip.getComponent()));
        } else {
            tooltip.add(new TranslatableComponent("\u00a76[ \u00a77" +  KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.getKey().getDisplayName().getString() + " \u00a76]"));
        }
    }

    public enum Tooltip {
        COPPER("tooltip.blocksplantsandgadgets.copper"),
        AMETHYST("tooltip.blocksplantsandgadgets.amethyst");

        private String component;

        Tooltip(String component) {
            this.component = component;
        }

        public String getComponent() {
            return component;
        }
    }

}
