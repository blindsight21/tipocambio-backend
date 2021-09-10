FROM openjdk:8u212-jre
ARG JAR_FILE=./target/tipocambio-1.0.jar
COPY ${JAR_FILE} "app.jar"
EXPOSE 7165
#ADD target/tipocambio-1.0 ms-tipocambio-1.0
ENTRYPOINT ["java", "-jar","app.jar"]