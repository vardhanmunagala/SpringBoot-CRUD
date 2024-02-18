FROM openjdk:17
ADD target/SpringCrud-0.0.1-SNAPSHOT.jar dockerdemo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]