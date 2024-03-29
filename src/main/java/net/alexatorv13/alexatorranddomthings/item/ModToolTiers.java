package net.alexatorv13.alexatorranddomthings.item;

import net.alexatorv13.alexatorranddomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorranddomthings.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {


    public static final Tier MIKUGEM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 9f, 5f, 25,
                    ModTags.Blocks.NEEDS_MIKU_TOOL, () -> Ingredient.of(ModItems.MIKUGEM.get())),
            new ResourceLocation(AlexatorRandomThings.MOD_ID, "mikugem"), List.of(Tiers.NETHERITE), List.of());
}
