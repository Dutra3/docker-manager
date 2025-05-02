# Docker Manager Backend

This repository contains the **backend service** of the **Docker Manager Dashboard**, a tool designed to manage Docker containers programmatically using a clean REST API.

Built with **Java 21** and **Spring Boot 3**, this microservice provides the backend infrastructure for monitoring and controlling Docker containers, enabling integration with a frontend dashboard or other services.

---

## 🚀 Features

- List active Docker containers
- Start, stop, and remove containers
- Expose RESTful endpoints for external integrations
- Designed with extensibility and clean architecture in mind

---

## 🛠️ Technologies

- **Java 21**
- **Spring Boot 3**
- **Docker Java Client**
- **Maven 3.9+**
- **RESTful API**

---

## 🧪 Running the Project

### Prerequisites

- Java 21 installed
- Docker running on your local machine
- Maven installed

### Steps

```bash
# Clone the repository
git clone https://github.com/your-username/docker-manager.git
cd docker-manager

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
