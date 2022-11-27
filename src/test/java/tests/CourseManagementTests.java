/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import Services.StudentEnrolmentService;
import Services.StudentListService;
import Services.StudentService;
import UI_and_TableModels.StudentListInternalFrame;
import UI_and_TableModels.StudentPanelFrame;
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
       //Given
       Enrolment enrolmentTrue = new Enrolment(true);
       Enrolment enrolmentFalse = new Enrolment(false);
       
       //When 
       String convertedValueTrue = enrolmentTrue.getEnrolled();
       String convertedValueFalse = enrolmentFalse.getEnrolled();
       
       //Then
       assertEquals("Enrolled", convertedValueTrue);
       assertEquals("Not Enrolled", convertedValueFalse);
    }
    
    @Test
    public void testStudentListRetrieval() {
        //Given that I am properly logged in as a member of the 
        //registrar’s office and I’m at the admin page
        StudentPanelFrame studentPanelFrame = new StudentPanelFrame();
        StudentListService service = new StudentListService();
        
        //When I click on the “Student List” button.
        studentPanelFrame.jMenuItem1ActionPerformed();
        
        ArrayList<Student> studentList = service.getAll();
        
        //Then I am redirected to a page with all the students’ information.
        assertEquals(false, studentPanelFrame.isStudentListFrameClosed());
        assertNotEquals(studentList, new ArrayList<Student>());
    }
    
    @Test
    public void testStudentEnrolment() {
        //Given that I am on the Student List page
        StudentEnrolmentService service = new StudentEnrolmentService();
        
        //when I click on a specific student’s name and press the “Edit” button.
        //Call the method that retrieves all the courses.
        ArrayList<Enrolment> enrolmentList = service.getEnrolmentList(7);
        
        //Then I am presented with a list of courses along with the student’s
        //enrollment status related to each course.
        assertNotEquals(enrolmentList, new ArrayList<Enrolment>());
    }
    
    @Test
    public void testEnrolmentUpdate() {
        //Given that I have selected a specific course.
        StudentEnrolmentService service = new StudentEnrolmentService();
        
        ArrayList<Enrolment> enrolmentList = service.getEnrolmentList(7);
        Enrolment enrolment = enrolmentList.get(0);
        
        //When I click the “change enrollment status” button.
        service.updateEnrolment(enrolment, "enrolled", !(enrolment.isEnrolled()));
        
        ArrayList<Enrolment> enrolmentListNew = service.getEnrolmentList(7);
        Enrolment enrolmentNew = enrolmentListNew.get(0);
        
        //Then the enrollment status of the selected course changes either 
        //from enrolled to not enrolled or vice versa depending on the initial status.
        assertNotEquals(enrolmentNew.getEnrolled(), enrolment.getEnrolled());
    }
}
