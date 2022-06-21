/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopapp;

import Controlling_the_products.person;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salma
 */
public class personTest {
    
    public personTest() {
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

    /**
     * Test of Registeration method, of class person.
     */
    @Test
    public void testRegisteration() throws SQLException
    {
        System.out.println("Registeration");
        String name = "salm";
        String email = "salm@yahoo.com";
        String address = "hurghada";
        String area = "helal";
        String phone = "01982098765";
        String password = "salm123";
        person instance = new person();
        instance.Registeration(name, email, address, area, phone, password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class person.
     */
    @Test 
    public void testLogin()
    {
        System.out.println("login");
        String input = "salma";
        String password = "salma24";
        person instance = new person();
        instance.login(input, password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
