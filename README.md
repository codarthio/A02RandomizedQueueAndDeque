# A02 Randomized Queue and Deque
## Programming Assignment 2:  Randomized Queues and Deques
_Write a generic data type for a deque and a randomized queue. The goal of this assignment is to implement elementary data structures using arrays and linked lists, and to introduce you to generics and iterators._

### Dequeue.
**A double-ended queue or deque (pronounced "deck") is a generalization of a stack and a queue that supports inserting and removing items from either the front or the back of the data structure. Create a generic data type Deque that implements the following API:**
```java
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
  ```
_**Corner cases**_.  Throw a java.lang.NullPointerException if the client attempts to add a null item; throw a `java.util.NoSuchElementException `if the client attempts to remove an item from an empty deque; throw a `java.lang.UnsupportedOperationExceptio`n if the client calls the remove() method in the iterator; throw a `java.util.NoSuchElementException` if the client calls the next() method in the iterator and there are no more items to return.

_**Performance requirements**_.  Your deque implementation must support each deque operation (including construction) in constant worst-case time and use space proportional to the number of items currently in the deque. Additionally, your iterator implementation must support each operation (including construction) in constant worst-case time.

### Randomized queue. 
**A randomized queue is similar to a stack or queue, except that the item removed is chosen uniformly at random from items in the data structure. Create a generic data type RandomizedQueue that implements the following API:**
```java
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
```
_**Corner cases**_.  The order of two or more iterators to the same randomized queue must be mutually independent; each iterator must maintain its own random order. Throw a java.lang.NullPointerException if the client attempts to add a `null` item; throw a `java.util.NoSuchElementException` if the client attempts to sample or dequeue an item from an empty randomized queue; throw a `java.lang.UnsupportedOperationException` if the client calls the `remove()` method in the iterator; throw a `java.util.NoSuchElementException` if the client calls the `next()` method in the iterator and there are no more items to return.

_**Performance requirements**_.  Your randomized queue implementation must support each randomized queue operation (besides creating an iterator) in constant amortized time and use space proportional to the number of items currently in the queue. That is, any sequence of M randomized queue operations (starting from an empty queue) must take at most cM steps in the worst case, for some constant c. Additionally, your iterator implementation must support `next()` and `hasNext()` in constant worst-case time and construction in linear time; you may use a linear amount of extra memory per iterator.

### Client. 
**Write a client program `Subset.java` that takes a command-line integer k; reads in a sequence of strings from standard input using ```java StdIn.readString();``` and prints out exactly k of them, uniformly at random. Each item from the sequence can be printed out at most once.**
```
% echo A B C D E F G H I | java Subset 3       % echo AA BB BB BB BB BB CC CC | java Subset 8
C                                              BB
G                                              AA
A                                              BB
                                               CC
% echo A B C D E F G H I | java Subset 3       BB
E                                              BB
F                                              CC
G                                              BB
```
Your program must implement the following API:
```java
public class Subset {
   public static void main(String[] args)
}
```
You may assume that **`0 ≤ k ≤ N`**, where N is the number of string on standard input.
Performance requirements:  The running time of Subset must be linear in the size of the input. You may use only a constant amount of memory plus either one Deque or RandomizedQueue object of maximum size at most N. (For an extra challenge, limit the maximum size to k.)

_**Deliverables**_. Submit the data types `RandomizedQueue.java` and `Deque.java`. Each of these two data type must include its own `main()` that thoroughly tests the associated operations. You may not use any libraries other than those in `java.lang`, `stdlib.jar`, `java.util.Iterator`, and `java.util.NoSuchElementException`. Also submit the client program `Subset.java`. Finally, submit a `readme.txt` file and answer the questions.

This assignment was developed by Kevin Wayne. 
Copyright © 2005.

/******************************************************************************
 *  Name:    
 *  NetID:   
 *  Precept: 
 *
 *  Partner Name:     
 *  Partner NetID:    
 *  Partner Precept:  
 *
 *  Hours to complete assignment (optional):
 *
 ******************************************************************************/

Programming Assignment 2: Deques and Randomized Queues


/******************************************************************************
 *  Explain briefly how you implemented the randomized queue and deque.
 *  Which data structure did you choose (array, linked list, etc.)
 *  and why?
 *****************************************************************************/


/******************************************************************************
 *  How much memory (in bytes) do your data types use to store n items
 *  in the worst case? Use the 64-bit memory cost model from Section
 *  1.4 of the textbook and use tilde notation to simplify your answer.
 *  Briefly justify your answers and show your work.
 *
 *  Do not include the memory for the items themselves (as this
 *  memory is allocated by the client and depends on the item type)
 *  or for any iterators, but do include the memory for the references
 *  to the items (in the underlying array or linked list).
 *****************************************************************************/

Randomized Queue:   ~  _____  bytes

Deque:              ~  _____  bytes




/******************************************************************************
 *  Known bugs / limitations.
 *****************************************************************************/


/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 *****************************************************************************/



/******************************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 *****************************************************************************/



/******************************************************************************
 *  Describe any serious problems you encountered.                    
 *****************************************************************************/



/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
 *****************************************************************************/

