package net.quedoom.channelo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quedoom.channelo.Channel;
import net.quedoom.channelo.item.custom.ChiselItem;

public class ModItems {
    // Register items

    public static final Item  WHISPERGLASS_SHARD = registerItem("whisperglass_shard", new Item(new Item.Settings()));
    public static final Item  WHISPERING_POTATO = registerItem("whispering_potato", new Item(new Item.Settings()));

    public static final Item  CRUSHED_RESONANT_DUST = registerItem("crushed_resonant_dust", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(250)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Channel.MOD_ID, name), item);

    }


    public static void registerModItems() {
        Channel.LOGGER.info("Registering mod items for " + Channel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WHISPERGLASS_SHARD);
            entries.add(CRUSHED_RESONANT_DUST);
        });
    }


}
