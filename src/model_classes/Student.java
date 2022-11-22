/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_classes;

import java.util.Date;

/**
 *
 * @author nonyx
 */
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String phone_number;
    private Date date;
    private String dateOfBirth;
    private String email;
    private String major;
    private String gender;
    private String department;
    private int year;
    private int semester;
    private String password;

    //constructor
    public Student() {
        //...
    }

    public Student(String name, String phone_number, Date Date, String email, String major, String gender) {
        setFullName(name);
        this.phone_number = phone_number;
        this.date = Date;
        this.email = email;
        this.major = major;
        this.gender = gender;
    }

    public Student(String firstName, String lastName, String name, String phone_number, Date Date, String email, String major, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        setFullName(name);
        this.phone_number = phone_number;
        this.date = Date;
        this.email = email;
        this.major = major;
        this.gender = gender;
    }

    public Student(int id, String name, String phone_number, Date Date, String email, String major, String gender) {
        this.id = id;
        setFullName(name);
        this.phone_number = phone_number;
        this.date = Date;
        this.email = email;
        this.major = major;
        this.gender = gender;
    }

    public Student(
            int id,
            String firstName,
            String lastName,
            String dateOfBirth,
            String gender,
            String department,
            int year,
            int semester,
            String email,
            String phoneNumber
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.department = department;
        this.year = year;
        this.semester = semester;
        this.email = email;
        this.phone_number = phoneNumber;

    }

    //getters
    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return this.id;
    }

    public String getPhoneNumber() {
        return this.phone_number;
    }

    public Date getDate() {
        return this.date;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMajor() {
        return this.major;
    }

    public String getGender() {
        return this.gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public String getPassword() {
        return password;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setDate(Date Date) {
        this.date = Date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    public String getYearAndSemester() {
        return "Year " + getYear() + " Semester " + getSemester();
    }
}
