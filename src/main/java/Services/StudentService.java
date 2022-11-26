/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import model_classes.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.Date;

/**
 *
 * @author nonyx
 */
public class StudentService {

    public void save(Student student) throws IOException {
        String sql
                = String.format(
                        "INSERT INTO student(first_name,last_name,full_name,Date,date_of_birth,gender,major,department,year,semester,email,phone_number) VALUES ('%s','%s','%s','%s','%s','%S','%S','%S','%S','%S','%S','%S')", 
                        student.getFirstName(), 
                        student.getLastName(), 
                        student.getFullName(), 
                        student.getDate(), 
                        student.getDate(), 
                        student.getGender(), 
                        student.getMajor(), 
                        student.getDepartment(), 
                        student.getYear(), 
                        student.getSemester(), 
                        student.getEmail(), 
                        student.getPhoneNumber());

        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }

    public ArrayList<Student> getAll() {
        ArrayList<Student> data = new ArrayList<>();
        String sql = "SELECT * FROM student ORDER BY id";
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                data.add(
                        new Student(
                                rs.getInt("id"),
                                rs.getString("full_name"),
                                rs.getString("phone_number"),
                                rs.getDate("Date"),
                                rs.getString("email"),
                                rs.getString("major"),
                                rs.getString("gender"))
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return data;
        }
    }

    
        public ArrayList<Course> getCourseList() {
        ArrayList<Course> courseList = new ArrayList<>();

        String sql = "Select * from course ORDER BY id";
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                courseList.add(
                        new Course(
                                rs.getInt("id"),
                                rs.getString("code"),
                                rs.getString("name"),
                                rs.getInt("credit_hours"),
                                rs.getInt("year"),
                                rs.getInt("semester"),
                                getInstructor(rs.getInt("instructor")),
                                rs.getString("description")
                        ));
            }
            return courseList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return courseList;
    }
        
        public Instructor getInstructor(int id) {
        Instructor instructor = new Instructor();

        String sql = String.format(
                "Select * from instructor WHERE id = '%s'",
                id);
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                instructor = new Instructor(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("date_of_birth"),
                        rs.getString("gender"),
                        rs.getString("department"),
                        rs.getString("email"),
                        rs.getInt("phone_number"),
                        rs.getString("password")
                );
            }
            return instructor;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return instructor;
    }
        
    public void addEnrolment(int id) {
        ArrayList<Course> courseList = getCourseList();
        
        for (Course course: courseList){
            String sql = String.format(
                "INSERT INTO enrolment (student, course, enrolled)VALUES (%s, %s, %s)",
                id,
                course.getId(),
                false);
            DatabaseService service = new DatabaseService();
            service.execute(sql);
            System.out.println(id);
        }
    }
        
    public void update(Student student, String column, String value) {

        String sql = String.format(
                "UPDATE student SET %s='%s' WHERE id=%id",
                column,
                value,
                student.getID()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
}