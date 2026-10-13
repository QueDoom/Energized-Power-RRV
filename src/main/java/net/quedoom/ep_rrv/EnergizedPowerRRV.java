package net.quedoom.ep_rrv;

import net.fabricmc.api.ModInitializer;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnergizedPowerRRV implements ModInitializer {
	public static final String MOD_ID = "ep_rrv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	public static Identifier of(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	public static Component translatable(String suffix, String prefix) {
		return Component.translatable(translationString(suffix, prefix));
	}

	public static String translationString(String prefix, String suffix) {
		return prefix + '.' + MOD_ID + '.' + suffix;
	}

}
