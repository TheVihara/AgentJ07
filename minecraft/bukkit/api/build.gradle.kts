plugins {
    id("java")
    id("java-library")
}

group = "net.astopia.agentj07.minecraft.bukkit"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":api"))
}