package testClasses;

import static org.junit.Assert.*;

import customStructures.LinkedQueue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import org.junit.Test;

public class testLinkedQueue
{
    
    @Test
    public void testDeEnqueue()
    {
        LinkedQueue<String> q = new LinkedQueue<String>();
        assertTrue(q.isEmpty());
        assertEquals("de/enqueue",0,q.size());
        
        q.enqueue("abcd");
        assertEquals("de/enqueue",1,q.size());
        
        assertEquals("de/enqueue", "abcd", q.dequeue());
        assertEquals("de/enqueue",0,q.size());
    }
    
    @Test
    public void testOrder()
    {
        LinkedQueue<String>q = new LinkedQueue<String>();
        q.enqueue("first");
        q.enqueue("second");
        q.enqueue("third");
        
        assertEquals("order","first",q.dequeue());
        assertEquals("order","second",q.dequeue());
        assertEquals("order","third",q.dequeue());
    }
    
    @Test
    public void testSize()
    {
        LinkedQueue<Integer> q = new LinkedQueue<Integer>();
        
        assertEquals("size",0,q.size());
        
        q.enqueue(1);
        assertEquals("size",1,q.size());
        q.enqueue(4); 
        assertEquals("size",2,q.size());
        q.dequeue();
        assertEquals("size",1,q.size());
        q.dequeue();
        
        for(int i = 0 ; i < 10 ; i++)
            q.enqueue(2*i);
        
        for(int i = 10 ; i > 0 ; i--)
        {
            assertEquals("size",i,q.size());
            q.dequeue();
        }
    }
    
    @Test
    public void testEmpty()
    {
        LinkedQueue<String>q = new LinkedQueue<String>();
        assertTrue(q.isEmpty());
        
        q.enqueue("abcd");
        assertFalse(q.isEmpty());
        q.dequeue();
        assertTrue(q.isEmpty());
    }
    
    @Test
    public void testException()
    {
        LinkedQueue<String>q = new LinkedQueue<String>();
        boolean caught = false;
        
        try{
            q.first();
        } catch (NoSuchElementException e) {
            caught = true;
        }
        
        assertTrue(caught);
        caught = false;
        
        try{
            q.dequeue();
        } catch (NoSuchElementException e) {
            caught = true;
        }
        
        assertTrue(caught);
        caught = false;
        
        q.enqueue("abcd");
        try{
            q.first();
            caught = true;
        } catch (NoSuchElementException e) {
            caught = false;
        }
        
        assertTrue(caught);
        caught = false;
        
        try{
            q.dequeue();
            caught = true;
        } catch (NoSuchElementException e) {
            caught = false;
        }
        
        assertTrue(caught);
        caught = false;
        
        try{
            q.first();
        } catch (NoSuchElementException e) {
            caught = true;
        }
        
        assertTrue(caught);
        caught = false;
        
        try{
            q.dequeue();
        } catch (NoSuchElementException e) {
            caught = true;
        }
        assertTrue(caught);
    }
    



}
