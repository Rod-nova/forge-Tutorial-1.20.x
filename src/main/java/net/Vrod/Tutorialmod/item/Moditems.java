package net.Vrod.Tutorialmod.item;

import net.Vrod.Tutorialmod.Tutorialmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    //holds all items for a mod and registers it

    public static final DeferredRegister<Item> ITEMS = //A deferred Register is a long list of things, In this case a long list of Items
                    DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID); // the , tells the code where the item goes. where what mod.
    // Registers the "sapphire" item in the game.
    // ITEMS is a DeferredRegister<Item> instance used for item registration.
   // RegistryObject<Item> allows safe reference to the item.
   // The lambda () -> new Item(new Item.Properties()) creates the item with default properties.
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus); // EventBus in Java facilitates communication between different components of an application

        }

}
