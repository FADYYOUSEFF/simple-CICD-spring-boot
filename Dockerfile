FROM openjdk:21-jdk

WORKDIR /app

COPY ./target/simple-CICD-app-1.0.0.jar /app/simple-CICD-app.jar

EXPOSE 8080

CMD ["java", "-jar", "simple-CICdockerD-app.jar"]