/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DataBaseOperations.RegistrarDao;
import model_classes.Registrar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author ALE
 */
public class loginTest {

    /*This is a default login method that I have created In order to use it in a test.
    It uses a login method from the RegistrarDao class which has a functionality of 
    verifying whether that registrar exists or not.
    If the registrar exists it returns true else it will return false. We will use this
    to assert our statement in our test below.
     */
    public boolean login(String email, String password) {
        Registrar rgr = new Registrar();
        rgr.setEmail(email);
        rgr.setPassword(password);
        rgr = (Registrar) RegistrarDao.login(email, password);
        if (rgr == null) {
            return false;
        } else {
            return true;
        }
    }

    @Test
    void should_returnTrue_WhenUserExistsToLogin() {
//        Given
        String email = "alazar@gmail.com";
        String password = "1234";
//        when
        boolean userExists = login(email, password);
//        then
        assertEquals(true, userExists);

    }

    public loginTest() {
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
