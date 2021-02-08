apply {
    from("https://raw.githubusercontent.com/ligi/gradle-common/master/versions_plugin_stable_only.gradle")
}

buildscript {
    repositories {
        jcenter()
        maven("https://jitpack.io")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.github.ben-manes:gradle-versions-plugin:${Versions.versions_plugin}")
        classpath("com.github.komputing:kethabi:0.1.8")
    }
}


subprojects {
    apply(plugin = "kotlin")

    repositories {
        jcenter()
        maven("https://jitpack.io")
        maven("https://kotlin.bintray.com/kotlinx")
    }

    // a trick to allow gradual conversion of modules to MPP
    afterEvaluate {
        if (!plugins.hasPlugin("mpp-module")) {
            apply(plugin = "jacoco")
            apply(plugin = "maven")

            tasks.withType<Test> {
                useJUnitPlatform()
            }

            configure<JavaPluginExtension> {
                withSourcesJar()
                withJavadocJar()
            }

            val compileTestKotlin by tasks.getting(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
                kotlinOptions.jvmTarget = "1.8"
            }

            dependencies {
                "implementation"("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")

                "testImplementation"("org.assertj:assertj-core:3.19.0")
                "testImplementation"("org.junit.jupiter:junit-jupiter-api:${Versions.jupiter}")
                "testImplementation"("org.junit.jupiter:junit-jupiter-params:${Versions.jupiter}")
                "testRuntime"("org.junit.jupiter:junit-jupiter-engine:${Versions.jupiter}")

                "testImplementation"("org.jetbrains.kotlin:kotlin-test")
                "testImplementation"("io.mockk:mockk:1.10.5")
            }
        }
    }
}
