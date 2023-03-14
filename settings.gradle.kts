rootProject.name = "gradle-template"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            val kotlin = version("kotlin", "1.8.10")

            plugin("kotlin-jvm", "org.jetbrains.kotlin.jvm").versionRef(kotlin)
            plugin("kotlin-kapt", "org.jetbrains.kotlin.kapt").versionRef(kotlin)
            plugin("kotlin-lombok", "org.jetbrains.kotlin.plugin.lombok").versionRef(kotlin)
            plugin("kotlin-allopen", "org.jetbrains.kotlin.plugin.allopen").versionRef(kotlin)
            plugin("kotlin-spring", "org.jetbrains.kotlin.plugin.spring").versionRef(kotlin)
            plugin("kotlinPowerAssert", "com.bnorm.power.kotlin-power-assert").version("0.12.0")

            library("kotlin-stdlib", "org.jetbrains.kotlin", "kotlin-stdlib").versionRef(kotlin)
            library("kotlin-reflect", "org.jetbrains.kotlin", "kotlin-reflect").versionRef(kotlin)
            library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test-junit5").versionRef(kotlin)

            bundle("kotlin", listOf("kotlin-reflect", "kotlin-stdlib"))
        }
    }
}
