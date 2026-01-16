# Task Manager – Spring Boot REST API

A simple Task Manager backend application built using Spring Boot, Spring Data JPA, and H2 Database.

## Features
- Create tasks
- View all tasks
- Delete tasks
- RESTful API design

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

| Method | Endpoint           | Description       |
|------|--------------------|------------------|
| GET  | /api/tasks          | Get all tasks    |
| POST | /api/tasks          | Create a task    |
| DELETE | /api/tasks/{id}   | Delete a task    |

## Sample POST Request

```json
{
  "title": "Learn Spring Boot",
  "completed": false
}
