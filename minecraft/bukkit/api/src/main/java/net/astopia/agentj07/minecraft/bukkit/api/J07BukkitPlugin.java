package net.astopia.agentj07.minecraft.bukkit.api;

import net.astopia.agentj07.api.J07Project;
import net.astopia.agentj07.api.logging.J07Logger;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public abstract class J07BukkitPlugin extends JavaPlugin implements J07Project {
    private final J07Logger logger;
    private final J07Bukkit bukkit;

    public J07BukkitPlugin() {
        this.logger = new J07Logger();
        this.bukkit =
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}
