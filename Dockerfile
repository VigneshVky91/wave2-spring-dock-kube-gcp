FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /target/wave2-spring-dock-kube-gcp.jar /wave2-spring-dock-kube-gcp.jar
ENTRYPOINT ["java", "-jar", "/wave2-spring-dock-kube-gcp.jar"]
