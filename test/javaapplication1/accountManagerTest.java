/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ljh、
 */
public class accountManagerTest {
    
    public accountManagerTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getManager method, of class accountManager.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
       
        accountManager result = accountManager.getManager();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    
    
}
