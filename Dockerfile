FROM adoptopenjdk/openjdk11:ubi
EXPOSE 8080

ADD target/car-info-0.0.1-SNAPSHOT.jar /home/car-info-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","/home/car-info-0.0.1-SNAPSHOT.jar"]