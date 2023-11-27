package LinkedLists;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = new Node<>(null, null, null);
        tail = new Node<>(null, head, null);
        head.setNext(tail);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getPrev().getElement();
    }

    private void addBetween(E element, Node<E> prev, Node<E> next) {
        Node<E> newNode = new Node<>(element, prev, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }

    private E remove(Node<E> element) {
        Node<E> prev = element.getPrev();
        Node<E> next = element.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return element.getElement();
    }

    public void addFirst(E element) {
        addBetween(element, head, head.getNext());
    }

    public void addLast(E element) {
        addBetween(element, tail.getPrev(), tail);
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(head.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(tail.getPrev());
    }

    public void display() {
        Node<E> current = head;
        String str = "";
        while (current.getNext() != null) {
            str += (current.getElement() + " <--> ");
            current = current.getNext();
        }
        str += current.getElement();
        System.out.println(str);
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.display();
        dll.removeFirst();
        dll.removeLast();
        dll.removeLast();
        dll.removeLast();
        dll.removeLast();
        dll.display();

    }

    private class Node<E> {
        private Node<E> prev;
        private Node<E> next;
        private E element;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public Node<E> getPrev() {
            return this.prev;
        }

        public Node<E> getNext() {
            return this.next;
        }

        public E getElement() {
            return this.element;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}

