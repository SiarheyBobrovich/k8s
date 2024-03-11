FROM openjdk:21

WORKDIR /app
COPY ./build/libs/product-service-1.0.0.jar /app/product-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "product-service.jar"]
