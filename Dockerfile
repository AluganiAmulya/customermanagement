FROM openjdk:17
LABEL maintainer="com.springboot.Customer"
ADD target/springboot.Customer-0.0.1-SNAPSHOT.jar springboot.Customer.jar
ENTRYPOINT ["java","-jar", "springboot.Customer.jar"]

