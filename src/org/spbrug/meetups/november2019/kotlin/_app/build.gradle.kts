import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.0.RELEASE"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
	id("org.liquibase.gradle") version "2.0.1"
	kotlin("jvm") version "1.3.60"
	kotlin("plugin.spring") version "1.3.60"
	kotlin("plugin.jpa") version "1.3.60"
	kotlin("plugin.allopen") version "1.3.60"
}

group = "org.spbrug.meetups.november2019.kotlin"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_11

val developmentOnly by configurations.creating
configurations {
	runtimeClasspath {
		extendsFrom(developmentOnly)
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation(kotlin("reflect"))
	implementation(kotlin("stdlib-jdk8"))
	implementation("org.liquibase:liquibase-core")
	implementation("jakarta.xml.bind:jakarta.xml.bind-api")
	implementation("org.glassfish.jaxb:jaxb-runtime")
	implementation("org.yaml:snakeyaml")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}
