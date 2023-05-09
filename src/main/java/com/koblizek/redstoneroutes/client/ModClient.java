package com.koblizek.redstoneroutes.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModClient implements ClientModInitializer {
    private static final Logger LOGGER = LogManager.getLogger("Redstone Routes");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Successfully loaded Redstone Routes");
    }
}
