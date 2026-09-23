plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.paparazzi)
}

android {
    namespace = "com.genev4.catalog"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.genev4.catalog"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.compileSdk.get().toInt()
        versionCode = 1
        versionName = libs.versions.libraryVersion.get()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }
}

tasks.matching { it.name.contains("AarMetadata", ignoreCase = true) }.configureEach {
    enabled = false
}

configurations.configureEach {
    resolutionStrategy.eachDependency {
        if (requested.group == "androidx.compose.material3") {
            throw GradleException(
                "Catalog must not depend on androidx.compose.material3. Requested ${requested.group}:${requested.name}"
            )
        }
    }
}

dependencies {
    implementation(project(":library"))
    implementation(libs.activity.compose)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material.icons)
    implementation(libs.lifecycle.runtime.ktx)
    debugImplementation(libs.compose.ui.tooling)
}

// Copy Paparazzi goldens into the VitePress public folder for the docs site.
val docsScreenshotsDir = rootProject.layout.projectDirectory.dir("website/public/components")

tasks.register<Copy>("copyDocsScreenshots") {
    group = "documentation"
    description = "Copy Paparazzi PNGs into website/public/components for VitePress"
    from(layout.projectDirectory.dir("src/test/snapshots/images"))
    into(docsScreenshotsDir)
    include("*.png")
    // com.genev4.catalog_DocsSnapshots_button_button.png → button.png
    rename { fileName ->
        val match = Regex("""DocsSnapshots_[^_]+_(.+)\.png""").find(fileName)
        if (match != null) "${match.groupValues[1]}.png" else fileName
    }
}

afterEvaluate {
    listOf("recordPaparazziDebug", "verifyPaparazziDebug", "cleanRecordPaparazziDebug").forEach { taskName ->
        tasks.findByName(taskName)?.finalizedBy("copyDocsScreenshots")
    }
}
