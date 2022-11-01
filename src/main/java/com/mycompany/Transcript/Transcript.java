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
    private char letter_grade;
    private float grade_point;
    private float remark;
    
    //constructor
    public Transcript(char letter_grade, float grade_point, float remark){
        this.letter_grade = letter_grade;
        this.grade_point = grade_point;
        this.remark = remark;
    }
    
    //getters
    public char getLetterGrade(){
        return this.letter_grade;
    }
    public float getGradePoint(){
        return this.grade_point;
    }
    public float getRemark(){
        return this.remark;
    }
    
    //setters
    public void setLetterGrade(char letter_grade){
        this.letter_grade = letter_grade;
    }
    public void setGradePoint(float grade_point){
        this.grade_point = grade_point;
    }
    public void setRemark(float remark){
        this.remark = remark;
    }
}
