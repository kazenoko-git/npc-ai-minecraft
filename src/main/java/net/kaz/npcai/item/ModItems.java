package net.kaz.npcai.item;

import net.kaz.npcai.NPCai;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS =
             DeferredRegister.create(ForgeRegistries.ITEMS, NPCai.MOD_ID);

    public static final RegistryObject<Item> DOLLAR = ITEMS.register("dollar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CL_TAB)));
     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
     }
}
