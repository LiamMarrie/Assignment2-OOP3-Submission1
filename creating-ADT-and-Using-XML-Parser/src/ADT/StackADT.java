package ADT;

/**
 * 
 * this interface represents the abstract data type (ADT) for a stack
 * 
 */

public class StackADT<T> {
    /**
     * 
     * pushes an element onto the top of the Stack
     * 
     * @param element the element to push onto the Stack
     * 
     * @throws NullPointerException if the element is null
     * 
     */
    void push(T element);

    /**
     * 
     * removes and returns the element at the top of the stack
     * 
     * @param element at the top of the stack
     * 
     * @throws EmptyStackException if the stack is empty
     * 
     */
    T pop();

    /**
     * 
     * retrieves the element at the top of the stack but does not remove it
     * 
     * @return the element at the top of the stack
     * 
     * @throws EmptyStackException if the stack is empty
     * 
     */
    T peek();

    /**
     * 
     * checks if the stack is empty
     * 
     * @return true if the stack is empty and false if it is not
     * 
     */
    boolean isEmpty();

    /**
     * 
     * returns the number of elements in the stack
     * 
     * @return the size of the stack
     * 
     */
    int size();
}
