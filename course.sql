/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  user
 * Created: Nov 25, 2022
 */
CREATE DATABASE sms
\connect postgres
CREATE TABLE public.course(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    code varchar NOT NULL,
    "name" varchar NOT NULL,
    credit_hours int4 NOT NULL,
    "year" int4 NOT NULL,
    semester int4 NOT NULL,
    instructor int4 NOT NULL,
    description varchar NOT NULL,
    CONSTRAINT course_pk PRIMARY KEY (id)
);

CREATE TABLE public.enrolment(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    student int4 NOT NULL,
    course int4 NOT NULL,
    enrolled boolean NOT NULL,
    CONSTRAINT enrolment_pk PRIMARY KEY (id)

);  

CREATE TABLE public.instructor(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    first_name varchar NOT NULL,
    last_name varchar NOT NULL,
    date_of_birth date NOT NULL,
    gender varchar NOT NULL,
    department varchar NOT NULL,
    email varchar NOT NULL,
    phone_number int4 NOT NULL,
    password varchar NOT NULL,
    CONSTRAINT instructor_pk PRIMARY KEY (id)
);    

CREATE TABLE public.student(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    first_name varchar NOT NULL,
    last_name varchar NOT NULL,
    full_name varchar NOT NULL,
    "date" date NOT NULL,
    date_of_birth date NOT NULL, 
    gender varchar NOT NULL,
    Major varchar NOT NULL,
    department varchar NULL,
    "year" int4 NULL,
    semester int4 NULL,
    email varchar NOT NULL,
    phone_number int4 NOT NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);  

CREATE TABLE public.registrar (
     first_name varchar NOT NULL,
     last_name varchar NOT NULL,
     email varchar NOT NULL,
     mobileNumber varchar NOT NULL,
     password varchar NOT NULL,
     dateOfBirth varchar NOT NULL,
     Gender varchar NOT NULL,
     UNIQUE (email),
     id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
     CONSTRAINT registrar_pk PRIMARY KEY (id)
 );

CREATE TABLE public.student(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    "name" varchar NOT NULL,

    phone_number varchar NOT NULL,
    "date" date NOT NULL,
    Email varchar NOT NULL,
    Major varchar NOT NULL,
    Gender varchar NOT NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);

CREATE TABLE public.report(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    student_ID varchar NOT NULL,
    course_title varchar NOT NULL,
    credit_hour int4 NOT NULL,
    letter_grade char NOT NULL,
    grade_point int4 NOT NULL,
    CONSTRAINT report_pk PRIMARY KEY (id)
);      
