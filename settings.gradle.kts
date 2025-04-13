pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "pida-admin"

include(
    "pida-admin:api",
    "pida-admin:domain",
)

include(
    "pida-storage:db-core",
    "pida-storage:redis",
)

include(
    "pida-clients:aws-client",
    "pida-clients:notification",
)

include(
    "pida-supports:logging",
    "pida-supports:monitoring",
    "pida-supports:swagger",
)



