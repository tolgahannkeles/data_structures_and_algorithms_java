public class SinglyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public SinglyLinkedList() {
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    void addFirst(E element) {
        head = new Node<>(element, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    void addLast(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    E removeFirst() {
        if (isEmpty()) return null;
        E element = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    E removeLast() {
        if (isEmpty()) return null;
        if (size == 1) {
            return removeFirst();
        }


        Node<E> current = head;

        for (int i = 1; i < size - 1; i++) {
            current = current.getNext();
        }
        current.setNext(null);
        size--;
        return null;
    }


    void display() {
        Node<E> current = head;
        String str = "";
        while (current != null) {
            str += current.getElement() + " --> ";
            current = current.getNext();
        }
        str += current;
        System.out.println(str);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.addFirst(0);
        sll.addFirst(-1);


        sll.display();
        sll.removeLast();
        sll.display();
    }

    private static class Node<E> {
        Node<E> next;
        E element;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public E getElement() {
            return element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}


