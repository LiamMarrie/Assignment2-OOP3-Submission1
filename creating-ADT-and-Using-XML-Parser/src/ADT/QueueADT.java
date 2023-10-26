package ADT;

public class QueueADT {
    private Node<T> front, rear;
    private int size;

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    public QueueADT() {
        front = rear = null;
        size = 0;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        T result = front.element;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return front.element;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}
