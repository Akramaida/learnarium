FROM openjdk:21

WORKDIR /app

COPY build/libs/learnarium.jar /app/learnarium.jar

CMD ["java", "-jar", "learnarium.jar"]


