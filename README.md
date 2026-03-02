# Company Management App

A simple console-based Java application for managing companies and
employees. This project demonstrates object-oriented programming
principles, service-layer abstraction, and in-memory data handling using
Java collections.

------------------------------------------------------------------------

## Overview

The application allows users to:

-   Create and list companies
-   Create and list employees
-   Assign employees to a company
-   Count the number of employees in a company
-   Navigate through interactive console menus

All data is stored in memory using ArrayList, meaning all data is lost
when the application exits.

------------------------------------------------------------------------

## Project Structure

### Models

-   Company
-   Employee

### Services

-   CompanyService
-   CompanyServiceImpl
-   EmployeeService
-   EmployeeServiceImpl

### Utilities

-   MenuUtils (for printing menus and reusable console helpers)

### Main Class

-   CompanyManagementApp

------------------------------------------------------------------------

## Architecture & Design

-   Uses interfaces to define service contracts.
-   Implements a service layer pattern to separate business logic from
    UI logic.
-   Uses Java Streams API to search companies by NIT.
-   Applies basic exception handling for validation.
-   Uses Scanner for console input.

------------------------------------------------------------------------

## Features

### Main Menu

1.  Company Management
2.  Employee Management
3.  Exit application

### Company Menu

1.  Create a company
2.  List all companies
3.  Add an employee to a company (by NIT)
4.  Count employees in a company
5.  Return to main menu

### Employee Menu

1.  Create an employee
2.  List all employees
3.  Return to main menu

------------------------------------------------------------------------

## Business Rules

-   An employee can belong to only one company.
-   Companies are identified by their NIT.
-   If a company is not found by NIT, the system prompts the user again.
-   Invalid numeric input is handled gracefully.
-   Data exists only during runtime (no persistence layer).

------------------------------------------------------------------------

## How to Run

1.  Clone the repository:

    git clone `<repository-url>`{=html}

2.  Compile the project (adjust paths if using packages):

    javac CompanyManagementApp.java

3.  Run the application:

    java CompanyManagementApp

------------------------------------------------------------------------

## Technical Concepts Demonstrated

-   Object-Oriented Programming (OOP)
-   Encapsulation
-   Interface-based design
-   Service Layer Pattern
-   Java Collections (ArrayList)
-   Java Streams API
-   Exception Handling
-   Console-based UI

------------------------------------------------------------------------

## Limitations

-   No database integration
-   No persistence (in-memory storage only)
-   No validation for duplicate NITs
-   No advanced input validation
-   Single-user console execution

------------------------------------------------------------------------

## Authors

-   **Jorge Eliecer Uribe Pulgarin** – [@titouribe](https://github.com/titouribe)
-   **Luis Miguel Vargas Guevara** – [@luismvargasg](https://github.com/luismvargasg)
-   **Manuel Ramiro Pemberthy Gil** – [@pemberth](https://github.com/pemberth)

------------------------------------------------------------------------

## License

This project is intended for educational and academic purposes.
