@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    libs.plugins.apply {
        alias(kotlin.jvm)
        alias(kotlinPowerAssert)
    }
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.kotlin.test)
}

tasks.test {
    useJUnitPlatform()
}

configure<com.bnorm.power.PowerAssertGradleExtension> {
    functions = listOf(
        "kotlin.assert",
        "kotlin.test.assertTrue",
        "kotlin.test.assertEquals",
        "kotlin.test.assertContentEquals",
        "kotlin.test.assertContains",
    )
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}