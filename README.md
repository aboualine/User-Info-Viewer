# Java + PHP Integration Project

This project is my **first successful attempt at merging a Java backend (Spring Boot) with a PHP frontend**. It demonstrates how the two technologies can communicate through HTTP requests, using PHP to consume data served by a Java REST API.

---

## 🧠 Project Overview

- **Backend**: Java (Spring Boot) REST API
- **Frontend**: PHP with Bootstrap 5
- **API Communication**: PHP uses `file_get_contents()` to fetch JSON from the Java backend.
- **Data**: No database — users are hardcoded in the Java controller.
- **Tools**: Maven for Java build management

---

## 📁 Project Structure

```
  full-project/
  ├── java-backend/ # Spring Boot backend app
  │ ├── pom.xml # Maven config
  │ └── src/
  │ └── main/
  │ ├── java/
  │ │ └── com/example/userapi/
  │ │ ├── UserApiApplication.java
  │ │ └── UserController.java
  │ └── resources/
  │ └── application.properties
  │
  └── php-frontend/ # PHP + Bootstrap frontend
  └── index.php
```


---

## ⚙️ How It Works

### 1. **Java Backend (Spring Boot)**

- Exposes a single REST endpoint at:  
  `GET http://localhost:8080/users`

- This returns a hardcoded list of users in JSON format.

- Java project is managed with **Maven** and includes the following dependency:
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>

- Port configured in application.properties:
```
  server.port=8080
```

### 2. **PHP Frontend**

- Uses file_get_contents("http://localhost:8080/users") to fetch the JSON.

- Parses the JSON using json_decode().

- Outputs data using Bootstrap 5 for clean UI presentation.

## 🚀 How to Run

### Java Backend

```
  cd java-backend
  mvn spring-boot:run
```

### PHP Frontend

```
cd php-frontend
php -S localhost:8000
```

- Access the frontend in your browser at: http://localhost:8000

## 📦 Tech Stack Summary

| Technology  | Role                 |
| ----------- | -------------------- |
| Java        | Backend logic        |
| Spring Boot | REST API framework   |
| PHP         | Frontend rendering   |
| Bootstrap 5 | Styling & layout     |
| Maven       | Java project manager |
| JSON        | Data format (API)    |

## 🙌 Author

Created by Aboualine Mohamed as a personal learning milestone.
This is a beginner-friendly demonstration of connecting backend and frontend using two different server-side languages: Java and PHP.
