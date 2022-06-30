FROM openjdk:17
COPY /target/graduation-project-0.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar","/tmp/graduation-project-0.0.1-jar-with-dependencies.jar"]
