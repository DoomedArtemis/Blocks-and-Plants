package de.artemis.blocksplantsandgadgets.util;

import com.mojang.blaze3d.platform.InputConstants;
import de.artemis.blocksplantsandgadgets.BlocksPlantsAndGadgets;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {

    public static void register() {
        ClientRegistry.registerKeyBinding(TOGGLE_DESCRIPTION_KEYBIND);
    }
    public static final KeyMapping TOGGLE_DESCRIPTION_KEYBIND = new KeyMapping("keybind." + BlocksPlantsAndGadgets.MOD_ID + ".description", KeyConflictContext.UNIVERSAL, KeyModifier.NONE, InputConstants.Type.KEYSYM.getOrCreate(GLFW.GLFW_KEY_LEFT_CONTROL), "keybind." + BlocksPlantsAndGadgets.MOD_ID + ".category");
}

