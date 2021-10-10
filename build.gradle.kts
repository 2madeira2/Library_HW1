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
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

allprojects{
    dependencies{
        apply(plugin = "java")
        implementation("com.intellij:annotations:12.0")
    }
}