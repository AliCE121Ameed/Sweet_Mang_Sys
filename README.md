# Sweet Management System (Sweet_Mang_Sys)

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)  
![Language](https://img.shields.io/badge/language-Java-yellow)  
![BDD](https://img.shields.io/badge/Testing-BDD-Cucumber-green)  
![Quality](https://img.shields.io/badge/code_quality-SonarCloud-blue)

---

## Overview
The **Sweet Management System** is a Java-based application designed for managing sweet shops using **BDD (Behavior Driven Development)** principles.  
It leverages **Cucumber (Gherkin syntax)** for defining features and scenarios, generating step definitions, and running automated tests.  
The project is also integrated with **SonarCloud** for continuous code quality and coverage analysis.

---

## Features
- Role-based user interfaces (**Admin, Store Owner, Raw Material Supplier, Beneficiary User**) with login-based access.  
- Behavior Driven Development (**Cucumber + Gherkin**) for functional and GUI testing.  
- Continuous integration with **SonarCloud** to ensure clean and maintainable code.  
- Product, order, and content management for sweet shops and suppliers.  
- Messaging and notifications between users (optional/bonus).  

---

## Project Structure
- `.github/workflows` → CI/CD pipeline configuration (if present)  
- `src/` → Java source code (core logic, step definitions, GUI)  
- `My_Featuress/` → Cucumber `.feature` files written in **Gherkin**  
- `pom.xml` → Maven project configuration and dependencies  
- `report1.txt` → Reports (test results or quality analysis)  

---

## Getting Started

### Requirements
- **Java 8+**  
- **Maven**  
- **Cucumber** (via Maven dependencies)  
- (Optional) **SonarCloud account & token**  

### Running the project
```bash
# Clone the repository
git clone https://github.com/AliCE121Ameed/Sweet_Mang_Sys.git
cd Sweet_Mang_Sys

# Run tests with Cucumber
mvn test

# Run the application (replace with your Main class)
mvn exec:java -Dexec.mainClass="com.yourpackage.YourMainClass"

# (Optional) Analyze with SonarCloud
mvn sonar:sonar -Dsonar.login=<YOUR_SONAR_TOKEN>
