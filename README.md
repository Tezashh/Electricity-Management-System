# Electricity Management System

## Overview

The Electricity Management System is a web-based application developed to streamline electricity bill management and customer services. It allows customers to register, log in, view bills, pay pending bills, and register complaints through a centralized platform.

## Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* MySQL
* REST APIs
* Maven
* HTML
* CSS
* JavaScript

## Features

### Customer Features

* User Registration
* Secure Login
* View Pending Bills
* Pay Electricity Bills
* View Bill History
* Register Complaints
* Track Complaint Status

### Admin Features

* Manage Customer Records
* Manage Bills
* View Complaints
* Update Complaint Status

## Database

* MySQL Database
* Relational database design using tables for:

  * Customers
  * Bills
  * Payments
  * Complaints
  * Users

## Backend Architecture

* Built using Spring Boot
* Layered Architecture:

  * Controller Layer
  * Service Layer
  * Repository Layer
  * Database Layer
* Uses Spring Data JPA for database operations

## API Functionality

The application exposes REST APIs for:

* Customer Registration
* User Authentication
* Bill Retrieval
* Bill Payment Processing
* Complaint Registration
* Complaint Status Tracking

## Project Setup

1. Clone the repository
2. Configure MySQL database
3. Update database credentials in `application.properties`
4. Run the Spring Boot application

```bash
mvn spring-boot:run
```

## Future Enhancements

* JWT Authentication
* Online Payment Gateway Integration
* Email Notifications
* Admin Dashboard
* Cloud Deployment

## Author

Tezash
