package net.erlatte.examplemod.item;

import net.erlatte.examplemod.ExampleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> EXAMPLEMOD_TAB = CREATIVE_MODE_TABS.register("examplemod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GUN.get()))
                    .title(Component.translatable("creativetab.example_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GUN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
