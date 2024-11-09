FROM openjdk:17.0.1-jdk-slim
COPY build/libs/notificationService-0.0.1-SNAPSHOT.jar /app/notificationService.jar
EXPOSE 8002
CMD ["java", "-jar", "/app/notificationService.jar"]