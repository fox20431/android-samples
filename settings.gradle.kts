pluginManagement {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/google")  }
//        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/google")  }
//        google()
        mavenCentral()
    }
}
rootProject.name = "AndroidSamples"

include(":template")
include(":views")
