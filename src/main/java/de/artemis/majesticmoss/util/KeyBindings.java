package de.artemis.majesticmoss.util;

import com.mojang.blaze3d.platform.InputConstants;
import de.artemis.majesticmoss.MajesticMoss;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {

    public static final KeyMapping TOGGLE_DESCRIPTION_KEYBIND = new KeyMapping("keybind." + MajesticMoss.MOD_ID + ".description", KeyConflictContext.UNIVERSAL, KeyModifier.NONE, InputConstants.Type.KEYSYM.getOrCreate(GLFW.GLFW_KEY_LEFT_CONTROL), "keybind." + MajesticMoss.MOD_ID + ".category");

    public static void register() {
        ClientRegistry.registerKeyBinding(TOGGLE_DESCRIPTION_KEYBIND);

    }

    @OnlyIn(Dist.CLIENT)
    public static boolean isToggleDescriptionKeybindPressed() {
        return TOGGLE_DESCRIPTION_KEYBIND.isDown();
    }

}

