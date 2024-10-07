pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            library("mqttClient", "org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.4")
            library("mqttAndroidService", "org.eclipse.paho:org.eclipse.paho.android.service:1.1.1")
        }
    }
}

rootProject.name = "digest"
include(":app")
 