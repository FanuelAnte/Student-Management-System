/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import model_classes.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class StudentListService {

    public ArrayList<Student> getAll() {
        ArrayList<Student> studentList = new ArrayList<>();

        String sql = "Select * from student ORDER BY id";
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                studentList.add(
                        new Student(
                                rs.getInt("id"),
                                rs.getString("first_name"),
                                rs.getString("last_name"),
                                rs.getString("date_of_birth"),
                                rs.getString("gender"),
                                rs.getString("department"),
                                rs.getInt("year"),
                                rs.getInt("semester"),
                                rs.getString("email"),
                                rs.getString("phone_number")
                        ));
            }
            return studentList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return studentList;
    }
}
