package customStructures;

/**
 * This interface provides the basic operations needed/specified by
 * a queue object.
 * 
 * @author Travis Lewis
 * @version 9 May 2012
 *
 * @param <T> The Object type the Queue is to store.
 */
public interface IQueue<T>
{
    /**
     * Adds an element to the back of the queue.
     * @param element The element to be added.
     */
    public void enqueue(T element);
    
    /**
     * Removes and returns the front element of the queue.
     * @return The front element of the queue.
     */
    public T dequeue();
    
    /**
     * Returns the front element of the queue without removing it.
     * @return The front element of the queue.
     */
    public T first();
    
    /**
     * Determines if the queue has elements in it or not.
     * @return True if queue is empty.
     */
    public boolean isEmpty();
    
    /**
     * Returns the number of elements currently in the queue.
     * @return The number of elements in the queue.
     */
    public int size();
    
    /** {@inheritDoc} */
    public String toString();
}
