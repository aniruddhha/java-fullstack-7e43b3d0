FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/spring-docker-demo-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "spring-docker-demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080

# FROM maven:3.5-jdk-8-alpine AS builder

# COPY src /usr/src/app/src
# COPY pom.xml /usr/src/app

# RUN mvn -f /usr/src/app/pom.xml clean package

# FROM openjdk:11-jre-slim

# COPY --from=builder /usr/src/app/target/spring-docker-demo-0.0.1-SNAPSHOT.jar /usr/app/spring-docker-demo-0.0.1-SNAPSHOT.jar

# ENTRYPOINT ["java", "-jar", "/usr/app/spring-docker-demo-0.0.1-SNAPSHOT.jar"]

