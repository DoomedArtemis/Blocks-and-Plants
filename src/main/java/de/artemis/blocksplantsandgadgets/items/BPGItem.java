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

public class BPGItem extends Item {

    public final Tooltip tooltip;

    public BPGItem(BPGItem.Tooltip tooltip) {
        super(new Properties().tab(BlocksPlantsAndGadgets.INVENTORY_TAB));
        this.tooltip = tooltip;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        if (KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.isDown()) {
            tooltip.add(new TranslatableComponent(this.tooltip.getComponent()));
        } else {
            tooltip.add(new TranslatableComponent("\u00a77Press \u00a7b" +  KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.getKey().getDisplayName().getString() + " \u00a77for more information"));
        }
    }

    public enum Tooltip {
        WIP("tooltip.blocksplantsandgadgets.workinprogressitem");

        private String component;

        Tooltip(String component) {
            this.component = component;
        }

        public String getComponent() {
            return component;
        }
    }

}
