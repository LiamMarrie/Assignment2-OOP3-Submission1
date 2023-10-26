package ADT;

public class StackADT {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public StackADT() {
        stackArray = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T element) {
        if (top == stackArray.length - 1) {
            expandCapacity();
        }
        stackArray[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        T result = stackArray[top];
        stackArray[top] = null; // Help with garbage collection.
        top--;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void expandCapacity() {
        @SuppressWarnings("unchecked")
        T[] largerArray = (T[]) new Object[stackArray.length * 2];
        System.arraycopy(stackArray, 0, largerArray, 0, stackArray.length);
        stackArray = largerArray;
    }
}
