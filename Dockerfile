FROM openjdk:11

COPY . /usr/src/car-info
WORKDIR /usr/src/car-info

ADD target/car-info-0.0.1-SNAPSHOT.jar /usr/src/car-info/car-info.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/usr/src/car-info/car-info.jar"]