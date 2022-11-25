/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import model_classes.*;
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

    public Student getStudent(int id) {
        Student student = new Student();

        String sql = String.format(
                "Select * from student WHERE id = '%s'",
                id);
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                student = new Student(
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
                );
            }
            return student;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return student;
    }

    public Course getCourse(int id) {
        Course course = new Course();

        String sql = String.format(
                "Select * from course WHERE id = '%s'",
                id);
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                course = new Course(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getInt("credit_hours"),
                        rs.getInt("year"),
                        rs.getInt("semester"),
                        getInstructor(rs.getInt("instructor")),
                        rs.getString("description")
                );
            }
            return course;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return course;
    }

    public void updateEnrolment(Enrolment enrolment, String column, boolean value) {
        String sql = String.format(
                "UPDATE enrolment Set %s = '%s' WHERE id = '%s'",
                column,
                value,
                enrolment.getId()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }

    public ArrayList<Enrolment> getEnrolmentList(int id) {
        ArrayList<Enrolment> enrolmentList = new ArrayList<>();

        String sql = String.format(
                "Select * from enrolment WHERE student = '%s'",
                id);
        DatabaseService service = new DatabaseService();

        try (
                 Connection conn = service.connect();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                enrolmentList.add(
                        new Enrolment(
                                rs.getInt("id"),
                                getStudent(rs.getInt("student")),
                                getCourse(rs.getInt("course")),
                                rs.getBoolean("enrolled")
                        ));
            }
            return enrolmentList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return enrolmentList;
    }
}
