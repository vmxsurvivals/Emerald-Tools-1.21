package net.vmxtl.emeraldtools;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.vmxtl.emeraldtools.datagen.ModBlockTagProvider;
import net.vmxtl.emeraldtools.datagen.ModItemTagProvider;
import net.vmxtl.emeraldtools.datagen.ModModelProvider;
import net.vmxtl.emeraldtools.datagen.ModRecipeProvider;

public class EmeraldToolsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}