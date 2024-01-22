package Queue;

import LinkedLists.SinglyLinkedList;

public class SLLQueue<E> {

    private SinglyLinkedList<E> sll;

    public SLLQueue() {
        sll = new SinglyLinkedList<>();
    }

    public void enqueue(E element) {
        sll.addLast(element);
    }

    public E dequeue() {
        return sll.removeFirst();
    }

    public int size() {
        return sll.size();
    }

    public boolean isEmpty() {
        return sll.isEmpty();
    }

    public E first() {
        return sll.first();
    }

    public void display() {
        sll.display();
    }

    public static void main(String[] args) {
        SLLQueue<String> sllQueue = new SLLQueue<>();
        sllQueue.enqueue("Apple");
        sllQueue.enqueue("Banana");
        sllQueue.enqueue("Cherry");
        sllQueue.display();
        System.out.println("Removed: " + sllQueue.dequeue());
        sllQueue.display();
        System.out.println("First: " + sllQueue.first());
        sllQueue.enqueue("date");
        sllQueue.display();
    }
}
