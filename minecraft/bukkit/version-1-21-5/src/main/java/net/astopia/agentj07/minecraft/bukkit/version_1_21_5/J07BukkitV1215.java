package net.astopia.agentj07.minecraft.bukkit.version_1_21_5;

import net.astopia.agentj07.minecraft.bukkit.api.J07Bukkit;
import net.astopia.agentj07.minecraft.bukkit.api.J07BukkitPlugin;
import net.astopia.agentj07.minecraft.bukkit.api.player.J07Player;

import java.util.UUID;

public class J07BukkitV1215 extends J07Bukkit {
    public J07BukkitV1215(J07BukkitPlugin plugin) {
        super(plugin);
    }

    @Override
    public J07Player getPlayer(UUID uuid) {
        return null;
    }

    @Override
    public J07Player getPlayer(String name) {
        return null;
    }

    @Override
    public void getWorld(String world) {

    }
}
