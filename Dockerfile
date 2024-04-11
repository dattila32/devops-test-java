FROM openjdk:17

EXPOSE 8000

ADD target/spring-app.jar spring-app.jar

ENTRYPOINT ["java","-jar", "/spring.app.jar"]