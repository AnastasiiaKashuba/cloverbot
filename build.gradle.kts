import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.4.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id ("org.jetbrains.kotlin.plugin.jpa") version "1.3.41"
	kotlin("jvm") version "1.4.32"
	kotlin("plugin.spring") version "1.4.32"
	kotlin("plugin.serialization") version "1.4.32"
}

group = "com.desperate"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.telegram:telegrambots-spring-boot-starter:4.1")
	implementation("org.projectlombok:lombok:1.18.8")
	annotationProcessor("org.projectlombok:lombok:1.18.8")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.4.3")
	implementation("org.yaml:snakeyaml:1.28")
	implementation("org.hibernate:hibernate-jcache:5.4.28.Final")
	implementation("org.postgresql:postgresql:42.2.19.jre7")
	//implementation("org.flywaydb:flyway-core:6.5.7")
	implementation("com.h2database:h2:1.4.200")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
