FROM gradle:5.6.4-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean build bootJar
RUN gradle -version

FROM java:openjdk-8-jdk
EXPOSE 8080
RUN mkdir -p /app/



ADD build/libs/messaging-system-server-0.1.0.jar /app/messaging-system-server-0.1.0.jar
#ENTRYPOINT ["java", "-jar", "/app/messaging-system-server-0.1.0.jar"]

#Comands
# docker build . -t messaging-system-server
# docker run -p 8080:8080  messaging-system-server