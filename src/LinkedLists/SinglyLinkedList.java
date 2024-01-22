import javax.net.ssl.SSLContext;

public class SinglyLinkedList<T> {
    private SLLNode<T> head;
    private SLLNode<T> tail;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public T last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(T element) {
        head = new SLLNode<>(element, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(T element) {
        SLLNode<T> newNode = new SLLNode<>(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T element = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    public T removeLast() {
        if (isEmpty()) return null;
        if (size == 1) {
            return removeFirst();
        }

        SLLNode<T> current = head;

        while (current.getNext() != null && current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        size--;
        return null;
    }


    public void display() {
        SLLNode<T> current = head;
        String str = "";
        while (current != null) {
            str += current.getElement() + " --> ";
            current = current.getNext();
        }
        str += current;
        System.out.println(str);
    }


}

class SLLNode<T> {
    SLLNode<T> next;
    T element;

    public SLLNode(T element, SLLNode<T> next) {
        this.element = element;
        this.next = next;
    }
    public SLLNode<T> getNext() {
        return next;
    }
    public T getElement() {
        return element;
    }
    public void setNext(SLLNode<T> next) {
        this.next = next;
    }
}
