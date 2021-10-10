plugins {
    java
}

group = "ru.madeira"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(group = "com.google.code.gson", name = "gson", version = "2.7")
    implementation(project(":models"))

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}