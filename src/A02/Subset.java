/*
TODO:

Client. Write a client program Subset.java that takes a command-line integer k; 
reads in a sequence of strings from standard input using StdIn.readString(); 
and prints out exactly k of them, uniformly at random. Each item from the sequence 
can be printed out at most once.

% echo A B C D E F G H I | java Subset 3       % echo AA BB BB BB BB BB CC CC | java Subset 8
C                                              BB
G                                              AA
A                                              BB
                                               CC
% echo A B C D E F G H I | java Subset 3       BB
E                                              BB
F                                              CC
G                                              BB
Your program must implement the following API:
public class Subset {
   public static void main(String[] args)
}
You may assume that 0 ≤ k ≤ N, where N is the number of string on standard input.
Performance requirements:  The running time of Subset must be linear in the size 
of the input. You may use only a constant amount of memory plus either one Deque 
or RandomizedQueue object of maximum size at most N. (For an extra challenge, 
limit the maximum size to k.)

 */
package A02;


import edu.princeton.cs.algs4.StdIn;
import java.util.InputMismatchException;

/**
 *
 * @author Cody Henry
 */
public class Subset {
   public static void main(int k){
       int count = 0;
       
       RandomizedQueue<String> rq = new RandomizedQueue();
       
       while(!StdIn.isEmpty() && count < k){
           try{
               rq.enqueue(StdIn.readString());
               count++;
           } catch(InputMismatchException e){
               System.out.println("Invalid Input");
           }
       }
       for(int i = 0; i < k; i++){
           System.out.print(rq.dequeue() + "\n");
       }
       
   }
}
