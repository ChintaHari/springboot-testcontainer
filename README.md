# Spring Boot Testcontainer Example

## Project Overview

This Spring Boot project demonstrates the use of Testcontainers for integration testing with a MySQL database. The application provides a simple REST API to manage courses, allowing you to add and retrieve course information from a MySQL database.

## Why Use Testcontainers?

Testcontainers is a Java library that supports JUnit tests by providing lightweight, throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container. Testcontainers is used here to ensure that the MySQL instance is spun up during the testing phase, providing a real, isolated environment that mimics production setups without the overhead of manual configuration.

## Getting Started

### Prerequisites

- Java 17 or newer.
- Maven as your build tool.
- Docker installed and running on your machine.

### Dependencies

To run this project, you need to include several dependencies in your `pom.xml`:

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Devtools
- Project Lombok
- Spring Boot Starter Test
- MySQL Connector Java
- Testcontainers

The necessary Testcontainers dependencies are already included in the `pom.xml`. Make sure Docker is running, as Testcontainers will need to pull and manage Docker images.

### Clone the Repository

Clone this repository using git:

```bash
git clone https://github.com/yourusername/springboot-testcontainer.git
cd springboot-testcontainer
```

### Running the Application

Run the application using Maven:

```bash
mvn spring-boot:run
```

### Running Tests

To run the tests which include Testcontainers, execute:

```bash
mvn test
```

Ensure Docker is running, as the tests use Testcontainers to manage the MySQL database.

## API Endpoints

- **POST /course/add**: Add a new course.
  - **Request Body**:
    ```json
    {
      "name": "New Course",
      "duration": "5 weeks"
    }
    ```

- **GET /course/all**: Retrieve all courses.

## Configuration

Adjust the application properties in `src/main/resources/application.properties` for production environments. For test environments, the application uses dynamic properties set by the Testcontainers in the test classes.

```properties
# Example production settings
spring.datasource.url=jdbc:mysql://production-url:3306/yourdb
spring.datasource.username=prodUser
spring.datasource.password=prodPassword

# Hibernate settings
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

## Docker Requirement

Docker must be installed and running on your machine to use Testcontainers. This allows the automatic provisioning of a MySQL database which is essential for running integration tests.
