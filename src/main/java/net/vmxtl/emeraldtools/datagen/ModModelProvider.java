package net.vmxtl.emeraldtools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.item.ArmorItem;
import net.vmxtl.emeraldtools.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output){
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    ;
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
    itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
    itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);

    itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));
    }
}
