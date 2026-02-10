# Student Management REST API

This is a simple RESTful API built with **Spring Boot** to manage student records. It uses an in-memory `ArrayList` to simulate a database for storing student data.

## 🚀 Technologies Used
- **Java 17**
- **Spring Boot** (Web Starter)
- **Lombok** (For boilerplate code reduction)

## 📋 Features
- **In-Memory Storage:** Uses a static `ArrayList<Student>` to store data.
- **Pre-loaded Data:** The application starts with at least 2 students already in the list.
- **REST Endpoints:** Full CRUD operations (Create, Read, Update, Delete).

---

## 🛠 API Endpoints

| HTTP Method | Endpoint | Description |
|-------------|----------|-------------|
| **GET** | `/students` | Returns the list of all students |
| **GET** | `/students/{id}` | Returns a specific student by ID |
| **POST** | `/students` | Adds a new student to the list |
| **PUT** | `/students/{id}` | Updates an existing student's details |
| **DELETE** | `/students/{id}` | Deletes a student from the list |

---

## 💻 Usage Examples

### 1. Get All Students
**Request:**
`GET http://localhost:9090/students`

**Response:**
```json
[
  {
    "id": 1,
    "name": "Ali",
    "lastname": Valiyev,
    
  },
  {
    "id": 2,
    "name": "Vali",
    "lastname": "Gasimov"
  }
]
