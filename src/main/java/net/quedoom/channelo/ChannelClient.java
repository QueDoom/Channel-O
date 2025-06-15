package net.quedoom.channelo;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.quedoom.channelo.block.ModBlocks;

public class ChannelClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHISPERGLASS, RenderLayer.getTranslucent());

    }
}
