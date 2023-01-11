FROM anapsix/alpine-java
EXPOSE 8080

WORKDIR /app

ADD target/car-info-0.0.1-SNAPSHOT.jar /home/car-info.jar

CMD ["java","-jar","/home/car-info.jar"]