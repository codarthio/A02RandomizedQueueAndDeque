/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A02;

import A02.Deque;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cody Henry
 */
public class DequeIT {
    
    public DequeIT() {
    }
    

    /**
     * Test of isEmpty method, of class Deque.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Deque instance = new Deque();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Deque.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Deque instance = new Deque();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class Deque.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object item = null;
        Deque instance = new Deque();
        instance.addFirst(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class Deque.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Deque instance = new Deque();
        instance.addLast();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Deque.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Deque instance = new Deque();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
