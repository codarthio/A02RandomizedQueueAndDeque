/*
TODO:
Dequeue. A double-ended queue or deque (pronounced "deck") is a generalization of 
a stack and a queue that supports inserting and removing items from either the front
or the back of the data structure. Create a generic data type Deque that implements 
the following API:

public class Deque<Item> implements Iterable<Item> {
   public Deque()                           // construct an empty deque
   public boolean isEmpty()                 // is the deque empty?
   public int size()                        // return the number of items on the deque
   public void addFirst(Item item)          // insert the item at the front
   public void addLast(Item item)           // insert the item at the end
   public Item removeFirst()                // delete and return the item at the front
   public Item removeLast()                 // delete and return the item at the end
   public Iterator<Item> iterator()         // return an iterator over items in order from front to end
   public static void main(String[] args)   // unit testing
}
Corner cases.  Throw a java.lang.NullPointerException if the client attempts to 
add a null item; throw a java.util.NoSuchElementException if the client attempts 
to remove an item from an empty deque; throw a java.lang.UnsupportedOperationException 
if the client calls the remove() method in the iterator; throw a 
java.util.NoSuchElementException if the client calls the next() method in the 
iterator and there are no more items to return.

Performance requirements.  Your deque implementation must support each deque 
operation (including construction) in constant worst-case time and use space 
proportional to the number of items currently in the deque. Additionally, your 
iterator implementation must support each operation (including construction) in 
constant worst-case time.


 */
package A02;

import java.util.Iterator;

/**
 *
 * @author Cody Henry
 */
public class Deque<Item> implements Iterable<Item> {

    /***
     * 
     * Construct an empty deque
     */
    public Deque(){
        
    }
    /**
     * 
     * @return is the deque empty?
     */
    public boolean isEmpty(){
        
    }
    /**
     * 
     * @return the number of items on the deque 
     */
    public int size(){
        
    }
    /**
     * 
     * @param item insert item at the front
     */
    public void addFirst(Item item){
        
    }
    /**
     * @param item insert item at the end
     */
    public void addLast(){
        
    }
    /**
     * 
     * @return return an iterator over items in order from front to end
     */
    @Override
    public Iterator<Item>iterator(){
        
    }
    public static void main(String[] args){
        
        
    }
    
    
}
