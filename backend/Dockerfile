FROM eclipse-temurin:21-jdk AS builder

LABEL maintainer = "codeamigos7@gmail.com"

WORKDIR /app
#Good to write as it ensures  /app/CodeAmigos-Backend.jar , CodeAmigos-Backend.jar is also valid
# The source location is relative to the Dockerfile location and the destination is relative to the WORKDIR <-- V. important
COPY target/CodeAmigos--Backend-0.0.1-SNAPSHOT.jar /app/CodeAmigos--Backend.jar 

# Stage 2: Use a smaller image for the final build . Image size is reduced as JDK is not needed to run the application only JRE is needed
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/CodeAmigos--Backend.jar /app/CodeAmigos--Backend.jar

ENTRYPOINT ["java","-jar","CodeAmigos--Backend.jar"]