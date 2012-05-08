package customStructures;

public class LinkedStack<T> implements IStack<T>
{
    private class Node<T>
    {
        T element;
        Node<T> previous;
    }
    
    private Node<T> head;
    
    public LinkedStack()
    {
        head = null;
    }
    
    public LinkedStack(T element)
    {
        head = new Node<T>();
        head.element = element;
    }
    
    @Override
    public void push(T element)
    {
        Node<T> n = new Node<T>();
        n.element = element;
        
    }

    @Override
    public T pop()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size()
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
