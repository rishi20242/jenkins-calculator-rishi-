# STEP 1: Use the updated, industry-standard Eclipse Temurin image
FROM eclipse-temurin:17-jdk-jammy

# STEP 2: Set a working directory inside the container
WORKDIR /app

# STEP 3: Copy your compiled Java classes into the container
COPY target/classes/ /app/classes/

# STEP 4: Run the application
CMD ["java", "-cp", "/app/classes", "com.example.calculator.Calculator"]
