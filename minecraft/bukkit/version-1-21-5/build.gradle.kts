plugins {
    id("java")
}

group = "net.astopia.agentj07.minecraft.bukkit"

dependencies {
    compileOnly(project(":minecraft:bukkit:api"))
}