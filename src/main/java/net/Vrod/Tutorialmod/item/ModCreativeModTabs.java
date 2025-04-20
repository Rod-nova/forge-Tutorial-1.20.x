package net.Vrod.Tutorialmod.item;

import net.Vrod.Tutorialmod.Tutorialmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.rmi.registry.Registry;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tutorialmod.MOD_ID); // Reference to Minecraft's registry for creative mode tabs.

        public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
                ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.SAPPHIRE.get()))
                        .title(Component.translatable("creativetab.tutorial_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(Moditems.SAPPHIRE.get());
                            pOutput.accept(Moditems.RAW_SAPPHIRE.get());
                        })
                        .build());

        public static void register(IEventBus eventBus){
            CREATIVE_MODE_TABS.register(eventBus);
        }


    /*

 Declaring a constant for the deferred registration of creative mode tabs.
 This ensures the registration process is deferred and properly linked to our mod.
 - Type: DeferredRegister<CreativeModeTab>
 - Purpose: Manage creative mode tab registrations for items in our mod.

*/


}
