rootProject.name = "AgentJ07"

pluginManagement {
    repositories {
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
    }
}

include("api")
include("minecraft")
include("discord")
include("minecraft:bukkit")
findProject(":minecraft:bukkit")?.name = "bukkit"
include("minecraft:bukkit:api")
findProject(":minecraft:bukkit:api")?.name = "api"
include("minecraft:bukkit:example")
findProject(":minecraft:bukkit:example")?.name = "example"
include("minecraft:bukkit:version-1-21-5")
findProject(":minecraft:bukkit:version-1-21-5")?.name = "version-1-21-5"
include("minecraft:bukkit:bootstrap")
findProject(":minecraft:bukkit:bootstrap")?.name = "bootstrap"
