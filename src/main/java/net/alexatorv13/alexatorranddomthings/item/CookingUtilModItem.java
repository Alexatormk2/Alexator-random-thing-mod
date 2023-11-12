package net.alexatorv13.alexatorranddomthings.item;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CookingUtilModItem  extends Item{

        public CookingUtilModItem (Properties properties) {
            super(properties);
        }

        @Override
        public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
            return new ItemStack(itemStack.getItem());
        }

        @Override
        public boolean hasCraftingRemainingItem(ItemStack stack) {
            return true;
        }

}
