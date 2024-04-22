# Use an official OpenJDK runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /sensorevent

# Copy the packaged JAR file into the container
COPY target/sensorevent-0.0.1-SNAPSHOT.jar /sensorevent/sensorevent-0.0.1-SNAPSHOT.jar

# Expose port 8090 to the outside world
EXPOSE 8090

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "sensorevent-0.0.1-SNAPSHOT.jar"]
