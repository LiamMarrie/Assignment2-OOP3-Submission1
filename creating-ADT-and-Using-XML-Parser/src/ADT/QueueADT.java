package ADT;

/**
 * 
 * this interface represents the abstract data type (ADT) for a queue
 * 
 */

public class QueueADT<T> {
    /**
     * 
     * adds an element to the back of the queue
     * 
     * @param element the element to be added to the queue
     * 
     * @throws NullPointerException if the element is null
     * 
     */
    void enqueue(T element);

    /**
     * 
     * removes and returns an element from the front of the queue
     * 
     * @return the element removed from the front of the queue
     * 
     * @throws EmptyQueueException if the queue is null
     * 
     */
    T dequeue();

    /**
     * 
     * retrieves the element at the front of the queue but does not remove it
     * 
     * @return the element at the front of the queue
     * 
     * @throws EmptyQueueException if the queue is null
     * 
     */
    T peek();

    /**
     * 
     * check to see if the queue is empty
     * 
     * @return true if queue is empty and false if it is not
     * 
     */
    boolean isEmpty();

    /**
     * 
     * returns the number of elements in the queue
     * 
     * @return the size of the queue
     * 
     */
    int size();
}
