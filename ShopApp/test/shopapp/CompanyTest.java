package shopapp;

import Controlling_the_products.Company;
import java.io.InputStream;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
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
public class CompanyTest {
    
    public CompanyTest() {
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
     * Test of Registeration method, of class Company.
     */
    @Test
    public void testRegisteration() {
        System.out.println("Registeration");
        String name = "";
        String email = "";
        String address = "";
        String phone = "";
        String password = "";
        String CompanyName = "";
        Company instance = new Company();
        instance.Registeration(name, email, address, phone, password, CompanyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Add_products method, of class Company.
     */
    @Test
    public void testAdd_products() {
        System.out.println("Add_products");
        String info = "";
        String price = "";
        String symbol = "";
        InputStream in = null;
        String type = "";
        Company instance = new Company();
        //instance.Add_products(info, price, symbol, in, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vieew_my_product method, of class Company.
     */
    @Test
    public void testVieew_my_product() {
        System.out.println("vieew_my_product");
        JPanel p1 = null;
        JLayeredPane layerd = null;
        Company instance = new Company();
        //instance.vieew_my_product(p1, layerd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
