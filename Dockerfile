FROM maven:3.6.3-jdk-11 as build

COPY . .

RUN mvn install -DskipTests

FROM openjdk:11-slim

WORKDIR /app

COPY --from=build /target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
