FROM public.ecr.aws/bitnami/java:latest
EXPOSE 8080

ADD target/car-info-0.0.1-SNAPSHOT.jar /home/car-info.jar

CMD ["java","-jar","/home/car-info.jar"]