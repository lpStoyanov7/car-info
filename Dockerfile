FROM adoptopenjdk/openjdk11:ubi

RUN mkdir /opt/test
ADD target/car-info-0.0.1-SNAPSHOT.jar /opt/test/car-info.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/opt/test/car-info.jar"]