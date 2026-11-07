plugins {
    alias(mihonx.plugins.android.library)
    alias(mihonx.plugins.spotless)
}

android {
    namespace = "mihon.telemetry"

    sourceSets {
        getByName("main") {
            kotlin.directories.add("src/noop/kotlin")
        }
    }
}

dependencies {
    implementation(projects.core.common)
}
