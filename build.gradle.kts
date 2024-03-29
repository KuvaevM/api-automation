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
    const val jetbrainsAnnotations = "23.0.0"
    const val jackson = "2.15.2"
    const val lombok = "1.18.22"
}

plugins {
    id("java")
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly("org.projectlombok:lombok:${Versions.lombok}")
    annotationProcessor("org.projectlombok:lombok:${Versions.lombok}")

    testCompileOnly("org.projectlombok:lombok:${Versions.lombok}")
    testAnnotationProcessor("org.projectlombok:lombok:${Versions.lombok}")

    implementation("commons-codec:commons-codec:${Versions.apacheCommonsCodec}")
    implementation("org.apache.commons:commons-lang3:${Versions.apacheCommons}")
    implementation("org.apache.httpcomponents:httpclient:${Versions.apacheHttpComponents}")
    implementation("org.jetbrains:annotations:${Versions.jetbrainsAnnotations}")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${Versions.jackson}")
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
        resources {
            srcDir("src/java/test/resources")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

