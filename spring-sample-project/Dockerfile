#FROM maven as builder
#MAINTAINER vamshi
#COPY . /app/source 
#WORKDIR /app/source
#RUN ["mvn clean package","./app/source"]
#RUN mvn clean package
#COPY  target/*.jar /app/app.jar

#FROM openjdk:17-alpine as run
#COPY --from=builder target/*.jar /app/app.jar
#EXPOSE 8082
#ENTRYPOINT ["java","-jar","app.jar"]  
 FROM openjdk:17-alpine
 COPY target/docker.jar docker.jar
 ENTRYPOINT ["java","-jar","docker.jar"]