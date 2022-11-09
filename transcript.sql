DROP DATABASE IF EXISTS transcript;

CREATE DATABASE transcript;

\connect transcript

CREATE TABLE public.student(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    "name" varchar NOT NULL,
    phone_number int4 NOT NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);

CREATE TABLE public.report(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    course_title varchar NOT NULL,
    credit_hour int4 NOT NULL,
    letter_grade char NOT NULL,
    grade_point int4 NOT NULL,
    CONSTRAINT report_pk PRIMARY KEY (id)
);    