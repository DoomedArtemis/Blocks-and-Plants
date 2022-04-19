package de.artemis.majesticmoss.items;

import de.artemis.majesticmoss.MajesticMoss;
import de.artemis.majesticmoss.util.KeyBindings;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItem extends BlockItem {

    public final Tooltip tooltip;

    public ModItem(Block block, Tooltip tooltip) {
        super(block, new Properties().tab(MajesticMoss.INVENTORY_TAB));
        this.tooltip = tooltip;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        if (KeyBindings.isToggleDescriptionKeybindPressed()) {
            tooltip.add(new TranslatableComponent(this.tooltip.getComponent()));
        } else {
            tooltip.add(new TranslatableComponent("\u00a76[ \u00a77" +  KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.getKey().getDisplayName().getString() + " \u00a76]"));
        }
    }

    public enum Tooltip {
        COPPER("tooltip.majesticmoss.copper"),
        AMETHYST("tooltip.majesticmoss.amethyst");

        private String component;

        Tooltip(String component) {
            this.component = component;
        }

        public String getComponent() {
            return component;
        }
    }
}
