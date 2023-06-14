package com.duzo;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;

public class Mod implements ClientModInitializer {
    public static final String MODID = "mdicfpr";
    @Override
    public void onInitializeClient() {
        {
            WorldRenderEvents.BEFORE_ENTITIES.register(client -> {

            });
        }
    }
}