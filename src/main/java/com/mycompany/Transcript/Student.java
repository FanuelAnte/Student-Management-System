/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transcript;

/**
 *
 * @author nonyx
 */
public class Student {
    private String name;
    private int school_id;
    private int phone_number;
    private boolean payment;
    
    //constructor
    public Student(String name, int school_id, int phone_number, boolean payment){
        this.name = name;
        this.school_id = school_id;
        this.phone_number = phone_number;
        this.payment = payment;
    }
    
    //getters
    public String getName(){
        return this.name;
    }
    public int getSchoolId(){
        return this.school_id;
    }
    public int getPhoneNumber(){
        return this.phone_number;
    }
    public boolean getPayment(){
        return this.payment;
    }
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setSchoolId(int school_id){
        this.school_id = school_id;
    }
    public void setPhoneNumber(int phone_number){
        this.phone_number = phone_number;
    }
    public void setPayment(boolean payment){
        this.payment = payment;
    }
}
