plugins {
    id("java")
}

group = "net.astopia.agentj07.minecraft.example"

dependencies {
    implementation(project(":api"))
    implementation(project(":minecraft:bukkit:api"))
}