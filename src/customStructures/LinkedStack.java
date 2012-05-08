package customStructures;

import java.util.EmptyStackException;

public class LinkedStack<T> implements IStack<T>
{
    private class Node<T>
    {
        T element;
        Node<T> previous;
    }
    
    private Node<T> head;
    private int size;
    
    public LinkedStack()
    {
        head = null;
        size = 0;
    }
    
    @Override
    public void push(T element)
    {
        Node<T> n = new Node<T>();
        n.element = element;
        
        if(head != null)
            n.previous = head;
        
        head = n;
        size++;
    }

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

    @Override
    public T peek()
    {
        if(isEmpty())
            throw new EmptyStackException();
        
        return head.element;
    }

    @Override
    public boolean isEmpty()
    {
        return (size == 0);
    }

    @Override
    public int size()
    {
        return size;
    }

}
