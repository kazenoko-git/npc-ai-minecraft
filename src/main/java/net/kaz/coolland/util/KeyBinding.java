package net.kaz.coolland.util;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;
public class KeyBinding {
    public static final String KEY_CATEGORY = "key.category.coolland.k";
    public static final String KEY_DRINK_WATER = "key.coolland.drink_water";

    public static final KeyMapping DRINKING_KEY = new KeyMapping(KEY_DRINK_WATER, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY);
}
