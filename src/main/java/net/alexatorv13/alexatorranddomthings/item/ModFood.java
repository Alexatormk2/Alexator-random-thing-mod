package net.alexatorv13.alexatorranddomthings.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFood {


    public static final FoodProperties CHICKEN_NUGGET =
            new FoodProperties.Builder().meat().nutrition(2).saturationMod(0.1f).fast().build();
    public static final FoodProperties RAW_NUGGET =
            new FoodProperties.Builder().meat().nutrition(1).saturationMod(0f).fast().effect(() -> new MobEffectInstance(MobEffects.POISON, 320), 100f).build();

    public static final FoodProperties NUGGET_BAG =
            new FoodProperties.Builder().meat().nutrition(12).saturationMod(2f).build();

}
