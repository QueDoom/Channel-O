package net.quedoom.channelo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quedoom.channelo.Channel;

public class ModItems {
    // Register items

    public static final Item  WHISPERGLASS_CHARD = registerItem("whisperglass_chard", new Item(new Item.Settings()));
    public static final Item  CRUSHED_RESONANT_DUST = registerItem("crushed_resonant_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Channel.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Channel.LOGGER.info("Registering mod items for " + Channel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WHISPERGLASS_CHARD);
            entries.add(CRUSHED_RESONANT_DUST);
        });
    }



}
