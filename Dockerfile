FROM openjdk:11
ENV SPRING_DATASOURCE_URL="jdbc:postgresql://dbproduto:5432/produto"
ENV SPRING_DATASOURCE_USERNAME="admin"
ENV SPRING_DATASOURCE_PASSWORD="admin"
ENV SPRING_JPA_HIBERNATE_DDL_AUTO="update"
EXPOSE 8081
ARG JAR_FILE=build/libs/ms-produto-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ms-produto.jar
ENTRYPOINT ["java", "-jar", "/ms-produto.jar"]
