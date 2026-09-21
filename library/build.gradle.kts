import org.gradle.plugins.signing.SigningExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.maven.publish)
}

group = "io.github.ctoo-uxd"
version = libs.versions.libraryVersion.get()

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.compose.foundation)
            api(libs.compose.foundation.layout)
            api(libs.compose.ui)
            api(libs.compose.ui.text)
            api(libs.compose.ui.util)
            api(libs.compose.runtime)
            api(libs.compose.animation.core)
            api(libs.compose.material.ripple)
            api(libs.annotation)
        }
        androidMain.dependencies {
            api(libs.activity.compose)
            api(libs.core.ktx)
            api(libs.lifecycle.common.java8)
            api(libs.collection)
            api(libs.annotation.experimental)
        }
    }
}

android {
    namespace = "com.genev4"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        compose = true
    }
}

tasks.matching { it.name.contains("AarMetadata", ignoreCase = true) }.configureEach {
    enabled = false
}

// Fail the build if the published Material3 artifact sneaks back onto the classpath.
configurations.configureEach {
    resolutionStrategy.eachDependency {
        if (requested.group == "androidx.compose.material3") {
            throw GradleException(
                "androidx.compose.material3 must not be a dependency. Requested ${requested.group}:${requested.name}:${requested.version}"
            )
        }
    }
}

mavenPublishing {
    coordinates("io.github.ctoo-uxd", "genev4", libs.versions.libraryVersion.get())
    publishToMavenCentral()
    pom {
        name.set("GeneV4")
        description.set("Android Jetpack Compose component library")
        inceptionYear.set("2026")
        url.set(findProperty("POM_URL") as String? ?: "https://github.com/CTOO-UXD/Android-GeneV4")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("genev4")
                name.set("GeneV4")
            }
        }
        scm {
            url.set(findProperty("POM_URL") as String? ?: "https://github.com/CTOO-UXD/Android-GeneV4")
            connection.set(
                findProperty("POM_SCM_CONNECTION") as String?
                    ?: "scm:git:git://github.com/CTOO-UXD/Android-GeneV4.git",
            )
            developerConnection.set(
                findProperty("POM_SCM_DEV_CONNECTION") as String?
                    ?: "scm:git:ssh://git@github.com/CTOO-UXD/Android-GeneV4.git",
            )
        }
    }
}

fun gradleProp(name: String): String? {
    val fromProject = (findProperty(name) as String?)?.trim()?.takeIf { it.isNotEmpty() }
    val fromEnv = System.getenv("ORG_GRADLE_PROJECT_$name")?.trim()?.takeIf { it.isNotEmpty() }
    return fromProject ?: fromEnv
}

fun unescapeSigningKey(raw: String): String {
    return raw.replace("\\n", "\n").replace("\r", "").trim()
}

val signingKey = gradleProp("signingInMemoryKey")?.let(::unescapeSigningKey)
val signingKeyId = gradleShortKeyId(gradleProp("signingInMemoryKeyId"))
val signingPassword = gradleProp("signingInMemoryKeyPassword") ?: ""

if (!signingKey.isNullOrBlank()) {
    mavenPublishing {
        signAllPublications()
    }
    // Configure the signatory after the maven-publish plugin applies signing.
    // Calling this before sign() leaves Sign tasks with a null signatory
    // ("Cannot perform signing task ... no configured signatory").
    afterEvaluate {
        val signing = extensions.getByType(SigningExtension::class.java)
        if (signingKeyId.isNullOrBlank()) {
            signing.useInMemoryPgpKeys(signingKey, signingPassword)
        } else {
            signing.useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
        }
    }
    logger.lifecycle(
        "GPG in-memory signing: keyLength={} keyId={} passwordSet={}",
        signingKey.length,
        signingKeyId ?: "(derived from key)",
        signingPassword.isNotEmpty(),
    )
} else {
    logger.warn(
        "signingInMemoryKey is not visible to Gradle. Central publish will fail. " +
            "Set ORG_GRADLE_PROJECT_signingInMemoryKey in this shell, then run gradlew --stop.",
    )
}

fun gradleShortKeyId(raw: String?): String? {
    val hex = raw?.trim()?.removePrefix("0x")?.removePrefix("0X") ?: return null
    return when {
        hex.length == 8 -> hex
        hex.length == 16 && hex.all { it.isDigit() || it.lowercaseChar() in 'a'..'f' } -> hex.takeLast(8)
        else -> hex
    }
}

tasks.register("checkTokenParity") {
    group = "verification"
    description = "Diff forked tokens against androidx material3 1.4.0 (package name ignored)"
    doLast {
        exec {
            commandLine(
                "powershell",
                "-NoProfile",
                "-File",
                rootProject.file("scripts/check-token-parity.ps1").absolutePath
            )
        }
    }
}
