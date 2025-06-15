package net.astopia.agentj07.minecraft.bukkit.bootstrap;

import net.astopia.agentj07.minecraft.bukkit.api.J07BukkitPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class J07BukkitBootstrapper extends JavaPlugin {
    private J07BukkitPlugin plugin;

    public J07BukkitBootstrapper() {
        //this.plugin =
    }

    @Override
    public void onLoad() {
        plugin.onLoad();
    }

    @Override
    public void onEnable() {
        plugin.onEnable();
    }

    @Override
    public void onDisable() {
        plugin.onDisable();
    }
}
