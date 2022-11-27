/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import Services.StudentEnrolmentService;
import Services.StudentListService;
import Services.StudentService;
import java.util.ArrayList;
import model_classes.Enrolment;
import model_classes.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class CourseManagementTests {
    
    @Test
    public void testEnrolmentBooleanConversion() {
       Enrolment enrolmentTrue = new Enrolment(true);
       
       String convertedValueTrue = enrolmentTrue.getEnrolled();
       assertEquals("Enrolled", convertedValueTrue);
       
       Enrolment enrolmentFalse = new Enrolment(false);
       
       String convertedValueFalse = enrolmentFalse.getEnrolled();
       
       assertEquals("Not Enrolled", convertedValueFalse);
    }
    
    @Test
    public void testStudentListRetrieval() {
        StudentListService service = new StudentListService();
        
        //Call the method that retrieves all the students.
        ArrayList<Student> studentList = service.getAll();
        
        //Then I am redirected to a page with all the students’ information.
        assertNotEquals(studentList, new ArrayList<Student>());
    }
    
    @Test
    public void testStudentEnrolment() {
        StudentEnrolmentService service = new StudentEnrolmentService();
        
        //Call the method that retrieves all the courses.
        ArrayList<Enrolment> enrolmentList = service.getEnrolmentList(7);
        
        //Then I am presented with a list of courses along with the student’s
        //enrollment status related to each course.
        assertNotEquals(enrolmentList, new ArrayList<Enrolment>());
    }
    
    @Test
    public void testEnrolmentUpdate() {
        StudentEnrolmentService service = new StudentEnrolmentService();
        
        ArrayList<Enrolment> enrolmentList = service.getEnrolmentList(7);
        Enrolment enrolment = enrolmentList.get(0);
        
        service.updateEnrolment(enrolment, "enrolled", !(enrolment.isEnrolled()));
        
        ArrayList<Enrolment> enrolmentListNew = service.getEnrolmentList(7);
        Enrolment enrolmentNew = enrolmentListNew.get(0);
        
        //Then the enrollment status of the selected course changes either 
        //from enrolled to not enrolled or vice versa depending on the initial status.
        assertNotEquals(enrolmentNew.getEnrolled(), enrolment.getEnrolled());
    }
    
    
    @Test
    public void testEnrolmentAssignment() {
        StudentEnrolmentService enrolmentService = new StudentEnrolmentService();
        StudentService service = new StudentService();
        
        ArrayList<Enrolment> enrolmentList = enrolmentService.getEnrolmentList(7);
        
        service.assignEnrolment(7);
        
        ArrayList<Enrolment> enrolmentListNew = enrolmentService.getEnrolmentList(7);
        
        //then the enrollment table gets automatically populated with a pairing of 
        //the registered student and all the available courses with a default 
        //enrollment status of “Not Enrolled”.
        assertNotEquals(enrolmentListNew, enrolmentList);
    }
}
