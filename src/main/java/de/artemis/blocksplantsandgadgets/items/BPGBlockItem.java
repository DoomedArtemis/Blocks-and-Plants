package de.artemis.blocksplantsandgadgets.items;

import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import de.artemis.blocksplantsandgadgets.util.KeyBindings;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BPGBlockItem extends BlockItem {

    private int burnTime;
    public final Tooltip tooltip;

    public BPGBlockItem(Block block, Tooltip tooltip, int burnTime) {
        super(block, new Properties().tab(BlocksPlantsAndGadgets.INVENTORY_TAB));
        this.tooltip = tooltip;
        this.burnTime = burnTime;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        if (this.tooltip.equals(Tooltip.NONE)) {

        } else if (KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.isDown()) {
            tooltip.add(new TranslatableComponent(this.tooltip.getComponent()));
        } else {
            tooltip.add(new TranslatableComponent("\u00a77Press \u00a7b" +  KeyBindings.TOGGLE_DESCRIPTION_KEYBIND.getKey().getDisplayName().getString() + " \u00a77for more information"));
        }
    }

    public enum Tooltip {
        NONE("Hello There!"),
        WIP("tooltip.blocksplantsandgadgets.workinprogressblock");

        private String component;

        Tooltip(String component) {
            this.component = component;
        }

        public String getComponent() {
            return component;
        }
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return burnTime;
    }
}
