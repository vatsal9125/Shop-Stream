# Spring Boot Microservices Project

A backend microservices-based e-commerce system built using Spring Boot and Spring Cloud.  
This project demonstrates scalable distributed system architecture using synchronous and asynchronous communication between services.

---

# 🚀 Tech Stack

- Java
- Spring Boot
- Spring Cloud
- Spring Security
- Spring Data JPA
- MySQL
- Kafka
- Docker
- Maven
- REST APIs

---

# 📌 Microservices Included

## Product Service
Handles product-related operations.

### Features
- Create product
- Fetch products
- Product catalog management

---

## Order Service
Handles customer orders.

### Features
- Place orders
- Communicates with Inventory Service
- Publishes Kafka events for notifications

---

## Inventory Service
Handles stock management.

### Features
- Check stock availability
- Inventory validation before order placement

---

## Notification Service
Handles asynchronous notifications using Kafka.

### Features
- Kafka consumer implementation
- Processes order notification events

---

## API Gateway
Acts as a single entry point for all microservices.

### Features
- Routing
- Centralized API access
- Load balancing support

---

# 🔄 Architecture Flow

1. Client sends request through API Gateway
2. Order Service receives the order request
3. Order Service communicates with Inventory Service
4. If stock is available:
   - Order gets placed
   - Kafka event is published
5. Notification Service consumes Kafka event asynchronously

---

# 🛠️ Project Structure

```bash
spring-boot-microservices-master/
│
├── api-gateway/
├── order-service/
├── product-service/
├── inventory-service/
├── notification-service/
│
├── docker-compose.yml
├── pom.xml
└── README.md
```

---

# ⚙️ Setup & Run

## Clone Repository

```bash
git clone <your-github-repo-url>
cd spring-boot-microservices-master
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Using Docker

```bash
docker-compose up -d
```

---

# 📡 Kafka Integration

Kafka is used for asynchronous communication between services.

## Producer
- Order Service publishes order events

## Consumer
- Notification Service consumes events and processes notifications

---

# 📦 Sample APIs

## Create Product

```http
POST /api/product
```

---

## Place Order

```http
POST /api/order
```

---

## Check Inventory

```http
GET /api/inventory
```

---

# 🎯 Key Concepts Demonstrated

- Microservices Architecture
- API Gateway
- Inter-service Communication
- Kafka Messaging
- Asynchronous Processing
- Docker Containerization
- Distributed System Design

---

# 👨‍💻 Author

Vatsal Srivastava  
Backend Developer | Java | Spring Boot | Microservices
