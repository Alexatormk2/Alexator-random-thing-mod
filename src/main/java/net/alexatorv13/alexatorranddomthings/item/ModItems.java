package net.alexatorv13.alexatorranddomthings.item;

import net.alexatorv13.alexatorranddomthings.AlexatorRandomThings;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlexatorRandomThings.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUTTINGKNIFE = ITEMS.register("cuttingknife",
            () -> new CookingUtilModItem(new Item.Properties()));

    public static final RegistryObject<Item> MIKUGEM = ITEMS.register("mikugem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget",
            () -> new Item(new Item.Properties().food(ModFood.CHICKEN_NUGGET)));

    public static final RegistryObject<Item> FRIES = ITEMS.register("fries",
            () -> new Item(new Item.Properties().food(ModFood.FRIES)));
    public static final RegistryObject<Item> RAW_NUGGET = ITEMS.register("raw_nugget",
            () -> new Item(new Item.Properties().food(ModFood.RAW_NUGGET)));

    public static final RegistryObject<Item> RAW_FRIES = ITEMS.register("raw_fries",
            () -> new Item(new Item.Properties().food(ModFood.RAW_FRIES)));
    public static final RegistryObject<Item> MIKU_SWORD = ITEMS.register("mikusword",
            () -> new SwordItem(ModToolTiers.MIKUGEM,4,2,new Item.Properties().stacksTo(1)));
    public static  final RegistryObject<Item> MIKU_PICKAXE = ITEMS.register("mikupickaxe",
            ()-> new PickaxeItem(ModToolTiers.MIKUGEM,1,0,new Item.Properties().stacksTo(1)));
    public static  final RegistryObject<Item> MIKU_HOE = ITEMS.register("mikuhoe",
            ()-> new HoeItem(ModToolTiers.MIKUGEM,1,0,new Item.Properties().stacksTo(1)));
    public static  final RegistryObject<Item> MIKU_SHOVEL= ITEMS.register("mikushovel",
            ()-> new ShovelItem(ModToolTiers.MIKUGEM,1,0,new Item.Properties().stacksTo(1)));
    public static  final RegistryObject<Item> MIKU_AXE = ITEMS.register("mikuaxe",
            ()-> new AxeItem(ModToolTiers.MIKUGEM,4,0,new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> FOOD_BAG = ITEMS.register("food_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_BAG = ITEMS.register("nugget_bag",
            () -> new Item(new Item.Properties().food(ModFood.NUGGET_BAG)));

    public static final RegistryObject<Item> FRIES_BAG = ITEMS.register("fries_bag",
            () -> new Item(new Item.Properties().food(ModFood.FRIES_BAG)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
