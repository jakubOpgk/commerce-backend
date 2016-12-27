FROM java:8
VOLUME /tmp
ADD commerce.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-jar", "/app.jar"]