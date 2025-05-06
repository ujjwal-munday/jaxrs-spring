FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
ARG APP_JAR=*.jar
COPY ${APP_JAR} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080