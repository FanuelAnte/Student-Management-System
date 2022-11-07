/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.Transcript.Transcript;
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
public class TranscriptService {
    public void save(Transcript transcript) throws IOException{
        String sql = String.format(
        "INSERT INTO report(course_title, credit_hour, letter_grade, grade_point) VALUES('%s', '%s', '%s', '%s')", transcript.getCourseTitle(), transcript.getCreditHour(), transcript.getLetterGrade(), transcript.getGradePoint());
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    
    public ArrayList<Transcript> getAll(){
        ArrayList<Transcript> data = new ArrayList<>();
        String sql = "Select * FROM report ORDER BY id";
        DatabaseService service = new DatabaseService();
        
        try(
                Connection conn = service.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            while(rs.next()){
                data.add(
                    new Transcript(
                        rs.getInt("id"),
                        rs.getString("course_title"),
                        rs.getString("credit_hour"),
                        rs.getString("letter_grade"),
                        rs.getString("grade_point"))
                );
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
    }
    
    public void update(Transcript transcript, String column, String value){
        String sql = String.format(
                "UPDATE report SET %s='%s' WHERE id=%id",
                column,
                value,
                transcript.getID()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
}
