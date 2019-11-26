FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/messaging-system-server-0.1.0.jar /app/messaging-system-server-0.1.0.jar
ENTRYPOINT ["java", "-jar", "/app/messaging-system-server-0.1.0.jar"]

#Comands
# docker build . -t messaging-system-server
# docker run -p 8080:8080  messaging-system-server