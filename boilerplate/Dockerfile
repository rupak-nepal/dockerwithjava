# 1st stage, build the app
FROM adoptopenjdk/maven-openjdk11:nightly as build
MAINTAINER rupaknepal
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
