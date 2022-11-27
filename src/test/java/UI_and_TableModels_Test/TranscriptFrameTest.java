/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI_and_TableModels_Test;

import UI_and_TableModels.StudentInformationFrame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author nonyx
 */
public class TranscriptFrameTest {
    @Test
    public void testTransitionToTranscriptFrame(){
        StudentInformationFrame studentInformationFrame = new StudentInformationFrame();
        
        studentInformationFrame.editButtonActionPerformed();
        
        assertEquals(false, studentInformationFrame.isTranscriptFrameClosed());
    }
}
