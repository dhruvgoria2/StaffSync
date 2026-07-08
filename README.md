# StaffSync

A simple Spring Boot REST API for managing employee records. This project demonstrates the fundamentals of building RESTful web services using Spring Boot, Spring Data JPA, and the H2 in-memory database.

## Features

- Create an employee
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete an employee
- H2 Database integration
- Layered architecture (Controller, Service, Repository)

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```
src
├── controller
├── service
├── repository
├── entity
├── dto
├── configuration
└── resources
```

## Running the Project

1. Clone the repository

```bash
git clone https://github.com/dhruvgoria2/StaffSync.git
```

2. Open the project in IntelliJ IDEA.

3. Run the application.

The application starts on:

```
http://localhost:8080
```

## H2 Database Console

```
http://localhost:8080/h2-console
```

Use:

```
JDBC URL : jdbc:h2:mem:testdb
Username : sa
Password :
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /employees | Get all employees |
| GET | /employees/{id} | Get employee by ID |
| POST | /employees | Create employee |
| PUT | /employees/{id} | Update employee |
| DELETE | /employees/{id} | Delete employee |

## Author

Dhruv Goria
