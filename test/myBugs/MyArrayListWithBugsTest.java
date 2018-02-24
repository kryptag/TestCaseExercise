/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myBugs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author florenthaxha
 */
public class MyArrayListWithBugsTest {
    
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
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void removeItem(){
        Object o = new Object();
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.add(o);
        testList.add(o);
        testList.remove(1);
        assertTrue(testList.size() == 1);
        
    }
    
    @Test
    public void addItemToEnd(){
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.add(new Object());
        assertTrue(testList.size() > 0);
    }
    
    @Test
    public void addItemToIndex(){
        Object o = new Object();
        int index = 0;
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.add(index, o);
        assertTrue(testList.get(index) == o);
    }
    
    @Test
    public void getSize(){
        Object o = new Object();
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.add(o);
        testList.add(o);
        assertTrue(testList.size() == 2);
        assertEquals(testList.get(1), o);
    }
    
    @Test
    public void getItemByIndex(){
        Object o = new Object();
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.add(o);
        assertEquals(testList.get(0), o);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeNonExistentIndex(){
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.remove(5);
    }
    
    @Test
    public void addItemsWithSpecificIndex(){
        MyArrayListWithBugs testList = new MyArrayListWithBugs();
        testList.add(0, new Object());
        testList.add(1, new Object());
    }
  
}
