FROM openjdk:17-jdk-slim-buster
COPY build/libs/trilaterationAPI-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT [ "java","-jar","app.war" ]