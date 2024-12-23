package net.vmxtl.emeraldtools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vmxtl.emeraldtools.EmeraldTools;

public class ModItemGroups {
    public static final ItemGroup  EMERALD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EmeraldTools.MOD_ID, "emerald_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.EMERALD))
                    .displayName(Text.translatable("itemgroup.emeraldtools.emerald_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.EMERALD);
                        entries.add(Items.EMERALD_BLOCK);

                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);

                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_HOE);

                    })
                    .build());

    public static void registerModItemGroups(){
        EmeraldTools.LOGGER.info("Registering Item Groups for "+ EmeraldTools.MOD_ID);
    }
}
