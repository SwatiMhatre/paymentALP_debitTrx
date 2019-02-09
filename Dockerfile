FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} debitTrx.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/debitTrx.jar"]
EXPOSE 8081
