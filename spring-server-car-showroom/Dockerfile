# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
MAINTAINER Dummy Owner <test@gmail.com>

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8050 available to the world outside this container
EXPOSE 8050

# The application's jar file
ARG JAR_FILE=target/car-showroom-1.0.0.jar

# The application's config file
# ARG UPLOAD_CONFIG_FILE=target/config/config.properties

# The application's log4j file
# ARG UPLOAD_LOG4J_FILE=target/config/log4j.properties

# The directory for uploading file
# ARG UPLOAD_DIR=/uploads


# Add the application's jar to the container
ADD ${JAR_FILE} car-showroom-1.0.0.jar

# Add the application's config file to the container
# ADD ${UPLOAD_CONFIG_FILE} /config/config.properties

# Add the application's log4j file to the container
# ADD ${UPLOAD_LOG4J_FILE} /config/log4j.properties


# Create Directory for uploading files
# RUN mkdir ${UPLOAD_DIR}

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","car-showroom-1.0.0.jar"]