FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build.gradle setting.gradle gradlew /app/
COPY gradle /app/gradle
RUN ./gradlew build --no-daemon
COPY . /app
RUN ./gradlew build
CMD ["java", "-jar", "build/libs/jaxrs-spring.jar"]