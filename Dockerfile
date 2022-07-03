FROM openjdk:17
ARG JAR_FILE=target/graduation-project-0.0.1-SNAPSHOT-jar-with-dependencies.jar
COPY ${JAR_FILE} market.jar
ENTRYPOINT ["java", "-jar", "/market.jar"]
