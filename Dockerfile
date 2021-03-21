FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=build/libs/ms-produto-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ms-produto.jar
ENTRYPOINT ["java", "-jar", "/ms-produto.jar"]