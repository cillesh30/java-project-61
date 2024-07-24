plugins {
    application
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

checkstyle {
    toolVersion = "8.45.1" // Укажите нужную версию Checkstyle
    configFile = file("config/checkstyle/checkstyle.xml") // Путь к конфигурационному файлу
}

repositories {
    mavenCentral()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Checkstyle> {
    reports {
        xml.required.set(false)  // Не генерировать XML отчет
        html.required.set(true)  // Генерировать HTML отчет
    }
}
