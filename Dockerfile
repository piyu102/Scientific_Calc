FROM openjdk:8
MAINTAINER Piyush Agrawal piyushagrawal102@gmail.com
COPY ./target/ScientificCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "ScientificCalculator-1.0-SNAPSHOT.jar"]
