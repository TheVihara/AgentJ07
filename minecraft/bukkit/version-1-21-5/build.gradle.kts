plugins {
    id("java")
}

group = "net.astopia.agentj07.minecraft.bukkit"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(project(":minecraft:bukkit:api"))
}