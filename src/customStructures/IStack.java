package customStructures;

/**
 * This interface provides the basic operands needed by a stack object.
 * 
 * @author Travis Lewis
 * @version 8 May 2012
 *
 * @param <T> The Data type to be stored
 */
public interface IStack<T>
{
    /**
     * Adds the given element to the top of the stack.
     * @param element The element to push onto the stack.
     */
    public void push(T element);
    
    /**
     * Removes the top element from the stack and returns it.
     * @return The top element of the stack.
     */
    public T pop();
    
    /**
     * Returns the top element of the stack without removing it.
     * @return The top element of the stack.
     */
    public T peek();
    
    /**
     * Determines whether the stack has any elements in it.
     * @return True if the stack is empty.
     */
    public boolean isEmpty();
    
    /**
     * Returns the total number of elements in the stack.
     * @return The number of elements in the stack.
     */
    public int size();
    
    /**
     * Returns a string representation of the stack.
     * @return A string representation of the stack.
     */
    public String toString();
}
