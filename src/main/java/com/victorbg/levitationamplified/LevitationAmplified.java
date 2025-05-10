package com.victorbg.levitationamplified;

import com.victorbg.levitationamplified.potions.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.TippedArrowItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevitationAmplified implements ModInitializer {
	public static final String MOD_ID = "levitation-amplified";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric Mod: Levitation amplified");

		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register( builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.END_ROD, ModPotions.LEVITATION_POTION);
			builder.registerPotionRecipe(ModPotions.LEVITATION_POTION, Items.REDSTONE, ModPotions.LONG_LEVITATION_POTION);
			builder.registerPotionRecipe(ModPotions.LEVITATION_POTION, Items.GLOWSTONE, ModPotions.STRONG_LEVITATION_POTION);
			builder.registerPotionRecipe(ModPotions.STRONG_LEVITATION_POTION, Items.REDSTONE, ModPotions.STRONG_LONG_LEVITATION_POTION);
		});
	}
}