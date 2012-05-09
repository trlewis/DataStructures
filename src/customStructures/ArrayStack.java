package customStructures;

import java.util.EmptyStackException;

/**
 * This class implements the stack interface using an array
 * as the underlying structure.
 * 
 * @author Travis Lewis
 * @version 9 May 2012
 * 
 * @param <T> The type of object the stack is to store.
 */
public class ArrayStack<T> implements IStack<T>
{
    /** The underlying array that holds the elements */
    private Object[] array;
    
    /** The number of elements currently in the stack */
    private int size;
    
    /**
     * Creates an array stack with the default capacity of 10.
     */
    public ArrayStack()
    {
        this(10);
    }
    
    /**
     * Creates an array stack with the specified starting capacity.
     * @param size The initial capacity for the stack.
     */
    public ArrayStack(final int capacity)
    {
        size = 0;
        array = new Object[capacity];
    }
    
    /** {@inheritDoc} */
    @Override
    public void push(T element)
    {
        ensureSpace();
        array[size++] = element;
    }

    /** {@inheritDoc} */
    @Override
    @SuppressWarnings("unchecked")
    public T pop()
    {
        if(isEmpty())
            throw new EmptyStackException();
        
        return (T) array[--size];
    }

    /** {@inheritDoc} */
    @Override
    @SuppressWarnings("unchecked")
    public T peek()
    {
        if(isEmpty())
            throw new EmptyStackException();
        
        return (T) array[size - 1];
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
    
    /**
     * Ensures that there's always at least one empty space at the
     * end of the underlying array by resizing it if it gets too full.
     */
    private void ensureSpace()
    {
        if(size == array.length)
        {
            Object[] temp = new Object[array.length * 2];
            
            for(int i = 0 ; i < array.length ; i++)
                temp[i] = array[i];
            
            array = temp;
        }
    }
}
