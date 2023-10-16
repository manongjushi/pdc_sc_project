/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
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
public class itemManagerTest {
    
    public itemManagerTest() {
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
     * Test of getQuestion method, of class itemManager.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        int Index = 0;
        itemManager instance = null;
        String expResult = "";
        String result = instance.getQuestion(Index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer method, of class itemManager.
     */
    @Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        int Index = 0;
        itemManager instance = null;
        String expResult = "";
        String result = instance.getAnswer(Index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getitemManager method, of class itemManager.
     */
    @Test
    public void testGetitemManager() {
        System.out.println("getitemManager");
        itemManager result = itemManager.getitemManager();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of additem method, of class itemManager.
     */
    @Test
    public void testAdditem() {
        System.out.println("additem");
        Item item = null;
        itemManager instance = null;
        instance.additem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteitem method, of class itemManager.
     */
    @Test
    public void testDeleteitem() {
        System.out.println("deleteitem");
        Item item = null;
        itemManager instance = null;
        instance.deleteitem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
