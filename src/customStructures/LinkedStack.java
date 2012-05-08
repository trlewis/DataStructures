package customStructures;

import java.util.EmptyStackException;

/**
 * This class implements a the stack interface using a linked 
 * list data structure.
 * 
 * @author Travis Lewis
 * @version 8 May 2012
 * 
 * @param <T> The type of object the stack is to store.
 */
public class LinkedStack<T> implements IStack<T>
{
    /**
     * @author Travis Lewis
     * @version 8 May 2012
     * 
     * This private class handles the storage of the elements in the stack.
     */
    private class Node
    {
        T element;
        Node previous;
    }
    
    private Node head;
    private int size;
    
    /**
     * Creates a new, empty LinkedStack structure.
     */
    public LinkedStack()
    {
        head = null;
        size = 0;
    }
    
    /** {@inheritDoc} */
    @Override
    public void push(T element)
    {
        Node n = new Node();
        n.element = element;
        
        if(head != null)
            n.previous = head;
        
        head = n;
        size++;
    }

    /** {@inheritDoc} */
    @Override
    public T pop()
    {
        if(isEmpty())
            throw new EmptyStackException();
        
        T obj = head.element;
        head = head.previous;
        
        size--;
        return obj;
    }

    /** {@inheritDoc} */
    @Override
    public T peek()
    {
        if(isEmpty())
            throw new EmptyStackException();
        
        return head.element;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty()
    {
        return (size == 0);
    }

    /** {@inheritDoc} */
    @Override
    public int size()
    {
        return size;
    }

}
