package mrlolf.infinityfix.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(InfinityEnchantment.class)
public class MixinInfinityEnchantment extends Enchantment {

    public MixinInfinityEnchantment(Enchantment.Rarity weight, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.BOW, slotTypes);
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return other instanceof MendingEnchantment ? true : super.canAccept(other);
    }
}
