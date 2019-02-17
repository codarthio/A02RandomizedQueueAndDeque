package A02;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.lang.NullPointerException;
import edu.princeton.cs.algs4.StdRandom; 
import java.util.Random;

/**
 *
 * @author Isaac Perry
 */
public class RandomizedQueue<Item> implements Iterable<Item> {
	//from algs 4 package
	 private Item[] collection; 
	 private int n; 
	
	
    /**
     * construct an empty randomized queue
     */
    public RandomizedQueue(){
    	
    	//Code from Assignment 2 Checklist 
    	collection = (Item[]) new Object[1]; 
    	n = 0; 
    	
    }
    /**
     * 
     * @return is the queue empty?
     */
    public boolean isEmpty(){
    	
    	return n<=0; 
    	
    }
    /**
     * 
     * @return return the number of items on the queue
     */
    public int size(){
    	return n; 
        
    }
    /**
     * 
     * @param item add the item
     */
    
    public void enqueue(Item item){
    	if(item == null) { throw new NullPointerException("That isn't valid data to input"); }
    	
    	//resize to double of the current size of array if collection is full. 
    	if(n == collection.length) { 	int capacity = collection.length * 2; 
		// textbook implementation
		Item[] temp = (Item[]) new Object[capacity];
			for (int i = 0; i < n; i++) { temp[i] =  collection[i];}  collection = temp;
		       // alternative implementation // a = java.util.Arrays.copyOf(a, capacity);  
			}
    	
    	collection[n++] = item; 
    	
    }
    /**
     * 
     * @return delete and return a random item
     */
    public Item dequeue(){
    	if (isEmpty()) throw new NoSuchElementException("Empty Collection");
        int indx = StdRandom.uniform(n);
        Item removed = collection[indx];
       
        
        if (indx != n - 1) collection[n] = collection[indx - 1];
        
        collection[--n] = null;
        
        
        if (n >= 1 && n == collection.length / 4) { 
        		int capacity = collection.length / 2; 
        		// textbook implementation
        		Item[] temp = (Item[]) new Object[capacity];
        			for (int i = 0; i < n; i++) { temp[i] =  collection[i];}  collection = temp;
        		       // alternative implementation // a = java.util.Arrays.copyOf(a, capacity); 
      } 
        return removed;
    }
    /**
     * 
     * @return return (but do not delete) a random item
     */
    public Item sample(){
    	 if (isEmpty()) throw new NoSuchElementException("Empty Collection");
         return(collection[StdRandom.uniform(n)]); 
    }
    /**
     * 
     * @return return an independent iterator over items in random order
     */
    
    public Iterator<Item> iterator()
    {
       return new RandomizedQueueIterator();
    }
    
    /**
     * A copy of the original resizing array with the ability to dequeue only.
     */
    private class RandomizedQueueIterator implements Iterator<Item> {
        // Store Items in a temp
        private int n2 = n;
        private Item[] temp;
        

        // an iterator, doesn't implement remove() since it's optional
        private RandomizedQueueIterator() {
            temp = (Item[]) new Object[n2];
            for (int i = 0; i < n2; i++) temp[i] = collection[i];
        }
        
      
        public boolean hasNext() { return n2 > 0; }
        
    
        public void remove() { 
            throw new java.lang.UnsupportedOperationException();
        }
        
        public Item next() {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            int indx = StdRandom.uniform(n2);
            System.out.println("Iterator: " + n2);
            Item ans = temp[indx];
            if (indx != n2 - 1) temp[indx] = temp[n2 - 1];
            temp[--n2] = null;
            return ans;
        }
    }


    
    public static void main(String[] args){
        RandomizedQueue<String> rq = new RandomizedQueue();
        
        System.out.println("Adding Elements " + System.currentTimeMillis());
        for(int i = 0; i < 10; i++){
       
        rq.enqueue("" + i);
        
        }
        System.out.println("Done" + System.currentTimeMillis());
        System.out.println("Printing Elements Using For Each Loop " + System.currentTimeMillis());
        for(String item: rq){
            System.out.println(item);
        }
        System.out.println("Done" + System.currentTimeMillis());
        
        String item1 = rq.sample();
        System.out.println(item1);
        System.out.println("Removing all elements" + System.currentTimeMillis());
        for(String item: rq){
            rq.dequeue();
           
        }
        System.out.println("Should be empty: ");
        System.out.println("[" + rq + "]");
        
        System.out.println("Test isEmpty(), should be true: " + rq.isEmpty());
        System.out.println("Test size(), should be 0: " + rq.size());
        
    }

}
