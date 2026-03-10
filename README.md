# SpringBoot-project – Spring Boot REST Application

## Overview

This project is a simple **Spring Boot REST API application** that demonstrates how to create and run REST endpoints.
The application returns greeting messages using different request types such as **GET, POST, and PUT**.

This project is created using **Spring Boot**, **Maven**, and **Java 17**.

---

## Technologies Used

* Java 17
* Spring Boot
* Maven
* Spring Web
* IntelliJ IDEA
* Postman (for API testing)

---

## Project Structure

```
springboot-project
 ├── src
 │   ├── main
 │   │   ├── java
 │   │   │   └── com.bridgelabz.springbootproject
 │   │   │       ├── SpringbootProjectApplication.java
 │   │   │       ├── controller
 │   │   │       │   └── HelloController.java
 │   │   │       └── dto
 │   │   │           └── UserDTO.java
 │   │   └── resources
 │   │       └── application.properties
 │   └── test
 ├── pom.xml
 └── README.md
```

---

## Main Application Class

`SpringbootProjectApplication.java`

This is the **entry point** of the Spring Boot application.

```java
@SpringBootApplication
public class SpringbootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProjectApplication.class, args);
    }

}
```

---

## REST Controller

`HelloController.java`

This controller handles HTTP requests and returns greeting messages.

```java
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

}
```

---

## Running the Application

1. Open the project in **IntelliJ IDEA**.
2. Run the main class:

```
SpringbootProjectApplication.java
```

3. The application will start on port **8080**.

---

## Testing the APIs

### GET

```
http://localhost:8080/hello
```

### Query Parameter

```
http://localhost:8080/hello/query?name=Deeksha
```

### Path Variable

```
http://localhost:8080/hello/param/Deeksha
```

### POST

```
http://localhost:8080/hello/post
```

### PUT

```
http://localhost:8080/hello/put/Deeksha?lastName=SM
```

---

## Learning Objectives

This project demonstrates:

* Creating a Spring Boot project
* Understanding project structure
* Creating REST Controllers
* Handling GET, POST, and PUT requests
* Testing APIs using Postman
* Managing development using Git Flow
