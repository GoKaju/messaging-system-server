FROM java:openjdk-8-jdk
EXPOSE 8080
RUN mkdir -p /app/
COPY gradle gradle
COPY \
  ./gradle \
  build.gradle \
  gradle.properties \
  gradlew \
  settings.gradle \

  ./

# Install the gradle version used in the repository through gradlew
RUN ./gradlew

# Run gradle assemble to install dependencies before adding the whole repository
RUN gradle clean build bootJar


# ADD build/libs/messaging-system-server-0.1.0.jar /app/messaging-system-server-0.1.0.jar
# ENTRYPOINT ["java", "-jar", "/app/messaging-system-server-0.1.0.jar"]

#Comands
# docker build . -t messaging-system-server
# docker run -p 8080:8080  messaging-system-server