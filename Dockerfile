FROM openjdk:17
EXPOSE 8080
ADD target/laghs-git-jenkin.jar laghs-git-jenkin.jar
ENTRYPOINT ["java","-jar","/laghs-git-jenkin.jar"]