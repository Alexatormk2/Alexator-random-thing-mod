package net.alexatorv13.alexatorranddomthings.item;

import net.alexatorv13.alexatorranddomthings.AlexatorRandomThings;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlexatorRandomThings.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXATORS_FOODS = CREATIVE_MODE_TABS.register("alexator_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHICKEN_NUGGET.get()))


                    .title(Component.translatable("creativetab.alexator_foods"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.CHICKEN_NUGGET.get());
                        pOutput.accept(ModItems.NUGGET_BAG.get());
                        pOutput.accept(ModItems.RAW_NUGGET.get());

                    })

                    .build());

    public static final RegistryObject<CreativeModeTab> ALEXATORS_MATERIALS = CREATIVE_MODE_TABS.register("alexator_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOOD_BAG.get()))


                    .title(Component.translatable("creativetab.alexator_materials"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.FOOD_BAG.get());
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}