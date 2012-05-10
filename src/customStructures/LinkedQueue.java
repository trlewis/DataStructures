package customStructures;

import java.util.NoSuchElementException;

/**
 * This class implements the stack interface with a linked list structure.
 * @author Travis Lewis
 * @version 9 May 2012
 *
 * @param <T> The Object type the queue stores.
 */
public class LinkedQueue<T> implements IQueue<T>
{
    /**
     * This is a doubly linked node class that the queue will be based off.
     * @author Travis Lewis
     * @version 9 May 2012
     */
    @SuppressWarnings("unused")
    private class Node
    {
        /** The object the Node stores. */
        public T element;
        
        /** A reference to the previous node. */
        public Node previous;
        
        /** A reference to the next node. */
        public Node next;
    }
    
    /** This Node is where elements are dequeued from. */
    private Node head;
    
    /** This Node is the most recently enqueued item. */
    private Node tail;
    
    /** The number of items in the queue. */
    private int size;
    
    public LinkedQueue()
    {
        // nothing
    }

    /** {@inheritDoc} */
    @Override
    public void enqueue(T element)
    {
        Node n = new Node();
        n.element = element;
        
        if(head == null)
        {
            head = n;
            tail = n;
        }
            
        else
        {
            n.next = tail;
            tail.previous = n;
            tail = n;
        }
        
        size ++;
    }

    /** {@inheritDoc} */
    @Override
    public T dequeue()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        
        T elem = head.element;
        head = head.previous;
        size--;
        
        return elem;
    }

    /** {@inheritDoc} */
    @Override
    public T first()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        
        return head.element;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    /** {@inheritDoc} */
    @Override
    public int size()
    {
        return size;
    }

}
