FROM azul/zulu-openjdk:11.0.16.1

COPY build/libs/kotlin-restful-api-0.0.1-SNAPSHOT.jar /app/application.jar

CMD ["java", "-jar", "/app/application.jar"]