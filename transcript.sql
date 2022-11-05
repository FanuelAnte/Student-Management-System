DROP DATABASE IF EXISTS transcript;

CREATE DATABASE transcript;

\connect transcript

CREATE TABLE public.student(
    id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
    "name" varchar NOT NULL,
    phone_number varchar NOT NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);