package net.astopia.agentj07.minecraft.bukkit.api;

import net.astopia.agentj07.api.J07Project;
import net.astopia.agentj07.api.logging.J07Logger;

import java.util.logging.Logger;

public abstract class J07BukkitPlugin implements J07Project {
    private final J07Logger logger;

    public J07BukkitPlugin() {
        this.logger = new J07Logger();
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}
