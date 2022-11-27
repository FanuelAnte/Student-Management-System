/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.io.IOException;
import java.util.ArrayList;
import model_classes.Transcript;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nonyx
 */
public class TranscriptServiceTest {
        @Test
    public void testDatabaseSaving(){
        Transcript transcript = new Transcript(1, "1", "Math", 3, 'A', 12);
        TranscriptService transcriptService = new TranscriptService();
        try{
            transcriptService.save(transcript);
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }
        
        assertEquals(transcript, transcriptService.saved_transcript);
    }
    @Test
    public void testDatabaseRetrieval(){
        TranscriptService transcriptService = new TranscriptService();
        ArrayList<Transcript> data = transcriptService.getAll();
        
        assertEquals("College English", data.get(3).getCourseTitle());
    }
}
