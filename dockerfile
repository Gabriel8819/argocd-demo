FROM openjdk:17-jdk-alpine

RUN mkdir /home/myapp
WORKDIR /home/myapp
copy build/libs/argocd-demo-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]


