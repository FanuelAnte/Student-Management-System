/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model_classes.Transcript;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nonyx
 */
public class DatabaseServiceTest {
    @Test
    public void connectionTest(){
        DatabaseService databaseService = new DatabaseService();
        Connection conn = null;
        
        try{
            conn = databaseService.connect();
            assertEquals("student_management", conn.getCatalog());
        }catch(SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
    @Test
    public void executionTest(){
        DatabaseService databaseService = new DatabaseService();
        ArrayList<Transcript> data = new ArrayList<>();
        String sql = "Select * FROM report ORDER BY id";
        
        try (
                 Connection conn = databaseService.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                data.add(
                        new Transcript(
                                rs.getInt("id"),
                                rs.getString("student_id"),
                                rs.getString("course_title"),
                                rs.getInt("credit_hour"),
                                rs.getString("letter_grade").charAt(0),
                                rs.getInt("grade_point"))
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //compare result
        assertEquals("Introduction to Computer Systems", data.get(0).getCourseTitle());
    }
}
