FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD skeleton-boot-angular2-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "/spinup.sh"]