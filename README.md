<p align="center">
  <img width="180" height="180" src="https://design.jboss.org/quarkus/logo/final/PNG/quarkus_icon_rgb_1024px_default.png">
</p>

<h1 align="center">       
   Quarkus Product Registration Sample Application
</h1>

## 💻 [Live demo](https://simple-api-quarkus.herokuapp.com/swagger-ui/)

An example from the `simple-quarkus-api` is deployed on Heroku, access API documentation on the Swagger UI. https://simple-api-quarkus.herokuapp.com/swagger-ui/

## 🚀 About this project

This project was developed based on Udemy's course [*__Desenvolvimento Web com Quarkus - Básico__*](https://www.udemy.com/course/des-web-quarkus-basico/), taught by [Vinicius Ferraz](https://github.com/viniciusfcf).
The objective of this project was to study the concepts of the Quarkus Supersonic Subatomic Java framework for the development of RESTful Web Services.
The code consists of Rest Web Services built with Quarkus and MySQL. This service provides functionalities for product registration system.

## 🧰 Tools

- [**JDK 11**](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html) - Java language support development kit;
- [**Maven**](https://maven.apache.org/) - for project management and build tool;
- [**Quarkus**](https://quarkus.io/) - for creating web application;
- [**Panache**](https://quarkus.io/guides/hibernate-orm-panache) - to access database;
- [**Swagger**](https://springdoc.org/) - for OpenAPI documentation generation;
- [**MySQL**](https://www.mysql.com/) - for database;
- [**JUnit 5**](https://junit.org/junit5/docs/current/user-guide/) - for testing;
- [**Testcontainers**](https://www.testcontainers.org/) - for run test dependencies in Docker container;
- [**Heroku**](https://heroku.co) - for deployment and production testing;

## 📀 Running

1. Clone the git project through the terminal:

```shell
git clone https://github.com/vitormbgoncalves/simple-quarkus-api.git
cd simple-quarkus-api
```

2. Then build the application with the command below:

```shell
mvn install
```

3. Now you are ready to lunch it:

```shell
mvn quarkus:dev
```

## 🗒 Quick note

This project was developed and runs on Linux.
