package com.koblizek.redstoneroutes.server;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModServer implements DedicatedServerModInitializer {
    private Logger logger = LogManager.getLogger("Redstone Routes");
    @Override
    public void onInitializeServer() {
        logger.warn(" ");
        logger.warn("!Detected Redstone Routes on server side!");
        logger.warn("Redstone routes is client side only modification");
        logger.warn(" ");
    }
}
