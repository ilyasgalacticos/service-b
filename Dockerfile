FROM openjdk:17-oracle
MAINTAINER ilyas
COPY build/libs/serviceB-0.0.1-SNAPSHOT.jar serviceb.jar
ENTRYPOINT ["java", "-jar", "serviceb.jar"]