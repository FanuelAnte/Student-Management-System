/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem.services;

import com.studentmanagementsystem.Course;
import com.studentmanagementsystem.Instructor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class StudentEnrolmentService {
    
    public ArrayList<Course> getCourseList() {
        ArrayList<Course> courseList = new ArrayList<>();
        
        String sql = "Select * from course ORDER BY id";
        DatabaseService service = new DatabaseService();
        
        try (
            Connection conn = service.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ){
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
            Connection conn = service.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ){
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
            return instructor;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return instructor;
    }
}
