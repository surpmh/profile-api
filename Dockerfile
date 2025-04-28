FROM openjdk:17-jdk-slim AS builder
WORKDIR /app

COPY gradlew build.gradle settings.gradle ./

COPY gradle ./gradle
COPY src/main ./src/main
RUN ./gradlew bootJar

FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=builder /app/build/libs/profile-api-*.jar app.jar

ENV PROFILE="dev"

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${PROFILE}"]