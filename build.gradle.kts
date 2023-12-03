/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.5.1/samples
 */

repositories {
    mavenCentral()
}

object Versions {
    const val apacheCommonsCodec = "1.10"
    const val apacheCommons = "3.12.0"
    const val apacheHttpComponents = "4.5.14"
    const val junit = "5.8.1"
}

plugins {
    id("java")
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("commons-codec:commons-codec:${Versions.apacheCommonsCodec}")
    implementation("org.apache.commons:commons-lang3:${Versions.apacheCommons}")
    implementation("org.apache.httpcomponents:httpclient:${Versions.apacheHttpComponents}")
    testImplementation("org.junit.jupiter:junit-jupiter:${Versions.junit}")
}

sourceSets {
    main {
        java {
            srcDir("src/java/main")
        }
    }
    test {
        java {
            srcDir("src/java/test")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

