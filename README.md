![image](https://github.com/kimbrano04/wakanda-weather-monitoring/assets/17338297/c88bda35-1217-4485-9ead-70329057f887)


# Wakanda Weather Monitoring System

Welcome to the Wakanda Weather Monitoring System repository! This project aims to provide a robust solution for weather monitoring and forecasting in the fictional nation of Wakanda. It leverages several technologies, including Java with Spring, Kafka, Kafka Connect, MySQL, and Docker, to create a scalable and real-time weather monitoring platform.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The Wakanda Weather Monitoring System is designed to collect and process weather data from satellites and weather stations distributed across the nation. Key features of the project include:

- Independent management of weather satellites and weather stations.
- Real-time data ingestion and processing using Apache Kafka and Kafka Connect.
- Storage and retrieval of historical weather data in a MySQL database.
- Scalable and containerized deployment with Docker.

## Technologies Used

This project utilizes a range of technologies to achieve its goals:

- **Java with Spring Boot:** The core application is built using Java with the Spring Boot framework, providing a robust and efficient backend.

- **Apache Kafka:** Kafka is used for real-time data streaming and event processing. It enables the ingestion of weather data from satellites and stations.

- **Kafka Connect:** Kafka Connect is used for data integration, allowing seamless connections between Kafka and external data sources, including databases.

- **MySQL:** The MySQL database stores historical weather data, allowing users to access past records and generate forecasts.

- **Docker:** Docker containers provide a convenient way to package and deploy the application, ensuring consistency across different environments.

## Getting Started

Before running the application, make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Apache Kafka
- Apache Kafka Connect
- MySQL
- Docker

## Configuration

Before running the application, configure the following settings:

- Define Kafka topics for satellite data, weather forecasts, etc., in the `application.properties` file.
- Configure the connection to your MySQL database in the `application.properties` file.
- Set up Kafka Connect connectors to handle data integration between Kafka and MySQL.

## Running the Application

1. Start Apache Kafka and Kafka Connect.

2. Configure and run the Kafka Connect connectors to handle data ingestion and integration.

3. Build the Spring Boot application using your preferred Java IDE or Maven:

  4. Create a Docker image of the application:
  5. Run the Docker container:


