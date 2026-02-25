plugins {
    id("com.github.ben-manes.versions") version "0.53.0"
    id("application")
    id("org.sonarqube") version "7.1.0.6387"
    checkstyle
}
sonar {
    properties {
        property("sonar.projectKey", "Nariman163_java-project-61")
        property("sonar.organization", "nariman163")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}


application{
    mainClass = "hexlet.code.App"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}