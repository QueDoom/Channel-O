package net.quedoom.channelo.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.quedoom.channelo.Channel;

import static net.minecraft.block.Blocks.GLASS;

public class ModBlocks {
    public static final Block RESONANT_BLOCK = registerBlock("resonant_block",
            new Block(AbstractBlock.Settings.create().strength(0.7f, 4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.PURPLE)
            )
    );

    public static final Block WHISPERGLASS = registerBlock(	"whisperglass",
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );

    public static final Block RESONANT_CAULDRON = registerBlock("resonant_cauldron",
            new Block(AbstractBlock.Settings.create().strength(1f, 2f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.PURPLE).nonOpaque().suffocates(Blocks::never).allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never).blockVision(Blocks::never)
            )
    );



    private static Block registerBlock(String name, Block block) {

        registerBockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Channel.MOD_ID, name), block);


    }

    private static void registerBockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Channel.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlock() {

        Channel.LOGGER.info("Register blocks for" + Channel.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RESONANT_BLOCK);
            entries.add(ModBlocks.WHISPERGLASS);
        });

    }


}
