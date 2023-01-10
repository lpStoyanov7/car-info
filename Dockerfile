FROM openjdk:11

COPY . /usr/src/car-info
WORKDIR /usr/src/car-info

RUN javac CarInfoApplication.java
CMD ["java", "CarInfoApplication"]