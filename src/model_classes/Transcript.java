/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_classes;



/**
 *
 * @author nonyx
 */
public class Transcript {

    private int id;
    private String course_title;
    private int credit_hour;
    private char letter_grade;
    private int grade_point;
    private String student_id;

    //constructor
    public Transcript(){}
    public Transcript(String course_title, int credit_hour, char letter_grade, int grade_point) {
        this.course_title = course_title;
        this.credit_hour = credit_hour;
        this.letter_grade = letter_grade;
        this.grade_point = grade_point;
    }

    public Transcript(int credit_hour, char letter_grade, int grade_point) {
        this.credit_hour = credit_hour;
        this.letter_grade = letter_grade;
        this.grade_point = grade_point;
    }

    public Transcript(String student_id, String course_title, int credit_hour, char letter_grade, int grade_point) {
        this(course_title, credit_hour, letter_grade, grade_point);
        this.student_id = student_id;
    }

    public Transcript(int id, String student_id, String course_title, int credit_hour, char letter_grade, int grade_point) {
        this(course_title, credit_hour, letter_grade, grade_point);
        this.id = id;
        this.student_id = student_id;
    }

    //getters
    public int getID() {
        return this.id;
    }

    public String getCourseTitle() {
        return this.course_title;
    }

    public int getCreditHour() {
        return this.credit_hour;
    }

    public char getLetterGrade() {
        return this.letter_grade;
    }

    public int getGradePoint() {
        return this.grade_point;
    }

    public String getStudentID() {
        return this.student_id;
    }

    //setters
    public void setID(int id) {
        this.id = id;
    }

    public void setStudentID(String student_id) {
        this.student_id = student_id;
    }

    public void setCourseTitle(String course_title) {
        this.course_title = course_title;
    }

    public void setCreditHour(int credit_hour) {
        this.credit_hour = credit_hour;
    }

    public void setLetterGrade(char letter_grade) {
        this.letter_grade = letter_grade;
    }

    public void setGradePoint(int grade_point) {
        this.grade_point = grade_point;
    }
}
