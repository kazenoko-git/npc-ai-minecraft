package net.kaz.coolland.item;

import net.kaz.coolland.CoolLand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS =
             DeferredRegister.create(ForgeRegistries.ITEMS, CoolLand.MOD_ID);
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CL_TAB)));

    public static final RegistryObject<Item> DOLLAR = ITEMS.register("dollar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CL_TAB).stacksTo(1000)));
    public static final RegistryObject<Item> UNSHEATHED_KATANA = ITEMS.register("unsheathed_katana", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CL_TAB).fireResistant().stacksTo(1)));
    public static final RegistryObject<SwordItem> KATANA = ITEMS.register("katana",
            () -> new SwordItem(ToolTiers.EXAMPLE, 5, 3.5f, props()));
    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModeTab.CL_TAB);
    }
    public static class ToolTiers {
        public static final Tier EXAMPLE = new ForgeTier(2, 800, 1.5f, 3, 350, null, () -> Ingredient.of(ModItems.EXAMPLE_ITEM.get()));}
     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
     }

}
