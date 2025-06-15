plugins {
    id("java")
}

group = "net.astopia.agentj07.minecraft.example"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
    implementation(project(":minecraft:bukkit:api"))
}