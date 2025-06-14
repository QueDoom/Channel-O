package net.quedoom.channelo;

import net.fabricmc.api.ModInitializer;

import net.quedoom.channelo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Channel implements ModInitializer {
	public static final String MOD_ID = "channelo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}