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
    private int id;
    private String phone_number;
    
    //constructor
    public Student(){
        //...
    }
    public Student(String name, String phone_number){
        this.name = name;
        this.phone_number = phone_number;
    }
    public Student(int id, String name, String phone_number){
        this(name, phone_number);
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
}
