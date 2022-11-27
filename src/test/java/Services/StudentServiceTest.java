/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Services;

import java.io.IOException;
import java.util.ArrayList;
import model_classes.Student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class StudentServiceTest {
    @Test
    public void testDatabaseSaving(){
        Student student = new Student(1, "Kenean", "Tilahun", "3/5/1998", "Male", "Computer Science", 2, 1, "kenean@gmail.com", "0911234567");
        StudentService studentService = new StudentService();
        try{
            studentService.save(student);
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }
        
        assertEquals(student, studentService.saved_student_information);
    }
    @Test
    public void testDatabaseRetrival(){
        StudentService studentService = new StudentService();
        ArrayList<Student> data = studentService.getAll();
        
        assertEquals("Alazar Lemma", data.get(1).getFullName());
    }
}
