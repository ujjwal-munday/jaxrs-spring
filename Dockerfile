FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY gradlew /app/
COPY gradle /app/gradle
COPY build.gradle settings.gradle ./
RUN chmod +x ./gradlew
RUN ./gradlew build --no-daemon
CMD ["java", "-cp", "/app/build/classes/java/main"]