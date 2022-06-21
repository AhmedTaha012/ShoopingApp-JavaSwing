/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopapp;

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
public class ShippingCompanyTest {
    
    public ShippingCompanyTest() {
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
     * Test of Registeration method, of class ShippingCompany.
     */
    @Test
    public void testRegisteration() {
        System.out.println("Registeration");
        String Name = "Dell";
        String Email = "Dell@Dell.com";
        String Address = "newyork";
        String Phone = "1234567890";
        String Area = "USA";
        ShippingCompany instance = new ShippingCompany();
        instance.Registeration(Name, Email, Address, Phone, Area);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
