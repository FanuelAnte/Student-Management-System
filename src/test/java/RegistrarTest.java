/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import DataBaseOperations.DbOperations;
import DataBaseOperations.RegistrarDao;
import UI_and_TableModels.MainFrame;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model_classes.Registrar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;

/**
 *
 * @author ALE
 */
public class RegistrarTest {


    /*SM-75
    Below there are two test which basically test the getData method in the 
    DbOperations class which will return the required information of a registrar
    required. Basically email and password are tested here.
     */
    @Test
    void should_returnCorrectEmail_ifUserExists() {
//        Given
        String email = "alazar@gmail.com";
        String actualEmail = null;
        String query = "select * from registrar where email='" + email + "'";
//        when

        try {
            ResultSet rs = DbOperations.getData(query);
            while (rs.next()) {
                actualEmail = rs.getString("email");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, email + "Doesn't Exist");
        }
//        then
        assertEquals(email, actualEmail);

    }

    @Test
    void should_returnCorrectPassword_ifUserExists() {
//        Given
        String password = "1234";
        String email = "alazar@gmail.com";
        String actualPassword = null;
        String query = "select * from registrar where email='" + email + "'";
//        when

        try {
            ResultSet rs = DbOperations.getData(query);
            while (rs.next()) {
                actualPassword = rs.getString("password");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, email + "Doesn't Exist");
        }
//        then
        assertEquals(password, actualPassword);

    }

    /*
    SM-75 (This is a test which will save a new Registrar to the data base when 
    he has filled all the required information.)
     */
    RegistrarDao rgr;

    @Test
    void should_saveUser_whenUserEnterInformation() throws InterruptedException {
//        Given
        String firstName = "Kebede";
        String lastName = "Moges";
        String email = "kebede@gmial.com";
        String mobileNumber = "09090909";
        String password = "1234";
        String dateOfBirth = "02/02/2002";
        String gender = "female";

//        When
        Registrar user = new Registrar(firstName, lastName, email, mobileNumber, password, dateOfBirth, gender);
        rgr.save(user);
        sleep(200);
        try {
            String savedUser = null;
            String query = "select * from registrar where email='" + email + "'";
            ResultSet rs = DbOperations.getData(query);
            while (rs.next()) {
                savedUser = rs.getString("email");
            }
//        then
            assertEquals(user.getEmail(), savedUser);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, email + "Doesn't Exist");
        }

    }

    public RegistrarTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
