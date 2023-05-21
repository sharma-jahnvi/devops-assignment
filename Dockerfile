FROM openjdk:11
COPY target/springboot-demo-0.0.1-SNAPSHOT.jar springboot-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/springboot-demo-0.0.1-SNAPSHOT.jar"]