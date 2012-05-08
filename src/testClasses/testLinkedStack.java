package testClasses;

import java.util.EmptyStackException;

import customStructures.LinkedStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLinkedStack
{


    
    @Test
    public void testEmpty()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testOrder()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        for(int i = 0 ; i < 5 ; i++)
            stack.push(i);
        
        assertEquals("Order", (Integer)4, stack.pop());
        assertEquals("Order", (Integer)3, stack.pop());
        assertEquals("Order", (Integer)2, stack.pop());
        assertEquals("Order", (Integer)1, stack.pop());
        assertEquals("Order", (Integer)0, stack.pop());
    }
    
    @Test(expected=EmptyStackException.class)
    public void testEmptyStackException()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        stack.pop();
    }
    
    @Test
    public void testPop()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        stack.push(8);
        assertEquals("Peek",(Integer)8,stack.pop());
        
        boolean state = false;
        try
        {
            stack.pop();
        }
        catch(EmptyStackException e)
        {
            state = true;
        }
        assertTrue(state);
    }
    
    @Test
    public void testPeek()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        try
        {
            stack.peek();
        }
        catch(EmptyStackException e)
        {
            assertTrue(true);
        }
        
        stack.push(8);
        assertEquals("Peek",(Integer)8,stack.peek());
        assertEquals("Peek",(Integer)8,stack.peek());
        assertEquals("Peek",(Integer)8,stack.peek());
    }
    
    @Test
    public void testSize()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        assertEquals("Size",0,stack.size());
        stack.push(234);
        assertEquals("Size",1,stack.size());
        stack.push(111);
        assertEquals("Size",2,stack.size());
        stack.pop();
        assertEquals("Size",1,stack.size());
        stack.pop();
        assertEquals("Size",0,stack.size());
    }
}
