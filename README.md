# API Gateway Server

This repository contains the code for an API Gateway Server. This server is used as a single point of contact for all 
client applications.

## Features

- Centralized API Gateway for microservices
- Routing and load balancing(additional changes to be added based on requirements)
- Request filtering and transformation(to be added based on requirements)
- Security and authentication(through auth-server)

## Technologies Used

- Spring Boot
- Spring Cloud Gateway

## Prerequisites

- Java

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/Yashovardhan08/api-gateway.git
    cd api-gateway
    ```


2. Build the project:

    ```bash
    mvn clean install
    ```
    ```bash
    java -jar target/target-file-name.jar
    ```
The server should be running at http://localhost:9999(in application.properties) by default.


Additional changes should be incorporated through application.properties or Beans in spring boot.

