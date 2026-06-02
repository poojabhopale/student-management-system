<<<<<<< HEAD
 Student Management System
=======
Student Management System
>>>>>>> d899d2c7d57215f9c561dee54ed620973533a56c

A Student Management System developed using Java, Spring Boot, JPA, and MySQL.
This project is built for learning REST API development and CRUD operations.

---

 Features

- Add new student
- View all students
- Get student by ID
- Update student details (Full & Partial Update)
- Delete student record

---

️ Technologies Used

- Java
- Spring Boot
-  JPA
- MySQL
- Maven
- REST API

---

 Project Structure

src
└── main
├── java
│   └── com.bhopalepooja862.LearningRESTAPIs
│       ├── controller
│       ├── entity
│       ├── repository
│       └── service
└── resources
└── application.properties

---

⚙ How to Run the Project

1. Clone the repository:

git clone https://github.com/poojabhopale/student-management-system.git

2. Open the project in IntelliJ IDEA or Eclipse.

3. Create a MySQL database named:

studentdb

4. Configure the database in "application.properties":

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

5. Run the Spring Boot application.

6. Use Postman to test APIs.

---

 API Endpoints

- POST "/students" → Add new student
- GET "/students" → Get all students
- GET "/students/{id}" → Get student by ID
- PUT "/students/{id}" → Full update of student
- PATCH "/students/{id}" → Partial update of student
- DELETE "/students/{id}" → Delete student

---

 Sample JSON (POST /students)

{
"name": "pooja Bhopale",
"email": "pooja145@gmail.com"
}

---

 Author

<<<<<<< HEAD
Pooja Bhopale
=======
Pooja Bhopale
>>>>>>> d899d2c7d57215f9c561dee54ed620973533a56c
