pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "CreativeWorlds"

include(":creativeworlds-api")
include(":creativeworlds-paper")