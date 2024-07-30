#base image - stable official java runtime base image

FROM openjdk:17-jdk-alpine

#working directory

WORKDIR /app

#copy the source code into container

COPY src/Main.java /app/Main.java

#compile the java code

RUN javac Main.java

#run the java appliation when the container starts

CMD ["java","Main"]
