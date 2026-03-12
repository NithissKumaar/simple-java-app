# Use an OpenJDK Runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built by Maven into the container
# Note: Ensure the filename matches what Maven generated in your logs
COPY target/simple-java-app-1.0.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]