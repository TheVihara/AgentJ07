package net.astopia.agentj07.minecraft.bukkit.api.player;

import net.astopia.agentj07.minecraft.bukkit.api.attribute.J07Attribute;
import net.astopia.agentj07.minecraft.bukkit.api.effect.J07PotionEffect;
import net.astopia.agentj07.minecraft.bukkit.api.inventory.J07Inventory;

import java.util.Set;
import java.util.UUID;

public interface J07Player {
    UUID getUuid();
    String getName();
    Set<J07PotionEffect> getPotionEffects();
    Set<J07Attribute> getAttributes();
    J07Inventory getInventory();
    J07Inventory getOpenInventory();
    J07Inventory getEnderChestInventory();
}
