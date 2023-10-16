/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import java.sql.SQLException;
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
public class DBManagerTest {
    
    public DBManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() throws SQLException {
      
    }
    
    @Before
    public void setUp() {
        DBManager m=DBManager.getDBmanager();
        m.connect();
    }
    
    @After
    public void tearDown() throws SQLException {
        
    }

  

    /**
     * Test of search method, of class DBManager.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String table = "people";
        String condition = "ac";
        DBManager instance = DBManager.getDBmanager();
        String expResult = "ac";
        String result = instance.search(table, condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchContain method, of class DBManager.
     */
    @Test
    public void testSearchContain() {
        System.out.println("searchContain");
        String table = "people";
        String condition = "a";
        DBManager instance = DBManager.getDBmanager();
        ArrayList<String> result = instance.searchContain(table, condition);
        assertNotNull(instance);
       
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAll method, of class DBManager.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        String table = "people";
        DBManager instance = DBManager.getDBmanager();
        ArrayList<Item> result = instance.getAll(table);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delete method, of class DBManager.
     */
   
    
    
}
