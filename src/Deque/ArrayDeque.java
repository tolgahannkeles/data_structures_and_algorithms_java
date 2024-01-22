package Deque;

public class ArrayDeque<E> {
    private E[] arr;
    private int size;
    private int front = 0;
    private int rear = 0;
    private final int CAPACITY = 10;

    public ArrayDeque(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    public ArrayDeque() {
        arr = (E[]) new Object[CAPACITY];
    }

    public void addFirst(E element) {
        if (size == arr.length) throw new IllegalStateException();
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = element;
        size++;
    }

    public void addLast(E element) {
        if (size == arr.length) throw new IllegalStateException();
        rear = (front + size) % arr.length;
        arr[rear] = element;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E element = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return element;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E element = arr[rear];
        arr[rear] = null;
        rear = (rear - 1 + arr.length) % arr.length;
        size--;
        return element;
    }

    public E first() {
        return arr[front];
    }

    public E last() {
        return arr[rear];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void display(){
        for(E element: arr){
            System.out.print(element + " --> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayQueue= new ArrayDeque<>(4);
        arrayQueue.addFirst(1);
        arrayQueue.addFirst(0);
        arrayQueue.addLast(2);
        arrayQueue.addLast(3);
        arrayQueue.display();
        System.out.println("Removed: " + arrayQueue.removeLast());
        System.out.println("Removed: " + arrayQueue.removeLast());
        System.out.println("Removed: " + arrayQueue.removeLast());
        arrayQueue.display();
        arrayQueue.addLast(6);
        arrayQueue.addLast(7);
        arrayQueue.addLast(9);

        arrayQueue.display();

    }

}
