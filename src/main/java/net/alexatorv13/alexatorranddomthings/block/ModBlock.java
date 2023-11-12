package net.alexatorv13.alexatorranddomthings.block;

import net.alexatorv13.alexatorranddomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorranddomthings.block.custom.MikuDoll;
import net.alexatorv13.alexatorranddomthings.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AlexatorRandomThings.MOD_ID);


    public static final RegistryObject<Block> MIKUDOLL = registerBlock("mikudoll",
            () -> new MikuDoll(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).noOcclusion()));
    public static final RegistryObject<Block> MIKUSTATUE = registerBlock("mikustatue",
            () -> new MikuDoll(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).noOcclusion()));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
