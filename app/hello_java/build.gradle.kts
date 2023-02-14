plugins {
	java
	id("org.springframework.boot") version "2.0.3.RELEASE"
	id("io.spring.dependency-management") version "1.1.0"
	id("com.bmuschko.docker-spring-boot-application") version "9.1.0"
}


group = "com.liatrio"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

springBoot {
	buildInfo()
}

docker {
	springBootApplication {
		baseImage.set("openjdk:8-alpine")
	}
}
