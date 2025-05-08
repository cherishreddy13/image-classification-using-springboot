FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy only what's needed for build
COPY pom.xml .
COPY src ./src

# Install Maven, build, then remove Maven to keep image small
RUN apt-get update && \
    apt-get install -y maven && \
    mvn clean package -DskipTests && \
    apt-get remove -y maven && \
    rm -rf /var/lib/apt/lists/*

EXPOSE 8080
CMD ["java", "-jar", "target/image-classification-api-0.0.1-SNAPSHOT.jar"]