import org.w3c.dom.Node;

public class DoublyLinkedList<T> {
    private DLLNode<T> head;
    private DLLNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = new DLLNode<>(null, null, null);
        this.tail = new DLLNode<>(null, head, null);
        head.setNext(tail);
    }

    public DLLNode<T> first() {
        if (isEmpty()) return null;
        return head.getNext();
    }

    public DLLNode<T> last() {
        if (isEmpty()) return null;
        return tail.getPrev();
    }

    public DLLNode<T> remove(T element) {
        DLLNode<T> current = head;
        while (current.getNext() != null) {
            if (current.getElement() == element) break;
            current = current.getNext();
        }
        current.getPrev().setNext(current.getNext());
        current.getNext().setPrev(current.getPrev());
        size--;
        return current;
    }

    public void addFirst(T element) {
        addBetween(element, head, head.getNext());
    }

    public DLLNode<T> removeFirst() {
        if (isEmpty()) return null;
        return removeNode(head.getNext());
    }

    public void addLast(T element) {
        addBetween(element, tail.getPrev(), tail);
    }

    public DLLNode<T> removeLast() {
        if (isEmpty()) return null;
        return removeNode(tail.getPrev());
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void addBetween(T element, DLLNode<T> prev, DLLNode<T> next) {
        DLLNode<T> newNode = new DLLNode<>(element, prev, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }

    private DLLNode<T> removeNode(DLLNode<T> node) {
        DLLNode<T> prev = node.getPrev();
        DLLNode<T> next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return node;
    }

    public void display() {
        DLLNode<T> current = head;
        String str = "";
        while (current.getNext() != null) {
            str += (current.getElement() + " <--> ");
            current = current.getNext();
        }
        str += current.getElement();
        System.out.println(str);
    }

}

class DLLNode<T> {
    private T element;
    private DLLNode<T> prev;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public DLLNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DLLNode<T> prev) {
        this.prev = prev;
    }

    public DLLNode<T> getNext() {
        return next;
    }

    public void setNext(DLLNode<T> next) {
        this.next = next;
    }

    private DLLNode<T> next;

    public DLLNode(T element, DLLNode<T> prev, DLLNode<T> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

}
