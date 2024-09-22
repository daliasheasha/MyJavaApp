
plugins {
    id 'java'
}

group = 'org.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform('org.junit.jupiter:junit-jupiter-bom:5.9.1'))
    testImplementation('org.junit.jupiter:junit-jupiter:5.9.1')
}

tasks.test {
    useJUnitPlatform() {
        includeEngines 'junit-jupiter'
    }
}
