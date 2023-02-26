FROM amazoncorretto:17

MAINTAINER CRISTIAN

COPY target/springboot-0.0.1-SNAPSHOT.jar springboot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/springboot-0.0.1-SNAPSHOT.jar"]