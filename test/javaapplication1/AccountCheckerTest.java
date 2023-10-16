/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ljh、
 */
public class AccountCheckerTest {
    
    public AccountCheckerTest() {
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
     * Test of checkAccount method, of class AccountChecker.
     */
    @Test
    public void testCheckAccount() {
        System.out.println("checkAccount");
        String account = "ac";
        String password = "ac";
        AccountChecker instance =AccountChecker.getAccountChecker();
        boolean expResult = true;
        boolean result = instance.checkAccount(account, password);
        assertEquals(expResult, result);       
    }
    
}
