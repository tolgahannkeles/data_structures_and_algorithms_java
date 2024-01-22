package Deque;

import LinkedLists.DoublyLinkedList;

public class DLLDeque<E> {
    private DoublyLinkedList<E> dll;
    public DLLDeque(){
        dll=new DoublyLinkedList<>();
    }

    public void addFirst(E element){dll.addFirst(element);}
    public void addLast(E element){dll.addLast(element);}
    public E removeFirst(){return dll.removeFirst();}
    public E removeLast(){return dll.removeLast();}
    public E first(){return dll.first();}
    public E last(){return dll.last();}
    public int size(){return dll.size();}
    public boolean isEmpty(){return dll.isEmpty();}
    public void display(){dll.display();}
    public static void main(String[] args) {

    }
}
