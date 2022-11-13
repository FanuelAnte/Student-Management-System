/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Transcript;

import java.util.Date;

/**
 *
 * @author nonyx
 */
public class Student {
    private String name;
    private int id;
    private String phone_number;
    private Date Date;
    private String email;
    private String major;
    private String gender;
    
    //constructor
    public Student(){
        //...
    }
    public Student(String name, String phone_number, Date Date, String email, String major, String gender){
        this.name = name;
        this.phone_number = phone_number;
        this.Date = Date;
        this.email = email;
        this.major = major;
        this.gender = gender;
    }
    public Student(int id, String name, String phone_number, Date Date, String email, String major, String gender){
        this(name, phone_number, Date, email, major, gender);
        this.id = id;
    }
    
    //getters
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.id;
    }
    public String getPhoneNumber(){
        return this.phone_number;
    }
    public Date getDate(){
        return this.Date;
    }
    public String getEmail(){
        return this.email;
    }
    public String getMajor(){
        return this.major;
    }
    public String getGender(){
        return this.gender;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    }
    public void setDate(Date Date){
        this.Date = Date;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
}
