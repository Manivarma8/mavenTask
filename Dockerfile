FROM eclipse-temurin:17
COPY target/tasksDev.jar tasksDev.jar
CMD ["java", "-jar", "tasksDev.jar"]