#
# BUILD STAGE
#
FROM maven:3.9.7-amazoncorretto-17 AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean package

#
# PACKAGE STAGE
#
FROM amazoncorretto:17-alpine
COPY --from=build /usr/src/app/target/backend-0.0.1-SNAPSHOT.jar /usr/app/backend-0.0.1-SNAPSHOT.jar  
EXPOSE 8080  
CMD ["java","-jar","/usr/app/backend-0.0.1-SNAPSHOT.jar"]  