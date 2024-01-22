package Queue;

public class ArrayQueue<E> {

    private E[] arr;
    private final int CAPACITY = 10;
    private int size = 0;
    private int front = 0;

    public ArrayQueue(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        arr = (E[]) new Object[CAPACITY];
    }

    public void enqueue(E element) {

        if (size == arr.length) throw new IllegalStateException();

        int avail = (front + size) % arr.length;
        arr[avail] = element;
        size++;

    }

    public E dequeue() {
        if (isEmpty()) return null;
        E element = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return element;
    }

    public E first() {
        if (isEmpty()) return null;
        return arr[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        for (E element : arr) {
            System.out.print(element + "-->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(4);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.dequeue();
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();

        arrayQueue.display();
    }

}
