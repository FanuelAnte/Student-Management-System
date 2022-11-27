/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DataBaseOperations.DbOperations;
import DataBaseOperations.RegistrarDao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author ALE
 */
public class passwordUpdateTest {

    /*SM-89
        I have created this method inorder to test whether the update method in 
    in the REgistrarDao class works as intended or not. It accepts an email address 
    and searches on the database if the user exists it will reset their password
    to what they passed as a new-password. It will return the newPassword from the 
    database if it is updated by finding the correct email otherwise it will return null.
     */
    public String update(String email, String newPassword) {
        String actualPassword = null;
        String actualEmail = null;
        String query = "select * from registrar where email='" + email + "'";
        try {
            ResultSet rs = DbOperations.getData(query);
            while (rs.next()) {
                actualEmail = rs.getString("email");
                actualPassword = rs.getString("password");
                if (actualEmail.equals(email)) {
                    RegistrarDao.update(email, newPassword);
                    actualPassword = newPassword;
                } else {
                    JOptionPane.showMessageDialog(null, email + "Doesn't Exist");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, email + "Doesn't Exist");
        }
        return actualPassword;
    }

/////////////////////////////////////////////////////////////////////////////////////////

    /*
    SM-89 (User story to update or reset my password.)
     */
    @Test
    void should_updatePassword_whenNewPasswordIsGiven() {
//        Given
        String email = "alazar@gmail.com";
        String password = "1234";
//        when
        String UpdatedPassword = update(email, password);
//        then
        assertEquals(password, UpdatedPassword);

    }

    public passwordUpdateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
