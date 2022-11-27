/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model_classes;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class StudentTest {
    @Test
    public void testDefaultAssignment(){
        Student student = new Student(1, "Kenean", "Tilahun", "3/5/1998", "male", "Computer Science", 2, 1, "kenean@gmail.com", "0912345678");
        
        assertEquals(1, student.getID());
        assertEquals("Kenean", student.getFirstName());
        assertEquals("Tilahun", student.getLastName());
        assertEquals("3/5/1998", student.getDateOfBirth());
        assertEquals("male", student.getGender());
        assertEquals("Computer Science", student.getDepartment());
        assertEquals(2, student.getYear());
        assertEquals(1, student.getSemester());
        assertEquals("kenean@gmail.com", student.getEmail());
        assertEquals("0912345678", student.getPhoneNumber());
        
    }
}
