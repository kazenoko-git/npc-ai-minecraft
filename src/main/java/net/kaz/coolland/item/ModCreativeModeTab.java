package net.kaz.coolland.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CL_TAB = new CreativeModeTab("coolland") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DOLLAR.get());
        }
    };
}
