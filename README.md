# 🏢 Employee Management System (Java + Servlet + JDBC)

An **Employee Management System** built with **Java, Servlet, JSP, and MySQL** to manage employee records efficiently with a modern and user-friendly interface.

---

## ✨ Features

- ➕ **Add Employee** – Save new employee records with Name, Age, Salary, Post.
- 📋 **View Employee List** – Display all employees in a searchable and sortable table.
- ✏️ **Update Employee** – Edit existing employee details.
- ❌ **Delete Employee** – Remove employee records securely.
- 🔍 **Search Employees** – Find employees by ID, name, or position.
- 🗄 **Database Integration** – Fully connected to MySQL using JDBC.
- 🔐 **Secure Input Handling** – Uses `PreparedStatement` to prevent SQL Injection.

---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| **Java (JDK 8+)** | Core application logic |
| **Servlet & JSP** | Backend & Web Interface |
| **JDBC** | Database connectivity |
| **MySQL** | Data storage |
| **HTML, CSS, Bootstrap** | UI styling |
| **Apache Tomcat** | Application server |

---

## 📋 Prerequisites

- ☕ **Java JDK 8 or above** → [Download](https://www.oracle.com/java/technologies/javase-downloads.html)  
- 🐬 **MySQL Server & Workbench** → [Download](https://dev.mysql.com/downloads/)  
- 🌐 **Apache Tomcat 9+** → [Download](https://tomcat.apache.org/download-90.cgi)  
- 🖥 **IDE (Eclipse / IntelliJ IDEA / VS Code)**  

---

## 🚀 Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/Employee-Management-System.git
cd Employee-Management-System
2️⃣ Import into IDE
Open IDE (Eclipse recommended)

Go to File → Import → Existing Java Project

Select the cloned folder

3️⃣ Database Setup
Option 1: MySQL Workbench
sql
Copy
Edit
CREATE DATABASE employee;

USE employee;

CREATE TABLE employeedetails(
  id INT NOT NULL PRIMARY KEY,
  fname VARCHAR(10) NOT NULL,
  mname VARCHAR(10) NOT NULL,
  lname VARCHAR(10) NOT NULL,
  age INT NOT NULL,
  salary INT NOT NULL,
  address VARCHAR(30) NOT NULL,
  postid INT NOT NULL
);

CREATE TABLE postdetails(
  id INT NOT NULL PRIMARY KEY,
  postname VARCHAR(20) NOT NULL
);
Option 2: Command Line
bash
Copy
Edit
mysql -u root -p < database.sql
(Update DB username/password in DBConnection.java before running)

📁 Project Structure
pgsql
Copy
Edit
Employee-Management-System/
│── src/
│   ├── model/        # Java model classes
│   ├── dao/          # Database access classes
│   ├── servlet/      # Servlets handling requests
│── WebContent/
│   ├── index.jsp     # Home page
│   ├── addEmployee.jsp
│   ├── viewEmployee.jsp
│── database.sql      # SQL file to create tables
│── README.md
📸 Screenshots
📷 Add your application screenshots here.

🖥 Usage
Start Apache Tomcat

Open in browser:

arduino
Copy
Edit
http://localhost:8080/Employee-Management-System
Use menu options to:

Add Employee

View Employees

Update Employee

Delete Employee

🎨 Customization
Change UI colors in style.css inside WebContent/css

Add new features by creating new Servlets & updating web.xml

🐛 Troubleshooting
Issue	Solution
ClassNotFoundException: com.mysql.cj.jdbc.Driver	Add MySQL Connector/J to lib folder
Database connection failed	Check username, password, MySQL service
404 Error on JSP	Check Servlet mappings in web.xml
