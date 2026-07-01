FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/classes/ /app/classes/

CMD ["java", "-cp", "/app/classes", "com.example.calculator.Calculator"]