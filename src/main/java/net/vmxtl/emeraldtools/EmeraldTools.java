package net.vmxtl.emeraldtools;

import net.fabricmc.api.ModInitializer;

import net.vmxtl.emeraldtools.item.ModItemGroups;
import net.vmxtl.emeraldtools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmeraldTools implements ModInitializer {
	public static final String MOD_ID = "emeraldtools";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();

	}
}