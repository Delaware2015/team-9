# team-9

Elementary School:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/elementary-school

Middle School:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/middle-school

High School Freshman: 
-Grade 9:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/9th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/freshman_year_checklist.pdf

High School Sophomore:
-Grade 10:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/10th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/sophomore_year_checklist.pdf

High School Junior:
-Grade 11:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/11th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/junior_year_checklist.pdf

High School Senior:
-Grade 12:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/12th-grade
http://www.collegeprep101.com/uploads/1/1/7/2/11721368/senior_year_checklist.pdf

Adult Student:
https://studentaid.ed.gov/sa/prepare-for-college/checklists/adult-student

Financial Aid Infographic:
https://studentaid.ed.gov/sa/sites/default/files/financial-aid-process.png

MySQL Queries - 

--Create Database--
CREATE DATABASE IF NOT EXISTS StudentInfo;

--StudentTable--
CREATE TABLE STUDENT(Student_Id INT UNIQUE,First_Name varchar(255),
	Last_Name varchar(255),
    	Email varchar(255) UNIQUE,
    	Password varchar(255),
    	Mentor_Id INT UNIQUE,
    	Task_Id INT,
	Univ_Id INT,
	School_Name varchar(255));	

--MentorTable--
CREATE TABLE Mentor(Mentor_Id INT UNIQUE,
    	First_Name varchar(255),
    	Last_Name varchar(255),
    	Email varchar(255),
    	Relationship varchar(255));

--TaskTable--
CREATE TABLE Task(Task_Id INT UNIQUE,
    	Task_Name varchar(255),
    	Date varchar(255),
	Status varchar(255));

--Universites--
CREATE TABLE Universities(Univ_Id INT UNIQUE,
    	Univ_Name varchar(255),
   	Task_Id INT);
