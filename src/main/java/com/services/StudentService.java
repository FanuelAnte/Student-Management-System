/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.Transcript.Student;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nonyx
 */
public class StudentService {
    public void save(Student student) throws IOException{
        String sql = String.format(
        "INSERT INTO student(name, phone_number) VALUES ('%s', '%s')", student.getName(), student.getPhoneNumber());
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    
    public ArrayList<Student> getAll(){
        ArrayList<Student> data = new ArrayList<>();
        String sql = "SELECT * FROM student ORDER BY id";
        DatabaseService service = new DatabaseService();
        
        try(
                Connection conn = service.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            while(rs.next()){
                data.add(
                    new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone_number"))
                );
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
    }
    
    public void update(Student student, String column, String value){
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
