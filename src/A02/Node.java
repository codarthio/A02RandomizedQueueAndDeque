package A02;

class Node<E>
{
    E item, next, previous;


    public Node(E item, E next, E previous)
    {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }

    public Node(E item, E next)
    {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }

    public E getItem()
    {
        return this.item;
    }

    public void setItem(E item)
    {
        this.item = item;
    }

    public E getNext()
    {
        return this.next;
    }

    public void setNext(E next)
    {
        this.next = next;
    }

    public E getPrevious()
    {
        return this.previous;
    }

    public void setPrevious(E previous)
    {
        this.previous = previous;
    }

}
