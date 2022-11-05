/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem;

/**
 *
 * @author user
 */
public class Course {
    private int id;
    private String code;
    private String name;
    private int creditHours;
    private int year;
    private int semester;
    private Instructor instructor;
    private String description;
    
    public Course() {
    }
    
    public Course(
            int id,
            String code,
            String name,
            int creditHours,
            int year,
            int semester,
            Instructor instructor,
            String description) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.year = year;
        this.semester = semester;
        this.instructor = instructor;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
