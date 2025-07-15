# 💼 Employee Payroll System

[![Java JDK 17+](https://img.shields.io/badge/Java-JDK17%2B-blue?style=for-the-badge)](https://www.oracle.com/java/)
[![Apache Maven 3.x](https://img.shields.io/badge/Maven-3.x-orange?style=for-the-badge)](https://maven.apache.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15%2B-blue?style=for-the-badge)](https://www.postgresql.org/)

## 📘 Introduction

Employee Payroll System is a Java console-based application that uses Hibernate 7.x, JPA, and PostgreSQL to manage employee salary and department data efficiently. It provides a simple menu-driven interface for adding and viewing employee details.

## 👨‍💻 Group Members

- Pavan Damji (Leader)  
- Anurag Mane (Member)

## 📑 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Usage](#-usage)
- [Screenshots](#-screenshots)
- [Dependencies](#-dependencies)
- [Future Enhancements](#-future-enhancements)
- [Connect With Me](#-connect-with-me)

## 🔍 Overview

This system allows storing and retrieving employee information such as name, department, and salary using Hibernate ORM. It connects to a PostgreSQL database and uses JPA annotations to map objects to tables.

## 🚀 Features

- Add new employee data  
- View all employees from the database  
- Uses Hibernate and JPA for ORM  
- PostgreSQL integration for persistent storage  
- Clean modular structure with DAO layer  

## 📁 Project Structure

```
📦 Employee-Payroll-System
├── 📁 src
│   └── 📁 main
│       ├── 📁 java
│       │   └── 📁 com.pavan.payroll
│       │       ├── MainApp.java
│       │       ├── 📁 dao
│       │       │   └── EmployeeDAO.java
│       │       ├── 📁 entity
│       │       │   └── Employee.java
│       │       └── 📁 util
│       │           └── JPAUtil.java
│       └── 📁 resources
│           └── META-INF/persistence.xml
├── 📄 pom.xml
└── 📄 README.md
```

## ✅ Prerequisites

- Java 17+  
- Maven 3.x  
- PostgreSQL installed and running  
- IntelliJ IDEA (recommended)

## 📦 Installation

```bash
# Clone the repository
git clone https://github.com/PavanDamji4/Employee-Payroll-System.git

# Navigate into the project directory
cd Employee-Payroll-System

# Compile the project
mvn clean compile

# Run the application
mvn exec:java
```

## 💻 Usage

After running the application, use the console menu to:

```
===== Employee Payroll Menu =====
1. Add Employee
2. View All Employees
3. Exit
Enter choice:
```

## 📸 Screenshots

_Replace the image below with your actual screenshots:_

![App Screenshot](link-to-your-screenshot.png)

## 🧩 Dependencies

```xml
<dependencies>
  <!-- PostgreSQL JDBC Driver -->
  <dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
  </dependency>

  <!-- Hibernate Core -->
  <dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>7.0.1.Final</version>
  </dependency>

  <!-- JPA API -->
  <dependency>
    <groupId>jakarta.persistence</groupId>
    <artifactId>jakarta.persistence-api</artifactId>
    <version>3.2.0</version>
  </dependency>
</dependencies>
```

## 🔮 Future Enhancements

- Delete or update employee records  
- Search by department or salary range  
- Export data to CSV or Excel  
- Add login/authentication  
- Integrate with GUI using JavaFX/Swing  

## 🔗 Connect With Me

- [![LinkedIn](https://img.shields.io/badge/LinkedIn-pavan--damji--984608319-blue?logo=linkedin&style=flat-square)](https://www.linkedin.com/in/pavan-damji-984608319/)
- [![GitHub](https://img.shields.io/badge/GitHub-PavanDamji4-black?logo=github&style=flat-square)](https://github.com/PavanDamji4)
