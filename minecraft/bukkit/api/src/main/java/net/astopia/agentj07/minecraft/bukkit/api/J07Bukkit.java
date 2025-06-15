package net.astopia.agentj07.minecraft.bukkit.api;

import net.astopia.agentj07.minecraft.bukkit.api.player.J07Player;

import java.util.UUID;

public abstract class J07Bukkit {
    public static J07Bukkit INSTANCE;

    private J07BukkitPlugin plugin;

    private J07Bukkit() {
        if (INSTANCE == null) {
            INSTANCE = this;
        }
    }

    public J07Bukkit(J07BukkitPlugin plugin) {
        super();
        this.plugin = plugin;
    }

    public abstract J07Player getPlayer(UUID uuid);
    public abstract J07Player getPlayer(String name);
    public abstract void getWorld(String world);
}
