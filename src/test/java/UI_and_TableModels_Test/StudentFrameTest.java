/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package UI_and_TableModels_Test;

import UI_and_TableModels.StudentPanelFrame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class StudentFrameTest {
    @Test
    public void testTransitionToStudentFrame(){
        StudentPanelFrame studentPanelFrame = new StudentPanelFrame();
        studentPanelFrame.jMenu5MenuSelected();
        
        assertEquals(false, studentPanelFrame.is_closed);
    }
}
