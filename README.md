# 🛒 Ecommerce Backend Application (Spring Boot)

A backend RESTful API for an Ecommerce application built using **Spring Boot**.  
This project follows a layered architecture and demonstrates real-world backend development practices such as CRUD operations, REST APIs, database integration, and security basics.

---

## 🚀 Features

- RESTful APIs for Product Management
- CRUD operations (Create, Read, Update, Delete)
- Spring Boot + Spring MVC architecture
- Spring Data JPA for database access
- H2 in-memory database
- Proper package structure (Controller, Service, Repository, Model)
- Exception handling and HTTP status management
- Maven-based project
- Git version controlled

---

## 🧱 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2 Database**
- **Maven**
- **Git & GitHub**
- **Postman** (API testing)

---
ecommerce
│── src/main/java
│ ├── com.projects.ecommerce
│ │ ├── controller
│ │ ├── service
│ │ ├── repo
│ │ ├── model
│ │ └── EcommerceApplication.java
│
│── src/main/resources
│ ├── application.properties
│ ├── data1.sql
│
│── src/test/java
│── pom.xml
│── .gitignore
│── README.md


---

## ⚙️ How to Run the Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-username>/ecommerce-backend.git
cd ecommerce-backend
./mvnw spring-boot:run
mvnw spring-boot:run
🌐 API Access

Base URL: http://localhost:8080

H2 Console: http://localhost:8080/h2-console

H2 Credentials
JDBC URL: jdbc:h2:mem:kedhar
Username: sa
Password: (empty)
🧪 API Testing

APIs can be tested using Postman.

Examples:

GET /api/products

GET /api/product/{id}

POST /api/product

PUT /api/product/{id}

DELETE /api/product/{id}

📌 Key Learning Outcomes

Understanding REST API design

Spring Boot request lifecycle

Controller → Service → Repository flow

JPA entity mapping

HTTP methods & status codes

Backend project structuring

Git & GitHub workflow

🧑‍💻 Author

Kedharnath Reddy
Aspiring Backend Developer | Java & Spring Boot
## 📁 Project Structure

