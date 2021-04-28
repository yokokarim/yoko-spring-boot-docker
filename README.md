# Spring Boot - "Hello Yoko!!"


This repository for Java Spring **Testing Purpose**.

## Build Jar File

On Linux Systems, follow this command below.

```
./mvnw clean install
```

On Windows Systems, follow this command below.

```
./mvnw.cmd clean install
```

## Running Apps Manually on local Machine

Follow this command for running java spring service below.

```
java -jar target/yoko-spring-boot-docker-0.0.1-SNAPSHOT.jar
```

## Running Apps on Docker Engine

First, you need to build the image use this command.

```
docker build -t <your-image-name>:<tag> .
```

After build Finished, run image docker using.

```
docker run -d -p 8080:8080 --name test-spring-boot <your-image-name>:<tag>
```
