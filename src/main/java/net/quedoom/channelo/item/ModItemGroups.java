package net.quedoom.channelo.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.quedoom.channelo.Channel;
import net.quedoom.channelo.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup CHANNEL_O_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Channel.MOD_ID, "channel_o_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Blocks.STONE))
                    .displayName(Text.translatable("itemgroup.channelo.channel_o_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CRUSHED_RESONANT_DUST);
                        entries.add(ModItems.WHISPERGLASS_SHARD);
                        entries.add(ModBlocks.RESONANT_BLOCK);
                        entries.add(ModBlocks.WHISPERGLASS);
                        entries.add(ModItems.WHISPERING_POTATO);
                        entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup NOTES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Channel.MOD_ID, "notes"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.SKULL_BANNER_PATTERN))
                    .displayName(Text.translatable("itemgroup.channelo.notes"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.PAPER);
                    }).build());

    public static final ItemGroup DATA_FRAGMENTS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Channel.MOD_ID, "data_fragments"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .displayName(Text.translatable("itemgroup.channelo.data_fragments"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.ENCHANTED_BOOK);
                    }).build());


    public static void  registerItemGroups() {
        Channel.LOGGER.info("Registering Item Groups for " + Channel.MOD_ID);
    }

}
