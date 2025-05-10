package com.victorbg.levitationamplified.potions;

import com.victorbg.levitationamplified.LevitationAmplified;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final RegistryEntry<Potion> LEVITATION_POTION = registerPotion("levitation_potion",
            new Potion("levitation_potion", new StatusEffectInstance(StatusEffects.LEVITATION, 2080, 1)));
    public static final RegistryEntry<Potion> LONG_LEVITATION_POTION = registerPotion("long_levitation_potion",
            new Potion("long_levitation_potion", new StatusEffectInstance(StatusEffects.LEVITATION, 3200, 1)));
    public static final RegistryEntry<Potion> STRONG_LEVITATION_POTION = registerPotion("strong_levitation_potion",
            new Potion("strong_levitation_potion", new StatusEffectInstance(StatusEffects.LEVITATION, 1440, 4)));
    public static final RegistryEntry<Potion> STRONG_LONG_LEVITATION_POTION = registerPotion("strong_long_levitation_potion",
            new Potion("strong_long_levitation_potion", new StatusEffectInstance(StatusEffects.LEVITATION, 2560, 4)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(LevitationAmplified.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        LevitationAmplified.LOGGER.info("Registering Mod Potions for "+ LevitationAmplified.MOD_ID);
    }
}
