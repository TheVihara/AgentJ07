package net.astopia.agentj07.minecraft.bukkit.version_1_21_5.player;

import net.astopia.agentj07.minecraft.bukkit.api.attribute.J07Attribute;
import net.astopia.agentj07.minecraft.bukkit.api.effect.J07PotionEffect;
import net.astopia.agentj07.minecraft.bukkit.api.inventory.J07Inventory;
import net.astopia.agentj07.minecraft.bukkit.api.player.J07Player;

import java.util.Set;
import java.util.UUID;

public class J07PlayerV1215 implements J07Player {
    @Override
    public UUID getUuid() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Set<J07PotionEffect> getPotionEffects() {
        return Set.of();
    }

    @Override
    public Set<J07Attribute> getAttributes() {
        return Set.of();
    }

    @Override
    public J07Inventory getInventory() {
        return null;
    }

    @Override
    public J07Inventory getOpenInventory() {
        return null;
    }

    @Override
    public J07Inventory getEnderChestInventory() {
        return null;
    }
}
