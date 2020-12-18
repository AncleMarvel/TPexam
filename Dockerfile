FROM openjdk:8-jdk-alpine
COPY target/TPexam-1.0.jar /TPexam.jar
ENTRYPOINT ["java","-jar","/TPexam.jar"]
