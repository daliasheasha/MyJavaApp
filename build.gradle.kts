
plugins {
    id("java-library")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit.jupiter:junit-jupiter-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
}

tasks.test {
    // No need to useJUnitPlatform() in JUnit 5
}
