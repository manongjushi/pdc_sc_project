/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ljh、
 */
public class SearchEngineTest {
    
    public SearchEngineTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSearchEngine method, of class SearchEngine.
     */
    @Test
    public void testGetSearchEngine() {
        System.out.println("getSearchEngine");
        
        SearchEngine result = SearchEngine.getSearchEngine();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    
}
