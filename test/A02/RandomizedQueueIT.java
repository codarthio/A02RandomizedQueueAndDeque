/*
TODO:
Randomized queue. A randomized queue is similar to a stack or queue, except 
that the item removed is chosen uniformly at random from items in the data structure. 
Create a generic data type RandomizedQueue that implements the following API:

public class RandomizedQueue<Item> implements Iterable<Item> {
   public RandomizedQueue()                 // construct an empty randomized queue
   public boolean isEmpty()                 // is the queue empty?
   public int size()                        // return the number of items on the queue
   public void enqueue(Item item)           // add the item
   public Item dequeue()                    // delete and return a random item
   public Item sample()                     // return (but do not delete) a random item
   public Iterator<Item> iterator()         // return an independent iterator over items in random order
   public static void main(String[] args)   // unit testing
}
Corner cases.  The order of two or more iterators to the same randomized queue 
must be mutually independent; each iterator must maintain its own random order. 
Throw a java.lang.NullPointerException if the client attempts to add a null item; 
throw a java.util.NoSuchElementException if the client attempts to sample or dequeue 
an item from an empty randomized queue; throw a java.lang.UnsupportedOperationException 
if the client calls the remove() method in the iterator; throw a 
java.util.NoSuchElementException if the client calls the next() method in the iterator 
and there are no more items to return.

Performance requirements.  Your randomized queue implementation must support each 
randomized queue operation (besides creating an iterator) in constant amortized time 
and use space proportional to the number of items currently in the queue. That is, 
any sequence of M randomized queue operations (starting from an empty queue) must take 
at most cM steps in the worst case, for some constant c. Additionally, your iterator 
implementation must support next() and hasNext() in constant worst-case time and construction 
in linear time; you may use a linear amount of extra memory per iterator.


 */
package A02;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author small_manda
 */
public class RandomizedQueueIT {
    
    public RandomizedQueueIT() {
    }

    /**
     * Test of isEmpty method, of class RandomizedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        RandomizedQueue instance = new RandomizedQueue();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class RandomizedQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        RandomizedQueue instance = new RandomizedQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enqueue method, of class RandomizedQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object item = null;
        RandomizedQueue instance = new RandomizedQueue();
        instance.enqueue(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dequeue method, of class RandomizedQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        RandomizedQueue instance = new RandomizedQueue();
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sample method, of class RandomizedQueue.
     */
    @Test
    public void testSample() {
        System.out.println("sample");
        RandomizedQueue instance = new RandomizedQueue();
        Object expResult = null;
        Object result = instance.sample();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class RandomizedQueue.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        RandomizedQueue instance = new RandomizedQueue();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RandomizedQueue.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RandomizedQueue.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
