DROP DATABASE IF EXISTS transcript;

CREATE DATABASE transcript;

\connect transcript

CREATE TABLE public.student(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    "name" varchar NOT NULL,
    phone_number varchar NOT NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);

CREATE TABLE public.report(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    course_title varchar NOT NULL,
    credit_hour varchar NOT NULL,
    letter_grade varchar NOT NULL,
    grade_point varchar NOT NULL,
    CONSTRAINT report_pk PRIMARY KEY (id)
);    