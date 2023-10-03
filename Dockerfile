ARG JDK_VERSION=17-oraclelinux8
FROM openjdk:${JDK_VERSION}

LABEL maintener="Dimas Maryanto <software.dimas_m@icloud.com>"

ENV SERVER_PORT=8080

RUN groupadd www-data && \
adduser -r -g www-data www-data

WORKDIR /usr/local/share/applications
USER www-data

ARG JAR_FILE="spring3-devsecops-example.jar"
COPY --chown=www-data:www-data target/${JAR_FILE} spring-boot.jar

ENTRYPOINT ["java", "-jar", "-Djava.security.egd=file:/dev/./urandom", "spring-boot.jar"]

CMD ["--server.port=${SERVER_PORT}"]
EXPOSE ${SERVER_PORT}/tcp
