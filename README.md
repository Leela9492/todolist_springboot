To-Do List Application – Spring Boot:
====================================
This project is a simple To-Do List web application built using Spring Boot. The application allows users to add tasks, mark them as completed or not completed using a toggle button, and delete tasks from the list. All tasks are stored and managed using a MySQL database.

Features:
=========
Add new tasks using the input text box.

Toggle button to update task status (completed / not completed).

Delete button to remove tasks permanently.

Tasks are stored in a MySQL database for persistence.

Server-side rendering using Thymeleaf.

Hibernate ORM for database operations.

Lombok used to reduce boilerplate code.

Technologies Used:
================
Spring Boot

Spring Web

Spring Boot JPA

Hibernate

Thymeleaf

Lombok

MySQL Driver

Project Overview:
=================
The application accepts user input for tasks, displays them in a list format, and allows updates through toggle actions. Completed tasks are visually identified and stored with updated status. Users can delete tasks which will be removed from both the UI and the database.

Modules and Structure:
======================
Controller layer handles incoming requests and page navigation.

Service layer manages business logic.

Repository layer interacts with the database using JPA.

Thymeleaf templates handle the UI rendering.

Entity classes represent the task model.

Hibernate manages ORM mapping.

MySQL database stores all task records.

How to Run:
===========
Clone the repository.

Configure the MySQL database connection in application.properties.

Run the Spring Boot application using your IDE through tomcat server(supprotable version is v11 of tomcat server).

Open http://localhost:8080
 in your browser to access the application.

 How It Works:
 =============
User enters a task → Clicks "Add"

Task gets saved in MySQL through JPA

UI refreshes with the updated task list

Toggle button updates task status

Delete button removes the task from DB and UI


This project is a good starting point for understanding Spring Boot MVC, JPA, Hibernate, and Thymeleaf integration. Contributions and suggestions are welcome.
