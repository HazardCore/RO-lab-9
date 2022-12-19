FROM amazoncorretto:17.0.0-alpine
COPY build/libs/*SNAPSHOT.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/application.jar"]