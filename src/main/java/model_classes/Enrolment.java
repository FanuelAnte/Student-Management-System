 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_classes;



/**
 *
 * @author user
 */
public class Enrolment {
    private int id;
    private Student student;
    private Course course;
    private boolean enrolled;
    
    public Enrolment (){
    }
    
    public Enrolment(boolean enrolled) {
        this.enrolled = enrolled;
    }
    
    public Enrolment (
            int id,
            Student student,
            Course course,
            boolean enrolled) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.enrolled = enrolled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isEnrolled() {
        return enrolled;
    }
    
    public String getEnrolled() {
        if (enrolled) {
            return "Enrolled";
        } else {
            return "Not Enrolled";
        }
//        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }
}
