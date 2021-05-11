CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
	Department_id INT,
	Department_name VARCHAR(50)
);
 
CREATE TABLE Position (
	position_id INT,
	position_name VARCHAR(50)
);
   
CREATE TABLE `Account` (
	account_id INT,
	email VARCHAR(50),
	usename VARCHAR(50),
	fullname VARCHAR(50),
	department_id INT,
	position_id INT,
	create_date DATE
);

CREATE TABLE Exam (
	exam_id INT,
	`code` INT,
	title VARCHAR(50),
	category_id INT,
	duration DATE,
	creator_id INT,
	create_date DATE
);

CREATE TABLE ExamQuestion (
	exam_id INT,
	question_id INT
);