/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transcript;

import com.mycompany.Transcript.Student;
import com.mycompany.Transcript.Course;

/**
 *
 * @author nonyx
 */
public class Transcript {
    private int id;
    private String course_title;
    private String credit_hour;
    private String letter_grade;
    private String grade_point;
    
    //constructor
    public Transcript(String course_title, String credit_hour, String letter_grade, String grade_point){
        this.course_title = course_title;
        this.credit_hour = credit_hour;
        this.letter_grade = letter_grade;
        this.grade_point = grade_point;
    }
    public Transcript(String credit_hour, String letter_grade, String grade_point){
        this.credit_hour = credit_hour;
        this.letter_grade = letter_grade;
        this.grade_point = grade_point;
    }
    public Transcript(int id, String course_title, String credit_hour, String letter_grade, String grade_point){
        this(course_title, credit_hour, letter_grade, grade_point);
        this.id = id;
    }
    
    //getters
    public int getID(){
        return this.id;
    }
    public String getCourseTitle(){
        return this.course_title;
    }
    public String getCreditHour(){
        return this.credit_hour;
    }
    public String getLetterGrade(){
        return this.letter_grade;
    }
    public String getGradePoint(){
        return this.grade_point;
    }
    
    //setters
    public void setID(int id){
        this.id = id;
    }
    public void setCourseTitle(String course_title){
        this.course_title = course_title;
    }
    public void setCreditHour(String credit_hour){
        this.credit_hour = credit_hour;
    }
    public void setLetterGrade(String letter_grade){
        this.letter_grade = letter_grade;
    }
    public void setGradePoint(String grade_point){
        this.grade_point = grade_point;
    }
}
