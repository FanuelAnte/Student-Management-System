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
                        "INSERT INTO student(first_name,last_name,full_name,Date,date_of_birth,gender,major,department,year,semester,email,phone_number) VALUES ('%s','%s','%s','%s','%s','%S','%S','%S','%S','%S','%S','%S')", student.getFirstName(), student.getLastName(), student.getFullName(), student.getDate(), student.getDate(), student.getGender(), student.getMajor(), student.getDepartment(), student.getYear(), student.getSemester(), student.getEmail(), student.getPhoneNumber());

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
