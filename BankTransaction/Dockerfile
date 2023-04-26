FROM openjdk:11
ADD target/bank.jar bank.jar
ARG JAR_FILE=target/*.jar
ENTRYPOINT ["java","-jar","/bank.jar"]
EXPOSE 8089