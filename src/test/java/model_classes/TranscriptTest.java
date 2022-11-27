/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author nonyx
 */
public class TranscriptTest {
    @Test
    public void testDefaultAssignment(){
        Transcript transcript = new Transcript(1, "1", "Math", 3, 'A', 12);
        
        assertEquals(1, transcript.getID());
        assertEquals("1", transcript.getStudentID());
        assertEquals("Math", transcript.getCourseTitle());
        assertEquals(3, transcript.getCreditHour());
        assertEquals('A', transcript.getLetterGrade());
        assertEquals(12, transcript.getGradePoint());
    }
}
