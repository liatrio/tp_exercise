# Hello world - containerized rest endpoint
This is a simple hello-world application with docker support and a gradle build script.

This example builds a java 17 runtime.

## Build a jar file in /build/lib
```
./gradlew bootjar
```

## Build and install a docker image
```agsl
./gradlew dockerBuildImage
```
