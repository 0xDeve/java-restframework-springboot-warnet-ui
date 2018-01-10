# Spring Boot, MySQL, JPA, Hibernate Rest API Web Application

This web application is for registering player through a system called WarNet and also to create your clan.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
git@github.com:callicoder/spring-boot-mysql-rest-api-tutorial.git
```

**2. Create Mysql database**
```bash
create database player_data
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

+ change the url to your desired database

**2. Build and run the app using maven**

You can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore web application

You can use the UI to create,delete,update playerdata as well as the clan information

In this example, I run the application with Netbeans.