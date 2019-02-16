package A02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<E> implements Iterable<E>
{

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public Deque()  //create empty deque
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() //is empty?
    {
        return (this.size == 0);
    }

    public int size() //return number of items in on the deque
    {
        return this.size;
    }

    public void addFirst(E item) //insert item at the front
    {
        if (item == null)
        {
            throw new NullPointerException();
        }
        head.setPrevious(item);
    }

    public void addLast(E item) //append item to the end
    {
        if (item == null)
        {
            throw new NullPointerException();
        }
        tail.setNext(item);
    }

    public E removeFirst() //delete and return the item at the front
    {
        if(size == 0)
        {
            throw new NoSuchElementException();
        }
        Node<E> temp = head;
        head = (Node<E>) head.getNext();
        head.setPrevious(null);
        return temp.getItem();
    }

    public E removeLast() //delete and return the item at the front
    {
        if(size == 0)
        {
            throw new NoSuchElementException();
        }
        Node<E> temp = head;
        head = (Node<E>) head.getNext();
        head.setPrevious(null);
        return temp.getItem();
    }

    @Override
    public Iterator<E> iterator()
    {
        return new dequeIterator();
    }

    private class dequeIterator implements Iterator<E>
    {
        private Node<E> current;

        public dequeIterator()
        {
            this.current = head;
        }


        public boolean hasNext()
        {
            return (current != null && current.getNext() != null);
        }

        public E next()
        {
            if (current.getNext() == null)
            {
                throw new NoSuchElementException();
            } else
            {
                return current.getNext();
            }
        }
    }
    
    public static void main(String[] args){
        
    }
}
