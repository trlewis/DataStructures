package testClasses;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

import customStructures.ArrayStack;

public class testArrayStack
{
    /** Testing to see if the isEmpty() method works properly. */
    @Test
    public void testEmpty()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    /** Checks if the stack works in the proper order. */
    @Test
    public void testOrder()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        
        for(int i = 0 ; i < 5 ; i++)
            stack.push(i);
        
        assertEquals("Order", (Integer)4, stack.pop());
        assertEquals("Order", (Integer)3, stack.pop());
        assertEquals("Order", (Integer)2, stack.pop());
        assertEquals("Order", (Integer)1, stack.pop());
        assertEquals("Order", (Integer)0, stack.pop());
    }
    
    /** Checks to see if the stack throws an exception when trying
     * to pop an element off an empty stack. */
    @Test(expected=EmptyStackException.class)
    public void testEmptyStackException()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        stack.pop();
    }
    
    /** Checks if the pop() method works properly. */
    @Test
    public void testPop()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        
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
    
    /** Checks to see if the peek() method works properly. */
    @Test
    public void testPeek()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        
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
    
    /** Checks to see if the size() method returns the proper value. */
    @Test
    public void testSize()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
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
    
    /** Checks to see if resizing the ArrayStack is done properly. */
    @Test
    public void testResize()
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>(3);
        
        for(int i = 0 ; i < 15 ; i++)
            stack.push(i);
        
        for(int i = 14 ; i >=0 ; i--)
            assertEquals("resize",(Integer)i,stack.pop());
    }
}
