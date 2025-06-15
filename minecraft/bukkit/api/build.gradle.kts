plugins {
    id("java")
    id("java-library")
}

group = "net.astopia.agentj07.minecraft.bukkit"

dependencies {
    api(project(":api"))
    api(libs.bundles.jshepherd.yaml)
    compileOnly(libs.bukkit.v1165)
}