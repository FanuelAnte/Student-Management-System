/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transcript;

/**
 *
 * @author nonyx
 */
public class Course {
    private String course_title;
    private int course_code;
    private int credit_hour;
    
    //constructor
    public Course(String course_title, int course_code, int credit_hour){
        this.course_title = course_title;
        this.course_code = course_code;
        this.credit_hour = credit_hour;
    }
    
    //getters
    public String getCourseTitle(){
        return this.course_title;
    }
    public int getCourseCode(){
        return this.course_code;
    }
    public int getCreditHour(){
        return this.credit_hour;
    }
    
    //setters
    public void setCourseTitle(String course_title){
        this.course_title = course_title;
    }
    public void setCourseCode(int course_code){
        this.course_code = course_code;
    }
    public void setCreditHour(int credit_hour){
        this.credit_hour = credit_hour;
    }
}
